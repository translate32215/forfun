package md;

import md.f;
import td.p;
import ud.k;

/* compiled from: CoroutineContextImpl.kt */
public abstract class a implements f.b {
    private final f.c<?> key;

    public a(f.c<?> cVar) {
        k.f(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return f.b.a.a(this, r10, pVar);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.b(this, cVar);
    }

    public f.c<?> getKey() {
        return this.key;
    }

    public f minusKey(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    public f plus(f fVar) {
        return f.b.a.d(this, fVar);
    }
}
