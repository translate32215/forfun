package androidx.lifecycle;

import androidx.lifecycle.o;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2593k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2594a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public m.b<c0<? super T>, LiveData<T>.c> f2595b = new m.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f2596c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2597d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2598e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2599f;

    /* renamed from: g  reason: collision with root package name */
    public int f2600g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2601h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2602i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f2603j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements r {

        /* renamed from: e  reason: collision with root package name */
        public final t f2604e;

        public LifecycleBoundObserver(t tVar, c0<? super T> c0Var) {
            super(c0Var);
            this.f2604e = tVar;
        }

        public void d(t tVar, o.b bVar) {
            o.c b10 = this.f2604e.c().b();
            if (b10 == o.c.DESTROYED) {
                LiveData.this.k(this.f2607a);
                return;
            }
            o.c cVar = null;
            while (cVar != b10) {
                h(k());
                cVar = b10;
                b10 = this.f2604e.c().b();
            }
        }

        public void i() {
            this.f2604e.c().c(this);
        }

        public boolean j(t tVar) {
            return this.f2604e == tVar;
        }

        public boolean k() {
            return this.f2604e.c().b().compareTo(o.c.STARTED) >= 0;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2594a) {
                obj = LiveData.this.f2599f;
                LiveData.this.f2599f = LiveData.f2593k;
            }
            LiveData.this.l(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, c0<? super T> c0Var) {
            super(c0Var);
        }

        public boolean k() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final c0<? super T> f2607a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2608b;

        /* renamed from: c  reason: collision with root package name */
        public int f2609c = -1;

        public c(c0<? super T> c0Var) {
            this.f2607a = c0Var;
        }

        public void h(boolean z10) {
            if (z10 != this.f2608b) {
                this.f2608b = z10;
                LiveData liveData = LiveData.this;
                int i10 = z10 ? 1 : -1;
                int i11 = liveData.f2596c;
                liveData.f2596c = i10 + i11;
                if (!liveData.f2597d) {
                    liveData.f2597d = true;
                    while (true) {
                        try {
                            int i12 = liveData.f2596c;
                            if (i11 == i12) {
                                break;
                            }
                            boolean z11 = i11 == 0 && i12 > 0;
                            boolean z12 = i11 > 0 && i12 == 0;
                            if (z11) {
                                liveData.h();
                            } else if (z12) {
                                liveData.i();
                            }
                            i11 = i12;
                        } finally {
                            liveData.f2597d = false;
                        }
                    }
                }
                if (this.f2608b) {
                    LiveData.this.c(this);
                }
            }
        }

        public void i() {
        }

        public boolean j(t tVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = f2593k;
        this.f2599f = obj;
        this.f2603j = new a();
        this.f2598e = obj;
        this.f2600g = -1;
    }

    public static void a(String str) {
        if (!l.a.f().b()) {
            throw new IllegalStateException(q.b.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f2608b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i10 = cVar.f2609c;
            int i11 = this.f2600g;
            if (i10 < i11) {
                cVar.f2609c = i11;
                cVar.f2607a.g(this.f2598e);
            }
        }
    }

    public void c(LiveData<T>.c cVar) {
        if (this.f2601h) {
            this.f2602i = true;
            return;
        }
        this.f2601h = true;
        do {
            this.f2602i = false;
            if (cVar == null) {
                m.b<K, V>.d f10 = this.f2595b.f();
                while (f10.hasNext()) {
                    b((c) ((Map.Entry) f10.next()).getValue());
                    if (this.f2602i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f2602i);
        this.f2601h = false;
    }

    public T d() {
        T t10 = this.f2598e;
        if (t10 != f2593k) {
            return t10;
        }
        return null;
    }

    public boolean e() {
        return this.f2596c > 0;
    }

    public void f(t tVar, c0<? super T> c0Var) {
        a("observe");
        if (tVar.c().b() != o.c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(tVar, c0Var);
            c i10 = this.f2595b.i(c0Var, lifecycleBoundObserver);
            if (i10 != null && !i10.j(tVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (i10 == null) {
                tVar.c().a(lifecycleBoundObserver);
            }
        }
    }

    public void g(c0<? super T> c0Var) {
        a("observeForever");
        b bVar = new b(this, c0Var);
        c i10 = this.f2595b.i(c0Var, bVar);
        if (i10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (i10 == null) {
            bVar.h(true);
        }
    }

    public void h() {
    }

    public void i() {
    }

    public void j(T t10) {
        boolean z10;
        synchronized (this.f2594a) {
            z10 = this.f2599f == f2593k;
            this.f2599f = t10;
        }
        if (z10) {
            l.a.f().f20960a.e(this.f2603j);
        }
    }

    public void k(c0<? super T> c0Var) {
        a("removeObserver");
        c j10 = this.f2595b.j(c0Var);
        if (j10 != null) {
            j10.i();
            j10.h(false);
        }
    }

    public void l(T t10) {
        a("setValue");
        this.f2600g++;
        this.f2598e = t10;
        c((LiveData<T>.c) null);
    }
}
