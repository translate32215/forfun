package f;

/* compiled from: TwilightCalculator */
public class w {

    /* renamed from: d  reason: collision with root package name */
    public static w f17975d;

    /* renamed from: a  reason: collision with root package name */
    public long f17976a;

    /* renamed from: b  reason: collision with root package name */
    public long f17977b;

    /* renamed from: c  reason: collision with root package name */
    public int f17978c;

    public void a(long j10, double d10, double d11) {
        float f10 = ((float) (j10 - 946728000000L)) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d12 = (double) f11;
        Double.isNaN(d12);
        double sin = (Math.sin((double) (f11 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f11)) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double d14 = (double) (f10 - 9.0E-4f);
        Double.isNaN(d14);
        double round = (double) (((float) Math.round(d14 - d13)) + 9.0E-4f);
        Double.isNaN(round);
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d12) * 0.0053d) + round + d13;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d15 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d15))) / (Math.cos(asin) * Math.cos(d15));
        if (sin3 >= 1.0d) {
            this.f17978c = 1;
            this.f17976a = -1;
            this.f17977b = -1;
        } else if (sin3 <= -1.0d) {
            this.f17978c = 0;
            this.f17976a = -1;
            this.f17977b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            Double.isNaN(acos);
            this.f17976a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f17977b = round2;
            if (round2 >= j10 || this.f17976a <= j10) {
                this.f17978c = 1;
            } else {
                this.f17978c = 0;
            }
        }
    }
}
