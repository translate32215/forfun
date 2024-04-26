package n5;

import d5.a0;
import d5.k;
import java.util.Collections;
import java.util.List;
import n5.e0;
import v6.v;
import x4.b0;

/* compiled from: DvbSubtitleReader */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final List<e0.a> f22114a;

    /* renamed from: b  reason: collision with root package name */
    public final a0[] f22115b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22116c;

    /* renamed from: d  reason: collision with root package name */
    public int f22117d;

    /* renamed from: e  reason: collision with root package name */
    public int f22118e;

    /* renamed from: f  reason: collision with root package name */
    public long f22119f;

    public i(List<e0.a> list) {
        this.f22114a = list;
        this.f22115b = new a0[list.size()];
    }

    public void a() {
        this.f22116c = false;
    }

    public final boolean b(v vVar, int i10) {
        if (vVar.a() == 0) {
            return false;
        }
        if (vVar.s() != i10) {
            this.f22116c = false;
        }
        this.f22117d--;
        return this.f22116c;
    }

    public void c(v vVar) {
        if (!this.f22116c) {
            return;
        }
        if (this.f22117d != 2 || b(vVar, 32)) {
            if (this.f22117d != 1 || b(vVar, 0)) {
                int i10 = vVar.f26519b;
                int a10 = vVar.a();
                for (a0 b10 : this.f22115b) {
                    vVar.D(i10);
                    b10.b(vVar, a10);
                }
                this.f22118e += a10;
            }
        }
    }

    public void d(k kVar, e0.d dVar) {
        for (int i10 = 0; i10 < this.f22115b.length; i10++) {
            e0.a aVar = this.f22114a.get(i10);
            dVar.a();
            a0 l10 = kVar.l(dVar.c(), 3);
            b0.b bVar = new b0.b();
            bVar.f27415a = dVar.b();
            bVar.f27425k = "application/dvbsubs";
            bVar.f27427m = Collections.singletonList(aVar.f22068b);
            bVar.f27417c = aVar.f22067a;
            l10.c(bVar.a());
            this.f22115b[i10] = l10;
        }
    }

    public void e() {
        if (this.f22116c) {
            for (a0 d10 : this.f22115b) {
                d10.d(this.f22119f, 1, this.f22118e, 0, (a0.a) null);
            }
            this.f22116c = false;
        }
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f22116c = true;
            this.f22119f = j10;
            this.f22118e = 0;
            this.f22117d = 2;
        }
    }
}
