package e3;

import f3.c;
import h3.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import u2.d;
import x2.h;

/* compiled from: KeyframesParser */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f13574a = c.a.a("k");

    public static <T> List<a<T>> a(c cVar, d dVar, float f10, h0<T> h0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.M() == c.b.STRING) {
            dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.d();
        while (cVar.t()) {
            if (cVar.T(f13574a) != 0) {
                cVar.f0();
            } else if (cVar.M() == c.b.BEGIN_ARRAY) {
                cVar.a();
                if (cVar.M() == c.b.NUMBER) {
                    arrayList.add(q.a(cVar, dVar, f10, h0Var, false));
                } else {
                    while (cVar.t()) {
                        arrayList.add(q.a(cVar, dVar, f10, h0Var, true));
                    }
                }
                cVar.i();
            } else {
                arrayList.add(q.a(cVar, dVar, f10, h0Var, false));
            }
        }
        cVar.o();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            a aVar = (a) list.get(i11);
            i11++;
            a aVar2 = (a) list.get(i11);
            aVar.f18872f = Float.valueOf(aVar2.f18871e);
            if (aVar.f18869c == null && (t10 = aVar2.f18868b) != null) {
                aVar.f18869c = t10;
                if (aVar instanceof h) {
                    ((h) aVar).e();
                }
            }
        }
        a aVar3 = (a) list.get(i10);
        if ((aVar3.f18868b == null || aVar3.f18869c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
