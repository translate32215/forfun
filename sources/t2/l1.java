package t2;

import com.adcolony.sdk.d;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.k0;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

public class l1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f25511a;

    public l1(k0 k0Var) {
        this.f25511a = k0Var;
    }

    public void a(g gVar) {
        if (k0.a(this.f25511a, gVar)) {
            k0 k0Var = this.f25511a;
            if (k0Var.E) {
                float optDouble = (float) gVar.f4485b.optDouble("volume", 0.0d);
                d dVar = f.d().f4670n;
                k0Var.S.setVolume(optDouble, optDouble);
                JSONObject jSONObject = new JSONObject();
                r0.k(jSONObject, "success", true);
                gVar.a(jSONObject).b();
            }
        }
    }
}
