package t2;

import com.adcolony.sdk.g;
import com.adcolony.sdk.k0;

public class i1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f25485a;

    public i1(k0 k0Var) {
        this.f25485a = k0Var;
    }

    public void a(g gVar) {
        k0.b bVar;
        k0.b bVar2;
        if (k0.a(this.f25485a, gVar)) {
            k0 k0Var = this.f25485a;
            k0Var.getClass();
            if (gVar.f4485b.optBoolean("visible")) {
                k0Var.setVisibility(0);
                if (k0Var.H && (bVar2 = k0Var.Q) != null) {
                    bVar2.setVisibility(0);
                    return;
                }
                return;
            }
            k0Var.setVisibility(4);
            if (k0Var.H && (bVar = k0Var.Q) != null) {
                bVar.setVisibility(4);
            }
        }
    }
}
