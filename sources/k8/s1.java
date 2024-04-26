package k8;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import b2.t;
import e8.fg0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o8.r3;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class s1 {

    /* renamed from: g  reason: collision with root package name */
    public static volatile s1 f20454g;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f20455a;

    /* renamed from: b  reason: collision with root package name */
    public final t f20456b = new t(this);

    /* renamed from: c  reason: collision with root package name */
    public int f20457c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20458d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20459e;

    /* renamed from: f  reason: collision with root package name */
    public volatile s0 f20460f;

    public s1(Context context, String str, String str2, String str3, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new fg0());
        boolean z10 = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20455a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        new ArrayList();
        try {
            f.i(context, "google_app_id", r3.a(context));
        } catch (IllegalStateException unused) {
        }
        this.f20459e = "fa";
        if (str2 == null || str3 == null) {
            if ((str3 != null ? false : z10) ^ (str2 == null)) {
                Log.w("FA", "Specified origin or custom app id is null. Both parameters will be ignored.");
            }
        } else {
            Log.v("FA", "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        this.f20455a.execute(new f1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new r1(this));
        }
    }

    public static s1 e(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context != null) {
            if (f20454g == null) {
                synchronized (s1.class) {
                    if (f20454g == null) {
                        f20454g = new s1(context, str, str2, str3, bundle);
                    }
                }
            }
            return f20454g;
        }
        throw new NullPointerException("null reference");
    }

    public final void a(Exception exc, boolean z10, boolean z11) {
        this.f20458d |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            this.f20455a.execute(new l1(this, "Error with data collection. Data lost.", (Object) exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final int b(String str) {
        o0 o0Var = new o0();
        this.f20455a.execute(new l1(this, str, o0Var));
        Integer num = (Integer) o0.E1(o0Var.Y(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long c() {
        o0 o0Var = new o0();
        this.f20455a.execute(new c1(this, o0Var));
        Long l10 = (Long) o0.E1(o0Var.Y(500), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i10 = this.f20457c + 1;
        this.f20457c = i10;
        return nextLong + ((long) i10);
    }

    public final Bundle d(Bundle bundle, boolean z10) {
        o0 o0Var = new o0();
        this.f20455a.execute(new l1(this, bundle, o0Var));
        if (z10) {
            return o0Var.Y(5000);
        }
        return null;
    }

    public final String f() {
        o0 o0Var = new o0();
        this.f20455a.execute(new j1(this, o0Var, 0));
        return o0Var.z0(50);
    }

    public final String g() {
        o0 o0Var = new o0();
        this.f20455a.execute(new j1(this, o0Var, 1));
        return o0Var.z0(500);
    }

    public final String h() {
        o0 o0Var = new o0();
        this.f20455a.execute(new i1(this, o0Var, 1));
        return o0Var.z0(500);
    }

    public final String i() {
        o0 o0Var = new o0();
        this.f20455a.execute(new i1(this, o0Var, 0));
        return o0Var.z0(500);
    }

    public final List<Bundle> j(String str, String str2) {
        o0 o0Var = new o0();
        this.f20455a.execute(new e1(this, str, str2, o0Var));
        List<Bundle> list = (List) o0.E1(o0Var.Y(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> k(String str, String str2, boolean z10) {
        o0 o0Var = new o0();
        this.f20455a.execute(new k1(this, str, str2, z10, o0Var));
        Bundle Y = o0Var.Y(5000);
        if (Y == null || Y.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(Y.size());
        for (String str3 : Y.keySet()) {
            Object obj = Y.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void l(String str, String str2, Bundle bundle) {
        this.f20455a.execute(new m1(this, (Long) null, str, str2, bundle, true, true));
    }
}
