package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.startapp.networkTest.startapp.CoverageMapperManager;
import com.startapp.networkTest.startapp.NetworkTester;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class a3 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: h  reason: collision with root package name */
    private static final String f10011h = "a3";

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f10012i = false;

    /* renamed from: a  reason: collision with root package name */
    private Application f10013a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ScheduledFuture<?> f10014b;

    /* renamed from: c  reason: collision with root package name */
    private int f10015c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f10016d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f10017e = false;

    /* renamed from: f  reason: collision with root package name */
    private CoverageMapperManager f10018f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f10019g = new a();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            a3.this.c();
            if (a3.this.f10016d == 0 && !a3.this.f10017e) {
                a3.this.f10014b.cancel(false);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements NetworkTester.b {
        public b() {
        }

        public void a(boolean z10) {
        }
    }

    static {
        Class<a3> cls = a3.class;
    }

    public a3(Context context, CoverageMapperManager coverageMapperManager) {
        this.f10013a = (Application) context.getApplicationContext();
        this.f10018f = coverageMapperManager;
    }

    private void f() {
        this.f10018f.c();
    }

    private void g() {
        j();
        long FOREGROUND_TEST_CT_SCHEDULE_INTERVAL = a5.b().FOREGROUND_TEST_CT_SCHEDULE_INTERVAL();
        if (FOREGROUND_TEST_CT_SCHEDULE_INTERVAL > 0) {
            this.f10014b = ThreadManager.b().d().scheduleWithFixedDelay(this.f10019g, FOREGROUND_TEST_CT_SCHEDULE_INTERVAL, FOREGROUND_TEST_CT_SCHEDULE_INTERVAL, TimeUnit.MILLISECONDS);
        }
    }

    private void i() {
        this.f10018f.f();
    }

    private void j() {
        ScheduledFuture<?> scheduledFuture = this.f10014b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f10014b = null;
        }
    }

    public void e() {
        this.f10015c = 0;
        this.f10013a.registerActivityLifecycleCallbacks(this);
        this.f10013a.registerComponentCallbacks(this);
    }

    public void h() {
        this.f10013a.unregisterActivityLifecycleCallbacks(this);
        this.f10013a.unregisterComponentCallbacks(this);
        this.f10015c = -1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity.isTaskRoot() && this.f10016d < 0) {
            this.f10016d = 0;
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        int i10 = this.f10016d + 1;
        this.f10016d = i10;
        if (i10 == 1 && !this.f10017e) {
            a();
        }
    }

    public void onActivityStopped(Activity activity) {
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f10017e = isChangingConfigurations;
        int i10 = this.f10016d - 1;
        this.f10016d = i10;
        if (i10 == 0 && !isChangingConfigurations) {
            b();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i10) {
    }

    private void a() {
        this.f10015c = 1;
        if (a5.b().FOREGROUND_TEST_CT_ENABLED()) {
            c();
            g();
        }
        if (a5.b().FOREGROUND_TEST_NIR_ENABLED()) {
            f();
        }
    }

    private void b() {
        this.f10015c = 0;
        i();
        j();
    }

    /* access modifiers changed from: private */
    public void c() {
        NetworkTester.runTests(this.f10013a, new b());
    }

    public int d() {
        return this.f10015c;
    }
}
