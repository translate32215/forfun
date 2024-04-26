package com.startapp;

/* compiled from: Sta */
public class h7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10498a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10499b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f10500c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g7 f10501d;

    public h7(g7 g7Var, String str, String str2, long j10) {
        this.f10501d = g7Var;
        this.f10498a = str;
        this.f10499b = str2;
        this.f10500c = j10;
    }

    public void run() {
        g7 g7Var = this.f10501d;
        String str = this.f10498a;
        String str2 = this.f10499b;
        long j10 = this.f10500c;
        g7Var.getClass();
        try {
            g7Var.f10453b.a(str, str2, System.currentTimeMillis(), j10);
        } catch (Throwable th) {
            if (g7Var.a(1)) {
                i4.a(th);
            }
        }
    }
}
