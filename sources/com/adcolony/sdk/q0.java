package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.y0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.h;
import t2.f0;
import t2.h0;
import t2.l;
import t2.o1;
import t2.p1;

@SuppressLint({"SetJavaScriptEnabled"})
public class q0 extends WebView implements h0 {

    /* renamed from: d0  reason: collision with root package name */
    public static boolean f4714d0 = false;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public JSONArray P = new JSONArray();
    public JSONObject Q = new JSONObject();
    public JSONObject R = new JSONObject();
    public h S;

    /* renamed from: a  reason: collision with root package name */
    public String f4715a;

    /* renamed from: a0  reason: collision with root package name */
    public g f4716a0;

    /* renamed from: b  reason: collision with root package name */
    public String f4717b;

    /* renamed from: b0  reason: collision with root package name */
    public ImageView f4718b0;

    /* renamed from: c  reason: collision with root package name */
    public String f4719c = "";

    /* renamed from: c0  reason: collision with root package name */
    public final Object f4720c0 = new Object();

    /* renamed from: d  reason: collision with root package name */
    public String f4721d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f4722e;

    /* renamed from: f  reason: collision with root package name */
    public String f4723f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f4724g = "";

    /* renamed from: h  reason: collision with root package name */
    public String f4725h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f4726i = "";

    /* renamed from: r  reason: collision with root package name */
    public String f4727r = "";

    /* renamed from: s  reason: collision with root package name */
    public String f4728s = "";

    /* renamed from: t  reason: collision with root package name */
    public int f4729t;

    /* renamed from: u  reason: collision with root package name */
    public int f4730u;

    /* renamed from: v  reason: collision with root package name */
    public int f4731v;

    /* renamed from: w  reason: collision with root package name */
    public int f4732w;

    /* renamed from: x  reason: collision with root package name */
    public int f4733x;

    /* renamed from: y  reason: collision with root package name */
    public int f4734y;

    /* renamed from: z  reason: collision with root package name */
    public int f4735z;

    public class a implements f0 {

        /* renamed from: com.adcolony.sdk.q0$a$a  reason: collision with other inner class name */
        public class C0068a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4737a;

            public C0068a(g gVar) {
                this.f4737a = gVar;
            }

            public void run() {
                q0 q0Var = q0.this;
                g gVar = this.f4737a;
                q0Var.getClass();
                if (gVar.f4485b.optBoolean("visible")) {
                    q0Var.setVisibility(0);
                } else {
                    q0Var.setVisibility(4);
                }
                if (q0Var.H) {
                    JSONObject jSONObject = new JSONObject();
                    r0.k(jSONObject, "success", true);
                    r0.j(jSONObject, "id", q0Var.C);
                    gVar.a(jSONObject).b();
                }
            }
        }

        public a() {
        }

