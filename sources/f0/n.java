package f0;

/* compiled from: ViewingConditions */
public final class n {

    /* renamed from: k  reason: collision with root package name */
    public static final n f18063k;

    /* renamed from: a  reason: collision with root package name */
    public final float f18064a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18065b;

    /* renamed from: c  reason: collision with root package name */
    public final float f18066c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18067d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18068e;

    /* renamed from: f  reason: collision with root package name */
    public final float f18069f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f18070g;

    /* renamed from: h  reason: collision with root package name */
    public final float f18071h;

    /* renamed from: i  reason: collision with root package name */
    public final float f18072i;

    /* renamed from: j  reason: collision with root package name */
    public final float f18073j;

    static {
        float[] fArr = b.f18027c;
        double c10 = (double) b.c(50.0f);
        Double.isNaN(c10);
        float f10 = (float) ((c10 * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f18025a;
        float f11 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f12 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f13 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f14 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp((double) (((-f10) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d10 = (double) exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp};
        float f15 = 1.0f / ((5.0f * f10) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        double d11 = (double) f10;
        Double.isNaN(d11);
        Double.isNaN(d11);
        float cbrt = (0.1f * f17 * f17 * ((float) Math.cbrt(d11 * 5.0d))) + (f16 * f10);
        float c11 = b.c(50.0f) / fArr[1];
        double d12 = (double) c11;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        double d13 = (double) (fArr3[0] * cbrt * f11);
        Double.isNaN(d13);
        Double.isNaN(d13);
        double d14 = (double) (fArr3[1] * cbrt * f12);
        Double.isNaN(d14);
        Double.isNaN(d14);
        float f18 = cbrt;
        double d15 = (double) (fArr3[2] * cbrt * f13);
        Double.isNaN(d15);
        Double.isNaN(d15);
        float[] fArr4 = {(float) Math.pow(d13 / 100.0d, 0.42d), (float) Math.pow(d14 / 100.0d, 0.42d), (float) Math.pow(d15 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f18063k = new n(c11, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f14, 1.0f, fArr3, f18, (float) Math.pow((double) f18, 0.25d), ((float) Math.sqrt(d12)) + 1.48f);
    }

    public n(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f18069f = f10;
        this.f18064a = f11;
        this.f18065b = f12;
        this.f18066c = f13;
        this.f18067d = f14;
        this.f18068e = f15;
        this.f18070g = fArr;
        this.f18071h = f16;
        this.f18072i = f17;
        this.f18073j = f18;
    }
}
