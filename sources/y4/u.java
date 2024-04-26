package y4;

import v6.o;
import y4.x;
import z4.d;
import z5.n;

public final /* synthetic */ class u implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28073a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28074b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f28075c;

    public /* synthetic */ u(x.a aVar, String str) {
        this.f28074b = aVar;
        this.f28075c = str;
    }

    public /* synthetic */ u(x.a aVar, d dVar) {
        this.f28074b = aVar;
        this.f28075c = dVar;
    }

    public /* synthetic */ u(x.a aVar, n nVar) {
        this.f28074b = aVar;
        this.f28075c = nVar;
    }

    public final void c(Object obj) {
        switch (this.f28073a) {
            case 0:
                ((x) obj).I(this.f28074b, (d) this.f28075c);
                return;
            case 1:
                ((x) obj).z(this.f28074b, (String) this.f28075c);
                return;
            default:
                ((x) obj).m(this.f28074b, (n) this.f28075c);
                return;
        }
    }
}
