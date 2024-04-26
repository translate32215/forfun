package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer */
public class b {

    /* renamed from: f  reason: collision with root package name */
    public static final Date f9776f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f9777a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f9778b;

    /* renamed from: c  reason: collision with root package name */
    public Date f9779c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f9780d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f9781e;

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f9778b = jSONObject;
        this.f9779c = date;
        this.f9780d = jSONArray;
        this.f9781e = jSONObject2;
        this.f9777a = jSONObject3;
    }

    public static b a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f9777a.toString().equals(((b) obj).toString());
    }

    public int hashCode() {
        return this.f9777a.hashCode();
    }

    public String toString() {
        return this.f9777a.toString();
    }
}
