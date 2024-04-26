package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class c implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28014b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f28015c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f28016d;

    public /* synthetic */ c(x.a aVar, String str, long j10, int i10) {
        this.f28013a = i10;
        this.f28014b = aVar;
        this.f28015c = str;
        this.f28016d = j10;
    }

    public final void c(Object obj) {
        switch (this.f28013a) {
            case 0:
                x.a aVar = this.f28014b;
                String str = this.f28015c;
                long j10 = this.f28016d;
                x xVar = (x) obj;
                xVar.d0(aVar, str, j10);
                xVar.P(aVar, 1, str, j10);
                return;
            default:
                x.a aVar2 = this.f28014b;
                String str2 = this.f28015c;
                long j11 = this.f28016d;
                x xVar2 = (x) obj;
                xVar2.e(aVar2, str2, j11);
                xVar2.P(aVar2, 2, str2, j11);
                return;
        }
    }
}
