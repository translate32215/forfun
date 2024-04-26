package e3;

import a3.b;
import a3.k;
import android.graphics.PointF;
import f3.c;
import g3.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import u2.d;
import x2.h;

/* compiled from: AnimatablePathValueParser */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f13540a = c.a.a("k", "x", "y");

    public static k1.c a(c cVar, d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.M() == c.b.BEGIN_ARRAY) {
            cVar.a();
            while (cVar.t()) {
                arrayList.add(new h(dVar, q.a(cVar, dVar, g.c(), v.f13583a, cVar.M() == c.b.BEGIN_OBJECT)));
            }
            cVar.i();
            r.b(arrayList);
        } else {
            arrayList.add(new h3.a(p.b(cVar, g.c())));
        }
        return new k1.c((List) arrayList);
    }

    public static k<PointF, PointF> b(c cVar, d dVar) throws IOException {
        c.b bVar = c.b.STRING;
        cVar.d();
        k1.c cVar2 = null;
        b bVar2 = null;
        b bVar3 = null;
        boolean z10 = false;
        while (cVar.M() != c.b.END_OBJECT) {
            int T = cVar.T(f13540a);
            if (T != 0) {
                if (T != 1) {
                    if (T != 2) {
                        cVar.V();
                        cVar.f0();
                    } else if (cVar.M() == bVar) {
                        cVar.f0();
                    } else {
                        bVar3 = d.c(cVar, dVar);
                    }
                } else if (cVar.M() == bVar) {
                    cVar.f0();
                } else {
                    bVar2 = d.c(cVar, dVar);
                }
                z10 = true;
            } else {
                cVar2 = a(cVar, dVar);
            }
        }
        cVar.o();
        if (z10) {
            dVar.a("Lottie doesn't support expressions.");
        }
        if (cVar2 != null) {
            return cVar2;
        }
        return new a3.h(bVar2, bVar3);
    }
}
