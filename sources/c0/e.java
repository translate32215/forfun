package c0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f3936a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f3937b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f3938c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f3939d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f3940e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f3941f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f3942g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f3943a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f3944b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3945c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3946d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3947e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3948f = false;

        public a(Activity activity) {
            this.f3944b = activity;
            this.f3945c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f3944b == activity) {
                this.f3944b = null;
                this.f3947e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f3947e && !this.f3948f && !this.f3946d) {
                Object obj = this.f3943a;
                int i10 = this.f3945c;
                boolean z10 = false;
                try {
                    Object obj2 = e.f3938c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i10) {
                            e.f3942g.postAtFrontOfQueue(new d(e.f3937b.get(activity), obj2));
                            z10 = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z10) {
                    this.f3948f = true;
                    this.f3943a = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f3944b == activity) {
                this.f3946d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            f3942g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f3936a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f3937b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f3938c = r0
            java.lang.Class<?> r0 = f3936a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = r1
            goto L_0x0053
        L_0x003e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003c }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003c }
            r7[r2] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003c }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003c }
            r0.setAccessible(r2)     // Catch:{ all -> 0x003c }
        L_0x0053:
            f3939d = r0
            java.lang.Class<?> r0 = f3936a
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r0 = r1
            goto L_0x006c
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0059 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0059 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0059 }
            r7[r2] = r8     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x0059 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0059 }
        L_0x006c:
            f3940e = r0
            java.lang.Class<?> r0 = f3936a
            boolean r4 = a()
            if (r4 == 0) goto L_0x00ad
            if (r0 != 0) goto L_0x0079
            goto L_0x00ad
        L_0x0079:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00ad }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00ad }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00ad }
            r1 = r0
        L_0x00ad:
            f3941f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.e.<clinit>():void");
    }

    public static boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }
}
