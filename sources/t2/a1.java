package t2;

import com.adcolony.sdk.g;

public class a1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f25412a;

    public a1(e1 e1Var) {
        this.f25412a = e1Var;
    }

    public void a(g gVar) {
        if (this.f25412a.b(gVar)) {
            e1 e1Var = this.f25412a;
            e1Var.getClass();
            int optInt = gVar.f4485b.optInt("font_style");
            e1Var.f25460f = optInt;
            if (optInt == 0) {
                e1Var.setTypeface(e1Var.getTypeface(), 0);
            } else if (optInt == 1) {
                e1Var.setTypeface(e1Var.getTypeface(), 1);
            } else if (optInt == 2) {
                e1Var.setTypeface(e1Var.getTypeface(), 2);
            } else if (optInt == 3) {
                e1Var.setTypeface(e1Var.getTypeface(), 3);
            }
        }
    }
}
