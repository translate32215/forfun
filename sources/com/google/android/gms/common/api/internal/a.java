package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5749e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f5750a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f5751b = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5752c = new ArrayList();
    @GuardedBy("sInstance")

    /* renamed from: d  reason: collision with root package name */
    public boolean f5753d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C0082a {
        void a(boolean z10);
    }

    public static void a(Application application) {
        a aVar = f5749e;
        synchronized (aVar) {
            if (!aVar.f5753d) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f5753d = true;
            }
        }
    }

    public final void b(boolean z10) {
        synchronized (f5749e) {
            Iterator it = this.f5752c.iterator();
            while (it.hasNext()) {
                ((C0082a) it.next()).a(z10);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5750a.compareAndSet(true, false);
        this.f5751b.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5750a.compareAndSet(true, false);
        this.f5751b.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f5750a.compareAndSet(false, true)) {
            this.f5751b.set(true);
            b(true);
        }
    }
}
