package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class o implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28053b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f28054c;

    public /* synthetic */ o(x.a aVar, int i10, int i11) {
        this.f28052a = i11;
        if (!(i11 == 1 || i11 == 2)) {
        }
        this.f28053b = aVar;
        this.f28054c = i10;
    }

    public final void c(Object obj) {
        switch (this.f28052a) {
            case 0:
                ((x) obj).Y(this.f28053b, this.f28054c);
                return;
            case 1:
                ((x) obj).u(this.f28053b, this.f28054c);
                return;
            case 2:
                ((x) obj).n(this.f28053b, this.f28054c);
                return;
            case 3:
                ((x) obj).a(this.f28053b, this.f28054c);
                return;
            default:
                ((x) obj).O(this.f28053b, this.f28054c);
                return;
        }
    }
}
