package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d7.l;
import e7.c;
import e7.k;
import e7.p;
import e8.b6;
import e8.dt;
import e8.e30;
import e8.f3;
import e8.gb;
import e8.h3;
import e8.h6;
import e8.h8;
import e8.h9;
import e8.hb;
import e8.i;
import e8.i3;
import e8.k3;
import e8.k9;
import e8.kh0;
import e8.l2;
import e8.mr;
import e8.n2;
import e8.n8;
import e8.o60;
import e8.oq;
import e8.p2;
import e8.q2;
import e8.r0;
import e8.r2;
import e8.s2;
import e8.sp;
import e8.t;
import e8.t2;
import e8.t20;
import e8.t50;
import e8.tc;
import e8.ti0;
import e8.u2;
import e8.uc;
import e8.vc;
import e8.vn;
import e8.w2;
import e8.wh0;
import e8.yb;
import f7.h0;
import f7.j;
import f7.j0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import o0.c0;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class s7 extends WebViewClient implements uc {
    public static final /* synthetic */ int H = 0;
    public h8 A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final HashSet<String> F;
    public View.OnAttachStateChangeListener G;

    /* renamed from: a  reason: collision with root package name */
    public t7 f8089a;

    /* renamed from: b  reason: collision with root package name */
    public final nv f8090b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, List<f3<? super t7>>> f8091c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final Object f8092d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public wh0 f8093e;

    /* renamed from: f  reason: collision with root package name */
    public k f8094f;

    /* renamed from: g  reason: collision with root package name */
    public tc f8095g;

    /* renamed from: h  reason: collision with root package name */
    public vc f8096h;

    /* renamed from: i  reason: collision with root package name */
    public o1 f8097i;

    /* renamed from: r  reason: collision with root package name */
    public p1 f8098r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8099s = false;
    @GuardedBy("lock")

    /* renamed from: t  reason: collision with root package name */
    public boolean f8100t;
    @GuardedBy("lock")

    /* renamed from: u  reason: collision with root package name */
    public boolean f8101u;
    @GuardedBy("lock")

    /* renamed from: v  reason: collision with root package name */
    public boolean f8102v;

    /* renamed from: w  reason: collision with root package name */
    public p f8103w;

    /* renamed from: x  reason: collision with root package name */
    public final h6 f8104x;

    /* renamed from: y  reason: collision with root package name */
    public a f8105y;

    /* renamed from: z  reason: collision with root package name */
    public b6 f8106z;

    public s7(t7 t7Var, nv nvVar, boolean z10) {
        h6 h6Var = new h6(t7Var, t7Var.D0(), new i(t7Var.getContext()));
        this.f8090b = nvVar;
        this.f8089a = t7Var;
        this.f8100t = z10;
        this.f8104x = h6Var;
        this.f8106z = null;
        this.F = new HashSet<>(Arrays.asList(((String) ti0.f16763j.f16769f.a(t.Y2)).split(",")));
    }

    public static WebResourceResponse J() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16615m0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final boolean B() {
        boolean z10;
        synchronized (this.f8092d) {
            z10 = this.f8101u;
        }
        return z10;
    }

    public final void C() {
        h8 h8Var = this.A;
        if (h8Var != null) {
            WebView webView = this.f8089a.getWebView();
            if (c0.q(webView)) {
                l(webView, h8Var, 10);
                return;
            }
            if (this.G != null) {
                this.f8089a.getView().removeOnAttachStateChangeListener(this.G);
            }
            this.G = new yb(this, h8Var);
            this.f8089a.getView().addOnAttachStateChangeListener(this.G);
        }
    }

    public final void F() {
        if (this.f8095g != null && ((this.B && this.D <= 0) || this.C)) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue() && this.f8089a.i() != null) {
                g.b(this.f8089a.i().f6910b, this.f8089a.l(), "awfllc");
            }
            this.f8095g.d(true ^ this.C);
            this.f8095g = null;
        }
        this.f8089a.V();
    }

    public final WebResourceResponse O(String str, Map<String, String> map) {
        hv c10;
        try {
            String c11 = n8.c(str, this.f8089a.getContext(), this.E);
            if (!c11.equals(str)) {
                return P(c11, map);
            }
            kh0 i10 = kh0.i(Uri.parse(str));
            if (i10 != null && (c10 = l.B.f13192i.c(i10)) != null && c10.i()) {
                return new WebResourceResponse("", "", c10.j());
            }
            if (!b7.a() || !((Boolean) r0.f16221b.b()).booleanValue()) {
                return null;
            }
            return P(str, map);
        } catch (Exception e10) {
            e = e10;
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(e, "AdWebViewClient.interceptRequest");
            return J();
        } catch (NoClassDefFoundError e11) {
            e = e11;
            y6 y6Var2 = l.B.f13190g;
            a5.d(y6Var2.f8584e, y6Var2.f8585f).c(e, "AdWebViewClient.interceptRequest");
            return J();
        }
    }

    public final WebResourceResponse P(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry next : map.entrySet()) {
                        openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        l.B.f13186c.f(this.f8089a.getContext(), this.f8089a.c().f14544a, httpURLConnection, 60000);
                        b7 b7Var = new b7((String) null);
                        b7Var.e(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        b7Var.d(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            com.google.android.gms.ads.internal.util.p pVar = l.B.f13186c;
                            WebResourceResponse w10 = com.google.android.gms.ads.internal.util.p.w(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    e.K("Protocol is null");
                                    WebResourceResponse J = J();
                                    TrafficStats.clearThreadStatsTag();
                                    return J;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    e.E(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    e.K(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                                    return J();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.util.p pVar2 = l.B.f13186c;
            WebResourceResponse w102 = com.google.android.gms.ads.internal.util.p.w(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return w102;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [e8.t50, java.util.concurrent.Future, com.google.android.gms.internal.ads.gh, java.lang.Runnable] */
    public final void Q(Uri uri) {
        String path = uri.getPath();
        List list = this.f8091c.get(path);
        if (path == null || list == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("No GMSG handler found for GMSG: ");
            sb2.append(valueOf);
            e.H(sb2.toString());
            if (((Boolean) ti0.f16763j.f16769f.a(t.X3)).booleanValue() && l.B.f13190g.e() != null) {
                ((k9) h9.f14881a).f15244a.execute(new j(path));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) ti0.f16763j.f16769f.a(t.X2)).booleanValue() && this.F.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) ti0.f16763j.f16769f.a(t.Z2)).intValue()) {
                e.H(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                com.google.android.gms.ads.internal.util.p pVar = l.B.f13186c;
                h0 h0Var = new h0(uri);
                Executor executor = pVar.f5710h;
                ? t50 = new t50(h0Var);
                executor.execute(t50);
                t50.a(new j0((Future) t50, (zh) new mr(this, list, path, uri)), h9.f14885e);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.p pVar2 = l.B.f13186c;
        w(com.google.android.gms.ads.internal.util.p.C(uri), list, path);
    }

    public final void a() {
        h8 h8Var = this.A;
        if (h8Var != null) {
            h8Var.e();
            this.A = null;
        }
        if (this.G != null) {
            this.f8089a.getView().removeOnAttachStateChangeListener(this.G);
        }
        synchronized (this.f8092d) {
            this.f8091c.clear();
            this.f8093e = null;
            this.f8094f = null;
            this.f8095g = null;
            this.f8096h = null;
            this.f8097i = null;
            this.f8098r = null;
            this.f8099s = false;
            this.f8100t = false;
            this.f8101u = false;
            this.f8103w = null;
            b6 b6Var = this.f8106z;
            if (b6Var != null) {
                b6Var.u(true);
                this.f8106z = null;
            }
        }
    }

    public final void g(int i10, int i11, boolean z10) {
        this.f8104x.u(i10, i11);
        b6 b6Var = this.f8106z;
        if (b6Var != null) {
            synchronized (b6Var.f13888t) {
                b6Var.f13882f = i10;
                b6Var.f13883g = i11;
            }
        }
    }

    public final void l(View view, h8 h8Var, int i10) {
        if (h8Var.a() && i10 > 0) {
            h8Var.g(view);
            if (h8Var.a()) {
                com.google.android.gms.ads.internal.util.p.f5702i.postDelayed(new gb(this, view, h8Var, i10), 100);
            }
        }
    }

    public final void m(AdOverlayInfoParcel adOverlayInfoParcel) {
        c cVar;
        b6 b6Var = this.f8106z;
        boolean z10 = false;
        if (b6Var != null) {
            synchronized (b6Var.f13888t) {
                if (b6Var.A != null) {
                    z10 = true;
                }
            }
        }
        z3.i iVar = l.B.f13185b;
        z3.i.b(this.f8089a.getContext(), adOverlayInfoParcel, true ^ z10);
        h8 h8Var = this.A;
        if (h8Var != null) {
            String str = adOverlayInfoParcel.f5618t;
            if (str == null && (cVar = adOverlayInfoParcel.f5607a) != null) {
                str = cVar.f13629b;
            }
            h8Var.b(str);
        }
    }

    public void n() {
        wh0 wh0 = this.f8093e;
        if (wh0 != null) {
            wh0.n();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        e.H(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            Q(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.c();
        r0.f8096h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.B = true;
        r1 = r0.f8096h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f8092d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.t7 r2 = r0.f8089a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.f()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            l0.e.H(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.t7 r2 = r0.f8089a     // Catch:{ all -> 0x0029 }
            r2.R()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.B = r1
            e8.vc r1 = r0.f8096h
            if (r1 == 0) goto L_0x0025
            r1.c()
            r1 = 0
            r0.f8096h = r1
        L_0x0025:
            r0.F()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s7.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f8089a.X(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final void r(String str, f3<? super t7> f3Var) {
        synchronized (this.f8092d) {
            List list = this.f8091c.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f8091c.put(str, list);
            }
            list.add(f3Var);
        }
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return O(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        e.H(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f8099s && webView == this.f8089a.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    wh0 wh0 = this.f8093e;
                    if (wh0 != null) {
                        wh0.n();
                        h8 h8Var = this.A;
                        if (h8Var != null) {
                            h8Var.b(str);
                        }
                        this.f8093e = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f8089a.getWebView().willNotDraw()) {
                try {
                    tm s10 = this.f8089a.s();
                    if (s10 != null && s10.c(parse)) {
                        parse = s10.a(parse, this.f8089a.getContext(), this.f8089a.getView(), this.f8089a.b());
                    }
                } catch (o60 unused) {
                    String valueOf2 = String.valueOf(str);
                    e.K(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                a aVar = this.f8105y;
                if (aVar == null || aVar.c()) {
                    t(new c("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.f8105y.a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                e.K(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            Q(parse);
        }
        return true;
    }

    public final void t(c cVar) {
        k kVar;
        boolean u10 = this.f8089a.u();
        wh0 wh0 = (!u10 || this.f8089a.j().b()) ? this.f8093e : null;
        if (u10) {
            kVar = null;
        } else {
            kVar = this.f8094f;
        }
        m(new AdOverlayInfoParcel(cVar, wh0, kVar, this.f8103w, this.f8089a.c()));
    }

    public final void v(wh0 wh0, o1 o1Var, k kVar, p1 p1Var, p pVar, boolean z10, h3 h3Var, a aVar, g2 g2Var, h8 h8Var, dt dtVar, e30 e30, oq oqVar, t20 t20) {
        o1 o1Var2 = o1Var;
        p1 p1Var2 = p1Var;
        g2 g2Var2 = g2Var;
        h8 h8Var2 = h8Var;
        dt dtVar2 = dtVar;
        e30 e302 = e30;
        a aVar2 = aVar == null ? new a(this.f8089a.getContext(), h8Var2) : aVar;
        this.f8106z = new b6(this.f8089a, g2Var2);
        this.A = h8Var2;
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16657t0)).booleanValue()) {
            r("/adMetadata", new l2(o1Var));
        }
        r("/appEvent", new n2(p1Var2));
        r("/backButton", q2.f16071k);
        r("/refresh", q2.f16072l);
        f3<t7> f3Var = q2.f16061a;
        r("/canOpenApp", s2.f16368a);
        r("/canOpenURLs", p2.f15864a);
        r("/canOpenIntents", r2.f16224a);
        r("/close", q2.f16065e);
        r("/customClose", q2.f16066f);
        r("/instrument", q2.f16075o);
        r("/delayPageLoaded", q2.f16077q);
        r("/delayPageClosed", q2.f16078r);
        r("/getLocationInfo", q2.f16079s);
        r("/log", q2.f16068h);
        r("/mraid", new k3(aVar2, this.f8106z, g2Var2));
        r("/mraidLoaded", this.f8104x);
        r("/open", new i3(aVar2, this.f8106z, dtVar, oqVar, t20));
        r("/precache", new hb());
        r("/touch", w2.f17204a);
        r("/video", q2.f16073m);
        r("/videoMeta", q2.f16074n);
        if (dtVar2 == null || e302 == null) {
            r("/click", u2.f16841a);
            r("/httpTrack", t2.f16703a);
        } else {
            r("/click", new vn(e302, dtVar2));
            r("/httpTrack", new sp(e302, dtVar2));
        }
        if (l.B.f13207x.p(this.f8089a.getContext())) {
            r("/logScionEvent", new l2(this.f8089a.getContext()));
        }
        this.f8093e = wh0;
        this.f8094f = kVar;
        this.f8097i = o1Var2;
        this.f8098r = p1Var2;
        this.f8103w = pVar;
        this.f8105y = aVar2;
        this.f8099s = z10;
    }

    public final void w(Map<String, String> map, List<f3<? super t7>> list, String str) {
        if (e.O()) {
            String valueOf = String.valueOf(str);
            e.H(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb2 = new StringBuilder(o.a(str2, o.a(next, 4)));
                sb2.append("  ");
                sb2.append(next);
                sb2.append(": ");
                sb2.append(str2);
                e.H(sb2.toString());
            }
        }
        for (f3<? super t7> f10 : list) {
            f10.f(this.f8089a, map);
        }
    }

    public final boolean y() {
        boolean z10;
        synchronized (this.f8092d) {
            z10 = this.f8100t;
        }
        return z10;
    }
}
