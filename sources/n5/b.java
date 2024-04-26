package n5;

import d5.a0;
import d5.b0;
import d5.k;
import n5.e0;
import q.e;
import v6.v;

/* compiled from: Ac3Reader */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f21994a;

    /* renamed from: b  reason: collision with root package name */
    public final v f21995b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21996c;

    /* renamed from: d  reason: collision with root package name */
    public String f21997d;

    /* renamed from: e  reason: collision with root package name */
    public a0 f21998e;

    /* renamed from: f  reason: collision with root package name */
    public int f21999f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f22000g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22001h;

    /* renamed from: i  reason: collision with root package name */
    public long f22002i;

    /* renamed from: j  reason: collision with root package name */
    public x4.b0 f22003j;

    /* renamed from: k  reason: collision with root package name */
    public int f22004k;

    /* renamed from: l  reason: collision with root package name */
    public long f22005l;

    public b(String str) {
        b0 b0Var = new b0(new byte[128], 1, (e) null);
        this.f21994a = b0Var;
        this.f21995b = new v(b0Var.f13001b);
        this.f21996c = str;
    }

    public void a() {
        this.f21999f = 0;
        this.f22000g = 0;
        this.f22001h = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            d5.a0 r2 = r0.f21998e
            v6.a.f(r2)
        L_0x0009:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x0389
            int r2 = r0.f21999f
            r3 = 11
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x034a
            if (r2 == r6) goto L_0x004c
            if (r2 == r4) goto L_0x001d
            goto L_0x0009
        L_0x001d:
            int r2 = r23.a()
            int r3 = r0.f22004k
            int r4 = r0.f22000g
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            d5.a0 r3 = r0.f21998e
            r3.b(r1, r2)
            int r3 = r0.f22000g
            int r3 = r3 + r2
            r0.f22000g = r3
            int r10 = r0.f22004k
            if (r3 != r10) goto L_0x0009
            d5.a0 r6 = r0.f21998e
            long r7 = r0.f22005l
            r9 = 1
            r11 = 0
            r12 = 0
            r6.d(r7, r9, r10, r11, r12)
            long r2 = r0.f22005l
            long r6 = r0.f22002i
            long r2 = r2 + r6
            r0.f22005l = r2
            r0.f21999f = r5
            goto L_0x0009
        L_0x004c:
            v6.v r2 = r0.f21995b
            byte[] r2 = r2.f26518a
            int r7 = r23.a()
            int r8 = r0.f22000g
            r9 = 128(0x80, float:1.794E-43)
            int r8 = 128 - r8
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0.f22000g
            byte[] r10 = r1.f26518a
            int r11 = r1.f26519b
            java.lang.System.arraycopy(r10, r11, r2, r8, r7)
            int r2 = r1.f26519b
            int r2 = r2 + r7
            r1.f26519b = r2
            int r2 = r0.f22000g
            int r2 = r2 + r7
            r0.f22000g = r2
            if (r2 != r9) goto L_0x0075
            r2 = 1
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            if (r2 == 0) goto L_0x0009
            d5.b0 r2 = r0.f21994a
            r2.p(r5)
            d5.b0 r2 = r0.f21994a
            int r7 = r2.g()
            r8 = 40
            r2.s(r8)
            r8 = 5
            int r10 = r2.i(r8)
            r11 = 10
            if (r10 <= r11) goto L_0x0093
            r10 = 1
            goto L_0x0094
        L_0x0093:
            r10 = 0
        L_0x0094:
            r2.p(r7)
            r7 = -1
            r12 = 8
            r13 = 3
            if (r10 == 0) goto L_0x02a2
            r10 = 16
            r2.s(r10)
            int r15 = r2.i(r4)
            if (r15 == 0) goto L_0x00b1
            if (r15 == r6) goto L_0x00af
            if (r15 == r4) goto L_0x00ad
            goto L_0x00b2
        L_0x00ad:
            r7 = 2
            goto L_0x00b2
        L_0x00af:
            r7 = 1
            goto L_0x00b2
        L_0x00b1:
            r7 = 0
        L_0x00b2:
            r2.s(r13)
            int r3 = r2.i(r3)
            int r3 = r3 + r6
            int r3 = r3 * 2
            int r15 = r2.i(r4)
            if (r15 != r13) goto L_0x00cd
            int[] r16 = z4.b.f28307c
            int r17 = r2.i(r4)
            r16 = r16[r17]
            r5 = 6
            r9 = 3
            goto L_0x00df
        L_0x00cd:
            int r16 = r2.i(r4)
            int[] r17 = z4.b.f28305a
            r17 = r17[r16]
            int[] r18 = z4.b.f28306b
            r18 = r18[r15]
            r9 = r16
            r5 = r17
            r16 = r18
        L_0x00df:
            int r14 = r5 * 256
            int r4 = r2.i(r13)
            boolean r20 = r2.h()
            int[] r21 = z4.b.f28308d
            r21 = r21[r4]
            int r21 = r21 + r20
            r2.s(r11)
            boolean r11 = r2.h()
            if (r11 == 0) goto L_0x00fb
            r2.s(r12)
        L_0x00fb:
            if (r4 != 0) goto L_0x0109
            r2.s(r8)
            boolean r11 = r2.h()
            if (r11 == 0) goto L_0x0109
            r2.s(r12)
        L_0x0109:
            if (r7 != r6) goto L_0x0114
            boolean r11 = r2.h()
            if (r11 == 0) goto L_0x0114
            r2.s(r10)
        L_0x0114:
            boolean r10 = r2.h()
            r11 = 4
            if (r10 == 0) goto L_0x023a
            r10 = 2
            if (r4 <= r10) goto L_0x0121
            r2.s(r10)
        L_0x0121:
            r19 = r4 & 1
            if (r19 == 0) goto L_0x012c
            if (r4 <= r10) goto L_0x012c
            r10 = 6
            r2.s(r10)
            goto L_0x012d
        L_0x012c:
            r10 = 6
        L_0x012d:
            r18 = r4 & 4
            if (r18 == 0) goto L_0x0134
            r2.s(r10)
        L_0x0134:
            if (r20 == 0) goto L_0x013f
            boolean r10 = r2.h()
            if (r10 == 0) goto L_0x013f
            r2.s(r8)
        L_0x013f:
            if (r7 != 0) goto L_0x023a
            boolean r10 = r2.h()
            if (r10 == 0) goto L_0x014c
            r10 = 6
            r2.s(r10)
            goto L_0x014d
        L_0x014c:
            r10 = 6
        L_0x014d:
            if (r4 != 0) goto L_0x0158
            boolean r18 = r2.h()
            if (r18 == 0) goto L_0x0158
            r2.s(r10)
        L_0x0158:
            boolean r18 = r2.h()
            if (r18 == 0) goto L_0x0161
            r2.s(r10)
        L_0x0161:
            r10 = 2
            int r12 = r2.i(r10)
            if (r12 != r6) goto L_0x016e
            r2.s(r8)
        L_0x016b:
            r6 = 2
            goto L_0x0207
        L_0x016e:
            if (r12 != r10) goto L_0x0176
            r10 = 12
            r2.s(r10)
            goto L_0x016b
        L_0x0176:
            if (r12 != r13) goto L_0x016b
            int r10 = r2.i(r8)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01dc
            r2.s(r8)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x018e
            r2.s(r11)
        L_0x018e:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0197
            r2.s(r11)
        L_0x0197:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01a0
            r2.s(r11)
        L_0x01a0:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01a9
            r2.s(r11)
        L_0x01a9:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01b2
            r2.s(r11)
        L_0x01b2:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01bb
            r2.s(r11)
        L_0x01bb:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01c4
            r2.s(r11)
        L_0x01c4:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01dc
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01d3
            r2.s(r11)
        L_0x01d3:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01dc
            r2.s(r11)
        L_0x01dc:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01fb
            r2.s(r8)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01fb
            r12 = 7
            r2.s(r12)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x01fb
            r12 = 8
            r2.s(r12)
            goto L_0x01fd
        L_0x01fb:
            r12 = 8
        L_0x01fd:
            r6 = 2
            int r10 = r10 + r6
            int r10 = r10 * 8
            r2.s(r10)
            r2.c()
        L_0x0207:
            if (r4 >= r6) goto L_0x021f
            boolean r6 = r2.h()
            r10 = 14
            if (r6 == 0) goto L_0x0214
            r2.s(r10)
        L_0x0214:
            if (r4 != 0) goto L_0x021f
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x021f
            r2.s(r10)
        L_0x021f:
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x023a
            if (r9 != 0) goto L_0x022b
            r2.s(r8)
            goto L_0x023a
        L_0x022b:
            r6 = 0
        L_0x022c:
            if (r6 >= r5) goto L_0x023a
            boolean r10 = r2.h()
            if (r10 == 0) goto L_0x0237
            r2.s(r8)
        L_0x0237:
            int r6 = r6 + 1
            goto L_0x022c
        L_0x023a:
            boolean r5 = r2.h()
            if (r5 == 0) goto L_0x026d
            r2.s(r8)
            r5 = 2
            if (r4 != r5) goto L_0x0249
            r2.s(r11)
        L_0x0249:
            r6 = 6
            if (r4 < r6) goto L_0x024f
            r2.s(r5)
        L_0x024f:
            boolean r5 = r2.h()
            if (r5 == 0) goto L_0x025b
            r5 = 8
            r2.s(r5)
            goto L_0x025d
        L_0x025b:
            r5 = 8
        L_0x025d:
            if (r4 != 0) goto L_0x0268
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x0268
            r2.s(r5)
        L_0x0268:
            if (r15 >= r13) goto L_0x026d
            r2.r()
        L_0x026d:
            if (r7 != 0) goto L_0x0274
            if (r9 == r13) goto L_0x0274
            r2.r()
        L_0x0274:
            r4 = 2
            if (r7 != r4) goto L_0x0284
            if (r9 == r13) goto L_0x027f
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x0284
        L_0x027f:
            r4 = 6
            r2.s(r4)
            goto L_0x0285
        L_0x0284:
            r4 = 6
        L_0x0285:
            boolean r5 = r2.h()
            if (r5 == 0) goto L_0x029d
            int r4 = r2.i(r4)
            r5 = 1
            if (r4 != r5) goto L_0x029d
            r4 = 8
            int r2 = r2.i(r4)
            if (r2 != r5) goto L_0x029d
            java.lang.String r2 = "audio/eac3-joc"
            goto L_0x029f
        L_0x029d:
            java.lang.String r2 = "audio/eac3"
        L_0x029f:
            r7 = r16
            goto L_0x02f2
        L_0x02a2:
            r3 = 32
            r2.s(r3)
            r3 = 2
            int r4 = r2.i(r3)
            if (r4 != r13) goto L_0x02b0
            r3 = 0
            goto L_0x02b2
        L_0x02b0:
            java.lang.String r3 = "audio/ac3"
        L_0x02b2:
            r5 = 6
            int r5 = r2.i(r5)
            int r5 = z4.b.a(r4, r5)
            r6 = 8
            r2.s(r6)
            int r6 = r2.i(r13)
            r8 = r6 & 1
            if (r8 == 0) goto L_0x02d0
            r8 = 1
            if (r6 == r8) goto L_0x02d0
            r8 = 2
            r2.s(r8)
            goto L_0x02d1
        L_0x02d0:
            r8 = 2
        L_0x02d1:
            r9 = r6 & 4
            if (r9 == 0) goto L_0x02d8
            r2.s(r8)
        L_0x02d8:
            if (r6 != r8) goto L_0x02dd
            r2.s(r8)
        L_0x02dd:
            int[] r8 = z4.b.f28306b
            int r9 = r8.length
            if (r4 >= r9) goto L_0x02e4
            r7 = r8[r4]
        L_0x02e4:
            boolean r2 = r2.h()
            int[] r4 = z4.b.f28308d
            r4 = r4[r6]
            int r21 = r4 + r2
            r14 = 1536(0x600, float:2.152E-42)
            r2 = r3
            r3 = r5
        L_0x02f2:
            r4 = r21
            x4.b0 r5 = r0.f22003j
            if (r5 == 0) goto L_0x0308
            int r6 = r5.G
            if (r4 != r6) goto L_0x0308
            int r6 = r5.H
            if (r7 != r6) goto L_0x0308
            java.lang.String r5 = r5.f27408t
            boolean r5 = v6.e0.a(r2, r5)
            if (r5 != 0) goto L_0x0326
        L_0x0308:
            x4.b0$b r5 = new x4.b0$b
            r5.<init>()
            java.lang.String r6 = r0.f21997d
            r5.f27415a = r6
            r5.f27425k = r2
            r5.f27438x = r4
            r5.f27439y = r7
            java.lang.String r2 = r0.f21996c
            r5.f27417c = r2
            x4.b0 r2 = r5.a()
            r0.f22003j = r2
            d5.a0 r4 = r0.f21998e
            r4.c(r2)
        L_0x0326:
            r0.f22004k = r3
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = (long) r14
            long r4 = r4 * r2
            x4.b0 r2 = r0.f22003j
            int r2 = r2.H
            long r2 = (long) r2
            long r4 = r4 / r2
            r0.f22002i = r4
            v6.v r2 = r0.f21995b
            r3 = 0
            r2.D(r3)
            d5.a0 r2 = r0.f21998e
            v6.v r3 = r0.f21995b
            r4 = 128(0x80, float:1.794E-43)
            r2.b(r3, r4)
            r2 = 2
            r0.f21999f = r2
            goto L_0x0009
        L_0x034a:
            int r2 = r23.a()
            r4 = 119(0x77, float:1.67E-43)
            if (r2 <= 0) goto L_0x0375
            boolean r2 = r0.f22001h
            if (r2 != 0) goto L_0x0362
            int r2 = r23.s()
            if (r2 != r3) goto L_0x035e
            r2 = 1
            goto L_0x035f
        L_0x035e:
            r2 = 0
        L_0x035f:
            r0.f22001h = r2
            goto L_0x034a
        L_0x0362:
            int r2 = r23.s()
            if (r2 != r4) goto L_0x036d
            r5 = 0
            r0.f22001h = r5
            r5 = 1
            goto L_0x0376
        L_0x036d:
            if (r2 != r3) goto L_0x0371
            r5 = 1
            goto L_0x0372
        L_0x0371:
            r5 = 0
        L_0x0372:
            r0.f22001h = r5
            goto L_0x034a
        L_0x0375:
            r5 = 0
        L_0x0376:
            if (r5 == 0) goto L_0x0009
            r2 = 1
            r0.f21999f = r2
            v6.v r5 = r0.f21995b
            byte[] r5 = r5.f26518a
            r6 = 0
            r5[r6] = r3
            r5[r2] = r4
            r2 = 2
            r0.f22000g = r2
            goto L_0x0009
        L_0x0389:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.b.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f21997d = dVar.b();
        this.f21998e = kVar.l(dVar.c(), 1);
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22005l = j10;
    }
}
