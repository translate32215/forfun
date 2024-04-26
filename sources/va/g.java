package va;

import s8.j;
import xa.c;
import xa.d;

/* compiled from: GetIdListener */
public class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public final j<String> f26694a;

    public g(j<String> jVar) {
        this.f26694a = jVar;
    }

    public boolean a(d dVar) {
        if (!(dVar.f() == c.a.UNREGISTERED) && !dVar.j() && !dVar.h()) {
            return false;
        }
        this.f26694a.b(dVar.c());
        return true;
    }

    public boolean b(Exception exc) {
        return false;
    }
}
