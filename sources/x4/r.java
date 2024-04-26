package x4;

import v6.o;
import x4.r0;

public final /* synthetic */ class r implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f27710b;

    public /* synthetic */ r(n0 n0Var, int i10) {
        this.f27709a = i10;
        if (!(i10 == 1 || i10 == 2)) {
        }
        this.f27710b = n0Var;
    }

    public final void c(Object obj) {
        switch (this.f27709a) {
            case 0:
                ((r0.a) obj).Z(w.L(this.f27710b));
                return;
            case 1:
                ((r0.a) obj).P(this.f27710b.f27692n);
                return;
            case 2:
                ((r0.a) obj).X(this.f27710b.f27683e);
                return;
            case 3:
                ((r0.a) obj).p(this.f27710b.f27684f);
                return;
            default:
                ((r0.a) obj).C(this.f27710b.f27682d);
                return;
        }
    }
}
