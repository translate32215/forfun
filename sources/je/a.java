package je;

import b2.t;
import de.a0;
import ie.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k0.g;
import ud.k;
import xd.c;

/* compiled from: CoroutineScheduler.kt */
public final class a implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19746h = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19747i = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19748r = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: s  reason: collision with root package name */
    public static final t f19749s = new t("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f19750a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19751b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19752c;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f19753d;

    /* renamed from: e  reason: collision with root package name */
    public final d f19754e;

    /* renamed from: f  reason: collision with root package name */
    public final d f19755f;

    /* renamed from: g  reason: collision with root package name */
    public final q<C0170a> f19756g;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: je.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutineScheduler.kt */
    public final class C0170a extends Thread {

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f19757h = AtomicIntegerFieldUpdater.newUpdater(C0170a.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final n f19758a = new n();

        /* renamed from: b  reason: collision with root package name */
        public int f19759b = 4;

        /* renamed from: c  reason: collision with root package name */
        public long f19760c;

        /* renamed from: d  reason: collision with root package name */
        public long f19761d;

        /* renamed from: e  reason: collision with root package name */
        public int f19762e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19763f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker = a.f19749s;
        public volatile /* synthetic */ int workerCtl = 0;

        public C0170a(int i10) {
            a.this = a.this;
            setDaemon(true);
            c.a aVar = c.f27936a;
            this.f19762e = c.f27937b.a();
            f(i10);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final je.h a(boolean r10) {
            /*
                r9 = this;
                int r0 = r9.f19759b
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L_0x0007
                goto L_0x002e
            L_0x0007:
                je.a r0 = je.a.this
            L_0x0009:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r4 = (int) r3
                if (r4 != 0) goto L_0x0019
                r0 = 0
                goto L_0x002a
            L_0x0019:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = je.a.f19747i
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L_0x0009
                r0 = 1
            L_0x002a:
                if (r0 == 0) goto L_0x0030
                r9.f19759b = r2
            L_0x002e:
                r0 = 1
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                if (r0 == 0) goto L_0x0067
                if (r10 == 0) goto L_0x005c
                je.a r10 = je.a.this
                int r10 = r10.f19750a
                int r10 = r10 * 2
                int r10 = r9.d(r10)
                if (r10 != 0) goto L_0x0042
                goto L_0x0043
            L_0x0042:
                r2 = 0
            L_0x0043:
                if (r2 == 0) goto L_0x004b
                je.h r10 = r9.e()
                if (r10 != 0) goto L_0x0066
            L_0x004b:
                je.n r10 = r9.f19758a
                je.h r10 = r10.e()
                if (r10 != 0) goto L_0x0066
                if (r2 != 0) goto L_0x0062
                je.h r10 = r9.e()
                if (r10 != 0) goto L_0x0066
                goto L_0x0062
            L_0x005c:
                je.h r10 = r9.e()
                if (r10 != 0) goto L_0x0066
            L_0x0062:
                je.h r10 = r9.i(r1)
            L_0x0066:
                return r10
            L_0x0067:
                if (r10 == 0) goto L_0x007c
                je.n r10 = r9.f19758a
                je.h r10 = r10.e()
                if (r10 != 0) goto L_0x0086
                je.a r10 = je.a.this
                je.d r10 = r10.f19755f
                java.lang.Object r10 = r10.d()
                je.h r10 = (je.h) r10
                goto L_0x0086
            L_0x007c:
                je.a r10 = je.a.this
                je.d r10 = r10.f19755f
                java.lang.Object r10 = r10.d()
                je.h r10 = (je.h) r10
            L_0x0086:
                if (r10 != 0) goto L_0x008c
                je.h r10 = r9.i(r2)
            L_0x008c:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: je.a.C0170a.a(boolean):je.h");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f19762e;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f19762e = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & Integer.MAX_VALUE) % i10;
        }

        public final h e() {
            if (d(2) == 0) {
                h hVar = (h) a.this.f19754e.d();
                return hVar == null ? (h) a.this.f19755f.d() : hVar;
            }
            h hVar2 = (h) a.this.f19755f.d();
            return hVar2 == null ? (h) a.this.f19754e.d() : hVar2;
        }

        public final void f(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f19753d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i10) {
            int i11 = this.f19759b;
            boolean z10 = true;
            if (i11 != 1) {
                z10 = false;
            }
            if (z10) {
                a.f19747i.addAndGet(a.this, 4398046511104L);
            }
            if (i11 != i10) {
                this.f19759b = i10;
            }
            return z10;
        }

        public final h i(boolean z10) {
            long j10;
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int d10 = d(i10);
            a aVar = a.this;
            int i11 = 0;
            long j11 = Long.MAX_VALUE;
            while (i11 < i10) {
                i11++;
                d10++;
                if (d10 > i10) {
                    d10 = 1;
                }
                C0170a b10 = aVar.f19756g.b(d10);
                if (!(b10 == null || b10 == this)) {
                    if (z10) {
                        j10 = this.f19758a.g(b10.f19758a);
                    } else {
                        n nVar = this.f19758a;
                        n nVar2 = b10.f19758a;
                        nVar.getClass();
                        h f10 = nVar2.f();
                        if (f10 != null) {
                            nVar.a(f10, false);
                            j10 = -1;
                        } else {
                            j10 = nVar.h(nVar2, false);
                        }
                    }
                    if (j10 == -1) {
                        return this.f19758a.e();
                    }
                    if (j10 > 0) {
                        j11 = Math.min(j11, j10);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f19761d = j11;
            return null;
        }

        public void run() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f19759b != 5) {
                    h a10 = a(this.f19763f);
                    if (a10 == null) {
                        this.f19763f = false;
                        if (this.f19761d == 0) {
                            if (this.nextParkedWorker != a.f19749s) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != a.f19749s) || this.workerCtl != -1 || a.this.isTerminated() || this.f19759b == 5) {
                                        break;
                                    }
                                    h(3);
                                    Thread.interrupted();
                                    if (this.f19760c == 0) {
                                        this.f19760c = System.nanoTime() + a.this.f19752c;
                                    }
                                    LockSupport.parkNanos(a.this.f19752c);
                                    if (System.nanoTime() - this.f19760c >= 0) {
                                        this.f19760c = 0;
                                        a aVar = a.this;
                                        synchronized (aVar.f19756g) {
                                            if (!aVar.isTerminated()) {
                                                if (((int) (aVar.controlState & 2097151)) > aVar.f19750a) {
                                                    if (f19757h.compareAndSet(this, -1, 1)) {
                                                        int i10 = this.indexInArray;
                                                        f(0);
                                                        aVar.v(this, i10, 0);
                                                        int andDecrement = (int) (2097151 & a.f19747i.getAndDecrement(aVar));
                                                        if (andDecrement != i10) {
                                                            C0170a b10 = aVar.f19756g.b(andDecrement);
                                                            k.c(b10);
                                                            C0170a aVar2 = b10;
                                                            aVar.f19756g.c(i10, aVar2);
                                                            aVar2.f(i10);
                                                            aVar.v(aVar2, andDecrement, i10);
                                                        }
                                                        aVar.f19756g.c(andDecrement, null);
                                                        this.f19759b = 5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.u(this);
                            }
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f19761d);
                            this.f19761d = 0;
                        }
                    } else {
                        this.f19761d = 0;
                        int b11 = a10.f19775b.b();
                        this.f19760c = 0;
                        if (this.f19759b == 3) {
                            this.f19759b = 2;
                        }
                        if (b11 != 0 && h(2)) {
                            a.this.H();
                        }
                        a.this.G(a10);
                        if (b11 != 0) {
                            a.f19747i.addAndGet(a.this, -2097152);
                            if (this.f19759b != 5) {
                                this.f19759b = 4;
                            }
                        }
                    }
                }
            }
            h(5);
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f19750a = i10;
        this.f19751b = i11;
        this.f19752c = j10;
        this.f19753d = str;
        boolean z10 = true;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 <= 0 ? false : z10) {
                        this.f19754e = new d();
                        this.f19755f = new d();
                        this.parkedWorkersStack = 0;
                        this.f19756g = new q<>(i10 + 1);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(q2.a.a("Idle worker keep alive time ", j10, " must be positive").toString());
                }
                throw new IllegalArgumentException(g.a("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(g.a("Core pool size ", i10, " should be at least 1").toString());
    }

    public static /* synthetic */ void s(a aVar, Runnable runnable, i iVar, boolean z10, int i10) {
        i iVar2 = (i10 & 2) != 0 ? l.f19783f : null;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.o(runnable, iVar2, z10);
    }

    public final void G(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public final void H() {
        if (!M() && !J(this.controlState)) {
            M();
        }
    }

    public final boolean J(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f19750a) {
            int a10 = a();
            if (a10 == 1 && this.f19750a > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean M() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            C0170a b10 = this.f19756g.b((int) (2097151 & j10));
            if (b10 == null) {
                b10 = null;
            } else {
                long j11 = (2097152 + j10) & -2097152;
                int t10 = t(b10);
                if (t10 < 0) {
                    continue;
                } else {
                    if (f19746h.compareAndSet(this, j10, ((long) t10) | j11)) {
                        b10.g(f19749s);
                    } else {
                        continue;
                    }
                }
            }
            if (b10 == null) {
                return false;
            }
            if (C0170a.f19757h.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }

    public final int a() {
        synchronized (this.f19756g) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = this.controlState;
            int i10 = (int) (j10 & 2097151);
            int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
            boolean z10 = false;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 >= this.f19750a) {
                return 0;
            }
            if (i10 >= this.f19751b) {
                return 0;
            }
            int i12 = ((int) (this.controlState & 2097151)) + 1;
            if (i12 > 0 && this.f19756g.b(i12) == null) {
                C0170a aVar = new C0170a(i12);
                this.f19756g.c(i12, aVar);
                if (i12 == ((int) (2097151 & f19747i.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (z10) {
                    aVar.start();
                    int i13 = i11 + 1;
                    return i13;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public void close() {
        int i10;
        h hVar;
        boolean z10;
        if (f19748r.compareAndSet(this, 0, 1)) {
            C0170a d10 = d();
            synchronized (this.f19756g) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    C0170a b10 = this.f19756g.b(i11);
                    k.c(b10);
                    C0170a aVar = b10;
                    if (aVar != d10) {
                        while (aVar.isAlive()) {
                            LockSupport.unpark(aVar);
                            aVar.join(10000);
                        }
                        n nVar = aVar.f19758a;
                        d dVar = this.f19755f;
                        nVar.getClass();
                        h hVar2 = (h) n.f19786b.getAndSet(nVar, (Object) null);
                        if (hVar2 != null) {
                            dVar.a(hVar2);
                        }
                        do {
                            h f10 = nVar.f();
                            if (f10 == null) {
                                z10 = false;
                                continue;
                            } else {
                                dVar.a(f10);
                                z10 = true;
                                continue;
                            }
                        } while (z10);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            this.f19755f.b();
            this.f19754e.b();
            while (true) {
                if (d10 == null) {
                    hVar = null;
                } else {
                    hVar = d10.a(true);
                }
                if (hVar == null && (hVar = (h) this.f19754e.d()) == null && (hVar = (h) this.f19755f.d()) == null) {
                    break;
                }
                G(hVar);
            }
            if (d10 != null) {
                d10.h(5);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public final C0170a d() {
        Thread currentThread = Thread.currentThread();
        C0170a aVar = currentThread instanceof C0170a ? (C0170a) currentThread : null;
        if (aVar != null && k.a(a.this, this)) {
            return aVar;
        }
        return null;
    }

    public void execute(Runnable runnable) {
        s(this, runnable, (i) null, false, 6);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void o(Runnable runnable, i iVar, boolean z10) {
        h hVar;
        h hVar2;
        boolean z11;
        ((e) l.f19782e).getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            hVar = (h) runnable;
            hVar.f19774a = nanoTime;
            hVar.f19775b = iVar;
        } else {
            hVar = new k(runnable, nanoTime, iVar);
        }
        C0170a d10 = d();
        boolean z12 = true;
        if (d10 == null || d10.f19759b == 5 || (hVar.f19775b.b() == 0 && d10.f19759b == 2)) {
            hVar2 = hVar;
        } else {
            d10.f19763f = true;
            hVar2 = d10.f19758a.a(hVar, z10);
        }
        if (hVar2 != null) {
            if (hVar2.f19775b.b() == 1) {
                z11 = this.f19755f.a(hVar2);
            } else {
                z11 = this.f19754e.a(hVar2);
            }
            if (!z11) {
                throw new RejectedExecutionException(k.j(this.f19753d, " was terminated"));
            }
        }
        if (!z10 || d10 == null) {
            z12 = false;
        }
        if (hVar.f19775b.b() != 0) {
            long addAndGet = f19747i.addAndGet(this, 2097152);
            if (!z12 && !M() && !J(addAndGet)) {
                M();
            }
        } else if (!z12) {
            H();
        }
    }

    public final int t(C0170a aVar) {
        Object c10 = aVar.c();
        while (c10 != f19749s) {
            if (c10 == null) {
                return 0;
            }
            C0170a aVar2 = (C0170a) c10;
            int b10 = aVar2.b();
            if (b10 != 0) {
                return b10;
            }
            c10 = aVar2.c();
        }
        return -1;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f19756g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (i15 < a10) {
            int i16 = i15 + 1;
            C0170a b10 = this.f19756g.b(i15);
            if (b10 != null) {
                int d10 = b10.f19758a.d();
                int f10 = t.g.f(b10.f19759b);
                if (f10 == 0) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(d10);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (f10 == 1) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(d10);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (f10 == 2) {
                    i12++;
                } else if (f10 == 3) {
                    i13++;
                    if (d10 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(d10);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (f10 == 4) {
                    i14++;
                }
            }
            i15 = i16;
        }
        long j10 = this.controlState;
        return this.f19753d + '@' + a0.c(this) + "[Pool Size {core = " + this.f19750a + ", max = " + this.f19751b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f19754e.c() + ", global blocking queue size = " + this.f19755f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f19750a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final boolean u(C0170a aVar) {
        long j10;
        int b10;
        if (aVar.c() != f19749s) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            b10 = aVar.b();
            aVar.g(this.f19756g.b((int) (2097151 & j10)));
        } while (!f19746h.compareAndSet(this, j10, ((2097152 + j10) & -2097152) | ((long) b10)));
        return true;
    }

    public final void v(C0170a aVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                i12 = i11 == 0 ? t(aVar) : i11;
            }
            if (i12 >= 0) {
                if (f19746h.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }
}
