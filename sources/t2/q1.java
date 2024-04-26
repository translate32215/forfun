package t2;

import com.adcolony.sdk.g;

public class q1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t1 f25557a;

    public q1(t1 t1Var) {
        this.f25557a = t1Var;
    }

    public void a(g gVar) {
        if (t1.a(this.f25557a, gVar)) {
            t1 t1Var = this.f25557a;
            t1Var.getClass();
            if (gVar.f4485b.optBoolean("visible")) {
                t1Var.setVisibility(0);
            } else {
                t1Var.setVisibility(4);
            }
        }
    }
}
