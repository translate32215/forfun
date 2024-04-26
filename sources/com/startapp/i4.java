package com.startapp;

import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class i4 {

    /* renamed from: a  reason: collision with root package name */
    public final j4 f10534a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10535b;

    /* renamed from: c  reason: collision with root package name */
    public String f10536c;

    /* renamed from: d  reason: collision with root package name */
    public String f10537d;

    /* renamed from: e  reason: collision with root package name */
    public String f10538e;

    /* renamed from: f  reason: collision with root package name */
    public Object f10539f;

    /* renamed from: g  reason: collision with root package name */
    public String f10540g;

    /* renamed from: h  reason: collision with root package name */
    public Long f10541h;

    /* renamed from: i  reason: collision with root package name */
    public String f10542i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10543j;

    /* renamed from: k  reason: collision with root package name */
    public String f10544k;

    public i4(j4 j4Var) {
        if (j4Var != j4.f10589f) {
            this.f10534a = j4Var;
        } else {
            this.f10534a = j4.f10588e;
        }
        j4 j4Var2 = this.f10534a;
        if (j4Var2 == j4.f10588e || j4Var2 == j4.f10587d) {
            this.f10542i = wb.a(wb.a(0));
        }
        this.f10535b = 0;
    }

    public void a() {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.L.f12907a;
            if (componentLocator != null) {
                componentLocator.l().a(this, (n4) null);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return super.toString();
    }

    public void a(n4 n4Var) {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.L.f12907a;
            if (componentLocator != null) {
                componentLocator.l().a(this, (n4) null);
            } else {
                n4Var.a(this, 3);
            }
        } catch (Throwable unused) {
        }
    }

    public i4(Throwable th) {
        this.f10534a = j4.f10589f;
        this.f10538e = wb.b(th);
        this.f10537d = wb.a(wb.a(th));
        this.f10542i = wb.a(wb.a(1));
        this.f10535b = 0;
    }

    public static void a(Throwable th) {
        try {
            new i4(th).a();
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, j4 j4Var) {
        try {
            new i4(th, j4Var).a();
        } catch (Throwable unused) {
        }
    }

    public i4(Throwable th, j4 j4Var) {
        boolean z10 = j4Var == j4.f10591h;
        this.f10534a = j4Var;
        this.f10538e = wb.b(th);
        this.f10537d = wb.a(wb.a(th));
        this.f10542i = z10 ? th.getClass().getName() : wb.a(wb.a(1));
        this.f10535b = 0;
    }

    public i4(j4 j4Var, long j10) {
        this.f10534a = j4Var;
        this.f10535b = j10;
    }
}
