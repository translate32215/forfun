package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.ma;
import java.util.concurrent.LinkedBlockingQueue;
import s7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class nf implements b.a, b.C0083b {

    /* renamed from: a  reason: collision with root package name */
    public bg f7578a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7579b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7580c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingQueue<ma> f7581d = new LinkedBlockingQueue<>();

    /* renamed from: e  reason: collision with root package name */
    public final HandlerThread f7582e;

    public nf(Context context, String str, String str2) {
        this.f7579b = str;
        this.f7580c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f7582e = handlerThread;
        handlerThread.start();
        this.f7578a = new bg(context, handlerThread.getLooper(), this, this, 9200000);
        this.f7578a.n();
    }

    public static ma b() {
        ma.a V = ma.V();
        V.q(32768);
        return (ma) ((aq) V.j());
    }

    public final void Y(int i10) {
        try {
            this.f7581d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        bg bgVar = this.f7578a;
        if (bgVar == null) {
            return;
        }
        if (bgVar.b() || this.f7578a.h()) {
            this.f7578a.p();
        }
    }

    public final void m(a aVar) {
        try {
            this.f7581d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z0(android.os.Bundle r5) {
        /*
            r4 = this;
            r5 = 0
            com.google.android.gms.internal.ads.bg r0 = r4.f7578a     // Catch:{ DeadObjectException | IllegalStateException -> 0x0008 }
            com.google.android.gms.internal.ads.dg r0 = r0.E()     // Catch:{ DeadObjectException | IllegalStateException -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r0 = r5
        L_0x0009:
            if (r0 == 0) goto L_0x0066
            e8.r30 r1 = new e8.r30     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r4.f7579b     // Catch:{ all -> 0x004a }
            java.lang.String r3 = r4.f7580c     // Catch:{ all -> 0x004a }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x004a }
            e8.u30 r0 = r0.L1(r1)     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.ma r1 = r0.f16845b     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0037
            byte[] r1 = r0.f16846c     // Catch:{ f80 -> 0x0030 }
            com.google.android.gms.internal.ads.up r2 = com.google.android.gms.internal.ads.up.b()     // Catch:{ f80 -> 0x0030 }
            com.google.android.gms.internal.ads.ma r1 = com.google.android.gms.internal.ads.ma.y(r1, r2)     // Catch:{ f80 -> 0x0030 }
            r0.f16845b = r1     // Catch:{ f80 -> 0x0030 }
            r0.f16846c = r5     // Catch:{ f80 -> 0x0030 }
            goto L_0x0037
        L_0x0030:
            r5 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
            r0.<init>(r5)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0037:
            r0.i()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.ma r5 = r0.f16845b     // Catch:{ all -> 0x004a }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.ma> r0 = r4.f7581d     // Catch:{ all -> 0x004a }
            r0.put(r5)     // Catch:{ all -> 0x004a }
            r4.a()
            android.os.HandlerThread r5 = r4.f7582e
            r5.quit()
            return
        L_0x004a:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.ma> r5 = r4.f7581d     // Catch:{ InterruptedException -> 0x005e, all -> 0x0054 }
            com.google.android.gms.internal.ads.ma r0 = b()     // Catch:{ InterruptedException -> 0x005e, all -> 0x0054 }
            r5.put(r0)     // Catch:{ InterruptedException -> 0x005e, all -> 0x0054 }
            goto L_0x005e
        L_0x0054:
            r5 = move-exception
            r4.a()
            android.os.HandlerThread r0 = r4.f7582e
            r0.quit()
            throw r5
        L_0x005e:
            r4.a()
            android.os.HandlerThread r5 = r4.f7582e
            r5.quit()
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nf.z0(android.os.Bundle):void");
    }
}
