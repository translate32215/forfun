package e8;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.a;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.v7;
import com.google.android.gms.internal.ads.w7;
import com.startapp.startappsdk.R;
import d7.l;
import e7.c;
import e7.e;
import f7.j;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dc extends FrameLayout implements t7 {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f14245d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final t7 f14246a;

    /* renamed from: b  reason: collision with root package name */
    public final da f14247b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f14248c = new AtomicBoolean();

    public dc(t7 t7Var) {
        super(t7Var.getContext());
        this.f14246a = t7Var;
        v7 v7Var = (v7) t7Var;
        this.f14247b = new da(v7Var.f8309a.f17465c, this, this);
        addView(v7Var);
    }

    public final void A() {
        this.f14246a.A();
    }

    public final void A0(m1 m1Var) {
        this.f14246a.A0(m1Var);
    }

    public final void B(boolean z10, int i10) {
        this.f14246a.B(z10, i10);
    }

    public final void B0() {
        setBackgroundColor(0);
        this.f14246a.setBackgroundColor(0);
    }

    public final q7 C(String str) {
        return this.f14246a.C(str);
    }

    public final void D(a aVar) {
        this.f14246a.D(aVar);
    }

    public final Context D0() {
        return this.f14246a.D0();
    }

    public final void E(boolean z10) {
        this.f14246a.E(z10);
    }

    public final String E0() {
        return this.f14246a.E0();
    }

    public final void F(String str, JSONObject jSONObject) {
        this.f14246a.F(str, jSONObject);
    }

    public final void G(com.google.android.gms.ads.internal.overlay.a aVar) {
        this.f14246a.G(aVar);
    }

    public final void G0(com.google.android.gms.ads.internal.overlay.a aVar) {
        this.f14246a.G0(aVar);
    }

    public final uc H() {
        return this.f14246a.H();
    }

    public final void H0(boolean z10) {
        this.f14246a.H0(z10);
    }

    public final void I() {
        TextView textView = new TextView(getContext());
        Resources a10 = l.B.f13190g.a();
        textView.setText(a10 != null ? a10.getString(R.string.f28881s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final void J(boolean z10) {
        this.f14246a.J(z10);
    }

    public final com.google.android.gms.ads.internal.overlay.a K() {
        return this.f14246a.K();
    }

    public final void L(boolean z10) {
        this.f14246a.L(z10);
    }

    public final void M(Context context) {
        this.f14246a.M(context);
    }

    public final a N() {
        return this.f14246a.N();
    }

    public final void O(String str, Map<String, ?> map) {
        this.f14246a.O(str, map);
    }

    public final void P() {
        this.f14246a.P();
    }

    public final void Q(boolean z10, int i10, String str) {
        this.f14246a.Q(z10, i10, str);
    }

    public final void R() {
        da daVar = this.f14247b;
        daVar.getClass();
        i.d("onDestroy must be called from the UI thread.");
        i7 i7Var = daVar.f14231d;
        if (i7Var != null) {
            i7Var.f6924d.a();
            aa aaVar = i7Var.f6926f;
            if (aaVar != null) {
                aaVar.i();
            }
            i7Var.f();
            daVar.f14230c.removeView(daVar.f14231d);
            daVar.f14231d = null;
        }
        this.f14246a.R();
    }

    public final int S() {
        return this.f14246a.S();
    }

    public final int T() {
        return getMeasuredWidth();
    }

    public final void U(c cVar) {
        this.f14246a.U(cVar);
    }

    public final void V() {
        this.f14246a.V();
    }

    public final void W() {
        this.f14246a.W();
    }

    public final boolean X(boolean z10, int i10) {
        if (!this.f14248c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16627o0)).booleanValue()) {
            return false;
        }
        if (this.f14246a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f14246a.getParent()).removeView(this.f14246a.getView());
        }
        return this.f14246a.X(z10, i10);
    }

    public final void Y() {
        this.f14246a.Y();
    }

    public final com.google.android.gms.ads.internal.overlay.a Z() {
        return this.f14246a.Z();
    }

    public final void a(String str) {
        this.f14246a.a(str);
    }

    public final Activity b() {
        return this.f14246a.b();
    }

    public final eh0 b0() {
        return this.f14246a.b0();
    }

    public final f9 c() {
        return this.f14246a.c();
    }

    public final void c0(wc wcVar) {
        this.f14246a.c0(wcVar);
    }

    public final void d(w7 w7Var) {
        this.f14246a.d(w7Var);
    }

    public final void d0(int i10) {
        this.f14246a.d0(i10);
    }

    public final void destroy() {
        a N = N();
        if (N != null) {
            d40 d40 = p.f5702i;
            d40.post(new j(N));
            d40.postDelayed(new e(this), (long) ((Integer) ti0.f16763j.f16769f.a(t.G2)).intValue());
            return;
        }
        this.f14246a.destroy();
    }

    public final void e(String str, f3<? super t7> f3Var) {
        this.f14246a.e(str, f3Var);
    }

    public final void e0(boolean z10) {
        this.f14246a.e0(z10);
    }

    public final boolean f() {
        return this.f14246a.f();
    }

    public final WebViewClient f0() {
        return this.f14246a.f0();
    }

    public final void g(f fVar, dt dtVar, oq oqVar, t20 t20, String str, String str2, int i10) {
        this.f14246a.g(fVar, dtVar, oqVar, t20, str, str2, i10);
    }

    public final String getRequestId() {
        return this.f14246a.getRequestId();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.f14246a.getWebView();
    }

    public final void h(String str, q7 q7Var) {
        this.f14246a.h(str, q7Var);
    }

    public final void h0() {
        this.f14246a.h0();
    }

    public final com.google.android.gms.internal.ads.i i() {
        return this.f14246a.i();
    }

    public final boolean i0() {
        return this.f14246a.i0();
    }

    public final wc j() {
        return this.f14246a.j();
    }

    public final void j0() {
        this.f14246a.j0();
    }

    public final qe k() {
        return this.f14246a.k();
    }

    public final void k0(boolean z10, int i10, String str, String str2) {
        this.f14246a.k0(z10, i10, str, str2);
    }

    public final com.google.android.gms.internal.ads.j l() {
        return this.f14246a.l();
    }

    public final void l0(qe qeVar, re reVar) {
        this.f14246a.l0(qeVar, reVar);
    }

    public final void loadData(String str, String str2, String str3) {
        this.f14246a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f14246a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f14246a.loadUrl(str);
    }

    public final void m(String str, JSONObject jSONObject) {
        this.f14246a.m(str, jSONObject);
    }

    public final void m0(String str, String str2, String str3) {
        this.f14246a.m0(str, str2, str3);
    }

    public final void n() {
        t7 t7Var = this.f14246a;
        if (t7Var != null) {
            t7Var.n();
        }
    }

    public final void n0(l1 l1Var) {
        this.f14246a.n0(l1Var);
    }

    public final w7 o() {
        return this.f14246a.o();
    }

    public final m1 o0() {
        return this.f14246a.o0();
    }

    public final void onPause() {
        aa aaVar;
        da daVar = this.f14247b;
        daVar.getClass();
        i.d("onPause must be called from the UI thread.");
        i7 i7Var = daVar.f14231d;
        if (!(i7Var == null || (aaVar = i7Var.f6926f) == null)) {
            aaVar.e();
        }
        this.f14246a.onPause();
    }

    public final void onResume() {
        this.f14246a.onResume();
    }

    public final re p() {
        return this.f14246a.p();
    }

    public final void p0() {
        this.f14246a.p0();
    }

    public final d7.a q() {
        return this.f14246a.q();
    }

    public final boolean q0() {
        return this.f14248c.get();
    }

    public final void r(String str, f3<? super t7> f3Var) {
        this.f14246a.r(str, f3Var);
    }

    public final void r0(boolean z10, long j10) {
        this.f14246a.r0(z10, j10);
    }

    public final tm s() {
        return this.f14246a.s();
    }

    public final void s0(String str, ri riVar) {
        this.f14246a.s0(str, riVar);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f14246a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f14246a.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i10) {
        this.f14246a.setRequestedOrientation(i10);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f14246a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f14246a.setWebViewClient(webViewClient);
    }

    public final void t(vg0 vg0) {
        this.f14246a.t(vg0);
    }

    public final da t0() {
        return this.f14247b;
    }

    public final boolean u() {
        return this.f14246a.u();
    }

    public final boolean u0() {
        return this.f14246a.u0();
    }

    public final void v() {
        this.f14246a.v();
    }

    public final String w() {
        return this.f14246a.w();
    }

    public final boolean w0() {
        return this.f14246a.w0();
    }

    public final void x(eh0 eh0) {
        this.f14246a.x(eh0);
    }

    public final int y() {
        return getMeasuredHeight();
    }

    public final void z(int i10) {
        this.f14246a.z(i10);
    }

    public final void z0(boolean z10) {
        this.f14246a.z0(z10);
    }
}
