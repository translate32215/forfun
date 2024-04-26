package jf;

import gf.g0;
import gf.h;
import ud.k;

/* compiled from: standardBindings.kt */
public final class b<C> implements c<C> {

    /* renamed from: a  reason: collision with root package name */
    public final c<?> f19791a;

    /* renamed from: b  reason: collision with root package name */
    public final C f19792b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f19793c;

    public b(c<?> cVar, C c10) {
        k.g(cVar, "base");
        this.f19793c = cVar;
        this.f19791a = cVar;
        this.f19792b = c10;
    }

    public <T> T a(g0<T> g0Var, Object obj) {
        return this.f19793c.a(g0Var, obj);
    }

    public h b() {
        return this.f19793c.b();
    }

    public C getContext() {
        return this.f19792b;
    }
}
