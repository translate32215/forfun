package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.common.internal.i;
import d7.l;
import e8.ck;
import e8.dg;
import e8.fi0;
import e8.h;
import e8.ii;
import e8.li0;
import e8.n6;
import e8.ov;
import e8.pi0;
import e8.q6;
import e8.t;
import e8.ti0;
import e8.ui0;
import e8.y00;
import e8.yi0;
import e8.zh0;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ed extends gy implements ck {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6274a;

    /* renamed from: b  reason: collision with root package name */
    public final xd f6275b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6276c;

    /* renamed from: d  reason: collision with root package name */
    public final ov f6277d;

    /* renamed from: e  reason: collision with root package name */
    public li0 f6278e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public final y00 f6279f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public dg f6280g;

    public ed(Context context, li0 li0, String str, xd xdVar, ov ovVar) {
        this.f6274a = context;
        this.f6275b = xdVar;
        this.f6278e = li0;
        this.f6276c = str;
        this.f6277d = ovVar;
        this.f6279f = xdVar.f8549i;
        xdVar.f8548h.J0(this, xdVar.f8542b);
    }

    public final synchronized String A0() {
        ii iiVar;
        dg dgVar = this.f6280g;
        if (dgVar == null || (iiVar = dgVar.f13729f) == null) {
            return null;
        }
        return iiVar.f15049a;
    }

    public final synchronized gz B() {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.Y3)).booleanValue()) {
            return null;
        }
        dg dgVar = this.f6280g;
        if (dgVar == null) {
            return null;
        }
        return dgVar.f13729f;
    }

    public final void C4(n6 n6Var) {
    }

    public final synchronized void D() {
        i.d("resume must be called on the main UI thread.");
        dg dgVar = this.f6280g;
        if (dgVar != null) {
            dgVar.f13726c.L0((Context) null);
        }
    }

    public final synchronized void D4() {
        if (this.f6275b.a()) {
            li0 li0 = this.f6279f.f17546b;
            dg dgVar = this.f6280g;
            if (!(dgVar == null || dgVar.g() == null || !this.f6279f.f17561q)) {
                li0 = g7.n(this.f6274a, Collections.singletonList(this.f6280g.g()));
            }
            s6(li0);
            try {
                t6(this.f6279f.f17545a);
            } catch (RemoteException unused) {
                e.K("Failed to refresh the banner ad.");
            }
        } else {
            this.f6275b.f8548h.K0(60);
        }
    }

    public final ky F0() {
        ky kyVar;
        ov ovVar = this.f6277d;
        synchronized (ovVar) {
            kyVar = ovVar.f15844b.get();
        }
        return kyVar;
    }

    public final void F1(av avVar) {
    }

    public final synchronized String H4() {
        return this.f6276c;
    }

    public final void L5(pi0 pi0) {
    }

    public final void N(boolean z10) {
    }

    public final a O1() {
        i.d("destroy must be called on the main UI thread.");
        return new b(this.f6275b.f8546f);
    }

    public final synchronized li0 O4() {
        i.d("getAdSize must be called on the main UI thread.");
        dg dgVar = this.f6280g;
        if (dgVar != null) {
            return g7.n(this.f6274a, Collections.singletonList(dgVar.e()));
        }
        return this.f6279f.f17546b;
    }

    public final void O5(a aVar) {
    }

    public final void Q2(yi0 yi0) {
    }

    public final void T(t5 t5Var) {
    }

    public final Bundle X() {
        i.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized void X1(boolean z10) {
        i.d("setManualImpressionsEnabled must be called from the main thread.");
        this.f6279f.f17550f = z10;
    }

    public final synchronized void Z5(n nVar) {
        i.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f6275b.f8547g = nVar;
    }

    public final synchronized void destroy() {
        i.d("destroy must be called on the main UI thread.");
        dg dgVar = this.f6280g;
        if (dgVar != null) {
            dgVar.a();
        }
    }

    public final void e0(jy jyVar) {
        i.d("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized boolean e1(fi0 fi0) throws RemoteException {
        s6(this.f6278e);
        return t6(fi0);
    }

    public final synchronized void g() {
        i.d("pause must be called on the main UI thread.");
        dg dgVar = this.f6280g;
        if (dgVar != null) {
            dgVar.f13726c.K0((Context) null);
        }
    }

    public final synchronized hz getVideoController() {
        i.d("getVideoController must be called from the main thread.");
        dg dgVar = this.f6280g;
        if (dgVar == null) {
            return null;
        }
        return dgVar.c();
    }

    public final void i0(String str) {
    }

    public final boolean isReady() {
        return false;
    }

    public final synchronized boolean j() {
        return this.f6275b.j();
    }

    public final void k1(ky kyVar) {
        i.d("setAppEventListener must be called on the main UI thread.");
        this.f6277d.f15844b.set(kyVar);
    }

    public final void k2(String str) {
    }

    public final rx n2() {
        return this.f6277d.m();
    }

    public final void n3(q6 q6Var, String str) {
    }

    public final synchronized void n5(li0 li0) {
        i.d("setAdSize must be called on the main UI thread.");
        this.f6279f.f17546b = li0;
        this.f6278e = li0;
        dg dgVar = this.f6280g;
        if (dgVar != null) {
            dgVar.d(this.f6275b.f8546f, li0);
        }
    }

    public final synchronized void p2(h hVar) {
        i.d("setVideoOptions must be called on the main UI thread.");
        this.f6279f.f17549e = hVar;
    }

    public final void p6(rx rxVar) {
        i.d("setAdListener must be called on the main UI thread.");
        this.f6277d.f15843a.set(rxVar);
    }

    public final void q1(ox oxVar) {
        i.d("setAdListener must be called on the main UI thread.");
        gd gdVar = this.f6275b.f8545e;
        synchronized (gdVar) {
            gdVar.f6637a = oxVar;
        }
    }

    public final void q3(qy qyVar) {
    }

    public final void r1() {
    }

    public final synchronized void r3() {
        i.d("recordManualImpression must be called on the main UI thread.");
        dg dgVar = this.f6280g;
        if (dgVar != null) {
            dgVar.i();
        }
    }

    public final void r5(fi0 fi0, sx sxVar) {
    }

    public final synchronized String s() {
        ii iiVar;
        dg dgVar = this.f6280g;
        if (dgVar == null || (iiVar = dgVar.f13729f) == null) {
            return null;
        }
        return iiVar.f15049a;
    }

    public final synchronized void s6(li0 li0) {
        y00 y00 = this.f6279f;
        y00.f17546b = li0;
        y00.f17561q = this.f6278e.f15407v;
    }

    public final void showInterstitial() {
    }

    public final synchronized void t3(ui0 ui0) {
        i.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f6279f.f17547c = ui0;
    }

    public final synchronized boolean t6(fi0 fi0) throws RemoteException {
        i.d("loadAd must be called on the main UI thread.");
        p pVar = l.B.f13186c;
        if (!p.s(this.f6274a) || fi0.A != null) {
            androidx.appcompat.widget.p.u(this.f6274a, fi0.f14636f);
            return this.f6275b.k(fi0, this.f6276c, (ob) null, new g2(this));
        }
        e.I("Failed to load the ad because app ID is missing.");
        ov ovVar = this.f6277d;
        if (ovVar != null) {
            ovVar.j0(e.p(we.APP_ID_MISSING, (String) null, (zh0) null));
        }
        return false;
    }

    public final void y5(cz czVar) {
        i.d("setPaidEventListener must be called on the main UI thread.");
        this.f6277d.f15845c.set(czVar);
    }
}
