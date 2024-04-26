package e8;

import com.google.android.gms.ads.internal.util.o;
import d7.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yp {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, JSONObject>> f17645a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f17646b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17647c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f17648d;

    public yp(Executor executor) {
        this.f17646b = executor;
    }

    public final synchronized void a() {
        Map map;
        this.f17647c = true;
        JSONObject jSONObject = ((o) l.B.f13190g.f()).j().f16861g;
        if (jSONObject != null) {
            this.f17648d = jSONObject.optJSONObject("ad_unit_patterns");
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("ad_unit_id");
                        String optString2 = optJSONObject.optString("format");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                        if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                            if (this.f17645a.containsKey(optString2)) {
                                map = this.f17645a.get(optString2);
                            } else {
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                this.f17645a.put(optString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(optString, optJSONObject2);
                        }
                    }
                }
            }
        }
    }
}
