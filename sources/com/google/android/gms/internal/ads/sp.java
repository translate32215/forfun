package com.google.android.gms.internal.ads;

import e8.b70;
import e8.ca0;
import e8.v70;
import e8.z60;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class sp extends w4 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f8137b = Logger.getLogger(sp.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f8138c = oq.f7706f;

    /* renamed from: a  reason: collision with root package name */
    public tp f8139a;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static class a extends IOException {
        public a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sp.a.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static class b extends sp {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f8140d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8141e;

        /* renamed from: f  reason: collision with root package name */
        public int f8142f;

        public b(byte[] bArr, int i10) {
            super((g7) null);
            if ((i10 | 0 | (bArr.length - i10)) >= 0) {
                this.f8140d = bArr;
                this.f8142f = 0;
                this.f8141e = i10;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)}));
        }

        public final void D(int i10) throws IOException {
            if (i10 >= 0) {
                E(i10);
            } else {
                y((long) i10);
            }
        }

        public final void E(int i10) throws IOException {
            if (!sp.f8138c || b70.a() || t() < 5) {
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f8140d;
                    int i11 = this.f8142f;
                    this.f8142f = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f8140d;
                    int i12 = this.f8142f;
                    this.f8142f = i12 + 1;
                    bArr2[i12] = (byte) i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8142f), Integer.valueOf(this.f8141e), 1}), e10);
                }
            } else if ((i10 & -128) == 0) {
                byte[] bArr3 = this.f8140d;
                int i13 = this.f8142f;
                this.f8142f = i13 + 1;
                oq.g(bArr3, (long) i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f8140d;
                int i14 = this.f8142f;
                this.f8142f = i14 + 1;
                oq.g(bArr4, (long) i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & -128) == 0) {
                    byte[] bArr5 = this.f8140d;
                    int i16 = this.f8142f;
                    this.f8142f = i16 + 1;
                    oq.g(bArr5, (long) i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f8140d;
                int i17 = this.f8142f;
                this.f8142f = i17 + 1;
                oq.g(bArr6, (long) i17, (byte) (i15 | 128));
                int i18 = i15 >>> 7;
                if ((i18 & -128) == 0) {
                    byte[] bArr7 = this.f8140d;
                    int i19 = this.f8142f;
                    this.f8142f = i19 + 1;
                    oq.g(bArr7, (long) i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f8140d;
                int i20 = this.f8142f;
                this.f8142f = i20 + 1;
                oq.g(bArr8, (long) i20, (byte) (i18 | 128));
                int i21 = i18 >>> 7;
                if ((i21 & -128) == 0) {
                    byte[] bArr9 = this.f8140d;
                    int i22 = this.f8142f;
                    this.f8142f = i22 + 1;
                    oq.g(bArr9, (long) i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f8140d;
                int i23 = this.f8142f;
                this.f8142f = i23 + 1;
                oq.g(bArr10, (long) i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f8140d;
                int i24 = this.f8142f;
                this.f8142f = i24 + 1;
                oq.g(bArr11, (long) i24, (byte) (i21 >>> 7));
            }
        }

        public final void F(int i10) throws IOException {
            try {
                byte[] bArr = this.f8140d;
                int i11 = this.f8142f;
                int i12 = i11 + 1;
                this.f8142f = i12;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                this.f8142f = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                this.f8142f = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f8142f = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8142f), Integer.valueOf(this.f8141e), 1}), e10);
            }
        }

        public final void K(int i10, boolean z10) throws IOException {
            E((i10 << 3) | 0);
            x(z10 ? (byte) 1 : 0);
        }

        public final void N(int i10, long j10) throws IOException {
            E((i10 << 3) | 0);
            y(j10);
        }

        public final void O(int i10, String str) throws IOException {
            E((i10 << 3) | 2);
            Z(str);
        }

        public final void R(int i10, long j10) throws IOException {
            E((i10 << 3) | 1);
            z(j10);
        }

        public final void X(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f8140d, this.f8142f, i11);
                this.f8142f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8142f), Integer.valueOf(this.f8141e), Integer.valueOf(i11)}), e10);
            }
        }

        public final void Y(mp mpVar) throws IOException {
            E(mpVar.size());
            mpVar.i(this);
        }

        public final void Z(String str) throws IOException {
            int i10 = this.f8142f;
            try {
                int I = sp.I(str.length() * 3);
                int I2 = sp.I(str.length());
                if (I2 == I) {
                    int i11 = i10 + I2;
                    this.f8142f = i11;
                    int c10 = qq.f7993a.c(str, this.f8140d, i11, t());
                    this.f8142f = i10;
                    E((c10 - i10) - I2);
                    this.f8142f = c10;
                    return;
                }
                E(qq.b(str));
                this.f8142f = qq.f7993a.c(str, this.f8140d, this.f8142f, t());
            } catch (ca0 e10) {
                this.f8142f = i10;
                sp.f8137b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
                byte[] bytes = str.getBytes(v70.f17029a);
                try {
                    E(bytes.length);
                    X(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e11) {
                    throw new a(e11);
                } catch (a e12) {
                    throw e12;
                }
            } catch (IndexOutOfBoundsException e13) {
                throw new a(e13);
            }
        }

        public final void b(byte[] bArr, int i10, int i11) throws IOException {
            X(bArr, i10, i11);
        }

        public final void c(int i10, int i11) throws IOException {
            E((i10 << 3) | i11);
        }

        public final void e(int i10, mp mpVar) throws IOException {
            E((i10 << 3) | 2);
            Y(mpVar);
        }

        public final void f(int i10, cq cqVar) throws IOException {
            c(1, 3);
            i(2, i10);
            c(3, 2);
            E(cqVar.c());
            cqVar.a(this);
            c(1, 4);
        }

        public final void g(int i10, cq cqVar, iq iqVar) throws IOException {
            E((i10 << 3) | 2);
            z60 z60 = (z60) cqVar;
            int i11 = z60.i();
            if (i11 == -1) {
                i11 = iqVar.i(z60);
                z60.j(i11);
            }
            E(i11);
            iqVar.d(cqVar, this.f8139a);
        }

        public final void h(int i10, int i11) throws IOException {
            E((i10 << 3) | 0);
            if (i11 >= 0) {
                E(i11);
            } else {
                y((long) i11);
            }
        }

        public final void i(int i10, int i11) throws IOException {
            E((i10 << 3) | 0);
            E(i11);
        }

        public final void j(int i10, int i11) throws IOException {
            E((i10 << 3) | 5);
            F(i11);
        }

        public final void s(int i10, mp mpVar) throws IOException {
            c(1, 3);
            i(2, i10);
            e(3, mpVar);
            c(1, 4);
        }

        public final int t() {
            return this.f8141e - this.f8142f;
        }

        public final void x(byte b10) throws IOException {
            try {
                byte[] bArr = this.f8140d;
                int i10 = this.f8142f;
                this.f8142f = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8142f), Integer.valueOf(this.f8141e), 1}), e10);
            }
        }

        public final void y(long j10) throws IOException {
            if (!sp.f8138c || t() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f8140d;
                    int i10 = this.f8142f;
                    this.f8142f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f8140d;
                    int i11 = this.f8142f;
                    this.f8142f = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8142f), Integer.valueOf(this.f8141e), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f8140d;
                    int i12 = this.f8142f;
                    this.f8142f = i12 + 1;
                    oq.g(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f8140d;
                int i13 = this.f8142f;
                this.f8142f = i13 + 1;
                oq.g(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void z(long j10) throws IOException {
            try {
                byte[] bArr = this.f8140d;
                int i10 = this.f8142f;
                int i11 = i10 + 1;
                this.f8142f = i11;
                bArr[i10] = (byte) ((int) j10);
                int i12 = i11 + 1;
                this.f8142f = i12;
                bArr[i11] = (byte) ((int) (j10 >> 8));
                int i13 = i12 + 1;
                this.f8142f = i13;
                bArr[i12] = (byte) ((int) (j10 >> 16));
                int i14 = i13 + 1;
                this.f8142f = i14;
                bArr[i13] = (byte) ((int) (j10 >> 24));
                int i15 = i14 + 1;
                this.f8142f = i15;
                bArr[i14] = (byte) ((int) (j10 >> 32));
                int i16 = i15 + 1;
                this.f8142f = i16;
                bArr[i15] = (byte) ((int) (j10 >> 40));
                int i17 = i16 + 1;
                this.f8142f = i17;
                bArr[i16] = (byte) ((int) (j10 >> 48));
                this.f8142f = i17 + 1;
                bArr[i17] = (byte) ((int) (j10 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8142f), Integer.valueOf(this.f8141e), 1}), e10);
            }
        }
    }

    public sp() {
        super(1);
    }

    public static int A(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int B(long j10) {
        return A(C(j10));
    }

    public static long C(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int G(int i10) {
        return I(i10 << 3);
    }

    public static int H(int i10) {
        if (i10 >= 0) {
            return I(i10);
        }
        return 10;
    }

    public static int I(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int J(int i10) {
        return I(L(i10));
    }

    public static int L(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int M(int i10) {
        return I(i10 << 3) + 1;
    }

    public static int P(String str) {
        int i10;
        try {
            i10 = qq.b(str);
        } catch (ca0 unused) {
            i10 = str.getBytes(v70.f17029a).length;
        }
        return I(i10) + i10;
    }

    public static int Q(int i10, String str) {
        return P(str) + I(i10 << 3);
    }

    public static int S(int i10, long j10) {
        return A(j10) + I(i10 << 3);
    }

    public static int T(int i10, long j10) {
        return A(j10) + I(i10 << 3);
    }

    public static int U(int i10, long j10) {
        return A(C(j10)) + I(i10 << 3);
    }

    public static int V(int i10) {
        return I(i10 << 3) + 8;
    }

    public static int W(int i10) {
        return I(i10 << 3) + 8;
    }

    public static int d(cq cqVar, iq iqVar) {
        z60 z60 = (z60) cqVar;
        int i10 = z60.i();
        if (i10 == -1) {
            i10 = iqVar.i(z60);
            z60.j(i10);
        }
        return I(i10) + i10;
    }

    public static int k(int i10, int i11) {
        return H(i11) + I(i10 << 3);
    }

    public static int l(int i10, int i11) {
        return I(i11) + I(i10 << 3);
    }

    public static int m(int i10, int i11) {
        return I(L(i11)) + I(i10 << 3);
    }

    public static int n(int i10) {
        return I(i10 << 3) + 4;
    }

    public static int o(mp mpVar) {
        int size = mpVar.size();
        return I(size) + size;
    }

    public static int p(int i10) {
        return I(i10 << 3) + 4;
    }

    public static int q(int i10, int i11) {
        return H(i11) + I(i10 << 3);
    }

    public static int r(int i10) {
        return I(i10 << 3) + 4;
    }

    public static int u(int i10) {
        return I(i10 << 3) + 8;
    }

    public static int v(int i10, mp mpVar) {
        int I = I(i10 << 3);
        int size = mpVar.size();
        return I(size) + size + I;
    }

    @Deprecated
    public static int w(int i10, cq cqVar, iq iqVar) {
        int I = I(i10 << 3) << 1;
        z60 z60 = (z60) cqVar;
        int i11 = z60.i();
        if (i11 == -1) {
            i11 = iqVar.i(z60);
            z60.j(i11);
        }
        return I + i11;
    }

    public abstract void D(int i10) throws IOException;

    public abstract void E(int i10) throws IOException;

    public abstract void F(int i10) throws IOException;

    public abstract void K(int i10, boolean z10) throws IOException;

    public abstract void N(int i10, long j10) throws IOException;

    public abstract void O(int i10, String str) throws IOException;

    public abstract void R(int i10, long j10) throws IOException;

    public abstract void c(int i10, int i11) throws IOException;

    public abstract void e(int i10, mp mpVar) throws IOException;

    public abstract void f(int i10, cq cqVar) throws IOException;

    public abstract void g(int i10, cq cqVar, iq iqVar) throws IOException;

    public abstract void h(int i10, int i11) throws IOException;

    public abstract void i(int i10, int i11) throws IOException;

    public abstract void j(int i10, int i11) throws IOException;

    public abstract void s(int i10, mp mpVar) throws IOException;

    public abstract int t();

    public abstract void x(byte b10) throws IOException;

    public abstract void y(long j10) throws IOException;

    public abstract void z(long j10) throws IOException;

    public sp(g7 g7Var) {
        super(1);
    }
}
