package x4;

import a5.f;
import java.io.IOException;
import m3.t;
import v6.a;
import v6.r;
import x4.b0;
import z5.b0;

/* compiled from: BaseRenderer */
public abstract class e implements v0, w0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f27492a;

    /* renamed from: b  reason: collision with root package name */
    public final t f27493b = new t(2);

    /* renamed from: c  reason: collision with root package name */
    public x0 f27494c;

    /* renamed from: d  reason: collision with root package name */
    public int f27495d;

    /* renamed from: e  reason: collision with root package name */
    public int f27496e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f27497f;

    /* renamed from: g  reason: collision with root package name */
    public b0[] f27498g;

    /* renamed from: h  reason: collision with root package name */
    public long f27499h;

    /* renamed from: i  reason: collision with root package name */
    public long f27500i = Long.MIN_VALUE;

    /* renamed from: r  reason: collision with root package name */
    public boolean f27501r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f27502s;

    public e(int i10) {
        this.f27492a = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x4.m A(java.lang.Throwable r13, x4.b0 r14, boolean r15) {
        /*
            r12 = this;
            r0 = 4
            if (r14 == 0) goto L_0x001a
            boolean r1 = r12.f27502s
            if (r1 != 0) goto L_0x001a
            r1 = 1
            r12.f27502s = r1
            r1 = 0
            int r2 = r12.h(r14)     // Catch:{ m -> 0x0018, all -> 0x0014 }
            r2 = r2 & 7
            r12.f27502s = r1
            goto L_0x001b
        L_0x0014:
            r13 = move-exception
            r12.f27502s = r1
            throw r13
        L_0x0018:
            r12.f27502s = r1
        L_0x001a:
            r2 = 4
        L_0x001b:
            java.lang.String r7 = r12.a()
            int r8 = r12.f27495d
            x4.m r1 = new x4.m
            if (r14 != 0) goto L_0x0027
            r10 = 4
            goto L_0x0028
        L_0x0027:
            r10 = r2
        L_0x0028:
            r4 = 1
            r6 = 0
            r3 = r1
            r5 = r13
            r9 = r14
            r11 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.e.A(java.lang.Throwable, x4.b0, boolean):x4.m");
    }

    public final t B() {
        this.f27493b.a();
        return this.f27493b;
    }

    public abstract void C();

    public void D(boolean z10, boolean z11) throws m {
    }

    public abstract void E(long j10, boolean z10) throws m;

    public void F() {
    }

    public void G() throws m {
    }

    public void H() {
    }

    public abstract void I(b0[] b0VarArr, long j10, long j11) throws m;

    /* JADX WARNING: type inference failed for: r7v4, types: [x4.b0, java.util.Map<k3.c, m3.m<?>>] */
    public final int J(t tVar, f fVar, boolean z10) {
        b0 b0Var = this.f27497f;
        b0Var.getClass();
        int d10 = b0Var.d(tVar, fVar, z10);
        if (d10 == -4) {
            if (fVar.r()) {
                this.f27500i = Long.MIN_VALUE;
                if (this.f27501r) {
                    return -4;
                }
                return -3;
            }
            long j10 = fVar.f88e + this.f27499h;
            fVar.f88e = j10;
            this.f27500i = Math.max(this.f27500i, j10);
        } else if (d10 == -5) {
            b0 b0Var2 = (b0) tVar.f21666b;
            b0Var2.getClass();
            if (b0Var2.f27412x != Long.MAX_VALUE) {
                b0.b a10 = b0Var2.a();
                a10.f27429o = b0Var2.f27412x + this.f27499h;
                tVar.f21666b = a10.a();
            }
        }
        return d10;
    }

    public final void b() {
        a.d(this.f27496e == 0);
        this.f27493b.a();
        F();
    }

    public final void c(int i10) {
        this.f27495d = i10;
    }

    public final void e() {
        boolean z10 = true;
        if (this.f27496e != 1) {
            z10 = false;
        }
        a.d(z10);
        this.f27493b.a();
        this.f27496e = 0;
        this.f27497f = null;
        this.f27498g = null;
        this.f27501r = false;
        C();
    }

    public final int g() {
        return this.f27492a;
    }

    public final int getState() {
        return this.f27496e;
    }

    public final void j(x0 x0Var, b0[] b0VarArr, z5.b0 b0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws m {
        boolean z12 = z10;
        a.d(this.f27496e == 0);
        this.f27494c = x0Var;
        this.f27496e = 1;
        D(z10, z11);
        r(b0VarArr, b0Var, j11, j12);
        long j13 = j10;
        E(j10, z10);
    }

    public final boolean k() {
        return this.f27500i == Long.MIN_VALUE;
    }

    public int l() throws m {
        return 0;
    }

    public void n(int i10, Object obj) throws m {
    }

    public final z5.b0 o() {
        return this.f27497f;
    }

    public final void p() {
        this.f27501r = true;
    }

    public final void q() throws IOException {
        z5.b0 b0Var = this.f27497f;
        b0Var.getClass();
        b0Var.b();
    }

    public final void r(b0[] b0VarArr, z5.b0 b0Var, long j10, long j11) throws m {
        a.d(!this.f27501r);
        this.f27497f = b0Var;
        this.f27500i = j11;
        this.f27498g = b0VarArr;
        this.f27499h = j11;
        I(b0VarArr, j10, j11);
    }

    public final long s() {
        return this.f27500i;
    }

    public final void start() throws m {
        boolean z10 = true;
        if (this.f27496e != 1) {
            z10 = false;
        }
        a.d(z10);
        this.f27496e = 2;
        G();
    }

    public final void stop() {
        a.d(this.f27496e == 2);
        this.f27496e = 1;
        H();
    }

    public final void t(long j10) throws m {
        this.f27501r = false;
        this.f27500i = j10;
        E(j10, false);
    }

    public final boolean u() {
        return this.f27501r;
    }

    public r v() {
        return null;
    }

    public final w0 w() {
        return this;
    }

    public /* synthetic */ void y(float f10, float f11) {
        u0.a(this, f10, f11);
    }

    public final m z(Throwable th, b0 b0Var) {
        return A(th, b0Var, false);
    }
}
