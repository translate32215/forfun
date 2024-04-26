package com.google.android.gms.internal.ads;

import com.startapp.b4;
import e.h;
import e8.f80;
import e8.v70;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class qp extends op {

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f7985e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f7986f;

    /* renamed from: g  reason: collision with root package name */
    public int f7987g;

    /* renamed from: h  reason: collision with root package name */
    public int f7988h;

    /* renamed from: i  reason: collision with root package name */
    public int f7989i;

    /* renamed from: j  reason: collision with root package name */
    public int f7990j;

    /* renamed from: k  reason: collision with root package name */
    public int f7991k;

    /* renamed from: l  reason: collision with root package name */
    public int f7992l = Integer.MAX_VALUE;

    public qp(InputStream inputStream, int i10) {
        super((h) null);
        Charset charset = v70.f17029a;
        this.f7985e = inputStream;
        this.f7986f = new byte[4096];
        this.f7987g = 0;
        this.f7989i = 0;
        this.f7991k = 0;
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
            int r0 = r5.f7989i
            int r1 = r5.f7987g
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f7986f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f7989i = r3
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
            r5.f7989i = r1
            return r0
        L_0x006b:
            long r0 = r5.B()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp.C():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long D() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f7989i
            int r1 = r11.f7987g
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f7986f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f7989i = r3
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
            r11.f7989i = r1
            return r2
        L_0x00b8:
            long r0 = r11.B()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp.D():long");
    }

    public final int E() throws IOException {
        int i10 = this.f7989i;
        if (this.f7987g - i10 < 4) {
            K(4);
            i10 = this.f7989i;
        }
        byte[] bArr = this.f7986f;
        this.f7989i = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long F() throws IOException {
        int i10 = this.f7989i;
        if (this.f7987g - i10 < 8) {
            K(8);
            i10 = this.f7989i;
        }
        byte[] bArr = this.f7986f;
        this.f7989i = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final void G() {
        int i10 = this.f7987g + this.f7988h;
        this.f7987g = i10;
        int i11 = this.f7991k + i10;
        int i12 = this.f7992l;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f7988h = i13;
            this.f7987g = i10 - i13;
            return;
        }
        this.f7988h = 0;
    }

    public final byte H() throws IOException {
        if (this.f7989i == this.f7987g) {
            K(1);
        }
        byte[] bArr = this.f7986f;
        int i10 = this.f7989i;
        this.f7989i = i10 + 1;
        return bArr[i10];
    }

    public final byte[] I(int i10) throws IOException {
        byte[] M = M(i10);
        if (M != null) {
            return M;
        }
        int i11 = this.f7989i;
        int i12 = this.f7987g;
        int i13 = i12 - i11;
        this.f7991k += i12;
        this.f7989i = 0;
        this.f7987g = 0;
        List<byte[]> N = N(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f7986f, i11, bArr, 0, i13);
        Iterator it = ((ArrayList) N).iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }

    public final void J(int i10) throws IOException {
        int i11 = this.f7987g;
        int i12 = this.f7989i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f7989i = i12 + i10;
        } else if (i10 >= 0) {
            int i13 = this.f7991k;
            int i14 = i13 + i12 + i10;
            int i15 = this.f7992l;
            if (i14 <= i15) {
                this.f7991k = i13 + i12;
                int i16 = i11 - i12;
                this.f7987g = 0;
                this.f7989i = 0;
                while (i16 < i10) {
                    try {
                        long j10 = (long) (i10 - i16);
                        long skip = this.f7985e.skip(j10);
                        if (skip >= 0 && skip <= j10) {
                            if (skip == 0) {
                                break;
                            }
                            i16 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.f7985e.getClass());
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 92);
                            sb2.append(valueOf);
                            sb2.append("#skip returned invalid result: ");
                            sb2.append(skip);
                            sb2.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb2.toString());
                        }
                    } catch (Throwable th) {
                        this.f7991k += i16;
                        G();
                        throw th;
                    }
                }
                this.f7991k += i16;
                G();
                if (i16 < i10) {
                    int i17 = this.f7987g;
                    int i18 = i17 - this.f7989i;
                    this.f7989i = i17;
                    K(1);
                    while (true) {
                        int i19 = i10 - i18;
                        int i20 = this.f7987g;
                        if (i19 > i20) {
                            i18 += i20;
                            this.f7989i = i20;
                            K(1);
                        } else {
                            this.f7989i = i19;
                            return;
                        }
                    }
                }
            } else {
                J((i15 - i13) - i12);
                throw f80.a();
            }
        } else {
            throw f80.b();
        }
    }

    public final void K(int i10) throws IOException {
        if (L(i10)) {
            return;
        }
        if (i10 > (this.f7699c - this.f7991k) - this.f7989i) {
            throw new f80("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw f80.a();
    }

    public final boolean L(int i10) throws IOException {
        do {
            int i11 = this.f7989i;
            int i12 = i11 + i10;
            int i13 = this.f7987g;
            if (i12 > i13) {
                int i14 = this.f7699c;
                int i15 = this.f7991k;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f7992l) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f7986f;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f7991k += i11;
                    this.f7987g -= i11;
                    this.f7989i = 0;
                }
                InputStream inputStream = this.f7985e;
                byte[] bArr2 = this.f7986f;
                int i16 = this.f7987g;
                int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f7699c - this.f7991k) - i16));
                if (read == 0 || read < -1 || read > this.f7986f.length) {
                    String valueOf = String.valueOf(this.f7985e.getClass());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 91);
                    sb2.append(valueOf);
                    sb2.append("#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f7987g += read;
                    G();
                }
            } else {
                StringBuilder sb3 = new StringBuilder(77);
                sb3.append("refillBuffer() called when ");
                sb3.append(i10);
                sb3.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb3.toString());
            }
        } while (this.f7987g < i10);
        return true;
    }

    public final byte[] M(int i10) throws IOException {
        if (i10 == 0) {
            return v70.f17030b;
        }
        if (i10 >= 0) {
            int i11 = this.f7991k;
            int i12 = this.f7989i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f7699c <= 0) {
                int i14 = this.f7992l;
                if (i13 <= i14) {
                    int i15 = this.f7987g - i12;
                    int i16 = i10 - i15;
                    if (i16 >= 4096 && i16 > this.f7985e.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f7986f, this.f7989i, bArr, 0, i15);
                    this.f7991k += this.f7987g;
                    this.f7989i = 0;
                    this.f7987g = 0;
                    while (i15 < i10) {
                        int read = this.f7985e.read(bArr, i15, i10 - i15);
                        if (read != -1) {
                            this.f7991k += read;
                            i15 += read;
                        } else {
                            throw f80.a();
                        }
                    }
                    return bArr;
                }
                J((i14 - i11) - i12);
                throw f80.a();
            }
            throw new f80("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw f80.b();
    }

    public final List<byte[]> N(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.f7985e.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.f7991k += read;
                    i11 += read;
                } else {
                    throw f80.a();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
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
            int i10 = this.f7987g;
            int i11 = this.f7989i;
            if (C <= i10 - i11) {
                String str = new String(this.f7986f, i11, C, v70.f17029a);
                this.f7989i += C;
                return str;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C > this.f7987g) {
            return new String(I(C), v70.f17029a);
        }
        K(C);
        String str2 = new String(this.f7986f, this.f7989i, C, v70.f17029a);
        this.f7989i += C;
        return str2;
    }

    public final int e() throws IOException {
        if (t()) {
            this.f7990j = 0;
            return 0;
        }
        int C = C();
        this.f7990j = C;
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
        byte[] bArr;
        int C = C();
        int i10 = this.f7989i;
        int i11 = this.f7987g;
        if (C <= i11 - i10 && C > 0) {
            bArr = this.f7986f;
            this.f7989i = i10 + C;
        } else if (C == 0) {
            return "";
        } else {
            if (C <= i11) {
                K(C);
                bArr = this.f7986f;
                this.f7989i = C;
            } else {
                bArr = I(C);
            }
            i10 = 0;
        }
        return qq.e(bArr, i10, C);
    }

    public final mp m() throws IOException {
        int C = C();
        int i10 = this.f7987g;
        int i11 = this.f7989i;
        if (C <= i10 - i11 && C > 0) {
            mp I = mp.I(this.f7986f, i11, C);
            this.f7989i += C;
            return I;
        } else if (C == 0) {
            return mp.f7494b;
        } else {
            byte[] M = M(C);
            if (M != null) {
                return mp.I(M, 0, M.length);
            }
            int i12 = this.f7989i;
            int i13 = this.f7987g;
            int i14 = i13 - i12;
            this.f7991k += i13;
            this.f7989i = 0;
            this.f7987g = 0;
            List<byte[]> N = N(C - i14);
            byte[] bArr = new byte[C];
            System.arraycopy(this.f7986f, i12, bArr, 0, i14);
            Iterator it = ((ArrayList) N).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                i14 += bArr2.length;
            }
            return new np(bArr);
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
        return this.f7989i == this.f7987g && !L(1);
    }

    public final int u() {
        return this.f7991k + this.f7989i;
    }

    public final void w(int i10) throws f80 {
        if (this.f7990j != i10) {
            throw f80.e();
        }
    }

    public final boolean x(int i10) throws IOException {
        int e10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f7987g - this.f7989i >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f7986f;
                    int i13 = this.f7989i;
                    this.f7989i = i13 + 1;
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
            J(8);
            return true;
        } else if (i11 == 2) {
            J(C());
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
                J(4);
                return true;
            }
            throw f80.f();
        }
    }

    public final int y(int i10) throws f80 {
        if (i10 >= 0) {
            int i11 = this.f7991k + this.f7989i + i10;
            int i12 = this.f7992l;
            if (i11 <= i12) {
                this.f7992l = i11;
                G();
                return i12;
            }
            throw f80.a();
        }
        throw f80.b();
    }

    public final void z(int i10) {
        this.f7992l = i10;
        G();
    }
}
