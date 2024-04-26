package jf;

import gf.g0;
import td.l;

/* compiled from: scopes.kt */
public final class t<C, S> implements e<C, S> {

    /* renamed from: a  reason: collision with root package name */
    public final g0<? super C> f19814a;

    /* renamed from: b  reason: collision with root package name */
    public final g0<? super S> f19815b;

    /* renamed from: c  reason: collision with root package name */
    public final l<C, S> f19816c;

    public t(g0<? super C> g0Var, g0<? super S> g0Var2, l<? super C, ? extends S> lVar) {
        this.f19814a = g0Var;
        this.f19815b = g0Var2;
        this.f19816c = lVar;
    }

    public g0<? super C> a() {
        return this.f19814a;
    }

    public S b(C c10) {
        return this.f19816c.c(c10);
    }

    public g0<? super S> c() {
        return this.f19815b;
    }

    public String toString() {
        return "()";
    }
}
