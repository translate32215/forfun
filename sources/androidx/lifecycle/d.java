package androidx.lifecycle;

import de.y;
import kd.o;
import nd.a;
import od.e;
import od.h;
import td.p;

@e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {178}, m = "invokeSuspend")
/* compiled from: CoroutineLiveData.kt */
public final class d extends h implements p<y, md.d<? super o>, Object> {

    /* renamed from: e  reason: collision with root package name */
    public int f2627e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f2628f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e<Object> f2629g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e<Object> eVar, md.d<? super d> dVar) {
        super(2, dVar);
        this.f2629g = eVar;
    }

    public final md.d<o> a(Object obj, md.d<?> dVar) {
        d dVar2 = new d(this.f2629g, dVar);
        dVar2.f2628f = obj;
        return dVar2;
    }

    public Object h(Object obj, Object obj2) {
        d dVar = new d(this.f2629g, (md.d) obj2);
        dVar.f2628f = (y) obj;
        return dVar.l(o.f20627a);
    }

    public final Object l(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f2627e;
        if (i10 == 0) {
            l0.e.l(obj);
            z zVar = new z(this.f2629g.f2630a, ((y) this.f2628f).i());
            p<y<T>, md.d<? super o>, Object> pVar = this.f2629g.f2631b;
            this.f2627e = 1;
            if (pVar.h(zVar, this) == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.e.l(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f2629g.f2634e.d();
        return o.f20627a;
    }
}
