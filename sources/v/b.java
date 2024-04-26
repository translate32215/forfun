package v;

/* compiled from: Chain */
public class b {
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d1, code lost:
        if (r3 == r6) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e7, code lost:
        if (r3 == r6) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01eb, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02be, code lost:
        if (r4[r16].f26234f.f26232d == r6) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0138, code lost:
        if (r5[r2].f26234f.f26232d == r6) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x048b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04f7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x060c  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0714  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0728  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x072f  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x073f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(v.g r34, t.c r35, java.util.ArrayList<v.f> r36, int r37) {
        /*
            r0 = r34
            r10 = r35
            r11 = r36
            r12 = 2
            if (r37 != 0) goto L_0x0012
            int r1 = r0.A0
            v.c[] r2 = r0.D0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.B0
            v.c[] r2 = r0.C0
            r14 = r1
            r15 = r2
            r16 = 2
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0771
            r1 = r15[r9]
            boolean r2 = r1.f26228t
            r17 = 0
            r3 = 3
            r8 = 8
            r5 = 1
            if (r2 != 0) goto L_0x018c
            int r2 = r1.f26223o
            int r2 = r2 * 2
            v.f r6 = r1.f26209a
            r7 = r6
            r18 = 0
        L_0x0032:
            if (r18 != 0) goto L_0x014a
            int r13 = r1.f26217i
            int r13 = r13 + r5
            r1.f26217i = r13
            v.f[] r13 = r6.f26276o0
            int r4 = r1.f26223o
            r13[r4] = r17
            v.f[] r13 = r6.f26274n0
            r13[r4] = r17
            int r13 = r6.f26264i0
            if (r13 == r8) goto L_0x0116
            int r13 = r1.f26220l
            int r13 = r13 + r5
            r1.f26220l = r13
            int r4 = r6.k(r4)
            if (r4 == r3) goto L_0x0068
            int r4 = r1.f26221m
            int r13 = r1.f26223o
            if (r13 != 0) goto L_0x005d
            int r13 = r6.u()
            goto L_0x0065
        L_0x005d:
            if (r13 != r5) goto L_0x0064
            int r13 = r6.l()
            goto L_0x0065
        L_0x0064:
            r13 = 0
        L_0x0065:
            int r4 = r4 + r13
            r1.f26221m = r4
        L_0x0068:
            int r4 = r1.f26221m
            v.d[] r13 = r6.R
            r13 = r13[r2]
            int r13 = r13.d()
            int r13 = r13 + r4
            r1.f26221m = r13
            v.d[] r4 = r6.R
            int r21 = r2 + 1
            r4 = r4[r21]
            int r4 = r4.d()
            int r4 = r4 + r13
            r1.f26221m = r4
            int r4 = r1.f26222n
            v.d[] r13 = r6.R
            r13 = r13[r2]
            int r13 = r13.d()
            int r13 = r13 + r4
            r1.f26222n = r13
            v.d[] r4 = r6.R
            r4 = r4[r21]
            int r4 = r4.d()
            int r4 = r4 + r13
            r1.f26222n = r4
            v.f r4 = r1.f26210b
            if (r4 != 0) goto L_0x00a0
            r1.f26210b = r6
        L_0x00a0:
            r1.f26212d = r6
            int[] r4 = r6.U
            int r13 = r1.f26223o
            r8 = r4[r13]
            if (r8 != r3) goto L_0x0116
            int[] r8 = r6.f26283t
            r22 = r8[r13]
            if (r22 == 0) goto L_0x00b8
            r5 = r8[r13]
            if (r5 == r3) goto L_0x00b8
            r5 = r8[r13]
            if (r5 != r12) goto L_0x0116
        L_0x00b8:
            int r5 = r1.f26218j
            r22 = 1
            int r5 = r5 + 1
            r1.f26218j = r5
            float[] r5 = r6.f26272m0
            r23 = r5[r13]
            r20 = 0
            int r24 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r24 <= 0) goto L_0x00d1
            float r12 = r1.f26219k
            r5 = r5[r13]
            float r12 = r12 + r5
            r1.f26219k = r12
        L_0x00d1:
            int r5 = r6.f26264i0
            r12 = 8
            if (r5 == r12) goto L_0x00e5
            r4 = r4[r13]
            if (r4 != r3) goto L_0x00e5
            r4 = r8[r13]
            if (r4 == 0) goto L_0x00e3
            r4 = r8[r13]
            if (r4 != r3) goto L_0x00e5
        L_0x00e3:
            r4 = 1
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            if (r4 == 0) goto L_0x0104
            r4 = 0
            int r5 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f1
            r4 = 1
            r1.f26225q = r4
            goto L_0x00f4
        L_0x00f1:
            r4 = 1
            r1.f26226r = r4
        L_0x00f4:
            java.util.ArrayList<v.f> r4 = r1.f26216h
            if (r4 != 0) goto L_0x00ff
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f26216h = r4
        L_0x00ff:
            java.util.ArrayList<v.f> r4 = r1.f26216h
            r4.add(r6)
        L_0x0104:
            v.f r4 = r1.f26214f
            if (r4 != 0) goto L_0x010a
            r1.f26214f = r6
        L_0x010a:
            v.f r4 = r1.f26215g
            if (r4 == 0) goto L_0x0114
            v.f[] r4 = r4.f26274n0
            int r5 = r1.f26223o
            r4[r5] = r6
        L_0x0114:
            r1.f26215g = r6
        L_0x0116:
            if (r7 == r6) goto L_0x011e
            v.f[] r4 = r7.f26276o0
            int r5 = r1.f26223o
            r4[r5] = r6
        L_0x011e:
            v.d[] r4 = r6.R
            int r5 = r2 + 1
            r4 = r4[r5]
            v.d r4 = r4.f26234f
            if (r4 == 0) goto L_0x013a
            v.f r4 = r4.f26232d
            v.d[] r5 = r4.R
            r7 = r5[r2]
            v.d r7 = r7.f26234f
            if (r7 == 0) goto L_0x013a
            r5 = r5[r2]
            v.d r5 = r5.f26234f
            v.f r5 = r5.f26232d
            if (r5 == r6) goto L_0x013c
        L_0x013a:
            r4 = r17
        L_0x013c:
            if (r4 == 0) goto L_0x013f
            goto L_0x0142
        L_0x013f:
            r4 = r6
            r18 = 1
        L_0x0142:
            r7 = r6
            r5 = 1
            r8 = 8
            r12 = 2
            r6 = r4
            goto L_0x0032
        L_0x014a:
            v.f r4 = r1.f26210b
            if (r4 == 0) goto L_0x015b
            int r5 = r1.f26221m
            v.d[] r4 = r4.R
            r4 = r4[r2]
            int r4 = r4.d()
            int r5 = r5 - r4
            r1.f26221m = r5
        L_0x015b:
            v.f r4 = r1.f26212d
            if (r4 == 0) goto L_0x016e
            int r5 = r1.f26221m
            v.d[] r4 = r4.R
            int r2 = r2 + 1
            r2 = r4[r2]
            int r2 = r2.d()
            int r5 = r5 - r2
            r1.f26221m = r5
        L_0x016e:
            r1.f26211c = r6
            int r2 = r1.f26223o
            if (r2 != 0) goto L_0x017b
            boolean r2 = r1.f26224p
            if (r2 == 0) goto L_0x017b
            r1.f26213e = r6
            goto L_0x017f
        L_0x017b:
            v.f r2 = r1.f26209a
            r1.f26213e = r2
        L_0x017f:
            boolean r2 = r1.f26226r
            if (r2 == 0) goto L_0x0189
            boolean r2 = r1.f26225q
            if (r2 == 0) goto L_0x0189
            r2 = 1
            goto L_0x018a
        L_0x0189:
            r2 = 0
        L_0x018a:
            r1.f26227s = r2
        L_0x018c:
            r2 = 1
            r1.f26228t = r2
            if (r11 == 0) goto L_0x01a4
            v.f r2 = r1.f26209a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x019a
            goto L_0x01a4
        L_0x019a:
            r29 = r9
            r28 = r14
            r30 = r15
            r19 = 0
            goto L_0x0764
        L_0x01a4:
            v.f r12 = r1.f26209a
            v.f r13 = r1.f26211c
            v.f r8 = r1.f26210b
            v.f r7 = r1.f26212d
            v.f r2 = r1.f26213e
            float r4 = r1.f26219k
            int[] r5 = r0.U
            r5 = r5[r37]
            r6 = 2
            if (r5 != r6) goto L_0x01b9
            r5 = 1
            goto L_0x01ba
        L_0x01b9:
            r5 = 0
        L_0x01ba:
            if (r37 != 0) goto L_0x01d4
            int r3 = r2.f26268k0
            r6 = 1
            if (r3 != 0) goto L_0x01c4
            r22 = 1
            goto L_0x01c6
        L_0x01c4:
            r22 = 0
        L_0x01c6:
            if (r3 != r6) goto L_0x01cc
            r6 = 2
            r23 = 1
            goto L_0x01cf
        L_0x01cc:
            r6 = 2
            r23 = 0
        L_0x01cf:
            r24 = r22
            if (r3 != r6) goto L_0x01eb
            goto L_0x01e9
        L_0x01d4:
            int r3 = r2.f26270l0
            r6 = 1
            if (r3 != 0) goto L_0x01dc
            r24 = 1
            goto L_0x01de
        L_0x01dc:
            r24 = 0
        L_0x01de:
            if (r3 != r6) goto L_0x01e4
            r6 = 2
            r23 = 1
            goto L_0x01e7
        L_0x01e4:
            r6 = 2
            r23 = 0
        L_0x01e7:
            if (r3 != r6) goto L_0x01eb
        L_0x01e9:
            r3 = 1
            goto L_0x01ec
        L_0x01eb:
            r3 = 0
        L_0x01ec:
            r26 = r4
            r6 = r12
            r25 = 0
        L_0x01f1:
            if (r25 != 0) goto L_0x02d4
            v.d[] r4 = r6.R
            r4 = r4[r16]
            if (r3 == 0) goto L_0x01fc
            r27 = 1
            goto L_0x01fe
        L_0x01fc:
            r27 = 4
        L_0x01fe:
            int r28 = r4.d()
            r29 = r9
            int[] r9 = r6.U
            r9 = r9[r37]
            r11 = 3
            if (r9 != r11) goto L_0x0213
            int[] r9 = r6.f26283t
            r9 = r9[r37]
            if (r9 != 0) goto L_0x0213
            r9 = 1
            goto L_0x0214
        L_0x0213:
            r9 = 0
        L_0x0214:
            v.d r11 = r4.f26234f
            if (r11 == 0) goto L_0x0220
            if (r6 == r12) goto L_0x0220
            int r11 = r11.d()
            int r28 = r11 + r28
        L_0x0220:
            r11 = r28
            if (r3 == 0) goto L_0x022d
            if (r6 == r12) goto L_0x022d
            if (r6 == r8) goto L_0x022d
            r28 = r14
            r27 = 8
            goto L_0x022f
        L_0x022d:
            r28 = r14
        L_0x022f:
            v.d r14 = r4.f26234f
            if (r14 == 0) goto L_0x026d
            if (r6 != r8) goto L_0x0242
            r30 = r15
            t.h r15 = r4.f26237i
            t.h r14 = r14.f26237i
            r31 = r2
            r2 = 6
            r10.f(r15, r14, r11, r2)
            goto L_0x024f
        L_0x0242:
            r31 = r2
            r30 = r15
            t.h r2 = r4.f26237i
            t.h r14 = r14.f26237i
            r15 = 8
            r10.f(r2, r14, r11, r15)
        L_0x024f:
            if (r9 == 0) goto L_0x0255
            if (r3 != 0) goto L_0x0255
            r27 = 5
        L_0x0255:
            if (r6 != r8) goto L_0x0261
            if (r3 == 0) goto L_0x0261
            boolean[] r2 = r6.T
            boolean r2 = r2[r37]
            if (r2 == 0) goto L_0x0261
            r2 = 5
            goto L_0x0263
        L_0x0261:
            r2 = r27
        L_0x0263:
            t.h r9 = r4.f26237i
            v.d r4 = r4.f26234f
            t.h r4 = r4.f26237i
            r10.d(r9, r4, r11, r2)
            goto L_0x0271
        L_0x026d:
            r31 = r2
            r30 = r15
        L_0x0271:
            if (r5 == 0) goto L_0x02a4
            int r2 = r6.f26264i0
            r4 = 8
            if (r2 == r4) goto L_0x0292
            int[] r2 = r6.U
            r2 = r2[r37]
            r4 = 3
            if (r2 != r4) goto L_0x0292
            v.d[] r2 = r6.R
            int r4 = r16 + 1
            r4 = r2[r4]
            t.h r4 = r4.f26237i
            r2 = r2[r16]
            t.h r2 = r2.f26237i
            r9 = 5
            r11 = 0
            r10.f(r4, r2, r11, r9)
            goto L_0x0293
        L_0x0292:
            r11 = 0
        L_0x0293:
            v.d[] r2 = r6.R
            r2 = r2[r16]
            t.h r2 = r2.f26237i
            v.d[] r4 = r0.R
            r4 = r4[r16]
            t.h r4 = r4.f26237i
            r9 = 8
            r10.f(r2, r4, r11, r9)
        L_0x02a4:
            v.d[] r2 = r6.R
            int r4 = r16 + 1
            r2 = r2[r4]
            v.d r2 = r2.f26234f
            if (r2 == 0) goto L_0x02c0
            v.f r2 = r2.f26232d
            v.d[] r4 = r2.R
            r9 = r4[r16]
            v.d r9 = r9.f26234f
            if (r9 == 0) goto L_0x02c0
            r4 = r4[r16]
            v.d r4 = r4.f26234f
            v.f r4 = r4.f26232d
            if (r4 == r6) goto L_0x02c2
        L_0x02c0:
            r2 = r17
        L_0x02c2:
            if (r2 == 0) goto L_0x02c6
            r6 = r2
            goto L_0x02c8
        L_0x02c6:
            r25 = 1
        L_0x02c8:
            r11 = r36
            r14 = r28
            r9 = r29
            r15 = r30
            r2 = r31
            goto L_0x01f1
        L_0x02d4:
            r31 = r2
            r29 = r9
            r28 = r14
            r30 = r15
            if (r7 == 0) goto L_0x033e
            v.d[] r2 = r13.R
            int r4 = r16 + 1
            r2 = r2[r4]
            v.d r2 = r2.f26234f
            if (r2 == 0) goto L_0x033e
            v.d[] r2 = r7.R
            r2 = r2[r4]
            int[] r6 = r7.U
            r6 = r6[r37]
            r9 = 3
            if (r6 != r9) goto L_0x02fb
            int[] r6 = r7.f26283t
            r6 = r6[r37]
            if (r6 != 0) goto L_0x02fb
            r6 = 1
            goto L_0x02fc
        L_0x02fb:
            r6 = 0
        L_0x02fc:
            if (r6 == 0) goto L_0x0314
            if (r3 != 0) goto L_0x0314
            v.d r6 = r2.f26234f
            v.f r9 = r6.f26232d
            if (r9 != r0) goto L_0x0314
            t.h r9 = r2.f26237i
            t.h r6 = r6.f26237i
            int r11 = r2.d()
            int r11 = -r11
            r14 = 5
            r10.d(r9, r6, r11, r14)
            goto L_0x032a
        L_0x0314:
            r14 = 5
            if (r3 == 0) goto L_0x032a
            v.d r6 = r2.f26234f
            v.f r9 = r6.f26232d
            if (r9 != r0) goto L_0x032a
            t.h r9 = r2.f26237i
            t.h r6 = r6.f26237i
            int r11 = r2.d()
            int r11 = -r11
            r15 = 4
            r10.d(r9, r6, r11, r15)
        L_0x032a:
            t.h r6 = r2.f26237i
            v.d[] r9 = r13.R
            r4 = r9[r4]
            v.d r4 = r4.f26234f
            t.h r4 = r4.f26237i
            int r2 = r2.d()
            int r2 = -r2
            r9 = 6
            r10.g(r6, r4, r2, r9)
            goto L_0x033f
        L_0x033e:
            r14 = 5
        L_0x033f:
            if (r5 == 0) goto L_0x035a
            v.d[] r2 = r0.R
            int r4 = r16 + 1
            r2 = r2[r4]
            t.h r2 = r2.f26237i
            v.d[] r5 = r13.R
            r6 = r5[r4]
            t.h r6 = r6.f26237i
            r4 = r5[r4]
            int r4 = r4.d()
            r5 = 8
            r10.f(r2, r6, r4, r5)
        L_0x035a:
            java.util.ArrayList<v.f> r2 = r1.f26216h
            if (r2 == 0) goto L_0x0481
            int r4 = r2.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0481
            boolean r6 = r1.f26225q
            if (r6 == 0) goto L_0x0371
            boolean r6 = r1.f26227s
            if (r6 != 0) goto L_0x0371
            int r6 = r1.f26218j
            float r6 = (float) r6
            goto L_0x0373
        L_0x0371:
            r6 = r26
        L_0x0373:
            r15 = r17
            r9 = 0
            r11 = 0
        L_0x0377:
            if (r11 >= r4) goto L_0x0481
            java.lang.Object r18 = r2.get(r11)
            r5 = r18
            v.f r5 = (v.f) r5
            float[] r14 = r5.f26272m0
            r14 = r14[r37]
            r18 = 0
            int r25 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r25 >= 0) goto L_0x03ae
            boolean r14 = r1.f26227s
            if (r14 == 0) goto L_0x03a6
            v.d[] r0 = r5.R
            int r5 = r16 + 1
            r5 = r0[r5]
            t.h r5 = r5.f26237i
            r0 = r0[r16]
            t.h r0 = r0.f26237i
            r18 = r2
            r2 = 0
            r14 = 4
            r10.d(r5, r0, r2, r14)
            r14 = 0
            r25 = 4
            goto L_0x03c9
        L_0x03a6:
            r18 = r2
            r2 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r25 = 4
            goto L_0x03b3
        L_0x03ae:
            r18 = r2
            r25 = 4
            r2 = 0
        L_0x03b3:
            int r26 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r26 != 0) goto L_0x03d3
            v.d[] r0 = r5.R
            int r2 = r16 + 1
            r2 = r0[r2]
            t.h r2 = r2.f26237i
            r0 = r0[r16]
            t.h r0 = r0.f26237i
            r5 = 8
            r14 = 0
            r10.d(r2, r0, r14, r5)
        L_0x03c9:
            r32 = r1
            r27 = r4
            r20 = r13
            r19 = 0
            goto L_0x0471
        L_0x03d3:
            r19 = 0
            if (r15 == 0) goto L_0x0466
            v.d[] r2 = r15.R
            r15 = r2[r16]
            t.h r15 = r15.f26237i
            int r26 = r16 + 1
            r2 = r2[r26]
            t.h r2 = r2.f26237i
            v.d[] r0 = r5.R
            r27 = r4
            r4 = r0[r16]
            t.h r4 = r4.f26237i
            r0 = r0[r26]
            t.h r0 = r0.f26237i
            r26 = r5
            t.b r5 = r35.m()
            r32 = r1
            r1 = 0
            r5.f25275b = r1
            r20 = r13
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r33 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r33 == 0) goto L_0x044a
            int r33 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r33 != 0) goto L_0x0407
            goto L_0x044a
        L_0x0407:
            int r33 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r33 != 0) goto L_0x0418
            t.b$a r0 = r5.f25277d
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.d(r15, r4)
            t.b$a r0 = r5.f25277d
            r0.d(r2, r13)
            goto L_0x0462
        L_0x0418:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r33 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r33 != 0) goto L_0x042b
            t.b$a r2 = r5.f25277d
            r2.d(r4, r13)
            t.b$a r2 = r5.f25277d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.d(r0, r4)
            goto L_0x0462
        L_0x042b:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = r9 / r6
            float r33 = r14 / r6
            float r9 = r9 / r33
            t.b$a r1 = r5.f25277d
            r1.d(r15, r13)
            t.b$a r1 = r5.f25277d
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.d(r2, r13)
            t.b$a r1 = r5.f25277d
            r1.d(r0, r9)
            t.b$a r0 = r5.f25277d
            float r1 = -r9
            r0.d(r4, r1)
            goto L_0x0462
        L_0x044a:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            t.b$a r9 = r5.f25277d
            r9.d(r15, r13)
            t.b$a r9 = r5.f25277d
            r9.d(r2, r1)
            t.b$a r2 = r5.f25277d
            r2.d(r0, r13)
            t.b$a r0 = r5.f25277d
            r0.d(r4, r1)
        L_0x0462:
            r10.c(r5)
            goto L_0x046e
        L_0x0466:
            r32 = r1
            r27 = r4
            r26 = r5
            r20 = r13
        L_0x046e:
            r9 = r14
            r15 = r26
        L_0x0471:
            int r11 = r11 + 1
            r5 = 1
            r14 = 5
            r0 = r34
            r2 = r18
            r13 = r20
            r4 = r27
            r1 = r32
            goto L_0x0377
        L_0x0481:
            r32 = r1
            r20 = r13
            r19 = 0
            r25 = 4
            if (r8 == 0) goto L_0x04ee
            if (r8 == r7) goto L_0x048f
            if (r3 == 0) goto L_0x04ee
        L_0x048f:
            v.d[] r0 = r12.R
            r0 = r0[r16]
            r11 = r20
            v.d[] r1 = r11.R
            int r2 = r16 + 1
            r1 = r1[r2]
            v.d r0 = r0.f26234f
            if (r0 == 0) goto L_0x04a3
            t.h r0 = r0.f26237i
            r3 = r0
            goto L_0x04a5
        L_0x04a3:
            r3 = r17
        L_0x04a5:
            v.d r0 = r1.f26234f
            if (r0 == 0) goto L_0x04ad
            t.h r0 = r0.f26237i
            r6 = r0
            goto L_0x04af
        L_0x04ad:
            r6 = r17
        L_0x04af:
            v.d[] r0 = r8.R
            r0 = r0[r16]
            if (r7 == 0) goto L_0x04b9
            v.d[] r1 = r7.R
            r1 = r1[r2]
        L_0x04b9:
            if (r3 == 0) goto L_0x04e5
            if (r6 == 0) goto L_0x04e5
            if (r37 != 0) goto L_0x04c4
            r2 = r31
            float r2 = r2.f26258f0
            goto L_0x04c8
        L_0x04c4:
            r2 = r31
            float r2 = r2.f26260g0
        L_0x04c8:
            r5 = r2
            int r4 = r0.d()
            int r9 = r1.d()
            t.h r2 = r0.f26237i
            t.h r0 = r1.f26237i
            r12 = 7
            r1 = r35
            r13 = 2
            r14 = r7
            r7 = r0
            r0 = r8
            r8 = r9
            r15 = r29
            r9 = r12
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0704
        L_0x04e5:
            r14 = r7
            r0 = r8
            r15 = r29
            r13 = 2
        L_0x04ea:
            r29 = r15
            goto L_0x0704
        L_0x04ee:
            r14 = r7
            r0 = r8
            r11 = r20
            r15 = r29
            r13 = 2
            if (r24 == 0) goto L_0x05f3
            if (r0 == 0) goto L_0x05f3
            r1 = r32
            int r2 = r1.f26218j
            if (r2 <= 0) goto L_0x0506
            int r1 = r1.f26217i
            if (r1 != r2) goto L_0x0506
            r22 = 1
            goto L_0x0508
        L_0x0506:
            r22 = 0
        L_0x0508:
            r8 = r0
            r9 = r8
        L_0x050a:
            if (r9 == 0) goto L_0x04ea
            v.f[] r1 = r9.f26276o0
            r1 = r1[r37]
            r7 = r1
        L_0x0511:
            if (r7 == 0) goto L_0x051e
            int r1 = r7.f26264i0
            r6 = 8
            if (r1 != r6) goto L_0x0520
            v.f[] r1 = r7.f26276o0
            r7 = r1[r37]
            goto L_0x0511
        L_0x051e:
            r6 = 8
        L_0x0520:
            if (r7 != 0) goto L_0x052d
            if (r9 != r14) goto L_0x0525
            goto L_0x052d
        L_0x0525:
            r13 = r7
            r18 = r8
            r29 = r15
        L_0x052a:
            r15 = r9
            goto L_0x05e3
        L_0x052d:
            v.d[] r1 = r9.R
            r1 = r1[r16]
            t.h r2 = r1.f26237i
            v.d r3 = r1.f26234f
            if (r3 == 0) goto L_0x053a
            t.h r3 = r3.f26237i
            goto L_0x053c
        L_0x053a:
            r3 = r17
        L_0x053c:
            if (r8 == r9) goto L_0x0547
            v.d[] r3 = r8.R
            int r4 = r16 + 1
            r3 = r3[r4]
            t.h r3 = r3.f26237i
            goto L_0x055a
        L_0x0547:
            if (r9 != r0) goto L_0x055a
            v.d[] r3 = r12.R
            r4 = r3[r16]
            v.d r4 = r4.f26234f
            if (r4 == 0) goto L_0x0558
            r3 = r3[r16]
            v.d r3 = r3.f26234f
            t.h r3 = r3.f26237i
            goto L_0x055a
        L_0x0558:
            r3 = r17
        L_0x055a:
            int r1 = r1.d()
            v.d[] r4 = r9.R
            int r5 = r16 + 1
            r4 = r4[r5]
            int r4 = r4.d()
            if (r7 == 0) goto L_0x0571
            v.d[] r6 = r7.R
            r6 = r6[r16]
            t.h r13 = r6.f26237i
            goto L_0x057b
        L_0x0571:
            v.d[] r6 = r11.R
            r6 = r6[r5]
            v.d r6 = r6.f26234f
            if (r6 == 0) goto L_0x057e
            t.h r13 = r6.f26237i
        L_0x057b:
            r18 = r7
            goto L_0x0582
        L_0x057e:
            r18 = r7
            r13 = r17
        L_0x0582:
            v.d[] r7 = r9.R
            r7 = r7[r5]
            t.h r7 = r7.f26237i
            if (r6 == 0) goto L_0x058f
            int r6 = r6.d()
            int r4 = r4 + r6
        L_0x058f:
            v.d[] r6 = r8.R
            r6 = r6[r5]
            int r6 = r6.d()
            int r6 = r6 + r1
            if (r2 == 0) goto L_0x05db
            if (r3 == 0) goto L_0x05db
            if (r13 == 0) goto L_0x05db
            if (r7 == 0) goto L_0x05db
            if (r9 != r0) goto L_0x05ab
            v.d[] r1 = r0.R
            r1 = r1[r16]
            int r1 = r1.d()
            r6 = r1
        L_0x05ab:
            if (r9 != r14) goto L_0x05b8
            v.d[] r1 = r14.R
            r1 = r1[r5]
            int r1 = r1.d()
            r20 = r1
            goto L_0x05ba
        L_0x05b8:
            r20 = r4
        L_0x05ba:
            if (r22 == 0) goto L_0x05bf
            r25 = 8
            goto L_0x05c1
        L_0x05bf:
            r25 = 5
        L_0x05c1:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r35
            r29 = r15
            r15 = 5
            r4 = r6
            r21 = 8
            r6 = r13
            r13 = r18
            r18 = r8
            r15 = 8
            r8 = r20
            r15 = r9
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05e3
        L_0x05db:
            r29 = r15
            r13 = r18
            r18 = r8
            goto L_0x052a
        L_0x05e3:
            int r1 = r15.f26264i0
            r2 = 8
            if (r1 == r2) goto L_0x05eb
            r8 = r15
            goto L_0x05ed
        L_0x05eb:
            r8 = r18
        L_0x05ed:
            r9 = r13
            r15 = r29
            r13 = 2
            goto L_0x050a
        L_0x05f3:
            r29 = r15
            r1 = r32
            if (r23 == 0) goto L_0x0704
            if (r0 == 0) goto L_0x0704
            int r2 = r1.f26218j
            if (r2 <= 0) goto L_0x0606
            int r1 = r1.f26217i
            if (r1 != r2) goto L_0x0606
            r22 = 1
            goto L_0x0608
        L_0x0606:
            r22 = 0
        L_0x0608:
            r13 = r0
            r15 = r13
        L_0x060a:
            if (r13 == 0) goto L_0x06aa
            v.f[] r1 = r13.f26276o0
            r1 = r1[r37]
        L_0x0610:
            if (r1 == 0) goto L_0x061d
            int r2 = r1.f26264i0
            r3 = 8
            if (r2 != r3) goto L_0x061d
            v.f[] r1 = r1.f26276o0
            r1 = r1[r37]
            goto L_0x0610
        L_0x061d:
            if (r13 == r0) goto L_0x069f
            if (r13 == r14) goto L_0x069f
            if (r1 == 0) goto L_0x069f
            if (r1 != r14) goto L_0x0628
            r9 = r17
            goto L_0x0629
        L_0x0628:
            r9 = r1
        L_0x0629:
            v.d[] r1 = r13.R
            r1 = r1[r16]
            t.h r2 = r1.f26237i
            v.d[] r3 = r15.R
            int r4 = r16 + 1
            r3 = r3[r4]
            t.h r3 = r3.f26237i
            int r1 = r1.d()
            v.d[] r5 = r13.R
            r5 = r5[r4]
            int r5 = r5.d()
            if (r9 == 0) goto L_0x0655
            v.d[] r6 = r9.R
            r6 = r6[r16]
            t.h r7 = r6.f26237i
            v.d r8 = r6.f26234f
            if (r8 == 0) goto L_0x0652
            t.h r8 = r8.f26237i
            goto L_0x0666
        L_0x0652:
            r8 = r17
            goto L_0x0666
        L_0x0655:
            v.d[] r6 = r14.R
            r6 = r6[r16]
            if (r6 == 0) goto L_0x065e
            t.h r7 = r6.f26237i
            goto L_0x0660
        L_0x065e:
            r7 = r17
        L_0x0660:
            v.d[] r8 = r13.R
            r8 = r8[r4]
            t.h r8 = r8.f26237i
        L_0x0666:
            if (r6 == 0) goto L_0x0670
            int r6 = r6.d()
            int r6 = r6 + r5
            r18 = r6
            goto L_0x0672
        L_0x0670:
            r18 = r5
        L_0x0672:
            v.d[] r5 = r15.R
            r4 = r5[r4]
            int r4 = r4.d()
            int r4 = r4 + r1
            if (r22 == 0) goto L_0x0680
            r20 = 8
            goto L_0x0682
        L_0x0680:
            r20 = 4
        L_0x0682:
            if (r2 == 0) goto L_0x069a
            if (r3 == 0) goto L_0x069a
            if (r7 == 0) goto L_0x069a
            if (r8 == 0) goto L_0x069a
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r35
            r6 = r7
            r7 = r8
            r8 = r18
            r18 = r9
            r9 = r20
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x069c
        L_0x069a:
            r18 = r9
        L_0x069c:
            r8 = r18
            goto L_0x06a0
        L_0x069f:
            r8 = r1
        L_0x06a0:
            int r1 = r13.f26264i0
            r2 = 8
            if (r1 == r2) goto L_0x06a7
            r15 = r13
        L_0x06a7:
            r13 = r8
            goto L_0x060a
        L_0x06aa:
            v.d[] r1 = r0.R
            r1 = r1[r16]
            v.d[] r2 = r12.R
            r2 = r2[r16]
            v.d r2 = r2.f26234f
            v.d[] r3 = r14.R
            int r4 = r16 + 1
            r12 = r3[r4]
            v.d[] r3 = r11.R
            r3 = r3[r4]
            v.d r13 = r3.f26234f
            if (r2 == 0) goto L_0x06f3
            if (r0 == r14) goto L_0x06d1
            t.h r3 = r1.f26237i
            t.h r2 = r2.f26237i
            int r1 = r1.d()
            r4 = 5
            r10.d(r3, r2, r1, r4)
            goto L_0x06f3
        L_0x06d1:
            if (r13 == 0) goto L_0x06f3
            t.h r3 = r1.f26237i
            t.h r4 = r2.f26237i
            int r5 = r1.d()
            r6 = 1056964608(0x3f000000, float:0.5)
            t.h r7 = r12.f26237i
            t.h r8 = r13.f26237i
            int r9 = r12.d()
            r15 = 5
            r1 = r35
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r15
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06f3:
            if (r13 == 0) goto L_0x0704
            if (r0 == r14) goto L_0x0704
            t.h r1 = r12.f26237i
            t.h r2 = r13.f26237i
            int r3 = r12.d()
            int r3 = -r3
            r4 = 5
            r10.d(r1, r2, r3, r4)
        L_0x0704:
            if (r24 != 0) goto L_0x0708
            if (r23 == 0) goto L_0x0764
        L_0x0708:
            if (r0 == 0) goto L_0x0764
            if (r0 == r14) goto L_0x0764
            v.d[] r1 = r0.R
            r2 = r1[r16]
            if (r14 != 0) goto L_0x0714
            r8 = r0
            goto L_0x0715
        L_0x0714:
            r8 = r14
        L_0x0715:
            v.d[] r3 = r8.R
            int r4 = r16 + 1
            r3 = r3[r4]
            v.d r5 = r2.f26234f
            if (r5 == 0) goto L_0x0722
            t.h r5 = r5.f26237i
            goto L_0x0724
        L_0x0722:
            r5 = r17
        L_0x0724:
            v.d r6 = r3.f26234f
            if (r6 == 0) goto L_0x072b
            t.h r6 = r6.f26237i
            goto L_0x072d
        L_0x072b:
            r6 = r17
        L_0x072d:
            if (r11 == r8) goto L_0x073d
            v.d[] r6 = r11.R
            r6 = r6[r4]
            v.d r6 = r6.f26234f
            if (r6 == 0) goto L_0x073b
            t.h r6 = r6.f26237i
            r17 = r6
        L_0x073b:
            r6 = r17
        L_0x073d:
            if (r0 != r8) goto L_0x0743
            r2 = r1[r16]
            r3 = r1[r4]
        L_0x0743:
            if (r5 == 0) goto L_0x0764
            if (r6 == 0) goto L_0x0764
            r0 = 1056964608(0x3f000000, float:0.5)
            int r7 = r2.d()
            v.d[] r1 = r8.R
            r1 = r1[r4]
            int r8 = r1.d()
            t.h r2 = r2.f26237i
            t.h r9 = r3.f26237i
            r11 = 5
            r1 = r35
            r3 = r5
            r4 = r7
            r5 = r0
            r7 = r9
            r9 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0764:
            int r9 = r29 + 1
            r12 = 2
            r0 = r34
            r11 = r36
            r14 = r28
            r15 = r30
            goto L_0x001b
        L_0x0771:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.b.a(v.g, t.c, java.util.ArrayList, int):void");
    }
}
