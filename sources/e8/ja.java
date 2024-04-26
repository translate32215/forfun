package e8;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ja {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15108a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15109b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15110c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15111d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15112e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15113f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15114g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15115h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15116i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15117j;

    public ja(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f15108a = a(jSONObject, "aggressive_media_codec_release", t.f16686y);
        this.f15109b = b(jSONObject, "byte_buffer_precache_limit", t.f16578g);
        this.f15110c = b(jSONObject, "exo_cache_buffer_size", t.f16620n);
        this.f15111d = b(jSONObject, "exo_connect_timeout_millis", t.f16554c);
        l lVar = t.f16548b;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f15112e = b(jSONObject, "exo_read_timeout_millis", t.f16560d);
            this.f15113f = b(jSONObject, "load_check_interval_bytes", t.f16566e);
            this.f15114g = b(jSONObject, "player_precache_limit", t.f16572f);
            this.f15115h = b(jSONObject, "socket_receive_buffer_size", t.f16584h);
            this.f15116i = a(jSONObject, "use_cache_data_source", t.f16551b2);
            this.f15117j = b(jSONObject, "min_retry_count", t.f16596j);
        }
        String str2 = (String) ti0.f16763j.f16769f.a(lVar);
        this.f15112e = b(jSONObject, "exo_read_timeout_millis", t.f16560d);
        this.f15113f = b(jSONObject, "load_check_interval_bytes", t.f16566e);
        this.f15114g = b(jSONObject, "player_precache_limit", t.f16572f);
        this.f15115h = b(jSONObject, "socket_receive_buffer_size", t.f16584h);
        this.f15116i = a(jSONObject, "use_cache_data_source", t.f16551b2);
        this.f15117j = b(jSONObject, "min_retry_count", t.f16596j);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e8.l<java.lang.Boolean>, e8.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(org.json.JSONObject r1, java.lang.String r2, e8.l<java.lang.Boolean> r3) {
        /*
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r3 = r0.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r1 == 0) goto L_0x0014
            boolean r3 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x0014 }
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ja.a(org.json.JSONObject, java.lang.String, e8.l):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.l<java.lang.Integer>, e8.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(org.json.JSONObject r0, java.lang.String r1, e8.l<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r0 = r0.a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ja.b(org.json.JSONObject, java.lang.String, e8.l):int");
    }
}
