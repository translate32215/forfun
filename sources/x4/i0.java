package x4;

import a6.a;
import android.os.Handler;
import android.util.Pair;
import androidx.emoji2.text.f;
import ba.s;
import v6.a;
import x4.c1;
import y4.v;
import z5.r;

/* compiled from: MediaPeriodQueue */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final c1.b f27613a = new c1.b();

    /* renamed from: b  reason: collision with root package name */
    public final c1.c f27614b = new c1.c();

    /* renamed from: c  reason: collision with root package name */
    public final v f27615c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f27616d;

    /* renamed from: e  reason: collision with root package name */
    public long f27617e;

    /* renamed from: f  reason: collision with root package name */
    public int f27618f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27619g;

    /* renamed from: h  reason: collision with root package name */
    public g0 f27620h;

    /* renamed from: i  reason: collision with root package name */
    public g0 f27621i;

    /* renamed from: j  reason: collision with root package name */
    public g0 f27622j;

    /* renamed from: k  reason: collision with root package name */
    public int f27623k;

    /* renamed from: l  reason: collision with root package name */
    public Object f27624l;

    /* renamed from: m  reason: collision with root package name */
    public long f27625m;

    public i0(v vVar, Handler handler) {
        this.f27615c = vVar;
        this.f27616d = handler;
    }

    public static r.a o(c1 c1Var, Object obj, long j10, long j11, c1.b bVar) {
        c1Var.h(obj, bVar);
        int c10 = bVar.c(j10);
        if (c10 == -1) {
            return new r.a(obj, j11, bVar.b(j10));
        }
        return new r.a(obj, c10, bVar.e(c10), j11);
    }

    public g0 a() {
        g0 g0Var = this.f27620h;
        if (g0Var == null) {
            return null;
        }
        if (g0Var == this.f27621i) {
            this.f27621i = g0Var.f27583l;
        }
        g0Var.h();
        int i10 = this.f27623k - 1;
        this.f27623k = i10;
        if (i10 == 0) {
            this.f27622j = null;
            g0 g0Var2 = this.f27620h;
            this.f27624l = g0Var2.f27573b;
            this.f27625m = g0Var2.f27577f.f27590a.f28630d;
        }
        this.f27620h = this.f27620h.f27583l;
        k();
        return this.f27620h;
    }

    public void b() {
        if (this.f27623k != 0) {
            g0 g0Var = this.f27620h;
            a.f(g0Var);
            g0 g0Var2 = g0Var;
            this.f27624l = g0Var2.f27573b;
            this.f27625m = g0Var2.f27577f.f27590a.f28630d;
            while (g0Var2 != null) {
                g0Var2.h();
                g0Var2 = g0Var2.f27583l;
            }
            this.f27620h = null;
            this.f27622j = null;
            this.f27621i = null;
            this.f27623k = 0;
            k();
        }
    }

    public final h0 c(c1 c1Var, g0 g0Var, long j10) {
        long j11;
        c1 c1Var2 = c1Var;
        g0 g0Var2 = g0Var;
        h0 h0Var = g0Var2.f27577f;
        long j12 = (g0Var2.f27586o + h0Var.f27594e) - j10;
        if (h0Var.f27595f) {
            long j13 = 0;
            int d10 = c1Var.d(c1Var2.b(h0Var.f27590a.f28627a), this.f27613a, this.f27614b, this.f27618f, this.f27619g);
            if (d10 == -1) {
                return null;
            }
            int i10 = c1Var2.g(d10, this.f27613a, true).f27464c;
            Object obj = this.f27613a.f27463b;
            long j14 = h0Var.f27590a.f28630d;
            if (c1Var2.n(i10, this.f27614b).f27482m == d10) {
                Pair<Object, Long> k10 = c1Var.k(this.f27614b, this.f27613a, i10, -9223372036854775807L, Math.max(0, j12));
                if (k10 == null) {
                    return null;
                }
                obj = k10.first;
                long longValue = ((Long) k10.second).longValue();
                g0 g0Var3 = g0Var2.f27583l;
                if (g0Var3 == null || !g0Var3.f27573b.equals(obj)) {
                    j14 = this.f27617e;
                    this.f27617e = 1 + j14;
                } else {
                    j14 = g0Var3.f27577f.f27590a.f28630d;
                }
                j11 = longValue;
                j13 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            return d(c1Var, o(c1Var, obj, j11, j14, this.f27613a), j13, j11);
        }
        r.a aVar = h0Var.f27590a;
        c1Var2.h(aVar.f28627a, this.f27613a);
        if (aVar.a()) {
            int i11 = aVar.f28628b;
            a.C0004a[] aVarArr = this.f27613a.f27467f.f116d;
            int i12 = aVarArr[i11].f119a;
            if (i12 == -1) {
                return null;
            }
            int a10 = aVarArr[i11].a(aVar.f28629c);
            if (a10 < i12) {
                return e(c1Var, aVar.f28627a, i11, a10, h0Var.f27592c, aVar.f28630d);
            }
            long j15 = h0Var.f27592c;
            if (j15 == -9223372036854775807L) {
                c1.c cVar = this.f27614b;
                c1.b bVar = this.f27613a;
                Pair<Object, Long> k11 = c1Var.k(cVar, bVar, bVar.f27464c, -9223372036854775807L, Math.max(0, j12));
                if (k11 == null) {
                    return null;
                }
                j15 = ((Long) k11.second).longValue();
            }
            return f(c1Var, aVar.f28627a, j15, h0Var.f27592c, aVar.f28630d);
        }
        int c10 = this.f27613a.c(h0Var.f27593d);
        if (c10 == -1) {
            Object obj2 = aVar.f28627a;
            long j16 = h0Var.f27594e;
            return f(c1Var, obj2, j16, j16, aVar.f28630d);
        }
        return e(c1Var, aVar.f28627a, c10, this.f27613a.e(c10), h0Var.f27594e, aVar.f28630d);
    }

    public final h0 d(c1 c1Var, r.a aVar, long j10, long j11) {
        r.a aVar2 = aVar;
        c1 c1Var2 = c1Var;
        c1Var.h(aVar2.f28627a, this.f27613a);
        if (aVar.a()) {
            return e(c1Var, aVar2.f28627a, aVar2.f28628b, aVar2.f28629c, j10, aVar2.f28630d);
        }
        return f(c1Var, aVar2.f28627a, j11, j10, aVar2.f28630d);
    }

    public final h0 e(c1 c1Var, Object obj, int i10, int i11, long j10, long j11) {
        int i12 = i10;
        int i13 = i11;
        r.a aVar = new r.a(obj, i10, i11, j11);
        long a10 = c1Var.h(obj, this.f27613a).a(i12, i13);
        long j12 = i13 == this.f27613a.f27467f.f116d[i12].a(-1) ? this.f27613a.f27467f.f117e : 0;
        return new h0(aVar, (a10 == -9223372036854775807L || j12 < a10) ? j12 : Math.max(0, a10 - 1), j10, -9223372036854775807L, a10, false, false, false);
    }

    public final h0 f(c1 c1Var, Object obj, long j10, long j11, long j12) {
        long j13;
        c1 c1Var2 = c1Var;
        Object obj2 = obj;
        long j14 = j10;
        c1Var2.h(obj2, this.f27613a);
        int b10 = this.f27613a.b(j14);
        r.a aVar = new r.a(obj2, j12, b10);
        boolean h10 = h(aVar);
        boolean j15 = j(c1Var2, aVar);
        boolean i10 = i(c1Var2, aVar, h10);
        long d10 = b10 != -1 ? this.f27613a.d(b10) : -9223372036854775807L;
        if (d10 == -9223372036854775807L || d10 == Long.MIN_VALUE) {
            j13 = this.f27613a.f27465d;
        } else {
            j13 = d10;
        }
        if (j13 != -9223372036854775807L && j14 >= j13) {
            j14 = Math.max(0, j13 - 1);
        }
        return new h0(aVar, j14, j11, d10, j13, h10, j15, i10);
    }

    public h0 g(c1 c1Var, h0 h0Var) {
        long j10;
        r.a aVar = h0Var.f27590a;
        boolean h10 = h(aVar);
        boolean j11 = j(c1Var, aVar);
        boolean i10 = i(c1Var, aVar, h10);
        c1Var.h(h0Var.f27590a.f28627a, this.f27613a);
        if (aVar.a()) {
            j10 = this.f27613a.a(aVar.f28628b, aVar.f28629c);
        } else {
            j10 = h0Var.f27593d;
            if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
                j10 = this.f27613a.f27465d;
            }
        }
        return new h0(aVar, h0Var.f27591b, h0Var.f27592c, h0Var.f27593d, j10, h10, j11, i10);
    }

    public final boolean h(r.a aVar) {
        return !aVar.a() && aVar.f28631e == -1;
    }

    public final boolean i(c1 c1Var, r.a aVar, boolean z10) {
        int b10 = c1Var.b(aVar.f28627a);
        if (c1Var.n(c1Var.f(b10, this.f27613a).f27464c, this.f27614b).f27478i) {
            return false;
        }
        if (!(c1Var.d(b10, this.f27613a, this.f27614b, this.f27618f, this.f27619g) == -1) || !z10) {
            return false;
        }
        return true;
    }

    public final boolean j(c1 c1Var, r.a aVar) {
        if (!h(aVar)) {
            return false;
        }
        int i10 = c1Var.h(aVar.f28627a, this.f27613a).f27464c;
        if (c1Var.n(i10, this.f27614b).f27483n == c1Var.b(aVar.f28627a)) {
            return true;
        }
        return false;
    }

    public final void k() {
        if (this.f27615c != null) {
            ba.a<Object> aVar = s.f3795b;
            s.a aVar2 = new s.a();
            for (g0 g0Var = this.f27620h; g0Var != null; g0Var = g0Var.f27583l) {
                aVar2.b(g0Var.f27577f.f27590a);
            }
            g0 g0Var2 = this.f27621i;
            this.f27616d.post(new f(this, aVar2, g0Var2 == null ? null : g0Var2.f27577f.f27590a));
        }
    }

    public void l(long j10) {
        g0 g0Var = this.f27622j;
        if (g0Var != null) {
            v6.a.d(g0Var.g());
            if (g0Var.f27575d) {
                g0Var.f27572a.g(j10 - g0Var.f27586o);
            }
        }
    }

    public boolean m(g0 g0Var) {
        boolean z10 = false;
        v6.a.d(g0Var != null);
        if (g0Var.equals(this.f27622j)) {
            return false;
        }
        this.f27622j = g0Var;
        while (true) {
            g0Var = g0Var.f27583l;
            if (g0Var == null) {
                break;
            }
            if (g0Var == this.f27621i) {
                this.f27621i = this.f27620h;
                z10 = true;
            }
            g0Var.h();
            this.f27623k--;
        }
        g0 g0Var2 = this.f27622j;
        if (g0Var2.f27583l != null) {
            g0Var2.b();
            g0Var2.f27583l = null;
            g0Var2.c();
        }
        k();
        return z10;
    }

    public r.a n(c1 c1Var, Object obj, long j10) {
        long j11;
        int b10;
        int i10 = c1Var.h(obj, this.f27613a).f27464c;
        Object obj2 = this.f27624l;
        if (obj2 == null || (b10 = c1Var.b(obj2)) == -1 || c1Var.f(b10, this.f27613a).f27464c != i10) {
            g0 g0Var = this.f27620h;
            while (true) {
                if (g0Var == null) {
                    g0 g0Var2 = this.f27620h;
                    while (true) {
                        if (g0Var2 != null) {
                            int b11 = c1Var.b(g0Var2.f27573b);
                            if (b11 != -1 && c1Var.f(b11, this.f27613a).f27464c == i10) {
                                j11 = g0Var2.f27577f.f27590a.f28630d;
                                break;
                            }
                            g0Var2 = g0Var2.f27583l;
                        } else {
                            j11 = this.f27617e;
                            this.f27617e = 1 + j11;
                            if (this.f27620h == null) {
                                this.f27624l = obj;
                                this.f27625m = j11;
                            }
                        }
                    }
                } else if (g0Var.f27573b.equals(obj)) {
                    j11 = g0Var.f27577f.f27590a.f28630d;
                    break;
                } else {
                    g0Var = g0Var.f27583l;
                }
            }
        } else {
            j11 = this.f27625m;
        }
        return o(c1Var, obj, j10, j11, this.f27613a);
    }

    public final boolean p(c1 c1Var) {
        g0 g0Var;
        g0 g0Var2 = this.f27620h;
        if (g0Var2 == null) {
            return true;
        }
        int b10 = c1Var.b(g0Var2.f27573b);
        while (true) {
            b10 = c1Var.d(b10, this.f27613a, this.f27614b, this.f27618f, this.f27619g);
            while (true) {
                g0Var = g0Var2.f27583l;
                if (g0Var != null && !g0Var2.f27577f.f27595f) {
                    g0Var2 = g0Var;
                }
            }
            if (b10 == -1 || g0Var == null || c1Var.b(g0Var.f27573b) != b10) {
                boolean m10 = m(g0Var2);
                g0Var2.f27577f = g(c1Var, g0Var2.f27577f);
            } else {
                g0Var2 = g0Var;
            }
        }
        boolean m102 = m(g0Var2);
        g0Var2.f27577f = g(c1Var, g0Var2.f27577f);
        return !m102;
    }

    public boolean q(c1 c1Var, long j10, long j11) {
        h0 h0Var;
        long j12;
        boolean m10;
        c1 c1Var2 = c1Var;
        g0 g0Var = this.f27620h;
        g0 g0Var2 = null;
        while (g0Var != null) {
            h0 h0Var2 = g0Var.f27577f;
            if (g0Var2 == null) {
                h0Var = g(c1Var2, h0Var2);
                long j13 = j10;
            } else {
                h0 c10 = c(c1Var2, g0Var2, j10);
                if (c10 == null) {
                    m10 = m(g0Var2);
                } else {
                    if (!(h0Var2.f27591b == c10.f27591b && h0Var2.f27590a.equals(c10.f27590a))) {
                        m10 = m(g0Var2);
                    } else {
                        h0Var = c10;
                    }
                }
                return !m10;
            }
            g0Var.f27577f = h0Var.a(h0Var2.f27592c);
            long j14 = h0Var2.f27594e;
            long j15 = h0Var.f27594e;
            if (!(j14 == -9223372036854775807L || j14 == j15)) {
                if (j15 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = g0Var.f27586o + j15;
                }
                boolean z10 = g0Var == this.f27621i && (j11 == Long.MIN_VALUE || j11 >= j12);
                if (m(g0Var) || z10) {
                    return false;
                }
                return true;
            }
            g0Var2 = g0Var;
            g0Var = g0Var.f27583l;
        }
        return true;
    }
}
