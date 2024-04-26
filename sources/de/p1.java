package de;

import md.f;
import td.p;

/* compiled from: CoroutineContext.kt */
public final class p1 implements f.b, f.c<p1> {

    /* renamed from: a  reason: collision with root package name */
    public static final p1 f13321a = new p1();

    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return f.b.a.a(this, r10, pVar);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.b(this, cVar);
    }

    public f.c<?> getKey() {
        return this;
    }

    public f minusKey(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    public f plus(f fVar) {
        return f.b.a.d(this, fVar);
    }
}
