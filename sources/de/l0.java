package de;

import b2.t;
import ie.u;
import ie.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kd.o;
import md.f;
import ud.k;

/* compiled from: EventLoop.common.kt */
public abstract class l0 extends m0 implements d0 {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13297e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13298f;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* compiled from: EventLoop.common.kt */
    public final class a extends b {

        /* renamed from: d  reason: collision with root package name */
        public final f<o> f13299d;

        public a(long j10, f<? super o> fVar) {
            super(j10);
            this.f13299d = fVar;
        }

        public void run() {
            this.f13299d.k(l0.this, o.f20627a);
        }

        public String toString() {
            return k.j(super.toString(), this.f13299d);
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static abstract class b implements Runnable, Comparable<b>, h0, v {

        /* renamed from: a  reason: collision with root package name */
        public long f13301a;

        /* renamed from: b  reason: collision with root package name */
        public Object f13302b;

        /* renamed from: c  reason: collision with root package name */
        public int f13303c = -1;

        public b(long j10) {
            this.f13301a = j10;
        }

        public void a(u<?> uVar) {
            if (this.f13302b != n0.f13314a) {
                this.f13302b = uVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public int b() {
            return this.f13303c;
        }

        public void c(int i10) {
            this.f13303c = i10;
        }

        public int compareTo(Object obj) {
            long j10 = this.f13301a - ((b) obj).f13301a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final synchronized void f() {
            Object obj = this.f13302b;
            t tVar = n0.f13314a;
            if (obj != tVar) {
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null) {
                    synchronized (cVar) {
                        if (m() != null) {
                            cVar.d(b());
                        }
                    }
                }
                this.f13302b = tVar;
            }
        }

        public u<?> m() {
            Object obj = this.f13302b;
            if (obj instanceof u) {
                return (u) obj;
            }
            return null;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Delayed[nanos=");
            a10.append(this.f13301a);
            a10.append(']');
            return a10.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class c extends u<b> {

        /* renamed from: b  reason: collision with root package name */
        public long f13304b;

        public c(long j10) {
            this.f13304b = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<l0> cls2 = l0.class;
        f13297e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f13298f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    private final boolean s0() {
        return this._isCompleted;
    }

    public final void f0(f fVar, Runnable runnable) {
        q0(runnable);
    }

    public void o(long j10, f<? super o> fVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j11 + nanoTime, fVar);
            fVar.j(new i0(aVar));
            w0(nanoTime, aVar);
        }
    }

    public void q0(Runnable runnable) {
        if (r0(runnable)) {
            Thread o02 = o0();
            if (Thread.currentThread() != o02) {
                LockSupport.unpark(o02);
                return;
            }
            return;
        }
        b0.f13258g.q0(runnable);
    }

    public final boolean r0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (s0()) {
                return false;
            }
            if (obj == null) {
                if (f13297e.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof ie.k) {
                ie.k kVar = (ie.k) obj;
                int a10 = kVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    f13297e.compareAndSet(this, obj, kVar.e());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == n0.f13315b) {
                return false;
            } else {
                ie.k kVar2 = new ie.k(8, true);
                kVar2.a((Runnable) obj);
                kVar2.a(runnable);
                if (f13297e.compareAndSet(this, obj, kVar2)) {
                    return true;
                }
            }
        }
    }

    public void shutdown() {
        m1 m1Var = m1.f13310a;
        m1.f13311b.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f13297e.compareAndSet(this, (Object) null, n0.f13315b)) {
                    break;
                }
            } else if (obj instanceof ie.k) {
                ((ie.k) obj).b();
                break;
            } else if (obj == n0.f13315b) {
                break;
            } else {
                ie.k kVar = new ie.k(8, true);
                kVar.a((Runnable) obj);
                if (f13297e.compareAndSet(this, obj, kVar)) {
                    break;
                }
            }
        }
        do {
        } while (u0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            b bVar = cVar == null ? null : (b) cVar.e();
            if (bVar != null) {
                p0(nanoTime, bVar);
            } else {
                return;
            }
        }
    }

    public boolean t0() {
        w6.c cVar = this.f13296d;
        if (!(cVar == null || cVar.f27028a == cVar.f27029b)) {
            return false;
        }
        c cVar2 = (c) this._delayed;
        if (cVar2 != null && !cVar2.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof ie.k) {
            return ((ie.k) obj).d();
        }
        if (obj == n0.f13315b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [ie.v] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r7 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0050 A[EDGE_INSN: B:85:0x0050->B:33:0x0050 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long u0() {
        /*
            r12 = this;
            boolean r0 = r12.n0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r12._delayed
            de.l0$c r0 = (de.l0.c) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x004c
            boolean r6 = r0.c()
            if (r6 != 0) goto L_0x004c
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            ie.v r8 = r0.b()     // Catch:{ all -> 0x0049 }
            if (r8 != 0) goto L_0x0026
            monitor-exit(r0)
            r8 = r5
            goto L_0x0044
        L_0x0026:
            de.l0$b r8 = (de.l0.b) r8     // Catch:{ all -> 0x0049 }
            long r9 = r8.f13301a     // Catch:{ all -> 0x0049 }
            long r9 = r6 - r9
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 < 0) goto L_0x0032
            r9 = 1
            goto L_0x0033
        L_0x0032:
            r9 = 0
        L_0x0033:
            if (r9 == 0) goto L_0x003a
            boolean r8 = r12.r0(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r8 == 0) goto L_0x0042
            ie.v r8 = r0.d(r4)     // Catch:{ all -> 0x0049 }
            goto L_0x0043
        L_0x0042:
            r8 = r5
        L_0x0043:
            monitor-exit(r0)
        L_0x0044:
            de.l0$b r8 = (de.l0.b) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x004c
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004c:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L_0x0052
        L_0x0050:
            r7 = r5
            goto L_0x007e
        L_0x0052:
            boolean r6 = r0 instanceof ie.k
            if (r6 == 0) goto L_0x006e
            r6 = r0
            ie.k r6 = (ie.k) r6
            java.lang.Object r7 = r6.f()
            b2.t r8 = ie.k.f19388h
            if (r7 == r8) goto L_0x0064
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x007e
        L_0x0064:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f13297e
            ie.k r6 = r6.e()
            r7.compareAndSet(r12, r0, r6)
            goto L_0x004c
        L_0x006e:
            b2.t r6 = de.n0.f13315b
            if (r0 != r6) goto L_0x0073
            goto L_0x0050
        L_0x0073:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f13297e
            boolean r6 = r6.compareAndSet(r12, r0, r5)
            if (r6 == 0) goto L_0x004c
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x007e:
            if (r7 == 0) goto L_0x0084
            r7.run()
            return r1
        L_0x0084:
            w6.c r0 = r12.f13296d
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            int r8 = r0.f27028a
            int r0 = r0.f27029b
            if (r8 != r0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            if (r3 == 0) goto L_0x009a
        L_0x0098:
            r3 = r6
            goto L_0x009b
        L_0x009a:
            r3 = r1
        L_0x009b:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            goto L_0x00db
        L_0x00a0:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            boolean r3 = r0 instanceof ie.k
            if (r3 == 0) goto L_0x00d6
            ie.k r0 = (ie.k) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00b2
            goto L_0x00db
        L_0x00b2:
            java.lang.Object r0 = r12._delayed
            de.l0$c r0 = (de.l0.c) r0
            if (r0 != 0) goto L_0x00b9
            goto L_0x00c2
        L_0x00b9:
            monitor-enter(r0)
            ie.v r3 = r0.b()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            r5 = r3
            de.l0$b r5 = (de.l0.b) r5
        L_0x00c2:
            if (r5 != 0) goto L_0x00c5
            goto L_0x00da
        L_0x00c5:
            long r3 = r5.f13301a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d1
            goto L_0x00db
        L_0x00d1:
            r1 = r3
            goto L_0x00db
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d6:
            b2.t r3 = de.n0.f13315b
            if (r0 != r3) goto L_0x00db
        L_0x00da:
            r1 = r6
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: de.l0.u0():long");
    }

    public final void v0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [ie.v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w0(long r13, de.l0.b r15) {
        /*
            r12 = this;
            boolean r0 = r12.s0()
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x003b
        L_0x000b:
            java.lang.Object r0 = r12._delayed
            de.l0$c r0 = (de.l0.c) r0
            if (r0 != 0) goto L_0x0022
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f13298f
            de.l0$c r5 = new de.l0$c
            r5.<init>(r13)
            r0.compareAndSet(r12, r4, r5)
            java.lang.Object r0 = r12._delayed
            ud.k.c(r0)
            de.l0$c r0 = (de.l0.c) r0
        L_0x0022:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f13302b     // Catch:{ all -> 0x00a8 }
            b2.t r6 = de.n0.f13314a     // Catch:{ all -> 0x00a8 }
            if (r5 != r6) goto L_0x002c
            monitor-exit(r15)
            r0 = 2
            goto L_0x0068
        L_0x002c:
            monitor-enter(r0)     // Catch:{ all -> 0x00a8 }
            ie.v r5 = r0.b()     // Catch:{ all -> 0x00a5 }
            de.l0$b r5 = (de.l0.b) r5     // Catch:{ all -> 0x00a5 }
            boolean r6 = r12.s0()     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x003d
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r15)
        L_0x003b:
            r0 = 1
            goto L_0x0068
        L_0x003d:
            r6 = 0
            if (r5 != 0) goto L_0x0044
            r0.f13304b = r13     // Catch:{ all -> 0x00a5 }
            goto L_0x0057
        L_0x0044:
            long r8 = r5.f13301a     // Catch:{ all -> 0x00a5 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x004d
            r8 = r13
        L_0x004d:
            long r10 = r0.f13304b     // Catch:{ all -> 0x00a5 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0057
            r0.f13304b = r8     // Catch:{ all -> 0x00a5 }
        L_0x0057:
            long r8 = r15.f13301a     // Catch:{ all -> 0x00a5 }
            long r10 = r0.f13304b     // Catch:{ all -> 0x00a5 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0062
            r15.f13301a = r10     // Catch:{ all -> 0x00a5 }
        L_0x0062:
            r0.a(r15)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r15)
            r0 = 0
        L_0x0068:
            if (r0 == 0) goto L_0x007f
            if (r0 == r3) goto L_0x007b
            if (r0 != r1) goto L_0x006f
            goto L_0x00a1
        L_0x006f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected result"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x007b:
            r12.p0(r13, r15)
            goto L_0x00a1
        L_0x007f:
            java.lang.Object r13 = r12._delayed
            de.l0$c r13 = (de.l0.c) r13
            if (r13 != 0) goto L_0x0086
            goto L_0x008f
        L_0x0086:
            monitor-enter(r13)
            ie.v r14 = r13.b()     // Catch:{ all -> 0x00a2 }
            monitor-exit(r13)
            r4 = r14
            de.l0$b r4 = (de.l0.b) r4
        L_0x008f:
            if (r4 != r15) goto L_0x0092
            r2 = 1
        L_0x0092:
            if (r2 == 0) goto L_0x00a1
            java.lang.Thread r13 = r12.o0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00a1
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00a1:
            return
        L_0x00a2:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00a5:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r13     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: de.l0.w0(long, de.l0$b):void");
    }
}
