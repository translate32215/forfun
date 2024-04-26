package ad;

import ad.i;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import ba.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r6.f;
import r6.j;
import v6.e0;
import z5.g0;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.c f270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.a f271b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f272c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f273d;

    public /* synthetic */ h(f.c cVar, j.a aVar, i iVar, f fVar) {
        this.f270a = cVar;
        this.f271b = aVar;
        this.f272c = iVar;
        this.f273d = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        j.a aVar;
        Map map;
        f.c cVar = this.f270a;
        j.a aVar2 = this.f271b;
        i iVar = this.f272c;
        f fVar = this.f273d;
        int i11 = i.I0;
        s<String> sVar = cVar.f24666a;
        int i12 = cVar.f24667b;
        s<String> sVar2 = cVar.f24668c;
        int i13 = cVar.f24669d;
        boolean z10 = cVar.f24670e;
        int i14 = cVar.f24671f;
        int i15 = cVar.f24596g;
        int i16 = cVar.f24597h;
        int i17 = cVar.f24598i;
        int i18 = cVar.f24599r;
        int i19 = cVar.f24600s;
        int i20 = cVar.f24601t;
        int i21 = i13;
        int i22 = cVar.f24602u;
        s<String> sVar3 = sVar2;
        int i23 = cVar.f24603v;
        int i24 = i12;
        boolean z11 = cVar.f24604w;
        s<String> sVar4 = sVar;
        boolean z12 = cVar.f24605x;
        boolean z13 = cVar.f24606y;
        int i25 = cVar.f24607z;
        int i26 = cVar.A;
        boolean z14 = cVar.B;
        s<String> sVar5 = cVar.C;
        int i27 = cVar.D;
        int i28 = cVar.E;
        boolean z15 = cVar.F;
        boolean z16 = cVar.G;
        boolean z17 = cVar.H;
        boolean z18 = cVar.I;
        s<String> sVar6 = cVar.J;
        boolean z19 = cVar.K;
        boolean z20 = cVar.L;
        boolean z21 = cVar.M;
        boolean z22 = cVar.N;
        boolean z23 = cVar.O;
        int i29 = i19;
        SparseArray<Map<g0, f.e>> sparseArray = cVar.P;
        boolean z24 = z23;
        SparseArray sparseArray2 = new SparseArray();
        int i30 = i14;
        boolean z25 = z10;
        int i31 = 0;
        while (i31 < sparseArray.size()) {
            sparseArray2.put(sparseArray.keyAt(i31), new HashMap(sparseArray.valueAt(i31)));
            i31++;
            sparseArray = sparseArray;
            z11 = z11;
        }
        boolean z26 = z11;
        SparseBooleanArray clone = cVar.Q.clone();
        int i32 = 0;
        while (i32 < aVar2.f24656a) {
            Map map2 = (Map) sparseArray2.get(i32);
            if (map2 != null && !map2.isEmpty()) {
                sparseArray2.remove(i32);
            }
            i.b bVar = iVar.D0.get(i32);
            boolean z27 = bVar != null && bVar.f275n0;
            if (clone.get(i32) != z27) {
                if (z27) {
                    clone.put(i32, true);
                } else {
                    clone.delete(i32);
                }
            }
            i.b bVar2 = iVar.D0.get(i32);
            List<f.e> emptyList = bVar2 == null ? Collections.emptyList() : bVar2.f276o0;
            if (!emptyList.isEmpty()) {
                g0 g0Var = aVar2.f24659d[i32];
                f.e eVar = emptyList.get(0);
                Map map3 = (Map) sparseArray2.get(i32);
                if (map3 == null) {
                    map = new HashMap();
                    sparseArray2.put(i32, map);
                } else {
                    map = map3;
                }
                if (map.containsKey(g0Var)) {
                    aVar = aVar2;
                    if (e0.a(map.get(g0Var), eVar)) {
                    }
                } else {
                    aVar = aVar2;
                }
                map.put(g0Var, eVar);
            } else {
                aVar = aVar2;
            }
            i32++;
            aVar2 = aVar;
        }
        fVar.getClass();
        boolean z28 = z25;
        fVar.i(new f.c(i15, i16, i17, i18, i29, i20, i22, i23, z26, z12, z13, i25, i26, z14, sVar5, sVar4, i24, i27, i28, z15, z16, z17, z18, sVar6, sVar3, i21, z28, i30, z19, z20, z21, z22, z24, sparseArray2, clone));
    }
}
