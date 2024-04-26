package x4;

import x4.c1;

/* compiled from: DefaultControlDispatcher */
public class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final c1.c f27587a;

    /* renamed from: b  reason: collision with root package name */
    public long f27588b;

    /* renamed from: c  reason: collision with root package name */
    public long f27589c;

    public h() {
        this.f27589c = 15000;
        this.f27588b = 5000;
        this.f27587a = new c1.c();
    }

    public static void g(r0 r0Var, long j10) {
        long G = r0Var.G() + j10;
        long n02 = r0Var.n0();
        if (n02 != -9223372036854775807L) {
            G = Math.min(G, n02);
        }
        r0Var.i(r0Var.D(), Math.max(G, 0));
    }

    public boolean a(r0 r0Var) {
        if (!e() || !r0Var.p()) {
            return true;
        }
        g(r0Var, this.f27589c);
        return true;
    }

    public boolean b(r0 r0Var) {
        c1 z10 = r0Var.z();
        if (z10.q() || r0Var.e()) {
            return true;
        }
        int D = r0Var.D();
        z10.n(D, this.f27587a);
        int t10 = r0Var.t();
        if (t10 != -1) {
            r0Var.i(t10, -9223372036854775807L);
            return true;
        } else if (!this.f27587a.c() || !this.f27587a.f27478i) {
            return true;
        } else {
            r0Var.i(D, -9223372036854775807L);
            return true;
        }
    }

    public boolean c(r0 r0Var) {
        c1 z10 = r0Var.z();
        if (!z10.q() && !r0Var.e()) {
            int D = r0Var.D();
            z10.n(D, this.f27587a);
            int j10 = r0Var.j();
            boolean z11 = this.f27587a.c() && !this.f27587a.f27477h;
            if (j10 != -1 && (r0Var.G() <= 3000 || z11)) {
                r0Var.i(j10, -9223372036854775807L);
            } else if (!z11) {
                r0Var.i(D, 0);
            }
        }
        return true;
    }

    public boolean d(r0 r0Var) {
        if (!f() || !r0Var.p()) {
            return true;
        }
        g(r0Var, -this.f27588b);
        return true;
    }

    public boolean e() {
        return this.f27589c > 0;
    }

    public boolean f() {
        return this.f27588b > 0;
    }

    public h(long j10, long j11) {
        this.f27589c = j10;
        this.f27588b = j11;
        this.f27587a = new c1.c();
    }
}
