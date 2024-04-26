package d5;

import q.e;
import v6.a;
import v6.e0;

/* compiled from: VorbisBitArray */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13000a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f13001b;

    /* renamed from: c  reason: collision with root package name */
    public int f13002c;

    /* renamed from: d  reason: collision with root package name */
    public int f13003d;

    /* renamed from: e  reason: collision with root package name */
    public int f13004e;

    public b0() {
        this.f13000a = 1;
        this.f13001b = e0.f26441f;
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        switch (this.f13000a) {
            case 0:
                int i13 = this.f13003d;
                if (i13 >= 0 && (i13 < (i11 = this.f13002c) || (i13 == i11 && this.f13004e == 0))) {
                    z10 = true;
                }
                a.d(z10);
                return;
            case 1:
                int i14 = this.f13002c;
                if (i14 >= 0 && (i14 < (i12 = this.f13004e) || (i14 == i12 && this.f13003d == 0))) {
                    z10 = true;
                }
                a.d(z10);
                return;
            default:
                int i15 = this.f13003d;
                if (i15 >= 0 && (i15 < (i10 = this.f13002c) || (i15 == i10 && this.f13004e == 0))) {
                    z10 = true;
                }
                a.d(z10);
                return;
        }
    }

    public int b() {
        return ((this.f13004e - this.f13002c) * 8) - this.f13003d;
    }

    public void c() {
        if (this.f13003d != 0) {
            this.f13003d = 0;
            this.f13002c++;
            a();
        }
    }

    public boolean d(int i10) {
        int i11 = this.f13003d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f13004e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f13002c) {
                int i15 = this.f13002c;
            } else if (q(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i152 = this.f13002c;
        if (i13 < i152) {
            return true;
        }
        if (i13 == i152 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        int i10 = this.f13003d;
        int i11 = this.f13004e;
        int i12 = 0;
        while (this.f13003d < this.f13002c && !h()) {
            i12++;
        }
        boolean z10 = this.f13003d == this.f13002c;
        this.f13003d = i10;
        this.f13004e = i11;
        if (z10 || !d((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        a.d(this.f13003d == 0);
        return this.f13002c;
    }

    public int g() {
        int i10;
        int i11;
        switch (this.f13000a) {
            case 0:
                i10 = this.f13003d * 8;
                i11 = this.f13004e;
                break;
            default:
                i10 = this.f13002c * 8;
                i11 = this.f13003d;
                break;
        }
        return i10 + i11;
    }

    public boolean h() {
        boolean z10 = true;
        boolean z11 = false;
        switch (this.f13000a) {
            case 0:
                if ((((this.f13001b[this.f13003d] & 255) >> this.f13004e) & 1) == 1) {
                    z11 = true;
                }
                s(1);
                return z11;
            case 1:
                if ((this.f13001b[this.f13002c] & (128 >> this.f13003d)) == 0) {
                    z10 = false;
                }
                r();
                return z10;
            default:
                if ((this.f13001b[this.f13003d] & (128 >> this.f13004e)) == 0) {
                    z10 = false;
                }
                r();
                return z10;
        }
    }

    public int i(int i10) {
        int i11 = 1;
        switch (this.f13000a) {
            case 0:
                int i12 = this.f13003d;
                int min = Math.min(i10, 8 - this.f13004e);
                int i13 = i12 + 1;
                int i14 = ((this.f13001b[i12] & 255) >> this.f13004e) & (255 >> (8 - min));
                while (min < i10) {
                    i14 |= (this.f13001b[i13] & 255) << min;
                    min += 8;
                    i13++;
                }
                int i15 = i14 & (-1 >>> (32 - i10));
                s(i10);
                return i15;
            case 1:
                if (i10 == 0) {
                    return 0;
                }
                this.f13003d += i10;
                int i16 = 0;
                while (true) {
                    int i17 = this.f13003d;
                    if (i17 > 8) {
                        int i18 = i17 - 8;
                        this.f13003d = i18;
                        byte[] bArr = this.f13001b;
                        int i19 = this.f13002c;
                        this.f13002c = i19 + 1;
                        i16 |= (bArr[i19] & 255) << i18;
                    } else {
                        byte[] bArr2 = this.f13001b;
                        int i20 = this.f13002c;
                        int i21 = (-1 >>> (32 - i10)) & (i16 | ((255 & bArr2[i20]) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f13003d = 0;
                            this.f13002c = i20 + 1;
                        }
                        a();
                        return i21;
                    }
                }
            default:
                this.f13004e += i10;
                int i22 = 0;
                while (true) {
                    int i23 = this.f13004e;
                    int i24 = 2;
                    if (i23 > 8) {
                        int i25 = i23 - 8;
                        this.f13004e = i25;
                        byte[] bArr3 = this.f13001b;
                        int i26 = this.f13003d;
                        i22 |= (bArr3[i26] & 255) << i25;
                        if (!q(i26 + 1)) {
                            i24 = 1;
                        }
                        this.f13003d = i26 + i24;
                    } else {
                        byte[] bArr4 = this.f13001b;
                        int i27 = this.f13003d;
                        int i28 = (-1 >>> (32 - i10)) & (i22 | ((255 & bArr4[i27]) >> (8 - i23)));
                        if (i23 == 8) {
                            this.f13004e = 0;
                            if (q(i27 + 1)) {
                                i11 = 2;
                            }
                            this.f13003d = i27 + i11;
                        }
                        a();
                        return i28;
                    }
                }
        }
    }

    public void j(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f13001b;
            int i13 = this.f13002c;
            int i14 = i13 + 1;
            this.f13002c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f13003d;
            bArr[i10] = (byte) (b10 << i15);
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | bArr[i10]);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 != 0) {
            bArr[i12] = (byte) (bArr[i12] & (255 >> i16));
            int i17 = this.f13003d;
            if (i17 + i16 > 8) {
                byte b11 = bArr[i12];
                byte[] bArr3 = this.f13001b;
                int i18 = this.f13002c;
                this.f13002c = i18 + 1;
                bArr[i12] = (byte) (b11 | ((bArr3[i18] & 255) << i17));
                this.f13003d = i17 - 8;
            }
            int i19 = this.f13003d + i16;
            this.f13003d = i19;
            byte[] bArr4 = this.f13001b;
            int i20 = this.f13002c;
            bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
            if (i19 == 8) {
                this.f13003d = 0;
                this.f13002c = i20 + 1;
            }
            a();
        }
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.d(this.f13003d == 0);
        System.arraycopy(this.f13001b, this.f13002c, bArr, i10, i11);
        this.f13002c += i11;
        a();
    }

    public int l() {
        int i10 = 0;
        int i11 = 0;
        while (!h()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = i(i11);
        }
        return i12 + i10;
    }

    public int m() {
        int l10 = l();
        return ((l10 + 1) / 2) * (l10 % 2 == 0 ? -1 : 1);
    }

    public void n(byte[] bArr, int i10) {
        this.f13001b = bArr;
        this.f13002c = 0;
        this.f13003d = 0;
        this.f13004e = i10;
    }

    public void o(byte[] bArr, int i10, int i11) {
        this.f13001b = bArr;
        this.f13003d = i10;
        this.f13002c = i11;
        this.f13004e = 0;
        a();
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f13002c = i11;
        this.f13003d = i10 - (i11 * 8);
        a();
    }

    public boolean q(int i10) {
        if (2 <= i10 && i10 < this.f13002c) {
            byte[] bArr = this.f13001b;
            return bArr[i10] == 3 && bArr[i10 + -2] == 0 && bArr[i10 - 1] == 0;
        }
    }

    public void r() {
        int i10 = 1;
        switch (this.f13000a) {
            case 1:
                int i11 = this.f13003d + 1;
                this.f13003d = i11;
                if (i11 == 8) {
                    this.f13003d = 0;
                    this.f13002c++;
                }
                a();
                return;
            default:
                int i12 = this.f13004e + 1;
                this.f13004e = i12;
                if (i12 == 8) {
                    this.f13004e = 0;
                    int i13 = this.f13003d;
                    if (q(i13 + 1)) {
                        i10 = 2;
                    }
                    this.f13003d = i13 + i10;
                }
                a();
                return;
        }
    }

    public void s(int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = this.f13000a;
        boolean z10 = true;
        switch (i14) {
            case 0:
                int i15 = i10 / 8;
                int i16 = this.f13003d + i15;
                this.f13003d = i16;
                int i17 = (i10 - (i15 * 8)) + this.f13004e;
                this.f13004e = i17;
                if (i17 > 7) {
                    this.f13003d = i16 + 1;
                    this.f13004e = i17 - 8;
                }
                switch (i14) {
                    case 0:
                        int i18 = this.f13003d;
                        if (i18 < 0 || (i18 >= (i12 = this.f13002c) && !(i18 == i12 && this.f13004e == 0))) {
                            z10 = false;
                        }
                        a.d(z10);
                        return;
                    case 1:
                        int i19 = this.f13002c;
                        if (i19 < 0 || (i19 >= (i13 = this.f13004e) && !(i19 == i13 && this.f13003d == 0))) {
                            z10 = false;
                        }
                        a.d(z10);
                        return;
                    default:
                        int i20 = this.f13003d;
                        if (i20 < 0 || (i20 >= (i11 = this.f13002c) && !(i20 == i11 && this.f13004e == 0))) {
                            z10 = false;
                        }
                        a.d(z10);
                        return;
                }
            case 1:
                int i21 = i10 / 8;
                int i22 = this.f13002c + i21;
                this.f13002c = i22;
                int i23 = (i10 - (i21 * 8)) + this.f13003d;
                this.f13003d = i23;
                if (i23 > 7) {
                    this.f13002c = i22 + 1;
                    this.f13003d = i23 - 8;
                }
                a();
                return;
            default:
                int i24 = this.f13003d;
                int i25 = i10 / 8;
                int i26 = i24 + i25;
                this.f13003d = i26;
                int i27 = (i10 - (i25 * 8)) + this.f13004e;
                this.f13004e = i27;
                if (i27 > 7) {
                    this.f13003d = i26 + 1;
                    this.f13004e = i27 - 8;
                }
                while (true) {
                    i24++;
                    if (i24 > this.f13003d) {
                        a();
                        return;
                    } else if (q(i24)) {
                        this.f13003d++;
                        i24 += 2;
                    }
                }
        }
    }

    public void t(int i10) {
        a.d(this.f13003d == 0);
        this.f13002c += i10;
        a();
    }

    public b0(byte[] bArr, int i10, int i11) {
        this.f13000a = 2;
        this.f13001b = bArr;
        this.f13003d = i10;
        this.f13002c = i11;
        this.f13004e = 0;
        a();
    }

    public b0(byte[] bArr, int i10, e eVar) {
        this.f13000a = i10;
        if (i10 != 1) {
            this.f13001b = bArr;
            this.f13002c = bArr.length;
            return;
        }
        int length = bArr.length;
        this.f13000a = 1;
        this.f13001b = bArr;
        this.f13004e = length;
    }

    public b0(byte[] bArr, int i10) {
        this.f13000a = 1;
        this.f13001b = bArr;
        this.f13004e = i10;
    }
}
