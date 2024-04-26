package e8;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.ou;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;
import r7.h;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zg0 implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f17747a;

    public zg0(h hVar) {
        this.f17747a = hVar;
    }

    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        h hVar = this.f17747a;
        su suVar = (su) hVar.f24704f;
        ou ouVar = (ou) hVar.f24701c;
        WebView webView = (WebView) hVar.f24702d;
        boolean z10 = hVar.f24703e;
        suVar.getClass();
        synchronized (ouVar.f7742g) {
            ouVar.f7748m--;
        }
        try {
            boolean z11 = true;
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (suVar.f8165v || TextUtils.isEmpty(webView.getTitle())) {
                    ouVar.b(optString, z10, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(optString);
                    ouVar.b(sb2.toString(), z10, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            synchronized (ouVar.f7742g) {
                if (ouVar.f7748m != 0) {
                    z11 = false;
                }
            }
            if (z11) {
                suVar.f8155d.a(ouVar);
            }
        } catch (JSONException unused) {
            e.E("Json string may be malformed.");
        } catch (Throwable th) {
            e.A("Failed to get webview content.", th);
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
