package com.startapp;

/* compiled from: Sta */
public abstract class t4 implements Runnable, Comparable<t4> {

    /* renamed from: a  reason: collision with root package name */
    public final i4 f12609a;

    /* renamed from: b  reason: collision with root package name */
    public final k4 f12610b;

    /* renamed from: c  reason: collision with root package name */
    public final n4 f12611c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f12612d = new Exception();

    public t4(i4 i4Var, k4 k4Var, n4 n4Var) {
        this.f12609a = i4Var;
        this.f12610b = k4Var;
        this.f12611c = n4Var;
    }

    public abstract int a() throws Exception;

    public Throwable a(Throwable th) {
        return th;
    }

    public int compareTo(Object obj) {
        return ((t4) obj).f12610b.f10783c - this.f12610b.f10783c;
    }

    public final void run() {
        n4 n4Var;
        int i10 = 0;
        try {
            i10 = a();
            n4Var = this.f12611c;
            if (n4Var == null) {
                return;
            }
        } catch (OutOfMemoryError unused) {
            if (this.f12611c != null) {
                this.f12611c.a(this.f12609a, 0);
                return;
            }
            return;
        } catch (Throwable th) {
            n4 n4Var2 = this.f12611c;
            if (n4Var2 != null) {
                n4Var2.a(this.f12609a, 0);
            }
            throw th;
        }
        n4Var.a(this.f12609a, i10);
    }
}
