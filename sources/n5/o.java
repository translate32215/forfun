package n5;

import android.util.Log;
import d5.a0;
import d5.k;
import n5.e0;
import v6.a;
import v6.v;
import x4.b0;

/* compiled from: Id3Reader */
public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    public final v f22244a = new v(10);

    /* renamed from: b  reason: collision with root package name */
    public a0 f22245b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22246c;

    /* renamed from: d  reason: collision with root package name */
    public long f22247d;

    /* renamed from: e  reason: collision with root package name */
    public int f22248e;

    /* renamed from: f  reason: collision with root package name */
    public int f22249f;

    public void a() {
        this.f22246c = false;
    }

    public void c(v vVar) {
        a.f(this.f22245b);
        if (this.f22246c) {
            int a10 = vVar.a();
            int i10 = this.f22249f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(vVar.f26518a, vVar.f26519b, this.f22244a.f26518a, this.f22249f, min);
                if (this.f22249f + min == 10) {
                    this.f22244a.D(0);
                    if (73 == this.f22244a.s() && 68 == this.f22244a.s() && 51 == this.f22244a.s()) {
                        this.f22244a.E(3);
                        this.f22248e = this.f22244a.r() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f22246c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f22248e - this.f22249f);
            this.f22245b.b(vVar, min2);
            this.f22249f += min2;
        }
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        a0 l10 = kVar.l(dVar.c(), 5);
        this.f22245b = l10;
        b0.b bVar = new b0.b();
        bVar.f27415a = dVar.b();
        bVar.f27425k = "application/id3";
        l10.c(bVar.a());
    }

    public void e() {
        int i10;
        a.f(this.f22245b);
        if (this.f22246c && (i10 = this.f22248e) != 0 && this.f22249f == i10) {
            this.f22245b.d(this.f22247d, 1, i10, 0, (a0.a) null);
            this.f22246c = false;
        }
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f22246c = true;
            this.f22247d = j10;
            this.f22248e = 0;
            this.f22249f = 0;
        }
    }
}
