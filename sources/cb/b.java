package cb;

import java.util.Set;
import la.d;
import la.f;

public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f4369a = new b();

    public final Object a(d dVar) {
        Set<e> b10 = dVar.b(e.class);
        d dVar2 = d.f4372c;
        if (dVar2 == null) {
            synchronized (d.class) {
                dVar2 = d.f4372c;
                if (dVar2 == null) {
                    dVar2 = new d(0);
                    d.f4372c = dVar2;
                }
            }
        }
        return new c(b10, dVar2);
    }
}
