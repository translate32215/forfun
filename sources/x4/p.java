package x4;

import v6.o;
import x4.r0;

public final /* synthetic */ class p implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27703a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f27704b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f27705c;

    public /* synthetic */ p(e0 e0Var, int i10) {
        this.f27703a = 2;
        this.f27704b = e0Var;
        this.f27705c = i10;
    }

    public /* synthetic */ p(n0 n0Var, int i10, int i11) {
        this.f27703a = i11;
        this.f27704b = n0Var;
        this.f27705c = i10;
    }

    public final void c(Object obj) {
        switch (this.f27703a) {
            case 0:
                ((r0.a) obj).F(((n0) this.f27704b).f27679a, this.f27705c);
                return;
            case 1:
                ((r0.a) obj).D(((n0) this.f27704b).f27689k, this.f27705c);
                return;
            default:
                ((r0.a) obj).r((e0) this.f27704b, this.f27705c);
                return;
        }
    }
}
