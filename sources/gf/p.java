package gf;

import gf.l;
import gf.q;
import ud.k;
import ud.l;

/* compiled from: KodeinAware.kt */
public final class p {

    /* compiled from: KodeinAware.kt */
    public static final class a extends l implements td.p<s<?>, String, T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f18686b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g0 f18687c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f18688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o oVar, g0 g0Var, Object obj) {
            super(2);
            this.f18686b = oVar;
            this.f18687c = g0Var;
            this.f18688d = obj;
        }

        public Object h(Object obj, Object obj2) {
            s sVar = (s) obj;
            k.g(sVar, "ctx");
            k.g((String) obj2, "<anonymous parameter 1>");
            q t10 = this.f18686b.j().t();
            g0 o10 = sVar.o();
            if (o10 != null) {
                d0 d0Var = d0.f18660c;
                return q.a.a(t10, new l.e(o10, d0.f18658a, this.f18687c, this.f18688d), sVar.getValue(), 0, 4, (Object) null).d();
            }
            throw new kd.l("null cannot be cast to non-null type org.kodein.di.TypeToken<in kotlin.Any?>");
        }
    }

    public static final <T> v<T> a(o oVar, g0<? extends T> g0Var, Object obj) {
        k.g(g0Var, "type");
        oVar.w();
        return new v<>(oVar.z(), new a(oVar, g0Var, (Object) null));
    }
}
