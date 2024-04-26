package e8;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.t7;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kc extends nc {
    public kc(t7 t7Var, nv nvVar, boolean z10) {
        super(t7Var, nvVar, z10);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return S(webView, str, (Map<String, String>) null);
    }
}
