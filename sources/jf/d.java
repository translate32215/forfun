package jf;

import gf.g0;
import q.c;

/* compiled from: scopes.kt */
public final class d<C, I, S> implements e<C, S> {

    /* renamed from: a  reason: collision with root package name */
    public final e<C, I> f19794a;

    /* renamed from: b  reason: collision with root package name */
    public final e<I, S> f19795b;

    public d(e<? super C, I> eVar, e<? super I, S> eVar2) {
        this.f19794a = eVar;
        this.f19795b = eVar2;
    }

    public g0<? super C> a() {
        return this.f19794a.a();
    }

    public S b(C c10) {
        return this.f19795b.b(this.f19794a.b(c10));
    }

    public g0<? super S> c() {
        return this.f19795b.c();
    }

    public String toString() {
        StringBuilder a10 = c.a('(');
        a10.append(this.f19794a);
        a10.append(" -> ");
        a10.append(this.f19795b);
        a10.append(')');
        return a10.toString();
    }
}
