package kf;

import ae.g;
import gf.l;
import gf.s;
import gf.x;
import kd.d;
import kd.e;
import kd.o;
import ud.f;
import ud.k;
import ud.q;
import ud.v;

/* compiled from: KodeinImpl.kt */
public class j implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ g[] f20930c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f20931d = new a((f) null);

    /* renamed from: a  reason: collision with root package name */
    public final d f20932a = e.b(new k(this));

    /* renamed from: b  reason: collision with root package name */
    public final e f20933b;

    /* compiled from: KodeinImpl.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        q qVar = new q(v.a(j.class), "container", "getContainer()Lorg/kodein/di/KodeinContainer;");
        v.f26198a.getClass();
        f20930c = new g[]{qVar};
    }

    public j(boolean z10, td.l<? super l.f, o> lVar) {
        k.g(lVar, "init");
        f20931d.getClass();
        l lVar2 = new l(z10);
        lVar.c(lVar2);
        e eVar = new e(lVar2.f20899e, lVar2.f20935f, false, true);
        k.g(eVar, "_container");
        this.f20933b = eVar;
    }

    public l j() {
        return this;
    }

    public final gf.q t() {
        d dVar = this.f20932a;
        g gVar = f20930c[0];
        return (gf.q) dVar.getValue();
    }

    public x w() {
        return null;
    }

    public s<?> z() {
        gf.g gVar = gf.g.f18665b;
        return gf.g.f18664a;
    }
}
