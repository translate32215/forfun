package e8;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.tm;
import e8.lc;
import e8.qc;
import e8.rc;
import l0.e;
import r7.m;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jc<WebViewT extends lc & qc & rc> {

    /* renamed from: a  reason: collision with root package name */
    public final ic f15133a;

    /* renamed from: b  reason: collision with root package name */
    public final WebViewT f15134b;

    public jc(WebViewT webviewt, ic icVar) {
        this.f15133a = icVar;
        this.f15134b = webviewt;
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            e.H("Click string is empty, not proceeding.");
            return "";
        }
        tm s10 = ((qc) this.f15134b).s();
        if (s10 == null) {
            e.H("Signal utils is empty, ignoring.");
            return "";
        }
        c40 c40 = s10.f8207b;
        if (c40 == null) {
            e.H("Signals object is empty, ignoring.");
            return "";
        } else if (this.f15134b.getContext() != null) {
            return c40.g(this.f15134b.getContext(), str, ((rc) this.f15134b).getView(), this.f15134b.b());
        } else {
            e.H("Context is null, ignoring.");
            return "";
        }
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            e.K("URL is empty, ignoring message");
        } else {
            p.f5702i.post(new m(this, str));
        }
    }
}
