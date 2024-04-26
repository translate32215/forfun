package e8;

import com.google.android.gms.ads.internal.util.i;
import java.util.Iterator;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qy implements by<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16213a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f16214b;

    public qy(JSONObject jSONObject, int i10) {
        this.f16213a = i10;
        if (i10 != 1) {
            this.f16214b = jSONObject;
        } else {
            this.f16214b = jSONObject;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        switch (this.f16213a) {
            case 0:
                try {
                    JSONObject j10 = i.j((JSONObject) obj, "content_info");
                    JSONObject jSONObject = this.f16214b;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        j10.put(next, jSONObject.get(next));
                    }
                    return;
                } catch (JSONException unused) {
                    e.H("Failed putting app indexing json.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("cache_state", this.f16214b);
                    return;
                } catch (JSONException unused2) {
                    e.H("Unable to get cache_state");
                    return;
                }
        }
    }
}
