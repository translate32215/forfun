package de;

import md.b;
import md.d;
import md.e;
import md.f;
import md.g;
import ud.f;
import ud.k;

/* compiled from: CoroutineDispatcher.kt */
public abstract class u extends md.a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13332a = new a((f) null);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends b<e, u> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(e.a.f21795a, t.f13330b);
            int i10 = e.X;
        }
    }

    public u() {
        super(e.a.f21795a);
    }

    public final void J(d<?> dVar) {
        ((ie.d) dVar).m();
    }

    public final <T> d<T> T(d<? super T> dVar) {
        return new ie.d(this, dVar);
    }

    public abstract void f0(md.f fVar, Runnable runnable);

    public void g0(md.f fVar, Runnable runnable) {
        f0(fVar, runnable);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        k.f(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> key = getKey();
            k.f(key, "key");
            if (!(key == bVar || bVar.f21791b == key)) {
                return null;
            }
            k.f(this, "element");
            E e10 = (f.b) bVar.f21790a.c(this);
            if (e10 instanceof f.b) {
                return e10;
            }
            return null;
        } else if (e.a.f21795a != cVar) {
            return null;
        } else {
            k.d(this, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return this;
        }
    }

    public boolean h0(md.f fVar) {
        return !(this instanceof n1);
    }

    public md.f minusKey(f.c<?> cVar) {
        k.f(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> key = getKey();
            k.f(key, "key");
            if (key == bVar || bVar.f21791b == key) {
                k.f(this, "element");
                if (((f.b) bVar.f21790a.c(this)) != null) {
                    return g.f21797a;
                }
            }
        } else if (e.a.f21795a == cVar) {
            return g.f21797a;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.c(this);
    }
}
