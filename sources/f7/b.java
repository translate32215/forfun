package f7;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import e8.mc;
import java.io.InputStream;
import java.util.Map;
import l0.e;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class b extends o0 {
    public final WebResourceResponse e(String str, String str2, int i10, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    public final s7 f(t7 t7Var, nv nvVar, boolean z10) {
        return new mc(t7Var, nvVar, z10);
    }

    public final CookieManager l(Context context) {
        if (m0.p()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            e.C("Failed to obtain CookieManager.", th);
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final int q() {
        return 16974374;
    }
}
