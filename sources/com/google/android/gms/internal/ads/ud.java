package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.a;
import c8.b;
import com.google.android.gms.common.internal.i;
import d7.l;
import e7.e;
import e7.q;
import e8.dz;
import e8.eh0;
import e8.f9;
import e8.fi0;
import e8.h;
import e8.hz;
import e8.li0;
import e8.n6;
import e8.pi0;
import e8.q6;
import e8.qf;
import e8.tj;
import e8.ui0;
import e8.yi0;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ud extends gy implements q, tj, eh0 {

    /* renamed from: a  reason: collision with root package name */
    public final b8 f8234a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8235b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f8236c;

    /* renamed from: d  reason: collision with root package name */
    public AtomicBoolean f8237d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final String f8238e;

    /* renamed from: f  reason: collision with root package name */
    public final dz f8239f;

    /* renamed from: g  reason: collision with root package name */
    public final hz f8240g;

    /* renamed from: h  reason: collision with root package name */
    public final f9 f8241h;

    /* renamed from: i  reason: collision with root package name */
    public long f8242i = -1;

    /* renamed from: r  reason: collision with root package name */
    public q8 f8243r;
    @GuardedBy("this")

    /* renamed from: s  reason: collision with root package name */
    public qf f8244s;

    public ud(b8 b8Var, Context context, String str, dz dzVar, hz hzVar, f9 f9Var) {
        this.f8236c = new FrameLayout(context);
        this.f8234a = b8Var;
        this.f8235b = context;
        this.f8238e = str;
        this.f8239f = dzVar;
        this.f8240g = hzVar;
        hzVar.f14961e.set(this);
        this.f8241h = f9Var;
    }

    public static li0 s6(ud udVar) {
        return g7.n(udVar.f8235b, Collections.singletonList(udVar.f8244s.f13725b.f7964q.get(0)));
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
        this.f8240g.f14958b.set(avVar);
    }

    public final synchronized String H4() {
        return this.f8238e;
    }

    public final void L5(pi0 pi0) {
        this.f8239f.f8358g.f17554j = pi0;
    }

    public final void N(boolean z10) {
    }

    public final a O1() {
        i.d("getAdFrame must be called on the main UI thread.");
        return new b(this.f8236c);
    }

    public final synchronized li0 O4() {
        i.d("getAdSize must be called on the main UI thread.");
        qf qfVar = this.f8244s;
        if (qfVar == null) {
            return null;
        }
        return g7.n(this.f8235b, Collections.singletonList(qfVar.f13725b.f7964q.get(0)));
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

    public final void b4() {
        t6(4);
    }

    public final synchronized void destroy() {
        i.d("destroy must be called on the main UI thread.");
        qf qfVar = this.f8244s;
        if (qfVar != null) {
            qfVar.a();
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
            android.content.Context r0 = r4.f8235b     // Catch:{ all -> 0x0054 }
            boolean r0 = com.google.android.gms.ads.internal.util.p.s(r0)     // Catch:{ all -> 0x0054 }
            r1 = 0
            if (r0 == 0) goto L_0x002a
            e8.xh0 r0 = r5.A     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x002a
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            l0.e.I(r5)     // Catch:{ all -> 0x0054 }
            e8.hz r5 = r4.f8240g     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.we r0 = com.google.android.gms.internal.ads.we.APP_ID_MISSING     // Catch:{ all -> 0x0054 }
            r2 = 0
            e8.zh0 r0 = l0.e.p(r0, r2, r2)     // Catch:{ all -> 0x0054 }
            r5.j0(r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)
            return r1
        L_0x002a:
            monitor-enter(r4)     // Catch:{ all -> 0x0054 }
            e8.dz r0 = r4.f8239f     // Catch:{ all -> 0x0051 }
            boolean r0 = r0.j()     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0036
            monitor-exit(r4)
            return r1
        L_0x0036:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            r4.f8237d = r0     // Catch:{ all -> 0x0054 }
            e8.fz r0 = new e8.fz     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            e8.dz r1 = r4.f8239f     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r4.f8238e     // Catch:{ all -> 0x0054 }
            e8.ez r3 = new e8.ez     // Catch:{ all -> 0x0054 }
            r3.<init>(r4)     // Catch:{ all -> 0x0054 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ud.e1(e8.fi0):boolean");
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
        return this.f8239f.j();
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

    public final void o4() {
        if (this.f8244s != null) {
            this.f8242i = l.B.f13193j.a();
            int i10 = this.f8244s.f16156j;
            if (i10 > 0) {
                q8 q8Var = new q8(this.f8234a.f(), l.B.f13193j);
                this.f8243r = q8Var;
                q8Var.b(i10, new e(this));
            }
        }
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

    public final void showInterstitial() {
    }

    public final synchronized void t3(ui0 ui0) {
    }

    public final synchronized void t6(int i10) {
        bv bvVar;
        if (this.f8237d.compareAndSet(false, true)) {
            qf qfVar = this.f8244s;
            if (!(qfVar == null || (bvVar = qfVar.f16159m) == null)) {
                this.f8240g.f14959c.set(bvVar);
            }
            this.f8240g.a();
            this.f8236c.removeAllViews();
            q8 q8Var = this.f8243r;
            if (q8Var != null) {
                l.B.f13189f.e(q8Var);
            }
            if (this.f8244s != null) {
                long j10 = -1;
                if (this.f8242i != -1) {
                    j10 = l.B.f13193j.a() - this.f8242i;
                }
                this.f8244s.f16160n.j(j10, i10);
            }
            destroy();
        }
    }

    public final void y5(cz czVar) {
    }

    public final void z0() {
        t6(3);
    }
}
