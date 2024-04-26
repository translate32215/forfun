package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import e8.yg0;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pu {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7891a = new Object();
    @GuardedBy("activityTrackerLock")

    /* renamed from: b  reason: collision with root package name */
    public ru f7892b = null;
    @GuardedBy("activityTrackerLock")

    /* renamed from: c  reason: collision with root package name */
    public boolean f7893c = false;

    public final Activity a() {
        synchronized (this.f7891a) {
            ru ruVar = this.f7892b;
            if (ruVar == null) {
                return null;
            }
            Activity activity = ruVar.f8070a;
            return activity;
        }
    }

    public final Context b() {
        synchronized (this.f7891a) {
            ru ruVar = this.f7892b;
            if (ruVar == null) {
                return null;
            }
            Context context = ruVar.f8071b;
            return context;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7891a
            monitor-enter(r0)
            boolean r1 = r7.f7893c     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0055
            r1 = 0
            android.content.Context r2 = r8.getApplicationContext()     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x000f
            r2 = r8
        L_0x000f:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x0016
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0057 }
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r8 = "Can not cast Context to Application"
            l0.e.K(r8)     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.ru r2 = r7.f7892b     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.ru r2 = new com.google.android.gms.internal.ads.ru     // Catch:{ all -> 0x0057 }
            r2.<init>()     // Catch:{ all -> 0x0057 }
            r7.f7892b = r2     // Catch:{ all -> 0x0057 }
        L_0x002a:
            com.google.android.gms.internal.ads.ru r2 = r7.f7892b     // Catch:{ all -> 0x0057 }
            boolean r3 = r2.f8078i     // Catch:{ all -> 0x0057 }
            r4 = 1
            if (r3 != 0) goto L_0x0053
            r1.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0057 }
            boolean r3 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x003d
            android.app.Activity r8 = (android.app.Activity) r8     // Catch:{ all -> 0x0057 }
            r2.a(r8)     // Catch:{ all -> 0x0057 }
        L_0x003d:
            r2.f8071b = r1     // Catch:{ all -> 0x0057 }
            e8.l<java.lang.Long> r8 = e8.t.f16669v0     // Catch:{ all -> 0x0057 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0057 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0057 }
            java.lang.Object r8 = r1.a(r8)     // Catch:{ all -> 0x0057 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0057 }
            long r5 = r8.longValue()     // Catch:{ all -> 0x0057 }
            r2.f8079r = r5     // Catch:{ all -> 0x0057 }
            r2.f8078i = r4     // Catch:{ all -> 0x0057 }
        L_0x0053:
            r7.f7893c = r4     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0057:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pu.c(android.content.Context):void");
    }

    public final void d(yg0 yg0) {
        synchronized (this.f7891a) {
            if (this.f7892b == null) {
                this.f7892b = new ru();
            }
            ru ruVar = this.f7892b;
            synchronized (ruVar.f8072c) {
                ruVar.f8075f.add(yg0);
            }
        }
    }

    public final void e(yg0 yg0) {
        synchronized (this.f7891a) {
            ru ruVar = this.f7892b;
            if (ruVar != null) {
                synchronized (ruVar.f8072c) {
                    ruVar.f8075f.remove(yg0);
                }
            }
        }
    }
}
