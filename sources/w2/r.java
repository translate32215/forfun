package w2;

import b3.o;
import c3.b;
import java.util.ArrayList;
import java.util.List;
import x2.a;

/* compiled from: TrimPathContent */
public class r implements b, a.b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26993a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a.b> f26994b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f26995c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Float> f26996d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, Float> f26997e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f26998f;

    public r(b bVar, o oVar) {
        this.f26993a = oVar.f3548f;
        this.f26995c = oVar.f3544b;
        a<Float, Float> a10 = oVar.f3545c.a();
        this.f26996d = a10;
        a<Float, Float> a11 = oVar.f3546d.a();
        this.f26997e = a11;
        a<Float, Float> a12 = oVar.f3547e.a();
        this.f26998f = a12;
        bVar.g(a10);
        bVar.g(a11);
        bVar.g(a12);
        a10.f27249a.add(this);
        a11.f27249a.add(this);
        a12.f27249a.add(this);
    }

    public void d() {
        for (int i10 = 0; i10 < this.f26994b.size(); i10++) {
            this.f26994b.get(i10).d();
        }
    }

    public void f(List<b> list, List<b> list2) {
    }
}
