package e3;

import android.graphics.PointF;
import b3.j;
import f3.c;
import g3.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z2.a;

/* compiled from: ShapeDataParser */
public class b0 implements h0<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f13544a = new b0();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f13545b = c.a.a("c", "v", "i", "o");

    public Object a(c cVar, float f10) throws IOException {
        if (cVar.M() == c.b.BEGIN_ARRAY) {
            cVar.a();
        }
        cVar.d();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z10 = false;
        while (cVar.t()) {
            int T = cVar.T(f13545b);
            if (T == 0) {
                z10 = cVar.u();
            } else if (T == 1) {
                list = p.c(cVar, f10);
            } else if (T == 2) {
                list2 = p.c(cVar, f10);
            } else if (T != 3) {
                cVar.V();
                cVar.f0();
            } else {
                list3 = p.c(cVar, f10);
            }
        }
        cVar.o();
        if (cVar.M() == c.b.END_ARRAY) {
            cVar.i();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new j(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = list.get(i10);
                int i11 = i10 - 1;
                arrayList.add(new a(f.a(list.get(i11), list3.get(i11)), f.a(pointF2, list2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = list.get(0);
                int i12 = size - 1;
                arrayList.add(new a(f.a(list.get(i12), list3.get(i12)), f.a(pointF3, list2.get(0)), pointF3));
            }
            return new j(pointF, z10, arrayList);
        }
    }
}
