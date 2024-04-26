package ad;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PkAdBanner.kt */
public final class g extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f269a;

    public g(f fVar) {
        this.f269a = fVar;
    }

    public void onPageFinished(WebView webView, String str) {
        this.f269a.a(webView);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Context context;
        if (str == null || webView == null || (context = webView.getContext()) == null) {
            return true;
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
