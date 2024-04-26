package e8;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.t7;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mc extends nc {
    public mc(t7 t7Var, nv nvVar, boolean z10) {
        super(t7Var, nvVar, z10);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return S(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
