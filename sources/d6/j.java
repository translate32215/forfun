package d6;

import java.util.List;
import v6.e0;
import x4.b0;

/* compiled from: SegmentBase */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final h f13131a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13132b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13133c;

    /* compiled from: SegmentBase */
    public static abstract class a extends j {

        /* renamed from: d  reason: collision with root package name */
        public final long f13134d;

        /* renamed from: e  reason: collision with root package name */
        public final long f13135e;

        /* renamed from: f  reason: collision with root package name */
        public final List<d> f13136f;

        /* renamed from: g  reason: collision with root package name */
        public final long f13137g;

        /* renamed from: h  reason: collision with root package name */
        public final long f13138h;

        /* renamed from: i  reason: collision with root package name */
        public final long f13139i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(hVar, j10, j11);
            this.f13134d = j12;
            this.f13135e = j13;
            this.f13136f = list;
            this.f13139i = j14;
            this.f13137g = j15;
            this.f13138h = j16;
        }

        public int b(long j10, long j11) {
            int d10 = d(j10);
            if (d10 != -1) {
                return d10;
            }
            return (int) (f((j11 - this.f13138h) + this.f13139i, j10) - c(j10, j11));
        }

        public long c(long j10, long j11) {
            if (((long) d(j10)) == -1) {
                long j12 = this.f13137g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(this.f13134d, f((j11 - this.f13138h) - j12, j10));
                }
            }
            return this.f13134d;
        }

        public abstract int d(long j10);

        public final long e(long j10, long j11) {
            List<d> list = this.f13136f;
            if (list != null) {
                return (list.get((int) (j10 - this.f13134d)).f13145b * 1000000) / this.f13132b;
            }
            int d10 = d(j11);
            if (d10 == -1 || j10 != (this.f13134d + ((long) d10)) - 1) {
                return (this.f13135e * 1000000) / this.f13132b;
            }
            return j11 - g(j10);
        }

        public long f(long j10, long j11) {
            long j12 = this.f13134d;
            long d10 = (long) d(j11);
            if (d10 == 0) {
                return j12;
            }
            if (this.f13136f == null) {
                long j13 = (j10 / ((this.f13135e * 1000000) / this.f13132b)) + this.f13134d;
                if (j13 < j12) {
                    return j12;
                }
                if (d10 == -1) {
                    return j13;
                }
                return Math.min(j13, (j12 + d10) - 1);
            }
            long j14 = (d10 + j12) - 1;
            long j15 = j12;
            while (j15 <= j14) {
                long j16 = ((j14 - j15) / 2) + j15;
                long g10 = g(j16);
                if (g10 < j10) {
                    j15 = j16 + 1;
                } else if (g10 <= j10) {
                    return j16;
                } else {
                    j14 = j16 - 1;
                }
            }
            return j15 == j12 ? j15 : j14;
        }

        public final long g(long j10) {
            long j11;
            List<d> list = this.f13136f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f13134d)).f13144a - this.f13133c;
            } else {
                j11 = (j10 - this.f13134d) * this.f13135e;
            }
            return e0.P(j11, 1000000, this.f13132b);
        }

        public abstract h h(i iVar, long j10);

        public boolean i() {
            return this.f13136f != null;
        }
    }

    /* compiled from: SegmentBase */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        public final List<h> f13140j;

        public b(h hVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<h> list2, long j15, long j16) {
            super(hVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f13140j = list2;
        }

        public int d(long j10) {
            return this.f13140j.size();
        }

        public h h(i iVar, long j10) {
            return this.f13140j.get((int) (j10 - this.f13134d));
        }

        public boolean i() {
            return true;
        }
    }

    /* compiled from: SegmentBase */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        public final l f13141j;

        /* renamed from: k  reason: collision with root package name */
        public final l f13142k;

        /* renamed from: l  reason: collision with root package name */
        public final long f13143l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h hVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, l lVar, l lVar2, long j16, long j17) {
            super(hVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f13141j = lVar;
            this.f13142k = lVar2;
            this.f13143l = j13;
        }

        public h a(i iVar) {
            l lVar = this.f13141j;
            if (lVar == null) {
                return this.f13131a;
            }
            b0 b0Var = iVar.f13122a;
            return new h(lVar.a(b0Var.f27397a, 0, b0Var.f27404h, 0), 0, -1);
        }

        public int d(long j10) {
            List<d> list = this.f13136f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f13143l;
            if (j11 != -1) {
                return (int) ((j11 - this.f13134d) + 1);
            }
            if (j10 == -9223372036854775807L) {
                return -1;
            }
            long j12 = (this.f13135e * 1000000) / this.f13132b;
            int i10 = e0.f26436a;
            return (int) (((j10 + j12) - 1) / j12);
        }

        public h h(i iVar, long j10) {
            long j11;
            List<d> list = this.f13136f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f13134d)).f13144a;
            } else {
                j11 = (j10 - this.f13134d) * this.f13135e;
            }
            long j12 = j11;
            l lVar = this.f13142k;
            b0 b0Var = iVar.f13122a;
            return new h(lVar.a(b0Var.f27397a, j10, b0Var.f27404h, j12), 0, -1);
        }
    }

    /* compiled from: SegmentBase */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f13144a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13145b;

        public d(long j10, long j11) {
            this.f13144a = j10;
            this.f13145b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f13144a == dVar.f13144a && this.f13145b == dVar.f13145b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f13144a) * 31) + ((int) this.f13145b);
        }
    }

    public j(h hVar, long j10, long j11) {
        this.f13131a = hVar;
        this.f13132b = j10;
        this.f13133c = j11;
    }

    public h a(i iVar) {
        return this.f13131a;
    }

    /* compiled from: SegmentBase */
    public static class e extends j {

        /* renamed from: d  reason: collision with root package name */
        public final long f13146d;

        /* renamed from: e  reason: collision with root package name */
        public final long f13147e;

        public e() {
            super((h) null, 1, 0);
            this.f13146d = 0;
            this.f13147e = 0;
        }

        public e(h hVar, long j10, long j11, long j12, long j13) {
            super(hVar, j10, j11);
            this.f13146d = j12;
            this.f13147e = j13;
        }
    }
}
