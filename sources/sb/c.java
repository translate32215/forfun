package sb;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mb.g;
import mb.h;
import org.json.JSONObject;
import rb.b;

public class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public WebView f25199f;

    /* renamed from: g  reason: collision with root package name */
    public Long f25200g = null;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, g> f25201h;

    /* renamed from: i  reason: collision with root package name */
    public final String f25202i;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public WebView f25203a;

        public a(c cVar) {
            this.f25203a = cVar.f25199f;
        }

        public void run() {
            this.f25203a.destroy();
        }
    }

    public c(Map<String, g> map, String str) {
        this.f25201h = map;
        this.f25202i = str;
    }

    public void a() {
        WebView webView = new WebView(ob.c.f23663b.f23664a);
        this.f25199f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f25190a = new b(this.f25199f);
        WebView webView2 = this.f25199f;
        String str = this.f25202i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String next : this.f25201h.keySet()) {
            String externalForm = this.f25201h.get(next).f21776b.toExternalForm();
            WebView webView3 = this.f25199f;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f25200g = Long.valueOf(System.nanoTime());
    }

    public void c(h hVar, com.google.android.material.datepicker.c cVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((Map) cVar.f9151d);
        for (String str : unmodifiableMap.keySet()) {
            qb.a.d(jSONObject, str, (g) unmodifiableMap.get(str));
        }
        d(hVar, cVar, jSONObject);
    }

    public void e() {
        long j10;
        this.f25190a.clear();
        if (this.f25200g == null) {
            j10 = 4000;
        } else {
            j10 = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f25200g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(this), Math.max(4000 - j10, 2000));
        this.f25199f = null;
    }
}
