package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class n implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28050a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28051b;

    public /* synthetic */ n(x.a aVar, int i10) {
        this.f28050a = i10;
        if (i10 != 1) {
        }
        this.f28051b = aVar;
    }

    public final void c(Object obj) {
        switch (this.f28050a) {
            case 0:
                ((x) obj).b0(this.f28051b);
                return;
            case 1:
                ((x) obj).Z(this.f28051b);
                return;
            case 2:
                ((x) obj).q(this.f28051b);
                return;
            default:
                ((x) obj).g(this.f28051b);
                return;
        }
    }
}
