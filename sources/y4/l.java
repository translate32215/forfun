package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class l implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28046a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28047b;

    public /* synthetic */ l(x.a aVar, int i10) {
        this.f28046a = i10;
        if (i10 != 1) {
        }
        this.f28047b = aVar;
    }

    public final void c(Object obj) {
        switch (this.f28046a) {
            case 0:
                ((x) obj).R(this.f28047b);
                return;
            case 1:
                ((x) obj).w(this.f28047b);
                return;
            case 2:
                ((x) obj).S(this.f28047b);
                return;
            default:
                ((x) obj).f(this.f28047b);
                return;
        }
    }
}
