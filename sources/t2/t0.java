package t2;

import com.adcolony.sdk.g;
import org.json.JSONObject;

public class t0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f25570a;

    public t0(e1 e1Var) {
        this.f25570a = e1Var;
    }

    public void a(g gVar) {
        if (this.f25570a.b(gVar)) {
            e1 e1Var = this.f25570a;
            e1Var.getClass();
            JSONObject jSONObject = gVar.f4485b;
            e1Var.f25463i = jSONObject.optInt("x");
            e1Var.f25464r = jSONObject.optInt("y");
            e1Var.setGravity(e1Var.a(true, e1Var.f25463i) | e1Var.a(false, e1Var.f25464r));
        }
    }
}
