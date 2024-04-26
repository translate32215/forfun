package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class a7 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10057a;

    /* renamed from: b  reason: collision with root package name */
    public final com.startapp.sdk.adsbase.e f10058b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f10059c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f10060d;

    /* renamed from: e  reason: collision with root package name */
    public String f10061e;

    /* renamed from: f  reason: collision with root package name */
    public String f10062f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10063g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10064h = false;

    /* renamed from: i  reason: collision with root package name */
    public long f10065i;

    /* renamed from: j  reason: collision with root package name */
    public final long f10066j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10067k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f10068l;

    /* renamed from: m  reason: collision with root package name */
    public String f10069m;

    /* renamed from: n  reason: collision with root package name */
    public Runnable f10070n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10071o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10072p = false;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashMap<String, Float> f10073q = new LinkedHashMap<>();

    /* renamed from: r  reason: collision with root package name */
    public long f10074r;

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f10075s = new a();

    /* renamed from: t  reason: collision with root package name */
    public final Runnable f10076t = new b();

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f10077u = new c();

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f10078v = new d();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            a7 a7Var = a7.this;
            a7Var.f10059c.execute(a7Var.f10076t);
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a7 a7Var = a7.this;
            if (!a7Var.f10063g) {
                try {
                    i4 i4Var = new i4(j4.f10588e);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed smart redirect hop info: ");
                    sb2.append(a7Var.f10072p ? "Page Finished" : "Timeout");
                    i4Var.f10537d = sb2.toString();
                    i4Var.f10539f = a7Var.b();
                    i4Var.f10540g = a7Var.f10062f;
                    i4Var.a();
                } catch (Throwable th) {
                    i4.a(th);
                }
                try {
                    a7Var.f10071o = true;
                    com.startapp.sdk.adsbase.a.b(a7Var.f10057a);
                    a7Var.a();
                    if (!a7Var.f10067k || !MetaData.f12393k.R()) {
                        com.startapp.sdk.adsbase.a.b(a7Var.f10057a, a7Var.f10061e, a7Var.f10062f);
                    } else {
                        com.startapp.sdk.adsbase.a.a(a7Var.f10057a, a7Var.f10061e, a7Var.f10062f);
                    }
                    Runnable runnable = a7Var.f10070n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th2) {
                    i4.a(th2);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            a7 a7Var = a7.this;
            a7Var.f10059c.execute(a7Var.f10078v);
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            a7 a7Var = a7.this;
            if (!a7Var.f10071o && !a7Var.f10063g) {
                try {
                    a7Var.f10063g = true;
                    com.startapp.sdk.adsbase.a.b(a7Var.f10057a);
                    if (!a7Var.f10067k || !MetaData.f12393k.R()) {
                        com.startapp.sdk.adsbase.a.b(a7Var.f10057a, a7Var.f10061e, a7Var.f10062f);
                    } else {
                        com.startapp.sdk.adsbase.a.a(a7Var.f10057a, a7Var.f10061e, a7Var.f10062f);
                    }
                    Runnable runnable = a7Var.f10070n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10083a;

        public e(String str) {
            this.f10083a = str;
        }

        public void run() {
            a7 a7Var = a7.this;
            String str = this.f10083a;
            if (!a7Var.f10064h) {
                a7Var.f10074r = System.currentTimeMillis();
                a7Var.f10073q.put(str, Float.valueOf(-1.0f));
                a7Var.f10060d.postDelayed(a7Var.f10075s, a7Var.f10065i);
                a7Var.f10064h = true;
            }
            a7Var.f10072p = false;
            a7Var.a();
        }
    }

    /* compiled from: Sta */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10085a;

        public f(String str) {
            this.f10085a = str;
        }

        public void run() {
            a7 a7Var = a7.this;
            String str = this.f10085a;
            a7Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            a7Var.f10074r = currentTimeMillis;
            a7Var.f10073q.put(a7Var.f10061e, Float.valueOf(((float) (currentTimeMillis - a7Var.f10074r)) / 1000.0f));
            a7Var.f10073q.put(str, Float.valueOf(-1.0f));
            a7Var.f10061e = str;
        }
    }

    /* compiled from: Sta */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10087a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f10088b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f10089c;

        public g(String str, boolean z10, String str2) {
            this.f10087a = str;
            this.f10088b = z10;
            this.f10089c = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008e A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ all -> 0x00df }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                com.startapp.a7 r0 = com.startapp.a7.this
                java.lang.String r1 = r8.f10087a
                boolean r2 = r8.f10088b
                java.lang.String r3 = r8.f10089c
                r0.getClass()
                boolean r4 = r0.f10071o     // Catch:{ all -> 0x00df }
                if (r4 != 0) goto L_0x00e3
                r4 = 1
                r0.f10063g = r4     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f10057a     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.a.b((android.content.Context) r5)     // Catch:{ all -> 0x00df }
                r0.a()     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f10057a     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x001f
                r1 = r3
            L_0x001f:
                r2 = 0
                com.startapp.sdk.adsbase.a.b(r5, r1, r2)     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r0.f10069m     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0073
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                java.lang.String r1 = r0.f10061e     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f10069m     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x00df }
                boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                com.startapp.i4 r1 = new com.startapp.i4     // Catch:{ all -> 0x00df }
                com.startapp.j4 r2 = com.startapp.j4.f10588e     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.j4) r2)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "Wrong package reached"
                r1.f10537d = r2     // Catch:{ all -> 0x00df }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
                r2.<init>()     // Catch:{ all -> 0x00df }
                java.lang.String r3 = "Expected: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f10069m     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = ", Link: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f10061e     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
                r1.f10538e = r2     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f10062f     // Catch:{ all -> 0x00df }
                r1.f10540g = r2     // Catch:{ all -> 0x00df }
                r1.a()     // Catch:{ all -> 0x00df }
                goto L_0x00d7
            L_0x0073:
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                boolean r1 = r1.j()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "firstSucceededSmartRedirect"
                r3 = 0
                if (r1 == 0) goto L_0x0089
                com.startapp.sdk.adsbase.e r1 = r0.f10058b     // Catch:{ all -> 0x00df }
                boolean r1 = r1.getBoolean(r2, r4)     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r4 = 0
            L_0x008a:
                java.lang.Boolean r1 = r0.f10068l     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0097
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                float r1 = r1.i()     // Catch:{ all -> 0x00df }
                goto L_0x00a1
            L_0x0097:
                boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x00a0
                r1 = 1120403456(0x42c80000, float:100.0)
                goto L_0x00a1
            L_0x00a0:
                r1 = 0
            L_0x00a1:
                if (r4 != 0) goto L_0x00b0
                double r4 = java.lang.Math.random()     // Catch:{ all -> 0x00df }
                r6 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r4 = r4 * r6
                double r6 = (double) r1     // Catch:{ all -> 0x00df }
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 >= 0) goto L_0x00d7
            L_0x00b0:
                com.startapp.i4 r1 = new com.startapp.i4     // Catch:{ all -> 0x00df }
                com.startapp.j4 r4 = com.startapp.j4.f10597n     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.j4) r4)     // Catch:{ all -> 0x00df }
                org.json.JSONArray r4 = r0.b()     // Catch:{ all -> 0x00df }
                r1.f10539f = r4     // Catch:{ all -> 0x00df }
                java.lang.String r4 = r0.f10062f     // Catch:{ all -> 0x00df }
                r1.f10540g = r4     // Catch:{ all -> 0x00df }
                r1.a()     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e r1 = r0.f10058b     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e$a r1 = r1.edit()     // Catch:{ all -> 0x00df }
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00df }
                r1.a((java.lang.String) r2, r4)     // Catch:{ all -> 0x00df }
                android.content.SharedPreferences$Editor r4 = r1.f12335a     // Catch:{ all -> 0x00df }
                r4.putBoolean(r2, r3)     // Catch:{ all -> 0x00df }
                r1.apply()     // Catch:{ all -> 0x00df }
            L_0x00d7:
                java.lang.Runnable r0 = r0.f10070n     // Catch:{ all -> 0x00df }
                if (r0 == 0) goto L_0x00e3
                r0.run()     // Catch:{ all -> 0x00df }
                goto L_0x00e3
            L_0x00df:
                r0 = move-exception
                com.startapp.i4.a((java.lang.Throwable) r0)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.a7.g.run():void");
        }
    }

    /* compiled from: Sta */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10091a;

        public h(String str) {
            this.f10091a = str;
        }

        public void run() {
            a7 a7Var = a7.this;
            String str = this.f10091a;
            if (!a7Var.f10063g && !a7Var.f10071o && a7Var.f10061e.equals(str) && !com.startapp.sdk.adsbase.a.b(str)) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    a7Var.f10072p = true;
                    a7Var.a(str);
                    synchronized (a7Var.f10060d) {
                        a7Var.f10060d.removeCallbacks(a7Var.f10077u);
                        a7Var.f10060d.postDelayed(a7Var.f10077u, a7Var.f10066j);
                    }
                }
            }
        }
    }

    public a7(Context context, com.startapp.sdk.adsbase.e eVar, Executor executor, Handler handler, long j10, long j11, boolean z10, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f10057a = context;
        this.f10058b = eVar;
        this.f10059c = new q9(executor);
        this.f10060d = handler;
        this.f10065i = j10;
        this.f10066j = j11;
        this.f10067k = z10;
        this.f10068l = bool;
        this.f10061e = str;
        this.f10069m = str2;
        this.f10062f = str3;
        this.f10070n = runnable;
    }

    public void a() {
        synchronized (this.f10060d) {
            this.f10060d.removeCallbacks(this.f10077u);
        }
    }

    public JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : this.f10073q.entrySet()) {
            String str = (String) next.getKey();
            Float f10 = (Float) next.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                a(str);
                jSONObject.put("time", String.valueOf(f10));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f10059c.execute(new h(str));
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f10059c.execute(new e(str));
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        a();
        if (str2 != null && !com.startapp.sdk.adsbase.a.b(str2) && com.startapp.sdk.adsbase.a.c(str2)) {
            i4 i4Var = new i4(j4.f10588e);
            i4Var.f10537d = o2.a("Failed smart redirect: ", i10);
            i4Var.f10538e = str2;
            i4Var.f10540g = this.f10062f;
            i4Var.a();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!(webView == null || str == null)) {
            this.f10059c.execute(new f(str));
            if (wb.b(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean b10 = com.startapp.sdk.adsbase.a.b(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!b10 && !startsWith) {
                return false;
            }
            this.f10059c.execute(new g(str, startsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a(String str) {
        Float f10 = this.f10073q.get(str);
        if (f10 == null || f10.floatValue() < 0.0f) {
            this.f10073q.put(str, Float.valueOf(((float) (System.currentTimeMillis() - this.f10074r)) / 1000.0f));
        }
    }
}
