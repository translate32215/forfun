package f0;

import android.graphics.Color;

/* compiled from: CamColor */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f18019a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18020b;

    /* renamed from: c  reason: collision with root package name */
    public final float f18021c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18022d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18023e;

    /* renamed from: f  reason: collision with root package name */
    public final float f18024f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f18019a = f10;
        this.f18020b = f11;
        this.f18021c = f12;
        this.f18022d = f16;
        this.f18023e = f17;
        this.f18024f = f18;
    }

    public static a a(int i10) {
        n nVar = n.f18063k;
        float b10 = b.b(Color.red(i10));
        float b11 = b.b(Color.green(i10));
        float b12 = b.b(Color.blue(i10));
        float[][] fArr = b.f18028d;
        float[] fArr2 = {(fArr[0][2] * b12) + (fArr[0][1] * b11) + (fArr[0][0] * b10), (fArr[1][2] * b12) + (fArr[1][1] * b11) + (fArr[1][0] * b10), (b12 * fArr[2][2]) + (b11 * fArr[2][1]) + (b10 * fArr[2][0])};
        float[][] fArr3 = b.f18025a;
        float f10 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f11 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f12 = fArr2[0] * fArr3[2][0];
        float f13 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = nVar.f18070g;
        float f14 = fArr4[0] * f10;
        float f15 = fArr4[1] * f11;
        float f16 = fArr4[2] * (f13 + (fArr2[1] * fArr3[2][1]) + f12);
        double abs = (double) (Math.abs(f14) * nVar.f18071h);
        Double.isNaN(abs);
        Double.isNaN(abs);
        float pow = (float) Math.pow(abs / 100.0d, 0.42d);
        double abs2 = (double) (Math.abs(f15) * nVar.f18071h);
        Double.isNaN(abs2);
        Double.isNaN(abs2);
        float pow2 = (float) Math.pow(abs2 / 100.0d, 0.42d);
        double abs3 = (double) (Math.abs(f16) * nVar.f18071h);
        Double.isNaN(abs3);
        Double.isNaN(abs3);
        float pow3 = (float) Math.pow(abs3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum;
        Double.isNaN(d10);
        Double.isNaN(d10);
        double d11 = (double) signum2;
        Double.isNaN(d11);
        Double.isNaN(d11);
        double d12 = (double) signum3;
        Double.isNaN(d12);
        Double.isNaN(d12);
        float f17 = ((float) (((d11 * -12.0d) + (d10 * 11.0d)) + d12)) / 11.0f;
        double d13 = (double) (signum + signum2);
        Double.isNaN(d12);
        Double.isNaN(d12);
        Double.isNaN(d13);
        Double.isNaN(d13);
        float f18 = ((float) (d13 - (d12 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f18, (double) f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f21 * nVar.f18065b) / nVar.f18064a), (double) (nVar.f18067d * nVar.f18073j))) * 100.0f;
        float sqrt = (nVar.f18064a + 4.0f) * (4.0f / nVar.f18067d) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * nVar.f18072i;
        double d14 = (double) (((double) f22) < 20.14d ? 360.0f + f22 : f22);
        Double.isNaN(d14);
        Double.isNaN(d14);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) nVar.f18069f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((d14 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.f18068e) * nVar.f18066c) * ((float) Math.sqrt((double) ((f18 * f18) + (f17 * f17))))) / (f20 + 0.305f)), 0.9d));
        double d15 = (double) pow4;
        Double.isNaN(d15);
        Double.isNaN(d15);
        float sqrt2 = pow5 * ((float) Math.sqrt(d15 / 100.0d));
        float f24 = sqrt2 * nVar.f18072i;
        float sqrt3 = ((float) Math.sqrt((double) ((pow5 * nVar.f18067d) / (nVar.f18064a + 4.0f)))) * 50.0f;
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * f24) + 1.0f))) * 43.85965f;
        double d16 = (double) f23;
        return new a(f22, sqrt2, pow4, sqrt, f24, sqrt3, f25, log * ((float) Math.cos(d16)), log * ((float) Math.sin(d16)));
    }

    public static a b(float f10, float f11, float f12) {
        float f13 = f10;
        n nVar = n.f18063k;
        double d10 = (double) f13;
        Double.isNaN(d10);
        Double.isNaN(d10);
        double d11 = d10 / 100.0d;
        float sqrt = (nVar.f18064a + 4.0f) * (4.0f / nVar.f18067d) * ((float) Math.sqrt(d11));
        float f14 = nVar.f18072i;
        float f15 = sqrt * f14;
        float f16 = f11 * f14;
        float sqrt2 = ((float) Math.sqrt((double) (((f11 / ((float) Math.sqrt(d11))) * nVar.f18067d) / (nVar.f18064a + 4.0f)))) * 50.0f;
        float f17 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        double d12 = (double) f16;
        Double.isNaN(d12);
        Double.isNaN(d12);
        float log = ((float) Math.log((d12 * 0.0228d) + 1.0d)) * 43.85965f;
        double d13 = (double) ((3.1415927f * f12) / 180.0f);
        return new a(f12, f11, f10, f15, f16, sqrt2, f17, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    public int c(n nVar) {
        float f10;
        n nVar2 = nVar;
        float f11 = this.f18020b;
        if (((double) f11) != 0.0d) {
            double d10 = (double) this.f18021c;
            if (d10 != 0.0d) {
                Double.isNaN(d10);
                Double.isNaN(d10);
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                double d11 = (double) f10;
                double pow = Math.pow(1.64d - Math.pow(0.29d, (double) nVar2.f18069f), 0.73d);
                Double.isNaN(d11);
                Double.isNaN(d11);
                float pow2 = (float) Math.pow(d11 / pow, 1.1111111111111112d);
                double d12 = (double) ((this.f18019a * 3.1415927f) / 180.0f);
                Double.isNaN(d12);
                Double.isNaN(d12);
                float f12 = nVar2.f18064a;
                double d13 = (double) this.f18021c;
                Double.isNaN(d13);
                Double.isNaN(d13);
                double d14 = (double) nVar2.f18067d;
                Double.isNaN(d14);
                Double.isNaN(d14);
                double d15 = 1.0d / d14;
                double d16 = (double) nVar2.f18073j;
                Double.isNaN(d16);
                Double.isNaN(d16);
                float pow3 = f12 * ((float) Math.pow(d13 / 100.0d, d15 / d16));
                float cos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f * 3846.1538f * nVar2.f18068e * nVar2.f18066c;
                float f13 = pow3 / nVar2.f18065b;
                float sin = (float) Math.sin(d12);
                float cos2 = (float) Math.cos(d12);
                float f14 = 11.0f * pow2 * cos2;
                float f15 = (((0.305f + f13) * 23.0f) * pow2) / (((pow2 * 108.0f) * sin) + (f14 + (cos * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f13 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                double abs = (double) Math.abs(f19);
                Double.isNaN(abs);
                Double.isNaN(abs);
                double abs2 = (double) Math.abs(f19);
                Double.isNaN(abs2);
                Double.isNaN(abs2);
                float signum = (100.0f / nVar2.f18071h) * Math.signum(f19) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs * 27.13d) / (400.0d - abs2))), 2.380952380952381d));
                double abs3 = (double) Math.abs(f20);
                Double.isNaN(abs3);
                Double.isNaN(abs3);
                double abs4 = (double) Math.abs(f20);
                Double.isNaN(abs4);
                Double.isNaN(abs4);
                float signum2 = (100.0f / nVar2.f18071h) * Math.signum(f20) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs3 * 27.13d) / (400.0d - abs4))), 2.380952380952381d));
                double abs5 = (double) Math.abs(f21);
                Double.isNaN(abs5);
                Double.isNaN(abs5);
                double abs6 = (double) Math.abs(f21);
                Double.isNaN(abs6);
                Double.isNaN(abs6);
                float signum3 = Math.signum(f21);
                float[] fArr = nVar2.f18070g;
                float f22 = signum / fArr[0];
                float f23 = signum2 / fArr[1];
                float pow4 = (((100.0f / nVar2.f18071h) * signum3) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs5 * 27.13d) / (400.0d - abs6))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.f18026b;
                float f24 = (fArr2[0][2] * pow4) + (fArr2[0][1] * f23) + (fArr2[0][0] * f22);
                float f25 = (fArr2[1][2] * pow4) + (fArr2[1][1] * f23) + (fArr2[1][0] * f22);
                float f26 = f22 * fArr2[2][0];
                return g0.a.a((double) f24, (double) f25, (double) ((pow4 * fArr2[2][2]) + (f23 * fArr2[2][1]) + f26));
            }
        }
        f10 = 0.0f;
        double d112 = (double) f10;
        double pow5 = Math.pow(1.64d - Math.pow(0.29d, (double) nVar2.f18069f), 0.73d);
        Double.isNaN(d112);
        Double.isNaN(d112);
        float pow22 = (float) Math.pow(d112 / pow5, 1.1111111111111112d);
        double d122 = (double) ((this.f18019a * 3.1415927f) / 180.0f);
        Double.isNaN(d122);
        Double.isNaN(d122);
        float f122 = nVar2.f18064a;
        double d132 = (double) this.f18021c;
        Double.isNaN(d132);
        Double.isNaN(d132);
        double d142 = (double) nVar2.f18067d;
        Double.isNaN(d142);
        Double.isNaN(d142);
        double d152 = 1.0d / d142;
        double d162 = (double) nVar2.f18073j;
        Double.isNaN(d162);
        Double.isNaN(d162);
        float pow32 = f122 * ((float) Math.pow(d132 / 100.0d, d152 / d162));
        float cos3 = ((float) (Math.cos(2.0d + d122) + 3.8d)) * 0.25f * 3846.1538f * nVar2.f18068e * nVar2.f18066c;
        float f132 = pow32 / nVar2.f18065b;
        float sin2 = (float) Math.sin(d122);
        float cos22 = (float) Math.cos(d122);
        float f142 = 11.0f * pow22 * cos22;
        float f152 = (((0.305f + f132) * 23.0f) * pow22) / (((pow22 * 108.0f) * sin2) + (f142 + (cos3 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f132 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        double abs7 = (double) Math.abs(f192);
        Double.isNaN(abs7);
        Double.isNaN(abs7);
        double abs22 = (double) Math.abs(f192);
        Double.isNaN(abs22);
        Double.isNaN(abs22);
        float signum4 = (100.0f / nVar2.f18071h) * Math.signum(f192) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs7 * 27.13d) / (400.0d - abs22))), 2.380952380952381d));
        double abs32 = (double) Math.abs(f202);
        Double.isNaN(abs32);
        Double.isNaN(abs32);
        double abs42 = (double) Math.abs(f202);
        Double.isNaN(abs42);
        Double.isNaN(abs42);
        float signum22 = (100.0f / nVar2.f18071h) * Math.signum(f202) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs32 * 27.13d) / (400.0d - abs42))), 2.380952380952381d));
        double abs52 = (double) Math.abs(f212);
        Double.isNaN(abs52);
        Double.isNaN(abs52);
        double abs62 = (double) Math.abs(f212);
        Double.isNaN(abs62);
        Double.isNaN(abs62);
        float signum32 = Math.signum(f212);
        float[] fArr3 = nVar2.f18070g;
        float f222 = signum4 / fArr3[0];
        float f232 = signum22 / fArr3[1];
        float pow42 = (((100.0f / nVar2.f18071h) * signum32) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs52 * 27.13d) / (400.0d - abs62))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = b.f18026b;
        float f242 = (fArr22[0][2] * pow42) + (fArr22[0][1] * f232) + (fArr22[0][0] * f222);
        float f252 = (fArr22[1][2] * pow42) + (fArr22[1][1] * f232) + (fArr22[1][0] * f222);
        float f262 = f222 * fArr22[2][0];
        return g0.a.a((double) f242, (double) f252, (double) ((pow42 * fArr22[2][2]) + (f232 * fArr22[2][1]) + f262));
    }
}
