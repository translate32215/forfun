package e8;

import com.google.android.gms.ads.internal.util.i;
import com.google.android.gms.internal.ads.qe;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class on extends mn {

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f15804b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15805c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15806d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15807e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15808f;

    public on(qe qeVar, JSONObject jSONObject) {
        super(qeVar);
        boolean z10 = false;
        this.f15804b = i.d(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f15805c = i.h(jSONObject, "allow_pub_owned_ad_view");
        this.f15806d = i.h(jSONObject, "attribution", "allow_pub_rendering");
        this.f15807e = i.h(jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z10 = true;
        }
        this.f15808f = z10;
    }

    public final boolean a() {
        return this.f15807e;
    }

    public final JSONObject b() {
        JSONObject jSONObject = this.f15804b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f15529a.f7972y);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean c() {
        return this.f15808f;
    }

    public final boolean d() {
        return this.f15805c;
    }

    public final boolean e() {
        return this.f15806d;
    }
}
