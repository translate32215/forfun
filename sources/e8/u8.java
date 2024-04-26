package e8;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.r2;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u8 {

    /* renamed from: a  reason: collision with root package name */
    public final long f16855a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f16856b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f16857c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, r2> f16858d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public String f16859e;

    /* renamed from: f  reason: collision with root package name */
    public String f16860f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f16861g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16862h;

    public u8(String str, long j10) {
        JSONObject optJSONObject;
        this.f16862h = false;
        this.f16860f = str;
        this.f16855a = j10;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f16861g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f16862h = false;
                    e.K("App settings could not be fetched successfully.");
                    return;
                }
                this.f16862h = true;
                this.f16859e = this.f16861g.optString("app_id");
                JSONArray optJSONArray = this.f16861g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f16857c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f16858d.put(optString2, new r2(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.f16861g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        this.f16856b.add(optJSONArray2.optString(i11));
                    }
                }
            } catch (JSONException e10) {
                e.D("Exception occurred while processing app setting json", e10);
                y6 y6Var = l.B.f13190g;
                a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AppSettings.parseAppSettingsJson");
            }
        }
    }
}
