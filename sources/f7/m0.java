package f7;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.y6;
import com.google.android.gms.internal.ads.yw;
import d7.l;
import e8.kc;
import java.io.InputStream;
import java.util.Map;
import l0.e;
import q.a;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class m0 {
    public m0(a aVar) {
    }

    public static boolean p() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public String a(Context context) {
        throw null;
    }

    public boolean b(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int c(ContentResolver contentResolver) {
        throw null;
    }

    public Drawable d(Context context, Bitmap bitmap, boolean z10, float f10) {
        throw null;
    }

    public WebResourceResponse e(String str, String str2, int i10, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public s7 f(t7 t7Var, nv nvVar, boolean z10) {
        return new kc(t7Var, nvVar, z10);
    }

    public yw g(Context context, TelephonyManager telephonyManager) {
        return yw.ENUM_UNKNOWN;
    }

    public boolean h(Activity activity, Configuration configuration) {
        return false;
    }

    public boolean i(Context context, WebSettings webSettings) {
        throw null;
    }

    public int j(ContentResolver contentResolver) {
        throw null;
    }

    public void k(Context context) {
        throw null;
    }

    public CookieManager l(Context context) {
        if (p()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            e.C("Failed to obtain CookieManager.", th);
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public void m(Activity activity) {
    }

    public int n() {
        return 5;
    }

    public ViewGroup.LayoutParams o() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int q() {
        return 1;
    }

    public long r() {
        return -1;
    }
}
