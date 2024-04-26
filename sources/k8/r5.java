package k8;

import e.a;
import java.io.IOException;
import java.util.logging.Level;
import n3.d;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class r5 extends t5 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f20447d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20448e;

    /* renamed from: f  reason: collision with root package name */
    public int f20449f;

    public r5(byte[] bArr, int i10, int i11) {
        super((a) null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.f20447d = bArr;
            this.f20449f = 0;
            this.f20448e = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i11)}));
    }

    public final int B() {
        return this.f20448e - this.f20449f;
    }

    public final void C(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f20447d, this.f20449f, i11);
            this.f20449f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new s5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20449f), Integer.valueOf(this.f20448e), Integer.valueOf(i11)}), e10);
        }
    }

    public final void D(byte[] bArr, int i10, int i11) throws IOException {
        C(bArr, 0, i11);
    }

    public final void d(byte b10) throws IOException {
        try {
            byte[] bArr = this.f20447d;
            int i10 = this.f20449f;
            this.f20449f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new s5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20449f), Integer.valueOf(this.f20448e), 1}), e10);
        }
    }

    public final void e(int i10, boolean z10) throws IOException {
        r(i10 << 3);
        d(z10 ? (byte) 1 : 0);
    }

    public final void f(int i10, p5 p5Var) throws IOException {
        r((i10 << 3) | 2);
        r(p5Var.h());
        p5Var.q(this);
    }

    public final void g(int i10, int i11) throws IOException {
        r((i10 << 3) | 5);
        h(i11);
    }

    public final void h(int i10) throws IOException {
        try {
            byte[] bArr = this.f20447d;
            int i11 = this.f20449f;
            int i12 = i11 + 1;
            this.f20449f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f20449f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f20449f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f20449f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new s5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20449f), Integer.valueOf(this.f20448e), 1}), e10);
        }
    }

    public final void j(int i10, long j10) throws IOException {
        r((i10 << 3) | 1);
        k(j10);
    }

    public final void k(long j10) throws IOException {
        try {
            byte[] bArr = this.f20447d;
            int i10 = this.f20449f;
            int i11 = i10 + 1;
            this.f20449f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f20449f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f20449f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f20449f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f20449f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f20449f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f20449f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f20449f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new s5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20449f), Integer.valueOf(this.f20448e), 1}), e10);
        }
    }

    public final void l(int i10, int i11) throws IOException {
        r(i10 << 3);
        if (i11 >= 0) {
            r(i11);
        } else {
            u((long) i11);
        }
    }

    public final void n(int i10) throws IOException {
        if (i10 >= 0) {
            r(i10);
        } else {
            u((long) i10);
        }
    }

    public final void o(int i10, String str) throws IOException {
        r((i10 << 3) | 2);
        int i11 = this.f20449f;
        try {
            int b10 = t5.b(str.length() * 3);
            int b11 = t5.b(str.length());
            if (b11 == b10) {
                int i12 = i11 + b11;
                this.f20449f = i12;
                int b12 = v8.b(str, this.f20447d, i12, this.f20448e - i12);
                this.f20449f = i11;
                r((b12 - i11) - b11);
                this.f20449f = b12;
                return;
            }
            r(v8.c(str));
            byte[] bArr = this.f20447d;
            int i13 = this.f20449f;
            this.f20449f = v8.b(str, bArr, i13, this.f20448e - i13);
        } catch (u8 e10) {
            this.f20449f = i11;
            t5.f20473b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
            byte[] bytes = str.getBytes(r6.f20450a);
            try {
                int length = bytes.length;
                r(length);
                D(bytes, 0, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new s5(e11);
            } catch (s5 e12) {
                throw e12;
            }
        } catch (IndexOutOfBoundsException e13) {
            throw new s5(e13);
        }
    }

    public final void p(int i10, int i11) throws IOException {
        r((i10 << 3) | i11);
    }

    public final void q(int i10, int i11) throws IOException {
        r(i10 << 3);
        r(i11);
    }

    public final void r(int i10) throws IOException {
        if (t5.f20474c) {
            int i11 = i5.f20259a;
        }
        while ((i10 & -128) != 0) {
            byte[] bArr = this.f20447d;
            int i12 = this.f20449f;
            this.f20449f = i12 + 1;
            bArr[i12] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        try {
            byte[] bArr2 = this.f20447d;
            int i13 = this.f20449f;
            this.f20449f = i13 + 1;
            bArr2[i13] = (byte) i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new s5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20449f), Integer.valueOf(this.f20448e), 1}), e10);
        }
    }

    public final void t(int i10, long j10) throws IOException {
        r(i10 << 3);
        u(j10);
    }

    public final void u(long j10) throws IOException {
        if (!t5.f20474c || this.f20448e - this.f20449f < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.f20447d;
                int i10 = this.f20449f;
                this.f20449f = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f20447d;
                int i11 = this.f20449f;
                this.f20449f = i11 + 1;
                bArr2[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new s5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20449f), Integer.valueOf(this.f20448e), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f20447d;
                int i12 = this.f20449f;
                this.f20449f = i12 + 1;
                s8.f20465c.g(bArr3, s8.f20468f + ((long) i12), (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f20447d;
            int i13 = this.f20449f;
            this.f20449f = i13 + 1;
            d dVar = s8.f20465c;
            dVar.g(bArr4, s8.f20468f + ((long) i13), (byte) ((int) j10));
        }
    }
}
