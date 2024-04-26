package com.google.android.gms.internal.ads;

import d7.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    public final List<p2> f8004a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f8005b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f8006c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f8007d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f8008e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f8009f;

    public r2(JSONObject jSONObject) throws JSONException {
        boolean z10;
        if (e.h(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            e.H(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                p2 p2Var = new p2(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(p2Var.f7804l);
                arrayList.add(p2Var);
                if (i10 < 0) {
                    Iterator<String> it = p2Var.f7793a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        i10 = i11;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f8004a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            q2 q2Var = l.B.f13203t;
            this.f8005b = q2.a(optJSONObject, "click_urls");
            q2 q2Var2 = l.B.f13203t;
            this.f8006c = q2.a(optJSONObject, "imp_urls");
            q2 q2Var3 = l.B.f13203t;
            this.f8007d = q2.a(optJSONObject, "downloaded_imp_urls");
            q2 q2Var4 = l.B.f13203t;
            this.f8008e = q2.a(optJSONObject, "nofill_urls");
            q2 q2Var5 = l.B.f13203t;
            this.f8009f = q2.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1);
            a6.i(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
