package lf;

import de.f;
import l0.e;
import ud.k;

/* compiled from: KotlinExtensions.kt */
public final class r implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f21374a;

    public r(f fVar) {
        this.f21374a = fVar;
    }

    public void a(b<Object> bVar, d0<Object> d0Var) {
        k.g(bVar, "call");
        k.g(d0Var, "response");
        this.f21374a.g(d0Var);
    }

    public void b(b<Object> bVar, Throwable th) {
        k.g(bVar, "call");
        k.g(th, "t");
        this.f21374a.g(e.a(th));
    }
}
