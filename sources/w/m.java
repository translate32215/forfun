package w;

import java.util.ArrayList;

/* compiled from: RunGroup */
public class m {

    /* renamed from: c  reason: collision with root package name */
    public static int f26838c;

    /* renamed from: a  reason: collision with root package name */
    public p f26839a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<p> f26840b = new ArrayList<>();

    public m(p pVar, int i10) {
        f26838c++;
        this.f26839a = pVar;
    }

    public final long a(f fVar, long j10) {
        p pVar = fVar.f26815d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f26822k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f26822k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f26815d != pVar) {
                    j11 = Math.min(j11, a(fVar2, ((long) fVar2.f26817f) + j10));
                }
            }
        }
        if (fVar != pVar.f26857i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, a(pVar.f26856h, j12)), j12 - ((long) pVar.f26856h.f26817f));
    }

    public final long b(f fVar, long j10) {
        p pVar = fVar.f26815d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f26822k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f26822k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f26815d != pVar) {
                    j11 = Math.max(j11, b(fVar2, ((long) fVar2.f26817f) + j10));
                }
            }
        }
        if (fVar != pVar.f26856h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, b(pVar.f26857i, j12)), j12 - ((long) pVar.f26857i.f26817f));
    }
}
