package e8;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.mg;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class f5 implements mg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14532a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14533b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14534c;

    public f5(ld ldVar, Uri uri) {
        this.f14533b = ldVar;
        this.f14534c = uri;
    }

    public final Object apply(Object obj) {
        switch (this.f14532a) {
            case 0:
                u4 u4Var = (u4) obj;
                u4Var.e((String) this.f14533b, (f3) this.f14534c);
                return u4Var;
            case 1:
                no noVar = (no) this.f14533b;
                JSONObject jSONObject = (JSONObject) this.f14534c;
                List list = (List) obj;
                noVar.getClass();
                Integer num = null;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String optString = jSONObject.optString("text");
                Integer d10 = no.d(jSONObject, "bg_color");
                Integer d11 = no.d(jSONObject, "text_color");
                int optInt = jSONObject.optInt("text_size", -1);
                boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
                int optInt2 = jSONObject.optInt("animation_ms", 1000);
                int optInt3 = jSONObject.optInt("presentation_ms", 4000);
                if (optInt > 0) {
                    num = Integer.valueOf(optInt);
                }
                return new k1(optString, list, d10, d11, num, optInt3 + optInt2, noVar.f15705h.f15575e, optBoolean);
            default:
                Uri uri = (Uri) this.f14534c;
                String str = (String) obj;
                List<String> list2 = ld.f7364s;
                return !TextUtils.isEmpty(str) ? ld.s6(uri, "nas", str) : uri;
        }
    }

    public f5(no noVar, JSONObject jSONObject) {
        this.f14533b = noVar;
        this.f14534c = jSONObject;
    }

    public f5(String str, f3 f3Var) {
        this.f14533b = str;
        this.f14534c = f3Var;
    }
}
