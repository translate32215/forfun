package com.startapp;

/* compiled from: Sta */
public class v3 implements dc {

    /* renamed from: a  reason: collision with root package name */
    public final w3 f12691a;

    /* renamed from: b  reason: collision with root package name */
    public final w3 f12692b;

    /* renamed from: c  reason: collision with root package name */
    public final w3 f12693c;

    /* renamed from: d  reason: collision with root package name */
    public double f12694d;

    public v3(w3 w3Var, w3 w3Var2, w3 w3Var3) {
        this.f12691a = w3Var;
        this.f12692b = w3Var2;
        this.f12693c = w3Var3;
    }

    public void a(double d10, double d11, double d12) {
        this.f12691a.a(d10);
        this.f12692b.a(d11);
        this.f12693c.a(d12);
        double d13 = this.f12691a.f12740c;
        double d14 = this.f12692b.f12740c;
        double d15 = (d14 * d14) + (d13 * d13);
        double d16 = this.f12693c.f12740c;
        this.f12694d = Math.sqrt((d16 * d16) + d15);
    }

    public w3 b() {
        return this.f12691a;
    }

    public w3 c() {
        return this.f12692b;
    }

    public w3 d() {
        return this.f12693c;
    }

    public double a() {
        return this.f12694d;
    }
}
