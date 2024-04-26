package com.google.android.gms.internal.ads;

import com.startapp.b4;
import e.h;
import e8.f80;
import e8.v70;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class pp extends op {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f7865e;

    /* renamed from: f  reason: collision with root package name */
    public int f7866f;

    /* renamed from: g  reason: collision with root package name */
    public int f7867g;

    /* renamed from: h  reason: collision with root package name */
    public int f7868h;

    /* renamed from: i  reason: collision with root package name */
    public int f7869i;

    /* renamed from: j  reason: collision with root package name */
    public int f7870j;

    /* renamed from: k  reason: collision with root package name */
    public int f7871k = Integer.MAX_VALUE;

    public pp(byte[] bArr, int i10, int i11, boolean z10, h hVar) {
        super((h) null);
        this.f7865e = bArr;
        this.f7866f = i11 + i10;
        this.f7868h = i10;
        this.f7869i = i10;
    }

    public final long B() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte H = H();
            j10 |= ((long) (H & Byte.MAX_VALUE)) << i10;
            if ((H & b4.f10104d) == 0) {
                return j10;
            }
        }
        throw f80.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int C() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f7868h
            int r1 = r5.f7866f
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f7865e
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f7868h = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.f7868h = r1
            return r0
        L_0x006b:
            long r0 = r5.B()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pp.C():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long D() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f7868h
            int r1 = r11.f7866f
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f7865e
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f7868h = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r1 = r1 ^ r3
            r2 = r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r3 = r3 ^ r5
        L_0x006e:
            r2 = r3
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x006e
        L_0x00b3:
            r1 = r0
            goto L_0x006e
        L_0x00b5:
            r11.f7868h = r1
            return r2
        L_0x00b8:
            long r0 = r11.B()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pp.D():long");
    }

    public final int E() throws IOException {
        int i10 = this.f7868h;
        if (this.f7866f - i10 >= 4) {
            byte[] bArr = this.f7865e;
            this.f7868h = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw f80.a();
    }

    public final long F() throws IOException {
        int i10 = this.f7868h;
        if (this.f7866f - i10 >= 8) {
            byte[] bArr = this.f7865e;
            this.f7868h = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }
        throw f80.a();
    }

    public final void G() {
        int i10 = this.f7866f + this.f7867g;
        this.f7866f = i10;
        int i11 = i10 - this.f7869i;
        int i12 = this.f7871k;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f7867g = i13;
            this.f7866f = i10 - i13;
            return;
        }
        this.f7867g = 0;
    }

    public final byte H() throws IOException {
        int i10 = this.f7868h;
        if (i10 != this.f7866f) {
            byte[] bArr = this.f7865e;
            this.f7868h = i10 + 1;
            return bArr[i10];
        }
        throw f80.a();
    }

    public final void I(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.f7866f;
            int i12 = this.f7868h;
            if (i10 <= i11 - i12) {
                this.f7868h = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw f80.b();
        }
        throw f80.a();
    }

    public final double a() throws IOException {
        return Double.longBitsToDouble(F());
    }

    public final float b() throws IOException {
        return Float.intBitsToFloat(E());
    }

    public final String c() throws IOException {
        int C = C();
        if (C > 0) {
            int i10 = this.f7866f;
            int i11 = this.f7868h;
            if (C <= i10 - i11) {
                String str = new String(this.f7865e, i11, C, v70.f17029a);
                this.f7868h += C;
                return str;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C < 0) {
            throw f80.b();
        }
        throw f80.a();
    }

    public final int e() throws IOException {
        if (t()) {
            this.f7870j = 0;
            return 0;
        }
        int C = C();
        this.f7870j = C;
        if ((C >>> 3) != 0) {
            return C;
        }
        throw f80.d();
    }

    public final long f() throws IOException {
        return D();
    }

    public final long g() throws IOException {
        return D();
    }

    public final int h() throws IOException {
        return C();
    }

    public final long i() throws IOException {
        return F();
    }

    public final int j() throws IOException {
        return E();
    }

    public final boolean k() throws IOException {
        return D() != 0;
    }

    public final String l() throws IOException {
        int C = C();
        if (C > 0) {
            int i10 = this.f7866f;
            int i11 = this.f7868h;
            if (C <= i10 - i11) {
                String e10 = qq.e(this.f7865e, i11, C);
                this.f7868h += C;
                return e10;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C <= 0) {
            throw f80.b();
        }
        throw f80.a();
    }

    public final mp m() throws IOException {
        byte[] bArr;
        int C = C();
        if (C > 0) {
            int i10 = this.f7866f;
            int i11 = this.f7868h;
            if (C <= i10 - i11) {
                mp I = mp.I(this.f7865e, i11, C);
                this.f7868h += C;
                return I;
            }
        }
        if (C == 0) {
            return mp.f7494b;
        }
        if (C > 0) {
            int i12 = this.f7866f;
            int i13 = this.f7868h;
            if (C <= i12 - i13) {
                int i14 = C + i13;
                this.f7868h = i14;
                bArr = Arrays.copyOfRange(this.f7865e, i13, i14);
                mp mpVar = mp.f7494b;
                return new np(bArr);
            }
        }
        if (C > 0) {
            throw f80.a();
        } else if (C == 0) {
            bArr = v70.f17030b;
            mp mpVar2 = mp.f7494b;
            return new np(bArr);
        } else {
            throw f80.b();
        }
    }

    public final int n() throws IOException {
        return C();
    }

    public final int o() throws IOException {
        return C();
    }

    public final int p() throws IOException {
        return E();
    }

    public final long q() throws IOException {
        return F();
    }

    public final int r() throws IOException {
        return op.A(C());
    }

    public final long s() throws IOException {
        return op.v(D());
    }

    public final boolean t() throws IOException {
        return this.f7868h == this.f7866f;
    }

    public final int u() {
        return this.f7868h - this.f7869i;
    }

    public final void w(int i10) throws f80 {
        if (this.f7870j != i10) {
            throw f80.e();
        }
    }

    public final boolean x(int i10) throws IOException {
        int e10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f7866f - this.f7868h >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f7865e;
                    int i13 = this.f7868h;
                    this.f7868h = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw f80.c();
            }
            while (i12 < 10) {
                if (H() < 0) {
                    i12++;
                }
            }
            throw f80.c();
            return true;
        } else if (i11 == 1) {
            I(8);
            return true;
        } else if (i11 == 2) {
            I(C());
            return true;
        } else if (i11 == 3) {
            do {
                e10 = e();
                if (e10 == 0 || !x(e10)) {
                    w(((i10 >>> 3) << 3) | 4);
                }
                e10 = e();
                break;
            } while (!x(e10));
            w(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                I(4);
                return true;
            }
            throw f80.f();
        }
    }

    public final int y(int i10) throws f80 {
        if (i10 >= 0) {
            int u10 = u() + i10;
            int i11 = this.f7871k;
            if (u10 <= i11) {
                this.f7871k = u10;
                G();
                return i11;
            }
            throw f80.a();
        }
        throw f80.b();
    }

    public final void z(int i10) {
        this.f7871k = i10;
        G();
    }
}
