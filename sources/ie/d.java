package ie;

import android.support.v4.media.a;
import b2.t;
import de.a0;
import de.f0;
import de.g;
import de.k0;
import de.m1;
import de.o;
import de.u;
import ie.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l0.e;
import md.f;
import td.l;
import ud.k;

/* compiled from: DispatchedContinuation.kt */
public final class d<T> extends f0<T> implements od.d, md.d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19366h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: d  reason: collision with root package name */
    public final u f19367d;

    /* renamed from: e  reason: collision with root package name */
    public final md.d<T> f19368e;

    /* renamed from: f  reason: collision with root package name */
    public Object f19369f = e.f19371a;

    /* renamed from: g  reason: collision with root package name */
    public final Object f19370g;

    public d(u uVar, md.d<? super T> dVar) {
        super(-1);
        this.f19367d = uVar;
        this.f19368e = dVar;
        f context = getContext();
        t tVar = t.f19398a;
        Object fold = context.fold(0, t.a.f19399b);
        k.c(fold);
        this.f19370g = fold;
        this._reusableCancellableContinuation = null;
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof o) {
            ((o) obj).f13318b.c(th);
        }
    }

    public md.d<T> b() {
        return this;
    }

    public od.d f() {
        md.d<T> dVar = this.f19368e;
        if (dVar instanceof od.d) {
            return (od.d) dVar;
        }
        return null;
    }

    public void g(Object obj) {
        f context;
        Object c10;
        f context2 = this.f19368e.getContext();
        Object n10 = e.n(obj, (l<? super Throwable, kd.o>) null);
        if (this.f19367d.h0(context2)) {
            this.f19369f = n10;
            this.f13280c = 0;
            this.f19367d.f0(context2, this);
            return;
        }
        m1 m1Var = m1.f13310a;
        k0 a10 = m1.a();
        if (a10.m0()) {
            this.f19369f = n10;
            this.f13280c = 0;
            a10.k0(this);
            return;
        }
        a10.l0(true);
        try {
            context = getContext();
            c10 = t.c(context, this.f19370g);
            this.f19368e.g(obj);
            t.a(context, c10);
            do {
            } while (a10.n0());
        } catch (Throwable th) {
            try {
                e(th, (Throwable) null);
            } catch (Throwable th2) {
                a10.i0(true);
                throw th2;
            }
        }
        a10.i0(true);
    }

    public f getContext() {
        return this.f19368e.getContext();
    }

    public Object h() {
        Object obj = this.f19369f;
        this.f19369f = e.f19371a;
        return obj;
    }

    public final boolean i() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean l(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            b2.t tVar = e.f19372b;
            if (k.a(obj, tVar)) {
                if (f19366h.compareAndSet(this, tVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f19366h.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void m() {
        do {
        } while (this._reusableCancellableContinuation == e.f19372b);
        Object obj = this._reusableCancellableContinuation;
        g gVar = obj instanceof g ? (g) obj : null;
        if (gVar != null) {
            gVar.o();
        }
    }

    public final Throwable n(de.f<?> fVar) {
        b2.t tVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            tVar = e.f19372b;
            if (obj != tVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(k.j("Inconsistent state ", obj).toString());
                } else if (f19366h.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f19366h.compareAndSet(this, tVar, fVar));
        return null;
    }

    public String toString() {
        StringBuilder a10 = a.a("DispatchedContinuation[");
        a10.append(this.f19367d);
        a10.append(", ");
        a10.append(a0.d(this.f19368e));
        a10.append(']');
        return a10.toString();
    }
}
