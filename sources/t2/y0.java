package t2;

import android.graphics.Typeface;
import com.adcolony.sdk.g;

public class y0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f25596a;

    public y0(e1 e1Var) {
        this.f25596a = e1Var;
    }

    public void a(g gVar) {
        if (this.f25596a.b(gVar)) {
            e1 e1Var = this.f25596a;
            e1Var.getClass();
            int optInt = gVar.f4485b.optInt("font_family");
            e1Var.f25461g = optInt;
            if (optInt == 0) {
                e1Var.setTypeface(Typeface.DEFAULT);
            } else if (optInt == 1) {
                e1Var.setTypeface(Typeface.SERIF);
            } else if (optInt == 2) {
                e1Var.setTypeface(Typeface.SANS_SERIF);
            } else if (optInt == 3) {
                e1Var.setTypeface(Typeface.MONOSPACE);
            }
        }
    }
}
