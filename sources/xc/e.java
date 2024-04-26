package xc;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import java.util.List;
import ud.u;

/* compiled from: PlayerActivity.kt */
public final class e extends WebViewClient {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f27931d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f27932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<String> f27933b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u<String> f27934c;

    public e(PlayerActivity playerActivity, List<String> list, u<String> uVar) {
        this.f27932a = playerActivity;
        this.f27933b = list;
        this.f27934c = uVar;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f27932a.M(false);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        PlayerActivity.O(this.f27932a, R.string.error_message);
        this.f27932a.M(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0 != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1 != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        ud.k.f(ud.k.j("find url: ", r7.getUrl()), "msg");
        r0 = r5.f27932a;
        r0.runOnUiThread(new f0.i(r0, r7));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r6, android.webkit.WebResourceRequest r7) {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 21
            if (r0 < r2) goto L_0x0077
            java.util.List<java.lang.String> r0 = r5.f27933b
            int r0 = r0.size()
            r2 = 2
            r3 = 0
            if (r0 >= r2) goto L_0x003c
            if (r7 != 0) goto L_0x0014
            goto L_0x0039
        L_0x0014:
            android.net.Uri r0 = r7.getUrl()
            if (r0 != 0) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r0 = r0.getPath()
            if (r0 != 0) goto L_0x0022
            goto L_0x0039
        L_0x0022:
            java.lang.String r2 = "^.*\\.(mpd|m3u8|mp4|mkv)$"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r4 = "compile(pattern)"
            ud.k.e(r2, r4)
            java.util.regex.Matcher r0 = r2.matcher(r0)
            boolean r0 = r0.find()
            if (r0 != r1) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 != 0) goto L_0x005d
        L_0x003c:
            if (r7 != 0) goto L_0x003f
            goto L_0x005a
        L_0x003f:
            android.net.Uri r0 = r7.getUrl()
            if (r0 != 0) goto L_0x0046
            goto L_0x005a
        L_0x0046:
            java.lang.String r0 = r0.getPath()
            if (r0 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            ud.u<java.lang.String> r2 = r5.f27934c
            T r2 = r2.f26197a
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = ce.k.i(r0, r2, r1)
            if (r0 != r1) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r1 == 0) goto L_0x0081
        L_0x005d:
            android.net.Uri r0 = r7.getUrl()
            java.lang.String r1 = "find url: "
            java.lang.String r0 = ud.k.j(r1, r0)
            java.lang.String r1 = "msg"
            ud.k.f(r0, r1)
            dev.pankaj.ytvclib.ui.main.PlayerActivity r0 = r5.f27932a
            f0.i r1 = new f0.i
            r1.<init>((dev.pankaj.ytvclib.ui.main.PlayerActivity) r0, (android.webkit.WebResourceRequest) r7)
            r0.runOnUiThread(r1)
            goto L_0x0081
        L_0x0077:
            dev.pankaj.ytvclib.ui.main.PlayerActivity r0 = r5.f27932a
            xc.c r2 = new xc.c
            r2.<init>(r0, r1)
            r0.runOnUiThread(r2)
        L_0x0081:
            android.webkit.WebResourceResponse r6 = super.shouldInterceptRequest(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.e.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }
}
