package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final List<JSONObject> f4459a = Collections.synchronizedList(new ArrayList());

    public static boolean a() {
        boolean z10;
        List<JSONObject> list = f4459a;
        synchronized (list) {
            z10 = list.size() != 0;
        }
        return z10;
    }

    public static void b() {
        o d10 = f.d();
        d10.getClass();
        if (!o.S.equals("") && d10.C) {
            List<JSONObject> list = f4459a;
            synchronized (list) {
                for (JSONObject c10 : list) {
                    c(c10);
                }
                f4459a.clear();
            }
        }
    }

    public static void c(JSONObject jSONObject) {
        o d10 = f.d();
        d10.getClass();
        if (o.S.equals("") || !d10.C) {
            List<JSONObject> list = f4459a;
            synchronized (list) {
                if (200 > list.size()) {
                    list.add(jSONObject);
                }
            }
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("payload");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        if (q0.f4714d0) {
            r0.e(optJSONObject, "api_key", "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            f.d().getClass();
            r0.e(optJSONObject, "api_key", o.S);
        }
        try {
            jSONObject.remove("payload");
            jSONObject.put("payload", optJSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        new g("AdColony.log_event", 1, jSONObject).b();
    }
}
