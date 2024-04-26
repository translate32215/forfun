package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class f implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28024a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28025b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f28026c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f28027d;

    public /* synthetic */ f(x.a aVar, boolean z10, int i10, int i11) {
        this.f28024a = i11;
        this.f28025b = aVar;
        this.f28026c = z10;
        this.f28027d = i10;
    }

    public final void c(Object obj) {
        switch (this.f28024a) {
            case 0:
                ((x) obj).c0(this.f28025b, this.f28026c, this.f28027d);
                return;
            default:
                ((x) obj).T(this.f28025b, this.f28026c, this.f28027d);
                return;
        }
    }
}
