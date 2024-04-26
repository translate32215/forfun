package com.startapp;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Sta */
public class zd extends xb.a {

    /* renamed from: f  reason: collision with root package name */
    public WebView f12934f;

    /* renamed from: g  reason: collision with root package name */
    public Long f12935g = null;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, hc> f12936h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12937i;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WebView f12938a;

        public a(zd zdVar) {
            this.f12938a = zdVar.f12934f;
        }

        public void run() {
            this.f12938a.destroy();
        }
    }

    public zd(Map<String, hc> map, String str) {
        this.f12936h = map;
        this.f12937i = str;
    }

    public void a(rd rdVar, p pVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, hc> unmodifiableMap = Collections.unmodifiableMap(pVar.f11547d);
        for (String next : unmodifiableMap.keySet()) {
            de.a(jSONObject, next, unmodifiableMap.get(next));
        }
        a(rdVar, pVar, jSONObject);
    }

    public void b() {
        long j10;
        this.f27916a.clear();
        if (this.f12935g == null) {
            j10 = 4000;
        } else {
            j10 = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f12935g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(this), Math.max(4000 - j10, 2000));
        this.f12934f = null;
    }

    public void d() {
        WebView webView = new WebView(me.f10890b.f10891a);
        this.f12934f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f27916a = new fe(this.f12934f);
        WebView webView2 = this.f12934f;
        String str = this.f12937i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String next : this.f12936h.keySet()) {
            String externalForm = this.f12936h.get(next).f10508b.toExternalForm();
            WebView webView3 = this.f12934f;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f12935g = Long.valueOf(System.nanoTime());
    }
}
