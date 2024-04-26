package n5;

import d5.a0;
import d5.c;
import d5.k;
import java.util.List;
import n5.e0;
import v6.a;
import v6.v;
import x4.b0;

/* compiled from: UserDataReader */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<b0> f22099a;

    /* renamed from: b  reason: collision with root package name */
    public final a0[] f22100b;

    public f0(List<b0> list) {
        this.f22099a = list;
        this.f22100b = new a0[list.size()];
    }

    public void a(long j10, v vVar) {
        if (vVar.a() >= 9) {
            int f10 = vVar.f();
            int f11 = vVar.f();
            int s10 = vVar.s();
            if (f10 == 434 && f11 == 1195456820 && s10 == 3) {
                c.b(j10, vVar, this.f22100b);
            }
        }
    }

    public void b(k kVar, e0.d dVar) {
        for (int i10 = 0; i10 < this.f22100b.length; i10++) {
            dVar.a();
            a0 l10 = kVar.l(dVar.c(), 3);
            b0 b0Var = this.f22099a.get(i10);
            String str = b0Var.f27408t;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a.b(z10, "Invalid closed caption mime type provided: " + str);
            b0.b bVar = new b0.b();
            bVar.f27415a = dVar.b();
            bVar.f27425k = str;
            bVar.f27418d = b0Var.f27400d;
            bVar.f27417c = b0Var.f27399c;
            bVar.C = b0Var.L;
            bVar.f27427m = b0Var.f27410v;
            l10.c(bVar.a());
            this.f22100b[i10] = l10;
        }
    }
}
