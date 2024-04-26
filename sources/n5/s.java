package n5;

import d5.a0;
import d5.k;
import n5.e0;
import v6.a;
import v6.v;
import x4.b0;

/* compiled from: PassthroughSectionPayloadReader */
public final class s implements x {

    /* renamed from: a  reason: collision with root package name */
    public b0 f22288a;

    /* renamed from: b  reason: collision with root package name */
    public v6.b0 f22289b;

    /* renamed from: c  reason: collision with root package name */
    public a0 f22290c;

    public s(String str) {
        b0.b bVar = new b0.b();
        bVar.f27425k = str;
        this.f22288a = bVar.a();
    }

    public void b(v6.b0 b0Var, k kVar, e0.d dVar) {
        this.f22289b = b0Var;
        dVar.a();
        a0 l10 = kVar.l(dVar.c(), 5);
        this.f22290c = l10;
        l10.c(this.f22288a);
    }

    public void c(v vVar) {
        long j10;
        a.f(this.f22289b);
        int i10 = v6.e0.f26436a;
        long d10 = this.f22289b.d();
        long j11 = -9223372036854775807L;
        if (d10 != -9223372036854775807L) {
            b0 b0Var = this.f22288a;
            if (d10 != b0Var.f27412x) {
                b0.b a10 = b0Var.a();
                a10.f27429o = d10;
                b0 a11 = a10.a();
                this.f22288a = a11;
                this.f22290c.c(a11);
            }
            int a12 = vVar.a();
            this.f22290c.b(vVar, a12);
            a0 a0Var = this.f22290c;
            v6.b0 b0Var2 = this.f22289b;
            synchronized (b0Var2) {
                long j12 = b0Var2.f26428d;
                if (j12 != -9223372036854775807L) {
                    j11 = b0Var2.f26427c + j12;
                } else {
                    long j13 = b0Var2.f26426b;
                    if (j13 != Long.MAX_VALUE) {
                        j10 = j13;
                    }
                }
                j10 = j11;
            }
            a0Var.d(j10, 1, a12, 0, (a0.a) null);
        }
    }
}
