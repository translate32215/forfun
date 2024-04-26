package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import c8.a;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.common.internal.i;
import d7.l;
import e7.e;
import e7.k;
import e8.eh0;
import e8.fi0;
import e8.h;
import e8.hz;
import e8.li0;
import e8.n6;
import e8.pi0;
import e8.pz;
import e8.q6;
import e8.sz;
import e8.ui0;
import e8.yi0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wd extends gy implements k, eh0 {

    /* renamed from: a  reason: collision with root package name */
    public final b8 f8444a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8445b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f8446c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    public final String f8447d;

    /* renamed from: e  reason: collision with root package name */
    public final pz f8448e;

    /* renamed from: f  reason: collision with root package name */
    public final hz f8449f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public long f8450g = -1;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public q8 f8451h;
    @GuardedBy("this")

    /* renamed from: i  reason: collision with root package name */
    public u8 f8452i;

    public wd(b8 b8Var, Context context, String str, pz pzVar, hz hzVar) {
        this.f8444a = b8Var;
        this.f8445b = context;
        this.f8447d = str;
        this.f8448e = pzVar;
        this.f8449f = hzVar;
        hzVar.f14962f.set(this);
    }

    public final synchronized String A0() {
        return null;
    }

    public final synchronized gz B() {
        return null;
    }

    public final void C4(n6 n6Var) {
    }

    public final synchronized void D() {
        i.d("resume must be called on the main UI thread.");
    }

    public final ky F0() {
        return null;
    }

    public final void F1(av avVar) {
        this.f8449f.f14958b.set(avVar);
    }

    public final synchronized void G1() {
        if (this.f8452i != null) {
            this.f8450g = l.B.f13193j.a();
            int i10 = this.f8452i.f8222i;
            if (i10 > 0) {
                q8 q8Var = new q8(this.f8444a.f(), l.B.f13193j);
                this.f8451h = q8Var;
                q8Var.b(i10, new e(this));
            }
        }
    }

    public final synchronized String H4() {
        return this.f8447d;
    }

    public final void J3(c cVar) {
        int i10 = sz.f16541a[cVar.ordinal()];
        if (i10 == 1) {
            s6(3);
        } else if (i10 == 2) {
            s6(2);
        } else if (i10 == 3) {
            s6(4);
        } else if (i10 == 4) {
            s6(6);
        }
    }

    public final void L5(pi0 pi0) {
        this.f8448e.f8358g.f17554j = pi0;
    }

    public final void N(boolean z10) {
    }

    public final a O1() {
        return null;
    }

    public final synchronized li0 O4() {
        return null;
    }

    public final void O5(a aVar) {
    }

    public final void Q2(yi0 yi0) {
    }

    public final void T(t5 t5Var) {
    }

    public final Bundle X() {
        return new Bundle();
    }

    public final synchronized void X1(boolean z10) {
    }

    public final synchronized void Z5(n nVar) {
    }

    public final synchronized void destroy() {
        i.d("destroy must be called on the main UI thread.");
        u8 u8Var = this.f8452i;
        if (u8Var != null) {
            u8Var.a();
        }
    }

    public final void e0(jy jyVar) {
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean e1(e8.fi0 r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r0)     // Catch:{ all -> 0x0054 }
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x0054 }
            com.google.android.gms.ads.internal.util.p r0 = r0.f13186c     // Catch:{ all -> 0x0054 }
            android.content.Context r0 = r4.f8445b     // Catch:{ all -> 0x0054 }
            boolean r0 = com.google.android.gms.ads.internal.util.p.s(r0)     // Catch:{ all -> 0x0054 }
            r1 = 0
            if (r0 == 0) goto L_0x002a
            e8.xh0 r0 = r5.A     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x002a
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            l0.e.I(r5)     // Catch:{ all -> 0x0054 }
            e8.hz r5 = r4.f8449f     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.we r0 = com.google.android.gms.internal.ads.we.APP_ID_MISSING     // Catch:{ all -> 0x0054 }
            r2 = 0
            e8.zh0 r0 = l0.e.p(r0, r2, r2)     // Catch:{ all -> 0x0054 }
            r5.j0(r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)
            return r1
        L_0x002a:
            monitor-enter(r4)     // Catch:{ all -> 0x0054 }
            e8.pz r0 = r4.f8448e     // Catch:{ all -> 0x0051 }
            boolean r0 = r0.j()     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0036
            monitor-exit(r4)
            return r1
        L_0x0036:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            r4.f8446c = r0     // Catch:{ all -> 0x0054 }
            e8.rz r0 = new e8.rz     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            e8.pz r1 = r4.f8448e     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r4.f8447d     // Catch:{ all -> 0x0054 }
            e8.gz r3 = new e8.gz     // Catch:{ all -> 0x0054 }
            r3.<init>((com.google.android.gms.internal.ads.wd) r4)     // Catch:{ all -> 0x0054 }
            boolean r5 = r1.k(r5, r2, r0, r3)     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)
            return r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r5     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wd.e1(e8.fi0):boolean");
    }

    public final synchronized void g() {
        i.d("pause must be called on the main UI thread.");
    }

    public final synchronized hz getVideoController() {
        return null;
    }

    public final void i0(String str) {
    }

    public final boolean isReady() {
        return false;
    }

    public final synchronized boolean j() {
        return this.f8448e.j();
    }

    public final void k1(ky kyVar) {
    }

    public final void k2(String str) {
    }

    public final rx n2() {
        return null;
    }

    public final void n3(q6 q6Var, String str) {
    }

    public final synchronized void n5(li0 li0) {
        i.d("setAdSize must be called on the main UI thread.");
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final synchronized void p2(h hVar) {
    }

    public final void p6(rx rxVar) {
    }

    public final void q1(ox oxVar) {
    }

    public final void q3(qy qyVar) {
    }

    public final void r1() {
    }

    public final synchronized void r3() {
    }

    public final void r5(fi0 fi0, sx sxVar) {
    }

    public final synchronized String s() {
        return null;
    }

    public final synchronized void s6(int i10) {
        if (this.f8446c.compareAndSet(false, true)) {
            this.f8449f.a();
            q8 q8Var = this.f8451h;
            if (q8Var != null) {
                l.B.f13189f.e(q8Var);
            }
            if (this.f8452i != null) {
                long j10 = -1;
                if (this.f8450g != -1) {
                    j10 = l.B.f13193j.a() - this.f8450g;
                }
                this.f8452i.f8223j.j(j10, i10);
            }
            destroy();
        }
    }

    public final synchronized void showInterstitial() {
    }

    public final synchronized void t3(ui0 ui0) {
    }

    public final synchronized void x0() {
        u8 u8Var = this.f8452i;
        if (u8Var != null) {
            u8Var.f8223j.j(l.B.f13193j.a() - this.f8450g, 1);
        }
    }

    public final void y5(cz czVar) {
    }

    public final void z0() {
        s6(3);
    }
}
