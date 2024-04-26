package x2;

import b3.c;
import g3.f;
import h3.a;
import java.util.List;
import o1.p;

/* compiled from: GradientColorKeyframeAnimation */
public class d extends f<c> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f27263i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f27264j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(List list, int i10) {
        super(list);
        this.f27263i = i10;
        if (i10 != 1) {
            int i11 = 0;
            c cVar = (c) ((a) list.get(0)).f18868b;
            i11 = cVar != null ? cVar.f3466b.length : i11;
            this.f27264j = new c(new float[i11], new int[i11]);
            return;
        }
        super(list);
        this.f27264j = new h3.c();
    }

    public Object f(a aVar, float f10) {
        T t10;
        switch (this.f27263i) {
            case 0:
                c cVar = (c) this.f27264j;
                c cVar2 = (c) aVar.f18868b;
                c cVar3 = (c) aVar.f18869c;
                cVar.getClass();
                if (cVar2.f3466b.length == cVar3.f3466b.length) {
                    for (int i10 = 0; i10 < cVar2.f3466b.length; i10++) {
                        cVar.f3465a[i10] = f.e(cVar2.f3465a[i10], cVar3.f3465a[i10], f10);
                        cVar.f3466b[i10] = q.a.i(f10, cVar2.f3466b[i10], cVar3.f3466b[i10]);
                    }
                    return (c) this.f27264j;
                }
                throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar2.f3466b.length + " vs " + cVar3.f3466b.length + ")");
            default:
                T t11 = aVar.f18868b;
                if (t11 == null || (t10 = aVar.f18869c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                h3.c cVar4 = (h3.c) t11;
                h3.c cVar5 = (h3.c) t10;
                p pVar = this.f27253e;
                if (pVar != null) {
                    h3.c cVar6 = (h3.c) pVar.b(aVar.f18871e, aVar.f18872f.floatValue(), cVar4, cVar5, f10, d(), this.f27252d);
                    if (cVar6 != null) {
                        return cVar6;
                    }
                }
                h3.c cVar7 = (h3.c) this.f27264j;
                float e10 = f.e(cVar4.f18883a, cVar5.f18883a, f10);
                float e11 = f.e(cVar4.f18884b, cVar5.f18884b, f10);
                cVar7.f18883a = e10;
                cVar7.f18884b = e11;
                return (h3.c) this.f27264j;
        }
    }
}
