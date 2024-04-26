package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.activity.j;
import c8.b;
import cb.d;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.ads.p1;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t4;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.u7;
import d7.g;
import d7.l;
import e7.f;
import e7.h;
import e7.k;
import e7.m;
import e7.p;
import e7.q;
import e8.dt;
import e8.e30;
import e8.et;
import e8.f9;
import e8.h3;
import e8.h8;
import e8.i0;
import e8.oq;
import e8.t;
import e8.t20;
import e8.ti0;
import e8.uc;
import e8.wc;
import e8.wh0;
import java.util.Collections;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class a extends t4 implements q {
    public static final int D = Color.argb(0, 0, 0, 0);
    public boolean A = false;
    public boolean B = false;
    public boolean C = true;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f5625b;

    /* renamed from: c  reason: collision with root package name */
    public AdOverlayInfoParcel f5626c;

    /* renamed from: d  reason: collision with root package name */
    public t7 f5627d;

    /* renamed from: e  reason: collision with root package name */
    public b f5628e;

    /* renamed from: f  reason: collision with root package name */
    public m f5629f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5630g = false;

    /* renamed from: h  reason: collision with root package name */
    public FrameLayout f5631h;

    /* renamed from: i  reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f5632i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5633r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5634s = false;

    /* renamed from: t  reason: collision with root package name */
    public f f5635t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5636u = false;

    /* renamed from: v  reason: collision with root package name */
    public c f5637v = c.BACK_BUTTON;

    /* renamed from: w  reason: collision with root package name */
    public final Object f5638w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public Runnable f5639x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5640y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5641z;

    public a(Activity activity) {
        this.f5625b = activity;
    }

    public final void A6() {
        t7 t7Var;
        k kVar;
        if (!this.B) {
            this.B = true;
            t7 t7Var2 = this.f5627d;
            if (t7Var2 != null) {
                this.f5635t.removeView(t7Var2.getView());
                b bVar = this.f5628e;
                if (bVar != null) {
                    this.f5627d.M(bVar.f5645d);
                    this.f5627d.H0(false);
                    ViewGroup viewGroup = this.f5628e.f5644c;
                    View view = this.f5627d.getView();
                    b bVar2 = this.f5628e;
                    viewGroup.addView(view, bVar2.f5642a, bVar2.f5643b);
                    this.f5628e = null;
                } else if (this.f5625b.getApplicationContext() != null) {
                    this.f5627d.M(this.f5625b.getApplicationContext());
                }
                this.f5627d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f5626c;
            if (!(adOverlayInfoParcel == null || (kVar = adOverlayInfoParcel.f5609c) == null)) {
                kVar.J3(this.f5637v);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5626c;
            if (adOverlayInfoParcel2 != null && (t7Var = adOverlayInfoParcel2.f5610d) != null) {
                c8.a N = t7Var.N();
                View view2 = this.f5626c.f5610d.getView();
                if (N != null && view2 != null) {
                    l.B.f13205v.c(N, view2);
                }
            }
        }
    }

    public final void B4() {
        this.f5637v = c.BACK_BUTTON;
    }

    public final void D2() {
        this.f5641z = true;
    }

    public final void T5(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5633r);
    }

    public final void Z() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16677w2)).booleanValue() && this.f5627d != null && (!this.f5625b.isFinishing() || this.f5628e == null)) {
            this.f5627d.onPause();
        }
        z6();
    }

    public final void Z0(int i10, int i11, Intent intent) {
    }

    public final void b4() {
        this.f5637v = c.CLOSE_BUTTON;
        this.f5625b.finish();
    }

    public final void h1(c8.a aVar) {
        u6((Configuration) b.z0(aVar));
    }

    public void h6(Bundle bundle) {
        wh0 wh0;
        c cVar = c.OTHER;
        this.f5625b.requestWindowFeature(1);
        this.f5633r = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel i10 = AdOverlayInfoParcel.i(this.f5625b.getIntent());
            this.f5626c = i10;
            if (i10 != null) {
                if (i10.f5619u.f14546c > 7500000) {
                    this.f5637v = cVar;
                }
                if (this.f5625b.getIntent() != null) {
                    this.C = this.f5625b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel = this.f5626c;
                g gVar = adOverlayInfoParcel.f5621w;
                if (gVar != null) {
                    this.f5634s = gVar.f13172a;
                } else if (adOverlayInfoParcel.f5617s == 5) {
                    this.f5634s = true;
                } else {
                    this.f5634s = false;
                }
                if (!(!this.f5634s || adOverlayInfoParcel.f5617s == 5 || gVar.f13177f == -1)) {
                    new h(this, (j) null).b();
                }
                if (bundle == null) {
                    k kVar = this.f5626c.f5609c;
                    if (kVar != null && this.C) {
                        kVar.G1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5626c;
                    if (!(adOverlayInfoParcel2.f5617s == 1 || (wh0 = adOverlayInfoParcel2.f5608b) == null)) {
                        wh0.n();
                    }
                }
                Activity activity = this.f5625b;
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f5626c;
                f fVar = new f(activity, adOverlayInfoParcel3.f5620v, adOverlayInfoParcel3.f5619u.f14544a);
                this.f5635t = fVar;
                fVar.setId(1000);
                l.B.f13188e.m(this.f5625b);
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.f5626c;
                int i11 = adOverlayInfoParcel4.f5617s;
                if (i11 == 1) {
                    x6(false);
                } else if (i11 == 2) {
                    this.f5628e = new b(adOverlayInfoParcel4.f5610d);
                    x6(false);
                } else if (i11 == 3) {
                    x6(true);
                } else if (i11 == 5) {
                    x6(false);
                } else {
                    throw new e7.g("Could not determine ad overlay type.");
                }
            } else {
                throw new e7.g("Could not get info for ad overlay.");
            }
        } catch (e7.g e10) {
            e.K(e10.getMessage());
            this.f5637v = cVar;
            this.f5625b.finish();
        }
    }

    public final void o3() {
    }

    public final void onDestroy() {
        t7 t7Var = this.f5627d;
        if (t7Var != null) {
            try {
                this.f5635t.removeView(t7Var.getView());
            } catch (NullPointerException unused) {
            }
        }
        z6();
    }

    public final void onPause() {
        y6();
        k kVar = this.f5626c.f5609c;
        if (kVar != null) {
            kVar.onPause();
        }
        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16677w2)).booleanValue() && this.f5627d != null && (!this.f5625b.isFinishing() || this.f5628e == null)) {
            this.f5627d.onPause();
        }
        z6();
    }

    public final void onResume() {
        k kVar = this.f5626c.f5609c;
        if (kVar != null) {
            kVar.onResume();
        }
        u6(this.f5625b.getResources().getConfiguration());
        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16677w2)).booleanValue()) {
            t7 t7Var = this.f5627d;
            if (t7Var == null || t7Var.f()) {
                e.K("The webview does not exist. Ignoring action.");
            } else {
                this.f5627d.onResume();
            }
        }
    }

    public final void s6() {
        this.f5637v = c.CUSTOM_CLOSE;
        this.f5625b.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5626c;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f5617s == 5) {
            this.f5625b.overridePendingTransition(0, 0);
        }
    }

    public final void t6(int i10) {
        if (this.f5625b.getApplicationInfo().targetSdkVersion >= ((Integer) ti0.f16763j.f16769f.a(t.f16624n3)).intValue()) {
            if (this.f5625b.getApplicationInfo().targetSdkVersion <= ((Integer) ti0.f16763j.f16769f.a(t.f16630o3)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) ti0.f16763j.f16769f.a(t.f16636p3)).intValue()) {
                    if (i11 <= ((Integer) ti0.f16763j.f16769f.a(t.f16642q3)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f5625b.setRequestedOrientation(i10);
        } catch (Throwable th) {
            l.B.f13190g.c(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f5621w;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u6(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f5626c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            d7.g r0 = r0.f5621w
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f13173b
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            d7.l r3 = d7.l.B
            f7.m0 r3 = r3.f13188e
            android.app.Activity r4 = r5.f5625b
            boolean r6 = r3.h(r4, r6)
            boolean r3 = r5.f5634s
            r4 = 19
            if (r3 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            if (r6 != 0) goto L_0x0037
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0038
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f5626c
            if (r6 == 0) goto L_0x0038
            d7.g r6 = r6.f5621w
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.f13178g
            if (r6 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.app.Activity r6 = r5.f5625b
            android.view.Window r6 = r6.getWindow()
            e8.l<java.lang.Boolean> r0 = e8.t.D0
            e8.ti0 r3 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r3 = r3.f16769f
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0066
            android.view.View r6 = r6.getDecorView()
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0062
            r0 = 5380(0x1504, float:7.539E-42)
            if (r2 == 0) goto L_0x0062
            r0 = 5894(0x1706, float:8.259E-42)
        L_0x0062:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0066:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0082
            r6.addFlags(r0)
            r6.clearFlags(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0088
            if (r2 == 0) goto L_0x0088
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
            return
        L_0x0082:
            r6.addFlags(r3)
            r6.clearFlags(r0)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.a.u6(android.content.res.Configuration):void");
    }

    public final void v0() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16677w2)).booleanValue()) {
            t7 t7Var = this.f5627d;
            if (t7Var == null || t7Var.f()) {
                e.K("The webview does not exist. Ignoring action.");
            } else {
                this.f5627d.onResume();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f5626c).f5621w;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v6(boolean r7, boolean r8) {
        /*
            r6 = this;
            e8.l<java.lang.Boolean> r0 = e8.t.B0
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f5626c
            if (r0 == 0) goto L_0x0022
            d7.g r0 = r0.f5621w
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f13179h
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            e8.l<java.lang.Boolean> r3 = e8.t.C0
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f5626c
            if (r3 == 0) goto L_0x0043
            d7.g r3 = r3.f5621w
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.f13180i
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            e8.gf0 r7 = new e8.gf0
            com.google.android.gms.internal.ads.t7 r4 = r6.f5627d
            java.lang.String r5 = "useCustomClose"
            r7.<init>((com.google.android.gms.internal.ads.t7) r4, (java.lang.String) r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.s(r4)
        L_0x005a:
            e7.m r7 = r6.f5629f
            if (r7 == 0) goto L_0x0075
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            if (r1 == 0) goto L_0x0070
            android.widget.ImageButton r7 = r7.f13649a
            r8 = 8
            r7.setVisibility(r8)
            goto L_0x0075
        L_0x0070:
            android.widget.ImageButton r7 = r7.f13649a
            r7.setVisibility(r2)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.a.v6(boolean, boolean):void");
    }

    public final boolean w2() {
        this.f5637v = c.BACK_BUTTON;
        t7 t7Var = this.f5627d;
        if (t7Var == null) {
            return true;
        }
        boolean i02 = t7Var.i0();
        if (!i02) {
            this.f5627d.O("onbackblocked", Collections.emptyMap());
        }
        return i02;
    }

    public final void w6(boolean z10) {
        int intValue = ((Integer) ti0.f16763j.f16769f.a(t.f16689y2)).intValue();
        e7.l lVar = new e7.l();
        lVar.f13648d = 50;
        int i10 = 0;
        lVar.f13645a = z10 ? intValue : 0;
        if (!z10) {
            i10 = intValue;
        }
        lVar.f13646b = i10;
        lVar.f13647c = intValue;
        this.f5629f = new m(this.f5625b, lVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z10 ? 11 : 9);
        v6(z10, this.f5626c.f5613g);
        this.f5635t.addView(this.f5629f, layoutParams);
    }

    public final void x0() {
        k kVar = this.f5626c.f5609c;
        if (kVar != null) {
            kVar.x0();
        }
    }

    public final void x6(boolean z10) throws e7.g {
        if (!this.f5641z) {
            this.f5625b.requestWindowFeature(1);
        }
        Window window = this.f5625b.getWindow();
        if (window != null) {
            t7 t7Var = this.f5626c.f5610d;
            com.google.android.gms.ads.internal.a aVar = null;
            uc H = t7Var != null ? t7Var.H() : null;
            boolean z11 = false;
            boolean z12 = H != null && ((s7) H).y();
            this.f5636u = false;
            if (z12) {
                int i10 = this.f5626c.f5616r;
                if (i10 == 6) {
                    if (this.f5625b.getResources().getConfiguration().orientation == 1) {
                        z11 = true;
                    }
                    this.f5636u = z11;
                } else if (i10 == 7) {
                    if (this.f5625b.getResources().getConfiguration().orientation == 2) {
                        z11 = true;
                    }
                    this.f5636u = z11;
                }
            }
            boolean z13 = this.f5636u;
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Delay onShow to next orientation change: ");
            sb2.append(z13);
            e.E(sb2.toString());
            t6(this.f5626c.f5616r);
            window.setFlags(16777216, 16777216);
            e.E("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f5634s) {
                this.f5635t.setBackgroundColor(-16777216);
            } else {
                this.f5635t.setBackgroundColor(D);
            }
            this.f5625b.setContentView(this.f5635t);
            this.f5641z = true;
            if (z10) {
                try {
                    u7 u7Var = l.B.f13187d;
                    Activity activity = this.f5625b;
                    t7 t7Var2 = this.f5626c.f5610d;
                    wc j10 = t7Var2 != null ? t7Var2.j() : null;
                    t7 t7Var3 = this.f5626c.f5610d;
                    String E0 = t7Var3 != null ? t7Var3.E0() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f5626c;
                    f9 f9Var = adOverlayInfoParcel.f5619u;
                    t7 t7Var4 = adOverlayInfoParcel.f5610d;
                    t7 a10 = u7.a(activity, j10, E0, true, z12, (tm) null, (i0) null, f9Var, (d7.h) null, t7Var4 != null ? t7Var4.q() : null, new nv(), (qe) null, (re) null);
                    this.f5627d = a10;
                    uc H2 = a10.H();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5626c;
                    o1 o1Var = adOverlayInfoParcel2.f5622x;
                    p1 p1Var = adOverlayInfoParcel2.f5611e;
                    p pVar = adOverlayInfoParcel2.f5615i;
                    t7 t7Var5 = adOverlayInfoParcel2.f5610d;
                    if (t7Var5 != null) {
                        aVar = ((s7) t7Var5.H()).f8105y;
                    }
                    ((s7) H2).v((wh0) null, o1Var, (k) null, p1Var, pVar, true, (h3) null, aVar, (g2) null, (h8) null, (dt) null, (e30) null, (oq) null, (t20) null);
                    ((s7) this.f5627d.H()).f8095g = new d(this);
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f5626c;
                    String str = adOverlayInfoParcel3.f5618t;
                    if (str != null) {
                        this.f5627d.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.f5614h;
                        if (str2 != null) {
                            this.f5627d.loadDataWithBaseURL(adOverlayInfoParcel3.f5612f, str2, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new e7.g("No URL or HTML to display in ad overlay.");
                        }
                    }
                    t7 t7Var6 = this.f5626c.f5610d;
                    if (t7Var6 != null) {
                        t7Var6.G0(this);
                    }
                } catch (Exception e10) {
                    e.C("Error obtaining webview.", e10);
                    throw new e7.g("Could not obtain webview for the overlay.");
                }
            } else {
                t7 t7Var7 = this.f5626c.f5610d;
                this.f5627d = t7Var7;
                t7Var7.M(this.f5625b);
            }
            this.f5627d.G(this);
            t7 t7Var8 = this.f5626c.f5610d;
            if (t7Var8 != null) {
                c8.a N = t7Var8.N();
                f fVar = this.f5635t;
                if (!(N == null || fVar == null)) {
                    l.B.f13205v.c(N, fVar);
                }
            }
            if (this.f5626c.f5617s != 5) {
                ViewParent parent = this.f5627d.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f5627d.getView());
                }
                if (this.f5634s) {
                    this.f5627d.B0();
                }
                this.f5635t.addView(this.f5627d.getView(), -1, -1);
            }
            if (!z10 && !this.f5636u) {
                this.f5627d.h0();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f5626c;
            if (adOverlayInfoParcel4.f5617s != 5) {
                w6(z12);
                if (this.f5627d.u0()) {
                    v6(z12, true);
                    return;
                }
                return;
            }
            et.s6(this.f5625b, this, adOverlayInfoParcel4.C, adOverlayInfoParcel4.f5624z, adOverlayInfoParcel4.A, adOverlayInfoParcel4.B, adOverlayInfoParcel4.f5623y, adOverlayInfoParcel4.D);
            return;
        }
        throw new e7.g("Invalid activity, no window available.");
    }

    public final void y6() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5626c;
        if (adOverlayInfoParcel != null && this.f5630g) {
            t6(adOverlayInfoParcel.f5616r);
        }
        if (this.f5631h != null) {
            this.f5625b.setContentView(this.f5635t);
            this.f5641z = true;
            this.f5631h.removeAllViews();
            this.f5631h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f5632i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f5632i = null;
        }
        this.f5630g = false;
    }

    public final void z6() {
        if (this.f5625b.isFinishing() && !this.A) {
            this.A = true;
            t7 t7Var = this.f5627d;
            if (t7Var != null) {
                t7Var.z(this.f5637v.f5651a);
                synchronized (this.f5638w) {
                    if (!this.f5640y && this.f5627d.w0()) {
                        e7.e eVar = new e7.e(this);
                        this.f5639x = eVar;
                        com.google.android.gms.ads.internal.util.p.f5702i.postDelayed(eVar, ((Long) ti0.f16763j.f16769f.a(t.A0)).longValue());
                        return;
                    }
                }
            }
            A6();
        }
    }
}
