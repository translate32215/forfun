package androidx.lifecycle;

import de.c0;
import de.d0;
import de.g;
import de.w0;
import de.y;
import java.util.concurrent.CancellationException;
import kd.o;
import md.d;
import md.e;
import md.f;
import nd.a;
import od.e;
import od.h;
import td.p;

@e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {189}, m = "invokeSuspend")
/* compiled from: CoroutineLiveData.kt */
public final class c extends h implements p<y, d<? super o>, Object> {

    /* renamed from: e  reason: collision with root package name */
    public int f2625e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e<Object> f2626f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e<Object> eVar, d<? super c> dVar) {
        super(2, dVar);
        this.f2626f = eVar;
    }

    public final d<o> a(Object obj, d<?> dVar) {
        return new c(this.f2626f, dVar);
    }

    public Object h(Object obj, Object obj2) {
        y yVar = (y) obj;
        return new c(this.f2626f, (d) obj2).l(o.f20627a);
    }

    public final Object l(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f2625e;
        if (i10 == 0) {
            l0.e.l(obj);
            long j10 = this.f2626f.f2632c;
            this.f2625e = 1;
            if (j10 <= 0) {
                obj2 = o.f20627a;
            } else {
                g gVar = new g(q.a.k(this), 1);
                gVar.s();
                if (j10 < Long.MAX_VALUE) {
                    f fVar = gVar.f13284e;
                    int i11 = md.e.X;
                    f.b bVar = fVar.get(e.a.f21795a);
                    d0 d0Var = bVar instanceof d0 ? (d0) bVar : null;
                    if (d0Var == null) {
                        d0Var = c0.f13270b;
                    }
                    d0Var.o(j10, gVar);
                }
                obj2 = gVar.r();
                if (obj2 != aVar) {
                    obj2 = o.f20627a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.e.l(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.f2626f.f2630a.e()) {
            w0 w0Var = this.f2626f.f2635f;
            if (w0Var != null) {
                w0Var.V((CancellationException) null);
            }
            this.f2626f.f2635f = null;
        }
        return o.f20627a;
    }
}
