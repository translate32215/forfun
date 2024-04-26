package m3;

import c4.g;
import c4.h;
import h4.a;
import h4.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m3.i;
import m3.q;

/* compiled from: EngineJob */
public class m<R> implements i.a<R>, a.d {
    public static final c H = new c();
    public boolean A;
    public r B;
    public boolean C;
    public q<?> D;
    public i<R> E;
    public volatile boolean F;
    public boolean G;

    /* renamed from: a  reason: collision with root package name */
    public final e f21616a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final h4.d f21617b = new d.b();

    /* renamed from: c  reason: collision with root package name */
    public final q.a f21618c;

    /* renamed from: d  reason: collision with root package name */
    public final n0.d<m<?>> f21619d;

    /* renamed from: e  reason: collision with root package name */
    public final c f21620e;

    /* renamed from: f  reason: collision with root package name */
    public final n f21621f;

    /* renamed from: g  reason: collision with root package name */
    public final p3.a f21622g;

    /* renamed from: h  reason: collision with root package name */
    public final p3.a f21623h;

    /* renamed from: i  reason: collision with root package name */
    public final p3.a f21624i;

    /* renamed from: r  reason: collision with root package name */
    public final p3.a f21625r;

    /* renamed from: s  reason: collision with root package name */
    public final AtomicInteger f21626s = new AtomicInteger();

    /* renamed from: t  reason: collision with root package name */
    public k3.c f21627t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f21628u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f21629v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f21630w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f21631x;

    /* renamed from: y  reason: collision with root package name */
    public w<?> f21632y;

    /* renamed from: z  reason: collision with root package name */
    public com.bumptech.glide.load.a f21633z;

    /* compiled from: EngineJob */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final g f21634a;

        public a(g gVar) {
            this.f21634a = gVar;
        }

        public void run() {
            h hVar = (h) this.f21634a;
            hVar.f4222b.a();
            synchronized (hVar.f4223c) {
                synchronized (m.this) {
                    if (m.this.f21616a.f21640a.contains(new d(this.f21634a, g4.e.f18455b))) {
                        m mVar = m.this;
                        g gVar = this.f21634a;
                        mVar.getClass();
                        try {
                            ((h) gVar).o(mVar.B, 5);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final g f21636a;

        public b(g gVar) {
            this.f21636a = gVar;
        }

        public void run() {
            h hVar = (h) this.f21636a;
            hVar.f4222b.a();
            synchronized (hVar.f4223c) {
                synchronized (m.this) {
                    if (m.this.f21616a.f21640a.contains(new d(this.f21636a, g4.e.f18455b))) {
                        m.this.D.d();
                        m mVar = m.this;
                        g gVar = this.f21636a;
                        mVar.getClass();
                        try {
                            ((h) gVar).p(mVar.D, mVar.f21633z, mVar.G);
                            m.this.h(this.f21636a);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    public static class c {
    }

    /* compiled from: EngineJob */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final g f21638a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f21639b;

        public d(g gVar, Executor executor) {
            this.f21638a = gVar;
            this.f21639b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f21638a.equals(((d) obj).f21638a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21638a.hashCode();
        }
    }

    /* compiled from: EngineJob */
    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f21640a = new ArrayList(2);

        public boolean isEmpty() {
            return this.f21640a.isEmpty();
        }

        public Iterator<d> iterator() {
            return this.f21640a.iterator();
        }
    }

    public m(p3.a aVar, p3.a aVar2, p3.a aVar3, p3.a aVar4, n nVar, q.a aVar5, n0.d<m<?>> dVar) {
        c cVar = H;
        this.f21622g = aVar;
        this.f21623h = aVar2;
        this.f21624i = aVar3;
        this.f21625r = aVar4;
        this.f21621f = nVar;
        this.f21618c = aVar5;
        this.f21619d = dVar;
        this.f21620e = cVar;
    }

    public synchronized void a(g gVar, Executor executor) {
        this.f21617b.a();
        this.f21616a.f21640a.add(new d(gVar, executor));
        boolean z10 = true;
        if (this.A) {
            d(1);
            executor.execute(new b(gVar));
        } else if (this.C) {
            d(1);
            executor.execute(new a(gVar));
        } else {
            if (this.F) {
                z10 = false;
            }
            e.e.a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public void b() {
        if (!e()) {
            this.F = true;
            i<R> iVar = this.E;
            iVar.M = true;
            g gVar = iVar.K;
            if (gVar != null) {
                gVar.cancel();
            }
            n nVar = this.f21621f;
            k3.c cVar = this.f21627t;
            l lVar = (l) nVar;
            synchronized (lVar) {
                t tVar = lVar.f21592a;
                tVar.getClass();
                Map<k3.c, m<?>> c10 = tVar.c(this.f21631x);
                if (equals(c10.get(cVar))) {
                    c10.remove(cVar);
                }
            }
        }
    }

    public void c() {
        q<?> qVar;
        synchronized (this) {
            this.f21617b.a();
            e.e.a(e(), "Not yet complete!");
            int decrementAndGet = this.f21626s.decrementAndGet();
            e.e.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.D;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public synchronized void d(int i10) {
        q<?> qVar;
        e.e.a(e(), "Not yet complete!");
        if (this.f21626s.getAndAdd(i10) == 0 && (qVar = this.D) != null) {
            qVar.d();
        }
    }

    public final boolean e() {
        return this.C || this.A || this.F;
    }

    public h4.d f() {
        return this.f21617b;
    }

    public final synchronized void g() {
        boolean a10;
        if (this.f21627t != null) {
            this.f21616a.f21640a.clear();
            this.f21627t = null;
            this.D = null;
            this.f21632y = null;
            this.C = false;
            this.F = false;
            this.A = false;
            this.G = false;
            i<R> iVar = this.E;
            i.e eVar = iVar.f21552g;
            synchronized (eVar) {
                eVar.f21569a = true;
                a10 = eVar.a(false);
            }
            if (a10) {
                iVar.u();
            }
            this.E = null;
            this.B = null;
            this.f21633z = null;
            this.f21619d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void h(g gVar) {
        boolean z10;
        this.f21617b.a();
        this.f21616a.f21640a.remove(new d(gVar, g4.e.f18455b));
        if (this.f21616a.isEmpty()) {
            b();
            if (!this.A) {
                if (!this.C) {
                    z10 = false;
                    if (z10 && this.f21626s.get() == 0) {
                        g();
                    }
                }
            }
            z10 = true;
            g();
        }
    }

    public void i(i<?> iVar) {
        p3.a aVar;
        if (this.f21629v) {
            aVar = this.f21624i;
        } else {
            aVar = this.f21630w ? this.f21625r : this.f21623h;
        }
        aVar.f23807a.execute(iVar);
    }
}
