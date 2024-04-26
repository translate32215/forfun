package com.google.android.gms.internal.ads;

import d7.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f7793a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f7794b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f7795c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f7796d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f7797e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f7798f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7799g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f7800h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f7801i;

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f7802j;

    /* renamed from: k  reason: collision with root package name */
    public final List<String> f7803k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7804l;

    public p2(JSONObject jSONObject) throws JSONException {
        List<String> list;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.f7793a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", (String) null);
        q2 q2Var = l.B.f13203t;
        this.f7794b = q2.a(jSONObject, "clickurl");
        q2 q2Var2 = l.B.f13203t;
        this.f7795c = q2.a(jSONObject, "imp_urls");
        q2 q2Var3 = l.B.f13203t;
        this.f7796d = q2.a(jSONObject, "downloaded_imp_urls");
        q2 q2Var4 = l.B.f13203t;
        this.f7798f = q2.a(jSONObject, "fill_urls");
        q2 q2Var5 = l.B.f13203t;
        this.f7800h = q2.a(jSONObject, "video_start_urls");
        q2 q2Var6 = l.B.f13203t;
        this.f7802j = q2.a(jSONObject, "video_complete_urls");
        q2 q2Var7 = l.B.f13203t;
        this.f7801i = q2.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            q2 q2Var8 = l.B.f13203t;
            list = q2.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f7797e = list;
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f7799g = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", (String) null);
        jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        q2 q2Var9 = l.B.f13203t;
        this.f7803k = q2.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f7804l = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
