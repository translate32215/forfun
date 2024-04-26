package e8;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.o;
import d7.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jv {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, lv> f15196a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Map<String, List<lv>>> f15197b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f15198c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f15199d;

    public jv(Executor executor) {
        this.f15198c = executor;
    }

    public final synchronized void a() {
        JSONArray optJSONArray;
        JSONObject jSONObject = ((o) l.B.f13190g.f()).j().f16861g;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                this.f15199d = jSONObject.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i10);
                        String optString = jSONObject2.optString("ad_unit_id", "");
                        String optString2 = jSONObject2.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                        if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("ad_networks")) == null)) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject3 != null) {
                                    JSONObject optJSONObject2 = jSONObject3.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys = optJSONObject2.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            bundle.putString(next, optJSONObject2.optString(next, ""));
                                        }
                                    }
                                    JSONArray optJSONArray3 = jSONObject3.optJSONArray("rtb_adapters");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                                            String optString3 = optJSONArray3.optString(i12, "");
                                            if (!TextUtils.isEmpty(optString3)) {
                                                arrayList3.add(optString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        int i13 = 0;
                                        while (i13 < size) {
                                            Object obj = arrayList3.get(i13);
                                            i13++;
                                            String str = (String) obj;
                                            b(str);
                                            if (this.f15196a.get(str) != null) {
                                                arrayList2.add(new lv(str, optString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(optString2)) {
                            if (!TextUtils.isEmpty(optString)) {
                                Map map = this.f15197b.get(optString2);
                                if (map == null) {
                                    map = new ConcurrentHashMap();
                                }
                                this.f15197b.put(optString2, map);
                                List list = (List) map.get(optString);
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                list.addAll(arrayList);
                                map.put(optString, list);
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                e.v("Malformed config loading JSON.", e10);
            }
        }
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str) && !this.f15196a.containsKey(str)) {
            this.f15196a.put(str, new lv(str, "", new Bundle()));
        }
    }
}
