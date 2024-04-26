package n5;

import android.util.SparseArray;
import d5.i;
import d5.j;
import d5.k;
import java.io.IOException;
import q.e;
import v6.b0;
import v6.v;

/* compiled from: PsExtractor */
public final class w implements i {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f22313a = new b0(0);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a> f22314b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public final v f22315c = new v(4096);

    /* renamed from: d  reason: collision with root package name */
    public final v f22316d = new v();

    /* renamed from: e  reason: collision with root package name */
    public boolean f22317e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22318f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22319g;

    /* renamed from: h  reason: collision with root package name */
    public long f22320h;

    /* renamed from: i  reason: collision with root package name */
    public u f22321i;

    /* renamed from: j  reason: collision with root package name */
    public k f22322j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f22323k;

    /* compiled from: PsExtractor */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f22324a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f22325b;

        /* renamed from: c  reason: collision with root package name */
        public final d5.b0 f22326c = new d5.b0(new byte[64], 1, (e) null);

        /* renamed from: d  reason: collision with root package name */
        public boolean f22327d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22328e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f22329f;

        /* renamed from: g  reason: collision with root package name */
        public long f22330g;

        public a(j jVar, b0 b0Var) {
            this.f22324a = jVar;
            this.f22325b = b0Var;
        }
    }

    static {
        c5.a aVar = c5.a.f4254a;
    }

    public void a() {
    }

    public boolean e(j jVar) throws IOException {
        byte[] bArr = new byte[14];
        jVar.j(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jVar.k(bArr[13] & 7);
        jVar.j(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0210  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r18, d5.w r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            d5.k r3 = r0.f22322j
            v6.a.f(r3)
            long r10 = r18.b()
            r12 = -1
            r3 = 1
            r14 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = 442(0x1ba, float:6.2E-43)
            if (r4 == 0) goto L_0x00fb
            n5.v r4 = r0.f22316d
            boolean r7 = r4.f22307c
            if (r7 != 0) goto L_0x00fb
            boolean r7 = r4.f22309e
            r8 = 20000(0x4e20, double:9.8813E-320)
            if (r7 != 0) goto L_0x007e
            long r10 = r18.b()
            long r7 = java.lang.Math.min(r8, r10)
            int r8 = (int) r7
            long r12 = (long) r8
            long r10 = r10 - r12
            long r12 = r18.l()
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0046
            r2.f13063a = r10
            goto L_0x00da
        L_0x0046:
            v6.v r2 = r4.f22306b
            r2.z(r8)
            r18.f()
            v6.v r2 = r4.f22306b
            byte[] r2 = r2.f26518a
            r1.j(r2, r14, r8)
            v6.v r1 = r4.f22306b
            int r2 = r1.f26519b
            int r7 = r1.f26520c
            int r7 = r7 + -4
        L_0x005d:
            if (r7 < r2) goto L_0x0079
            byte[] r8 = r1.f26518a
            int r8 = r4.b(r8, r7)
            if (r8 != r15) goto L_0x0076
            int r8 = r7 + 4
            r1.D(r8)
            long r8 = n5.v.c(r1)
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0076
            r5 = r8
            goto L_0x0079
        L_0x0076:
            int r7 = r7 + -1
            goto L_0x005d
        L_0x0079:
            r4.f22311g = r5
            r4.f22309e = r3
            goto L_0x00d9
        L_0x007e:
            long r10 = r4.f22311g
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0089
            r4.a(r1)
            goto L_0x00fa
        L_0x0089:
            boolean r7 = r4.f22308d
            if (r7 != 0) goto L_0x00dc
            long r10 = r18.b()
            long r7 = java.lang.Math.min(r8, r10)
            int r8 = (int) r7
            long r9 = r18.l()
            long r11 = (long) r14
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x00a2
            r2.f13063a = r11
            goto L_0x00da
        L_0x00a2:
            v6.v r2 = r4.f22306b
            r2.z(r8)
            r18.f()
            v6.v r2 = r4.f22306b
            byte[] r2 = r2.f26518a
            r1.j(r2, r14, r8)
            v6.v r1 = r4.f22306b
            int r2 = r1.f26519b
            int r7 = r1.f26520c
        L_0x00b7:
            int r8 = r7 + -3
            if (r2 >= r8) goto L_0x00d5
            byte[] r8 = r1.f26518a
            int r8 = r4.b(r8, r2)
            if (r8 != r15) goto L_0x00d2
            int r8 = r2 + 4
            r1.D(r8)
            long r8 = n5.v.c(r1)
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00d2
            r5 = r8
            goto L_0x00d5
        L_0x00d2:
            int r2 = r2 + 1
            goto L_0x00b7
        L_0x00d5:
            r4.f22310f = r5
            r4.f22308d = r3
        L_0x00d9:
            r3 = 0
        L_0x00da:
            r14 = r3
            goto L_0x00fa
        L_0x00dc:
            long r2 = r4.f22310f
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00e6
            r4.a(r1)
            goto L_0x00fa
        L_0x00e6:
            v6.b0 r5 = r4.f22305a
            long r2 = r5.b(r2)
            v6.b0 r5 = r4.f22305a
            long r6 = r4.f22311g
            long r5 = r5.b(r6)
            long r5 = r5 - r2
            r4.f22312h = r5
            r4.a(r1)
        L_0x00fa:
            return r14
        L_0x00fb:
            boolean r4 = r0.f22323k
            if (r4 != 0) goto L_0x012d
            r0.f22323k = r3
            n5.v r4 = r0.f22316d
            long r8 = r4.f22312h
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0120
            n5.u r6 = new n5.u
            v6.b0 r5 = r4.f22305a
            r4 = r6
            r15 = r6
            r6 = r8
            r12 = 0
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.f22321i = r15
            d5.k r4 = r0.f22322j
            d5.a$a r5 = r15.f12973a
            r4.b(r5)
            goto L_0x012f
        L_0x0120:
            r12 = 0
            d5.k r4 = r0.f22322j
            d5.x$b r5 = new d5.x$b
            r5.<init>(r8, r12)
            r4.b(r5)
            goto L_0x012f
        L_0x012d:
            r12 = 0
        L_0x012f:
            n5.u r4 = r0.f22321i
            if (r4 == 0) goto L_0x0140
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x0140
            n5.u r3 = r0.f22321i
            int r1 = r3.a(r1, r2)
            return r1
        L_0x0140:
            r18.f()
            r4 = -1
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x014f
            long r6 = r18.i()
            long r10 = r10 - r6
            goto L_0x0150
        L_0x014f:
            r10 = r4
        L_0x0150:
            r2 = -1
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x015c
            r4 = 4
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x015c
            return r2
        L_0x015c:
            v6.v r4 = r0.f22315c
            byte[] r4 = r4.f26518a
            r5 = 4
            boolean r4 = r1.h(r4, r14, r5, r3)
            if (r4 != 0) goto L_0x0168
            return r2
        L_0x0168:
            v6.v r4 = r0.f22315c
            r4.D(r14)
            v6.v r4 = r0.f22315c
            int r4 = r4.f()
            r6 = 441(0x1b9, float:6.18E-43)
            if (r4 != r6) goto L_0x0178
            return r2
        L_0x0178:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r4 != r2) goto L_0x019a
            v6.v r2 = r0.f22315c
            byte[] r2 = r2.f26518a
            r3 = 10
            r1.j(r2, r14, r3)
            v6.v r2 = r0.f22315c
            r3 = 9
            r2.D(r3)
            v6.v r2 = r0.f22315c
            int r2 = r2.s()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.g(r2)
            return r14
        L_0x019a:
            r2 = 443(0x1bb, float:6.21E-43)
            r6 = 2
            r7 = 6
            if (r4 != r2) goto L_0x01b7
            v6.v r2 = r0.f22315c
            byte[] r2 = r2.f26518a
            r1.j(r2, r14, r6)
            v6.v r2 = r0.f22315c
            r2.D(r14)
            v6.v r2 = r0.f22315c
            int r2 = r2.x()
            int r2 = r2 + r7
            r1.g(r2)
            return r14
        L_0x01b7:
            r2 = r4 & -256(0xffffffffffffff00, float:NaN)
            r8 = 8
            int r2 = r2 >> r8
            if (r2 == r3) goto L_0x01c2
            r1.g(r3)
            return r14
        L_0x01c2:
            r2 = r4 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<n5.w$a> r4 = r0.f22314b
            java.lang.Object r4 = r4.get(r2)
            n5.w$a r4 = (n5.w.a) r4
            boolean r9 = r0.f22317e
            if (r9 != 0) goto L_0x024a
            if (r4 != 0) goto L_0x022a
            r9 = 189(0xbd, float:2.65E-43)
            r10 = 0
            if (r2 != r9) goto L_0x01e6
            n5.b r9 = new n5.b
            r9.<init>(r10)
            r0.f22318f = r3
            long r10 = r18.l()
            r0.f22320h = r10
        L_0x01e4:
            r10 = r9
            goto L_0x020e
        L_0x01e6:
            r9 = r2 & 224(0xe0, float:3.14E-43)
            r11 = 192(0xc0, float:2.69E-43)
            if (r9 != r11) goto L_0x01fa
            n5.q r9 = new n5.q
            r9.<init>(r10)
            r0.f22318f = r3
            long r10 = r18.l()
            r0.f22320h = r10
            goto L_0x01e4
        L_0x01fa:
            r9 = r2 & 240(0xf0, float:3.36E-43)
            r11 = 224(0xe0, float:3.14E-43)
            if (r9 != r11) goto L_0x020e
            n5.k r9 = new n5.k
            r9.<init>(r10)
            r0.f22319g = r3
            long r10 = r18.l()
            r0.f22320h = r10
            goto L_0x01e4
        L_0x020e:
            if (r10 == 0) goto L_0x022a
            n5.e0$d r4 = new n5.e0$d
            r9 = 256(0x100, float:3.59E-43)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.<init>(r11, r2, r9)
            d5.k r9 = r0.f22322j
            r10.d(r9, r4)
            n5.w$a r4 = new n5.w$a
            v6.b0 r9 = r0.f22313a
            r4.<init>(r10, r9)
            android.util.SparseArray<n5.w$a> r9 = r0.f22314b
            r9.put(r2, r4)
        L_0x022a:
            boolean r2 = r0.f22318f
            if (r2 == 0) goto L_0x0238
            boolean r2 = r0.f22319g
            if (r2 == 0) goto L_0x0238
            long r9 = r0.f22320h
            r15 = 8192(0x2000, double:4.0474E-320)
            long r9 = r9 + r15
            goto L_0x023b
        L_0x0238:
            r9 = 1048576(0x100000, double:5.180654E-318)
        L_0x023b:
            long r15 = r18.l()
            int r2 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x024a
            r0.f22317e = r3
            d5.k r2 = r0.f22322j
            r2.d()
        L_0x024a:
            v6.v r2 = r0.f22315c
            byte[] r2 = r2.f26518a
            r1.j(r2, r14, r6)
            v6.v r2 = r0.f22315c
            r2.D(r14)
            v6.v r2 = r0.f22315c
            int r2 = r2.x()
            int r2 = r2 + r7
            if (r4 != 0) goto L_0x0265
            r1.g(r2)
        L_0x0262:
            r1 = 0
            goto L_0x0347
        L_0x0265:
            v6.v r6 = r0.f22315c
            r6.z(r2)
            v6.v r6 = r0.f22315c
            byte[] r6 = r6.f26518a
            r1.readFully(r6, r14, r2)
            v6.v r1 = r0.f22315c
            r1.D(r7)
            v6.v r1 = r0.f22315c
            d5.b0 r2 = r4.f22326c
            byte[] r2 = r2.f13001b
            r6 = 3
            r1.e(r2, r14, r6)
            d5.b0 r2 = r4.f22326c
            r2.p(r14)
            d5.b0 r2 = r4.f22326c
            r2.s(r8)
            d5.b0 r2 = r4.f22326c
            boolean r2 = r2.h()
            r4.f22327d = r2
            d5.b0 r2 = r4.f22326c
            boolean r2 = r2.h()
            r4.f22328e = r2
            d5.b0 r2 = r4.f22326c
            r2.s(r7)
            d5.b0 r2 = r4.f22326c
            int r2 = r2.i(r8)
            d5.b0 r7 = r4.f22326c
            byte[] r7 = r7.f13001b
            r1.e(r7, r14, r2)
            d5.b0 r2 = r4.f22326c
            r2.p(r14)
            r4.f22330g = r12
            boolean r2 = r4.f22327d
            if (r2 == 0) goto L_0x032c
            d5.b0 r2 = r4.f22326c
            r2.s(r5)
            d5.b0 r2 = r4.f22326c
            int r2 = r2.i(r6)
            long r7 = (long) r2
            r2 = 30
            long r7 = r7 << r2
            d5.b0 r9 = r4.f22326c
            r9.s(r3)
            d5.b0 r9 = r4.f22326c
            r10 = 15
            int r9 = r9.i(r10)
            int r9 = r9 << r10
            long r11 = (long) r9
            long r7 = r7 | r11
            d5.b0 r9 = r4.f22326c
            r9.s(r3)
            d5.b0 r9 = r4.f22326c
            int r9 = r9.i(r10)
            long r11 = (long) r9
            long r7 = r7 | r11
            d5.b0 r9 = r4.f22326c
            r9.s(r3)
            boolean r9 = r4.f22329f
            if (r9 != 0) goto L_0x0324
            boolean r9 = r4.f22328e
            if (r9 == 0) goto L_0x0324
            d5.b0 r9 = r4.f22326c
            r9.s(r5)
            d5.b0 r9 = r4.f22326c
            int r6 = r9.i(r6)
            long r11 = (long) r6
            long r11 = r11 << r2
            d5.b0 r2 = r4.f22326c
            r2.s(r3)
            d5.b0 r2 = r4.f22326c
            int r2 = r2.i(r10)
            int r2 = r2 << r10
            long r14 = (long) r2
            long r11 = r11 | r14
            d5.b0 r2 = r4.f22326c
            r2.s(r3)
            d5.b0 r2 = r4.f22326c
            int r2 = r2.i(r10)
            long r9 = (long) r2
            long r9 = r9 | r11
            d5.b0 r2 = r4.f22326c
            r2.s(r3)
            v6.b0 r2 = r4.f22325b
            r2.b(r9)
            r4.f22329f = r3
        L_0x0324:
            v6.b0 r2 = r4.f22325b
            long r2 = r2.b(r7)
            r4.f22330g = r2
        L_0x032c:
            n5.j r2 = r4.f22324a
            long r7 = r4.f22330g
            r2.f(r7, r5)
            n5.j r2 = r4.f22324a
            r2.c(r1)
            n5.j r1 = r4.f22324a
            r1.e()
            v6.v r1 = r0.f22315c
            byte[] r2 = r1.f26518a
            int r2 = r2.length
            r1.C(r2)
            goto L_0x0262
        L_0x0347:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.w.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        if ((this.f22313a.d() == -9223372036854775807L) || !(this.f22313a.c() == 0 || this.f22313a.c() == j11)) {
            this.f22313a.e(j11);
        }
        u uVar = this.f22321i;
        if (uVar != null) {
            uVar.e(j11);
        }
        for (int i10 = 0; i10 < this.f22314b.size(); i10++) {
            a valueAt = this.f22314b.valueAt(i10);
            valueAt.f22329f = false;
            valueAt.f22324a.a();
        }
    }

    public void i(k kVar) {
        this.f22322j = kVar;
    }
}
