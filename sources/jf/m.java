package jf;

import gf.d0;
import gf.g0;
import gf.l;
import jf.h;
import kd.o;
import td.l;
import ud.k;

/* compiled from: standardBindings.kt */
public final class m<C, T> implements h, a {

    /* renamed from: a  reason: collision with root package name */
    public final g0<? super C> f19805a;

    /* renamed from: b  reason: collision with root package name */
    public final g0<? extends T> f19806b;

    /* renamed from: c  reason: collision with root package name */
    public final l<i<? extends C>, T> f19807c;

    /* compiled from: standardBindings.kt */
    public static final class a extends ud.l implements l<o, T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m f19808b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f19809c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m mVar, c cVar) {
            super(1);
            this.f19808b = mVar;
            this.f19809c = cVar;
        }

        public Object c(Object obj) {
            k.g((o) obj, "it");
            return this.f19808b.f19807c.c(new j(this.f19809c));
        }
    }

    public m(g0<? super C> g0Var, g0<? extends T> g0Var2, l<? super i<? extends C>, ? extends T> lVar) {
        k.g(g0Var, "contextType");
        this.f19805a = g0Var;
        this.f19806b = g0Var2;
        this.f19807c = lVar;
    }

    public g0<? super C> a() {
        return this.f19805a;
    }

    public p<C> b() {
        return null;
    }

    public l<o, T> c(c<? extends C> cVar, l.e<? super C, ? super o, ? extends T> eVar) {
        return new a(this, cVar);
    }

    public String d() {
        return h.b.b(this);
    }

    public boolean e() {
        return false;
    }

    public String f() {
        return "provider";
    }

    public g0<o> g() {
        d0 d0Var = d0.f18660c;
        return d0.f18658a;
    }

    public String getDescription() {
        return h.b.a(this);
    }

    public g0<? extends T> h() {
        return this.f19806b;
    }

    public String i() {
        return "provider";
    }
}
