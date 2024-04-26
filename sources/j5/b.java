package j5;

import d5.x;
import d5.y;
import q.e;
import v6.e0;
import v6.q;

/* compiled from: IndexSeeker */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long f19532a;

    /* renamed from: b  reason: collision with root package name */
    public final q f19533b;

    /* renamed from: c  reason: collision with root package name */
    public final q f19534c;

    /* renamed from: d  reason: collision with root package name */
    public long f19535d;

    public b(long j10, long j11, long j12) {
        this.f19535d = j10;
        this.f19532a = j12;
        q qVar = new q(0, (e) null);
        this.f19533b = qVar;
        q qVar2 = new q(0, (e) null);
        this.f19534c = qVar2;
        qVar.a(0);
        qVar2.a(j11);
    }

    public boolean a(long j10) {
        q qVar = this.f19533b;
        return j10 - qVar.c(qVar.f() - 1) < 100000;
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f19535d;
    }

    public long d(long j10) {
        return this.f19533b.c(e0.d(this.f19534c, j10, true, true));
    }

    public long g() {
        return this.f19532a;
    }

    public x.a j(long j10) {
        int d10 = e0.d(this.f19533b, j10, true, true);
        long c10 = this.f19533b.c(d10);
        y yVar = new y(c10, this.f19534c.c(d10));
        if (c10 == j10 || d10 == this.f19533b.f() - 1) {
            return new x.a(yVar);
        }
        int i10 = d10 + 1;
        return new x.a(yVar, new y(this.f19533b.c(i10), this.f19534c.c(i10)));
    }
}