        public void a(g gVar) {
            if (q0.this.o(gVar)) {
                j0.h(new C0068a(gVar));
            }
        }
    }

    public class b implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4740a;

            public a(g gVar) {
                this.f4740a = gVar;
            }

            public void run() {
                q0.this.e(this.f4740a);
            }
        }

        public b() {
        }

        public void a(g gVar) {
            if (q0.this.o(gVar)) {
                j0.h(new a(gVar));
            }
        }
    }

    public class c implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4743a;

            public a(g gVar) {
                this.f4743a = gVar;
            }

            public void run() {
                q0.this.m(this.f4743a.f4485b.optString("custom_js"));
            }
        }

        public c() {
        }

        public void a(g gVar) {
            if (q0.this.o(gVar)) {
                j0.h(new a(gVar));
            }
        }
    }

    public class d implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4746a;

            public a(g gVar) {
                this.f4746a = gVar;
            }

            public void run() {
                q0 q0Var = q0.this;
                boolean optBoolean = this.f4746a.f4485b.optBoolean("transparent");
                boolean z10 = q0.f4714d0;
                q0Var.setBackgroundColor(optBoolean ? 0 : -1);
            }
        }

        public d() {
        }

        public void a(g gVar) {
            if (q0.this.o(gVar)) {
                j0.h(new a(gVar));
            }
        }
    }

    public class e {
        public e(o0 o0Var) {
        }

        @JavascriptInterface
        public void dispatch_messages(String str, String str2) {
            if (str2.equals(q0.this.f4728s)) {
                q0.k(q0.this, str);
            }
        }

        @JavascriptInterface
        public void enable_reverse_messaging(String str) {
            if (str.equals(q0.this.f4728s)) {
                q0.this.L = true;
            }
        }

        @JavascriptInterface
        public String pull_messages(String str) {
            if (!str.equals(q0.this.f4728s)) {
                return "[]";
            }
            String str2 = "[]";
            synchronized (q0.this.f4720c0) {
                if (q0.this.P.length() > 0) {
                    q0 q0Var = q0.this;
                    if (q0Var.G) {
                        str2 = q0Var.P.toString();
                    }
                    q0.this.P = new JSONArray();
                }
            }
            return str2;
        }

        @JavascriptInterface
        public void push_messages(String str, String str2) {
            if (str2.equals(q0.this.f4728s)) {
                q0.k(q0.this, str);
            }
        }
    }

    public class f extends WebChromeClient {
        public f(o0 o0Var) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            d dVar;
            String str;
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            i g10 = f.d().g();
            String message = consoleMessage.message();
            boolean z10 = message.contains("Viewport target-densitydpi is not supported.") || message.contains("Viewport argument key \"shrink-to-fit\" not recognized and ignored");
            boolean z11 = messageLevel == ConsoleMessage.MessageLevel.ERROR;
            boolean z12 = messageLevel == ConsoleMessage.MessageLevel.WARNING;
            if (message.contains("ADC3_update is not defined") || message.contains("NativeLayer.dispatch_messages is not a function")) {
                q0 q0Var = q0.this;
                q0.h(q0Var, q0Var.f4716a0.f4485b, "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
            }
            if (!z10 && (z12 || z11)) {
                String str2 = q0.this.f4722e;
                if (str2 == null) {
                    dVar = null;
                } else {
                    dVar = g10.f4526b.get(str2);
                }
                if (dVar == null) {
                    str = "unknown";
                } else {
                    str = dVar.f4467f;
                    if (str == null) {
                        str = "";
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onConsoleMessage: " + message + " with ad id: " + str);
                t0 t0Var = z11 ? t0.f4781f : t0.f4779d;
                f.d().l().e(0, t0Var.f4782a, sb2.toString(), t0Var.f4783b);
            }
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }
    }

    public class g extends WebViewClient {
        public g(o0 o0Var) {
        }

        public void onPageFinished(WebView webView, String str) {
            int i10;
            JSONObject jSONObject = new JSONObject();
            r0.j(jSONObject, "id", q0.this.f4729t);
            r0.e(jSONObject, "url", str);
            q0 q0Var = q0.this;
            if (q0Var.S == null) {
                new g("WebView.on_load", q0Var.C, jSONObject).b();
            } else {
                r0.e(jSONObject, "ad_session_id", q0Var.f4722e);
                r0.j(jSONObject, "container_id", q0.this.S.f4512r);
                new g("WebView.on_load", q0.this.S.f4513s, jSONObject).b();
            }
            q0 q0Var2 = q0.this;
            if ((q0Var2.G || q0Var2.H) && !q0Var2.J) {
                int i11 = q0Var2.D;
                if (i11 > 0) {
                    i10 = i11;
                } else {
                    i10 = q0Var2.C;
                }
                if (i11 > 0) {
                    float f10 = f.d().i().f();
                    r0.j(q0.this.Q, "app_orientation", j0.q(j0.t()));
                    q0 q0Var3 = q0.this;
                    r0.j(q0Var3.Q, "x", j0.b(q0Var3));
                    q0 q0Var4 = q0.this;
                    r0.j(q0Var4.Q, "y", j0.j(q0Var4));
                    q0 q0Var5 = q0.this;
                    r0.j(q0Var5.Q, "width", (int) (((float) q0Var5.f4734y) / f10));
                    q0 q0Var6 = q0.this;
                    r0.j(q0Var6.Q, "height", (int) (((float) q0Var6.A) / f10));
                    q0 q0Var7 = q0.this;
                    r0.e(q0Var7.Q, "ad_session_id", q0Var7.f4722e);
                }
                q0.this.f4728s = j0.d();
                JSONObject b10 = r0.b(new JSONObject(), q0.this.Q);
                r0.e(b10, "message_key", q0.this.f4728s);
                q0 q0Var8 = q0.this;
                StringBuilder a10 = y0.a("ADC3_init(", i10, ",");
                a10.append(b10.toString());
                a10.append(");");
                q0Var8.m(a10.toString());
                q0.this.J = true;
            }
            q0 q0Var9 = q0.this;
            if (!q0Var9.H) {
                return;
            }
            if (q0Var9.C != 1 || q0Var9.D > 0) {
                JSONObject jSONObject2 = new JSONObject();
                r0.k(jSONObject2, "success", true);
                r0.j(jSONObject2, "id", q0.this.C);
                q0.this.f4716a0.a(jSONObject2).b();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.this.J = false;
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                q0.g(q0.this, i10, str, str2);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (!renderProcessGoneDetail.didCrash()) {
                return true;
            }
            q0.h(q0.this, new JSONObject(), "An error occurred while rendering the ad. Ad closing.");
            return true;
        }

        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 21 && str.endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(q0.this.f4723f.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException unused) {
                    p.f.a(0, 0, t2.b.a("UTF-8 not supported."), true);
                }
            }
            return null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q0 q0Var = q0.this;
            if (!q0Var.J) {
                return false;
            }
            String s10 = q0Var.s();
            if (s10 != null) {
                str = s10;
            }
            j0.f(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            g0 r10 = f.d().r();
            r10.b(q0.this.f4722e);
            r10.d(q0.this.f4722e);
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "url", str);
            r0.e(jSONObject, "ad_session_id", q0.this.f4722e);
            new g("WebView.redirect_detected", q0.this.S.f4513s, jSONObject).b();
            return true;
        }
    }

    public q0(Context context, g gVar, int i10, int i11, h hVar) {
        super(context);
        this.f4716a0 = gVar;
        f(gVar, i10, i11, hVar);
        i(false, (g) null);
    }

    public static void g(q0 q0Var, int i10, String str, String str2) {
        if (q0Var.S != null) {
            JSONObject jSONObject = new JSONObject();
            r0.j(jSONObject, "id", q0Var.f4729t);
            r0.e(jSONObject, "ad_session_id", q0Var.f4722e);
            r0.j(jSONObject, "container_id", q0Var.S.f4512r);
            r0.j(jSONObject, "code", i10);
            r0.e(jSONObject, "error", str);
            r0.e(jSONObject, "url", str2);
            new g("WebView.on_error", q0Var.S.f4513s, jSONObject).b();
        }
        p.f.a(0, 0, j.f.a("onReceivedError: ", str), true);
    }

    public static void h(q0 q0Var, JSONObject jSONObject, String str) {
        q0Var.getClass();
        Context context = f.f4478a;
        if (context != null && (context instanceof l)) {
            f.d().g().getClass();
            g gVar = new g("AdSession.finish_fullscreen_ad", 0);
            r0.j(jSONObject, "status", 1);
            p.f.a(0, 0, t2.b.a(str), false);
            ((l) context).c(gVar);
        } else if (q0Var.C == 1) {
            f.d().l().e(0, 0, "Unable to communicate with controller, disabling AdColony.", false);
            a.e();
        } else if (q0Var.D > 0) {
            q0Var.G = false;
        }
    }

    public static void k(q0 q0Var, String str) {
        JSONArray jSONArray;
        q0Var.getClass();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e10) {
            f.d().l().e(0, 0, e10.toString(), true);
            jSONArray = new JSONArray();
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            l m10 = f.d().m();
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            m10.e(optJSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f4720c0) {
            this.P.put(jSONObject);
        }
    }

    public void b() {
    }

    public void c() {
        if (this.f4718b0 != null) {
            int h10 = f.d().i().h();
            int g10 = f.d().i().g();
            boolean z10 = this.O;
            if (z10) {
                h10 = this.f4730u + this.f4734y;
            }
            if (z10) {
                g10 = this.f4732w + this.A;
            }
            float f10 = f.d().i().f();
            int i10 = (int) (((float) this.E) * f10);
            int i11 = (int) (((float) this.F) * f10);
            this.f4718b0.setLayoutParams(new AbsoluteLayout.LayoutParams(i10, i11, h10 - i10, g10 - i11));
        }
    }

    public int d() {
        return this.C;
    }

    public void e(g gVar) {
        JSONObject jSONObject = gVar.f4485b;
        this.f4730u = jSONObject.optInt("x");
        this.f4732w = jSONObject.optInt("y");
        this.f4734y = jSONObject.optInt("width");
        this.A = jSONObject.optInt("height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f4730u, this.f4732w, 0, 0);
        layoutParams.width = this.f4734y;
        layoutParams.height = this.A;
        setLayoutParams(layoutParams);
        if (this.H) {
            JSONObject jSONObject2 = new JSONObject();
            r0.k(jSONObject2, "success", true);
            r0.j(jSONObject2, "id", this.C);
            gVar.a(jSONObject2).b();
        }
        c();
    }

    public void f(g gVar, int i10, int i11, h hVar) {
        JSONObject jSONObject = gVar.f4485b;
        String optString = jSONObject.optString("url");
        this.f4715a = optString;
        if (optString.equals("")) {
            this.f4715a = jSONObject.optString("data");
        }
        this.f4721d = jSONObject.optString("base_url");
        this.f4719c = jSONObject.optString("custom_js");
        this.f4722e = jSONObject.optString("ad_session_id");
        JSONObject optJSONObject = jSONObject.optJSONObject("info");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.Q = optJSONObject;
        this.f4724g = jSONObject.optString("mraid_filepath");
        this.D = jSONObject.optBoolean("use_mraid_module") ? f.d().m().f() : this.D;
        this.f4725h = jSONObject.optString("ad_choices_filepath");
        this.f4726i = jSONObject.optString("ad_choices_url");
        this.N = jSONObject.optBoolean("disable_ad_choices");
        this.O = jSONObject.optBoolean("ad_choices_snap_to_webview");
        this.E = jSONObject.optInt("ad_choices_width");
        this.F = jSONObject.optInt("ad_choices_height");
        if (this.R.length() == 0) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("iab");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            this.R = optJSONObject2;
        }
        boolean z10 = false;
        if (!this.I && !this.f4724g.equals("")) {
            if (this.D > 0) {
                this.f4715a = d(this.f4715a.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", androidx.activity.e.a(android.support.v4.media.a.a("script src=\"file://"), this.f4724g, "\"")), r0.n(this.Q, "device_info").optString("iab_filepath"));
            } else {
                try {
                    this.f4723f = f.d().k().a(this.f4724g, false).toString();
                    this.f4723f = this.f4723f.replaceFirst("bridge.os_name\\s*=\\s*\"\"\\s*;", "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.Q.toString() + ";\n");
                } catch (IOException e10) {
                    l(e10);
                } catch (IllegalArgumentException e11) {
                    l(e11);
                } catch (IndexOutOfBoundsException e12) {
                    l(e12);
                }
            }
        }
        this.f4729t = i10;
        this.S = hVar;
        if (i11 >= 0) {
            this.C = i11;
        } else {
            p();
        }
        this.f4734y = jSONObject.optInt("width");
        this.A = jSONObject.optInt("height");
        this.f4730u = jSONObject.optInt("x");
        int optInt = jSONObject.optInt("y");
        this.f4732w = optInt;
        this.f4735z = this.f4734y;
        this.B = this.A;
        this.f4733x = optInt;
        this.f4731v = this.f4730u;
        if (jSONObject.optBoolean("enable_messages") || this.H) {
            z10 = true;
        }
        this.G = z10;
        q();
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void i(boolean z10, g gVar) {
        WebViewClient webViewClient;
        String str;
        String str2;
        this.H = z10;
        g gVar2 = this.f4716a0;
        if (gVar2 != null) {
            gVar = gVar2;
        }
        this.f4716a0 = gVar;
        JSONObject jSONObject = gVar.f4485b;
        this.I = jSONObject.optBoolean("is_display_module");
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        if (z10) {
            this.G = true;
            String optString = jSONObject.optString("filepath");
            this.f4727r = jSONObject.optString("interstitial_html");
            this.f4724g = jSONObject.optString("mraid_filepath");
            this.f4721d = jSONObject.optString("base_url");
            JSONObject optJSONObject = jSONObject.optJSONObject("iab");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            this.R = optJSONObject;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("info");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            this.Q = optJSONObject2;
            this.f4722e = jSONObject.optString("ad_session_id");
            this.f4717b = optString;
            if (f4714d0 && this.C == 1) {
                this.f4717b = "android_asset/ADCController.js";
            }
            if (this.f4727r.equals("")) {
                StringBuilder a10 = android.support.v4.media.a.a("file:///");
                a10.append(this.f4717b);
                str2 = a10.toString();
            } else {
                str2 = "";
            }
            this.f4715a = str2;
        }
        setWebChromeClient(new f((o0) null));
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setGeolocationEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        addJavascriptInterface(new e((o0) null), "NativeLayer");
        if (i10 >= 23) {
            webViewClient = new o0(this);
        } else if (i10 >= 21) {
            webViewClient = new p0(this);
        } else {
            webViewClient = new g((o0) null);
        }
        setWebViewClient(webViewClient);
        if (this.I) {
            try {
                if (this.f4727r.equals("")) {
                    FileInputStream fileInputStream = new FileInputStream(this.f4717b);
                    StringBuilder sb2 = new StringBuilder(fileInputStream.available());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        sb2.append(new String(bArr, 0, read));
                    }
                    if (this.f4717b.contains(".html")) {
                        str = sb2.toString();
                    } else {
                        str = "<html><script>" + sb2.toString() + "</script></html>";
                    }
                } else {
                    str = this.f4727r.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", "script src=\"file://" + this.f4724g + "\"");
                }
                String optString2 = r0.n(this.f4716a0.f4485b, "info").optString("metadata");
                loadDataWithBaseURL(this.f4715a.equals("") ? this.f4721d : this.f4715a, d(str, r0.a(optString2, (String) null).optString("iab_filepath")).replaceFirst("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;", Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + optString2 + ";")), "text/html", (String) null, (String) null);
            } catch (IOException e10) {
                j(e10);
            } catch (IllegalArgumentException e11) {
                j(e11);
            } catch (IndexOutOfBoundsException e12) {
                j(e12);
            }
        } else if (!this.f4715a.startsWith("http") && !this.f4715a.startsWith("file")) {
            loadDataWithBaseURL(this.f4721d, this.f4715a, "text/html", (String) null, (String) null);
        } else if (this.f4715a.contains(".html") || !this.f4715a.startsWith("file")) {
            loadUrl(this.f4715a);
        } else {
            loadDataWithBaseURL(this.f4715a, androidx.activity.e.a(android.support.v4.media.a.a("<html><script src=\""), this.f4715a, "\"></script></html>"), "text/html", (String) null, (String) null);
        }
        if (!z10) {
            p();
            u();
        }
        if (z10 || this.G) {
            l m10 = f.d().m();
            synchronized (m10.f4599a) {
                int n10 = n();
                if (n10 <= 0) {
                    n10 = d();
                }
                m10.f4599a.add(this);
                m10.f4600b.put(Integer.valueOf(n10), this);
            }
        }
        if (!this.f4719c.equals("")) {
            m(this.f4719c);
        }
    }

    public final boolean j(Exception exc) {
        f.d().l().e(0, 0, exc.getClass().toString() + " during metadata injection w/ metadata = " + this.Q.optString("metadata"), true);
        d remove = f.d().g().f4526b.remove(this.Q.optString("ad_session_id"));
        if (remove == null || remove.f4462a == null) {
            return false;
        }
        remove.f4470i = true;
        return true;
    }

    public final void l(Exception exc) {
        f.d().l().e(0, 0, exc.getClass().toString() + " during metadata injection w/ metadata = " + this.Q.optString("metadata"), true);
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "id", this.f4722e);
        new g("AdSession.on_error", this.S.f4513s, jSONObject).b();
    }

    public void m(String str) {
        if (this.K) {
            p.f.a(0, 3, t2.b.a("Ignoring call to execute_js as WebView has been destroyed."), true);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                f.d().l().e(0, 0, j.f.a("Device reporting incorrect OS version, evaluateJavascript ", "is not available. Disabling AdColony."), false);
                a.e();
            }
        } else {
            loadUrl("javascript:" + str);
        }
    }

    public int n() {
        return this.D;
    }

    public boolean o(g gVar) {
        JSONObject jSONObject = gVar.f4485b;
        return jSONObject.optInt("id") == this.f4729t && jSONObject.optInt("container_id") == this.S.f4512r && jSONObject.optString("ad_session_id").equals(this.S.f4514t);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        b r10;
        if (motionEvent.getAction() == 1 && (r10 = r()) != null && !r10.getUserInteraction()) {
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "ad_session_id", this.f4722e);
            new g("WebView.on_first_click", 1, jSONObject).b();
            r10.setUserInteraction(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        ArrayList<f0> arrayList = this.S.A;
        a aVar = new a();
        f.a("WebView.set_visible", aVar);
        arrayList.add(aVar);
        ArrayList<f0> arrayList2 = this.S.A;
        b bVar = new b();
        f.a("WebView.set_bounds", bVar);
        arrayList2.add(bVar);
        ArrayList<f0> arrayList3 = this.S.A;
        c cVar = new c();
        f.a("WebView.execute_js", cVar);
        arrayList3.add(cVar);
        ArrayList<f0> arrayList4 = this.S.A;
        d dVar = new d();
        f.a("WebView.set_transparent", dVar);
        arrayList4.add(dVar);
        this.S.B.add("WebView.set_visible");
        this.S.B.add("WebView.set_bounds");
        this.S.B.add("WebView.execute_js");
        this.S.B.add("WebView.set_transparent");
    }

    public void q() {
        i g10 = f.d().g();
        String str = this.f4722e;
        h hVar = this.S;
        g10.getClass();
        j0.h(new k(g10, str, this, hVar));
    }

    public final b r() {
        if (this.f4722e == null) {
            return null;
        }
        return f.d().g().f4528d.get(this.f4722e);
    }

    public String s() {
        boolean z10 = false;
        String str = (!(t() != null) || t() == null) ? null : t().f4469h;
        if (str != null && !str.equals((Object) null)) {
            return str;
        }
        if (r() != null) {
            z10 = true;
        }
        return (!z10 || r() == null) ? str : r().getClickOverride();
    }

    public final d t() {
        if (this.f4722e == null) {
            return null;
        }
        return f.d().g().f4526b.get(this.f4722e);
    }

    public void u() {
        Context context;
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f4734y, this.A);
        layoutParams.setMargins(this.f4730u, this.f4732w, 0, 0);
        layoutParams.gravity = 0;
        this.S.addView(this, layoutParams);
        if (!this.f4725h.equals("") && !this.f4726i.equals("") && (context = f.f4478a) != null && this.S != null && !this.N) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            ImageView imageView = new ImageView(context);
            this.f4718b0 = imageView;
            imageView.setImageURI(Uri.fromFile(new File(this.f4725h)));
            this.f4718b0.setBackground(gradientDrawable);
            this.f4718b0.setOnClickListener(new o1(this));
            c();
            addView(this.f4718b0);
        }
    }

    public final String d(String str, String str2) {
        r rVar;
        i g10 = f.d().g();
        d t10 = t();
        t2.f fVar = g10.f4527c.get(this.f4722e);
        if (t10 != null && this.R.length() > 0 && !this.R.optString("ad_type").equals("video")) {
            JSONObject jSONObject = this.R;
            if (jSONObject.length() > 0) {
                t10.f4464c = new r(jSONObject, t10.f4466e);
            }
        } else if (fVar != null && this.R.length() > 0) {
            fVar.f25473c = new r(this.R, this.f4722e);
        }
        if (t10 == null) {
            rVar = null;
        } else {
            rVar = t10.f4464c;
        }
        if (rVar == null && fVar != null) {
            rVar = fVar.f25473c;
        }
        if (rVar != null && rVar.f4755e == 2) {
            this.M = true;
            if (!str2.equals("")) {
                try {
                    return h.d(f.d().k().a(str2, false).toString(), str);
                } catch (IOException e10) {
                    j(e10);
                }
            }
        }
        return str;
    }

    public void a() {
        if (f.e() && this.J && !this.L) {
            j0.h(new p1(this));
        }
    }

    public q0(Context context, int i10, boolean z10) {
        super(context);
        this.C = i10;
        this.I = z10;
    }
}
