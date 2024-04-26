package de;

import de.w0;
import kd.o;
import l0.e;
import md.d;
import md.f;
import td.l;
import ud.k;

/* compiled from: AbstractCoroutine.kt */
public abstract class a<T> extends b1 implements w0, d<T> {

    /* renamed from: b  reason: collision with root package name */
    public final f f13255b;

    public a(f fVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            B((w0) fVar.get(w0.b.f13339a));
        }
        this.f13255b = fVar.plus(this);
    }

    public final void A(Throwable th) {
        o.a.g(this.f13255b, th);
    }

    public String E() {
        return super.E();
    }

    public final void K(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            Throwable th = nVar.f13313a;
            nVar.a();
        }
    }

    public void U(Object obj) {
        c(obj);
    }

    public boolean a() {
        return super.a();
    }

    public final void g(Object obj) {
        Object D = D(e.n(obj, (l<? super Throwable, o>) null));
        if (D != c1.f13272b) {
            U(D);
        }
    }

    public final f getContext() {
        return this.f13255b;
    }

    public f i() {
        return this.f13255b;
    }

    public String l() {
        return k.j(getClass().getSimpleName(), " was cancelled");
    }
}
