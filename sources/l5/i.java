package l5;

import d5.c0;
import java.util.Arrays;
import v6.v;

/* compiled from: VorbisReader */
public final class i extends h {

    /* renamed from: n  reason: collision with root package name */
    public a f21091n;

    /* renamed from: o  reason: collision with root package name */
    public int f21092o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f21093p;

    /* renamed from: q  reason: collision with root package name */
    public c0.c f21094q;

    /* renamed from: r  reason: collision with root package name */
    public c0.a f21095r;

    /* compiled from: VorbisReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c0.c f21096a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f21097b;

        /* renamed from: c  reason: collision with root package name */
        public final c0.b[] f21098c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21099d;

        public a(c0.c cVar, c0.a aVar, byte[] bArr, c0.b[] bVarArr, int i10) {
            this.f21096a = cVar;
            this.f21097b = bArr;
            this.f21098c = bVarArr;
            this.f21099d = i10;
        }
    }

    public void b(long j10) {
        this.f21082g = j10;
        int i10 = 0;
        this.f21093p = j10 != 0;
        c0.c cVar = this.f21094q;
        if (cVar != null) {
            i10 = cVar.f13011e;
        }
        this.f21092o = i10;
    }

    public long c(v vVar) {
        int i10;
        byte[] bArr = vVar.f26518a;
        int i11 = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        byte b10 = bArr[0];
        a aVar = this.f21091n;
        v6.a.f(aVar);
        a aVar2 = aVar;
        if (!aVar2.f21098c[(b10 >> 1) & (255 >>> (8 - aVar2.f21099d))].f13006a) {
            i10 = aVar2.f21096a.f13011e;
        } else {
            i10 = aVar2.f21096a.f13012f;
        }
        if (this.f21093p) {
            i11 = (this.f21092o + i10) / 4;
        }
        long j10 = (long) i11;
        byte[] bArr2 = vVar.f26518a;
        int length = bArr2.length;
        int i12 = vVar.f26520c + 4;
        if (length < i12) {
            vVar.A(Arrays.copyOf(bArr2, i12));
        } else {
            vVar.C(i12);
        }
        byte[] bArr3 = vVar.f26518a;
        int i13 = vVar.f26520c;
        bArr3[i13 - 4] = (byte) ((int) (j10 & 255));
        bArr3[i13 - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        bArr3[i13 - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        bArr3[i13 - 1] = (byte) ((int) ((j10 >>> 24) & 255));
        this.f21093p = true;
        this.f21092o = i10;
        return j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03c9  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(v6.v r19, long r20, l5.h.b r22) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r22
            l5.i$a r3 = r0.f21091n
            r4 = 0
            if (r3 == 0) goto L_0x0011
            x4.b0 r1 = r2.f21089a
            r1.getClass()
            return r4
        L_0x0011:
            d5.c0$c r6 = r0.f21094q
            r3 = 1
            if (r6 != 0) goto L_0x007b
            d5.c0.c(r3, r1, r4)
            int r8 = r19.k()
            int r9 = r19.s()
            int r10 = r19.k()
            int r4 = r19.h()
            if (r4 > 0) goto L_0x002e
            r4 = -1
            r11 = -1
            goto L_0x002f
        L_0x002e:
            r11 = r4
        L_0x002f:
            int r4 = r19.h()
            if (r4 > 0) goto L_0x0038
            r4 = -1
            r12 = -1
            goto L_0x0039
        L_0x0038:
            r12 = r4
        L_0x0039:
            int r4 = r19.h()
            if (r4 > 0) goto L_0x0042
            r4 = -1
            r13 = -1
            goto L_0x0043
        L_0x0042:
            r13 = r4
        L_0x0043:
            int r4 = r19.s()
            r5 = r4 & 15
            double r5 = (double) r5
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r14, r5)
            int r5 = (int) r5
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> 4
            double r6 = (double) r4
            double r6 = java.lang.Math.pow(r14, r6)
            int r15 = (int) r6
            int r4 = r19.s()
            r3 = r3 & r4
            if (r3 <= 0) goto L_0x0066
            r3 = 1
            r16 = 1
            goto L_0x0069
        L_0x0066:
            r3 = 0
            r16 = 0
        L_0x0069:
            byte[] r3 = r1.f26518a
            int r1 = r1.f26520c
            byte[] r17 = java.util.Arrays.copyOf(r3, r1)
            d5.c0$c r1 = new d5.c0$c
            r7 = r1
            r14 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.f21094q = r1
            goto L_0x0085
        L_0x007b:
            d5.c0$a r7 = r0.f21095r
            if (r7 != 0) goto L_0x0088
            d5.c0$a r1 = d5.c0.b(r1, r3, r3)
            r0.f21095r = r1
        L_0x0085:
            r1 = 0
            goto L_0x03c3
        L_0x0088:
            int r4 = r1.f26520c
            byte[] r8 = new byte[r4]
            byte[] r5 = r1.f26518a
            r9 = 0
            java.lang.System.arraycopy(r5, r9, r8, r9, r4)
            int r4 = r6.f13007a
            r5 = 5
            d5.c0.c(r5, r1, r9)
            int r10 = r19.s()
            int r10 = r10 + r3
            d5.b0 r3 = new d5.b0
            byte[] r11 = r1.f26518a
            r12 = 0
            r3.<init>((byte[]) r11, (int) r9, (q.e) r12)
            int r1 = r1.f26519b
            int r1 = r1 * 8
            r3.s(r1)
            r1 = 0
        L_0x00ad:
            r9 = 16
            r11 = 24
            if (r1 >= r10) goto L_0x01ba
            int r12 = r3.i(r11)
            r13 = 5653314(0x564342, float:7.92198E-39)
            if (r12 != r13) goto L_0x01a3
            int r9 = r3.i(r9)
            int r11 = r3.i(r11)
            long[] r12 = new long[r11]
            boolean r13 = r3.h()
            if (r13 != 0) goto L_0x010e
            boolean r13 = r3.h()
            r16 = 0
            r14 = 0
        L_0x00d3:
            if (r14 >= r11) goto L_0x0109
            if (r13 == 0) goto L_0x00f4
            boolean r15 = r3.h()
            if (r15 == 0) goto L_0x00ec
            int r5 = r3.i(r5)
            int r5 = r5 + 1
            r15 = r7
            r16 = r8
            long r7 = (long) r5
            r12[r14] = r7
            r7 = 0
            goto L_0x0102
        L_0x00ec:
            r15 = r7
            r16 = r8
            r7 = 0
            r12[r14] = r7
            goto L_0x0102
        L_0x00f4:
            r15 = r7
            r16 = r8
            r7 = 0
            int r5 = r3.i(r5)
            int r5 = r5 + 1
            long r7 = (long) r5
            r12[r14] = r7
        L_0x0102:
            int r14 = r14 + 1
            r5 = 5
            r7 = r15
            r8 = r16
            goto L_0x00d3
        L_0x0109:
            r16 = r8
            r21 = r7
            goto L_0x013f
        L_0x010e:
            r15 = r7
            r16 = r8
            r5 = 5
            int r5 = r3.i(r5)
            int r5 = r5 + 1
            r7 = 0
        L_0x0119:
            if (r7 >= r11) goto L_0x013d
            int r8 = r11 - r7
            int r8 = d5.c0.a(r8)
            int r8 = r3.i(r8)
            r13 = 0
        L_0x0126:
            if (r13 >= r8) goto L_0x0136
            if (r7 >= r11) goto L_0x0136
            r21 = r15
            long r14 = (long) r5
            r12[r7] = r14
            int r7 = r7 + 1
            int r13 = r13 + 1
            r15 = r21
            goto L_0x0126
        L_0x0136:
            r21 = r15
            int r5 = r5 + 1
            r15 = r21
            goto L_0x0119
        L_0x013d:
            r21 = r15
        L_0x013f:
            r5 = 4
            int r7 = r3.i(r5)
            r8 = 2
            if (r7 > r8) goto L_0x0197
            r12 = 1
            if (r7 == r12) goto L_0x014c
            if (r7 != r8) goto L_0x018e
        L_0x014c:
            r8 = 32
            r3.s(r8)
            r3.s(r8)
            int r5 = r3.i(r5)
            int r5 = r5 + r12
            r3.s(r12)
            if (r7 != r12) goto L_0x0183
            if (r9 == 0) goto L_0x0180
            long r7 = (long) r11
            long r11 = (long) r9
            double r7 = (double) r7
            double r11 = (double) r11
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r11)
            double r13 = r13 / r11
            double r7 = java.lang.Math.pow(r7, r13)
            double r7 = java.lang.Math.floor(r7)
            long r14 = (long) r7
            goto L_0x0187
        L_0x0180:
            r14 = 0
            goto L_0x0187
        L_0x0183:
            long r7 = (long) r11
            long r11 = (long) r9
            long r14 = r7 * r11
        L_0x0187:
            long r7 = (long) r5
            long r7 = r7 * r14
            int r5 = (int) r7
            r3.s(r5)
        L_0x018e:
            int r1 = r1 + 1
            r5 = 5
            r7 = r21
            r8 = r16
            goto L_0x00ad
        L_0x0197:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            java.lang.String r2 = androidx.appcompat.widget.d0.a(r2, r7)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01a3:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "expected code book to start with [0x56, 0x43, 0x42] at "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            int r3 = r3.g()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01ba:
            r21 = r7
            r16 = r8
            r1 = 6
            int r5 = r3.i(r1)
            int r5 = r5 + 1
            r7 = 0
        L_0x01c6:
            if (r7 >= r5) goto L_0x01d9
            int r8 = r3.i(r9)
            if (r8 != 0) goto L_0x01d1
            int r7 = r7 + 1
            goto L_0x01c6
        L_0x01d1:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01d9:
            int r5 = r3.i(r1)
            r7 = 1
            int r5 = r5 + r7
            r8 = 0
        L_0x01e0:
            r10 = 3
            if (r8 >= r5) goto L_0x028b
            int r1 = r3.i(r9)
            if (r1 == 0) goto L_0x025d
            if (r1 != r7) goto L_0x0251
            r1 = 5
            int r1 = r3.i(r1)
            int[] r7 = new int[r1]
            r9 = 0
            r11 = -1
        L_0x01f4:
            if (r9 >= r1) goto L_0x0206
            r12 = 4
            int r12 = r3.i(r12)
            r7[r9] = r12
            r12 = r7[r9]
            if (r12 <= r11) goto L_0x0203
            r11 = r7[r9]
        L_0x0203:
            int r9 = r9 + 1
            goto L_0x01f4
        L_0x0206:
            int r11 = r11 + 1
            int[] r9 = new int[r11]
            r12 = 0
        L_0x020b:
            if (r12 >= r11) goto L_0x0233
            int r10 = r3.i(r10)
            r13 = 1
            int r10 = r10 + 1
            r9[r12] = r10
            r10 = 2
            int r10 = r3.i(r10)
            r14 = 8
            if (r10 <= 0) goto L_0x0222
            r3.s(r14)
        L_0x0222:
            r15 = 0
        L_0x0223:
            int r13 = r13 << r10
            if (r15 >= r13) goto L_0x022f
            r3.s(r14)
            int r15 = r15 + 1
            r14 = 8
            r13 = 1
            goto L_0x0223
        L_0x022f:
            int r12 = r12 + 1
            r10 = 3
            goto L_0x020b
        L_0x0233:
            r10 = 2
            r3.s(r10)
            r10 = 4
            int r10 = r3.i(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x023f:
            if (r11 >= r1) goto L_0x0283
            r14 = r7[r11]
            r14 = r9[r14]
            int r12 = r12 + r14
        L_0x0246:
            if (r13 >= r12) goto L_0x024e
            r3.s(r10)
            int r13 = r13 + 1
            goto L_0x0246
        L_0x024e:
            int r11 = r11 + 1
            goto L_0x023f
        L_0x0251:
            x4.m0 r2 = new x4.m0
            java.lang.String r3 = "floor type greater than 1 not decodable: "
            java.lang.String r1 = androidx.appcompat.widget.d0.a(r3, r1)
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x025d:
            r1 = 8
            r3.s(r1)
            r7 = 16
            r3.s(r7)
            r3.s(r7)
            r7 = 6
            r3.s(r7)
            r3.s(r1)
            r7 = 4
            int r7 = r3.i(r7)
            int r7 = r7 + 1
            r9 = 0
        L_0x0279:
            if (r9 >= r7) goto L_0x0283
            r3.s(r1)
            int r9 = r9 + 1
            r1 = 8
            goto L_0x0279
        L_0x0283:
            int r8 = r8 + 1
            r1 = 6
            r7 = 1
            r9 = 16
            goto L_0x01e0
        L_0x028b:
            int r5 = r3.i(r1)
            r7 = 1
            int r5 = r5 + r7
            r8 = 0
        L_0x0292:
            if (r8 >= r5) goto L_0x02f8
            r9 = 16
            int r9 = r3.i(r9)
            r10 = 2
            if (r9 > r10) goto L_0x02f0
            r9 = 24
            r3.s(r9)
            r3.s(r9)
            r3.s(r9)
            int r1 = r3.i(r1)
            int r1 = r1 + r7
            r7 = 8
            r3.s(r7)
            int[] r9 = new int[r1]
            r10 = 0
        L_0x02b5:
            if (r10 >= r1) goto L_0x02d1
            r11 = 3
            int r11 = r3.i(r11)
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x02c8
            r12 = 5
            int r12 = r3.i(r12)
            goto L_0x02c9
        L_0x02c8:
            r12 = 0
        L_0x02c9:
            int r12 = r12 * 8
            int r12 = r12 + r11
            r9[r10] = r12
            int r10 = r10 + 1
            goto L_0x02b5
        L_0x02d1:
            r10 = 0
        L_0x02d2:
            if (r10 >= r1) goto L_0x02eb
            r11 = 0
        L_0x02d5:
            if (r11 >= r7) goto L_0x02e6
            r12 = r9[r10]
            r13 = 1
            int r13 = r13 << r11
            r12 = r12 & r13
            if (r12 == 0) goto L_0x02e1
            r3.s(r7)
        L_0x02e1:
            int r11 = r11 + 1
            r7 = 8
            goto L_0x02d5
        L_0x02e6:
            int r10 = r10 + 1
            r7 = 8
            goto L_0x02d2
        L_0x02eb:
            int r8 = r8 + 1
            r1 = 6
            r7 = 1
            goto L_0x0292
        L_0x02f0:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "residueType greater than 2 is not decodable"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02f8:
            int r1 = r3.i(r1)
            int r1 = r1 + 1
            r5 = 0
        L_0x02ff:
            if (r5 >= r1) goto L_0x0383
            r7 = 16
            int r7 = r3.i(r7)
            if (r7 == 0) goto L_0x0320
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "mapping type other than 0 not supported: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "VorbisUtil"
            android.util.Log.e(r8, r7)
            goto L_0x0378
        L_0x0320:
            boolean r7 = r3.h()
            if (r7 == 0) goto L_0x032e
            r7 = 4
            int r7 = r3.i(r7)
            int r7 = r7 + 1
            goto L_0x032f
        L_0x032e:
            r7 = 1
        L_0x032f:
            boolean r8 = r3.h()
            if (r8 == 0) goto L_0x0353
            r8 = 8
            int r8 = r3.i(r8)
            int r8 = r8 + 1
            r9 = 0
        L_0x033e:
            if (r9 >= r8) goto L_0x0353
            int r10 = r4 + -1
            int r11 = d5.c0.a(r10)
            r3.s(r11)
            int r10 = d5.c0.a(r10)
            r3.s(r10)
            int r9 = r9 + 1
            goto L_0x033e
        L_0x0353:
            r8 = 2
            int r8 = r3.i(r8)
            if (r8 != 0) goto L_0x037b
            r8 = 1
            if (r7 <= r8) goto L_0x0367
            r8 = 0
        L_0x035e:
            if (r8 >= r4) goto L_0x0367
            r9 = 4
            r3.s(r9)
            int r8 = r8 + 1
            goto L_0x035e
        L_0x0367:
            r8 = 0
        L_0x0368:
            if (r8 >= r7) goto L_0x0378
            r9 = 8
            r3.s(r9)
            r3.s(r9)
            r3.s(r9)
            int r8 = r8 + 1
            goto L_0x0368
        L_0x0378:
            int r5 = r5 + 1
            goto L_0x02ff
        L_0x037b:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "to reserved bits must be zero after mapping coupling steps"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0383:
            r1 = 6
            int r1 = r3.i(r1)
            int r1 = r1 + 1
            d5.c0$b[] r9 = new d5.c0.b[r1]
            r4 = 0
        L_0x038d:
            if (r4 >= r1) goto L_0x03ad
            boolean r5 = r3.h()
            r7 = 16
            int r8 = r3.i(r7)
            int r7 = r3.i(r7)
            r10 = 8
            int r10 = r3.i(r10)
            d5.c0$b r11 = new d5.c0$b
            r11.<init>(r5, r8, r7, r10)
            r9[r4] = r11
            int r4 = r4 + 1
            goto L_0x038d
        L_0x03ad:
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x03fd
            int r1 = r1 + -1
            int r10 = d5.c0.a(r1)
            l5.i$a r1 = new l5.i$a
            r5 = r1
            r7 = r21
            r8 = r16
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x03c3:
            r0.f21091n = r1
            if (r1 != 0) goto L_0x03c9
            r1 = 1
            return r1
        L_0x03c9:
            d5.c0$c r3 = r1.f21096a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            byte[] r5 = r3.f13013g
            r4.add(r5)
            byte[] r1 = r1.f21097b
            r4.add(r1)
            x4.b0$b r1 = new x4.b0$b
            r1.<init>()
            java.lang.String r5 = "audio/vorbis"
            r1.f27425k = r5
            int r5 = r3.f13010d
            r1.f27420f = r5
            int r5 = r3.f13009c
            r1.f27421g = r5
            int r5 = r3.f13007a
            r1.f27438x = r5
            int r3 = r3.f13008b
            r1.f27439y = r3
            r1.f27427m = r4
            x4.b0 r1 = r1.a()
            r2.f21089a = r1
            r1 = 1
            return r1
        L_0x03fd:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>((java.lang.String) r2)
            goto L_0x0406
        L_0x0405:
            throw r1
        L_0x0406:
            goto L_0x0405
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.i.d(v6.v, long, l5.h$b):boolean");
    }

    public void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.f21091n = null;
            this.f21094q = null;
            this.f21095r = null;
        }
        this.f21092o = 0;
        this.f21093p = false;
    }
}
