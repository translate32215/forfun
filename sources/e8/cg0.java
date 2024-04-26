package e8;

import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cg0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14135a = 0;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f14136b;

    /* renamed from: c  reason: collision with root package name */
    public int f14137c;

    /* renamed from: d  reason: collision with root package name */
    public int f14138d;

    /* renamed from: e  reason: collision with root package name */
    public int f14139e;

    public cg0(byte[] bArr, int i10, int i11) {
        this.f14136b = bArr;
        this.f14138d = i10;
        this.f14137c = i11;
        this.f14139e = 0;
        g();
    }

    public final int a(int i10) {
        byte b10;
        byte b11;
        int i11;
        int i12;
        byte b12;
        byte b13;
        boolean z10 = true;
        int i13 = 0;
        switch (this.f14135a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                int i14 = i10 / 8;
                byte b14 = 0;
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = this.f14138d;
                    if (i16 != 0) {
                        byte[] bArr = this.f14136b;
                        int i17 = this.f14137c;
                        b13 = ((bArr[i17 + 1] & 255) >>> (8 - i16)) | ((bArr[i17] & 255) << i16);
                    } else {
                        b13 = this.f14136b[this.f14137c];
                    }
                    i10 -= 8;
                    b14 |= (b13 & 255) << i10;
                    this.f14137c++;
                }
                if (i10 > 0) {
                    int i18 = this.f14138d + i10;
                    byte b15 = (byte) (255 >> (8 - i10));
                    if (i18 > 8) {
                        byte[] bArr2 = this.f14136b;
                        int i19 = this.f14137c;
                        int i20 = i19 + 1;
                        b12 = (b15 & (((255 & bArr2[i20]) >> (16 - i18)) | ((bArr2[i19] & 255) << (i18 - 8)))) | b14;
                        this.f14137c = i20;
                    } else {
                        byte[] bArr3 = this.f14136b;
                        int i21 = this.f14137c;
                        b12 = (b15 & ((255 & bArr3[i21]) >> (8 - i18))) | b14;
                        if (i18 == 8) {
                            this.f14137c = i21 + 1;
                        }
                    }
                    b14 = b12;
                    this.f14138d = i18 % 8;
                }
                int i22 = this.f14137c;
                if (i22 < 0 || (i11 = this.f14138d) < 0 || i11 >= 8 || (i22 >= (i12 = this.f14139e) && !(i22 == i12 && i11 == 0))) {
                    z10 = false;
                }
                a.c(z10);
                return b14;
            default:
                if (i10 != 0) {
                    int i23 = i10 / 8;
                    byte b16 = 0;
                    while (i13 < i23) {
                        int i24 = c(this.f14138d + 1) ? this.f14138d + 2 : this.f14138d + 1;
                        int i25 = this.f14139e;
                        if (i25 != 0) {
                            byte[] bArr4 = this.f14136b;
                            b11 = ((bArr4[i24] & 255) >>> (8 - i25)) | ((bArr4[this.f14138d] & 255) << i25);
                        } else {
                            b11 = this.f14136b[this.f14138d];
                        }
                        i10 -= 8;
                        b16 |= (b11 & 255) << i10;
                        this.f14138d = i24;
                        i13++;
                    }
                    if (i10 > 0) {
                        int i26 = this.f14139e + i10;
                        byte b17 = (byte) (255 >> (8 - i10));
                        int i27 = c(this.f14138d + 1) ? this.f14138d + 2 : 1 + this.f14138d;
                        if (i26 > 8) {
                            byte[] bArr5 = this.f14136b;
                            b10 = (b17 & (((bArr5[i27] & 255) >> (16 - i26)) | ((bArr5[this.f14138d] & 255) << (i26 - 8)))) | b16;
                            this.f14138d = i27;
                        } else {
                            b10 = (b17 & ((this.f14136b[this.f14138d] & 255) >> (8 - i26))) | b16;
                            if (i26 == 8) {
                                this.f14138d = i27;
                            }
                        }
                        this.f14139e = i26 % 8;
                        i13 = b10;
                    } else {
                        i13 = b16;
                    }
                    g();
                }
                return i13;
        }
    }

    public void b(int i10) {
        int i11 = this.f14138d;
        int i12 = (i10 / 8) + i11;
        this.f14138d = i12;
        int i13 = (i10 % 8) + this.f14139e;
        this.f14139e = i13;
        if (i13 > 7) {
            this.f14138d = i12 + 1;
            this.f14139e = i13 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f14138d) {
                g();
                return;
            } else if (c(i11)) {
                this.f14138d++;
                i11 += 2;
            }
        }
    }

    public boolean c(int i10) {
        if (2 > i10 || i10 >= this.f14137c) {
            return false;
        }
        byte[] bArr = this.f14136b;
        return bArr[i10] == 3 && bArr[i10 + -2] == 0 && bArr[i10 - 1] == 0;
    }

    public boolean d() {
        return a(1) == 1;
    }

    public int e() {
        int f10 = f();
        return ((f10 + 1) / 2) * (f10 % 2 == 0 ? -1 : 1);
    }

    public int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = a(i11);
        }
        return i12 + i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f14139e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r2 = r3.f14137c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r3 = this;
            int r0 = r3.f14138d
            if (r0 < 0) goto L_0x0016
            int r1 = r3.f14139e
            if (r1 < 0) goto L_0x0016
            r2 = 8
            if (r1 >= r2) goto L_0x0016
            int r2 = r3.f14137c
            if (r0 < r2) goto L_0x0014
            if (r0 != r2) goto L_0x0016
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            o.a.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.cg0.g():void");
    }

    public cg0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public cg0(byte[] bArr, int i10) {
        this.f14136b = bArr;
        this.f14139e = i10;
    }
}
