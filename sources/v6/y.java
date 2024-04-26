package v6;

import x4.f;
import x4.o0;

/* compiled from: StandaloneMediaClock */
public final class y implements r {

    /* renamed from: a  reason: collision with root package name */
    public final b f26538a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26539b;

    /* renamed from: c  reason: collision with root package name */
    public long f26540c;

    /* renamed from: d  reason: collision with root package name */
    public long f26541d;

    /* renamed from: e  reason: collision with root package name */
    public o0 f26542e = o0.f27699d;

    public y(b bVar) {
        this.f26538a = bVar;
    }

    public void a(long j10) {
        this.f26540c = j10;
        if (this.f26539b) {
            this.f26541d = this.f26538a.a();
        }
    }

    public void b() {
        if (!this.f26539b) {
            this.f26541d = this.f26538a.a();
            this.f26539b = true;
        }
    }

    public o0 f() {
        return this.f26542e;
    }

    public void i(o0 o0Var) {
        if (this.f26539b) {
            a(x());
        }
        this.f26542e = o0Var;
    }

    public long x() {
        long j10 = this.f26540c;
        if (!this.f26539b) {
            return j10;
        }
        long a10 = this.f26538a.a() - this.f26541d;
        o0 o0Var = this.f26542e;
        if (o0Var.f27700a == 1.0f) {
            return j10 + f.b(a10);
        }
        return j10 + (a10 * ((long) o0Var.f27702c));
    }
}
