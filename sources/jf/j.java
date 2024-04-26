package jf;

import gf.g0;
import gf.h;
import ud.k;

/* compiled from: BindingKodein.kt */
public final class j<C> implements i<C>, h, z<C> {

    /* renamed from: a  reason: collision with root package name */
    public final c<C> f19803a;

    public j(c<? extends C> cVar) {
        k.g(cVar, "_kodein");
        this.f19803a = cVar;
    }

    public <T> T a(g0<T> g0Var, Object obj) {
        return this.f19803a.a(g0Var, obj);
    }

    public h b() {
        return this.f19803a.b();
    }

    public C getContext() {
        return this.f19803a.getContext();
    }
}
