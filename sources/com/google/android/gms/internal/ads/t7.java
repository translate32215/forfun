package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c8.a;
import d7.h;
import e8.eh0;
import e8.f3;
import e8.f4;
import e8.f9;
import e8.gc;
import e8.ia;
import e8.j4;
import e8.l1;
import e8.lc;
import e8.m1;
import e8.pb;
import e8.pc;
import e8.qc;
import e8.rc;
import e8.sc;
import e8.uc;
import e8.ug0;
import e8.wc;
import e8.wh0;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public interface t7 extends h, f4, j4, ia, pb, gc, lc, pc, qc, rc, sc, ug0, wh0 {
    void A();

    void A0(m1 m1Var);

    void B0();

    void D(a aVar);

    Context D0();

    void E(boolean z10);

    String E0();

    void G(com.google.android.gms.ads.internal.overlay.a aVar);

    void G0(com.google.android.gms.ads.internal.overlay.a aVar);

    uc H();

    void H0(boolean z10);

    void I();

    com.google.android.gms.ads.internal.overlay.a K();

    void L(boolean z10);

    void M(Context context);

    a N();

    void R();

    void V();

    void W();

    boolean X(boolean z10, int i10);

    com.google.android.gms.ads.internal.overlay.a Z();

    Activity b();

    eh0 b0();

    f9 c();

    void c0(wc wcVar);

    void d(w7 w7Var);

    void destroy();

    void e(String str, f3<? super t7> f3Var);

    void e0(boolean z10);

    boolean f();

    WebViewClient f0();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    void h(String str, q7 q7Var);

    void h0();

    i i();

    boolean i0();

    wc j();

    qe k();

    void l0(qe qeVar, re reVar);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m0(String str, String str2, String str3);

    void measure(int i10, int i11);

    void n0(l1 l1Var);

    w7 o();

    m1 o0();

    void onPause();

    void onResume();

    re p();

    void p0();

    d7.a q();

    boolean q0();

    void r(String str, f3<? super t7> f3Var);

    tm s();

    void s0(String str, ri riVar);

    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i10);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    boolean u();

    boolean u0();

    boolean w0();

    void x(eh0 eh0);

    void z(int i10);

    void z0(boolean z10);
}
