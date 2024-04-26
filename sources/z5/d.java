package z5;

import a5.f;
import java.io.IOException;
import m3.t;
import v6.e0;
import x4.b0;
import x4.z0;
import z5.o;

/* compiled from: ClippingMediaPeriod */
public final class d implements o, o.a {

    /* renamed from: a  reason: collision with root package name */
    public final o f28547a;

    /* renamed from: b  reason: collision with root package name */
    public o.a f28548b;

    /* renamed from: c  reason: collision with root package name */
    public a[] f28549c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    public long f28550d;

    /* renamed from: e  reason: collision with root package name */
    public long f28551e;

    /* renamed from: f  reason: collision with root package name */
    public long f28552f;

    /* compiled from: ClippingMediaPeriod */
    public final class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f28553a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f28554b;

        public a(b0 b0Var) {
            this.f28553a = b0Var;
        }

        public void b() throws IOException {
            this.f28553a.b();
        }

        /* JADX WARNING: type inference failed for: r12v4, types: [x4.b0, java.util.Map<k3.c, m3.m<?>>] */
        public int d(t tVar, f fVar, boolean z10) {
            if (d.this.b()) {
                return -3;
            }
            if (this.f28554b) {
                fVar.f61a = 4;
                return -4;
            }
            int d10 = this.f28553a.d(tVar, fVar, z10);
            if (d10 == -5) {
                b0 b0Var = (b0) tVar.f21666b;
                b0Var.getClass();
                int i10 = b0Var.J;
                if (!(i10 == 0 && b0Var.K == 0)) {
                    d dVar = d.this;
                    int i11 = 0;
                    if (dVar.f28551e != 0) {
                        i10 = 0;
                    }
                    if (dVar.f28552f == Long.MIN_VALUE) {
                        i11 = b0Var.K;
                    }
                    b0.b a10 = b0Var.a();
                    a10.A = i10;
                    a10.B = i11;
                    tVar.f21666b = a10.a();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f28552f;
            if (j10 == Long.MIN_VALUE || ((d10 != -4 || fVar.f88e < j10) && (d10 != -3 || dVar2.e() != Long.MIN_VALUE || fVar.f87d))) {
                return d10;
            }
            fVar.t();
            fVar.f61a = 4;
            this.f28554b = true;
            return -4;
        }

        public boolean isReady() {
            return !d.this.b() && this.f28553a.isReady();
        }

        public int l(long j10) {
            if (d.this.b()) {
                return -3;
            }
            return this.f28553a.l(j10);
        }
    }

    public d(o oVar, boolean z10, long j10, long j11) {
        this.f28547a = oVar;
        this.f28550d = z10 ? j10 : -9223372036854775807L;
        this.f28551e = j10;
        this.f28552f = j11;
    }

    public void A(long j10, boolean z10) {
        this.f28547a.A(j10, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > r7) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long D(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f28550d = r0
            z5.d$a[] r0 = r6.f28549c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.f28554b = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            z5.o r0 = r6.f28547a
            long r0 = r0.D(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            long r7 = r6.f28551e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0034
            long r7 = r6.f28552f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0033
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            v6.a.d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.d.D(long):long");
    }

    public void E(o.a aVar, long j10) {
        this.f28548b = aVar;
        this.f28547a.E(this, j10);
    }

    public long a() {
        long a10 = this.f28547a.a();
        if (a10 != Long.MIN_VALUE) {
            long j10 = this.f28552f;
            if (j10 == Long.MIN_VALUE || a10 < j10) {
                return a10;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean b() {
        return this.f28550d != -9223372036854775807L;
    }

    public long c(long j10, z0 z0Var) {
        long j11 = this.f28551e;
        if (j10 == j11) {
            return j11;
        }
        long j12 = e0.j(z0Var.f27811a, 0, j10 - j11);
        long j13 = z0Var.f27812b;
        long j14 = this.f28552f;
        long j15 = e0.j(j13, 0, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (!(j12 == z0Var.f27811a && j15 == z0Var.f27812b)) {
            z0Var = new z0(j12, j15);
        }
        return this.f28547a.c(j10, z0Var);
    }

    public void d(c0 c0Var) {
        o oVar = (o) c0Var;
        o.a aVar = this.f28548b;
        aVar.getClass();
        aVar.d(this);
    }

    public long e() {
        long e10 = this.f28547a.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.f28552f;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean f(long j10) {
        return this.f28547a.f(j10);
    }

    public void g(long j10) {
        this.f28547a.g(j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r1 > r5) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long i(r6.h[] r16, boolean[] r17, z5.b0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            z5.d$a[] r1 = new z5.d.a[r1]
            r0.f28549c = r1
            int r1 = r9.length
            z5.b0[] r10 = new z5.b0[r1]
            r11 = 0
            r1 = 0
        L_0x000f:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0028
            z5.d$a[] r2 = r0.f28549c
            r3 = r9[r1]
            z5.d$a r3 = (z5.d.a) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L_0x0023
            r2 = r2[r1]
            z5.b0 r12 = r2.f28553a
        L_0x0023:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0028:
            z5.o r1 = r0.f28547a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.i(r2, r3, r4, r5, r6)
            boolean r3 = r15.b()
            r4 = 1
            if (r3 == 0) goto L_0x006a
            long r5 = r0.f28551e
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x006a
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0065
            int r3 = r8.length
            r5 = 0
        L_0x004c:
            if (r5 >= r3) goto L_0x0065
            r6 = r8[r5]
            if (r6 == 0) goto L_0x0062
            x4.b0 r6 = r6.k()
            java.lang.String r7 = r6.f27408t
            java.lang.String r6 = r6.f27405i
            boolean r6 = v6.s.a(r7, r6)
            if (r6 != 0) goto L_0x0062
            r3 = 1
            goto L_0x0066
        L_0x0062:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x0065:
            r3 = 0
        L_0x0066:
            if (r3 == 0) goto L_0x006a
            r5 = r1
            goto L_0x006f
        L_0x006a:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006f:
            r0.f28550d = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0089
            long r5 = r0.f28551e
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0088
            long r5 = r0.f28552f
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0089
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            v6.a.d(r4)
        L_0x008c:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00b8
            r3 = r10[r11]
            if (r3 != 0) goto L_0x0098
            z5.d$a[] r3 = r0.f28549c
            r3[r11] = r12
            goto L_0x00af
        L_0x0098:
            z5.d$a[] r3 = r0.f28549c
            r4 = r3[r11]
            if (r4 == 0) goto L_0x00a6
            r4 = r3[r11]
            z5.b0 r4 = r4.f28553a
            r5 = r10[r11]
            if (r4 == r5) goto L_0x00af
        L_0x00a6:
            z5.d$a r4 = new z5.d$a
            r5 = r10[r11]
            r4.<init>(r5)
            r3[r11] = r4
        L_0x00af:
            z5.d$a[] r3 = r0.f28549c
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x008c
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.d.i(r6.h[], boolean[], z5.b0[], boolean[], long):long");
    }

    public boolean j() {
        return this.f28547a.j();
    }

    public void k(o oVar) {
        o.a aVar = this.f28548b;
        aVar.getClass();
        aVar.k(this);
    }

    public long r() {
        if (b()) {
            long j10 = this.f28550d;
            this.f28550d = -9223372036854775807L;
            long r10 = r();
            return r10 != -9223372036854775807L ? r10 : j10;
        }
        long r11 = this.f28547a.r();
        if (r11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        v6.a.d(r11 >= this.f28551e);
        long j11 = this.f28552f;
        if (j11 != Long.MIN_VALUE && r11 > j11) {
            z10 = false;
        }
        v6.a.d(z10);
        return r11;
    }

    public g0 v() {
        return this.f28547a.v();
    }

    public void y() throws IOException {
        this.f28547a.y();
    }
}
