package kf;

import gf.d0;
import gf.g0;
import gf.h;
import gf.l;
import gf.q;
import gf.s;
import ud.k;

/* compiled from: DKodeinJVMImpl.kt */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final q f20893a;

    /* renamed from: b  reason: collision with root package name */
    public final s<?> f20894b;

    public b(q qVar, s<?> sVar) {
        k.g(qVar, "container");
        k.g(sVar, "context");
        this.f20893a = qVar;
        this.f20894b = sVar;
    }

    public Object a(g0 g0Var, Object obj) {
        q qVar = this.f20893a;
        g0<? super Object> o10 = this.f20894b.o();
        if (o10 != null) {
            d0 d0Var = d0.f18660c;
            return q.a.a(qVar, new l.e(o10, d0.f18658a, g0Var, obj), this.f20894b.getValue(), 0, 4, (Object) null).d();
        }
        throw new kd.l("null cannot be cast to non-null type org.kodein.di.TypeToken<in kotlin.Any?>");
    }

    public h b() {
        return this;
    }
}
