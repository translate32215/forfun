package y4;

import a5.d;
import q5.a;
import v6.o;
import y4.x;
import z5.n;

public final /* synthetic */ class t implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28070a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28071b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f28072c;

    public /* synthetic */ t(x.a aVar, d dVar) {
        this.f28071b = aVar;
        this.f28072c = dVar;
    }

    public /* synthetic */ t(x.a aVar, String str) {
        this.f28071b = aVar;
        this.f28072c = str;
    }

    public /* synthetic */ t(x.a aVar, a aVar2) {
        this.f28071b = aVar;
        this.f28072c = aVar2;
    }

    public /* synthetic */ t(x.a aVar, n nVar) {
        this.f28071b = aVar;
        this.f28072c = nVar;
    }

    public final void c(Object obj) {
        switch (this.f28070a) {
            case 0:
                ((x) obj).U(this.f28071b, (a) this.f28072c);
                return;
            case 1:
                ((x) obj).o(this.f28071b, (n) this.f28072c);
                return;
            case 2:
                ((x) obj).y(this.f28071b, (String) this.f28072c);
                return;
            default:
                x.a aVar = this.f28071b;
                d dVar = (d) this.f28072c;
                x xVar = (x) obj;
                xVar.J(aVar, dVar);
                xVar.C(aVar, 2, dVar);
                return;
        }
    }
}
