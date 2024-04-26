package com.adcolony.sdk;

import org.json.JSONObject;

public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f4704a;

    public p(o oVar) {
        this.f4704a = oVar;
    }

    public void run() {
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "url", o.R);
        r0.e(jSONObject, "content_type", "application/json");
        JSONObject b10 = this.f4704a.i().b(2000);
        b10.remove("permissions");
        b10.remove("launch_metadata");
        r0.e(jSONObject, "content", b10.toString());
        this.f4704a.f4658b.b(new b0(new g("WebServices.post", 0, jSONObject), this.f4704a));
    }
}
