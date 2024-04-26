package e8;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class yn implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17642a;

    /* renamed from: b  reason: collision with root package name */
    public final ia f17643b;

    public yn(ia iaVar, int i10) {
        this.f17642a = i10;
        if (i10 != 1) {
            this.f17643b = iaVar;
        } else {
            this.f17643b = iaVar;
        }
    }

    public final void f(Object obj, Map map) {
        switch (this.f17642a) {
            case 0:
                t7 t7Var = (t7) obj;
                this.f17643b.f7056b.b("sendMessageToNativeJs", map);
                return;
            default:
                t7 t7Var2 = (t7) obj;
                ((s7) t7Var2.H()).f8095g = new gf0(this.f17643b, map);
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    t7Var2.loadData(str, "text/html", "UTF-8");
                    return;
                } else {
                    t7Var2.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
                    return;
                }
        }
    }
}
