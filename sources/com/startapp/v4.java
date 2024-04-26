package com.startapp;

/* compiled from: Sta */
public class v4 extends t4 {

    /* renamed from: e  reason: collision with root package name */
    public final y1<y3> f12695e;

    /* renamed from: f  reason: collision with root package name */
    public final y1<x8> f12696f;

    public v4(y1<y3> y1Var, y1<x8> y1Var2, i4 i4Var, k4 k4Var, n4 n4Var) {
        super(i4Var, k4Var, n4Var);
        this.f12695e = y1Var;
        this.f12696f = y1Var2;
    }

    public int a() throws Exception {
        String str = this.f12609a.f10538e;
        if (str == null) {
            return 3;
        }
        return bb.a(this.f12696f.b(), this.f12695e.b(), str, (b3<Throwable, Void>) null) != null ? 1 : 0;
    }
}
