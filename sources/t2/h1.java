package t2;

import android.widget.FrameLayout;
import com.adcolony.sdk.g;
import com.adcolony.sdk.k0;
import org.json.JSONObject;

public class h1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f25482a;

    public h1(k0 k0Var) {
        this.f25482a = k0Var;
    }

    public void a(g gVar) {
        if (k0.a(this.f25482a, gVar)) {
            k0 k0Var = this.f25482a;
            k0Var.getClass();
            JSONObject jSONObject = gVar.f4485b;
            k0Var.f4587i = jSONObject.optInt("x");
            k0Var.f4588r = jSONObject.optInt("y");
            k0Var.f4589s = jSONObject.optInt("width");
            k0Var.f4590t = jSONObject.optInt("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k0Var.getLayoutParams();
            layoutParams.setMargins(k0Var.f4587i, k0Var.f4588r, 0, 0);
            layoutParams.width = k0Var.f4589s;
            layoutParams.height = k0Var.f4590t;
            k0Var.setLayoutParams(layoutParams);
            if (k0Var.H && k0Var.Q != null) {
                int i10 = (int) (k0Var.f4576a * 4.0f);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10);
                layoutParams2.setMargins(0, k0Var.N.f4511i - ((int) (k0Var.f4576a * 4.0f)), 0, 0);
                layoutParams2.gravity = 0;
                k0Var.Q.setLayoutParams(layoutParams2);
            }
        }
    }
}
