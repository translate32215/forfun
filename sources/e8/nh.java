package e8;

import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.yd;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.ze;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class nh implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15689a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15690b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15691c;

    public nh(yd ydVar, a00 a00) {
        this.f15690b = ydVar;
        this.f15691c = a00;
    }

    public final p50 a(Object obj) {
        a20 a20;
        switch (this.f15689a) {
            case 0:
                mh mhVar = (mh) this.f15690b;
                l5 l5Var = (l5) obj;
                mhVar.getClass();
                l5Var.f7322i = (ze) this.f15691c;
                j8 j8Var = mhVar.f15519h;
                zr zrVar = new zr(l5Var, 0);
                sr srVar = (sr) j8Var.f7135c;
                srVar.getClass();
                return j8Var.g(l5Var, new ri(srVar), new bs(j8Var, 0), zrVar);
            case 1:
                xh0 xh0 = (xh0) this.f15691c;
                String str = (String) obj;
                String str2 = xh0.f17493a;
                String str3 = xh0.f17494b;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str2);
                jSONObject2.put("base_url", "");
                jSONObject2.put("signals", new JSONObject(str3));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return yh.h(jSONObject);
            default:
                yd ydVar = (yd) this.f15690b;
                a00 a00 = (a00) this.f15691c;
                z10 z10 = (z10) obj;
                ydVar.getClass();
                if (z10 == null || z10.f17681a == null || (a20 = z10.f17682b) == null) {
                    throw new br(we.INTERNAL_ERROR, "Empty prefetch");
                }
                vv.b z11 = vv.z();
                vv.a.C0087a B = vv.a.B();
                B.p(vv.c.IN_MEMORY);
                B.o(vv.d.A());
                z11.o(B);
                z10.f17681a.f16364a.f15517f.I0(new xk((vv) ((aq) z11.j()), 1));
                return ydVar.c(z10.f17681a, ((ae) a20).f5954b, a00);
        }
    }

    public nh(mh mhVar, ze zeVar) {
        this.f15690b = mhVar;
        this.f15691c = zeVar;
    }

    public nh(mr mrVar, xh0 xh0) {
        this.f15690b = mrVar;
        this.f15691c = xh0;
    }
}
