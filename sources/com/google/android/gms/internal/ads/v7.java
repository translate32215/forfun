package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.p;
import d7.h;
import d7.l;
import e7.c;
import e7.k;
import e8.bb;
import e8.d40;
import e8.da;
import e8.dt;
import e8.eh0;
import e8.f3;
import e8.f9;
import e8.fc;
import e8.gf0;
import e8.i0;
import e8.ic;
import e8.jc;
import e8.k4;
import e8.l1;
import e8.m1;
import e8.oc;
import e8.oq;
import e8.t;
import e8.t20;
import e8.ti0;
import e8.uc;
import e8.vg0;
import e8.wc;
import e8.wh0;
import e8.xc;
import e8.y8;
import e8.zb;
import f7.a0;
import f7.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class v7 extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, t7 {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f8308k0 = 0;
    @GuardedBy("this")
    public boolean A;
    @GuardedBy("this")
    public boolean B;
    @GuardedBy("this")
    public boolean C;
    @GuardedBy("this")
    public Boolean D;
    @GuardedBy("this")
    public boolean E = true;
    @GuardedBy("this")
    public String F = "";
    @GuardedBy("this")
    public w7 G;
    @GuardedBy("this")
    public boolean H;
    @GuardedBy("this")
    public boolean I;
    @GuardedBy("this")
    public m1 J;
    @GuardedBy("this")
    public l1 K;
    @GuardedBy("this")
    public eh0 L;
    @GuardedBy("this")
    public int M;
    @GuardedBy("this")
    public int N;
    public j O;
    public j P;
    public j Q;
    public i R;
    public int S;

    /* renamed from: a  reason: collision with root package name */
    public final xc f8309a;
    @GuardedBy("this")

    /* renamed from: a0  reason: collision with root package name */
    public a f8310a0;

    /* renamed from: b  reason: collision with root package name */
    public final tm f8311b;
    @GuardedBy("this")

    /* renamed from: b0  reason: collision with root package name */
    public boolean f8312b0;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f8313c;

    /* renamed from: c0  reason: collision with root package name */
    public a0 f8314c0;

    /* renamed from: d  reason: collision with root package name */
    public final f9 f8315d;

    /* renamed from: d0  reason: collision with root package name */
    public int f8316d0 = -1;

    /* renamed from: e  reason: collision with root package name */
    public final h f8317e;

    /* renamed from: e0  reason: collision with root package name */
    public int f8318e0 = -1;

    /* renamed from: f  reason: collision with root package name */
    public final d7.a f8319f;

    /* renamed from: f0  reason: collision with root package name */
    public int f8320f0 = -1;

    /* renamed from: g  reason: collision with root package name */
    public final DisplayMetrics f8321g;

    /* renamed from: g0  reason: collision with root package name */
    public int f8322g0 = -1;

    /* renamed from: h  reason: collision with root package name */
    public final float f8323h;

    /* renamed from: h0  reason: collision with root package name */
    public Map<String, q7> f8324h0;

    /* renamed from: i  reason: collision with root package name */
    public qe f8325i;

    /* renamed from: i0  reason: collision with root package name */
    public final WindowManager f8326i0;

    /* renamed from: j0  reason: collision with root package name */
    public final nv f8327j0;

    /* renamed from: r  reason: collision with root package name */
    public re f8328r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8329s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8330t = false;

    /* renamed from: u  reason: collision with root package name */
    public s7 f8331u;
    @GuardedBy("this")

    /* renamed from: v  reason: collision with root package name */
    public a f8332v;
    @GuardedBy("this")

    /* renamed from: w  reason: collision with root package name */
    public c8.a f8333w;
    @GuardedBy("this")

    /* renamed from: x  reason: collision with root package name */
    public wc f8334x;
    @GuardedBy("this")

    /* renamed from: y  reason: collision with root package name */
    public String f8335y;
    @GuardedBy("this")

    /* renamed from: z  reason: collision with root package name */
    public boolean f8336z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v7(xc xcVar, wc wcVar, String str, boolean z10, tm tmVar, i0 i0Var, f9 f9Var, k kVar, h hVar, d7.a aVar, nv nvVar, qe qeVar, re reVar) {
        super(xcVar);
        re reVar2;
        String str2;
        f9 f9Var2 = f9Var;
        this.f8309a = xcVar;
        this.f8334x = wcVar;
        this.f8335y = str;
        this.B = z10;
        this.f8311b = tmVar;
        this.f8313c = i0Var;
        this.f8315d = f9Var2;
        this.f8317e = hVar;
        this.f8319f = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f8326i0 = windowManager;
        p pVar = l.B.f13186c;
        DisplayMetrics c10 = p.c(windowManager);
        this.f8321g = c10;
        this.f8323h = c10.density;
        this.f8327j0 = nvVar;
        this.f8325i = qeVar;
        this.f8328r = reVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            e.C("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(l.B.f13186c.H(xcVar, f9Var2.f14544a));
        l.B.f13188e.i(getContext(), settings);
        setDownloadListener(this);
        y0();
        addJavascriptInterface(new jc(this, new ic(this, 0)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f8314c0 = new a0(this.f8309a.f17463a, this, this);
        I0();
        k kVar2 = new k("make_wv", this.f8335y);
        this.R = new i(kVar2);
        synchronized (kVar2.f7188d) {
            kVar2.f7189e = kVar;
        }
        if (!(!((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue() || (reVar2 = this.f8328r) == null || (str2 = reVar2.f8030b) == null)) {
            this.R.f6910b.b("gqi", str2);
        }
        j e11 = g.e(this.R.f6910b);
        this.P = e11;
        this.R.f6909a.put("native:view_create", e11);
        this.Q = null;
        this.O = null;
        l.B.f13188e.k(xcVar);
        l.B.f13190g.f8588i.incrementAndGet();
    }

    public final void A() {
        a0 a0Var = this.f8314c0;
        a0Var.f18254e = true;
        if (a0Var.f18253d) {
            a0Var.b();
        }
    }

    public final synchronized void A0(m1 m1Var) {
        this.J = m1Var;
    }

    public final void B(boolean z10, int i10) {
        s7 s7Var = this.f8331u;
        wh0 wh0 = (!s7Var.f8089a.u() || s7Var.f8089a.j().b()) ? s7Var.f8093e : null;
        k kVar = s7Var.f8094f;
        e7.p pVar = s7Var.f8103w;
        t7 t7Var = s7Var.f8089a;
        s7Var.m(new AdOverlayInfoParcel(wh0, kVar, pVar, t7Var, z10, i10, t7Var.c()));
    }

    public final void B0() {
        setBackgroundColor(0);
    }

    public final synchronized q7 C(String str) {
        Map<String, q7> map = this.f8324h0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final synchronized void C0() {
        if (this.C) {
            setLayerType(0, (Paint) null);
        }
        this.C = false;
    }

    public final synchronized void D(c8.a aVar) {
        this.f8333w = aVar;
    }

    public final Context D0() {
        return this.f8309a.f17465c;
    }

    public final synchronized void E(boolean z10) {
        a aVar = this.f8332v;
        if (aVar != null) {
            aVar.v6(this.f8331u.y(), z10);
        } else {
            this.f8336z = z10;
        }
    }

    public final synchronized String E0() {
        return this.f8335y;
    }

    public final void F(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("'");
        sb2.append(",");
        sb2.append(jSONObject2);
        sb2.append(");");
        String valueOf = String.valueOf(sb2.toString());
        e.E(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        N0(sb2.toString());
    }

    public final synchronized void F0() {
        Map<String, q7> map = this.f8324h0;
        if (map != null) {
            for (q7 a10 : map.values()) {
                a10.a();
            }
        }
        this.f8324h0 = null;
    }

    public final synchronized void G(a aVar) {
        this.f8332v = aVar;
    }

    public final synchronized void G0(a aVar) {
        this.f8310a0 = aVar;
    }

    public final /* synthetic */ uc H() {
        return this.f8331u;
    }

    public final synchronized void H0(boolean z10) {
        boolean z11 = z10 != this.B;
        this.B = z10;
        y0();
        if (z11) {
            if (!((Boolean) ti0.f16763j.f16769f.a(t.H)).booleanValue() || !this.f8334x.b()) {
                new gf0((t7) this).t(z10 ? "expanded" : "default");
            }
        }
    }

    public final void I() {
        e.H("Cannot add text view to inner AdWebView");
    }

    public final void I0() {
        k kVar;
        i iVar = this.R;
        if (iVar != null && (kVar = iVar.f6910b) != null && l.B.f13190g.e() != null) {
            l.B.f13190g.e().f6337a.offer(kVar);
        }
    }

    public final void J(boolean z10) {
        this.f8331u.f8099s = z10;
    }

    public final synchronized a K() {
        return this.f8332v;
    }

    public final void K0(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z10 ? "1" : "0");
        O("onAdVisibilityChanged", hashMap);
    }

    public final synchronized void L(boolean z10) {
        this.E = z10;
    }

    public final synchronized void L0(String str) {
        if (!f()) {
            loadUrl(str);
        } else {
            e.K("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void M(Context context) {
        this.f8309a.setBaseContext(context);
        this.f8314c0.f18251b = this.f8309a.f17463a;
    }

    public final synchronized void M0(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e10) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdWebViewImpl.loadUrlUnsafe");
            e.D("Could not call loadUrl. ", e10);
        }
    }

    public final synchronized c8.a N() {
        return this.f8333w;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        v0(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N0(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = z7.h.b()
            if (r0 == 0) goto L_0x0075
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.D     // Catch:{ all -> 0x0072 }
            monitor-exit(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0035
            monitor-enter(r3)
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x0032 }
            com.google.android.gms.internal.ads.y6 r0 = r0.f13190g     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r0.f8580a     // Catch:{ all -> 0x0032 }
            monitor-enter(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r0 = r0.f8587h     // Catch:{ all -> 0x002f }
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            r3.D = r0     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "(function(){})()"
            r3.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x0028 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x0028 }
            r3.v0(r0)     // Catch:{ IllegalStateException -> 0x0028 }
            monitor-exit(r3)
            goto L_0x0035
        L_0x0028:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0032 }
            r3.v0(r0)     // Catch:{ all -> 0x0032 }
        L_0x002d:
            monitor-exit(r3)
            goto L_0x0035
        L_0x002f:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r4     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0035:
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.D     // Catch:{ all -> 0x006f }
            monitor-exit(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0055
            monitor-enter(r3)
            boolean r0 = r3.f()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x004b
            r3.evaluateJavascript(r4, r1)     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            goto L_0x0051
        L_0x004b:
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            l0.e.K(r4)     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
        L_0x0051:
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0055:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0066
            java.lang.String r4 = r0.concat(r4)
            goto L_0x006b
        L_0x0066:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x006b:
            r3.L0(r4)
            return
        L_0x006f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0072:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0075:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0086
            java.lang.String r4 = r0.concat(r4)
            goto L_0x008b
        L_0x0086:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x008b:
            r3.L0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v7.N0(java.lang.String):void");
    }

    public final void O(String str, Map<String, ?> map) {
        try {
            F(str, l.B.f13186c.F(map));
        } catch (JSONException unused) {
            e.K("Could not convert parameters to JSON.");
        }
    }

    public final synchronized void O0() {
        if (!this.f8312b0) {
            this.f8312b0 = true;
            l.B.f13190g.f8588i.decrementAndGet();
        }
    }

    public final synchronized void P() {
        h hVar = this.f8317e;
        if (hVar != null) {
            hVar.P();
        }
    }

    public final void Q(boolean z10, int i10, String str) {
        zb zbVar;
        s7 s7Var = this.f8331u;
        boolean u10 = s7Var.f8089a.u();
        wh0 wh0 = (!u10 || s7Var.f8089a.j().b()) ? s7Var.f8093e : null;
        if (u10) {
            zbVar = null;
        } else {
            zbVar = new zb(s7Var.f8089a, s7Var.f8094f);
        }
        o1 o1Var = s7Var.f8097i;
        p1 p1Var = s7Var.f8098r;
        e7.p pVar = s7Var.f8103w;
        t7 t7Var = s7Var.f8089a;
        s7Var.m(new AdOverlayInfoParcel(wh0, zbVar, o1Var, p1Var, pVar, t7Var, z10, i10, str, t7Var.c()));
    }

    public final synchronized void R() {
        e.H("Destroying WebView!");
        O0();
        p.f5702i.post(new e7.e(this));
    }

    public final synchronized int S() {
        return this.S;
    }

    public final int T() {
        return getMeasuredWidth();
    }

    public final void U(c cVar) {
        this.f8331u.t(cVar);
    }

    public final void V() {
        if (this.Q == null) {
            j e10 = g.e(this.R.f6910b);
            this.Q = e10;
            this.R.f6909a.put("native:view_load", e10);
        }
    }

    public final void W() {
        g.b(this.R.f6910b, this.P, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f8315d.f14544a);
        O("onhide", hashMap);
    }

    public final boolean X(boolean z10, int i10) {
        destroy();
        this.f8327j0.a(new fc(z10, i10));
        this.f8327j0.b(ov.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    public final synchronized void Y() {
        l1 l1Var = this.K;
        if (l1Var != null) {
            sa saVar = (sa) l1Var;
            saVar.getClass();
            p.f5702i.post(new e7.e(saVar));
        }
    }

    public final synchronized a Z() {
        return this.f8310a0;
    }

    public final void a(String str) {
        N0(str);
    }

    public final Activity b() {
        return this.f8309a.f17463a;
    }

    public final synchronized eh0 b0() {
        return this.L;
    }

    public final f9 c() {
        return this.f8315d;
    }

    public final synchronized void c0(wc wcVar) {
        this.f8334x = wcVar;
        requestLayout();
    }

    public final synchronized void d(w7 w7Var) {
        if (this.G != null) {
            e.I("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.G = w7Var;
        }
    }

    public final synchronized void d0(int i10) {
        this.S = i10;
    }

    public final synchronized void destroy() {
        I0();
        a0 a0Var = this.f8314c0;
        a0Var.f18254e = false;
        a0Var.c();
        a aVar = this.f8332v;
        if (aVar != null) {
            aVar.s6();
            this.f8332v.onDestroy();
            this.f8332v = null;
        }
        this.f8333w = null;
        this.f8331u.a();
        if (!this.A) {
            bb bbVar = l.B.f13209z;
            bb.c(this);
            F0();
            this.A = true;
            e.H("Initiating WebView self destruct sequence in 3...");
            e.H("Loading blank page in WebView, 2...");
            M0("about:blank");
        }
    }

    public final void e(String str, f3<? super t7> f3Var) {
        s7 s7Var = this.f8331u;
        if (s7Var != null) {
            synchronized (s7Var.f8092d) {
                List list = s7Var.f8091c.get(str);
                if (list != null) {
                    list.remove(f3Var);
                }
            }
        }
    }

    public final synchronized void e0(boolean z10) {
        a aVar;
        int i10 = this.M + (z10 ? 1 : -1);
        this.M = i10;
        if (i10 <= 0 && (aVar = this.f8332v) != null) {
            synchronized (aVar.f5638w) {
                aVar.f5640y = true;
                Runnable runnable = aVar.f5639x;
                if (runnable != null) {
                    d40 d40 = p.f5702i;
                    d40.removeCallbacks(runnable);
                    d40.post(aVar.f5639x);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            r0 = 0
            l0.e.F(r2, r0)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r3.onReceiveValue(r0)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v7.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public final synchronized boolean f() {
        return this.A;
    }

    public final WebViewClient f0() {
        return this.f8331u;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.A) {
                    this.f8331u.a();
                    bb bbVar = l.B.f13209z;
                    bb.c(this);
                    F0();
                    O0();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final void g(f fVar, dt dtVar, oq oqVar, t20 t20, String str, String str2, int i10) {
        s7 s7Var = this.f8331u;
        t7 t7Var = s7Var.f8089a;
        s7Var.m(new AdOverlayInfoParcel(t7Var, t7Var.c(), fVar, dtVar, oqVar, t20, str, str2, i10));
    }

    public final synchronized String getRequestId() {
        return this.F;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final synchronized void h(String str, q7 q7Var) {
        if (this.f8324h0 == null) {
            this.f8324h0 = new HashMap();
        }
        this.f8324h0.put(str, q7Var);
    }

    public final void h0() {
        if (this.O == null) {
            g.b(this.R.f6910b, this.P, "aes2");
            j e10 = g.e(this.R.f6910b);
            this.O = e10;
            this.R.f6909a.put("native:view_show", e10);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f8315d.f14544a);
        O("onshow", hashMap);
    }

    public final i i() {
        return this.R;
    }

    public final synchronized boolean i0() {
        return this.E;
    }

    public final synchronized wc j() {
        return this.f8334x;
    }

    public final void j0() {
        a K2 = K();
        if (K2 != null) {
            K2.f5635t.f13639b = true;
        }
    }

    public final qe k() {
        return this.f8325i;
    }

    public final void k0(boolean z10, int i10, String str, String str2) {
        zb zbVar;
        s7 s7Var = this.f8331u;
        boolean u10 = s7Var.f8089a.u();
        wh0 wh0 = (!u10 || s7Var.f8089a.j().b()) ? s7Var.f8093e : null;
        if (u10) {
            zbVar = null;
        } else {
            zbVar = new zb(s7Var.f8089a, s7Var.f8094f);
        }
        o1 o1Var = s7Var.f8097i;
        p1 p1Var = s7Var.f8098r;
        e7.p pVar = s7Var.f8103w;
        t7 t7Var = s7Var.f8089a;
        s7Var.m(new AdOverlayInfoParcel(wh0, zbVar, o1Var, p1Var, pVar, t7Var, z10, i10, str, str2, t7Var.c()));
    }

    public final j l() {
        return this.P;
    }

    public final void l0(qe qeVar, re reVar) {
        this.f8325i = qeVar;
        this.f8328r = reVar;
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!f()) {
            super.loadData(str, str2, str3);
        } else {
            e.K("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!f()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            e.K("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!f()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e10) {
                y6 y6Var = l.B.f13190g;
                a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdWebViewImpl.loadUrl");
                e.D("Could not call loadUrl. ", e10);
            }
        } else {
            e.K("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void m(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder(o.a(jSONObject2, o.a(str, 3)));
        sb2.append(str);
        sb2.append("(");
        sb2.append(jSONObject2);
        sb2.append(");");
        N0(sb2.toString());
    }

    public final synchronized void m0(String str, String str2, String str3) {
        if (!f()) {
            String str4 = str;
            super.loadDataWithBaseURL(str4, oc.b(str2, oc.a()), "text/html", "UTF-8", str3);
            return;
        }
        e.K("#004 The webview is destroyed. Ignoring action.");
    }

    public final void n() {
        s7 s7Var = this.f8331u;
        if (s7Var != null) {
            s7Var.n();
        }
    }

    public final synchronized void n0(l1 l1Var) {
        this.K = l1Var;
    }

    public final synchronized w7 o() {
        return this.G;
    }

    public final synchronized m1 o0() {
        return this.J;
    }

    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = true;
        if (!f()) {
            a0 a0Var = this.f8314c0;
            a0Var.f18253d = true;
            if (a0Var.f18254e) {
                a0Var.b();
            }
        }
        boolean z11 = this.H;
        s7 s7Var = this.f8331u;
        if (s7Var == null || !s7Var.B()) {
            z10 = z11;
        } else {
            if (!this.I) {
                synchronized (this.f8331u.f8092d) {
                }
                synchronized (this.f8331u.f8092d) {
                }
                this.I = true;
            }
            x0();
        }
        K0(z10);
    }

    public final void onDetachedFromWindow() {
        s7 s7Var;
        synchronized (this) {
            if (!f()) {
                a0 a0Var = this.f8314c0;
                a0Var.f18253d = false;
                a0Var.c();
            }
            super.onDetachedFromWindow();
            if (this.I && (s7Var = this.f8331u) != null && s7Var.B() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                synchronized (this.f8331u.f8092d) {
                }
                synchronized (this.f8331u.f8092d) {
                }
                this.I = false;
            }
        }
        K0(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            p pVar = l.B.f13186c;
            p.e(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(o.a(str4, o.a(str, 51)));
            sb2.append("Couldn't find an Activity to view url/mimetype: ");
            sb2.append(str);
            sb2.append(" / ");
            sb2.append(str4);
            e.E(sb2.toString());
        }
    }

    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!f()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean x02 = x0();
        a K2 = K();
        if (K2 != null && x02 && K2.f5636u) {
            K2.f5636u = false;
            K2.f5627d.h0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01dd, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01bd A[SYNTHETIC, Splitter:B:123:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011f  */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f()     // Catch:{ all -> 0x01e3 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r9.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x000d:
            boolean r0 = r9.isInEditMode()     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x01de
            boolean r0 = r9.B     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x01de
            e8.wc r0 = r9.f8334x     // Catch:{ all -> 0x01e3 }
            int r2 = r0.f17237a     // Catch:{ all -> 0x01e3 }
            r3 = 1
            if (r2 != 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            goto L_0x01de
        L_0x0025:
            r4 = 5
            if (r2 != r4) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            if (r4 == 0) goto L_0x0032
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x0032:
            r4 = 4
            if (r2 != r4) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x0095
            e8.l<java.lang.Boolean> r0 = e8.t.P1     // Catch:{ all -> 0x01e3 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x01e3 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x01e3 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01e3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e3 }
            if (r0 == 0) goto L_0x0051
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x0051:
            com.google.android.gms.internal.ads.w7 r0 = r9.o()     // Catch:{ all -> 0x01e3 }
            r1 = 0
            if (r0 == 0) goto L_0x005d
            float r0 = r0.s1()     // Catch:{ all -> 0x01e3 }
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0067
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x0067:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e3 }
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01e3 }
            float r1 = (float) r11     // Catch:{ all -> 0x01e3 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01e3 }
            float r2 = (float) r10     // Catch:{ all -> 0x01e3 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01e3 }
            if (r11 != 0) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            float r11 = (float) r2     // Catch:{ all -> 0x01e3 }
            float r11 = r11 * r0
            int r1 = (int) r11     // Catch:{ all -> 0x01e3 }
            r11 = r2
            goto L_0x0088
        L_0x0080:
            if (r10 != 0) goto L_0x0088
            if (r1 == 0) goto L_0x0088
            float r10 = (float) r1     // Catch:{ all -> 0x01e3 }
            float r10 = r10 / r0
            int r2 = (int) r10     // Catch:{ all -> 0x01e3 }
            r10 = r1
        L_0x0088:
            int r10 = java.lang.Math.min(r1, r10)     // Catch:{ all -> 0x01e3 }
            int r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x01e3 }
            r9.setMeasuredDimension(r10, r11)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x0095:
            r5 = 2
            if (r2 != r5) goto L_0x009a
            r2 = 1
            goto L_0x009b
        L_0x009a:
            r2 = 0
        L_0x009b:
            if (r2 == 0) goto L_0x00e2
            e8.l<java.lang.Boolean> r0 = e8.t.R1     // Catch:{ all -> 0x01e3 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x01e3 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x01e3 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01e3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "/contentHeight"
            e8.l2 r1 = new e8.l2     // Catch:{ all -> 0x01e3 }
            r1.<init>((com.google.android.gms.internal.ads.v7) r9)     // Catch:{ all -> 0x01e3 }
            com.google.android.gms.internal.ads.s7 r2 = r9.f8331u     // Catch:{ all -> 0x01e3 }
            if (r2 == 0) goto L_0x00bd
            r2.r(r0, r1)     // Catch:{ all -> 0x01e3 }
        L_0x00bd:
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r9.N0(r0)     // Catch:{ all -> 0x01e3 }
            android.util.DisplayMetrics r0 = r9.f8321g     // Catch:{ all -> 0x01e3 }
            float r0 = r0.density     // Catch:{ all -> 0x01e3 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e3 }
            int r1 = r9.N     // Catch:{ all -> 0x01e3 }
            r2 = -1
            if (r1 == r2) goto L_0x00d4
            float r11 = (float) r1     // Catch:{ all -> 0x01e3 }
            float r11 = r11 * r0
            int r11 = (int) r11     // Catch:{ all -> 0x01e3 }
            goto L_0x00d8
        L_0x00d4:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01e3 }
        L_0x00d8:
            r9.setMeasuredDimension(r10, r11)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x00dd:
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x00e2:
            boolean r0 = r0.b()     // Catch:{ all -> 0x01e3 }
            if (r0 == 0) goto L_0x00f3
            android.util.DisplayMetrics r10 = r9.f8321g     // Catch:{ all -> 0x01e3 }
            int r11 = r10.widthPixels     // Catch:{ all -> 0x01e3 }
            int r10 = r10.heightPixels     // Catch:{ all -> 0x01e3 }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x00f3:
            int r0 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01e3 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e3 }
            int r2 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x01e3 }
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01e3 }
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r6) goto L_0x0113
            if (r0 != r5) goto L_0x010f
            goto L_0x0113
        L_0x010f:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0114
        L_0x0113:
            r0 = r10
        L_0x0114:
            if (r2 == r6) goto L_0x0118
            if (r2 != r5) goto L_0x0119
        L_0x0118:
            r7 = r11
        L_0x0119:
            e8.wc r2 = r9.f8334x     // Catch:{ all -> 0x01e3 }
            int r5 = r2.f17239c     // Catch:{ all -> 0x01e3 }
            if (r5 > r0) goto L_0x0126
            int r2 = r2.f17238b     // Catch:{ all -> 0x01e3 }
            if (r2 <= r7) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r2 = 0
            goto L_0x0127
        L_0x0126:
            r2 = 1
        L_0x0127:
            e8.l<java.lang.Boolean> r5 = e8.t.O2     // Catch:{ all -> 0x01e3 }
            e8.ti0 r6 = e8.ti0.f16763j     // Catch:{ all -> 0x01e3 }
            com.google.android.gms.internal.ads.e r6 = r6.f16769f     // Catch:{ all -> 0x01e3 }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ all -> 0x01e3 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x01e3 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x01e3 }
            if (r5 == 0) goto L_0x0157
            e8.wc r5 = r9.f8334x     // Catch:{ all -> 0x01e3 }
            int r6 = r5.f17239c     // Catch:{ all -> 0x01e3 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e3 }
            float r8 = r9.f8323h     // Catch:{ all -> 0x01e3 }
            float r6 = r6 / r8
            float r0 = (float) r0     // Catch:{ all -> 0x01e3 }
            float r0 = r0 / r8
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0153
            int r0 = r5.f17238b     // Catch:{ all -> 0x01e3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e3 }
            float r0 = r0 / r8
            float r5 = (float) r7     // Catch:{ all -> 0x01e3 }
            float r5 = r5 / r8
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0153
            r0 = 1
            goto L_0x0154
        L_0x0153:
            r0 = 0
        L_0x0154:
            if (r2 == 0) goto L_0x0157
            r2 = r0
        L_0x0157:
            r0 = 8
            if (r2 == 0) goto L_0x01bd
            e8.wc r2 = r9.f8334x     // Catch:{ all -> 0x01e3 }
            int r5 = r2.f17239c     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r6 = r9.f8323h     // Catch:{ all -> 0x01e3 }
            float r5 = r5 / r6
            int r5 = (int) r5     // Catch:{ all -> 0x01e3 }
            int r2 = r2.f17238b     // Catch:{ all -> 0x01e3 }
            float r2 = (float) r2     // Catch:{ all -> 0x01e3 }
            float r2 = r2 / r6
            int r2 = (int) r2     // Catch:{ all -> 0x01e3 }
            float r10 = (float) r10     // Catch:{ all -> 0x01e3 }
            float r10 = r10 / r6
            int r10 = (int) r10     // Catch:{ all -> 0x01e3 }
            float r11 = (float) r11     // Catch:{ all -> 0x01e3 }
            float r11 = r11 / r6
            int r11 = (int) r11     // Catch:{ all -> 0x01e3 }
            r6 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e3 }
            r7.<init>(r6)     // Catch:{ all -> 0x01e3 }
            java.lang.String r6 = "Not enough space to show ad. Needs "
            r7.append(r6)     // Catch:{ all -> 0x01e3 }
            r7.append(r5)     // Catch:{ all -> 0x01e3 }
            java.lang.String r5 = "x"
            r7.append(r5)     // Catch:{ all -> 0x01e3 }
            r7.append(r2)     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = " dp, but only has "
            r7.append(r2)     // Catch:{ all -> 0x01e3 }
            r7.append(r10)     // Catch:{ all -> 0x01e3 }
            java.lang.String r10 = "x"
            r7.append(r10)     // Catch:{ all -> 0x01e3 }
            r7.append(r11)     // Catch:{ all -> 0x01e3 }
            java.lang.String r10 = " dp."
            r7.append(r10)     // Catch:{ all -> 0x01e3 }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x01e3 }
            l0.e.K(r10)     // Catch:{ all -> 0x01e3 }
            int r10 = r9.getVisibility()     // Catch:{ all -> 0x01e3 }
            if (r10 == r0) goto L_0x01ab
            r9.setVisibility(r4)     // Catch:{ all -> 0x01e3 }
        L_0x01ab:
            r9.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e3 }
            boolean r10 = r9.f8329s     // Catch:{ all -> 0x01e3 }
            if (r10 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.nv r10 = r9.f8327j0     // Catch:{ all -> 0x01e3 }
            com.google.android.gms.internal.ads.ov r11 = com.google.android.gms.internal.ads.ov.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01e3 }
            r10.b(r11)     // Catch:{ all -> 0x01e3 }
            r9.f8329s = r3     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x01bd:
            int r10 = r9.getVisibility()     // Catch:{ all -> 0x01e3 }
            if (r10 == r0) goto L_0x01c6
            r9.setVisibility(r1)     // Catch:{ all -> 0x01e3 }
        L_0x01c6:
            boolean r10 = r9.f8330t     // Catch:{ all -> 0x01e3 }
            if (r10 != 0) goto L_0x01d3
            com.google.android.gms.internal.ads.nv r10 = r9.f8327j0     // Catch:{ all -> 0x01e3 }
            com.google.android.gms.internal.ads.ov r11 = com.google.android.gms.internal.ads.ov.BANNER_SIZE_VALID     // Catch:{ all -> 0x01e3 }
            r10.b(r11)     // Catch:{ all -> 0x01e3 }
            r9.f8330t = r3     // Catch:{ all -> 0x01e3 }
        L_0x01d3:
            e8.wc r10 = r9.f8334x     // Catch:{ all -> 0x01e3 }
            int r11 = r10.f17239c     // Catch:{ all -> 0x01e3 }
            int r10 = r10.f17238b     // Catch:{ all -> 0x01e3 }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01e3 }
        L_0x01dc:
            monitor-exit(r9)
            return
        L_0x01de:
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)
            return
        L_0x01e3:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v7.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!f()) {
            try {
                super.onPause();
            } catch (Exception e10) {
                e.C("Could not pause webview.", e10);
            }
        }
    }

    public final void onResume() {
        if (!f()) {
            try {
                super.onResume();
            } catch (Exception e10) {
                e.C("Could not resume webview.", e10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.s7 r0 = r6.f8331u
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.s7 r0 = r6.f8331u
            java.lang.Object r1 = r0.f8092d
            monitor-enter(r1)
            boolean r0 = r0.f8102v     // Catch:{ all -> 0x001f }
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0022
            monitor-enter(r6)
            e8.m1 r0 = r6.J     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            r0.a0(r7)     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r6)     // Catch:{ all -> 0x001c }
            goto L_0x0068
        L_0x001c:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x001c }
            throw r7
        L_0x001f:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r7
        L_0x0022:
            com.google.android.gms.internal.ads.tm r0 = r6.f8311b
            if (r0 == 0) goto L_0x002b
            e8.c40 r0 = r0.f8207b
            r0.f(r7)
        L_0x002b:
            e8.i0 r0 = r6.f8313c
            if (r0 == 0) goto L_0x0068
            r0.getClass()
            int r1 = r7.getAction()
            r2 = 1
            if (r1 != r2) goto L_0x004e
            long r1 = r7.getEventTime()
            android.view.MotionEvent r3 = r0.f14965a
            long r3 = r3.getEventTime()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r7)
            r0.f14965a = r1
            goto L_0x0068
        L_0x004e:
            int r1 = r7.getAction()
            if (r1 != 0) goto L_0x0068
            long r1 = r7.getEventTime()
            android.view.MotionEvent r3 = r0.f14966b
            long r3 = r3.getEventTime()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0068
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r7)
            r0.f14966b = r1
        L_0x0068:
            boolean r0 = r6.f()
            if (r0 == 0) goto L_0x0070
            r7 = 0
            return r7
        L_0x0070:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final re p() {
        return this.f8328r;
    }

    public final void p0() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(l.B.f13191h.c()));
        hashMap.put("app_volume", String.valueOf(l.B.f13191h.b()));
        hashMap.put("device_volume", String.valueOf(d.a(getContext())));
        O("volume", hashMap);
    }

    public final d7.a q() {
        return this.f8319f;
    }

    public final boolean q0() {
        return false;
    }

    public final void r(String str, f3<? super t7> f3Var) {
        s7 s7Var = this.f8331u;
        if (s7Var != null) {
            s7Var.r(str, f3Var);
        }
    }

    public final void r0(boolean z10, long j10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z10 ? "1" : "0");
        hashMap.put("duration", Long.toString(j10));
        O("onCacheAccessComplete", hashMap);
    }

    public final tm s() {
        return this.f8311b;
    }

    public final void s0(String str, ri riVar) {
        s7 s7Var = this.f8331u;
        if (s7Var != null) {
            synchronized (s7Var.f8092d) {
                List<f3> list = s7Var.f8091c.get(str);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (f3 f3Var : list) {
                        if ((f3Var instanceof k4) && ((k4) f3Var).f15235a.equals((f3) riVar.f8042b)) {
                            arrayList.add(f3Var);
                        }
                    }
                    list.removeAll(arrayList);
                }
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i10) {
        a aVar = this.f8332v;
        if (aVar != null) {
            aVar.t6(i10);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof s7) {
            this.f8331u = (s7) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!f()) {
            try {
                super.stopLoading();
            } catch (Exception e10) {
                e.C("Could not stop loading webview.", e10);
            }
        }
    }

    public final void t(vg0 vg0) {
        boolean z10;
        synchronized (this) {
            z10 = vg0.f17142j;
            this.H = z10;
        }
        K0(z10);
    }

    public final da t0() {
        return null;
    }

    public final synchronized boolean u() {
        return this.B;
    }

    public final synchronized boolean u0() {
        return this.f8336z;
    }

    public final synchronized void v() {
        h hVar = this.f8317e;
        if (hVar != null) {
            hVar.v();
        }
    }

    public final void v0(Boolean bool) {
        synchronized (this) {
            this.D = bool;
        }
        y6 y6Var = l.B.f13190g;
        synchronized (y6Var.f8580a) {
            y6Var.f8587h = bool;
        }
    }

    public final synchronized String w() {
        re reVar = this.f8328r;
        if (reVar == null) {
            return null;
        }
        return reVar.f8030b;
    }

    public final synchronized boolean w0() {
        return this.M > 0;
    }

    public final synchronized void x(eh0 eh0) {
        this.L = eh0;
    }

    public final boolean x0() {
        int i10;
        int i11;
        boolean z10 = false;
        if (!this.f8331u.y() && !this.f8331u.B()) {
            return false;
        }
        y8 y8Var = ti0.f16763j.f16764a;
        DisplayMetrics displayMetrics = this.f8321g;
        int c10 = y8.c(displayMetrics, displayMetrics.widthPixels);
        y8 y8Var2 = ti0.f16763j.f16764a;
        DisplayMetrics displayMetrics2 = this.f8321g;
        int c11 = y8.c(displayMetrics2, displayMetrics2.heightPixels);
        Activity activity = this.f8309a.f17463a;
        if (activity == null || activity.getWindow() == null) {
            i11 = c10;
            i10 = c11;
        } else {
            p pVar = l.B.f13186c;
            int[] B2 = p.B(activity);
            y8 y8Var3 = ti0.f16763j.f16764a;
            int c12 = y8.c(this.f8321g, B2[0]);
            y8 y8Var4 = ti0.f16763j.f16764a;
            i10 = y8.c(this.f8321g, B2[1]);
            i11 = c12;
        }
        int i12 = this.f8318e0;
        if (i12 == c10 && this.f8316d0 == c11 && this.f8320f0 == i11 && this.f8322g0 == i10) {
            return false;
        }
        if (!(i12 == c10 && this.f8316d0 == c11)) {
            z10 = true;
        }
        this.f8318e0 = c10;
        this.f8316d0 = c11;
        this.f8320f0 = i11;
        this.f8322g0 = i10;
        new gf0((t7) this).i(c10, c11, i11, i10, this.f8321g.density, this.f8326i0.getDefaultDisplay().getRotation());
        return z10;
    }

    public final int y() {
        return getMeasuredHeight();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void y0() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.B     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0035
            e8.wc r0 = r2.f8334x     // Catch:{ all -> 0x003f }
            boolean r0 = r0.b()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x000e
            goto L_0x0035
        L_0x000e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x003f }
            r1 = 18
            if (r0 >= r1) goto L_0x002b
            java.lang.String r0 = "Disabling hardware acceleration on an AdView."
            l0.e.E(r0)     // Catch:{ all -> 0x003f }
            monitor-enter(r2)     // Catch:{ all -> 0x003f }
            boolean r0 = r2.C     // Catch:{ all -> 0x0028 }
            r1 = 1
            if (r0 != 0) goto L_0x0023
            r0 = 0
            r2.setLayerType(r1, r0)     // Catch:{ all -> 0x0028 }
        L_0x0023:
            r2.C = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            monitor-exit(r2)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x002b:
            java.lang.String r0 = "Enabling hardware acceleration on an AdView."
            l0.e.E(r0)     // Catch:{ all -> 0x003f }
            r2.C0()     // Catch:{ all -> 0x003f }
            monitor-exit(r2)
            return
        L_0x0035:
            java.lang.String r0 = "Enabling hardware acceleration on an overlay."
            l0.e.E(r0)     // Catch:{ all -> 0x003f }
            r2.C0()     // Catch:{ all -> 0x003f }
            monitor-exit(r2)
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v7.y0():void");
    }

    public final void z(int i10) {
        if (i10 == 0) {
            g.b(this.R.f6910b, this.P, "aebb2");
        }
        g.b(this.R.f6910b, this.P, "aeh2");
        k kVar = this.R.f6910b;
        if (kVar != null) {
            kVar.b("close_type", String.valueOf(i10));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.f8315d.f14544a);
        O("onhide", hashMap);
    }

    public final void z0(boolean z10) {
        this.f8331u.E = z10;
    }
}
