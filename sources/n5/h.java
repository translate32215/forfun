package n5;

import d5.a0;
import d5.k;
import n5.e0;
import v6.v;
import x4.b0;

/* compiled from: DtsReader */
public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public final v f22103a = new v(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    public final String f22104b;

    /* renamed from: c  reason: collision with root package name */
    public String f22105c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f22106d;

    /* renamed from: e  reason: collision with root package name */
    public int f22107e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f22108f;

    /* renamed from: g  reason: collision with root package name */
    public int f22109g;

    /* renamed from: h  reason: collision with root package name */
    public long f22110h;

    /* renamed from: i  reason: collision with root package name */
    public b0 f22111i;

    /* renamed from: j  reason: collision with root package name */
    public int f22112j;

    /* renamed from: k  reason: collision with root package name */
    public long f22113k;

    public h(String str) {
        this.f22104b = str;
    }

    public void a() {
        this.f22107e = 0;
        this.f22108f = 0;
        this.f22109g = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            d5.a0 r2 = r0.f22106d
            v6.a.f(r2)
        L_0x0009:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x0324
            int r2 = r0.f22107e
            r4 = 8
            r5 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x02c5
            if (r2 == r7) goto L_0x0051
            if (r2 != r5) goto L_0x004b
            int r2 = r23.a()
            int r3 = r0.f22112j
            int r4 = r0.f22108f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            d5.a0 r3 = r0.f22106d
            r3.b(r1, r2)
            int r3 = r0.f22108f
            int r3 = r3 + r2
            r0.f22108f = r3
            int r13 = r0.f22112j
            if (r3 != r13) goto L_0x0009
            d5.a0 r9 = r0.f22106d
            long r10 = r0.f22113k
            r12 = 1
            r14 = 0
            r15 = 0
            r9.d(r10, r12, r13, r14, r15)
            long r2 = r0.f22113k
            long r4 = r0.f22110h
            long r2 = r2 + r4
            r0.f22113k = r2
            r0.f22107e = r8
            goto L_0x0009
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0051:
            v6.v r2 = r0.f22103a
            byte[] r2 = r2.f26518a
            int r9 = r23.a()
            int r10 = r0.f22108f
            r11 = 18
            int r10 = 18 - r10
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0.f22108f
            byte[] r12 = r1.f26518a
            int r13 = r1.f26519b
            java.lang.System.arraycopy(r12, r13, r2, r10, r9)
            int r2 = r1.f26519b
            int r2 = r2 + r9
            r1.f26519b = r2
            int r2 = r0.f22108f
            int r2 = r2 + r9
            r0.f22108f = r2
            if (r2 != r11) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            if (r2 == 0) goto L_0x0009
            v6.v r2 = r0.f22103a
            byte[] r2 = r2.f26518a
            x4.b0 r9 = r0.f22111i
            r10 = 14
            r13 = 31
            r14 = -2
            r11 = -1
            if (r9 != 0) goto L_0x01f7
            java.lang.String r9 = r0.f22105c
            java.lang.String r15 = r0.f22104b
            byte r6 = r2[r8]
            r3 = 127(0x7f, float:1.78E-43)
            r12 = 0
            if (r6 != r3) goto L_0x009f
            d5.b0 r3 = new d5.b0
            r3.<init>((byte[]) r2, (int) r7, (q.e) r12)
        L_0x009b:
            r4 = 60
            goto L_0x019f
        L_0x009f:
            int r3 = r2.length
            byte[] r3 = java.util.Arrays.copyOf(r2, r3)
            byte r6 = r3[r8]
            if (r6 == r14) goto L_0x00af
            byte r6 = r3[r8]
            if (r6 != r11) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r6 = 0
            goto L_0x00b0
        L_0x00af:
            r6 = 1
        L_0x00b0:
            if (r6 == 0) goto L_0x00c4
            r6 = 0
        L_0x00b3:
            int r14 = r3.length
            int r14 = r14 - r7
            if (r6 >= r14) goto L_0x00c4
            byte r14 = r3[r6]
            int r16 = r6 + 1
            byte r17 = r3[r16]
            r3[r6] = r17
            r3[r16] = r14
            int r6 = r6 + 2
            goto L_0x00b3
        L_0x00c4:
            d5.b0 r6 = new d5.b0
            r6.<init>((byte[]) r3, (int) r7, (q.e) r12)
            byte r14 = r3[r8]
            if (r14 != r13) goto L_0x0192
            d5.b0 r14 = new d5.b0
            r14.<init>((byte[]) r3, (int) r7, (q.e) r12)
        L_0x00d2:
            int r13 = r14.b()
            r12 = 16
            if (r13 < r12) goto L_0x0192
            r14.s(r5)
            int r12 = r14.i(r10)
            r12 = r12 & 16383(0x3fff, float:2.2957E-41)
            int r13 = r6.f13003d
            int r13 = 8 - r13
            int r13 = java.lang.Math.min(r13, r10)
            int r5 = r6.f13003d
            int r18 = 8 - r5
            int r18 = r18 - r13
            r19 = 65280(0xff00, float:9.1477E-41)
            int r5 = r19 >> r5
            int r19 = r7 << r18
            int r19 = r19 + -1
            r5 = r5 | r19
            byte[] r8 = r6.f13001b
            int r11 = r6.f13002c
            byte r21 = r8[r11]
            r5 = r5 & r21
            byte r5 = (byte) r5
            r8[r11] = r5
            int r5 = 14 - r13
            int r13 = r12 >>> r5
            byte r21 = r8[r11]
            int r13 = r13 << r18
            r13 = r13 | r21
            byte r13 = (byte) r13
            r8[r11] = r13
            int r11 = r11 + r7
        L_0x0115:
            if (r5 <= r4) goto L_0x0126
            byte[] r8 = r6.f13001b
            int r13 = r11 + 1
            int r5 = r5 + -8
            int r4 = r12 >>> r5
            byte r4 = (byte) r4
            r8[r11] = r4
            r11 = r13
            r4 = 8
            goto L_0x0115
        L_0x0126:
            int r4 = 8 - r5
            byte[] r8 = r6.f13001b
            byte r13 = r8[r11]
            int r21 = r7 << r4
            r20 = -1
            int r21 = r21 + -1
            r13 = r13 & r21
            byte r13 = (byte) r13
            r8[r11] = r13
            int r5 = r7 << r5
            int r5 = r5 - r7
            r5 = r5 & r12
            byte r12 = r8[r11]
            int r4 = r5 << r4
            r4 = r4 | r12
            byte r4 = (byte) r4
            r8[r11] = r4
            r6.s(r10)
            int r4 = r6.f13000a
            switch(r4) {
                case 0: goto L_0x0161;
                case 1: goto L_0x014c;
                default: goto L_0x014b;
            }
        L_0x014b:
            goto L_0x0176
        L_0x014c:
            int r4 = r6.f13002c
            if (r4 < 0) goto L_0x015c
            int r5 = r6.f13004e
            if (r4 < r5) goto L_0x015a
            if (r4 != r5) goto L_0x015c
            int r4 = r6.f13003d
            if (r4 != 0) goto L_0x015c
        L_0x015a:
            r4 = 1
            goto L_0x015d
        L_0x015c:
            r4 = 0
        L_0x015d:
            v6.a.d(r4)
            goto L_0x018a
        L_0x0161:
            int r4 = r6.f13003d
            if (r4 < 0) goto L_0x0171
            int r5 = r6.f13002c
            if (r4 < r5) goto L_0x016f
            if (r4 != r5) goto L_0x0171
            int r4 = r6.f13004e
            if (r4 != 0) goto L_0x0171
        L_0x016f:
            r4 = 1
            goto L_0x0172
        L_0x0171:
            r4 = 0
        L_0x0172:
            v6.a.d(r4)
            goto L_0x018a
        L_0x0176:
            int r4 = r6.f13003d
            if (r4 < 0) goto L_0x0186
            int r5 = r6.f13002c
            if (r4 < r5) goto L_0x0184
            if (r4 != r5) goto L_0x0186
            int r4 = r6.f13004e
            if (r4 != 0) goto L_0x0186
        L_0x0184:
            r4 = 1
            goto L_0x0187
        L_0x0186:
            r4 = 0
        L_0x0187:
            v6.a.d(r4)
        L_0x018a:
            r4 = 8
            r5 = 2
            r8 = 0
            r11 = -1
            r12 = 0
            goto L_0x00d2
        L_0x0192:
            int r4 = r3.length
            r6.f13001b = r3
            r3 = 0
            r6.f13002c = r3
            r6.f13003d = r3
            r6.f13004e = r4
            r3 = r6
            goto L_0x009b
        L_0x019f:
            r3.s(r4)
            r4 = 6
            int r5 = r3.i(r4)
            int[] r4 = z4.t.f28472a
            r4 = r4[r5]
            r5 = 4
            int r6 = r3.i(r5)
            int[] r5 = z4.t.f28473b
            r5 = r5[r6]
            r6 = 5
            int r8 = r3.i(r6)
            int[] r6 = z4.t.f28474c
            int r11 = r6.length
            if (r8 < r11) goto L_0x01c1
            r6 = -1
            r8 = 2
            goto L_0x01c7
        L_0x01c1:
            r6 = r6[r8]
            int r6 = r6 * 1000
            r8 = 2
            int r6 = r6 / r8
        L_0x01c7:
            r11 = 10
            r3.s(r11)
            int r3 = r3.i(r8)
            if (r3 <= 0) goto L_0x01d4
            r3 = 1
            goto L_0x01d5
        L_0x01d4:
            r3 = 0
        L_0x01d5:
            int r4 = r4 + r3
            x4.b0$b r3 = new x4.b0$b
            r3.<init>()
            r3.f27415a = r9
            java.lang.String r8 = "audio/vnd.dts"
            r3.f27425k = r8
            r3.f27420f = r6
            r3.f27438x = r4
            r3.f27439y = r5
            r4 = 0
            r3.f27428n = r4
            r3.f27417c = r15
            x4.b0 r3 = r3.a()
            r0.f22111i = r3
            d5.a0 r4 = r0.f22106d
            r4.c(r3)
        L_0x01f7:
            r3 = 0
            byte r4 = r2[r3]
            r3 = 7
            r5 = -2
            if (r4 == r5) goto L_0x0245
            r5 = -1
            if (r4 == r5) goto L_0x022a
            r5 = 31
            if (r4 == r5) goto L_0x0217
            r4 = 5
            byte r5 = r2[r4]
            r4 = 3
            r4 = r4 & r5
            int r4 = r4 << 12
            r5 = 6
            byte r6 = r2[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r8 = 4
            int r6 = r6 << r8
            r4 = r4 | r6
            byte r6 = r2[r3]
            goto L_0x0255
        L_0x0217:
            r4 = 3
            r5 = 6
            r8 = 4
            byte r6 = r2[r5]
            r4 = r4 & r6
            int r4 = r4 << 12
            byte r5 = r2[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r8
            r4 = r4 | r5
            r5 = 8
            byte r5 = r2[r5]
            goto L_0x023c
        L_0x022a:
            r4 = 3
            r8 = 4
            byte r5 = r2[r3]
            r4 = r4 & r5
            int r4 = r4 << 12
            r5 = 6
            byte r6 = r2[r5]
            r5 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r8
            r4 = r4 | r5
            r5 = 9
            byte r5 = r2[r5]
        L_0x023c:
            r6 = 60
            r5 = r5 & r6
            r6 = 2
            int r5 = r5 >> r6
            r4 = r4 | r5
            int r4 = r4 + r7
            r5 = 1
            goto L_0x025b
        L_0x0245:
            r8 = 4
            byte r4 = r2[r8]
            r5 = 3
            r4 = r4 & r5
            int r4 = r4 << 12
            byte r5 = r2[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r8
            r4 = r4 | r5
            r5 = 6
            byte r6 = r2[r5]
        L_0x0255:
            r5 = r6 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r8
            r4 = r4 | r5
            int r4 = r4 + r7
            r5 = 0
        L_0x025b:
            if (r5 == 0) goto L_0x0260
            int r4 = r4 * 16
            int r4 = r4 / r10
        L_0x0260:
            r0.f22112j = r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 0
            byte r8 = r2[r6]
            r6 = -2
            if (r8 == r6) goto L_0x0293
            r6 = -1
            if (r8 == r6) goto L_0x0286
            r6 = 31
            if (r8 == r6) goto L_0x027c
            r6 = 4
            byte r3 = r2[r6]
            r3 = r3 & r7
            r8 = 6
            int r3 = r3 << r8
            r9 = 5
            byte r2 = r2[r9]
            goto L_0x029c
        L_0x027c:
            r6 = 4
            r8 = 6
            r9 = 5
            byte r9 = r2[r9]
            r3 = r3 & r9
            int r3 = r3 << r6
            byte r2 = r2[r8]
            goto L_0x028f
        L_0x0286:
            r6 = 4
            byte r8 = r2[r6]
            r8 = r8 & r3
            int r6 = r8 << 4
            byte r2 = r2[r3]
            r3 = r6
        L_0x028f:
            r6 = 60
            r2 = r2 & r6
            goto L_0x029e
        L_0x0293:
            r3 = 5
            r6 = 4
            r8 = 6
            byte r3 = r2[r3]
            r3 = r3 & r7
            int r3 = r3 << r8
            byte r2 = r2[r6]
        L_0x029c:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x029e:
            r6 = 2
            int r2 = r2 >> r6
            r2 = r2 | r3
            int r2 = r2 + r7
            int r2 = r2 * 32
            long r2 = (long) r2
            long r2 = r2 * r4
            x4.b0 r4 = r0.f22111i
            int r4 = r4.H
            long r4 = (long) r4
            long r2 = r2 / r4
            int r3 = (int) r2
            long r2 = (long) r3
            r0.f22110h = r2
            v6.v r2 = r0.f22103a
            r3 = 0
            r2.D(r3)
            d5.a0 r2 = r0.f22106d
            v6.v r3 = r0.f22103a
            r4 = 18
            r2.b(r3, r4)
            r2 = 2
            r0.f22107e = r2
            goto L_0x0009
        L_0x02c5:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x031c
            int r2 = r0.f22109g
            r3 = 8
            int r2 = r2 << r3
            r0.f22109g = r2
            int r4 = r23.s()
            r2 = r2 | r4
            r0.f22109g = r2
            r4 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r4) goto L_0x02f0
            r4 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r4) goto L_0x02f0
            r4 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r4) goto L_0x02f0
            r4 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r4) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            r4 = 0
            goto L_0x02f1
        L_0x02f0:
            r4 = 1
        L_0x02f1:
            if (r4 == 0) goto L_0x02c5
            v6.v r3 = r0.f22103a
            byte[] r3 = r3.f26518a
            int r4 = r2 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 0
            r3[r5] = r4
            int r4 = r2 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3[r7] = r4
            int r4 = r2 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 2
            r3[r5] = r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r4 = 3
            r3[r4] = r2
            r2 = 4
            r0.f22108f = r2
            r6 = 0
            r0.f22109g = r6
            r8 = 1
            goto L_0x031e
        L_0x031c:
            r6 = 0
            r8 = 0
        L_0x031e:
            if (r8 == 0) goto L_0x0009
            r0.f22107e = r7
            goto L_0x0009
        L_0x0324:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.h.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22105c = dVar.b();
        this.f22106d = kVar.l(dVar.c(), 1);
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22113k = j10;
    }
}
