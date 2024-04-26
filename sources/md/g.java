package md;

import java.io.Serializable;
import md.f;
import td.p;
import ud.k;

/* compiled from: CoroutineContextImpl.kt */
public final class g implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final g f21797a = new g();

    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        k.f(pVar, "operation");
        return r10;
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        k.f(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public f minusKey(f.c<?> cVar) {
        k.f(cVar, "key");
        return this;
    }

    public f plus(f fVar) {
        k.f(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
