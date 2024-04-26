package y4;

import a5.d;
import v6.o;
import y4.x;

public final /* synthetic */ class r implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28065b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f28066c;

    public /* synthetic */ r(x.a aVar, d dVar, int i10) {
        this.f28064a = i10;
        this.f28065b = aVar;
        this.f28066c = dVar;
    }

    public final void c(Object obj) {
        switch (this.f28064a) {
            case 0:
                x.a aVar = this.f28065b;
                d dVar = this.f28066c;
                x xVar = (x) obj;
                xVar.c(aVar, dVar);
                xVar.s(aVar, 2, dVar);
                return;
            case 1:
                x.a aVar2 = this.f28065b;
                d dVar2 = this.f28066c;
                x xVar2 = (x) obj;
                xVar2.l(aVar2, dVar2);
                xVar2.s(aVar2, 1, dVar2);
                return;
            default:
                x.a aVar3 = this.f28065b;
                d dVar3 = this.f28066c;
                x xVar3 = (x) obj;
                xVar3.K(aVar3, dVar3);
                xVar3.C(aVar3, 1, dVar3);
                return;
        }
    }
}
