package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e7.i;
import e8.h;
import e8.h9;
import e8.hc;
import e8.ia;
import e8.k9;
import e8.o50;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import s.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w7 extends kz {

    /* renamed from: a  reason: collision with root package name */
    public final ia f8418a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8419b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8420c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8421d;
    @GuardedBy("lock")

    /* renamed from: e  reason: collision with root package name */
    public int f8422e;
    @GuardedBy("lock")

    /* renamed from: f  reason: collision with root package name */
    public mz f8423f;
    @GuardedBy("lock")

    /* renamed from: g  reason: collision with root package name */
    public boolean f8424g;
    @GuardedBy("lock")

    /* renamed from: h  reason: collision with root package name */
    public boolean f8425h = true;
    @GuardedBy("lock")

    /* renamed from: i  reason: collision with root package name */
    public float f8426i;
    @GuardedBy("lock")

    /* renamed from: r  reason: collision with root package name */
    public float f8427r;
    @GuardedBy("lock")

    /* renamed from: s  reason: collision with root package name */
    public float f8428s;
    @GuardedBy("lock")

    /* renamed from: t  reason: collision with root package name */
    public boolean f8429t;
    @GuardedBy("lock")

    /* renamed from: u  reason: collision with root package name */
    public boolean f8430u;
    @GuardedBy("lock")

    /* renamed from: v  reason: collision with root package name */
    public z0 f8431v;

    public w7(ia iaVar, float f10, boolean z10, boolean z11) {
        this.f8418a = iaVar;
        this.f8426i = f10;
        this.f8420c = z10;
        this.f8421d = z11;
    }

    public final float H0() {
        float f10;
        synchronized (this.f8419b) {
            f10 = this.f8427r;
        }
        return f10;
    }

    public final mz R1() throws RemoteException {
        mz mzVar;
        synchronized (this.f8419b) {
            mzVar = this.f8423f;
        }
        return mzVar;
    }

    public final int W() {
        int i10;
        synchronized (this.f8419b) {
            i10 = this.f8422e;
        }
        return i10;
    }

    public final void X3(boolean z10) {
        w6(z10 ? "mute" : "unmute", (Map<String, String>) null);
    }

    public final void g() {
        w6("pause", (Map<String, String>) null);
    }

    public final void k0() {
        w6("play", (Map<String, String>) null);
    }

    public final boolean k3() {
        boolean z10;
        synchronized (this.f8419b) {
            z10 = this.f8420c && this.f8429t;
        }
        return z10;
    }

    public final float n0() {
        float f10;
        synchronized (this.f8419b) {
            f10 = this.f8426i;
        }
        return f10;
    }

    public final boolean p1() {
        boolean z10;
        boolean k32 = k3();
        synchronized (this.f8419b) {
            if (!k32) {
                try {
                    if (this.f8430u && this.f8421d) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final float s1() {
        float f10;
        synchronized (this.f8419b) {
            f10 = this.f8428s;
        }
        return f10;
    }

    public final void stop() {
        w6("stop", (Map<String, String>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t6(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8419b
            monitor-enter(r0)
            float r1 = r3.f8426i     // Catch:{ all -> 0x004d }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            float r1 = r3.f8428s     // Catch:{ all -> 0x004d }
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r3.f8426i = r5     // Catch:{ all -> 0x004d }
            r3.f8427r = r4     // Catch:{ all -> 0x004d }
            boolean r4 = r3.f8425h     // Catch:{ all -> 0x004d }
            r3.f8425h = r7     // Catch:{ all -> 0x004d }
            int r5 = r3.f8422e     // Catch:{ all -> 0x004d }
            r3.f8422e = r6     // Catch:{ all -> 0x004d }
            float r2 = r3.f8428s     // Catch:{ all -> 0x004d }
            r3.f8428s = r8     // Catch:{ all -> 0x004d }
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x004d }
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0038
            e8.ia r8 = r3.f8418a     // Catch:{ all -> 0x004d }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x004d }
            r8.invalidate()     // Catch:{ all -> 0x004d }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.z0 r8 = r3.f8431v     // Catch:{ RemoteException -> 0x0043 }
            if (r8 == 0) goto L_0x0049
            r8.q6()     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            l0.e.F(r0, r8)
        L_0x0049:
            r3.u6(r5, r6, r4, r7)
            return
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w7.t6(float, float, int, boolean, float):void");
    }

    public final boolean u2() {
        boolean z10;
        synchronized (this.f8419b) {
            z10 = this.f8425h;
        }
        return z10;
    }

    public final void u6(int i10, int i11, boolean z10, boolean z11) {
        o50 o50 = h9.f14885e;
        ((k9) o50).f15244a.execute(new hc(this, i10, i11, z10, z11));
    }

    public final void v6(h hVar) {
        boolean z10 = hVar.f14836a;
        boolean z11 = hVar.f14837b;
        boolean z12 = hVar.f14838c;
        synchronized (this.f8419b) {
            this.f8429t = z11;
            this.f8430u = z12;
        }
        String str = z10 ? "1" : "0";
        String str2 = z11 ? "1" : "0";
        String str3 = z12 ? "1" : "0";
        a aVar = new a(3);
        aVar.put("muteStart", str);
        aVar.put("customControlsRequested", str2);
        aVar.put("clickToExpandRequested", str3);
        w6("initialState", Collections.unmodifiableMap(aVar));
    }

    public final void w6(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        ((k9) h9.f14885e).f15244a.execute(new i(this, (Map) hashMap));
    }

    public final void x3(mz mzVar) {
        synchronized (this.f8419b) {
            this.f8423f = mzVar;
        }
    }
}
