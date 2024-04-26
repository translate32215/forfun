package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class e implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28021a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28022b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f28023c;

    public /* synthetic */ e(x.a aVar, boolean z10, int i10) {
        this.f28021a = i10;
        if (i10 != 1) {
        }
        this.f28022b = aVar;
        this.f28023c = z10;
    }

    public final void c(Object obj) {
        switch (this.f28021a) {
            case 0:
                ((x) obj).e0(this.f28022b, this.f28023c);
                return;
            case 1:
                ((x) obj).D(this.f28022b, this.f28023c);
                return;
            case 2:
                ((x) obj).W(this.f28022b, this.f28023c);
                return;
            default:
                ((x) obj).E(this.f28022b, this.f28023c);
                return;
        }
    }
}
