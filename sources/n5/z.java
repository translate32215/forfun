package n5;

import d5.a0;
import d5.k;
import java.util.List;
import n5.e0;
import v6.a;
import x4.b0;

/* compiled from: SeiReader */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final List<b0> f22337a;

    /* renamed from: b  reason: collision with root package name */
    public final a0[] f22338b;

    public z(List<b0> list) {
        this.f22337a = list;
        this.f22338b = new a0[list.size()];
    }

    public void a(k kVar, e0.d dVar) {
        for (int i10 = 0; i10 < this.f22338b.length; i10++) {
            dVar.a();
            a0 l10 = kVar.l(dVar.c(), 3);
            b0 b0Var = this.f22337a.get(i10);
            String str = b0Var.f27408t;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a.b(z10, "Invalid closed caption mime type provided: " + str);
            String str2 = b0Var.f27397a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            b0.b bVar = new b0.b();
            bVar.f27415a = str2;
            bVar.f27425k = str;
            bVar.f27418d = b0Var.f27400d;
            bVar.f27417c = b0Var.f27399c;
            bVar.C = b0Var.L;
            bVar.f27427m = b0Var.f27410v;
            l10.c(bVar.a());
            this.f22338b[i10] = l10;
        }
    }
}
