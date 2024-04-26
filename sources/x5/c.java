package x5;

import d5.b0;
import q5.h;
import v6.v;

/* compiled from: SpliceInfoDecoder */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final v f27816a = new v();

    /* renamed from: b  reason: collision with root package name */
    public final b0 f27817b = new b0();

    /* renamed from: c  reason: collision with root package name */
    public v6.b0 f27818c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: q5.a$b[]} */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r7v17, types: [x5.a] */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r21v10, types: [x5.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q5.a b(q5.e r55, java.nio.ByteBuffer r56) {
        /*
            r54 = this;
            r0 = r54
            r1 = r55
            v6.b0 r2 = r0.f27818c
            if (r2 == 0) goto L_0x0012
            long r3 = r1.f24152i
            long r5 = r2.d()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
        L_0x0012:
            v6.b0 r2 = new v6.b0
            long r3 = r1.f88e
            r2.<init>(r3)
            r0.f27818c = r2
            long r5 = r1.f24152i
            long r3 = r3 - r5
            r2.a(r3)
        L_0x0021:
            byte[] r1 = r56.array()
            int r2 = r56.limit()
            v6.v r3 = r0.f27816a
            r3.B(r1, r2)
            d5.b0 r3 = r0.f27817b
            r3.n(r1, r2)
            d5.b0 r1 = r0.f27817b
            r2 = 39
            r1.s(r2)
            d5.b0 r1 = r0.f27817b
            r2 = 1
            int r1 = r1.i(r2)
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            d5.b0 r5 = r0.f27817b
            int r5 = r5.i(r1)
            long r5 = (long) r5
            long r11 = r3 | r5
            d5.b0 r3 = r0.f27817b
            r4 = 20
            r3.s(r4)
            d5.b0 r3 = r0.f27817b
            r4 = 12
            int r3 = r3.i(r4)
            d5.b0 r4 = r0.f27817b
            r5 = 8
            int r4 = r4.i(r5)
            v6.v r5 = r0.f27816a
            r6 = 14
            r5.E(r6)
            r5 = 0
            if (r4 == 0) goto L_0x02b2
            r7 = 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L_0x0294
            r3 = 4
            r7 = 128(0x80, double:6.32E-322)
            r17 = 0
            r19 = 1
            if (r4 == r3) goto L_0x018a
            r3 = 5
            if (r4 == r3) goto L_0x0098
            r1 = 6
            if (r4 == r1) goto L_0x0084
            goto L_0x02b7
        L_0x0084:
            v6.v r1 = r0.f27816a
            v6.b0 r3 = r0.f27818c
            long r4 = x5.g.a(r1, r11)
            long r7 = r3.b(r4)
            x5.g r1 = new x5.g
            r1.<init>(r4, r7)
            r5 = r1
            goto L_0x02b7
        L_0x0098:
            v6.v r3 = r0.f27816a
            v6.b0 r4 = r0.f27818c
            long r22 = r3.t()
            int r5 = r3.s()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00ab
            r24 = 1
            goto L_0x00ad
        L_0x00ab:
            r24 = 0
        L_0x00ad:
            java.util.List r5 = java.util.Collections.emptyList()
            if (r24 != 0) goto L_0x0161
            int r9 = r3.s()
            r10 = r9 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00bd
            r10 = 1
            goto L_0x00be
        L_0x00bd:
            r10 = 0
        L_0x00be:
            r21 = r9 & 64
            if (r21 == 0) goto L_0x00c5
            r21 = 1
            goto L_0x00c7
        L_0x00c5:
            r21 = 0
        L_0x00c7:
            r25 = r9 & 32
            if (r25 == 0) goto L_0x00ce
            r25 = 1
            goto L_0x00d0
        L_0x00ce:
            r25 = 0
        L_0x00d0:
            r9 = r9 & 16
            if (r9 == 0) goto L_0x00d6
            r9 = 1
            goto L_0x00d7
        L_0x00d6:
            r9 = 0
        L_0x00d7:
            if (r21 == 0) goto L_0x00e0
            if (r9 != 0) goto L_0x00e0
            long r26 = x5.g.a(r3, r11)
            goto L_0x00e5
        L_0x00e0:
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e5:
            if (r21 != 0) goto L_0x011b
            int r5 = r3.s()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r6 = 0
        L_0x00f1:
            if (r6 >= r5) goto L_0x011a
            int r29 = r3.s()
            if (r9 != 0) goto L_0x0100
            long r30 = x5.g.a(r3, r11)
            r13 = r30
            goto L_0x0105
        L_0x0100:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0105:
            x5.d$b r15 = new x5.d$b
            long r32 = r4.b(r13)
            r34 = 0
            r28 = r15
            r30 = r13
            r28.<init>(r29, r30, r32, r34)
            r2.add(r15)
            int r6 = r6 + 1
            goto L_0x00f1
        L_0x011a:
            r5 = r2
        L_0x011b:
            if (r25 == 0) goto L_0x013a
            int r2 = r3.s()
            long r11 = (long) r2
            long r7 = r7 & r11
            int r2 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0129
            r2 = 1
            goto L_0x012a
        L_0x0129:
            r2 = 0
        L_0x012a:
            long r6 = r11 & r19
            long r6 = r6 << r1
            long r11 = r3.t()
            long r6 = r6 | r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r11
            r11 = 90
            long r6 = r6 / r11
            goto L_0x0140
        L_0x013a:
            r2 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0140:
            int r1 = r3.x()
            int r8 = r3.s()
            int r3 = r3.s()
            r36 = r1
            r33 = r2
            r38 = r3
            r32 = r5
            r34 = r6
            r37 = r8
            r25 = r10
            r1 = r26
            r27 = r9
            r26 = r21
            goto L_0x017b
        L_0x0161:
            r32 = r5
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = 0
            r26 = 0
            r27 = 0
            r33 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r36 = 0
            r37 = 0
            r38 = 0
        L_0x017b:
            x5.d r5 = new x5.d
            r21 = r5
            long r30 = r4.b(r1)
            r28 = r1
            r21.<init>(r22, r24, r25, r26, r27, r28, r30, r32, r33, r34, r36, r37, r38)
            goto L_0x02b7
        L_0x018a:
            v6.v r2 = r0.f27816a
            int r3 = r2.s()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r6 = 0
        L_0x0196:
            if (r6 >= r3) goto L_0x028e
            long r40 = r2.t()
            int r9 = r2.s()
            r9 = r9 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01a7
            r42 = 1
            goto L_0x01a9
        L_0x01a7:
            r42 = 0
        L_0x01a9:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r42 != 0) goto L_0x0258
            int r10 = r2.s()
            r11 = r10 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x01ba
            r11 = 1
            goto L_0x01bb
        L_0x01ba:
            r11 = 0
        L_0x01bb:
            r12 = r10 & 64
            if (r12 == 0) goto L_0x01c1
            r12 = 1
            goto L_0x01c2
        L_0x01c1:
            r12 = 0
        L_0x01c2:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01c8:
            r10 = 0
        L_0x01c9:
            if (r12 == 0) goto L_0x01d0
            long r13 = r2.t()
            goto L_0x01d5
        L_0x01d0:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01d5:
            if (r12 != 0) goto L_0x0204
            int r9 = r2.s()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r9)
            r1 = 0
        L_0x01e1:
            if (r1 >= r9) goto L_0x0200
            int r7 = r2.s()
            r23 = r9
            long r8 = r2.t()
            r24 = r3
            x5.f$b r3 = new x5.f$b
            r3.<init>(r7, r8, r5)
            r15.add(r3)
            int r1 = r1 + 1
            r9 = r23
            r3 = r24
            r7 = 128(0x80, double:6.32E-322)
            goto L_0x01e1
        L_0x0200:
            r24 = r3
            r9 = r15
            goto L_0x0206
        L_0x0204:
            r24 = r3
        L_0x0206:
            if (r10 == 0) goto L_0x022b
            int r1 = r2.s()
            long r7 = (long) r1
            r21 = 128(0x80, double:6.32E-322)
            long r25 = r7 & r21
            int r1 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0217
            r1 = 1
            goto L_0x0218
        L_0x0217:
            r1 = 0
        L_0x0218:
            long r7 = r7 & r19
            r3 = 32
            long r7 = r7 << r3
            long r15 = r2.t()
            long r7 = r7 | r15
            r15 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r15
            r25 = 90
            long r7 = r7 / r25
            goto L_0x0239
        L_0x022b:
            r3 = 32
            r15 = 1000(0x3e8, double:4.94E-321)
            r21 = 128(0x80, double:6.32E-322)
            r25 = 90
            r1 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0239:
            int r10 = r2.x()
            int r23 = r2.s()
            int r27 = r2.s()
            r48 = r1
            r49 = r7
            r45 = r9
            r51 = r10
            r43 = r11
            r44 = r12
            r46 = r13
            r52 = r23
            r53 = r27
            goto L_0x027a
        L_0x0258:
            r24 = r3
            r21 = r7
            r3 = 32
            r15 = 1000(0x3e8, double:4.94E-321)
            r25 = 90
            r45 = r9
            r43 = 0
            r44 = 0
            r46 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r48 = 0
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r51 = 0
            r52 = 0
            r53 = 0
        L_0x027a:
            x5.f$c r1 = new x5.f$c
            r39 = r1
            r39.<init>(r40, r42, r43, r44, r45, r46, r48, r49, r51, r52, r53)
            r4.add(r1)
            int r6 = r6 + 1
            r7 = r21
            r3 = r24
            r1 = 32
            goto L_0x0196
        L_0x028e:
            x5.f r5 = new x5.f
            r5.<init>(r4)
            goto L_0x02b7
        L_0x0294:
            v6.v r1 = r0.f27816a
            long r8 = r1.t()
            int r3 = r3 + -4
            byte[] r10 = new byte[r3]
            byte[] r2 = r1.f26518a
            int r4 = r1.f26519b
            r5 = 0
            java.lang.System.arraycopy(r2, r4, r10, r5, r3)
            int r2 = r1.f26519b
            int r2 = r2 + r3
            r1.f26519b = r2
            x5.a r5 = new x5.a
            r7 = r5
            r7.<init>(r8, r10, r11)
            goto L_0x02b7
        L_0x02b2:
            x5.e r5 = new x5.e
            r5.<init>()
        L_0x02b7:
            if (r5 != 0) goto L_0x02c2
            q5.a r1 = new q5.a
            r2 = 0
            q5.a$b[] r2 = new q5.a.b[r2]
            r1.<init>((q5.a.b[]) r2)
            goto L_0x02cd
        L_0x02c2:
            r2 = 0
            q5.a r1 = new q5.a
            r3 = 1
            q5.a$b[] r3 = new q5.a.b[r3]
            r3[r2] = r5
            r1.<init>((q5.a.b[]) r3)
        L_0x02cd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.c.b(q5.e, java.nio.ByteBuffer):q5.a");
    }
}
