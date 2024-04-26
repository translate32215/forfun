package v;

import t.c;

/* compiled from: Optimizer */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f26306a = new boolean[3];

    public static void a(g gVar, c cVar, f fVar) {
        fVar.f26275o = -1;
        fVar.f26277p = -1;
        if (gVar.U[0] != 2 && fVar.U[0] == 4) {
            int i10 = fVar.J.f26235g;
            int u10 = gVar.u() - fVar.L.f26235g;
            d dVar = fVar.J;
            dVar.f26237i = cVar.l(dVar);
            d dVar2 = fVar.L;
            dVar2.f26237i = cVar.l(dVar2);
            cVar.e(fVar.J.f26237i, i10);
            cVar.e(fVar.L.f26237i, u10);
            fVar.f26275o = 2;
            fVar.f26248a0 = i10;
            int i11 = u10 - i10;
            fVar.W = i11;
            int i12 = fVar.f26254d0;
            if (i11 < i12) {
                fVar.W = i12;
            }
        }
        if (gVar.U[1] != 2 && fVar.U[1] == 4) {
            int i13 = fVar.K.f26235g;
            int l10 = gVar.l() - fVar.M.f26235g;
            d dVar3 = fVar.K;
            dVar3.f26237i = cVar.l(dVar3);
            d dVar4 = fVar.M;
            dVar4.f26237i = cVar.l(dVar4);
            cVar.e(fVar.K.f26237i, i13);
            cVar.e(fVar.M.f26237i, l10);
            if (fVar.f26252c0 > 0 || fVar.f26264i0 == 8) {
                d dVar5 = fVar.N;
                dVar5.f26237i = cVar.l(dVar5);
                cVar.e(fVar.N.f26237i, fVar.f26252c0 + i13);
            }
            fVar.f26277p = 2;
            fVar.f26250b0 = i13;
            int i14 = l10 - i13;
            fVar.X = i14;
            int i15 = fVar.f26256e0;
            if (i14 < i15) {
                fVar.X = i15;
            }
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
