package w;

import java.util.ArrayList;
import v.d;
import v.f;
import v.h;
import v.j;

/* compiled from: Grouping */
public class i {
    public static o a(f fVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            i11 = fVar.f26278p0;
        } else {
            i11 = fVar.f26280q0;
        }
        int i13 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f26845b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i14);
                if (oVar2.f26845b == i11) {
                    if (oVar != null) {
                        oVar.d(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (fVar instanceof j) {
                j jVar = (j) fVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= jVar.f26305s0) {
                        i12 = -1;
                        break;
                    }
                    f fVar2 = jVar.f26304r0[i15];
                    if ((i10 == 0 && (i12 = fVar2.f26278p0) != -1) || (i10 == 1 && (i12 = fVar2.f26280q0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i16);
                        if (oVar3.f26845b == i12) {
                            oVar = oVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(fVar)) {
            if (fVar instanceof h) {
                h hVar = (h) fVar;
                d dVar = hVar.f26301u0;
                if (hVar.f26302v0 == 0) {
                    i13 = 1;
                }
                dVar.b(i13, arrayList, oVar);
            }
            if (i10 == 0) {
                fVar.f26278p0 = oVar.f26845b;
                fVar.J.b(i10, arrayList, oVar);
                fVar.L.b(i10, arrayList, oVar);
            } else {
                fVar.f26280q0 = oVar.f26845b;
                fVar.K.b(i10, arrayList, oVar);
                fVar.N.b(i10, arrayList, oVar);
                fVar.M.b(i10, arrayList, oVar);
            }
            fVar.Q.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f26845b) {
                return oVar;
            }
        }
        return null;
    }

    public static boolean c(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }
}
