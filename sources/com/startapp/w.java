package com.startapp;

/* compiled from: Sta */
public class w implements dc {

    /* renamed from: a  reason: collision with root package name */
    public final double f12713a;

    /* renamed from: b  reason: collision with root package name */
    public final double f12714b;

    /* renamed from: c  reason: collision with root package name */
    public final double f12715c;

    /* renamed from: d  reason: collision with root package name */
    public final double f12716d;

    /* renamed from: e  reason: collision with root package name */
    public final double f12717e;

    /* renamed from: f  reason: collision with root package name */
    public final double f12718f;

    /* renamed from: g  reason: collision with root package name */
    public double f12719g;

    /* renamed from: h  reason: collision with root package name */
    public long f12720h;

    /* renamed from: i  reason: collision with root package name */
    public double f12721i;

    public w(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 + d11;
        this.f12713a = d10 / d15;
        this.f12714b = d11 / d15;
        this.f12715c = d12;
        this.f12716d = d13;
        this.f12717e = d14;
        this.f12718f = xb.a(0.0d, d13, d14);
    }

    public static double a(long j10, long j11, double d10, double d11, double d12, double d13) {
        double max = (double) Math.max(0, j10 - j11);
        Double.isNaN(max);
        double d14 = max / d10;
        if (d12 > 0.0d) {
            return xb.a(d14, d11, d12, d13);
        }
        if (d12 < 0.0d) {
            return xb.a(d14, d11, d12) / d13;
        }
        return xb.a(d14, d11, d12);
    }

    public void a(long j10, double d10) {
        double a10 = this.f12719g * a(j10, this.f12720h, this.f12715c, this.f12716d, this.f12717e, this.f12718f);
        double d11 = (this.f12714b * d10) + (this.f12713a * a10);
        this.f12721i = d11;
        if (a10 < d11) {
            this.f12719g = d11;
            this.f12720h = j10;
        }
    }

    public double a() {
        return this.f12721i;
    }
}
