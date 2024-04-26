package androidx.leanback.widget;

import androidx.leanback.widget.i1;
import androidx.leanback.widget.p;

/* compiled from: StaggeredGridDefault */
public final class j1 extends i1 {
    public int A(int i10) {
        i1.a u10;
        int i11;
        int i12 = this.f2444f;
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f2441c) {
            int d10 = ((p.b) this.f2440b).d(this.f2445g);
            i1.a u11 = k(this.f2445g);
            if (u11.f2448a != i10) {
                int i13 = this.f2445g;
                while (true) {
                    i13--;
                    if (i13 < this.f2403k) {
                        break;
                    }
                    d10 -= u11.f2406b;
                    u11 = k(i13);
                    if (u11.f2448a == i10) {
                        i11 = u11.f2407c;
                        break;
                    }
                }
            } else {
                i11 = u11.f2407c;
            }
            return d10 - i11;
        }
        int d11 = ((p.b) this.f2440b).d(i12);
        if (k(this.f2444f).f2448a == i10) {
            return d11;
        }
        int i14 = this.f2444f;
        do {
            i14++;
            if (i14 <= t()) {
                u10 = k(i14);
                d11 += u10.f2406b;
            }
        } while (u10.f2448a != i10);
        return d11;
        return Integer.MAX_VALUE;
    }

    public int f(boolean z10, int i10, int[] iArr) {
        int i11;
        int d10 = ((p.b) this.f2440b).d(i10);
        i1.a u10 = k(i10);
        int i12 = u10.f2448a;
        if (this.f2441c) {
            i11 = i12;
            int i13 = i11;
            int i14 = 1;
            int i15 = i10 + 1;
            int i16 = d10;
            while (i14 < this.f2443e && i15 <= this.f2445g) {
                i1.a u11 = k(i15);
                i16 += u11.f2406b;
                int i17 = u11.f2448a;
                if (i17 != i13) {
                    i14++;
                    if (!z10 ? i16 >= d10 : i16 <= d10) {
                        i13 = i17;
                    } else {
                        d10 = i16;
                        i10 = i15;
                        i11 = i17;
                        i13 = i11;
                    }
                }
                i15++;
            }
        } else {
            int i18 = i10 - 1;
            int i19 = 1;
            int i20 = i12;
            i1.a aVar = u10;
            int i21 = d10;
            d10 = ((p.b) this.f2440b).e(i10) + d10;
            i11 = i20;
            while (i19 < this.f2443e && i18 >= this.f2444f) {
                i21 -= aVar.f2406b;
                aVar = k(i18);
                int i22 = aVar.f2448a;
                if (i22 != i20) {
                    i19++;
                    int e10 = ((p.b) this.f2440b).e(i18) + i21;
                    if (!z10 ? e10 >= d10 : e10 <= d10) {
                        i20 = i22;
                    } else {
                        d10 = e10;
                        i10 = i18;
                        i11 = i22;
                        i20 = i11;
                    }
                }
                i18--;
            }
        }
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i10;
        }
        return d10;
    }

    public int h(boolean z10, int i10, int[] iArr) {
        int i11;
        int d10 = ((p.b) this.f2440b).d(i10);
        i1.a u10 = k(i10);
        int i12 = u10.f2448a;
        if (this.f2441c) {
            int i13 = i10 - 1;
            int i14 = 1;
            i11 = d10 - ((p.b) this.f2440b).e(i10);
            int i15 = i12;
            while (i14 < this.f2443e && i13 >= this.f2444f) {
                d10 -= u10.f2406b;
                u10 = k(i13);
                int i16 = u10.f2448a;
                if (i16 != i15) {
                    i14++;
                    int e10 = d10 - ((p.b) this.f2440b).e(i13);
                    if (!z10 ? e10 >= i11 : e10 <= i11) {
                        i15 = i16;
                    } else {
                        i11 = e10;
                        i10 = i13;
                        i12 = i16;
                        i15 = i12;
                    }
                }
                i13--;
            }
        } else {
            int i17 = i12;
            int i18 = i17;
            int i19 = 1;
            int i20 = i10 + 1;
            int i21 = d10;
            while (i19 < this.f2443e && i20 <= this.f2445g) {
                i1.a u11 = k(i20);
                i21 += u11.f2406b;
                int i22 = u11.f2448a;
                if (i22 != i18) {
                    i19++;
                    if (!z10 ? i21 >= d10 : i21 <= d10) {
                        i18 = i22;
                    } else {
                        d10 = i21;
                        i10 = i20;
                        i17 = i22;
                        i18 = i17;
                    }
                }
                i20++;
            }
            i11 = d10;
            i12 = i17;
        }
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i10;
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0138, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0108 A[LOOP:2: B:81:0x0108->B:95:0x012c, LOOP_START, PHI: r6 r9 r10 
      PHI: (r6v10 int) = (r6v3 int), (r6v14 int) binds: [B:80:0x0106, B:95:0x012c] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v7 int) = (r9v5 int), (r9v8 int) binds: [B:80:0x0106, B:95:0x012c] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v3 int) = (r10v2 int), (r10v5 int) binds: [B:80:0x0106, B:95:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s(int r14, boolean r15) {
        /*
            r13 = this;
            androidx.leanback.widget.o$b r0 = r13.f2440b
            androidx.leanback.widget.p$b r0 = (androidx.leanback.widget.p.b) r0
            int r0 = r0.c()
            int r1 = r13.f2445g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 < 0) goto L_0x0078
            int r6 = r13.t()
            if (r1 >= r6) goto L_0x0018
            return r4
        L_0x0018:
            int r1 = r13.f2445g
            int r6 = r1 + 1
            androidx.leanback.widget.i1$a r1 = r13.k(r1)
            int r1 = r1.f2448a
            int r7 = r13.y(r5)
            if (r7 >= 0) goto L_0x0042
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x002b:
            int r9 = r13.f2443e
            if (r7 >= r9) goto L_0x0050
            boolean r8 = r13.f2441c
            if (r8 == 0) goto L_0x0038
            int r8 = r13.A(r7)
            goto L_0x003c
        L_0x0038:
            int r8 = r13.z(r7)
        L_0x003c:
            if (r8 == r2) goto L_0x003f
            goto L_0x0050
        L_0x003f:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0042:
            boolean r8 = r13.f2441c
            if (r8 == 0) goto L_0x004b
            int r7 = r13.h(r4, r7, r3)
            goto L_0x004f
        L_0x004b:
            int r7 = r13.f(r5, r7, r3)
        L_0x004f:
            r8 = r7
        L_0x0050:
            boolean r7 = r13.f2441c
            if (r7 == 0) goto L_0x005b
            int r7 = r13.A(r1)
            if (r7 > r8) goto L_0x0076
            goto L_0x0061
        L_0x005b:
            int r7 = r13.z(r1)
            if (r7 < r8) goto L_0x0076
        L_0x0061:
            int r1 = r1 + 1
            int r7 = r13.f2443e
            if (r1 != r7) goto L_0x0076
            boolean r1 = r13.f2441c
            if (r1 == 0) goto L_0x0070
            int r1 = r13.i(r4, r3)
            goto L_0x0074
        L_0x0070:
            int r1 = r13.g(r5, r3)
        L_0x0074:
            r8 = r1
            r1 = 0
        L_0x0076:
            r7 = 1
            goto L_0x009a
        L_0x0078:
            int r1 = r13.f2447i
            r6 = -1
            if (r1 == r6) goto L_0x007f
            r6 = r1
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            s.d<androidx.leanback.widget.i1$a> r1 = r13.f2402j
            int r1 = r1.g()
            if (r1 <= 0) goto L_0x0094
            int r1 = r13.t()
            androidx.leanback.widget.i1$a r1 = r13.k(r1)
            int r1 = r1.f2448a
            int r1 = r1 + r5
            goto L_0x0095
        L_0x0094:
            r1 = r6
        L_0x0095:
            int r7 = r13.f2443e
            int r1 = r1 % r7
            r7 = 0
            r8 = 0
        L_0x009a:
            r9 = 0
        L_0x009b:
            int r10 = r13.f2443e
            if (r1 >= r10) goto L_0x0150
            if (r6 == r0) goto L_0x014f
            if (r15 != 0) goto L_0x00ab
            boolean r10 = r13.c(r14)
            if (r10 == 0) goto L_0x00ab
            goto L_0x014f
        L_0x00ab:
            boolean r9 = r13.f2441c
            if (r9 == 0) goto L_0x00b4
            int r9 = r13.A(r1)
            goto L_0x00b8
        L_0x00b4:
            int r9 = r13.z(r1)
        L_0x00b8:
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r10) goto L_0x00cc
            if (r9 != r2) goto L_0x00c0
            goto L_0x00cc
        L_0x00c0:
            boolean r10 = r13.f2441c
            if (r10 == 0) goto L_0x00c8
            int r10 = r13.f2442d
        L_0x00c6:
            int r10 = -r10
            goto L_0x00ca
        L_0x00c8:
            int r10 = r13.f2442d
        L_0x00ca:
            int r9 = r9 + r10
            goto L_0x0100
        L_0x00cc:
            if (r1 != 0) goto L_0x00ef
            boolean r9 = r13.f2441c
            if (r9 == 0) goto L_0x00da
            int r9 = r13.f2443e
            int r9 = r9 - r5
            int r9 = r13.A(r9)
            goto L_0x00e1
        L_0x00da:
            int r9 = r13.f2443e
            int r9 = r9 - r5
            int r9 = r13.z(r9)
        L_0x00e1:
            if (r9 == r10) goto L_0x0100
            if (r9 == r2) goto L_0x0100
            boolean r10 = r13.f2441c
            if (r10 == 0) goto L_0x00ec
            int r10 = r13.f2442d
            goto L_0x00c6
        L_0x00ec:
            int r10 = r13.f2442d
            goto L_0x00ca
        L_0x00ef:
            boolean r9 = r13.f2441c
            if (r9 == 0) goto L_0x00fa
            int r9 = r1 + -1
            int r9 = r13.z(r9)
            goto L_0x0100
        L_0x00fa:
            int r9 = r1 + -1
            int r9 = r13.A(r9)
        L_0x0100:
            int r10 = r6 + 1
            int r6 = r13.r(r6, r1, r9)
            if (r7 == 0) goto L_0x013a
        L_0x0108:
            boolean r11 = r13.f2441c
            if (r11 == 0) goto L_0x0111
            int r11 = r9 - r6
            if (r11 <= r8) goto L_0x0138
            goto L_0x0115
        L_0x0111:
            int r11 = r9 + r6
            if (r11 >= r8) goto L_0x0138
        L_0x0115:
            if (r10 == r0) goto L_0x0137
            if (r15 != 0) goto L_0x0120
            boolean r11 = r13.c(r14)
            if (r11 == 0) goto L_0x0120
            goto L_0x0137
        L_0x0120:
            boolean r11 = r13.f2441c
            if (r11 == 0) goto L_0x0129
            int r6 = -r6
            int r11 = r13.f2442d
            int r6 = r6 - r11
            goto L_0x012c
        L_0x0129:
            int r11 = r13.f2442d
            int r6 = r6 + r11
        L_0x012c:
            int r9 = r9 + r6
            int r6 = r10 + 1
            int r10 = r13.r(r10, r1, r9)
            r12 = r10
            r10 = r6
            r6 = r12
            goto L_0x0108
        L_0x0137:
            return r5
        L_0x0138:
            r6 = r10
            goto L_0x014a
        L_0x013a:
            boolean r6 = r13.f2441c
            if (r6 == 0) goto L_0x0143
            int r6 = r13.A(r1)
            goto L_0x0147
        L_0x0143:
            int r6 = r13.z(r1)
        L_0x0147:
            r8 = r6
            r6 = r10
            r7 = 1
        L_0x014a:
            int r1 = r1 + 1
            r9 = 1
            goto L_0x009b
        L_0x014f:
            return r9
        L_0x0150:
            if (r15 == 0) goto L_0x0153
            return r9
        L_0x0153:
            boolean r1 = r13.f2441c
            if (r1 == 0) goto L_0x015c
            int r1 = r13.i(r4, r3)
            goto L_0x0160
        L_0x015c:
            int r1 = r13.g(r5, r3)
        L_0x0160:
            r8 = r1
            r1 = 0
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.j1.s(int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x012b, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fb A[LOOP:2: B:80:0x00fb->B:94:0x011f, LOOP_START, PHI: r5 r8 r9 
      PHI: (r5v10 int) = (r5v3 int), (r5v14 int) binds: [B:79:0x00f9, B:94:0x011f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v7 int) = (r8v5 int), (r8v8 int) binds: [B:79:0x00f9, B:94:0x011f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v2 int) = (r9v1 int), (r9v4 int) binds: [B:79:0x00f9, B:94:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean x(int r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.f2444f
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 < 0) goto L_0x0070
            int r5 = r12.f2403k
            if (r0 <= r5) goto L_0x000f
            return r3
        L_0x000f:
            int r5 = r0 + -1
            androidx.leanback.widget.i1$a r0 = r12.k(r0)
            int r0 = r0.f2448a
            int r6 = r12.y(r3)
            if (r6 >= 0) goto L_0x003a
            int r0 = r0 + -1
            int r6 = r12.f2443e
            int r6 = r6 - r4
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0025:
            if (r6 < 0) goto L_0x0048
            boolean r7 = r12.f2441c
            if (r7 == 0) goto L_0x0030
            int r7 = r12.z(r6)
            goto L_0x0034
        L_0x0030:
            int r7 = r12.A(r6)
        L_0x0034:
            if (r7 == r1) goto L_0x0037
            goto L_0x0048
        L_0x0037:
            int r6 = r6 + -1
            goto L_0x0025
        L_0x003a:
            boolean r7 = r12.f2441c
            if (r7 == 0) goto L_0x0043
            int r6 = r12.f(r4, r6, r2)
            goto L_0x0047
        L_0x0043:
            int r6 = r12.h(r3, r6, r2)
        L_0x0047:
            r7 = r6
        L_0x0048:
            boolean r6 = r12.f2441c
            if (r6 == 0) goto L_0x0053
            int r6 = r12.z(r0)
            if (r6 < r7) goto L_0x006e
            goto L_0x0059
        L_0x0053:
            int r6 = r12.A(r0)
            if (r6 > r7) goto L_0x006e
        L_0x0059:
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x006e
            int r0 = r12.f2443e
            int r0 = r0 - r4
            boolean r6 = r12.f2441c
            if (r6 == 0) goto L_0x0069
            int r6 = r12.g(r4, r2)
            goto L_0x006d
        L_0x0069:
            int r6 = r12.i(r3, r2)
        L_0x006d:
            r7 = r6
        L_0x006e:
            r6 = 1
            goto L_0x0093
        L_0x0070:
            int r0 = r12.f2447i
            r5 = -1
            if (r0 == r5) goto L_0x0077
            r5 = r0
            goto L_0x0078
        L_0x0077:
            r5 = 0
        L_0x0078:
            s.d<androidx.leanback.widget.i1$a> r0 = r12.f2402j
            int r0 = r0.g()
            if (r0 <= 0) goto L_0x008d
            int r0 = r12.f2403k
            androidx.leanback.widget.i1$a r0 = r12.k(r0)
            int r0 = r0.f2448a
            int r6 = r12.f2443e
            int r0 = r0 + r6
            int r0 = r0 - r4
            goto L_0x008e
        L_0x008d:
            r0 = r5
        L_0x008e:
            int r6 = r12.f2443e
            int r0 = r0 % r6
            r6 = 0
            r7 = 0
        L_0x0093:
            r8 = 0
        L_0x0094:
            if (r0 < 0) goto L_0x0143
            if (r5 < 0) goto L_0x0142
            if (r14 != 0) goto L_0x00a2
            boolean r9 = r12.d(r13)
            if (r9 == 0) goto L_0x00a2
            goto L_0x0142
        L_0x00a2:
            boolean r8 = r12.f2441c
            if (r8 == 0) goto L_0x00ab
            int r8 = r12.z(r0)
            goto L_0x00af
        L_0x00ab:
            int r8 = r12.A(r0)
        L_0x00af:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r1) goto L_0x00c2
            if (r8 != r9) goto L_0x00b6
            goto L_0x00c2
        L_0x00b6:
            boolean r9 = r12.f2441c
            if (r9 == 0) goto L_0x00bd
            int r9 = r12.f2442d
            goto L_0x00c0
        L_0x00bd:
            int r9 = r12.f2442d
        L_0x00bf:
            int r9 = -r9
        L_0x00c0:
            int r8 = r8 + r9
            goto L_0x00f3
        L_0x00c2:
            int r8 = r12.f2443e
            int r8 = r8 - r4
            if (r0 != r8) goto L_0x00e2
            boolean r8 = r12.f2441c
            if (r8 == 0) goto L_0x00d0
            int r8 = r12.z(r3)
            goto L_0x00d4
        L_0x00d0:
            int r8 = r12.A(r3)
        L_0x00d4:
            if (r8 == r1) goto L_0x00f3
            if (r8 == r9) goto L_0x00f3
            boolean r9 = r12.f2441c
            if (r9 == 0) goto L_0x00df
            int r9 = r12.f2442d
            goto L_0x00c0
        L_0x00df:
            int r9 = r12.f2442d
            goto L_0x00bf
        L_0x00e2:
            boolean r8 = r12.f2441c
            if (r8 == 0) goto L_0x00ed
            int r8 = r0 + 1
            int r8 = r12.A(r8)
            goto L_0x00f3
        L_0x00ed:
            int r8 = r0 + 1
            int r8 = r12.z(r8)
        L_0x00f3:
            int r9 = r5 + -1
            int r5 = r12.w(r5, r0, r8)
            if (r6 == 0) goto L_0x012d
        L_0x00fb:
            boolean r10 = r12.f2441c
            if (r10 == 0) goto L_0x0104
            int r10 = r8 + r5
            if (r10 >= r7) goto L_0x012b
            goto L_0x0108
        L_0x0104:
            int r10 = r8 - r5
            if (r10 <= r7) goto L_0x012b
        L_0x0108:
            if (r9 < 0) goto L_0x012a
            if (r14 != 0) goto L_0x0113
            boolean r10 = r12.d(r13)
            if (r10 == 0) goto L_0x0113
            goto L_0x012a
        L_0x0113:
            boolean r10 = r12.f2441c
            if (r10 == 0) goto L_0x011b
            int r10 = r12.f2442d
            int r5 = r5 + r10
            goto L_0x011f
        L_0x011b:
            int r5 = -r5
            int r10 = r12.f2442d
            int r5 = r5 - r10
        L_0x011f:
            int r8 = r8 + r5
            int r5 = r9 + -1
            int r9 = r12.w(r9, r0, r8)
            r11 = r9
            r9 = r5
            r5 = r11
            goto L_0x00fb
        L_0x012a:
            return r4
        L_0x012b:
            r5 = r9
            goto L_0x013d
        L_0x012d:
            boolean r5 = r12.f2441c
            if (r5 == 0) goto L_0x0136
            int r5 = r12.z(r0)
            goto L_0x013a
        L_0x0136:
            int r5 = r12.A(r0)
        L_0x013a:
            r7 = r5
            r5 = r9
            r6 = 1
        L_0x013d:
            int r0 = r0 + -1
            r8 = 1
            goto L_0x0094
        L_0x0142:
            return r8
        L_0x0143:
            if (r14 == 0) goto L_0x0146
            return r8
        L_0x0146:
            boolean r0 = r12.f2441c
            if (r0 == 0) goto L_0x014f
            int r0 = r12.g(r4, r2)
            goto L_0x0153
        L_0x014f:
            int r0 = r12.i(r3, r2)
        L_0x0153:
            r7 = r0
            int r0 = r12.f2443e
            int r0 = r0 - r4
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.j1.x(int, boolean):boolean");
    }

    public final int y(boolean z10) {
        boolean z11 = false;
        if (z10) {
            for (int i10 = this.f2445g; i10 >= this.f2444f; i10--) {
                int i11 = k(i10).f2448a;
                if (i11 == 0) {
                    z11 = true;
                } else if (z11 && i11 == this.f2443e - 1) {
                    return i10;
                }
            }
            return -1;
        }
        for (int i12 = this.f2444f; i12 <= this.f2445g; i12++) {
            int i13 = k(i12).f2448a;
            if (i13 == this.f2443e - 1) {
                z11 = true;
            } else if (z11 && i13 == 0) {
                return i12;
            }
        }
        return -1;
    }

    public int z(int i10) {
        int i11;
        i1.a u10;
        int i12 = this.f2444f;
        if (i12 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f2441c) {
            int d10 = ((p.b) this.f2440b).d(i12);
            if (k(this.f2444f).f2448a == i10) {
                return d10;
            }
            int i13 = this.f2444f;
            do {
                i13++;
                if (i13 <= t()) {
                    u10 = k(i13);
                    d10 += u10.f2406b;
                }
            } while (u10.f2448a != i10);
            return d10;
        }
        int d11 = ((p.b) this.f2440b).d(this.f2445g);
        i1.a u11 = k(this.f2445g);
        if (u11.f2448a != i10) {
            int i14 = this.f2445g;
            while (true) {
                i14--;
                if (i14 < this.f2403k) {
                    break;
                }
                d11 -= u11.f2406b;
                u11 = k(i14);
                if (u11.f2448a == i10) {
                    i11 = u11.f2407c;
                    break;
                }
            }
        } else {
            i11 = u11.f2407c;
        }
        return d11 + i11;
        return Integer.MIN_VALUE;
    }
}
