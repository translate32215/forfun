package androidx.lifecycle;

import android.annotation.SuppressLint;
import de.e0;
import de.g0;
import de.o1;
import de.s;
import de.u;
import de.y;
import ie.n;
import ie.r;
import ie.t;
import kd.o;
import md.d;
import md.e;
import md.f;
import od.c;
import od.e;
import od.h;
import td.l;
import td.p;
import ud.k;

/* compiled from: CoroutineLiveData.kt */
public final class z<T> implements y<T> {

    /* renamed from: a  reason: collision with root package name */
    public h<T> f2739a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2740b;

    @e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {100}, m = "invokeSuspend")
    /* compiled from: CoroutineLiveData.kt */
    public static final class a extends h implements p<y, d<? super o>, Object> {

        /* renamed from: e  reason: collision with root package name */
        public int f2741e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ z<T> f2742f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ T f2743g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(z<T> zVar, T t10, d<? super a> dVar) {
            super(2, dVar);
            this.f2742f = zVar;
            this.f2743g = t10;
        }

        public final d<o> a(Object obj, d<?> dVar) {
            return new a(this.f2742f, this.f2743g, dVar);
        }

        public Object h(Object obj, Object obj2) {
            y yVar = (y) obj;
            return new a(this.f2742f, this.f2743g, (d) obj2).l(o.f20627a);
        }

        public final Object l(Object obj) {
            nd.a aVar = nd.a.COROUTINE_SUSPENDED;
            int i10 = this.f2741e;
            if (i10 == 0) {
                l0.e.l(obj);
                h<T> hVar = this.f2742f.f2739a;
                this.f2741e = 1;
                hVar.o(this);
                if (o.f20627a == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                l0.e.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f2742f.f2739a.l(this.f2743g);
            return o.f20627a;
        }
    }

    public z(h<T> hVar, f fVar) {
        k.f(hVar, "target");
        k.f(fVar, "context");
        this.f2739a = hVar;
        u uVar = g0.f13286a;
        this.f2740b = fVar.plus(n.f19394a.i0());
    }

    @SuppressLint({"NullSafeMutableLiveData"})
    public Object a(T t10, d<? super o> dVar) {
        f fVar;
        Object obj;
        f fVar2 = this.f2740b;
        a aVar = new a(this, t10, (d<? super a>) null);
        f fVar3 = ((c) dVar).f23685b;
        k.c(fVar3);
        if (!s.b(fVar2)) {
            fVar = fVar3.plus(fVar2);
        } else {
            fVar = s.a(fVar3, fVar2, false);
        }
        e.a.d(fVar);
        if (fVar == fVar3) {
            r rVar = new r(fVar, dVar);
            obj = p.a.c(rVar, rVar, aVar);
        } else {
            int i10 = md.e.X;
            e.a aVar2 = e.a.f21795a;
            if (k.a(fVar.get(aVar2), fVar3.get(aVar2))) {
                o1 o1Var = new o1(fVar, dVar);
                Object c10 = t.c(fVar, (Object) null);
                try {
                    obj = p.a.c(o1Var, o1Var, aVar);
                } finally {
                    t.a(fVar, c10);
                }
            } else {
                e0 e0Var = new e0(fVar, dVar);
                o.a.h(aVar, e0Var, e0Var, (l) null, 4);
                obj = e0Var.W();
            }
        }
        if (obj == nd.a.COROUTINE_SUSPENDED) {
            return obj;
        }
        return o.f20627a;
    }
}
