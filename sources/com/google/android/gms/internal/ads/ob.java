package com.google.android.gms.internal.ads;

import d7.l;
import e8.hd0;
import e8.js;
import e8.n9;
import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class ob implements j2<js>, yo, n9, zh, hd0 {
    public ob(int i10) {
    }

    public /* synthetic */ void a(Object obj) {
        ((t7) obj).destroy();
    }

    public /* synthetic */ Object b(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }

    public JSONObject c(Object obj) throws JSONException {
        js jsVar = (js) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", jsVar.f15188c.f14371b);
        jSONObject2.put("signals", jsVar.f15187b);
        jSONObject3.put("body", jsVar.f15186a.f15712c);
        jSONObject3.put("headers", l.B.f13186c.F(jsVar.f15186a.f15711b));
        jSONObject3.put("response_code", jsVar.f15186a.f15710a);
        jSONObject3.put("latency", jsVar.f15186a.f15713d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", jsVar.f15188c.f14377h);
        return jSONObject;
    }

    public ht[] d() {
        return new ht[]{new pt()};
    }

    public void n(Throwable th) {
    }

    public void run() {
    }
}
