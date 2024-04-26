package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import e8.kh0;
import e8.lh0;
import e8.s30;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gv {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f6704a = new s30(this);

    /* renamed from: b  reason: collision with root package name */
    public final Object f6705b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public lh0 f6706c;
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    public Context f6707d;
    @GuardedBy("lock")

    /* renamed from: e  reason: collision with root package name */
    public jv f6708e;

    public static void d(gv gvVar) {
        synchronized (gvVar.f6705b) {
            lh0 lh0 = gvVar.f6706c;
            if (lh0 != null) {
                if (lh0.b() || gvVar.f6706c.h()) {
                    gvVar.f6706c.p();
                }
                gvVar.f6706c = null;
                gvVar.f6708e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6705b
            monitor-enter(r0)
            android.content.Context r1 = r6.f6707d     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0031
            e8.lh0 r1 = r6.f6706c     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0031
        L_0x000c:
            e8.ih0 r1 = new e8.ih0     // Catch:{ all -> 0x0033 }
            r1.<init>(r6)     // Catch:{ all -> 0x0033 }
            e8.hh0 r2 = new e8.hh0     // Catch:{ all -> 0x0033 }
            r2.<init>(r6)     // Catch:{ all -> 0x0033 }
            monitor-enter(r6)     // Catch:{ all -> 0x0033 }
            e8.lh0 r3 = new e8.lh0     // Catch:{ all -> 0x002e }
            android.content.Context r4 = r6.f6707d     // Catch:{ all -> 0x002e }
            d7.l r5 = d7.l.B     // Catch:{ all -> 0x002e }
            d6.l r5 = r5.f13200q     // Catch:{ all -> 0x002e }
            android.os.Looper r5 = r5.b()     // Catch:{ all -> 0x002e }
            r3.<init>(r4, r5, r1, r2)     // Catch:{ all -> 0x002e }
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            r6.f6706c = r3     // Catch:{ all -> 0x0033 }
            r3.n()     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x002e:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gv.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f6705b
            monitor-enter(r0)
            android.content.Context r1 = r2.f6707d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f6707d = r3     // Catch:{ all -> 0x0048 }
            e8.l<java.lang.Boolean> r3 = e8.t.Y1     // Catch:{ all -> 0x0048 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.a()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            e8.l<java.lang.Boolean> r3 = e8.t.X1     // Catch:{ all -> 0x0048 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            e8.gh0 r3 = new e8.gh0     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            d7.l r1 = d7.l.B     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.pu r1 = r1.f13189f     // Catch:{ all -> 0x0048 }
            r1.d(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gv.b(android.content.Context):void");
    }

    public final hv c(kh0 kh0) {
        synchronized (this.f6705b) {
            if (this.f6708e == null) {
                hv hvVar = new hv();
                return hvVar;
            }
            try {
                if (this.f6706c.E()) {
                    hv t52 = this.f6708e.t5(kh0);
                    return t52;
                }
                hv e32 = this.f6708e.e3(kh0);
                return e32;
            } catch (RemoteException e10) {
                e.C("Unable to call into cache service.", e10);
                return new hv();
            }
        }
    }
}
