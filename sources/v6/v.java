package v6;

import aa.c;
import androidx.appcompat.widget.d0;
import d5.b0;
import java.nio.charset.Charset;
import java.util.Arrays;
import t3.a0;

/* compiled from: ParsableByteArray */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f26518a;

    /* renamed from: b  reason: collision with root package name */
    public int f26519b;

    /* renamed from: c  reason: collision with root package name */
    public int f26520c;

    public v() {
        this.f26518a = e0.f26441f;
    }

    public void A(byte[] bArr) {
        int length = bArr.length;
        this.f26518a = bArr;
        this.f26520c = length;
        this.f26519b = 0;
    }

    public void B(byte[] bArr, int i10) {
        this.f26518a = bArr;
        this.f26520c = i10;
        this.f26519b = 0;
    }

    public void C(int i10) {
        a.a(i10 >= 0 && i10 <= this.f26518a.length);
        this.f26520c = i10;
    }

    public void D(int i10) {
        a.a(i10 >= 0 && i10 <= this.f26520c);
        this.f26519b = i10;
    }

    public void E(int i10) {
        D(this.f26519b + i10);
    }

    public int a() {
        return this.f26520c - this.f26519b;
    }

    public void b(int i10) {
        byte[] bArr = this.f26518a;
        if (i10 > bArr.length) {
            this.f26518a = Arrays.copyOf(bArr, i10);
        }
    }

    public int c() {
        return this.f26518a[this.f26519b] & 255;
    }

    public void d(b0 b0Var, int i10) {
        e(b0Var.f13001b, 0, i10);
        b0Var.p(0);
    }

    public void e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f26518a, this.f26519b, bArr, i10, i11);
        this.f26519b += i11;
    }

    public int f() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        int i12 = i11 + 1;
        this.f26519b = i12;
        byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i13 = i12 + 1;
        this.f26519b = i13;
        byte b11 = b10 | ((bArr[i12] & 255) << 8);
        this.f26519b = i13 + 1;
        return (bArr[i13] & 255) | b11;
    }

    public String g() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f26519b;
        while (i10 < this.f26520c && !e0.I(this.f26518a[i10])) {
            i10++;
        }
        int i11 = this.f26519b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f26518a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f26519b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f26518a;
        int i12 = this.f26519b;
        String p10 = e0.p(bArr2, i12, i10 - i12);
        this.f26519b = i10;
        int i13 = this.f26520c;
        if (i10 == i13) {
            return p10;
        }
        byte[] bArr3 = this.f26518a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f26519b = i14;
            if (i14 == i13) {
                return p10;
            }
        }
        int i15 = this.f26519b;
        if (bArr3[i15] == 10) {
            this.f26519b = i15 + 1;
        }
        return p10;
    }

    public int h() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        int i12 = i11 + 1;
        this.f26519b = i12;
        byte b10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i13 = i12 + 1;
        this.f26519b = i13;
        byte b11 = b10 | ((bArr[i12] & 255) << 16);
        this.f26519b = i13 + 1;
        return ((bArr[i13] & 255) << 24) | b11;
    }

    public short i() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        this.f26519b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long j() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        int i12 = i11 + 1;
        this.f26519b = i12;
        int i13 = i12 + 1;
        this.f26519b = i13;
        this.f26519b = i13 + 1;
        return ((((long) bArr[i13]) & 255) << 24) | (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
    }

    public int k() {
        int h10 = h();
        if (h10 >= 0) {
            return h10;
        }
        throw new IllegalStateException(d0.a("Top bit not zero: ", h10));
    }

    public int l() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        this.f26519b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long m() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        int i12 = i11 + 1;
        this.f26519b = i12;
        int i13 = i12 + 1;
        this.f26519b = i13;
        int i14 = i13 + 1;
        this.f26519b = i14;
        int i15 = i14 + 1;
        this.f26519b = i15;
        int i16 = i15 + 1;
        this.f26519b = i16;
        int i17 = i16 + 1;
        this.f26519b = i17;
        this.f26519b = i17 + 1;
        return (((long) bArr[i17]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40) | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24) | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8);
    }

    public String n() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f26519b;
        while (i10 < this.f26520c && this.f26518a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f26518a;
        int i11 = this.f26519b;
        String p10 = e0.p(bArr, i11, i10 - i11);
        this.f26519b = i10;
        if (i10 < this.f26520c) {
            this.f26519b = i10 + 1;
        }
        return p10;
    }

    public String o(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f26519b;
        int i12 = (i11 + i10) - 1;
        String p10 = e0.p(this.f26518a, i11, (i12 >= this.f26520c || this.f26518a[i12] != 0) ? i10 : i10 - 1);
        this.f26519b += i10;
        return p10;
    }

    public String p(int i10) {
        return q(i10, c.f178c);
    }

    public String q(int i10, Charset charset) {
        String str = new String(this.f26518a, this.f26519b, i10, charset);
        this.f26519b += i10;
        return str;
    }

    public int r() {
        return (s() << 21) | (s() << 14) | (s() << 7) | s();
    }

    public int s() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        this.f26519b = i10 + 1;
        return bArr[i10] & 255;
    }

    public long t() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        int i12 = i11 + 1;
        this.f26519b = i12;
        int i13 = i12 + 1;
        this.f26519b = i13;
        this.f26519b = i13 + 1;
        return (((long) bArr[i13]) & 255) | ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
    }

    public int u() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        int i12 = i11 + 1;
        this.f26519b = i12;
        byte b10 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f26519b = i12 + 1;
        return (bArr[i12] & 255) | b10;
    }

    public int v() {
        int f10 = f();
        if (f10 >= 0) {
            return f10;
        }
        throw new IllegalStateException(d0.a("Top bit not zero: ", f10));
    }

    public long w() {
        long m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(a0.a("Top bit not zero: ", m10));
    }

    public int x() {
        byte[] bArr = this.f26518a;
        int i10 = this.f26519b;
        int i11 = i10 + 1;
        this.f26519b = i11;
        this.f26519b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long y() {
        int i10;
        int i11;
        long j10 = (long) this.f26518a[this.f26519b];
        int i12 = 7;
        while (true) {
            i10 = 1;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            while (i10 < i11) {
                byte b10 = this.f26518a[this.f26519b + i10];
                if ((b10 & 192) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    throw new NumberFormatException(a0.a("Invalid UTF-8 sequence continuation byte: ", j10));
                }
            }
            this.f26519b += i11;
            return j10;
        }
        throw new NumberFormatException(a0.a("Invalid UTF-8 sequence first byte: ", j10));
    }

    public void z(int i10) {
        byte[] bArr = this.f26518a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        B(bArr, i10);
    }

    public v(int i10) {
        this.f26518a = new byte[i10];
        this.f26520c = i10;
    }

    public v(byte[] bArr) {
        this.f26518a = bArr;
        this.f26520c = bArr.length;
    }

    public v(byte[] bArr, int i10) {
        this.f26518a = bArr;
        this.f26520c = i10;
    }
}
