package x6;

/* compiled from: ProjectionDecoder */
public final class e {
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<x6.d.a> a(v6.v r28) {
        /*
            r0 = r28
            int r1 = r28.s()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 7
            r0.E(r1)
            int r3 = r28.f()
            r4 = 1684433976(0x64666c38, float:1.7002196E22)
            r5 = 1
            if (r3 != r4) goto L_0x0037
            v6.v r3 = new v6.v
            r3.<init>()
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r5)
            boolean r0 = v6.e0.F(r0, r3, r4)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002c
            r4.end()
            return r2
        L_0x002c:
            r4.end()
            r0 = r3
            goto L_0x003d
        L_0x0031:
            r0 = move-exception
            r1 = r0
            r4.end()
            throw r1
        L_0x0037:
            r4 = 1918990112(0x72617720, float:4.465801E30)
            if (r3 == r4) goto L_0x003d
            return r2
        L_0x003d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.f26519b
            int r6 = r0.f26520c
        L_0x0046:
            if (r4 >= r6) goto L_0x01d3
            int r7 = r0.f()
            int r7 = r7 + r4
            if (r7 <= r4) goto L_0x01d1
            if (r7 <= r6) goto L_0x0053
            goto L_0x01d1
        L_0x0053:
            int r4 = r0.f()
            r8 = 1835365224(0x6d657368, float:4.438224E27)
            if (r4 != r8) goto L_0x01c2
            int r4 = r0.f()
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r8) goto L_0x0065
            goto L_0x007f
        L_0x0065:
            float[] r8 = new float[r4]
            r10 = 0
        L_0x0068:
            if (r10 >= r4) goto L_0x0077
            int r11 = r0.f()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x0068
        L_0x0077:
            int r10 = r0.f()
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r10 <= r11) goto L_0x0088
        L_0x007f:
            r20 = r0
            r0 = r2
            r22 = r6
            r19 = 1
            goto L_0x01b9
        L_0x0088:
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.log(r11)
            r15 = r10
            double r9 = (double) r4
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r11
            double r9 = java.lang.Math.log(r9)
            double r9 = r9 / r13
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            d5.b0 r10 = new d5.b0
            byte[] r11 = r0.f26518a
            r10.<init>((byte[]) r11, (int) r5, (q.e) r2)
            int r11 = r0.f26519b
            r12 = 8
            int r11 = r11 * 8
            r10.p(r11)
            int r11 = r15 * 5
            float[] r11 = new float[r11]
            r2 = 5
            int[] r12 = new int[r2]
            r1 = 0
            r18 = 0
        L_0x00c2:
            if (r1 >= r15) goto L_0x00f0
            r5 = 0
        L_0x00c5:
            if (r5 >= r2) goto L_0x00eb
            r20 = r12[r5]
            int r21 = r10.i(r9)
            int r22 = r21 >> 1
            r19 = 1
            r2 = r21 & 1
            int r2 = -r2
            r2 = r2 ^ r22
            int r2 = r20 + r2
            if (r2 >= r4) goto L_0x0119
            if (r2 >= 0) goto L_0x00dd
            goto L_0x0119
        L_0x00dd:
            int r20 = r18 + 1
            r21 = r8[r2]
            r11[r18] = r21
            r12[r5] = r2
            int r5 = r5 + 1
            r18 = r20
            r2 = 5
            goto L_0x00c5
        L_0x00eb:
            int r1 = r1 + 1
            r2 = 5
            r5 = 1
            goto L_0x00c2
        L_0x00f0:
            int r1 = r10.g()
            r2 = 7
            int r1 = r1 + r2
            r1 = r1 & -8
            r10.p(r1)
            r1 = 32
            int r4 = r10.i(r1)
            x6.d$b[] r5 = new x6.d.b[r4]
            r8 = 0
        L_0x0104:
            if (r8 >= r4) goto L_0x01ae
            r9 = 8
            int r12 = r10.i(r9)
            int r2 = r10.i(r9)
            int r9 = r10.i(r1)
            r1 = 128000(0x1f400, float:1.79366E-40)
            if (r9 <= r1) goto L_0x0121
        L_0x0119:
            r20 = r0
            r22 = r6
        L_0x011d:
            r19 = 1
            goto L_0x0196
        L_0x0121:
            r20 = r0
            double r0 = (double) r15
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r16
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r13
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r1 = r9 * 3
            float[] r1 = new float[r1]
            r21 = r4
            int r4 = r9 * 2
            float[] r4 = new float[r4]
            r22 = r6
            r6 = 0
            r23 = 0
        L_0x014d:
            if (r6 >= r9) goto L_0x0198
            int r24 = r10.i(r0)
            int r25 = r24 >> 1
            r26 = r0
            r19 = 1
            r0 = r24 & 1
            int r0 = -r0
            r0 = r0 ^ r25
            int r0 = r23 + r0
            if (r0 < 0) goto L_0x011d
            if (r0 < r15) goto L_0x0165
            goto L_0x011d
        L_0x0165:
            int r23 = r6 * 3
            int r24 = r0 * 5
            r25 = r11[r24]
            r1[r23] = r25
            int r25 = r23 + 1
            int r27 = r24 + 1
            r27 = r11[r27]
            r1[r25] = r27
            int r23 = r23 + 2
            int r25 = r24 + 2
            r25 = r11[r25]
            r1[r23] = r25
            int r23 = r6 * 2
            int r25 = r24 + 3
            r25 = r11[r25]
            r4[r23] = r25
            r19 = 1
            int r23 = r23 + 1
            int r24 = r24 + 4
            r24 = r11[r24]
            r4[r23] = r24
            int r6 = r6 + 1
            r23 = r0
            r0 = r26
            goto L_0x014d
        L_0x0196:
            r0 = 0
            goto L_0x01b9
        L_0x0198:
            r19 = 1
            x6.d$b r0 = new x6.d$b
            r0.<init>(r12, r1, r4, r2)
            r5[r8] = r0
            int r8 = r8 + 1
            r0 = r20
            r4 = r21
            r6 = r22
            r1 = 32
            r2 = 7
            goto L_0x0104
        L_0x01ae:
            r20 = r0
            r22 = r6
            r19 = 1
            x6.d$a r0 = new x6.d$a
            r0.<init>(r5)
        L_0x01b9:
            if (r0 != 0) goto L_0x01bc
            goto L_0x01d1
        L_0x01bc:
            r3.add(r0)
            r0 = r20
            goto L_0x01c6
        L_0x01c2:
            r22 = r6
            r19 = 1
        L_0x01c6:
            r0.D(r7)
            r4 = r7
            r6 = r22
            r1 = 7
            r2 = 0
            r5 = 1
            goto L_0x0046
        L_0x01d1:
            r2 = 0
            goto L_0x01d4
        L_0x01d3:
            r2 = r3
        L_0x01d4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.e.a(v6.v):java.util.ArrayList");
    }
}
