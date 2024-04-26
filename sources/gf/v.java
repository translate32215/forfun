package gf;

import ae.g;
import gf.s;
import kd.d;
import kd.e;
import td.p;
import ud.k;
import ud.l;

/* compiled from: properties.kt */
public final class v<V> {

    /* renamed from: a  reason: collision with root package name */
    public final s<?> f18695a;

    /* renamed from: b  reason: collision with root package name */
    public final p<s<?>, String, V> f18696b;

    /* compiled from: properties.kt */
    public static final class a extends l implements td.a<V> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v f18697b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f18698c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g f18699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar, Object obj, g gVar) {
            super(0);
            this.f18697b = vVar;
            this.f18698c = obj;
            this.f18699d = gVar;
        }

        public final V d() {
            Object obj;
            Object obj2 = this.f18698c;
            if (obj2 != null) {
                s<?> sVar = this.f18697b.f18695a;
                g gVar = g.f18665b;
                if (sVar == g.f18664a) {
                    g[] gVarArr = j0.f18667a;
                    k.g(obj2, "obj");
                    obj = new s.a(new f(obj2.getClass()), this.f18698c);
                    return this.f18697b.f18696b.h(obj, this.f18699d.a());
                }
            }
            obj = this.f18697b.f18695a;
            return this.f18697b.f18696b.h(obj, this.f18699d.a());
        }
    }

    public v(s sVar, p pVar) {
        k.g(sVar, "originalContext");
        this.f18695a = sVar;
        this.f18696b = pVar;
    }

    public d<V> a(Object obj, g<? extends Object> gVar) {
        k.g(gVar, "prop");
        return e.b(new a(this, obj, gVar));
    }
}
