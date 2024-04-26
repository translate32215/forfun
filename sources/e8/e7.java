package e8;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e7 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f14370a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14371b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14372c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14373d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14374e;

    /* renamed from: f  reason: collision with root package name */
    public String f14375f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14376g;

    /* renamed from: h  reason: collision with root package name */
    public final JSONObject f14377h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14378i;

    public e7(JSONObject jSONObject) {
        List<String> list;
        this.f14375f = jSONObject.optString("url");
        this.f14371b = jSONObject.optString("base_uri");
        this.f14372c = jSONObject.optString("post_parameters");
        this.f14373d = a(jSONObject.optString("drt_include"));
        this.f14374e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            list = null;
        } else {
            list = Arrays.asList(optString.split(","));
        }
        this.f14370a = list;
        this.f14376g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f14377h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f14378i = jSONObject.optString("pool_key");
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
