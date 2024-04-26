package e8;

import l0.d;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w60 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f17220a;

    /* renamed from: b  reason: collision with root package name */
    public int f17221b;

    /* renamed from: c  reason: collision with root package name */
    public int f17222c;

    public w60() {
    }

    public int a() {
        byte[] bArr = this.f17220a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public int b() {
        byte[] bArr = this.f17220a;
        int i10 = this.f17221b;
        int i11 = i10 + 1;
        this.f17221b = i11;
        int i12 = i11 + 1;
        this.f17221b = i12;
        byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i13 = i12 + 1;
        this.f17221b = i13;
        byte b11 = b10 | ((bArr[i12] & 255) << 8);
        this.f17221b = i13 + 1;
        return (bArr[i13] & 255) | b11;
    }

    public long c() {
        byte[] bArr = this.f17220a;
        int i10 = this.f17221b;
        int i11 = i10 + 1;
        this.f17221b = i11;
        int i12 = i11 + 1;
        this.f17221b = i12;
        int i13 = i12 + 1;
        this.f17221b = i13;
        int i14 = i13 + 1;
        this.f17221b = i14;
        int i15 = i14 + 1;
        this.f17221b = i15;
        int i16 = i15 + 1;
        this.f17221b = i16;
        int i17 = i16 + 1;
        this.f17221b = i17;
        this.f17221b = i17 + 1;
        return (((long) bArr[i17]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40) | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24) | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8);
    }

    public int d() {
        byte[] bArr = this.f17220a;
        int i10 = this.f17221b;
        this.f17221b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int e() {
        byte[] bArr = this.f17220a;
        int i10 = this.f17221b;
        int i11 = i10 + 1;
        this.f17221b = i11;
        this.f17221b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public void f(int i10) {
        k(a() < i10 ? new byte[i10] : this.f17220a, i10);
    }

    public void g(int i10) {
        a.a(i10 >= 0 && i10 <= this.f17220a.length);
        this.f17222c = i10;
    }

    public void h(int i10) {
        a.a(i10 >= 0 && i10 <= this.f17222c);
        this.f17221b = i10;
    }

    public void i(int i10) {
        h(this.f17221b + i10);
    }

    public String j(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f17221b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f17220a, i11, (i12 >= this.f17222c || this.f17220a[i12] != 0) ? i10 : i10 - 1);
        this.f17221b += i10;
        return str;
    }

    public void k(byte[] bArr, int i10) {
        this.f17220a = bArr;
        this.f17222c = i10;
        this.f17221b = 0;
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f17220a, this.f17221b, bArr, i10, i11);
        this.f17221b += i11;
    }

    public int m() {
        return this.f17222c - this.f17221b;
    }

    public long n() {
        byte[] bArr = this.f17220a;
        int i10 = this.f17221b;
        int i11 = i10 + 1;
        this.f17221b = i11;
        int i12 = i11 + 1;
        this.f17221b = i12;
        int i13 = i12 + 1;
        this.f17221b = i13;
        this.f17221b = i13 + 1;
        return (((long) bArr[i13]) & 255) | ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
    }

    public int o() {
        int b10 = b();
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalStateException(d.a(29, "Top bit not zero: ", b10));
    }

    public long p() {
        long c10 = c();
        if (c10 >= 0) {
            return c10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(c10);
        throw new IllegalStateException(sb2.toString());
    }

    public w60(byte[] bArr, int i10) {
        if (i10 != 1) {
            this.f17220a = new byte[256];
            for (int i11 = 0; i11 < 256; i11++) {
                this.f17220a[i11] = (byte) i11;
            }
            byte b10 = 0;
            for (int i12 = 0; i12 < 256; i12++) {
                byte[] bArr2 = this.f17220a;
                b10 = (b10 + bArr2[i12] + bArr[i12 % bArr.length]) & 255;
                byte b11 = bArr2[i12];
                bArr2[i12] = bArr2[b10];
                bArr2[b10] = b11;
            }
            this.f17221b = 0;
            this.f17222c = 0;
            return;
        }
        this.f17220a = bArr;
        this.f17222c = bArr.length;
    }

    public w60(int i10) {
        this.f17220a = new byte[i10];
        this.f17222c = i10;
    }
}
