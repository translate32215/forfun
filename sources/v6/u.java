package v6;

import d5.b0;
import java.util.Arrays;

/* compiled from: NalUnitUtil */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f26498a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f26499b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f26500c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f26501d = new int[10];

    /* compiled from: NalUnitUtil */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f26502a;

        /* renamed from: b  reason: collision with root package name */
        public final int f26503b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f26504c;

        public a(int i10, int i11, boolean z10) {
            this.f26502a = i10;
            this.f26503b = i11;
            this.f26504c = z10;
        }
    }

    /* compiled from: NalUnitUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f26505a;

        /* renamed from: b  reason: collision with root package name */
        public final int f26506b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26507c;

        /* renamed from: d  reason: collision with root package name */
        public final int f26508d;

        /* renamed from: e  reason: collision with root package name */
        public final int f26509e;

        /* renamed from: f  reason: collision with root package name */
        public final int f26510f;

        /* renamed from: g  reason: collision with root package name */
        public final float f26511g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f26512h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f26513i;

        /* renamed from: j  reason: collision with root package name */
        public final int f26514j;

        /* renamed from: k  reason: collision with root package name */
        public final int f26515k;

        /* renamed from: l  reason: collision with root package name */
        public final int f26516l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f26517m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f26505a = i10;
            this.f26506b = i11;
            this.f26507c = i12;
            this.f26508d = i13;
            this.f26509e = i14;
            this.f26510f = i15;
            this.f26511g = f10;
            this.f26512h = z10;
            this.f26513i = z11;
            this.f26514j = i16;
            this.f26515k = i17;
            this.f26516l = i18;
            this.f26517m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        int i12 = i11 - i10;
        boolean z11 = false;
        a.d(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                if ((bArr[i14] & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                        zArr[0] = false;
                        zArr[1] = false;
                        zArr[2] = false;
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1) : !(bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            zArr[0] = z10;
            zArr[1] = i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : bArr[i11 + -2] == 0 && bArr[i13] == 0;
            if (bArr[i13] == 0) {
                z11 = true;
            }
            zArr[2] = z11;
            return i11;
        } else {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i10 - 1;
        }
    }

    public static a c(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        b0Var.s(8);
        int l10 = b0Var.l();
        int l11 = b0Var.l();
        b0Var.r();
        return new a(l10, l11, b0Var.h());
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v6.u.b d(byte[] r19, int r20, int r21) {
        /*
            d5.b0 r0 = new d5.b0
            r1 = r19
            r2 = r20
            r3 = r21
            r0.<init>((byte[]) r1, (int) r2, (int) r3)
            r1 = 8
            r0.s(r1)
            int r3 = r0.i(r1)
            int r4 = r0.i(r1)
            int r5 = r0.i(r1)
            int r6 = r0.l()
            r1 = 100
            r2 = 3
            r7 = 1
            if (r3 == r1) goto L_0x004f
            r1 = 110(0x6e, float:1.54E-43)
            if (r3 == r1) goto L_0x004f
            r1 = 122(0x7a, float:1.71E-43)
            if (r3 == r1) goto L_0x004f
            r1 = 244(0xf4, float:3.42E-43)
            if (r3 == r1) goto L_0x004f
            r1 = 44
            if (r3 == r1) goto L_0x004f
            r1 = 83
            if (r3 == r1) goto L_0x004f
            r1 = 86
            if (r3 == r1) goto L_0x004f
            r1 = 118(0x76, float:1.65E-43)
            if (r3 == r1) goto L_0x004f
            r1 = 128(0x80, float:1.794E-43)
            if (r3 == r1) goto L_0x004f
            r1 = 138(0x8a, float:1.93E-43)
            if (r3 != r1) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            r1 = 1
            r2 = 0
            r10 = 0
            goto L_0x009f
        L_0x004f:
            int r1 = r0.l()
            if (r1 != r2) goto L_0x005a
            boolean r8 = r0.h()
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            r0.l()
            r0.l()
            r0.r()
            boolean r9 = r0.h()
            if (r9 == 0) goto L_0x009e
            if (r1 == r2) goto L_0x006f
            r2 = 8
            goto L_0x0071
        L_0x006f:
            r2 = 12
        L_0x0071:
            r9 = 0
        L_0x0072:
            if (r9 >= r2) goto L_0x009e
            boolean r10 = r0.h()
            if (r10 == 0) goto L_0x009b
            r10 = 6
            if (r9 >= r10) goto L_0x0080
            r10 = 16
            goto L_0x0082
        L_0x0080:
            r10 = 64
        L_0x0082:
            r11 = 0
            r12 = 8
            r13 = 8
        L_0x0087:
            if (r11 >= r10) goto L_0x009b
            if (r12 == 0) goto L_0x0094
            int r12 = r0.m()
            int r12 = r12 + r13
            int r12 = r12 + 256
            int r12 = r12 % 256
        L_0x0094:
            if (r12 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r13 = r12
        L_0x0098:
            int r11 = r11 + 1
            goto L_0x0087
        L_0x009b:
            int r9 = r9 + 1
            goto L_0x0072
        L_0x009e:
            r10 = r8
        L_0x009f:
            int r2 = r0.l()
            int r12 = r2 + 4
            int r13 = r0.l()
            if (r13 != 0) goto L_0x00b2
            int r2 = r0.l()
            int r2 = r2 + 4
            goto L_0x00d4
        L_0x00b2:
            if (r13 != r7) goto L_0x00d3
            boolean r2 = r0.h()
            r0.m()
            r0.m()
            int r8 = r0.l()
            long r8 = (long) r8
            r11 = 0
        L_0x00c4:
            long r14 = (long) r11
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x00cf
            r0.l()
            int r11 = r11 + 1
            goto L_0x00c4
        L_0x00cf:
            r8 = 0
            r15 = r2
            r14 = 0
            goto L_0x00d7
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            r8 = 0
            r14 = r2
            r15 = 0
        L_0x00d7:
            r0.l()
            r0.r()
            int r2 = r0.l()
            int r2 = r2 + r7
            int r8 = r0.l()
            int r8 = r8 + r7
            boolean r11 = r0.h()
            int r9 = 2 - r11
            int r9 = r9 * r8
            if (r11 != 0) goto L_0x00f4
            r0.r()
        L_0x00f4:
            r0.r()
            int r2 = r2 * 16
            int r9 = r9 * 16
            boolean r8 = r0.h()
            if (r8 == 0) goto L_0x0135
            int r8 = r0.l()
            int r16 = r0.l()
            int r17 = r0.l()
            int r18 = r0.l()
            if (r1 != 0) goto L_0x0116
            int r1 = 2 - r11
            goto L_0x012a
        L_0x0116:
            r7 = 3
            if (r1 != r7) goto L_0x011d
            r7 = 1
            r19 = 1
            goto L_0x0120
        L_0x011d:
            r7 = 2
            r19 = 2
        L_0x0120:
            r7 = 1
            if (r1 != r7) goto L_0x0124
            r7 = 2
        L_0x0124:
            int r1 = 2 - r11
            int r1 = r1 * r7
            r7 = r19
        L_0x012a:
            int r8 = r8 + r16
            int r8 = r8 * r7
            int r2 = r2 - r8
            int r17 = r17 + r18
            int r17 = r17 * r1
            int r9 = r9 - r17
        L_0x0135:
            r7 = r2
            r8 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.h()
            if (r2 == 0) goto L_0x0172
            boolean r2 = r0.h()
            if (r2 == 0) goto L_0x0172
            r2 = 8
            int r2 = r0.i(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0162
            r2 = 16
            int r9 = r0.i(r2)
            int r0 = r0.i(r2)
            if (r9 == 0) goto L_0x0160
            if (r0 == 0) goto L_0x0160
            float r1 = (float) r9
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0160:
            r9 = r1
            goto L_0x0176
        L_0x0162:
            float[] r0 = f26499b
            int r1 = r0.length
            if (r2 >= r1) goto L_0x016b
            r0 = r0[r2]
            r9 = r0
            goto L_0x0176
        L_0x016b:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = "NalUnitUtil"
            f0.j.a(r0, r2, r1)
        L_0x0172:
            r0 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x0176:
            v6.u$b r0 = new v6.u$b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.u.d(byte[], int, int):v6.u$b");
    }

    public static int e(byte[] bArr, int i10) {
        int i11;
        synchronized (f26500c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 < i10 - 2) {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = i10;
                        break;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f26501d;
                    if (iArr.length <= i13) {
                        f26501d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f26501d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f26501d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
