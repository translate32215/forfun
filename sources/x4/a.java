package x4;

import android.util.Pair;
import v6.e0;
import x4.c1;
import z5.d0;

/* compiled from: AbstractConcatenatedTimeline */
public abstract class a extends c1 {

    /* renamed from: b  reason: collision with root package name */
    public final int f27345b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f27346c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27347d;

    public a(boolean z10, d0 d0Var) {
        this.f27347d = z10;
        this.f27346c = d0Var;
        this.f27345b = d0Var.b();
    }

    public int a(boolean z10) {
        if (this.f27345b == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f27347d) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f27346c.e();
        }
        do {
            t0 t0Var = (t0) this;
            if (t0Var.f27729i[i10].q()) {
                i10 = r(i10, z10);
            } else {
                return t0Var.f27729i[i10].a(z10) + t0Var.f27728h[i10];
            }
        } while (i10 != -1);
        return -1;
    }

    public final int b(Object obj) {
        int i10;
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        t0 t0Var = (t0) this;
        Integer num = t0Var.f27731k.get(obj2);
        if (num == null) {
            i10 = -1;
        } else {
            i10 = num.intValue();
        }
        if (i10 == -1 || (b10 = t0Var.f27729i[i10].b(obj3)) == -1) {
            return -1;
        }
        return t0Var.f27727g[i10] + b10;
    }

    public int c(boolean z10) {
        int i10 = this.f27345b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f27347d) {
            z10 = false;
        }
        int g10 = z10 ? this.f27346c.g() : i10 - 1;
        do {
            t0 t0Var = (t0) this;
            if (t0Var.f27729i[g10].q()) {
                g10 = s(g10, z10);
            } else {
                return t0Var.f27729i[g10].c(z10) + t0Var.f27728h[g10];
            }
        } while (g10 != -1);
        return -1;
    }

    public int e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f27347d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        t0 t0Var = (t0) this;
        int e10 = e0.e(t0Var.f27728h, i10 + 1, false, false);
        int i13 = t0Var.f27728h[e10];
        c1 c1Var = t0Var.f27729i[e10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int e11 = c1Var.e(i14, i12, z10);
        if (e11 != -1) {
            return i13 + e11;
        }
        int r10 = r(e10, z10);
        while (r10 != -1 && t0Var.f27729i[r10].q()) {
            r10 = r(r10, z10);
        }
        if (r10 != -1) {
            return t0Var.f27729i[r10].a(z10) + t0Var.f27728h[r10];
        } else if (i11 == 2) {
            return a(z10);
        } else {
            return -1;
        }
    }

    public final c1.b g(int i10, c1.b bVar, boolean z10) {
        t0 t0Var = (t0) this;
        int e10 = e0.e(t0Var.f27727g, i10 + 1, false, false);
        int i11 = t0Var.f27728h[e10];
        t0Var.f27729i[e10].g(i10 - t0Var.f27727g[e10], bVar, z10);
        bVar.f27464c += i11;
        if (z10) {
            Object obj = t0Var.f27730j[e10];
            Object obj2 = bVar.f27463b;
            obj2.getClass();
            bVar.f27463b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    public final c1.b h(Object obj, c1.b bVar) {
        int i10;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        t0 t0Var = (t0) this;
        Integer num = t0Var.f27731k.get(obj2);
        if (num == null) {
            i10 = -1;
        } else {
            i10 = num.intValue();
        }
        int i11 = t0Var.f27728h[i10];
        t0Var.f27729i[i10].h(obj3, bVar);
        bVar.f27464c += i11;
        bVar.f27463b = obj;
        return bVar;
    }

    public int l(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f27347d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        t0 t0Var = (t0) this;
        int e10 = e0.e(t0Var.f27728h, i10 + 1, false, false);
        int i13 = t0Var.f27728h[e10];
        c1 c1Var = t0Var.f27729i[e10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = c1Var.l(i14, i12, z10);
        if (l10 != -1) {
            return i13 + l10;
        }
        int s10 = s(e10, z10);
        while (s10 != -1 && t0Var.f27729i[s10].q()) {
            s10 = s(s10, z10);
        }
        if (s10 != -1) {
            return t0Var.f27729i[s10].c(z10) + t0Var.f27728h[s10];
        } else if (i11 == 2) {
            return c(z10);
        } else {
            return -1;
        }
    }

    public final Object m(int i10) {
        t0 t0Var = (t0) this;
        int e10 = e0.e(t0Var.f27727g, i10 + 1, false, false);
        return Pair.create(t0Var.f27730j[e10], t0Var.f27729i[e10].m(i10 - t0Var.f27727g[e10]));
    }

    public final c1.c o(int i10, c1.c cVar, long j10) {
        t0 t0Var = (t0) this;
        int e10 = e0.e(t0Var.f27728h, i10 + 1, false, false);
        int i11 = t0Var.f27728h[e10];
        int i12 = t0Var.f27727g[e10];
        t0Var.f27729i[e10].o(i10 - i11, cVar, j10);
        Object obj = t0Var.f27730j[e10];
        if (!c1.c.f27468r.equals(cVar.f27470a)) {
            obj = Pair.create(obj, cVar.f27470a);
        }
        cVar.f27470a = obj;
        cVar.f27482m += i12;
        cVar.f27483n += i12;
        return cVar;
    }

    public final int r(int i10, boolean z10) {
        if (z10) {
            return this.f27346c.c(i10);
        }
        if (i10 < this.f27345b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int s(int i10, boolean z10) {
        if (z10) {
            return this.f27346c.f(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }
}
