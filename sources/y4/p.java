package y4;

import v6.o;
import y4.x;

public final /* synthetic */ class p implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28055a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f28056b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f28057c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f28058d;

    public /* synthetic */ p(x.a aVar, int i10, long j10) {
        this.f28056b = aVar;
        this.f28057c = i10;
        this.f28058d = j10;
    }

    public /* synthetic */ p(x.a aVar, long j10, int i10) {
        this.f28056b = aVar;
        this.f28058d = j10;
        this.f28057c = i10;
    }

    public final void c(Object obj) {
        switch (this.f28055a) {
            case 0:
                ((x) obj).N(this.f28056b, this.f28057c, this.f28058d);
                return;
            default:
                ((x) obj).d(this.f28056b, this.f28058d, this.f28057c);
                return;
        }
    }
}
