package ie;

import de.a;
import kd.o;
import l0.e;
import md.f;
import od.d;
import td.l;

/* compiled from: Scopes.kt */
public class r<T> extends a<T> implements d {

    /* renamed from: c  reason: collision with root package name */
    public final md.d<T> f19396c;

    public r(f fVar, md.d<? super T> dVar) {
        super(fVar, true, true);
        this.f19396c = dVar;
    }

    public final boolean C() {
        return true;
    }

    public void U(Object obj) {
        md.d<T> dVar = this.f19396c;
        dVar.g(e.j(obj, dVar));
    }

    public void c(Object obj) {
        e.a(q.a.k(this.f19396c), e.j(obj, this.f19396c), (l<? super Throwable, o>) null);
    }

    public final d f() {
        md.d<T> dVar = this.f19396c;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }
}
