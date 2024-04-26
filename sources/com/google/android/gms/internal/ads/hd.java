package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.k;
import c8.a;
import c8.b;
import com.google.android.gms.common.internal.i;
import e8.e00;
import e8.fi0;
import e8.h;
import e8.ii;
import e8.li0;
import e8.mi;
import e8.n6;
import e8.ov;
import e8.pi0;
import e8.q6;
import e8.t;
import e8.ti0;
import e8.ui0;
import e8.yi0;
import e8.zh0;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hd extends gy {

    /* renamed from: a  reason: collision with root package name */
    public final li0 f6845a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f6846b;

    /* renamed from: c  reason: collision with root package name */
    public final ke f6847c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6848d;

    /* renamed from: e  reason: collision with root package name */
    public final ov f6849e;

    /* renamed from: f  reason: collision with root package name */
    public final e00 f6850f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public q9 f6851g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public boolean f6852h = ((Boolean) ti0.f16763j.f16769f.a(t.f16609l0)).booleanValue();

    public hd(Context context, li0 li0, String str, ke keVar, ov ovVar, e00 e00) {
        this.f6845a = li0;
        this.f6848d = str;
        this.f6846b = context;
        this.f6847c = keVar;
        this.f6849e = ovVar;
        this.f6850f = e00;
    }

    public final synchronized String A0() {
        ii iiVar;
        q9 q9Var = this.f6851g;
        if (q9Var == null || (iiVar = q9Var.f13729f) == null) {
            return null;
        }
        return iiVar.f15049a;
    }

    public final synchronized gz B() {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.Y3)).booleanValue()) {
            return null;
        }
        q9 q9Var = this.f6851g;
        if (q9Var == null) {
            return null;
        }
        return q9Var.f13729f;
    }

    public final void C4(n6 n6Var) {
    }

    public final synchronized void D() {
        i.d("resume must be called on the main UI thread.");
        q9 q9Var = this.f6851g;
        if (q9Var != null) {
            q9Var.f13726c.L0((Context) null);
        }
    }

    public final ky F0() {
        ky kyVar;
        ov ovVar = this.f6849e;
        synchronized (ovVar) {
            kyVar = ovVar.f15844b.get();
        }
        return kyVar;
    }

    public final void F1(av avVar) {
    }

    public final synchronized String H4() {
        return this.f6848d;
    }

    public final void L5(pi0 pi0) {
    }

    public final synchronized void N(boolean z10) {
        i.d("setImmersiveMode must be called on the main UI thread.");
        this.f6852h = z10;
    }

    public final a O1() {
        return null;
    }

    public final li0 O4() {
        return null;
    }

    public final synchronized void O5(a aVar) {
        if (this.f6851g == null) {
            e.K("Interstitial can not be shown before loaded.");
            k.d(this.f6849e.f15847e, new mi(e.p(we.NOT_READY, (String) null, (zh0) null), 2));
            return;
        }
        this.f6851g.c(this.f6852h, (Activity) b.z0(aVar));
    }

    public final void Q2(yi0 yi0) {
    }

    public final void T(t5 t5Var) {
        this.f6850f.f14348e.set(t5Var);
    }

    public final Bundle X() {
        i.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final void X1(boolean z10) {
    }

    public final synchronized void Z5(n nVar) {
        i.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f6847c.f7244f = nVar;
    }

    public final synchronized void destroy() {
        i.d("destroy must be called on the main UI thread.");
        q9 q9Var = this.f6851g;
        if (q9Var != null) {
            q9Var.f13726c.M0((Context) null);
        }
    }

    public final void e0(jy jyVar) {
        i.d("setAdMetadataListener must be called on the main UI thread.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean e1(e8.fi0 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r0)     // Catch:{ all -> 0x0053 }
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x0053 }
            com.google.android.gms.ads.internal.util.p r0 = r0.f13186c     // Catch:{ all -> 0x0053 }
            android.content.Context r0 = r4.f6846b     // Catch:{ all -> 0x0053 }
            boolean r0 = com.google.android.gms.ads.internal.util.p.s(r0)     // Catch:{ all -> 0x0053 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002c
            e8.xh0 r0 = r5.A     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x002c
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            l0.e.I(r5)     // Catch:{ all -> 0x0053 }
            e8.ov r5 = r4.f6849e     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.we r0 = com.google.android.gms.internal.ads.we.APP_ID_MISSING     // Catch:{ all -> 0x0053 }
            e8.zh0 r0 = l0.e.p(r0, r2, r2)     // Catch:{ all -> 0x0053 }
            r5.j0(r0)     // Catch:{ all -> 0x0053 }
        L_0x002a:
            monitor-exit(r4)
            return r1
        L_0x002c:
            boolean r0 = r4.s6()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0034
            monitor-exit(r4)
            return r1
        L_0x0034:
            android.content.Context r0 = r4.f6846b     // Catch:{ all -> 0x0053 }
            boolean r1 = r5.f14636f     // Catch:{ all -> 0x0053 }
            androidx.appcompat.widget.p.u(r0, r1)     // Catch:{ all -> 0x0053 }
            r4.f6851g = r2     // Catch:{ all -> 0x0053 }
            com.google.android.gms.internal.ads.ke r0 = r4.f6847c     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = r4.f6848d     // Catch:{ all -> 0x0053 }
            e8.d00 r2 = new e8.d00     // Catch:{ all -> 0x0053 }
            e8.li0 r3 = r4.f6845a     // Catch:{ all -> 0x0053 }
            r2.<init>(r3)     // Catch:{ all -> 0x0053 }
            com.google.android.gms.internal.ads.ri r3 = new com.google.android.gms.internal.ads.ri     // Catch:{ all -> 0x0053 }
            r3.<init>((com.google.android.gms.internal.ads.hd) r4)     // Catch:{ all -> 0x0053 }
            boolean r5 = r0.k(r5, r1, r2, r3)     // Catch:{ all -> 0x0053 }
            monitor-exit(r4)
            return r5
        L_0x0053:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hd.e1(e8.fi0):boolean");
    }

    public final synchronized void g() {
        i.d("pause must be called on the main UI thread.");
        q9 q9Var = this.f6851g;
        if (q9Var != null) {
            q9Var.f13726c.K0((Context) null);
        }
    }

    public final hz getVideoController() {
        return null;
    }

    public final void i0(String str) {
    }

    public final synchronized boolean isReady() {
        i.d("isLoaded must be called on the main UI thread.");
        return s6();
    }

    public final synchronized boolean j() {
        return this.f6847c.j();
    }

    public final void k1(ky kyVar) {
        i.d("setAppEventListener must be called on the main UI thread.");
        this.f6849e.f15844b.set(kyVar);
    }

    public final void k2(String str) {
    }

    public final rx n2() {
        return this.f6849e.m();
    }

    public final void n3(q6 q6Var, String str) {
    }

    public final void n5(li0 li0) {
    }

    public final void p2(h hVar) {
    }

    public final void p6(rx rxVar) {
        i.d("setAdListener must be called on the main UI thread.");
        this.f6849e.f15843a.set(rxVar);
    }

    public final void q1(ox oxVar) {
    }

    public final void q3(qy qyVar) {
        this.f6849e.f15847e.set(qyVar);
    }

    public final void r1() {
    }

    public final void r3() {
    }

    public final void r5(fi0 fi0, sx sxVar) {
        this.f6849e.f15846d.set(sxVar);
        e1(fi0);
    }

    public final synchronized String s() {
        ii iiVar;
        q9 q9Var = this.f6851g;
        if (q9Var == null || (iiVar = q9Var.f13729f) == null) {
            return null;
        }
        return iiVar.f15049a;
    }

    public final synchronized boolean s6() {
        boolean z10;
        q9 q9Var = this.f6851g;
        if (q9Var == null || q9Var.f7933l.f15393b.get()) {
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }

    public final synchronized void showInterstitial() {
        i.d("showInterstitial must be called on the main UI thread.");
        q9 q9Var = this.f6851g;
        if (q9Var != null) {
            q9Var.c(this.f6852h, (Activity) null);
        }
    }

    public final void t3(ui0 ui0) {
    }

    public final void y5(cz czVar) {
        i.d("setPaidEventListener must be called on the main UI thread.");
        this.f6849e.f15845c.set(czVar);
    }
}
