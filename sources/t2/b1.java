package t2;

import com.adcolony.sdk.g;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

public class b1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f25415a;

    public b1(e1 e1Var) {
        this.f25415a = e1Var;
    }

    public void a(g gVar) {
        if (this.f25415a.b(gVar)) {
            e1 e1Var = this.f25415a;
            e1Var.getClass();
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "text", e1Var.getText().toString());
            gVar.a(jSONObject).b();
        }
    }
}
