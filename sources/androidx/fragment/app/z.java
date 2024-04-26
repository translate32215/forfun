package androidx.fragment.app;

import android.content.res.Configuration;
import c0.r;
import n0.a;

public final /* synthetic */ class z implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1884a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1885b;

    public /* synthetic */ z(a0 a0Var, int i10) {
        this.f1884a = i10;
        this.f1885b = a0Var;
    }

    public /* synthetic */ z(q qVar) {
        this.f1884a = 2;
        this.f1885b = qVar;
    }

    public final void a(Object obj) {
        switch (this.f1884a) {
            case 0:
                a0 a0Var = (a0) this.f1885b;
                Integer num = (Integer) obj;
                if (a0Var.P() && num.intValue() == 80) {
                    a0Var.m(false);
                    return;
                }
                return;
            case 1:
                a0 a0Var2 = (a0) this.f1885b;
                r rVar = (r) obj;
                if (a0Var2.P()) {
                    a0Var2.s(rVar.f4011a, false);
                    return;
                }
                return;
            default:
                Configuration configuration = (Configuration) obj;
                ((q) this.f1885b).f1831v.a();
                return;
        }
    }
}
