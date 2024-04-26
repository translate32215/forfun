package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.o;
import c8.a;
import c8.b;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.gz;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.jy;
import com.google.android.gms.internal.ads.ky;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.ox;
import com.google.android.gms.internal.ads.qy;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.sx;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.tm;
import d7.i;
import d7.j;
import d7.k;
import d7.m;
import e.g;
import e8.f9;
import e8.fi0;
import e8.h;
import e8.h9;
import e8.li0;
import e8.n0;
import e8.n6;
import e8.pi0;
import e8.q6;
import e8.tw;
import e8.ui0;
import e8.yi0;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c extends gy {

    /* renamed from: a  reason: collision with root package name */
    public final f9 f5595a;

    /* renamed from: b  reason: collision with root package name */
    public final li0 f5596b;

    /* renamed from: c  reason: collision with root package name */
    public final Future<tm> f5597c = ((ih) h9.f14881a).i(new d(this));

    /* renamed from: d  reason: collision with root package name */
    public final Context f5598d;

    /* renamed from: e  reason: collision with root package name */
    public final m f5599e;

    /* renamed from: f  reason: collision with root package name */
    public WebView f5600f;

    /* renamed from: g  reason: collision with root package name */
    public rx f5601g;

    /* renamed from: h  reason: collision with root package name */
    public tm f5602h;

    /* renamed from: i  reason: collision with root package name */
    public AsyncTask<Void, Void, String> f5603i;

    public c(Context context, li0 li0, String str, f9 f9Var) {
        this.f5598d = context;
        this.f5595a = f9Var;
        this.f5596b = li0;
        this.f5600f = new WebView(context);
        this.f5599e = new m(context, str);
        s6(0);
        this.f5600f.setVerticalScrollBarEnabled(false);
        this.f5600f.getSettings().setJavaScriptEnabled(true);
        this.f5600f.setWebViewClient(new j(this));
        this.f5600f.setOnTouchListener(new i(this));
    }

    public final String A0() throws RemoteException {
        return null;
    }

    public final gz B() {
        return null;
    }

    public final void C4(n6 n6Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void D() throws RemoteException {
        com.google.android.gms.common.internal.i.d("resume must be called on the main UI thread.");
    }

    public final ky F0() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final void F1(av avVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final String H4() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final void L5(pi0 pi0) {
        throw new IllegalStateException("Unused method");
    }

    public final void N(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    public final a O1() throws RemoteException {
        com.google.android.gms.common.internal.i.d("getAdFrame must be called on the main UI thread.");
        return new b(this.f5600f);
    }

    public final li0 O4() throws RemoteException {
        return this.f5596b;
    }

    public final void O5(a aVar) {
    }

    public final void Q2(yi0 yi0) {
        throw new IllegalStateException("Unused method");
    }

    public final void T(t5 t5Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final Bundle X() {
        throw new IllegalStateException("Unused method");
    }

    public final void X1(boolean z10) throws RemoteException {
    }

    public final void Z5(n nVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void destroy() throws RemoteException {
        com.google.android.gms.common.internal.i.d("destroy must be called on the main UI thread.");
        this.f5603i.cancel(true);
        this.f5597c.cancel(true);
        this.f5600f.destroy();
        this.f5600f = null;
    }

    public final void e0(jy jyVar) {
        throw new IllegalStateException("Unused method");
    }

    public final boolean e1(fi0 fi0) throws RemoteException {
        com.google.android.gms.common.internal.i.i(this.f5600f, "This Search Ad has already been torn down");
        m mVar = this.f5599e;
        f9 f9Var = this.f5595a;
        mVar.getClass();
        mVar.f13213d = fi0.f14640r.f14342a;
        Bundle bundle = fi0.f14643u;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) n0.f15569c.b();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    mVar.f13214e = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    mVar.f13212c.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            mVar.f13212c.put("SDKVersion", f9Var.f14544a);
            if (((Boolean) n0.f15567a.b()).booleanValue()) {
                try {
                    Bundle a10 = tw.a((Context) mVar.f13210a, new JSONArray((String) n0.f15568b.b()));
                    for (String str3 : a10.keySet()) {
                        mVar.f13212c.put(str3, a10.get(str3).toString());
                    }
                } catch (JSONException e10) {
                    e.C("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e10);
                }
            }
        }
        this.f5603i = new k(this, (j) null).execute(new Void[0]);
        return true;
    }

    public final void g() throws RemoteException {
        com.google.android.gms.common.internal.i.d("pause must be called on the main UI thread.");
    }

    public final hz getVideoController() {
        return null;
    }

    public final void i0(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final boolean j() throws RemoteException {
        return false;
    }

    public final void k1(ky kyVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void k2(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final rx n2() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void n3(q6 q6Var, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void n5(li0 li0) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void p2(h hVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void p6(rx rxVar) throws RemoteException {
        this.f5601g = rxVar;
    }

    public final void q1(ox oxVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void q3(qy qyVar) {
    }

    public final void r1() throws RemoteException {
    }

    public final void r3() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void r5(fi0 fi0, sx sxVar) {
    }

    public final String s() throws RemoteException {
        return null;
    }

    public final void s6(int i10) {
        if (this.f5600f != null) {
            this.f5600f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
        }
    }

    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void t3(ui0 ui0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final String t6() {
        String str = (String) this.f5599e.f13214e;
        if (TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) n0.f15570d.b();
        return g.a(o.a(str2, o.a(str, 8)), "https://", str, str2);
    }

    public final void y5(cz czVar) {
    }
}
