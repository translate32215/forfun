package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.a;
import c8.b;
import com.google.android.gms.common.internal.i;
import d7.l;
import e8.dg;
import e8.fi0;
import e8.h;
import e8.ii;
import e8.li0;
import e8.n6;
import e8.pi0;
import e8.q6;
import e8.ui0;
import e8.w00;
import e8.yi0;
import java.util.Collections;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bd extends gy {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6016a;

    /* renamed from: b  reason: collision with root package name */
    public final rx f6017b;

    /* renamed from: c  reason: collision with root package name */
    public final w00 f6018c;

    /* renamed from: d  reason: collision with root package name */
    public final dg f6019d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f6020e;

    public bd(Context context, rx rxVar, w00 w00, dg dgVar) {
        this.f6016a = context;
        this.f6017b = rxVar;
        this.f6018c = w00;
        this.f6019d = dgVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(dgVar.f(), l.B.f13188e.o());
        frameLayout.setMinimumHeight(O4().f15396c);
        frameLayout.setMinimumWidth(O4().f15399f);
        this.f6020e = frameLayout;
    }

    public final String A0() throws RemoteException {
        ii iiVar = this.f6019d.f13729f;
        if (iiVar != null) {
            return iiVar.f15049a;
        }
        return null;
    }

    public final gz B() {
        return this.f6019d.f13729f;
    }

    public final void C4(n6 n6Var) throws RemoteException {
    }

    public final void D() throws RemoteException {
        i.d("destroy must be called on the main UI thread.");
        this.f6019d.f13726c.L0((Context) null);
    }

    public final ky F0() throws RemoteException {
        return this.f6018c.f17200n;
    }

    public final void F1(av avVar) throws RemoteException {
    }

    public final String H4() throws RemoteException {
        return this.f6018c.f17192f;
    }

    public final void L5(pi0 pi0) throws RemoteException {
    }

    public final void N(boolean z10) throws RemoteException {
    }

    public final a O1() throws RemoteException {
        return new b(this.f6020e);
    }

    public final li0 O4() {
        i.d("getAdSize must be called on the main UI thread.");
        return g7.n(this.f6016a, Collections.singletonList(this.f6019d.e()));
    }

    public final void O5(a aVar) {
    }

    public final void Q2(yi0 yi0) throws RemoteException {
    }

    public final void T(t5 t5Var) throws RemoteException {
    }

    public final Bundle X() throws RemoteException {
        e.J("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final void X1(boolean z10) throws RemoteException {
        e.J("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void Z5(n nVar) throws RemoteException {
        e.J("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void destroy() throws RemoteException {
        i.d("destroy must be called on the main UI thread.");
        this.f6019d.a();
    }

    public final void e0(jy jyVar) throws RemoteException {
        e.J("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final boolean e1(fi0 fi0) throws RemoteException {
        e.J("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    public final void g() throws RemoteException {
        i.d("destroy must be called on the main UI thread.");
        this.f6019d.f13726c.K0((Context) null);
    }

    public final hz getVideoController() throws RemoteException {
        return this.f6019d.c();
    }

    public final void i0(String str) throws RemoteException {
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final boolean j() throws RemoteException {
        return false;
    }

    public final void k1(ky kyVar) throws RemoteException {
        e.J("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void k2(String str) throws RemoteException {
    }

    public final rx n2() throws RemoteException {
        return this.f6017b;
    }

    public final void n3(q6 q6Var, String str) throws RemoteException {
    }

    public final void n5(li0 li0) throws RemoteException {
        i.d("setAdSize must be called on the main UI thread.");
        dg dgVar = this.f6019d;
        if (dgVar != null) {
            dgVar.d(this.f6020e, li0);
        }
    }

    public final void p2(h hVar) throws RemoteException {
        e.J("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void p6(rx rxVar) throws RemoteException {
        e.J("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void q1(ox oxVar) throws RemoteException {
        e.J("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void q3(qy qyVar) {
    }

    public final void r1() throws RemoteException {
    }

    public final void r3() throws RemoteException {
        this.f6019d.i();
    }

    public final void r5(fi0 fi0, sx sxVar) {
    }

    public final String s() throws RemoteException {
        ii iiVar = this.f6019d.f13729f;
        if (iiVar != null) {
            return iiVar.f15049a;
        }
        return null;
    }

    public final void showInterstitial() throws RemoteException {
    }

    public final void t3(ui0 ui0) throws RemoteException {
        e.J("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void y5(cz czVar) {
        e.J("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
