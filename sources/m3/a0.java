package m3;

import com.bumptech.glide.load.data.d;
import k3.c;
import m3.g;
import q3.m;

/* compiled from: SourceGenerator */
public class a0 implements d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m.a f21504a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f21505b;

    public a0(b0 b0Var, m.a aVar) {
        this.f21505b = b0Var;
        this.f21504a = aVar;
    }

    public void c(Exception exc) {
        b0 b0Var = this.f21505b;
        m.a<?> aVar = this.f21504a;
        m.a<?> aVar2 = b0Var.f21512f;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f21505b;
            m.a aVar3 = this.f21504a;
            g.a aVar4 = b0Var2.f21508b;
            e eVar = b0Var2.f21513g;
            d<Data> dVar = aVar3.f24106c;
            aVar4.c(eVar, exc, dVar, dVar.e());
        }
    }

    public void d(Object obj) {
        b0 b0Var = this.f21505b;
        m.a<?> aVar = this.f21504a;
        m.a<?> aVar2 = b0Var.f21512f;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f21505b;
            m.a aVar3 = this.f21504a;
            k kVar = b0Var2.f21507a.f21543p;
            if (obj == null || !kVar.c(aVar3.f24106c.e())) {
                g.a aVar4 = b0Var2.f21508b;
                c cVar = aVar3.f24104a;
                d<Data> dVar = aVar3.f24106c;
                aVar4.b(cVar, obj, dVar, dVar.e(), b0Var2.f21513g);
                return;
            }
            b0Var2.f21511e = obj;
            b0Var2.f21508b.a();
        }
    }
}
