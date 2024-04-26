package com.adcolony.sdk;

import android.support.v4.media.a;
import org.json.JSONException;
import org.json.JSONObject;
import p.f;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public String f4484a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f4485b;

    public g(JSONObject jSONObject) {
        try {
            this.f4485b = jSONObject;
            this.f4484a = jSONObject.getString("m_type");
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON Error in ADCMessage constructor: ");
            a10.append(e10.toString());
            f.a(0, 0, a10.toString(), true);
        }
    }

    public g a(JSONObject jSONObject) {
        try {
            g gVar = new g("reply", this.f4485b.getInt("m_origin"), jSONObject);
            gVar.f4485b.put("m_id", this.f4485b.getInt("m_id"));
            return gVar;
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON error in ADCMessage's createReply(): ");
            a10.append(e10.toString());
            f.d().l().e(0, 0, a10.toString(), true);
            return new g("JSONException", 0);
        }
    }

    public void b() {
        String str = this.f4484a;
        JSONObject jSONObject = this.f4485b;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        r0.e(jSONObject, "m_type", str);
        f.d().m().e(jSONObject);
    }

    public g(String str, int i10) {
        try {
            this.f4484a = str;
            JSONObject jSONObject = new JSONObject();
            this.f4485b = jSONObject;
            jSONObject.put("m_target", i10);
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON Error in ADCMessage constructor: ");
            a10.append(e10.toString());
            f.a(0, 0, a10.toString(), true);
        }
    }

    public g(String str, int i10, JSONObject jSONObject) {
        try {
            this.f4484a = str;
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            this.f4485b = jSONObject;
            jSONObject.put("m_target", i10);
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON Error in ADCMessage constructor: ");
            a10.append(e10.toString());
            f.a(0, 0, a10.toString(), true);
        }
    }
}
