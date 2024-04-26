package x4;

import a6.a;
import android.net.Uri;
import android.util.Pair;
import v6.e0;
import x4.e0;

/* compiled from: Timeline */
public abstract class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final c1 f27461a = new a();

    /* compiled from: Timeline */
    public class a extends c1 {
        public int b(Object obj) {
            return -1;
        }

        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        public int i() {
            return 0;
        }

        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int p() {
            return 0;
        }
    }

    /* compiled from: Timeline */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f27462a;

        /* renamed from: b  reason: collision with root package name */
        public Object f27463b;

        /* renamed from: c  reason: collision with root package name */
        public int f27464c;

        /* renamed from: d  reason: collision with root package name */
        public long f27465d;

        /* renamed from: e  reason: collision with root package name */
        public long f27466e;

        /* renamed from: f  reason: collision with root package name */
        public a6.a f27467f = a6.a.f112g;

        public long a(int i10, int i11) {
            a.C0004a aVar = this.f27467f.f116d[i10];
            if (aVar.f119a != -1) {
                return aVar.f122d[i11];
            }
            return -9223372036854775807L;
        }

        public int b(long j10) {
            a6.a aVar = this.f27467f;
            long j11 = this.f27465d;
            aVar.getClass();
            if (j10 == Long.MIN_VALUE) {
                return -1;
            }
            if (j11 != -9223372036854775807L && j10 >= j11) {
                return -1;
            }
            int i10 = 0;
            while (true) {
                long[] jArr = aVar.f115c;
                if (i10 < jArr.length && jArr[i10] != Long.MIN_VALUE && (j10 >= jArr[i10] || !aVar.f116d[i10].b())) {
                    i10++;
                }
            }
            if (i10 < aVar.f115c.length) {
                return i10;
            }
            return -1;
        }

        public int c(long j10) {
            a6.a aVar = this.f27467f;
            long j11 = this.f27465d;
            int length = aVar.f115c.length - 1;
            while (length >= 0) {
                boolean z10 = false;
                if (j10 != Long.MIN_VALUE) {
                    long j12 = aVar.f115c[length];
                    if (j12 != Long.MIN_VALUE ? j10 < j12 : !(j11 != -9223372036854775807L && j10 >= j11)) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    break;
                }
                length--;
            }
            if (length < 0 || !aVar.f116d[length].b()) {
                return -1;
            }
            return length;
        }

        public long d(int i10) {
            return this.f27467f.f115c[i10];
        }

        public int e(int i10) {
            return this.f27467f.f116d[i10].a(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (!e0.a(this.f27462a, bVar.f27462a) || !e0.a(this.f27463b, bVar.f27463b) || this.f27464c != bVar.f27464c || this.f27465d != bVar.f27465d || this.f27466e != bVar.f27466e || !e0.a(this.f27467f, bVar.f27467f)) {
                return false;
            }
            return true;
        }

        public b f(Object obj, Object obj2, int i10, long j10, long j11) {
            a6.a aVar = a6.a.f112g;
            this.f27462a = obj;
            this.f27463b = obj2;
            this.f27464c = i10;
            this.f27465d = j10;
            this.f27466e = j11;
            this.f27467f = aVar;
            return this;
        }

        public int hashCode() {
            Object obj = this.f27462a;
            int i10 = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f27463b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            long j10 = this.f27465d;
            long j11 = this.f27466e;
            return this.f27467f.hashCode() + ((((((((hashCode + i10) * 31) + this.f27464c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
    }

    /* compiled from: Timeline */
    public static final class c {

        /* renamed from: r  reason: collision with root package name */
        public static final Object f27468r = new Object();

        /* renamed from: s  reason: collision with root package name */
        public static final e0 f27469s;

        /* renamed from: a  reason: collision with root package name */
        public Object f27470a = f27468r;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public Object f27471b;

        /* renamed from: c  reason: collision with root package name */
        public e0 f27472c = f27469s;

        /* renamed from: d  reason: collision with root package name */
        public Object f27473d;

        /* renamed from: e  reason: collision with root package name */
        public long f27474e;

        /* renamed from: f  reason: collision with root package name */
        public long f27475f;

        /* renamed from: g  reason: collision with root package name */
        public long f27476g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f27477h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f27478i;
        @Deprecated

        /* renamed from: j  reason: collision with root package name */
        public boolean f27479j;

        /* renamed from: k  reason: collision with root package name */
        public e0.f f27480k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f27481l;

        /* renamed from: m  reason: collision with root package name */
        public int f27482m;

        /* renamed from: n  reason: collision with root package name */
        public int f27483n;

        /* renamed from: o  reason: collision with root package name */
        public long f27484o;

        /* renamed from: p  reason: collision with root package name */
        public long f27485p;

        /* renamed from: q  reason: collision with root package name */
        public long f27486q;

        static {
            e0.c cVar = new e0.c();
            cVar.f27510a = "com.google.android.exoplayer2.Timeline";
            cVar.f27511b = Uri.EMPTY;
            f27469s = cVar.a();
        }

        public long a() {
            return f.c(this.f27484o);
        }

        public long b() {
            return f.c(this.f27485p);
        }

        public boolean c() {
            v6.a.d(this.f27479j == (this.f27480k != null));
            if (this.f27480k != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r1 = r1.f27504b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public x4.c1.c d(java.lang.Object r6, x4.e0 r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, x4.e0.f r17, long r18, long r20, int r22, int r23, long r24) {
            /*
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.f27470a = r3
                if (r1 == 0) goto L_0x000b
                r3 = r1
                goto L_0x000d
            L_0x000b:
                x4.e0 r3 = f27469s
            L_0x000d:
                r0.f27472c = r3
                if (r1 == 0) goto L_0x0018
                x4.e0$g r1 = r1.f27504b
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r1.f27561h
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                r0.f27471b = r1
                r1 = r8
                r0.f27473d = r1
                r3 = r9
                r0.f27474e = r3
                r3 = r11
                r0.f27475f = r3
                r3 = r13
                r0.f27476g = r3
                r1 = r15
                r0.f27477h = r1
                r1 = r16
                r0.f27478i = r1
                r1 = 0
                if (r2 == 0) goto L_0x0033
                r3 = 1
                goto L_0x0034
            L_0x0033:
                r3 = 0
            L_0x0034:
                r0.f27479j = r3
                r0.f27480k = r2
                r2 = r18
                r0.f27484o = r2
                r2 = r20
                r0.f27485p = r2
                r2 = r22
                r0.f27482m = r2
                r2 = r23
                r0.f27483n = r2
                r2 = r24
                r0.f27486q = r2
                r0.f27481l = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.c1.c.d(java.lang.Object, x4.e0, java.lang.Object, long, long, long, boolean, boolean, x4.e0$f, long, long, int, int, long):x4.c1$c");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            if (v6.e0.a(this.f27470a, cVar.f27470a) && v6.e0.a(this.f27472c, cVar.f27472c) && v6.e0.a(this.f27473d, cVar.f27473d) && v6.e0.a(this.f27480k, cVar.f27480k) && this.f27474e == cVar.f27474e && this.f27475f == cVar.f27475f && this.f27476g == cVar.f27476g && this.f27477h == cVar.f27477h && this.f27478i == cVar.f27478i && this.f27481l == cVar.f27481l && this.f27484o == cVar.f27484o && this.f27485p == cVar.f27485p && this.f27482m == cVar.f27482m && this.f27483n == cVar.f27483n && this.f27486q == cVar.f27486q) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (this.f27472c.hashCode() + ((this.f27470a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f27473d;
            int i10 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            e0.f fVar = this.f27480k;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            long j10 = this.f27474e;
            long j11 = this.f27475f;
            long j12 = this.f27476g;
            long j13 = this.f27484o;
            long j14 = this.f27485p;
            long j15 = this.f27486q;
            return ((((((((((((((((((((((hashCode2 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f27477h ? 1 : 0)) * 31) + (this.f27478i ? 1 : 0)) * 31) + (this.f27481l ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f27482m) * 31) + this.f27483n) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = g(i10, bVar, false).f27464c;
        if (n(i12, cVar).f27483n != i10) {
            return i10 + 1;
        }
        int e10 = e(i12, i11, z10);
        if (e10 == -1) {
            return -1;
        }
        return n(e10, cVar).f27482m;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == c(z10) ? a(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == c(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (c1Var.p() != p() || c1Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(c1Var.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(c1Var.g(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = p() + 217;
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, cVar).hashCode();
        }
        int i11 = i() + (p10 * 31);
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        Pair<Object, Long> k10 = k(cVar, bVar, i10, j10, 0);
        k10.getClass();
        return k10;
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        v6.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.f27484o;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f27482m;
        long j12 = cVar.f27486q + j10;
        long j13 = g(i11, bVar, true).f27465d;
        while (j13 != -9223372036854775807L && j12 >= j13 && i11 < cVar.f27483n) {
            j12 -= j13;
            i11++;
            j13 = g(i11, bVar, true).f27465d;
        }
        Object obj = bVar.f27463b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(j12));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == a(z10) ? c(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else if (i10 == a(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
