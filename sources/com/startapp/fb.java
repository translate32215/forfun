package com.startapp;

/* compiled from: Sta */
public class fb {

    /* renamed from: a  reason: collision with root package name */
    public final v3 f10387a;

    /* renamed from: b  reason: collision with root package name */
    public final v3 f10388b;

    /* renamed from: c  reason: collision with root package name */
    public final w3 f10389c;

    /* renamed from: d  reason: collision with root package name */
    public final oc f10390d;

    /* renamed from: e  reason: collision with root package name */
    public final gc f10391e = new gc();

    /* renamed from: f  reason: collision with root package name */
    public final w3 f10392f;

    /* renamed from: g  reason: collision with root package name */
    public final w f10393g;

    /* renamed from: h  reason: collision with root package name */
    public final fc f10394h;

    /* renamed from: i  reason: collision with root package name */
    public final w f10395i;

    /* renamed from: j  reason: collision with root package name */
    public final n8 f10396j;

    /* renamed from: k  reason: collision with root package name */
    public final w f10397k;

    /* renamed from: l  reason: collision with root package name */
    public long f10398l;

    /* renamed from: m  reason: collision with root package name */
    public long f10399m;

    public fb(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25) {
        double d26 = d10;
        double d27 = d11;
        v3 v3Var = new v3(new w3(d10), new w3(d10), new w3(d10));
        this.f10387a = v3Var;
        this.f10388b = new v3(new w3(d11), new w3(d11), new w3(d11));
        double d28 = d12;
        this.f10389c = new w3(d12);
        double d29 = d14;
        double d30 = d15;
        this.f10390d = new oc(new pc(d29, d30, v3Var.b()), new pc(d29, d30, v3Var.c()), new pc(d29, d30, v3Var.d()));
        this.f10392f = new w3(d13);
        double d31 = d21;
        double d32 = d22;
        double d33 = d23;
        double d34 = d24;
        double d35 = d25;
        this.f10393g = new w(d31, d32, d33, d34, d35);
        this.f10394h = new fc();
        this.f10395i = new w(d31, d32, d33, d34, d35);
        this.f10396j = new n8(5.0d, false);
        this.f10397k = new w(d16, d17, d18, d19, d20);
    }

    public void a(double d10, long j10) {
        this.f10397k.f12719g = Math.min(Math.max(0.0d, d10), 1.0d);
        this.f10397k.f12720h = j10;
    }

