package y4;

import v6.o;
import y4.x;
import z5.k;
import z5.n;

public final /* synthetic */ class d implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28018b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f28019c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f28020d;

    public /* synthetic */ d(x.a aVar, k kVar, n nVar, int i10) {
        this.f28017a = i10;
        this.f28018b = aVar;
        this.f28019c = kVar;
        this.f28020d = nVar;
    }

    public final void c(Object obj) {
        switch (this.f28017a) {
            case 0:
                ((x) obj).F(this.f28018b, this.f28019c, this.f28020d);
                return;
            case 1:
                ((x) obj).b(this.f28018b, this.f28019c, this.f28020d);
                return;
            default:
                ((x) obj).M(this.f28018b, this.f28019c, this.f28020d);
                return;
        }
    }
}
