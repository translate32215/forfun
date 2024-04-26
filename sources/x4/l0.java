package x4;

import android.os.Handler;
import android.util.Pair;
import c5.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import u6.i;
import v6.e0;
import z5.d0;
import z5.k;
import z5.l;
import z5.m;
import z5.n;
import z5.o;
import z5.r;
import z5.v;

/* compiled from: MediaSourceList */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f27645a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final IdentityHashMap<o, c> f27646b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, c> f27647c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final d f27648d;

    /* renamed from: e  reason: collision with root package name */
    public final v.a f27649e;

    /* renamed from: f  reason: collision with root package name */
    public final j.a f27650f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<c, b> f27651g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<c> f27652h;

    /* renamed from: i  reason: collision with root package name */
    public d0 f27653i = new d0.a(0, new Random());

    /* renamed from: j  reason: collision with root package name */
    public boolean f27654j;

    /* renamed from: k  reason: collision with root package name */
    public i f27655k;

    /* compiled from: MediaSourceList */
    public final class a implements v, j {

        /* renamed from: a  reason: collision with root package name */
        public final c f27656a;

        /* renamed from: b  reason: collision with root package name */
        public v.a f27657b;

        /* renamed from: c  reason: collision with root package name */
        public j.a f27658c;

        public a(c cVar) {
            this.f27657b = l0.this.f27649e;
            this.f27658c = l0.this.f27650f;
            this.f27656a = cVar;
        }

        public void B(int i10, r.a aVar, k kVar, n nVar) {
            if (a(i10, aVar)) {
                this.f27657b.o(kVar, nVar);
            }
        }

        public void E(int i10, r.a aVar) {
            if (a(i10, aVar)) {
                this.f27658c.f();
            }
        }

        public void H(int i10, r.a aVar, k kVar, n nVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f27657b.l(kVar, nVar, iOException, z10);
            }
        }

        public void N(int i10, r.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f27658c.e(exc);
            }
        }

        public void O(int i10, r.a aVar, n nVar) {
            if (a(i10, aVar)) {
                this.f27657b.c(nVar);
            }
        }

        public void R(int i10, r.a aVar, n nVar) {
            if (a(i10, aVar)) {
                this.f27657b.q(nVar);
            }
        }

        public void U(int i10, r.a aVar) {
            if (a(i10, aVar)) {
                this.f27658c.c();
            }
        }

        public final boolean a(int i10, r.a aVar) {
            r.a aVar2 = null;
            if (aVar != null) {
                c cVar = this.f27656a;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f27665c.size()) {
                        break;
                    } else if (cVar.f27665c.get(i11).f28630d == aVar.f28630d) {
                        aVar2 = aVar.b(Pair.create(cVar.f27664b, aVar.f28627a));
                        break;
                    } else {
                        i11++;
                    }
                }
                if (aVar2 == null) {
                    return false;
                }
            }
            int i12 = i10 + this.f27656a.f27666d;
            v.a aVar3 = this.f27657b;
            if (aVar3.f28648a != i12 || !e0.a(aVar3.f28649b, aVar2)) {
                this.f27657b = l0.this.f27649e.r(i12, aVar2, 0);
            }
            j.a aVar4 = this.f27658c;
            if (aVar4.f4330a == i12 && e0.a(aVar4.f4331b, aVar2)) {
                return true;
            }
            this.f27658c = l0.this.f27650f.g(i12, aVar2);
            return true;
        }

        public void i(int i10, r.a aVar, k kVar, n nVar) {
            if (a(i10, aVar)) {
                this.f27657b.f(kVar, nVar);
            }
        }

        public void t(int i10, r.a aVar) {
            if (a(i10, aVar)) {
                this.f27658c.b();
            }
        }

        public void u(int i10, r.a aVar, k kVar, n nVar) {
            if (a(i10, aVar)) {
                this.f27657b.i(kVar, nVar);
            }
        }

        public void x(int i10, r.a aVar) {
            if (a(i10, aVar)) {
                this.f27658c.d();
            }
        }

        public void y(int i10, r.a aVar) {
            if (a(i10, aVar)) {
                this.f27658c.a();
            }
        }
    }

    /* compiled from: MediaSourceList */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final r f27660a;

        /* renamed from: b  reason: collision with root package name */
        public final r.b f27661b;

        /* renamed from: c  reason: collision with root package name */
        public final v f27662c;

        public b(r rVar, r.b bVar, v vVar) {
            this.f27660a = rVar;
            this.f27661b = bVar;
            this.f27662c = vVar;
        }
    }

    /* compiled from: MediaSourceList */
    public static final class c implements j0 {

        /* renamed from: a  reason: collision with root package name */
        public final m f27663a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f27664b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<r.a> f27665c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f27666d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27667e;

        public c(r rVar, boolean z10) {
            this.f27663a = new m(rVar, z10);
        }

        public Object a() {
            return this.f27664b;
        }

        public c1 b() {
            return this.f27663a.f28611v;
        }
    }

    /* compiled from: MediaSourceList */
    public interface d {
    }

    public l0(d dVar, y4.v vVar, Handler handler) {
        this.f27648d = dVar;
        v.a aVar = new v.a();
        this.f27649e = aVar;
        j.a aVar2 = new j.a();
        this.f27650f = aVar2;
        this.f27651g = new HashMap<>();
        this.f27652h = new HashSet();
        if (vVar != null) {
            aVar.f28650c.add(new v.a.C0289a(handler, vVar));
            aVar2.f4332c.add(new j.a.C0061a(handler, vVar));
        }
    }

    public c1 a(int i10, List<c> list, d0 d0Var) {
        if (!list.isEmpty()) {
            this.f27653i = d0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f27645a.get(i11 - 1);
                    m.a aVar = cVar2.f27663a.f28611v;
                    cVar.f27666d = aVar.p() + cVar2.f27666d;
                    cVar.f27667e = false;
                    cVar.f27665c.clear();
                } else {
                    cVar.f27666d = 0;
                    cVar.f27667e = false;
                    cVar.f27665c.clear();
                }
                b(i11, cVar.f27663a.f28611v.p());
                this.f27645a.add(i11, cVar);
                this.f27647c.put(cVar.f27664b, cVar);
                if (this.f27654j) {
                    g(cVar);
                    if (this.f27646b.isEmpty()) {
                        this.f27652h.add(cVar);
                    } else {
                        b bVar = this.f27651g.get(cVar);
                        if (bVar != null) {
                            bVar.f27660a.j(bVar.f27661b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public final void b(int i10, int i11) {
        while (i10 < this.f27645a.size()) {
            this.f27645a.get(i10).f27666d += i11;
            i10++;
        }
    }

    public c1 c() {
        if (this.f27645a.isEmpty()) {
            return c1.f27461a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27645a.size(); i11++) {
            c cVar = this.f27645a.get(i11);
            cVar.f27666d = i10;
            i10 += cVar.f27663a.f28611v.p();
        }
        return new t0(this.f27645a, this.f27653i);
    }

    public final void d() {
        Iterator<c> it = this.f27652h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f27665c.isEmpty()) {
                b bVar = this.f27651g.get(next);
                if (bVar != null) {
                    bVar.f27660a.j(bVar.f27661b);
                }
                it.remove();
            }
        }
    }

    public int e() {
        return this.f27645a.size();
    }

    public final void f(c cVar) {
        if (cVar.f27667e && cVar.f27665c.isEmpty()) {
            b remove = this.f27651g.remove(cVar);
            remove.getClass();
            remove.f27660a.b(remove.f27661b);
            remove.f27660a.l(remove.f27662c);
            this.f27652h.remove(cVar);
        }
    }

    public final void g(c cVar) {
        m mVar = cVar.f27663a;
        k0 k0Var = new k0(this);
        a aVar = new a(cVar);
        this.f27651g.put(cVar, new b(mVar, k0Var, aVar));
        Handler handler = new Handler(e0.t(), (Handler.Callback) null);
        mVar.getClass();
        v.a aVar2 = mVar.f28511c;
        aVar2.getClass();
        aVar2.f28650c.add(new v.a.C0289a(handler, aVar));
        Handler handler2 = new Handler(e0.t(), (Handler.Callback) null);
        j.a aVar3 = mVar.f28512d;
        aVar3.getClass();
        aVar3.f4332c.add(new j.a.C0061a(handler2, aVar));
        mVar.f(k0Var, this.f27655k);
    }

    public void h(o oVar) {
        c remove = this.f27646b.remove(oVar);
        remove.getClass();
        remove.f27663a.g(oVar);
        remove.f27665c.remove(((l) oVar).f28600a);
        if (!this.f27646b.isEmpty()) {
            d();
        }
        f(remove);
    }

    public final void i(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f27645a.remove(i12);
            this.f27647c.remove(remove.f27664b);
            b(i12, -remove.f27663a.f28611v.p());
            remove.f27667e = true;
            if (this.f27654j) {
                f(remove);
            }
        }
    }
}
