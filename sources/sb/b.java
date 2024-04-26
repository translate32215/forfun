package sb;

import android.annotation.SuppressLint;
import android.webkit.WebView;

public class b extends a {
    @SuppressLint({"SetJavaScriptEnabled"})
    public b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f25190a = new rb.b(webView);
    }
}
