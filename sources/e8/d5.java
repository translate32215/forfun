package e8;

import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.n2;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d5 implements m3 {

    /* renamed from: a  reason: collision with root package name */
    public final p4 f14217a;

    /* renamed from: b  reason: collision with root package name */
    public final d7<O> f14218b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n2 f14219c;

    public d5(n2 n2Var, p4 p4Var, d7<O> d7Var) {
        this.f14219c = n2Var;
        this.f14217a = p4Var;
        this.f14218b = d7Var;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f14218b.b(this.f14219c.f7513a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.f14218b.c(e10);
        } finally {
            this.f14217a.p();
        }
    }

    public final void b(String str) {
        if (str == null) {
            try {
                this.f14218b.c(new v4());
            } catch (IllegalStateException unused) {
                this.f14217a.p();
                return;
            } catch (Throwable th) {
                this.f14217a.p();
                throw th;
            }
        } else {
            this.f14218b.c(new v4(str));
        }
        this.f14217a.p();
    }
}
