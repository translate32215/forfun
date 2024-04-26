package t2;

import com.adcolony.sdk.g;
import com.adcolony.sdk.k0;

public class k1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f25500a;

    public k1(k0 k0Var) {
        this.f25500a = k0Var;
    }

    public void a(g gVar) {
        if (k0.a(this.f25500a, gVar)) {
            k0 k0Var = this.f25500a;
            if (k0Var.E) {
                if (k0Var.A) {
                    k0Var.A = false;
                }
                k0Var.f4581c0 = gVar;
                int optInt = gVar.f4485b.optInt("time");
                int duration = k0Var.S.getDuration() / 1000;
                k0Var.S.setOnSeekCompleteListener(k0Var);
                k0Var.S.seekTo(optInt * 1000);
                if (duration == optInt) {
                    k0Var.A = true;
                }
            }
        }
    }
}
