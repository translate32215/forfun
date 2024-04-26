package gf;

import ae.g;
import gf.l;
import kd.d;
import kd.e;
import td.a;
import ud.q;
import ud.v;

/* compiled from: lateinit.kt */
public final class z implements l {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ g[] f18702b;

    /* renamed from: a  reason: collision with root package name */
    public final d f18703a;

    static {
        q qVar = new q(v.a(z.class), "baseKodein", "getBaseKodein()Lorg/kodein/di/Kodein;");
        v.f26198a.getClass();
        f18702b = new g[]{qVar};
    }

    public z(a<? extends l> aVar) {
        this.f18703a = e.b(aVar);
    }

    public l j() {
        return this;
    }

    public q t() {
        d dVar = this.f18703a;
        g gVar = f18702b[0];
        return ((l) dVar.getValue()).t();
    }

    public x w() {
        return null;
    }

    public s<?> z() {
        return l.c.a(this);
    }
}
