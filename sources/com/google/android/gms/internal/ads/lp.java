package com.google.android.gms.internal.ads;

import e8.c80;
import e8.f80;
import e8.ft;
import e8.v70;
import e8.w70;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class lp {
    public static int a(int i10, byte[] bArr, int i11, int i12, nq nqVar, ft ftVar) throws f80 {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int j10 = j(bArr, i11, ftVar);
                nqVar.e(i10, Long.valueOf(ftVar.f14678a));
                return j10;
            } else if (i13 == 1) {
                nqVar.e(i10, Long.valueOf(o(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int h10 = h(bArr, i11, ftVar);
                int i14 = ftVar.f14681d;
                if (i14 < 0) {
                    throw f80.b();
                } else if (i14 <= bArr.length - h10) {
                    if (i14 == 0) {
                        nqVar.e(i10, mp.f7494b);
                    } else {
                        nqVar.e(i10, mp.I(bArr, h10, i14));
                    }
                    return h10 + i14;
                } else {
                    throw f80.a();
                }
            } else if (i13 == 3) {
                nq d10 = nq.d();
                int i15 = (i10 & -8) | 4;
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int h11 = h(bArr, i11, ftVar);
                    int i17 = ftVar.f14681d;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = h11;
                        break;
                    }
                    i16 = i17;
                    i11 = a(i17, bArr, h11, i12, d10, ftVar);
                }
                if (i11 > i12 || i16 != i15) {
                    throw f80.g();
                }
                nqVar.e(i10, d10);
                return i11;
            } else if (i13 == 5) {
                nqVar.e(i10, Integer.valueOf(n(bArr, i11)));
                return i11 + 4;
            } else {
                throw f80.d();
            }
        } else {
            throw f80.d();
        }
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, ft ftVar) throws f80 {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return j(bArr, i11, ftVar);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return h(bArr, i11, ftVar) + ftVar.f14681d;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = h(bArr, i11, ftVar);
                    i15 = ftVar.f14681d;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = b(i15, bArr, i11, i12, ftVar);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw f80.g();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw f80.d();
            }
        } else {
            throw f80.d();
        }
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, c80<?> c80, ft ftVar) {
        w70 w70 = (w70) c80;
        int h10 = h(bArr, i11, ftVar);
        w70.o(ftVar.f14681d);
        while (h10 < i12) {
            int h11 = h(bArr, h10, ftVar);
            if (i10 != ftVar.f14681d) {
                break;
            }
            h10 = h(bArr, h11, ftVar);
            w70.o(ftVar.f14681d);
        }
        return h10;
    }

    public static int d(int i10, byte[] bArr, int i11, ft ftVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            ftVar.f14681d = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            ftVar.f14681d = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            ftVar.f14681d = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            ftVar.f14681d = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                ftVar.f14681d = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int e(iq<?> iqVar, int i10, byte[] bArr, int i11, int i12, c80<?> c80, ft ftVar) throws IOException {
        int g10 = g(iqVar, bArr, i11, i12, ftVar);
        c80.add(ftVar.f14679b);
        while (g10 < i12) {
            int h10 = h(bArr, g10, ftVar);
            if (i10 != ftVar.f14681d) {
                break;
            }
            g10 = g(iqVar, bArr, h10, i12, ftVar);
            c80.add(ftVar.f14679b);
        }
        return g10;
    }

    public static int f(iq iqVar, byte[] bArr, int i10, int i11, int i12, ft ftVar) throws IOException {
        eq eqVar = (eq) iqVar;
        Object k10 = eqVar.k();
        int n10 = eqVar.n(k10, bArr, i10, i11, i12, ftVar);
        eqVar.g(k10);
        ftVar.f14679b = k10;
        return n10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(com.google.android.gms.internal.ads.iq r6, byte[] r7, int r8, int r9, e8.ft r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = d(r8, r7, r0, r10)
            int r8 = r10.f14681d
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.k()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.f(r1, r2, r3, r4, r5)
            r6.g(r9)
            r10.f14679b = r9
            return r8
        L_0x0025:
            e8.f80 r6 = e8.f80.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lp.g(com.google.android.gms.internal.ads.iq, byte[], int, int, e8.ft):int");
    }

    public static int h(byte[] bArr, int i10, ft ftVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d(b10, bArr, i11, ftVar);
        }
        ftVar.f14681d = b10;
        return i11;
    }

    public static int i(byte[] bArr, int i10, c80<?> c80, ft ftVar) throws IOException {
        w70 w70 = (w70) c80;
        int h10 = h(bArr, i10, ftVar);
        int i11 = ftVar.f14681d + h10;
        while (h10 < i11) {
            h10 = h(bArr, h10, ftVar);
            w70.o(ftVar.f14681d);
        }
        if (h10 == i11) {
            return h10;
        }
        throw f80.a();
    }

    public static int j(byte[] bArr, int i10, ft ftVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            ftVar.f14678a = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        ftVar.f14678a = j11;
        return i12;
    }

    public static int k(byte[] bArr, int i10, ft ftVar) throws f80 {
        int h10 = h(bArr, i10, ftVar);
        int i11 = ftVar.f14681d;
        if (i11 < 0) {
            throw f80.b();
        } else if (i11 == 0) {
            ftVar.f14679b = "";
            return h10;
        } else {
            ftVar.f14679b = new String(bArr, h10, i11, v70.f17029a);
            return h10 + i11;
        }
    }

    public static int l(byte[] bArr, int i10, ft ftVar) throws f80 {
        int h10 = h(bArr, i10, ftVar);
        int i11 = ftVar.f14681d;
        if (i11 < 0) {
            throw f80.b();
        } else if (i11 == 0) {
            ftVar.f14679b = "";
            return h10;
        } else {
            ftVar.f14679b = qq.e(bArr, h10, i11);
            return h10 + i11;
        }
    }

    public static int m(byte[] bArr, int i10, ft ftVar) throws f80 {
        int h10 = h(bArr, i10, ftVar);
        int i11 = ftVar.f14681d;
        if (i11 < 0) {
            throw f80.b();
        } else if (i11 > bArr.length - h10) {
            throw f80.a();
        } else if (i11 == 0) {
            ftVar.f14679b = mp.f7494b;
            return h10;
        } else {
            ftVar.f14679b = mp.I(bArr, h10, i11);
            return h10 + i11;
        }
    }

    public static int n(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long o(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
