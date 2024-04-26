package y4;

import a5.g;
import r6.l;
import v6.o;
import x4.b0;
import y4.x;
import z5.g0;

public final /* synthetic */ class b implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28010b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f28011c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f28012d;

    public /* synthetic */ b(x.a aVar, b0 b0Var, g gVar, int i10) {
        this.f28009a = i10;
        this.f28010b = aVar;
        this.f28011c = b0Var;
        this.f28012d = gVar;
    }

    public /* synthetic */ b(x.a aVar, g0 g0Var, l lVar) {
        this.f28009a = 2;
        this.f28010b = aVar;
        this.f28011c = g0Var;
        this.f28012d = lVar;
    }

    public final void c(Object obj) {
        switch (this.f28009a) {
            case 0:
                x.a aVar = this.f28010b;
                b0 b0Var = (b0) this.f28011c;
                x xVar = (x) obj;
                xVar.k(aVar, b0Var, (g) this.f28012d);
                xVar.G(aVar, 2, b0Var);
                return;
            case 1:
                x.a aVar2 = this.f28010b;
                b0 b0Var2 = (b0) this.f28011c;
                x xVar2 = (x) obj;
                xVar2.Q(aVar2, b0Var2, (g) this.f28012d);
                xVar2.G(aVar2, 1, b0Var2);
                return;
            default:
                ((x) obj).r(this.f28010b, (g0) this.f28011c, (l) this.f28012d);
                return;
        }
    }
}
