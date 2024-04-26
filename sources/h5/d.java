package h5;

import d5.a0;
import d5.k;
import d5.x;
import d5.y;

/* compiled from: StartOffsetExtractorOutput */
public final class d implements k {

    /* renamed from: a  reason: collision with root package name */
    public final long f18907a;

    /* renamed from: b  reason: collision with root package name */
    public final k f18908b;

    /* compiled from: StartOffsetExtractorOutput */
    public class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x f18909a;

        public a(x xVar) {
            this.f18909a = xVar;
        }

        public boolean b() {
            return this.f18909a.b();
        }

        public long c() {
            return this.f18909a.c();
        }

        public x.a j(long j10) {
            x.a j11 = this.f18909a.j(j10);
            y yVar = j11.f13064a;
            long j12 = yVar.f13069a;
            long j13 = yVar.f13070b;
            long j14 = d.this.f18907a;
            y yVar2 = new y(j12, j13 + j14);
            y yVar3 = j11.f13065b;
            return new x.a(yVar2, new y(yVar3.f13069a, yVar3.f13070b + j14));
        }
    }

    public d(long j10, k kVar) {
        this.f18907a = j10;
        this.f18908b = kVar;
    }

    public void b(x xVar) {
        this.f18908b.b(new a(xVar));
    }

    public void d() {
        this.f18908b.d();
    }

    public a0 l(int i10, int i11) {
        return this.f18908b.l(i10, i11);
    }
}
