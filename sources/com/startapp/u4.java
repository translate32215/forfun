package com.startapp;

import android.content.Context;

/* compiled from: Sta */
public class u4 implements c3<i4, k4, n4, t4> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12648a;

    /* renamed from: b  reason: collision with root package name */
    public final y1<y3> f12649b;

    /* renamed from: c  reason: collision with root package name */
    public final y1<x8> f12650c;

    public u4(Context context, y1<y3> y1Var, y1<x8> y1Var2) {
        this.f12648a = context;
        this.f12649b = y1Var;
        this.f12650c = y1Var2;
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        i4 i4Var = (i4) obj;
        k4 k4Var = (k4) obj2;
        n4 n4Var = (n4) obj3;
        if (i4Var == null || k4Var == null) {
            return null;
        }
        if (j4.f10595l.equals(i4Var.f10534a)) {
            return new v4(this.f12649b, this.f12650c, i4Var, k4Var, n4Var);
        }
        return new s4(this.f12648a, i4Var, k4Var, n4Var);
    }
}
