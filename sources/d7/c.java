package d7;

import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.yh;
import e8.p50;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class c implements oh {

    /* renamed from: a  reason: collision with root package name */
    public static final oh f13164a = new c();

    public final p50 a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            ((o) l.B.f13190g.f()).u(jSONObject.getString("appSettingsJson"));
        }
        return yh.h(null);
    }
}
