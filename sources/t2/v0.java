package t2;

import android.widget.FrameLayout;
import com.adcolony.sdk.g;
import org.json.JSONObject;

public class v0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f25590a;

    public v0(e1 e1Var) {
        this.f25590a = e1Var;
    }

    public void a(g gVar) {
        if (this.f25590a.b(gVar)) {
            e1 e1Var = this.f25590a;
            e1Var.getClass();
            JSONObject jSONObject = gVar.f4485b;
            e1Var.f25456b = jSONObject.optInt("x");
            e1Var.f25457c = jSONObject.optInt("y");
            e1Var.f25458d = jSONObject.optInt("width");
            e1Var.f25459e = jSONObject.optInt("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
            layoutParams.setMargins(e1Var.f25456b, e1Var.f25457c, 0, 0);
            layoutParams.width = e1Var.f25458d;
            layoutParams.height = e1Var.f25459e;
            e1Var.setLayoutParams(layoutParams);
        }
    }
}
