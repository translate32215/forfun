package x4;

import v6.o;
import x4.r0;

public final /* synthetic */ class s implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27711a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f27712b;

    public /* synthetic */ s(n0 n0Var, int i10) {
        this.f27711a = i10;
        if (!(i10 == 1 || i10 == 2)) {
        }
        this.f27712b = n0Var;
    }

    public final void c(Object obj) {
        switch (this.f27711a) {
            case 0:
                ((r0.a) obj).b(this.f27712b.f27690l);
                return;
            case 1:
                ((r0.a) obj).f(this.f27712b.f27691m);
                return;
            case 2:
                ((r0.a) obj).V(this.f27712b.f27693o);
                return;
            case 3:
                ((r0.a) obj).l(this.f27712b.f27687i);
                return;
            default:
                n0 n0Var = this.f27712b;
                ((r0.a) obj).c(n0Var.f27689k, n0Var.f27682d);
                return;
        }
    }
}
