package ob;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kb.b;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static e f23667a = new e();

    public void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            b(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        b(webView, "publishMediaEvent", str);
    }

    public void b(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb2.append('\"');
                    } else {
                        if (obj instanceof String) {
                            String obj2 = obj.toString();
                            if (obj2.startsWith("{")) {
                                sb2.append(obj2);
                            } else {
                                sb2.append('\"');
                                sb2.append(obj2);
                            }
                        } else {
                            sb2.append(obj);
                        }
                        sb2.append(",");
                    }
                    sb2.append('\"');
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb3);
            } else {
                handler.post(new d(this, webView, sb3));
            }
        } else {
            int i10 = b.f20580a;
        }
    }
}
