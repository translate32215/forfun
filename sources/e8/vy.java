package e8;

import com.google.android.gms.ads.internal.util.i;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vy implements by<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public String f17176a;

    /* renamed from: b  reason: collision with root package name */
    public String f17177b;

    public vy(String str, String str2) {
        this.f17176a = str;
        this.f17177b = str2;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject j10 = i.j((JSONObject) obj, "pii");
            j10.put("doritos", this.f17176a);
            j10.put("doritos_v2", this.f17177b);
        } catch (JSONException unused) {
            e.H("Failed putting doritos string.");
        }
    }
}
