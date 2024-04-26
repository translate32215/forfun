package com.startapp;

/* compiled from: Sta */
public class p4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i4 f11568a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11569b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f11570c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o4 f11571d;

    public p4(o4 o4Var, i4 i4Var, int i10, long j10) {
        this.f11571d = o4Var;
        this.f11568a = i4Var;
        this.f11569b = i10;
        this.f11570c = j10;
    }

    public void run() {
        try {
            this.f11571d.a(this.f11568a, this.f11569b, this.f11570c);
        } catch (Throwable unused) {
        }
    }
}
