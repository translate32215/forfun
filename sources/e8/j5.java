package e8;

import com.google.android.gms.internal.ads.d7;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j5 implements m3 {

    /* renamed from: a  reason: collision with root package name */
    public final d7<O> f15092a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i5 f15093b;

    public j5(i5 i5Var, d7<O> d7Var) {
        this.f15093b = i5Var;
        this.f15092a = d7Var;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f15092a.b(this.f15093b.f14986b.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.f15092a.c(e10);
        }
    }

    public final void b(String str) {
        if (str == null) {
            try {
                this.f15092a.c(new v4());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f15092a.c(new v4(str));
        }
    }
}
