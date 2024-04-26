package q2;

import ea.a;
import q2.b;

/* compiled from: SettableFuture */
public final class d<V> extends b<V> {
    public boolean j(V v10) {
        if (v10 == null) {
            v10 = b.f24037g;
        }
        if (!b.f24036f.b(this, (Object) null, v10)) {
            return false;
        }
        b.c(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!b.f24036f.b(this, (Object) null, new b.d(th))) {
            return false;
        }
        b.c(this);
        return true;
    }

    public boolean l(a<? extends V> aVar) {
        b.g gVar;
        b.d dVar;
        aVar.getClass();
        Object obj = this.f24038a;
        if (obj == null) {
            if (((b) aVar).isDone()) {
                if (!b.f24036f.b(this, (Object) null, b.f(aVar))) {
                    return false;
                }
                b.c(this);
            } else {
                gVar = new b.g(this, aVar);
                if (b.f24036f.b(this, (Object) null, gVar)) {
                    try {
                        ((b) aVar).a(gVar, c.INSTANCE);
                    } catch (Throwable unused) {
                        dVar = b.d.f24045b;
                    }
                } else {
                    obj = this.f24038a;
                }
            }
            return true;
        }
        if (!(obj instanceof b.c)) {
            return false;
        }
        ((b) aVar).cancel(((b.c) obj).f24043a);
        return false;
        b.f24036f.b(this, gVar, dVar);
        return true;
    }
}
