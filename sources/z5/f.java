package z5;

import android.os.Handler;
import c5.j;
import java.io.IOException;
import java.util.HashMap;
import u6.i;
import v6.e0;
import z5.m;
import z5.r;
import z5.v;

/* compiled from: CompositeMediaSource */
public abstract class f<T> extends a {

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<T, b> f28573g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public Handler f28574h;

    /* renamed from: i  reason: collision with root package name */
    public i f28575i;

    /* compiled from: CompositeMediaSource */
    public final class a implements v, j {

        /* renamed from: a  reason: collision with root package name */
        public final T f28576a;

        /* renamed from: b  reason: collision with root package name */
        public v.a f28577b;

        /* renamed from: c  reason: collision with root package name */
        public j.a f28578c;

        public a(T t10) {
            this.f28577b = f.this.r((r.a) null);
            this.f28578c = f.this.q((r.a) null);
            this.f28576a = t10;
        }

        public void B(int i10, r.a aVar, k kVar, n nVar) {
            a(i10, aVar);
            this.f28577b.o(kVar, b(nVar));
        }

        public void E(int i10, r.a aVar) {
            a(i10, aVar);
            this.f28578c.f();
        }

        public void H(int i10, r.a aVar, k kVar, n nVar, IOException iOException, boolean z10) {
            a(i10, aVar);
            this.f28577b.l(kVar, b(nVar), iOException, z10);
        }

        public void N(int i10, r.a aVar, Exception exc) {
            a(i10, aVar);
            this.f28578c.e(exc);
        }

        public void O(int i10, r.a aVar, n nVar) {
            a(i10, aVar);
            this.f28577b.c(b(nVar));
        }

        public void R(int i10, r.a aVar, n nVar) {
            a(i10, aVar);
            this.f28577b.q(b(nVar));
        }

        public void U(int i10, r.a aVar) {
            a(i10, aVar);
            this.f28578c.c();
        }

        public final boolean a(int i10, r.a aVar) {
            r.a aVar2;
            if (aVar != null) {
                f fVar = f.this;
                T t10 = this.f28576a;
                m mVar = (m) fVar;
                mVar.getClass();
                Void voidR = (Void) t10;
                Object obj = aVar.f28627a;
                Object obj2 = mVar.f28611v.f28618d;
                if (obj2 != null && obj2.equals(obj)) {
                    obj = m.a.f28616e;
                }
                aVar2 = aVar.b(obj);
            } else {
                aVar2 = null;
            }
            f.this.getClass();
            v.a aVar3 = this.f28577b;
            if (aVar3.f28648a != i10 || !e0.a(aVar3.f28649b, aVar2)) {
                this.f28577b = f.this.f28511c.r(i10, aVar2, 0);
            }
            j.a aVar4 = this.f28578c;
            if (aVar4.f4330a == i10 && e0.a(aVar4.f4331b, aVar2)) {
                return true;
            }
            this.f28578c = new j.a(f.this.f28512d.f4332c, i10, aVar2);
            return true;
        }

        public final n b(n nVar) {
            f fVar = f.this;
            long j10 = nVar.f28625f;
            fVar.getClass();
            f fVar2 = f.this;
            long j11 = nVar.f28626g;
            fVar2.getClass();
            if (j10 == nVar.f28625f && j11 == nVar.f28626g) {
                return nVar;
            }
            return new n(nVar.f28620a, nVar.f28621b, nVar.f28622c, nVar.f28623d, nVar.f28624e, j10, j11);
        }

        public void i(int i10, r.a aVar, k kVar, n nVar) {
            a(i10, aVar);
            this.f28577b.f(kVar, b(nVar));
        }

        public void t(int i10, r.a aVar) {
            a(i10, aVar);
            this.f28578c.b();
        }

        public void u(int i10, r.a aVar, k kVar, n nVar) {
            a(i10, aVar);
            this.f28577b.i(kVar, b(nVar));
        }

        public void x(int i10, r.a aVar) {
            a(i10, aVar);
            this.f28578c.d();
        }

        public void y(int i10, r.a aVar) {
            a(i10, aVar);
            this.f28578c.a();
        }
    }

    /* compiled from: CompositeMediaSource */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final r f28580a;

        /* renamed from: b  reason: collision with root package name */
        public final r.b f28581b;

        /* renamed from: c  reason: collision with root package name */
        public final v f28582c;

        public b(r rVar, r.b bVar, v vVar) {
            this.f28580a = rVar;
            this.f28581b = bVar;
            this.f28582c = vVar;
        }
    }

    public void s() {
        for (b next : this.f28573g.values()) {
            next.f28580a.j(next.f28581b);
        }
    }

    public void t() {
        for (b next : this.f28573g.values()) {
            next.f28580a.p(next.f28581b);
        }
    }

    public final void x(T t10, r rVar) {
        v6.a.a(!this.f28573g.containsKey((Object) null));
        e eVar = new e(this, (Object) null);
        a aVar = new a(null);
        this.f28573g.put((Object) null, new b(rVar, eVar, aVar));
        Handler handler = this.f28574h;
        handler.getClass();
        rVar.h(handler, aVar);
        Handler handler2 = this.f28574h;
        handler2.getClass();
        rVar.i(handler2, aVar);
        rVar.f(eVar, this.f28575i);
        if (!(!this.f28510b.isEmpty())) {
            rVar.j(eVar);
        }
    }
}
