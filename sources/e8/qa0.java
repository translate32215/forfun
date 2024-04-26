package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qa0 {

    /* renamed from: j  reason: collision with root package name */
    public static final qa0 f16106j = new qa0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k  reason: collision with root package name */
    public static final qa0 f16107k = new qa0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l  reason: collision with root package name */
    public static final qa0 f16108l = new qa0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m  reason: collision with root package name */
    public static final qa0 f16109m = new qa0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    public final double f16110a;

    /* renamed from: b  reason: collision with root package name */
    public final double f16111b;

    /* renamed from: c  reason: collision with root package name */
    public final double f16112c;

    /* renamed from: d  reason: collision with root package name */
    public final double f16113d;

    /* renamed from: e  reason: collision with root package name */
    public final double f16114e;

    /* renamed from: f  reason: collision with root package name */
    public final double f16115f;

    /* renamed from: g  reason: collision with root package name */
    public final double f16116g;

    /* renamed from: h  reason: collision with root package name */
    public final double f16117h;

    /* renamed from: i  reason: collision with root package name */
    public final double f16118i;

    public qa0(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f16110a = d14;
        this.f16111b = d15;
        this.f16112c = d16;
        this.f16113d = d10;
        this.f16114e = d11;
        this.f16115f = d12;
        this.f16116g = d13;
        this.f16117h = d17;
        this.f16118i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qa0.class != obj.getClass()) {
            return false;
        }
        qa0 qa0 = (qa0) obj;
        return Double.compare(qa0.f16113d, this.f16113d) == 0 && Double.compare(qa0.f16114e, this.f16114e) == 0 && Double.compare(qa0.f16115f, this.f16115f) == 0 && Double.compare(qa0.f16116g, this.f16116g) == 0 && Double.compare(qa0.f16117h, this.f16117h) == 0 && Double.compare(qa0.f16118i, this.f16118i) == 0 && Double.compare(qa0.f16110a, this.f16110a) == 0 && Double.compare(qa0.f16111b, this.f16111b) == 0 && Double.compare(qa0.f16112c, this.f16112c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f16110a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f16111b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f16112c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f16113d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f16114e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f16115f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f16116g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f16117h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f16118i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f16106j)) {
            return "Rotate 0°";
        }
        if (equals(f16107k)) {
            return "Rotate 90°";
        }
        if (equals(f16108l)) {
            return "Rotate 180°";
        }
        if (equals(f16109m)) {
            return "Rotate 270°";
        }
        double d10 = this.f16110a;
        double d11 = this.f16111b;
        double d12 = this.f16112c;
        double d13 = this.f16113d;
        double d14 = this.f16114e;
        double d15 = this.f16115f;
        double d16 = this.f16116g;
        double d17 = this.f16117h;
        double d18 = this.f16118i;
        double d19 = d16;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d10);
        sb2.append(", v=");
        sb2.append(d11);
        sb2.append(", w=");
        sb2.append(d12);
        sb2.append(", a=");
        sb2.append(d13);
        sb2.append(", b=");
        sb2.append(d14);
        sb2.append(", c=");
        sb2.append(d15);
        sb2.append(", d=");
        sb2.append(d19);
        sb2.append(", tx=");
        sb2.append(d17);
        sb2.append(", ty=");
        sb2.append(d18);
        sb2.append("}");
        return sb2.toString();
    }
}
