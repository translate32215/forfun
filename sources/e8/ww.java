package e8;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zd;
import d7.l;
import java.util.List;
import java.util.Map;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ww implements by {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17409a = 2;

    /* renamed from: b  reason: collision with root package name */
    public Object f17410b;

    public ww(Bundle bundle) {
        this.f17410b = bundle;
    }

    public final void a(Object obj) {
        switch (this.f17409a) {
            case 0:
                ((Bundle) obj).putString("key_schema", ((zd) ((iw) this.f17410b).f15074b).f8696a);
                return;
            case 1:
                ((Bundle) obj).putString("rewarded_sku_package", ((bx) this.f17410b).f14069b.getPackageName());
                return;
            case 2:
                ((Bundle) obj).putBundle("shared_pref", (Bundle) this.f17410b);
                return;
            case 3:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f17410b));
                    return;
                } catch (JSONException unused) {
                    e.H("Failed putting experiment ids.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", l.B.f13186c.F((Map) this.f17410b));
                    return;
                } catch (JSONException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    e.H(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
                    return;
                }
        }
    }

    public ww(iw iwVar) {
        this.f17410b = iwVar;
    }

    public ww(bx bxVar) {
        this.f17410b = bxVar;
    }

    public ww(List list) {
        this.f17410b = list;
    }

    public ww(Map map) {
        this.f17410b = map;
    }
}
