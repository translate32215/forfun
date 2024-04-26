package com.startapp;

/* compiled from: Sta */
public class pc {

    /* renamed from: a  reason: collision with root package name */
    public final b f11583a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final long f11584b;

    /* renamed from: c  reason: collision with root package name */
    public final double f11585c;

    /* renamed from: d  reason: collision with root package name */
    public final dc f11586d;

    /* renamed from: e  reason: collision with root package name */
    public double f11587e;

    /* renamed from: f  reason: collision with root package name */
    public double f11588f;

    /* renamed from: g  reason: collision with root package name */
    public double f11589g;

    /* renamed from: h  reason: collision with root package name */
    public long f11590h;

    /* renamed from: i  reason: collision with root package name */
    public long f11591i;

    /* renamed from: j  reason: collision with root package name */
    public double f11592j;

    /* renamed from: k  reason: collision with root package name */
    public long f11593k;

    /* renamed from: l  reason: collision with root package name */
    public long f11594l;

    /* renamed from: m  reason: collision with root package name */
    public a f11595m;

    /* renamed from: n  reason: collision with root package name */
    public a f11596n;

    /* renamed from: o  reason: collision with root package name */
    public int f11597o;

    /* renamed from: p  reason: collision with root package name */
    public double f11598p;

    /* renamed from: q  reason: collision with root package name */
    public double f11599q;

    /* renamed from: r  reason: collision with root package name */
    public double f11600r;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public a f11601a;

        /* renamed from: b  reason: collision with root package name */
        public long f11602b;

        /* renamed from: c  reason: collision with root package name */
        public long f11603c;

        /* renamed from: d  reason: collision with root package name */
        public int f11604d;

        /* renamed from: e  reason: collision with root package name */
        public double f11605e;
    }

    /* compiled from: Sta */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public a f11606a;
    }

    public pc(double d10, double d11, dc dcVar) {
        this.f11584b = (long) (d10 * 1.0E9d);
        this.f11585c = d11;
        this.f11586d = dcVar;
    }

    public void a(long j10, double d10) {
        a aVar;
        this.f11587e = this.f11588f;
        this.f11588f = this.f11589g;
        this.f11589g = d10;
        this.f11590h = this.f11591i;
        this.f11591i = j10;
        long j11 = j10 - this.f11584b;
        while (true) {
            a aVar2 = this.f11595m;
            if (aVar2 == null || aVar2.f11602b >= j11 || (aVar = aVar2.f11601a) == null || aVar.f11602b >= j11) {
                b bVar = this.f11583a;
                a aVar3 = bVar.f11606a;
            } else {
                this.f11595m = aVar;
                this.f11597o -= aVar2.f11604d;
                this.f11600r -= aVar2.f11605e;
                b bVar2 = this.f11583a;
                aVar2.f11601a = bVar2.f11606a;
                bVar2.f11606a = aVar2;
            }
        }
        b bVar3 = this.f11583a;
        a aVar32 = bVar3.f11606a;
        if (aVar32 == null) {
            aVar32 = new a();
        } else {
            bVar3.f11606a = aVar32.f11601a;
            aVar32.f11601a = null;
            aVar32.f11602b = 0;
            aVar32.f11603c = 0;
            aVar32.f11604d = 0;
            aVar32.f11605e = 0.0d;
        }
        aVar32.f11602b = this.f11591i;
        aVar32.f11603c = this.f11594l;
        double a10 = this.f11586d.a();
        double d11 = this.f11587e;
        double d12 = this.f11588f;
        if (d11 < d12 && d12 > this.f11589g) {
            double d13 = d12 - a10;
            if (d13 > this.f11585c) {
                this.f11592j = d13;
                this.f11593k = this.f11590h;
            }
        }
        if (d12 > a10 && a10 > this.f11589g && this.f11593k > this.f11594l) {
            this.f11594l = this.f11591i;
            aVar32.f11604d = 1;
            aVar32.f11605e = this.f11592j;
        }
        int i10 = this.f11597o + aVar32.f11604d;
        this.f11597o = i10;
        double d14 = this.f11600r + aVar32.f11605e;
        this.f11600r = d14;
        a aVar4 = this.f11596n;
        if (aVar4 != null) {
            aVar4.f11601a = aVar32;
        }
        this.f11596n = aVar32;
        if (this.f11595m == null) {
            this.f11595m = aVar32;
        }
        long j12 = this.f11594l - this.f11595m.f11603c;
        if (j12 > 0) {
            double d15 = (double) j12;
            Double.isNaN(d15);
            double d16 = (double) i10;
            Double.isNaN(d16);
            this.f11598p = d16 / (d15 / 1.0E9d);
        }
        if (i10 > 0) {
            double d17 = (double) i10;
            Double.isNaN(d17);
            this.f11599q = d14 / d17;
            return;
        }
        this.f11599q = 0.0d;
    }
}
