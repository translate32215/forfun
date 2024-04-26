package t2;

import com.adcolony.sdk.g;

public class u0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f25584a;

    public u0(e1 e1Var) {
        this.f25584a = e1Var;
    }

    public void a(g gVar) {
        if (this.f25584a.b(gVar)) {
            e1 e1Var = this.f25584a;
            e1Var.getClass();
            if (gVar.f4485b.optBoolean("visible")) {
                e1Var.setVisibility(0);
            } else {
                e1Var.setVisibility(4);
            }
        }
    }
}
