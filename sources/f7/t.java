package f7;

import com.google.android.gms.internal.ads.a;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.se;
import e8.b9;
import e8.k8;
import e8.va;
import e8.wi0;
import java.util.Map;
import n2.g;
import q.e;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class t extends a<wi0> {

    /* renamed from: v  reason: collision with root package name */
    public final d7<wi0> f18319v;

    /* renamed from: w  reason: collision with root package name */
    public final b7 f18320w;

    public t(String str, d7<wi0> d7Var) {
        super(0, str, new b2.t((d7) d7Var));
        this.f18319v = d7Var;
        b7 b7Var = new b7((String) null);
        this.f18320w = b7Var;
        if (b7.a()) {
            b7Var.c("onNetworkRequest", new g(str, "GET", (Map) null, (byte[]) null));
        }
    }

    public final c c(wi0 wi0) {
        return new c(wi0, va.a(wi0));
    }

    public final void f(Object obj) {
        wi0 wi0 = (wi0) obj;
        b7 b7Var = this.f18320w;
        Map<String, String> map = wi0.f17365c;
        int i10 = wi0.f17363a;
        b7Var.getClass();
        if (b7.a()) {
            b7Var.c("onNetworkResponse", new se(i10, (Map) map));
            if (i10 < 200 || i10 >= 300) {
                b7Var.c("onNetworkRequestError", new k8((String) null, 1));
            }
        }
        b7 b7Var2 = this.f18320w;
        byte[] bArr = wi0.f17364b;
        if (b7.a() && bArr != null) {
            b7Var2.c("onNetworkResponseBody", new b9(bArr, 0, (e) null));
        }
        this.f18319v.b(wi0);
    }
}
