package e8;

import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.yh;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class g5 implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14705a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14706b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14707c;

    public g5(hu huVar, qe qeVar) {
        this.f14706b = huVar;
        this.f14707c = qeVar;
    }

    public final p50 a(Object obj) {
        switch (this.f14705a) {
            case 0:
                u4 u4Var = (u4) obj;
                u4Var.r((String) this.f14706b, (f3) this.f14707c);
                return yh.h(u4Var);
            default:
                hu huVar = (hu) this.f14706b;
                cp cpVar = (cp) obj;
                huVar.getClass();
                Boolean bool = Boolean.TRUE;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isNonagon", bool);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("response", ((qe) this.f14707c).f7965r.f8195c);
                jSONObject2.put("sdk_params", jSONObject);
                return yh.j(cpVar.e("google.afma.nativeAds.preProcessJson", jSONObject2), new h5(huVar, cpVar), huVar.f14944b);
        }
    }

    public g5(String str, f3 f3Var) {
        this.f14706b = str;
        this.f14707c = f3Var;
    }
}
