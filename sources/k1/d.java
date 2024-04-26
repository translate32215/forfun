package k1;

import k1.a;
import ud.k;

/* compiled from: CreationExtras.kt */
public final class d extends a {
    public d() {
        a.C0172a aVar = a.C0172a.f19874b;
        k.f(aVar, "initialExtras");
        this.f19873a.putAll(aVar.f19873a);
    }

    public <T> T a(a.b<T> bVar) {
        return this.f19873a.get(bVar);
    }

    public final <T> void b(a.b<T> bVar, T t10) {
        this.f19873a.put(bVar, t10);
    }

    public d(a aVar) {
        k.f(aVar, "initialExtras");
        this.f19873a.putAll(aVar.f19873a);
    }

    public d(a aVar, int i10) {
        a.C0172a aVar2 = (i10 & 1) != 0 ? a.C0172a.f19874b : null;
        k.f(aVar2, "initialExtras");
        this.f19873a.putAll(aVar2.f19873a);
    }
}
