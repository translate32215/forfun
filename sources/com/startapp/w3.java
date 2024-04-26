package com.startapp;

/* compiled from: Sta */
public class w3 implements dc {

    /* renamed from: a  reason: collision with root package name */
    public final double f12738a;

    /* renamed from: b  reason: collision with root package name */
    public final double f12739b;

    /* renamed from: c  reason: collision with root package name */
    public double f12740c;

    public w3(double d10) {
        double d11 = d10 + 1.0d;
        this.f12738a = d10 / d11;
        this.f12739b = 1.0d / d11;
    }

    public void a(double d10) {
        this.f12740c = (d10 * this.f12739b) + (this.f12738a * this.f12740c);
    }

    public double a() {
        return this.f12740c;
    }
}
