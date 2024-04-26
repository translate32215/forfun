package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bg0 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14009a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f14010b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14011c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f14012d = new int[10];

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e8.ag0 a(byte[] r19, int r20, int r21) {
        /*
            e8.cg0 r0 = new e8.cg0
            r1 = r19
            r2 = r20
            r3 = r21
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.b(r1)
            int r2 = r0.a(r1)
            r3 = 16
            r0.b(r3)
            int r5 = r0.f()
            r4 = 100
            r6 = 3
            r7 = 0
            r8 = 1
            if (r2 == r4) goto L_0x004c
            r4 = 110(0x6e, float:1.54E-43)
            if (r2 == r4) goto L_0x004c
            r4 = 122(0x7a, float:1.71E-43)
            if (r2 == r4) goto L_0x004c
            r4 = 244(0xf4, float:3.42E-43)
            if (r2 == r4) goto L_0x004c
            r4 = 44
            if (r2 == r4) goto L_0x004c
            r4 = 83
            if (r2 == r4) goto L_0x004c
            r4 = 86
            if (r2 == r4) goto L_0x004c
            r4 = 118(0x76, float:1.65E-43)
            if (r2 == r4) goto L_0x004c
            r4 = 128(0x80, float:1.794E-43)
            if (r2 == r4) goto L_0x004c
            r4 = 138(0x8a, float:1.93E-43)
            if (r2 != r4) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 1
            r9 = 0
            goto L_0x009c
        L_0x004c:
            int r2 = r0.f()
            if (r2 != r6) goto L_0x0057
            boolean r4 = r0.d()
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            r0.f()
            r0.f()
            r0.b(r8)
            boolean r9 = r0.d()
            if (r9 == 0) goto L_0x009b
            if (r2 == r6) goto L_0x006c
            r9 = 8
            goto L_0x006e
        L_0x006c:
            r9 = 12
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x009b
            boolean r11 = r0.d()
            if (r11 == 0) goto L_0x0098
            r11 = 6
            if (r10 >= r11) goto L_0x007d
            r11 = 16
            goto L_0x007f
        L_0x007d:
            r11 = 64
        L_0x007f:
            r12 = 0
            r13 = 8
            r14 = 8
        L_0x0084:
            if (r12 >= r11) goto L_0x0098
            if (r13 == 0) goto L_0x0091
            int r13 = r0.e()
            int r13 = r13 + r14
            int r13 = r13 + 256
            int r13 = r13 % 256
        L_0x0091:
            if (r13 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r14 = r13
        L_0x0095:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x009b:
            r9 = r4
        L_0x009c:
            int r4 = r0.f()
            int r11 = r4 + 4
            int r12 = r0.f()
            if (r12 != 0) goto L_0x00b0
            int r4 = r0.f()
            int r4 = r4 + 4
            r13 = r4
            goto L_0x00d4
        L_0x00b0:
            if (r12 != r8) goto L_0x00d3
            boolean r4 = r0.d()
            r0.e()
            r0.e()
            int r10 = r0.f()
            long r13 = (long) r10
            r20 = r4
            r10 = 0
        L_0x00c4:
            long r3 = (long) r10
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00cf
            r0.f()
            int r10 = r10 + 1
            goto L_0x00c4
        L_0x00cf:
            r14 = r20
            r13 = 0
            goto L_0x00d5
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            r14 = 0
        L_0x00d5:
            r0.f()
            r0.b(r8)
            int r3 = r0.f()
            int r3 = r3 + r8
            int r4 = r0.f()
            int r4 = r4 + r8
            boolean r10 = r0.d()
            int r7 = 2 - r10
            int r7 = r7 * r4
            if (r10 != 0) goto L_0x00f2
            r0.b(r8)
        L_0x00f2:
            r0.b(r8)
            int r3 = r3 << 4
            int r4 = r7 << 4
            boolean r7 = r0.d()
            if (r7 == 0) goto L_0x012d
            int r7 = r0.f()
            int r15 = r0.f()
            int r16 = r0.f()
            int r17 = r0.f()
            if (r2 != 0) goto L_0x0114
            int r2 = 2 - r10
            goto L_0x0123
        L_0x0114:
            r18 = 2
            if (r2 != r6) goto L_0x011a
            r6 = 1
            goto L_0x011b
        L_0x011a:
            r6 = 2
        L_0x011b:
            if (r2 != r8) goto L_0x011e
            r8 = 2
        L_0x011e:
            int r2 = 2 - r10
            int r2 = r2 * r8
            r8 = r6
        L_0x0123:
            int r7 = r7 + r15
            int r7 = r7 * r8
            int r3 = r3 - r7
            int r16 = r16 + r17
            int r16 = r16 * r2
            int r4 = r4 - r16
        L_0x012d:
            r6 = r3
            r7 = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x017a
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x017a
            int r1 = r0.a(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0159
            r3 = 16
            int r1 = r0.a(r3)
            int r0 = r0.a(r3)
            if (r1 == 0) goto L_0x0157
            if (r0 == 0) goto L_0x0157
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x0157:
            r8 = r2
            goto L_0x017c
        L_0x0159:
            float[] r0 = f14010b
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0162
            r0 = r0[r1]
            r8 = r0
            goto L_0x017c
        L_0x0162:
            r0 = 46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "NalUnitUtil"
            android.util.Log.w(r1, r0)
        L_0x017a:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x017c:
            e8.ag0 r0 = new e8.ag0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.bg0.a(byte[], int, int):e8.ag0");
    }
}
