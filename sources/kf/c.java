package kf;

import gf.d0;
import gf.g0;
import gf.l;
import java.util.Set;
import jf.e;
import jf.h;
import jf.m;
import jf.p;
import ud.k;

/* compiled from: KodeinBuilderImpl.kt */
public class c implements l.b {

    /* renamed from: a  reason: collision with root package name */
    public final g0<Object> f20895a = d0.f18659b;

    /* renamed from: b  reason: collision with root package name */
    public final String f20896b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20897c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f20898d;

    /* renamed from: e  reason: collision with root package name */
    public final d f20899e;

    /* compiled from: KodeinBuilderImpl.kt */
    public final class a implements l.b.C0151b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f20900a;

        /* renamed from: b  reason: collision with root package name */
        public final Boolean f20901b;

        public a(Object obj, Boolean bool) {
            this.f20900a = obj;
            this.f20901b = bool;
        }

        public <C, A, T> void a(h<? super C, ? super A, ? extends T> hVar) {
            if (!k.a(hVar.h(), d0.f18658a)) {
                c.this.f20899e.a(new l.e(hVar.a(), hVar.g(), hVar.h(), this.f20900a), hVar, c.this.f20896b, this.f20901b);
                return;
            }
            StringBuilder a10 = android.support.v4.media.a.a("Using `bind() from` with a *Unit* ");
            a10.append(hVar.f());
            a10.append(" is most likely an error. If you are sure you want to bind the Unit type, please use `bind<Unit>() with ");
            a10.append(hVar.f());
            a10.append("`.");
            throw new IllegalArgumentException(a10.toString());
        }
    }

    /* compiled from: KodeinBuilderImpl.kt */
    public final class b<T> implements l.b.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final g0<? extends T> f20903a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f20904b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f20905c;

        public b(g0<? extends T> g0Var, Object obj, Boolean bool) {
            this.f20903a = g0Var;
            this.f20904b = obj;
            this.f20905c = bool;
        }

        public <C, A> void a(h<? super C, ? super A, ? extends T> hVar) {
            d dVar = c.this.f20899e;
            g0<? super C> g0Var = ((m) hVar).f19805a;
            d0 d0Var = d0.f18660c;
            dVar.a(new l.e(g0Var, d0.f18658a, this.f20903a, this.f20904b), hVar, c.this.f20896b, this.f20905c);
        }
    }

    public c(String str, String str2, Set<String> set, d dVar) {
        k.g(str2, "prefix");
        k.g(set, "importedModules");
        this.f20896b = str;
        this.f20897c = str2;
        this.f20898d = set;
        this.f20899e = dVar;
        d0 d0Var = d0.f18660c;
    }

    public g0<Object> a() {
        return this.f20895a;
    }

    public p<Object> b() {
        return new jf.l();
    }

    public l.b.c c(g0 g0Var, Object obj, Boolean bool) {
        k.g(g0Var, "type");
        return new b(g0Var, obj, bool);
    }

    public void d(l.g gVar, boolean z10) {
        k.g(gVar, "module");
        String str = this.f20897c + gVar.f18679a;
        if (!(str.length() > 0) || !this.f20898d.contains(str)) {
            this.f20898d.add(str);
            String str2 = this.f20897c + gVar.f18681c;
            Set<String> set = this.f20898d;
            d dVar = this.f20899e;
            boolean z11 = gVar.f18680b;
            if (dVar.f20907a.a() || !z10) {
                gVar.f18682d.c(new c(str, str2, set, new d(z10, z11, dVar.f20908b, dVar.f20909c, dVar.f20910d)));
                return;
            }
            throw new l.i("Overriding has been forbidden");
        }
        throw new IllegalStateException(q.b.a("Module \"", str, "\" has already been imported!"));
    }

    public l.b.C0151b e(Object obj, Boolean bool) {
        return new a(obj, bool);
    }

    public void f(l.g gVar, boolean z10) {
        k.g(gVar, "module");
        if (gVar.f18679a.length() == 0) {
            throw new IllegalStateException("importOnce must be given a named module.");
        } else if (!this.f20898d.contains(gVar.f18679a)) {
            d(gVar, z10);
        }
    }

    public void g(e<?, ?> eVar) {
        d dVar = this.f20899e;
        dVar.getClass();
        dVar.f20910d.add(eVar);
    }
}
