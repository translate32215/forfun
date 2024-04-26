package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class k4 {

    /* renamed from: a  reason: collision with root package name */
    public final double f10781a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10782b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10783c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10784d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10785e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10786f;

    /* renamed from: g  reason: collision with root package name */
    public final List<m4> f10787g;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f10788a = 1.0d;

        /* renamed from: b  reason: collision with root package name */
        public int f10789b;

        /* renamed from: c  reason: collision with root package name */
        public int f10790c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10791d;

        /* renamed from: e  reason: collision with root package name */
        public String f10792e;

        /* renamed from: f  reason: collision with root package name */
        public String f10793f;

        /* renamed from: g  reason: collision with root package name */
        public List<m4> f10794g;

        public double a() {
            return this.f10788a;
        }

        public List<m4> b() {
            return this.f10794g;
        }

        public String c() {
            return this.f10793f;
        }

        public int d() {
            return this.f10789b;
        }

        public int e() {
            return this.f10790c;
        }

        public String f() {
            return this.f10792e;
        }

        public boolean g() {
            return this.f10791d;
        }

        public a a(m4 m4Var) {
            if (this.f10794g == null) {
                this.f10794g = new ArrayList();
            }
            this.f10794g.add(m4Var);
            return this;
        }
    }

    public k4(a aVar) {
        this.f10781a = aVar.a();
        this.f10782b = aVar.d();
        this.f10783c = aVar.e();
        this.f10784d = aVar.g();
        this.f10785e = Math.max(60000, wb.e(aVar.f()));
        this.f10786f = Math.max(0, wb.e(aVar.c()));
        this.f10787g = wb.b(aVar.b());
    }

    public static <T> T a(T t10, T t11) {
        return t11 != null ? t11 : t10;
    }

    public double a() {
        return this.f10781a;
    }

    public List<m4> b() {
        return this.f10787g;
    }

    public long c() {
        return this.f10786f;
    }

    public int d() {
        return this.f10782b;
    }

    public int e() {
        return this.f10783c;
    }

    public long f() {
        return this.f10785e;
    }

    public boolean g() {
        return this.f10784d;
    }

    public k4(k4 k4Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        this.f10781a = ((Double) a(Double.valueOf(k4Var.a()), analyticsCategoryConfig.a())).doubleValue();
        this.f10782b = ((Integer) a(Integer.valueOf(k4Var.d()), analyticsCategoryConfig.d())).intValue();
        this.f10783c = ((Integer) a(Integer.valueOf(k4Var.e()), analyticsCategoryConfig.e())).intValue();
        this.f10784d = ((Boolean) a(Boolean.valueOf(k4Var.g()), analyticsCategoryConfig.f())).booleanValue();
        this.f10785e = analyticsCategoryConfig.g() == null ? k4Var.f() : Math.max(60000, wb.e(analyticsCategoryConfig.g()));
        this.f10786f = analyticsCategoryConfig.c() == null ? k4Var.c() : Math.max(0, wb.e(analyticsCategoryConfig.c()));
        this.f10787g = (List) a(k4Var.b(), m4.a(analyticsCategoryConfig.b()));
    }
}
