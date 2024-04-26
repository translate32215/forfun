package jf;

import gf.d0;
import gf.g0;
import gf.j0;
import gf.l;
import java.util.ArrayList;
import java.util.List;
import jf.h;
import kd.o;
import td.l;
import ud.k;

/* compiled from: standardBindings.kt */
public final class w<C, T> implements h, a {

    /* renamed from: a  reason: collision with root package name */
    public final n f19819a = x.f19829a;

    /* renamed from: b  reason: collision with root package name */
    public final r<o> f19820b = new r<>(new Object(), o.f20627a);

    /* renamed from: c  reason: collision with root package name */
    public final p<C> f19821c;

    /* renamed from: d  reason: collision with root package name */
    public final g0<? super C> f19822d;

    /* renamed from: e  reason: collision with root package name */
    public final g0<? extends T> f19823e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19824f;

    /* renamed from: g  reason: collision with root package name */
    public final l<k<? extends C>, T> f19825g;

    /* compiled from: standardBindings.kt */
    public static final class a extends ud.l implements l<o, T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w f19826b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s f19827c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f19828d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w wVar, s sVar, c cVar) {
            super(1);
            this.f19826b = wVar;
            this.f19827c = sVar;
            this.f19828d = cVar;
        }

        public Object c(Object obj) {
            k.g((o) obj, "it");
            s sVar = this.f19827c;
            w wVar = this.f19826b;
            Object b10 = sVar.b(wVar.f19820b, wVar.f19824f, new v(this));
            if (b10 != null) {
                return b10;
            }
            throw new kd.l("null cannot be cast to non-null type T");
        }
    }

    public w(p<? super C> pVar, g0<? super C> g0Var, g0<? extends T> g0Var2, n nVar, boolean z10, l<? super k<? extends C>, ? extends T> lVar) {
        k.g(pVar, "scope");
        k.g(g0Var, "contextType");
        this.f19821c = pVar;
        this.f19822d = g0Var;
        this.f19823e = g0Var2;
        this.f19824f = z10;
        this.f19825g = lVar;
        int i10 = h.a.f19802a;
    }

    public g0<? super C> a() {
        return this.f19822d;
    }

    public p<C> b() {
        return this.f19821c;
    }

    public l<o, T> c(c<? extends C> cVar, l.e<? super C, ? super o, ? extends T> eVar) {
        return new a(this, this.f19821c.a(((kf.a) cVar).f20892b), cVar);
    }

    public String d() {
        return h.b.b(this);
    }

    public boolean e() {
        return false;
    }

    public String f() {
        ArrayList arrayList = new ArrayList(2);
        if (!k.a(this.f19819a, x.f19829a)) {
            StringBuilder a10 = android.support.v4.media.a.a("ref = ");
            a10.append(((gf.k) j0.c(this.f19819a)).e());
            arrayList.add(a10.toString());
        }
        return j(arrayList);
    }

    public g0<o> g() {
        d0 d0Var = d0.f18660c;
        return d0.f18658a;
    }

    public String getDescription() {
        return h.b.a(this);
    }

    public g0<? extends T> h() {
        return this.f19823e;
    }

    public String i() {
        ArrayList arrayList = new ArrayList(2);
        if (!k.a(this.f19819a, x.f19829a)) {
            StringBuilder a10 = android.support.v4.media.a.a("ref = ");
            a10.append(((gf.k) j0.c(this.f19819a)).a());
            arrayList.add(a10.toString());
        }
        return j(arrayList);
    }

    public final String j(List<String> list) {
        StringBuilder a10 = android.support.v4.media.a.a("singleton");
        if (!list.isEmpty()) {
            a10.append(ld.l.m(list, ", ", "(", ")", 0, (CharSequence) null, (td.l) null, 56));
        }
        String sb2 = a10.toString();
        k.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
