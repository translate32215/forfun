package k8;

import androidx.activity.k;
import e8.ft;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class j5 {
    public static int a(byte[] bArr, int i10, ft ftVar) throws t6 {
        int j10 = j(bArr, i10, ftVar);
        int i11 = ftVar.f14681d;
        if (i11 < 0) {
            throw t6.b();
        } else if (i11 > bArr.length - j10) {
            throw t6.d();
        } else if (i11 == 0) {
            ftVar.f14679b = p5.f20407b;
            return j10;
        } else {
            ftVar.f14679b = p5.y(bArr, j10, i11);
            return j10 + i11;
        }
    }

    public static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int c(x7 x7Var, byte[] bArr, int i10, int i11, int i12, ft ftVar) throws IOException {
        p7 p7Var = (p7) x7Var;
        Object r10 = ((k6) p7Var.f20415e).r(4, (Object) null, (Object) null);
        int A = p7Var.A(r10, bArr, i10, i11, i12, ftVar);
        p7Var.a(r10);
        ftVar.f14679b = r10;
        return A;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(k8.x7 r6, byte[] r7, int r8, int r9, e8.ft r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = k(r8, r7, r0, r10)
            int r8 = r10.f14681d
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.b()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.i(r1, r2, r3, r4, r5)
            r6.a(r9)
            r10.f14679b = r9
            return r8
        L_0x0025:
            k8.t6 r6 = k8.t6.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.j5.d(k8.x7, byte[], int, int, e8.ft):int");
    }

    public static int e(x7<?> x7Var, int i10, byte[] bArr, int i11, int i12, q6<?> q6Var, ft ftVar) throws IOException {
        int d10 = d(x7Var, bArr, i11, i12, ftVar);
        q6Var.add(ftVar.f14679b);
        while (d10 < i12) {
            int j10 = j(bArr, d10, ftVar);
            if (i10 != ftVar.f14681d) {
                break;
            }
            d10 = d(x7Var, bArr, j10, i12, ftVar);
            q6Var.add(ftVar.f14679b);
        }
        return d10;
    }

    public static int f(byte[] bArr, int i10, q6<?> q6Var, ft ftVar) throws IOException {
        m6 m6Var = (m6) q6Var;
        int j10 = j(bArr, i10, ftVar);
        int i11 = ftVar.f14681d + j10;
        while (j10 < i11) {
            j10 = j(bArr, j10, ftVar);
            m6Var.i(ftVar.f14681d);
        }
        if (j10 == i11) {
            return j10;
        }
        throw t6.d();
    }

    public static int g(byte[] bArr, int i10, ft ftVar) throws t6 {
        int j10 = j(bArr, i10, ftVar);
        int i11 = ftVar.f14681d;
        if (i11 < 0) {
            throw t6.b();
        } else if (i11 == 0) {
            ftVar.f14679b = "";
            return j10;
        } else {
            ftVar.f14679b = new String(bArr, j10, i11, r6.f20450a);
            return j10 + i11;
        }
    }

    public static int h(byte[] bArr, int i10, ft ftVar) throws t6 {
        int i11;
        int i12;
        int j10 = j(bArr, i10, ftVar);
        int i13 = ftVar.f14681d;
        if (i13 < 0) {
            throw t6.b();
        } else if (i13 == 0) {
            ftVar.f14679b = "";
            return j10;
        } else {
            t8 t8Var = v8.f20511a;
            int length = bArr.length;
            if ((j10 | i13 | ((length - j10) - i13)) >= 0) {
                int i14 = j10 + i13;
                char[] cArr = new char[i13];
                int i15 = 0;
                while (i11 < i14) {
                    byte b10 = bArr[i11];
                    if (!k.e(b10)) {
                        break;
                    }
                    j10 = i11 + 1;
                    cArr[i12] = (char) b10;
                    i15 = i12 + 1;
                }
                while (i11 < i14) {
                    int i16 = i11 + 1;
                    byte b11 = bArr[i11];
                    if (k.e(b11)) {
                        int i17 = i12 + 1;
                        cArr[i12] = (char) b11;
                        i11 = i16;
                        while (true) {
                            i12 = i17;
                            if (i11 >= i14) {
                                break;
                            }
                            byte b12 = bArr[i11];
                            if (!k.e(b12)) {
                                break;
                            }
                            i11++;
                            i17 = i12 + 1;
                            cArr[i12] = (char) b12;
                        }
                    } else if (b11 < -32) {
                        if (i16 < i14) {
                            int i18 = i16 + 1;
                            int i19 = i12 + 1;
                            byte b13 = bArr[i16];
                            if (b11 < -62 || k.f(b13)) {
                                throw t6.a();
                            }
                            cArr[i12] = (char) (((b11 & 31) << 6) | (b13 & 63));
                            i11 = i18;
                            i12 = i19;
                        } else {
                            throw t6.a();
                        }
                    } else if (b11 < -16) {
                        if (i16 < i14 - 1) {
                            int i20 = i16 + 1;
                            int i21 = i20 + 1;
                            int i22 = i12 + 1;
                            byte b14 = bArr[i16];
                            byte b15 = bArr[i20];
                            if (!k.f(b14)) {
                                if (b11 == -32) {
                                    if (b14 >= -96) {
                                        b11 = -32;
                                    }
                                }
                                if (b11 == -19) {
                                    if (b14 < -96) {
                                        b11 = -19;
                                    }
                                }
                                if (!k.f(b15)) {
                                    cArr[i12] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                    i11 = i21;
                                    i12 = i22;
                                }
                            }
                            throw t6.a();
                        }
                        throw t6.a();
                    } else if (i16 < i14 - 2) {
                        int i23 = i16 + 1;
                        int i24 = i23 + 1;
                        int i25 = i24 + 1;
                        byte b16 = bArr[i16];
                        byte b17 = bArr[i23];
                        byte b18 = bArr[i24];
                        if (!k.f(b16)) {
                            if ((((b16 + 112) + (b11 << 28)) >> 30) == 0 && !k.f(b17) && !k.f(b18)) {
                                byte b19 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i12] = (char) ((b19 >>> 10) + 55232);
                                cArr[i12 + 1] = (char) ((b19 & 1023) + 56320);
                                i12 += 2;
                                i11 = i25;
                            }
                        }
                        throw t6.a();
                    } else {
                        throw t6.a();
                    }
                }
                ftVar.f14679b = new String(cArr, 0, i12);
                return i14;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(j10), Integer.valueOf(i13)}));
        }
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, m8 m8Var, ft ftVar) throws t6 {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int m10 = m(bArr, i11, ftVar);
                m8Var.c(i10, Long.valueOf(ftVar.f14678a));
                return m10;
            } else if (i13 == 1) {
                m8Var.c(i10, Long.valueOf(n(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int j10 = j(bArr, i11, ftVar);
                int i14 = ftVar.f14681d;
                if (i14 < 0) {
                    throw t6.b();
                } else if (i14 <= bArr.length - j10) {
                    if (i14 == 0) {
                        m8Var.c(i10, p5.f20407b);
                    } else {
                        m8Var.c(i10, p5.y(bArr, j10, i14));
                    }
                    return j10 + i14;
                } else {
                    throw t6.d();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                m8 b10 = m8.b();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int j11 = j(bArr, i11, ftVar);
                    int i17 = ftVar.f14681d;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = j11;
                        break;
                    }
                    i16 = i17;
                    i11 = i(i17, bArr, j11, i12, b10, ftVar);
                }
                if (i11 > i12 || i16 != i15) {
                    throw t6.c();
                }
                m8Var.c(i10, b10);
                return i11;
            } else if (i13 == 5) {
                m8Var.c(i10, Integer.valueOf(b(bArr, i11)));
                return i11 + 4;
            } else {
                throw new t6("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new t6("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int j(byte[] bArr, int i10, ft ftVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, ftVar);
        }
        ftVar.f14681d = b10;
        return i11;
    }

    public static int k(int i10, byte[] bArr, int i11, ft ftVar) {
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
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                ftVar.f14681d = i20;
                return i21;
            }
        }
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, q6<?> q6Var, ft ftVar) {
        m6 m6Var = (m6) q6Var;
        int j10 = j(bArr, i11, ftVar);
        m6Var.i(ftVar.f14681d);
        while (j10 < i12) {
            int j11 = j(bArr, j10, ftVar);
            if (i10 != ftVar.f14681d) {
                break;
            }
            j10 = j(bArr, j11, ftVar);
            m6Var.i(ftVar.f14681d);
        }
        return j10;
    }

    public static int m(byte[] bArr, int i10, ft ftVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 < 0) {
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
        ftVar.f14678a = j10;
        return i11;
    }

    public static long n(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
