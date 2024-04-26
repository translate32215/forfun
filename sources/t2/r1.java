package t2;

import android.widget.FrameLayout;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import org.json.JSONObject;

public class r1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t1 f25562a;

    public r1(t1 t1Var) {
        this.f25562a = t1Var;
    }

    public void a(g gVar) {
        if (t1.a(this.f25562a, gVar)) {
            t1 t1Var = this.f25562a;
            t1Var.getClass();
            JSONObject jSONObject = gVar.f4485b;
            t1Var.f25572b = jSONObject.optInt("x");
            t1Var.f25573c = jSONObject.optInt("y");
            t1Var.f25574d = jSONObject.optInt("width");
            t1Var.f25575e = jSONObject.optInt("height");
            if (t1Var.f25576f) {
                float f10 = (((float) t1Var.f25575e) * f.d().i().f()) / ((float) t1Var.getDrawable().getIntrinsicHeight());
                t1Var.f25575e = (int) (((float) t1Var.getDrawable().getIntrinsicHeight()) * f10);
                int intrinsicWidth = (int) (((float) t1Var.getDrawable().getIntrinsicWidth()) * f10);
                t1Var.f25574d = intrinsicWidth;
                t1Var.f25572b -= intrinsicWidth;
                t1Var.f25573c -= t1Var.f25575e;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t1Var.getLayoutParams();
            layoutParams.setMargins(t1Var.f25572b, t1Var.f25573c, 0, 0);
            layoutParams.width = t1Var.f25574d;
            layoutParams.height = t1Var.f25575e;
            t1Var.setLayoutParams(layoutParams);
        }
    }
}
