package ob;

import android.webkit.WebView;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f23665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23666b;

    public d(e eVar, WebView webView, String str) {
        this.f23665a = webView;
        this.f23666b = str;
    }

    public void run() {
        this.f23665a.loadUrl(this.f23666b);
    }
}
