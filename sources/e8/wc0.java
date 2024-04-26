package e8;

import java.util.Arrays;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wc0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f17240a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17241b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17242c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17243d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17244e;

    /* renamed from: f  reason: collision with root package name */
    public final short[] f17245f;

    /* renamed from: g  reason: collision with root package name */
    public int f17246g;

    /* renamed from: h  reason: collision with root package name */
    public short[] f17247h;

    /* renamed from: i  reason: collision with root package name */
    public int f17248i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f17249j;

    /* renamed from: k  reason: collision with root package name */
    public int f17250k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f17251l;

    /* renamed from: m  reason: collision with root package name */
    public int f17252m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f17253n = 0;

    /* renamed from: o  reason: collision with root package name */
    public float f17254o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f17255p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public int f17256q;

    /* renamed from: r  reason: collision with root package name */
    public int f17257r;

    /* renamed from: s  reason: collision with root package name */
    public int f17258s;

    /* renamed from: t  reason: collision with root package name */
    public int f17259t;

    /* renamed from: u  reason: collision with root package name */
    public int f17260u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f17261v;

    /* renamed from: w  reason: collision with root package name */
    public int f17262w;

    /* renamed from: x  reason: collision with root package name */
    public int f17263x;

    public wc0(int i10, int i11) {
        this.f17240a = i10;
        this.f17241b = i11;
        this.f17242c = i10 / 400;
        int i12 = i10 / 65;
        this.f17243d = i12;
        int i13 = i12 * 2;
        this.f17244e = i13;
        this.f17245f = new short[i13];
        this.f17246g = i13;
        this.f17247h = new short[(i13 * i11)];
        this.f17248i = i13;
        this.f17249j = new short[(i13 * i11)];
        this.f17250k = i13;
        this.f17251l = new short[(i13 * i11)];
    }

    public static void b(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f17241b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
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
        this.f17262w = i14 / i16;
        this.f17263x = i17 / i15;
        return i16;
    }

    public final void c(short[] sArr, int i10, int i11) {
        f(i11);
        int i12 = this.f17241b;
        System.arraycopy(sArr, i10 * i12, this.f17249j, this.f17257r * i12, i12 * i11);
        this.f17257r += i11;
    }

    public final void d(short[] sArr, int i10, int i11) {
        int i12 = this.f17244e / i11;
        int i13 = this.f17241b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f17245f[i16] = (short) (i17 / i14);
        }
    }

    public final void e() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f17257r;
        float f10 = this.f17254o / this.f17255p;
        double d10 = (double) f10;
        int i17 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i18 = this.f17256q;
            if (i18 >= this.f17244e) {
                int i19 = 0;
                while (true) {
                    int i20 = this.f17259t;
                    if (i20 > 0) {
                        int min = Math.min(this.f17244e, i20);
                        c(this.f17247h, i19, min);
                        this.f17259t -= min;
                        i19 += min;
                    } else {
                        short[] sArr = this.f17247h;
                        int i21 = this.f17240a;
                        int i22 = i21 > 4000 ? i21 / 4000 : 1;
                        if (this.f17241b == i17 && i22 == i17) {
                            i13 = a(sArr, i19, this.f17242c, this.f17243d);
                        } else {
                            d(sArr, i19, i22);
                            int a10 = a(this.f17245f, 0, this.f17242c / i22, this.f17243d / i22);
                            if (i22 != i17) {
                                int i23 = a10 * i22;
                                int i24 = i22 << 2;
                                int i25 = i23 - i24;
                                int i26 = i23 + i24;
                                int i27 = this.f17242c;
                                if (i25 < i27) {
                                    i25 = i27;
                                }
                                int i28 = this.f17243d;
                                if (i26 > i28) {
                                    i26 = i28;
                                }
                                if (this.f17241b == i17) {
                                    i13 = a(sArr, i19, i25, i26);
                                } else {
                                    d(sArr, i19, i17);
                                    i13 = a(this.f17245f, 0, i25, i26);
                                }
                            } else {
                                i13 = a10;
                            }
                        }
                        int i29 = this.f17262w;
                        int i30 = i29 != 0 && this.f17260u != 0 && this.f17263x <= i29 * 3 && (i29 << 1) > this.f17261v * 3 ? this.f17260u : i13;
                        this.f17261v = i29;
                        this.f17260u = i13;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.f17247h;
                            if (f10 >= 2.0f) {
                                i15 = (int) (((float) i30) / (f10 - 1.0f));
                            } else {
                                this.f17259t = (int) (((2.0f - f10) * ((float) i30)) / (f10 - 1.0f));
                                i15 = i30;
                            }
                            f(i15);
                            int i31 = i15;
                            b(i15, this.f17241b, this.f17249j, this.f17257r, sArr2, i19, sArr2, i19 + i30);
                            this.f17257r += i31;
                            i19 = i30 + i31 + i19;
                        } else {
                            int i32 = i30;
                            short[] sArr3 = this.f17247h;
                            if (f10 < 0.5f) {
                                i14 = (int) ((((float) i32) * f10) / (1.0f - f10));
                            } else {
                                this.f17259t = (int) ((((2.0f * f10) - 1.0f) * ((float) i32)) / (1.0f - f10));
                                i14 = i32;
                            }
                            int i33 = i32 + i14;
                            f(i33);
                            int i34 = this.f17241b;
                            System.arraycopy(sArr3, i19 * i34, this.f17249j, this.f17257r * i34, i34 * i32);
                            b(i14, this.f17241b, this.f17249j, this.f17257r + i32, sArr3, i32 + i19, sArr3, i19);
                            this.f17257r += i33;
                            i19 += i14;
                        }
                    }
                    if (this.f17244e + i19 > i18) {
                        break;
                    }
                    i17 = 1;
                }
                int i35 = this.f17256q - i19;
                short[] sArr4 = this.f17247h;
                int i36 = this.f17241b;
                System.arraycopy(sArr4, i19 * i36, sArr4, 0, i36 * i35);
                this.f17256q = i35;
            }
        } else {
            c(this.f17247h, 0, this.f17256q);
            this.f17256q = 0;
        }
        float f11 = this.f17255p;
        if (f11 != 1.0f && this.f17257r != i16) {
            int i37 = this.f17240a;
            int i38 = (int) (((float) i37) / f11);
            while (true) {
                if (i38 <= 16384 && i37 <= 16384) {
                    break;
                }
                i38 /= 2;
                i37 /= 2;
            }
            int i39 = this.f17257r - i16;
            int i40 = this.f17258s + i39;
            int i41 = this.f17250k;
            if (i40 > i41) {
                int i42 = (i41 / 2) + i39 + i41;
                this.f17250k = i42;
                this.f17251l = Arrays.copyOf(this.f17251l, i42 * this.f17241b);
            }
            short[] sArr5 = this.f17249j;
            int i43 = this.f17241b;
            System.arraycopy(sArr5, i16 * i43, this.f17251l, this.f17258s * i43, i43 * i39);
            this.f17257r = i16;
            this.f17258s += i39;
            int i44 = 0;
            while (true) {
                i10 = this.f17258s;
                if (i44 >= i10 - 1) {
                    break;
                }
                while (true) {
                    i11 = this.f17252m;
                    int i45 = (i11 + 1) * i38;
                    i12 = this.f17253n;
                    if (i45 <= i12 * i37) {
                        break;
                    }
                    f(1);
                    int i46 = 0;
                    while (true) {
                        int i47 = this.f17241b;
                        if (i46 >= i47) {
                            break;
                        }
                        short[] sArr6 = this.f17251l;
                        int i48 = (i44 * i47) + i46;
                        short s10 = sArr6[i48];
                        short s11 = sArr6[i48 + i47];
                        int i49 = this.f17252m;
                        int i50 = i49 * i38;
                        int i51 = (i49 + 1) * i38;
                        int i52 = i51 - (this.f17253n * i37);
                        int i53 = i51 - i50;
                        this.f17249j[(this.f17257r * i47) + i46] = (short) ((((i53 - i52) * s11) + (s10 * i52)) / i53);
                        i46++;
                    }
                    this.f17253n++;
                    this.f17257r++;
                }
                int i54 = i11 + 1;
                this.f17252m = i54;
                if (i54 == i37) {
                    this.f17252m = 0;
                    a.c(i12 == i38);
                    this.f17253n = 0;
                }
                i44++;
            }
            int i55 = i10 - 1;
            if (i55 != 0) {
                short[] sArr7 = this.f17251l;
                int i56 = this.f17241b;
                System.arraycopy(sArr7, i55 * i56, sArr7, 0, (i10 - i55) * i56);
                this.f17258s -= i55;
            }
        }
    }

    public final void f(int i10) {
        int i11 = this.f17257r + i10;
        int i12 = this.f17248i;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f17248i = i13;
            this.f17249j = Arrays.copyOf(this.f17249j, i13 * this.f17241b);
        }
    }

    public final void g(int i10) {
        int i11 = this.f17256q + i10;
        int i12 = this.f17246g;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f17246g = i13;
            this.f17247h = Arrays.copyOf(this.f17247h, i13 * this.f17241b);
        }
    }
}
