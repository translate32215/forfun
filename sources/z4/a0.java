package z4;

import java.util.Arrays;
import v6.a;

/* compiled from: Sonic */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f28283a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28284b;

    /* renamed from: c  reason: collision with root package name */
    public final float f28285c;

    /* renamed from: d  reason: collision with root package name */
    public final float f28286d;

    /* renamed from: e  reason: collision with root package name */
    public final float f28287e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28288f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28289g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28290h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f28291i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f28292j;

    /* renamed from: k  reason: collision with root package name */
    public int f28293k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f28294l;

    /* renamed from: m  reason: collision with root package name */
    public int f28295m;

    /* renamed from: n  reason: collision with root package name */
    public short[] f28296n;

    /* renamed from: o  reason: collision with root package name */
    public int f28297o;

    /* renamed from: p  reason: collision with root package name */
    public int f28298p;

    /* renamed from: q  reason: collision with root package name */
    public int f28299q;

    /* renamed from: r  reason: collision with root package name */
    public int f28300r;

    /* renamed from: s  reason: collision with root package name */
    public int f28301s;

    /* renamed from: t  reason: collision with root package name */
    public int f28302t;

    /* renamed from: u  reason: collision with root package name */
    public int f28303u;

    /* renamed from: v  reason: collision with root package name */
    public int f28304v;

    public a0(int i10, int i11, float f10, float f11, int i12) {
        this.f28283a = i10;
        this.f28284b = i11;
        this.f28285c = f10;
        this.f28286d = f11;
        this.f28287e = ((float) i10) / ((float) i12);
        this.f28288f = i10 / 400;
        int i13 = i10 / 65;
        this.f28289g = i13;
        int i14 = i13 * 2;
        this.f28290h = i14;
        this.f28291i = new short[i14];
        this.f28292j = new short[(i14 * i11)];
        this.f28294l = new short[(i14 * i11)];
        this.f28296n = new short[(i14 * i11)];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] c10 = c(this.f28294l, this.f28295m, i11);
        this.f28294l = c10;
        int i12 = this.f28284b;
        System.arraycopy(sArr, i10 * i12, c10, this.f28295m * i12, i12 * i11);
        this.f28295m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f28290h / i11;
        int i13 = this.f28284b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f28291i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f28284b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f28284b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f28303u = i14 / i16;
        this.f28304v = i17 / i15;
        return i16;
    }

    public final void f() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f28295m;
        float f10 = this.f28285c;
        float f11 = this.f28286d;
        float f12 = f10 / f11;
        float f13 = this.f28287e * f11;
        double d10 = (double) f12;
        float f14 = 1.0f;
        int i18 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i19 = this.f28293k;
            if (i19 >= this.f28290h) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f28300r;
                    if (i21 > 0) {
                        int min = Math.min(this.f28290h, i21);
                        a(this.f28292j, i20, min);
                        this.f28300r -= min;
                        i20 += min;
                    } else {
                        short[] sArr = this.f28292j;
                        int i22 = this.f28283a;
                        int i23 = i22 > 4000 ? i22 / 4000 : 1;
                        if (this.f28284b == i18 && i23 == i18) {
                            i14 = d(sArr, i20, this.f28288f, this.f28289g);
                        } else {
                            b(sArr, i20, i23);
                            int d11 = d(this.f28291i, 0, this.f28288f / i23, this.f28289g / i23);
                            if (i23 != i18) {
                                int i24 = d11 * i23;
                                int i25 = i23 * 4;
                                int i26 = i24 - i25;
                                int i27 = i24 + i25;
                                int i28 = this.f28288f;
                                if (i26 < i28) {
                                    i26 = i28;
                                }
                                int i29 = this.f28289g;
                                if (i27 > i29) {
                                    i27 = i29;
                                }
                                if (this.f28284b == i18) {
                                    i14 = d(sArr, i20, i26, i27);
                                } else {
                                    b(sArr, i20, i18);
                                    i14 = d(this.f28291i, 0, i26, i27);
                                }
                            } else {
                                i14 = d11;
                            }
                        }
                        int i30 = this.f28303u;
                        int i31 = i30 != 0 && this.f28301s != 0 && this.f28304v <= i30 * 3 && i30 * 2 > this.f28302t * 3 ? this.f28301s : i14;
                        this.f28302t = i30;
                        this.f28301s = i14;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.f28292j;
                            if (f12 >= 2.0f) {
                                i16 = (int) (((float) i31) / (f12 - f14));
                            } else {
                                this.f28300r = (int) (((2.0f - f12) * ((float) i31)) / (f12 - f14));
                                i16 = i31;
                            }
                            short[] c10 = c(this.f28294l, this.f28295m, i16);
                            this.f28294l = c10;
                            int i32 = i16;
                            short[] sArr3 = sArr2;
                            e(i16, this.f28284b, c10, this.f28295m, sArr3, i20, sArr3, i20 + i31);
                            this.f28295m += i32;
                            i20 = i31 + i32 + i20;
                        } else {
                            int i33 = i31;
                            short[] sArr4 = this.f28292j;
                            if (f12 < 0.5f) {
                                i15 = (int) ((((float) i33) * f12) / (f14 - f12));
                            } else {
                                this.f28300r = (int) ((((2.0f * f12) - f14) * ((float) i33)) / (f14 - f12));
                                i15 = i33;
                            }
                            int i34 = i33 + i15;
                            short[] c11 = c(this.f28294l, this.f28295m, i34);
                            this.f28294l = c11;
                            int i35 = this.f28284b;
                            System.arraycopy(sArr4, i20 * i35, c11, this.f28295m * i35, i35 * i33);
                            e(i15, this.f28284b, this.f28294l, this.f28295m + i33, sArr4, i20 + i33, sArr4, i20);
                            this.f28295m += i34;
                            i20 += i15;
                        }
                    }
                    if (this.f28290h + i20 > i19) {
                        break;
                    }
                    f14 = 1.0f;
                    i18 = 1;
                }
                int i36 = this.f28293k - i20;
                short[] sArr5 = this.f28292j;
                int i37 = this.f28284b;
                System.arraycopy(sArr5, i20 * i37, sArr5, 0, i37 * i36);
                this.f28293k = i36;
            }
            f14 = 1.0f;
        } else {
            a(this.f28292j, 0, this.f28293k);
            this.f28293k = 0;
        }
        if (f13 != f14 && this.f28295m != i17) {
            int i38 = this.f28283a;
            int i39 = (int) (((float) i38) / f13);
            while (true) {
                if (i39 <= 16384 && i38 <= 16384) {
                    break;
                }
                i39 /= 2;
                i38 /= 2;
            }
            int i40 = this.f28295m - i17;
            short[] c12 = c(this.f28296n, this.f28297o, i40);
            this.f28296n = c12;
            short[] sArr6 = this.f28294l;
            int i41 = this.f28284b;
            System.arraycopy(sArr6, i17 * i41, c12, this.f28297o * i41, i41 * i40);
            this.f28295m = i17;
            this.f28297o += i40;
            int i42 = 0;
            while (true) {
                i10 = this.f28297o;
                i11 = i10 - 1;
                if (i42 >= i11) {
                    break;
                }
                while (true) {
                    i12 = this.f28298p + 1;
                    int i43 = i12 * i39;
                    i13 = this.f28299q;
                    if (i43 <= i13 * i38) {
                        break;
                    }
                    this.f28294l = c(this.f28294l, this.f28295m, 1);
                    int i44 = 0;
                    while (true) {
                        int i45 = this.f28284b;
                        if (i44 >= i45) {
                            break;
                        }
                        short[] sArr7 = this.f28296n;
                        int i46 = (i42 * i45) + i44;
                        short s10 = sArr7[i46];
                        short s11 = sArr7[i46 + i45];
                        int i47 = this.f28298p;
                        int i48 = i47 * i39;
                        int i49 = (i47 + 1) * i39;
                        int i50 = i49 - (this.f28299q * i38);
                        int i51 = i49 - i48;
                        this.f28294l[(this.f28295m * i45) + i44] = (short) ((((i51 - i50) * s11) + (s10 * i50)) / i51);
                        i44++;
                    }
                    this.f28299q++;
                    this.f28295m++;
                }
                this.f28298p = i12;
                if (i12 == i38) {
                    this.f28298p = 0;
                    a.d(i13 == i39);
                    this.f28299q = 0;
                }
                i42++;
            }
            if (i11 != 0) {
                short[] sArr8 = this.f28296n;
                int i52 = this.f28284b;
                System.arraycopy(sArr8, i11 * i52, sArr8, 0, (i10 - i11) * i52);
                this.f28297o -= i11;
            }
        }
    }
}