    public void a(long j10, long j11, double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16;
        double exp;
        long j12 = j10;
        long j13 = j11;
        double d17 = d10;
        double d18 = d11;
        double d19 = d12;
        if (this.f10399m < j13) {
            if (this.f10398l <= 0) {
                this.f10398l = j13;
            }
            v3 v3Var = this.f10387a;
            double d20 = v3Var.f12691a.f12740c;
            double d21 = v3Var.f12692b.f12740c;
            double d22 = v3Var.f12693c.f12740c;
            double d23 = d19;
            v3Var.a(d10, d11, d12);
            v3 v3Var2 = this.f10387a;
            double d24 = v3Var2.f12691a.f12740c - d20;
            double d25 = v3Var2.f12692b.f12740c - d21;
            double d26 = v3Var2.f12693c.f12740c - d22;
            double d27 = d26 * d26;
            double d28 = d27 + (d25 * d25) + (d24 * d24);
            this.f10393g.a(j12, xb.a(d28, 1.5d, 4.0d));
            this.f10395i.a(j12, xb.a(d28, 0.01d, 1000.0d));
            v3 v3Var3 = this.f10388b;
            v3 v3Var4 = this.f10387a;
            v3Var3.a(d17 - v3Var4.f12691a.f12740c, d18 - v3Var4.f12692b.f12740c, d23 - v3Var4.f12693c.f12740c);
            this.f10389c.a(this.f10388b.f12694d);
            oc ocVar = this.f10390d;
            double d29 = d23;
            long j14 = j11;
            ocVar.f11539a.a(j14, d17);
            ocVar.f11540b.a(j14, d18);
            ocVar.f11541c.a(j14, d29);
            pc pcVar = ocVar.f11539a;
            double d30 = pcVar.f11599q;
            pc pcVar2 = ocVar.f11540b;
            double d31 = pcVar2.f11599q;
            pc pcVar3 = ocVar.f11541c;
            double d32 = pcVar3.f11599q;
            double d33 = d30 + d31 + d32;
            double d34 = 1.0d - this.f10393g.f12721i;
            if (d33 > 0.0d) {
                ocVar.f11542d = ((pcVar.f11598p * d30) / d33) + ((pcVar2.f11598p * d31) / d33) + ((pcVar3.f11598p * d32) / d33);
                ocVar.f11543e = d33 / 3.0d;
            } else {
                ocVar.f11542d = 0.0d;
                ocVar.f11543e = 0.0d;
            }
            double d35 = (double) (j14 - this.f10398l);
            Double.isNaN(d35);
            double a10 = xb.a(d35 / 1.0E9d, 10.0d, 1.0d);
            gc gcVar = this.f10391e;
            oc ocVar2 = this.f10390d;
            double d36 = ocVar2.f11542d;
            double d37 = ocVar2.f11543e;
            double d38 = this.f10389c.f12740c;
            gcVar.f10481a = (Math.min(Math.exp((-Math.pow(d36 - 7.0d, 2.0d)) / 1.0d) * 2.0d, 1.0d) * 1.0d) + (gcVar.f10481a * 0.0d);
            double d39 = gcVar.f10482b * 0.0d;
            if (d37 < 0.0d) {
                d14 = 1.0d;
                d13 = 0.0d;
            } else {
                if (d37 < 0.5d) {
                    d13 = Math.pow(d37 * 2.0d, 4.0d);
                } else if (d37 > 2.0d) {
                    d13 = Math.exp((2.0d - d37) * 6.0d);
                } else {
                    d14 = 1.0d;
                    d13 = 1.0d;
                }
                d14 = 1.0d;
            }
            gcVar.f10482b = (d13 * d14) + d39;
            double d40 = gcVar.f10483c * 0.0d;
            if (d38 < 0.0d) {
                d16 = 1.0d;
                d15 = 0.0d;
            } else {
                if (d38 < 0.5d) {
                    exp = Math.pow(d38 * 2.0d, 4.0d);
                } else if (d38 > 5.0d) {
                    exp = Math.exp((5.0d - d38) * 4.0d);
                } else {
                    d16 = 1.0d;
                    d15 = 1.0d;
                }
                d15 = exp;
                d16 = 1.0d;
            }
            double d41 = (d15 * d16) + d40;
            gcVar.f10483c = d41;
            double d42 = (d41 * 100.0d) / 270.0d;
            gcVar.f10484d = d42 + ((gcVar.f10482b * 70.0d) / 270.0d) + ((gcVar.f10481a * 100.0d) / 270.0d);
            this.f10392f.a(a10 * d34 * this.f10391e.f10484d);
            double d43 = this.f10392f.f12740c;
            fc fcVar = this.f10394h;
            oc ocVar3 = this.f10390d;
            double d44 = ocVar3.f11542d;
            double d45 = ocVar3.f11543e;
            this.f10396j.getClass();
            this.f10396j.getClass();
            fcVar.f10404a = (d44 * 0.050000000000000044d) + (fcVar.f10404a * 0.95d);
            fcVar.f10405b = (d45 * 0.050000000000000044d) + (fcVar.f10405b * 0.95d);
            fcVar.f10406c = (Math.abs(0.0d) * 0.0050000000000000044d) + (fcVar.f10406c * 0.995d);
            fcVar.f10407d = (Math.abs(0.0d) * 0.0050000000000000044d) + (fcVar.f10407d * 0.995d);
            fcVar.f10408e = ((((xb.a(fcVar.f10407d, 0.4d, 5.0d, fc.f10403i) * 1000.0d) / 5000.0d) + ((xb.a(fcVar.f10406c, 0.2d, 6.0d, fc.f10402h) * 1000.0d) / 5000.0d) + ((xb.a(fcVar.f10405b, 0.2d, 20.0d, fc.f10401g) * 1000.0d) / 5000.0d) + ((xb.a(fcVar.f10404a, 8.0d, 2.0d, fc.f10400f) * 2000.0d) / 5000.0d)) * 4.999999999999449E-4d) + (fcVar.f10408e * 0.9995d);
            w wVar = this.f10397k;
            double d46 = this.f10395i.f12721i;
            double d47 = (1.0d - d46) * a10 * this.f10394h.f10408e;
            wVar.a(j10, d47 + (d43 * d46));
            this.f10399m = j11;
        }
    }
}
