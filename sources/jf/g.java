package jf;

import gf.g0;
import gf.l;
import jf.h;
import td.p;
import ud.l;

/* compiled from: standardBindings.kt */
public final class g<C, A, T> implements h<C, A, T> {

    /* renamed from: a  reason: collision with root package name */
    public final g0<? super C> f19796a;

    /* renamed from: b  reason: collision with root package name */
    public final g0<? super A> f19797b;

    /* renamed from: c  reason: collision with root package name */
    public final g0<? extends T> f19798c;

    /* renamed from: d  reason: collision with root package name */
    public final p<c<? extends C>, A, T> f19799d;

    /* compiled from: standardBindings.kt */
    public static final class a extends l implements td.l<A, T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f19800b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f19801c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, c cVar) {
            super(1);
            this.f19800b = gVar;
            this.f19801c = cVar;
        }

        public final T c(A a10) {
            return this.f19800b.f19799d.h(this.f19801c, a10);
        }
    }

    public g(g0<? super C> g0Var, g0<? super A> g0Var2, g0<? extends T> g0Var3, p<? super c<? extends C>, ? super A, ? extends T> pVar) {
        this.f19796a = g0Var;
        this.f19797b = g0Var2;
        this.f19798c = g0Var3;
        this.f19799d = pVar;
    }

    public g0<? super C> a() {
        return this.f19796a;
    }

    public p<C> b() {
        return null;
    }

    public td.l<A, T> c(c<? extends C> cVar, l.e<? super C, ? super A, ? extends T> eVar) {
        return new a(this, cVar);
    }

    public String d() {
        return h.b.b(this);
    }

    public boolean e() {
        return false;
    }

    public String f() {
        return "factory";
    }

    public g0<? super A> g() {
        return this.f19797b;
    }

    public String getDescription() {
        return h.b.a(this);
    }

    public g0<? extends T> h() {
        return this.f19798c;
    }

    public String i() {
        return "factory";
    }
}
