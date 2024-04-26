package com.google.android.gms.ads;

import e8.oi0;
import e8.zh0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final oi0 f5582a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5583b;

    public c(oi0 oi0) {
        this.f5582a = oi0;
        zh0 zh0 = oi0.f15800c;
        a aVar = null;
        if (zh0 != null) {
            zh0 zh02 = zh0.f17756d;
            aVar = new a(zh0.f17753a, zh0.f17754b, zh0.f17755c, zh02 != null ? new a(zh02.f17753a, zh02.f17754b, zh02.f17755c) : aVar);
        }
        this.f5583b = aVar;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f5582a.f15798a);
        jSONObject.put("Latency", this.f5582a.f15799b);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f5582a.f15801d.keySet()) {
            jSONObject2.put(str, this.f5582a.f15801d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f5583b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", aVar.b());
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
