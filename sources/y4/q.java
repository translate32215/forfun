package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class q implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28060b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f28061c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f28062d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f28063e;

    public /* synthetic */ q(x.a aVar, int i10, long j10, long j11, int i11) {
        this.f28059a = i11;
        this.f28060b = aVar;
        this.f28061c = i10;
        this.f28062d = j10;
        this.f28063e = j11;
    }

    public final void c(Object obj) {
        switch (this.f28059a) {
            case 0:
                ((x) obj).p(this.f28060b, this.f28061c, this.f28062d, this.f28063e);
                return;
            default:
                ((x) obj).A(this.f28060b, this.f28061c, this.f28062d, this.f28063e);
                return;
        }
    }
}
