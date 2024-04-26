package db;

import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.b;
import eb.g;
import org.json.JSONObject;
import z7.a;

public final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f13229a;

    public /* synthetic */ h(g gVar) {
        this.f13229a = gVar;
    }

    public final void a(Object obj, Object obj2) {
        JSONObject optJSONObject;
        g gVar = this.f13229a;
        String str = (String) obj;
        b bVar = (b) obj2;
        ja.a aVar = (ja.a) gVar.f17831a.get();
        if (aVar != null) {
            JSONObject jSONObject = bVar.f9781e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = bVar.f9778b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (gVar.f17832b) {
                            if (!optString.equals(gVar.f17832b.get(str))) {
                                gVar.f17832b.put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.w0("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.w0("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
