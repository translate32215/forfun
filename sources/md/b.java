package md;

import md.f;
import md.f.b;
import td.l;
import ud.k;

/* compiled from: CoroutineContextImpl.kt */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: a  reason: collision with root package name */
    public final l<f.b, E> f21790a;

    /* renamed from: b  reason: collision with root package name */
    public final f.c<?> f21791b;

    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        k.f(cVar, "baseKey");
        this.f21790a = lVar;
        this.f21791b = cVar instanceof b ? ((b) cVar).f21791b : cVar;
    }
}
