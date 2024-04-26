package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class s implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28067a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28068b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f28069c;

    public /* synthetic */ s(x.a aVar, Exception exc, int i10) {
        this.f28067a = i10;
        this.f28068b = aVar;
        this.f28069c = exc;
    }

    public final void c(Object obj) {
        switch (this.f28067a) {
            case 0:
                ((x) obj).v(this.f28068b, this.f28069c);
                return;
            default:
                ((x) obj).V(this.f28068b, this.f28069c);
                return;
        }
    }
}
