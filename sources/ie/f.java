package ie;

import de.c0;
import de.d0;
import de.u;
import kd.o;

/* compiled from: LimitedDispatcher.kt */
public final class f extends u implements Runnable, d0 {

    /* renamed from: b  reason: collision with root package name */
    public final u f19373b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19374c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d0 f19375d;

    /* renamed from: e  reason: collision with root package name */
    public final j<Runnable> f19376e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f19377f;
    private volatile int runningWorkers;

    public f(u uVar, int i10) {
        this.f19373b = uVar;
        this.f19374c = i10;
        d0 d0Var = uVar instanceof d0 ? (d0) uVar : null;
        this.f19375d = d0Var == null ? c0.f13270b : d0Var;
        this.f19376e = new j<>(false);
        this.f19377f = new Object();
    }

    public void f0(md.f fVar, Runnable runnable) {
        this.f19376e.a(runnable);
        if (!(this.runningWorkers >= this.f19374c) && i0()) {
            this.f19373b.f0(this, this);
        }
    }

    public void g0(md.f fVar, Runnable runnable) {
        this.f19376e.a(runnable);
        if (!(this.runningWorkers >= this.f19374c) && i0()) {
            this.f19373b.g0(this, this);
        }
    }

    public final boolean i0() {
        synchronized (this.f19377f) {
            if (this.runningWorkers >= this.f19374c) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    public void o(long j10, de.f<? super o> fVar) {
        this.f19375d.o(j10, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f19377f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f19376e.c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            ie.j<java.lang.Runnable> r2 = r4.f19376e
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            md.g r3 = md.g.f21797a
            o.a.g(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            de.u r2 = r4.f19373b
            boolean r2 = r2.h0(r4)
            if (r2 == 0) goto L_0x0002
            de.u r0 = r4.f19373b
            r0.f0(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f19377f
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0045 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0045 }
            ie.j<java.lang.Runnable> r2 = r4.f19376e     // Catch:{ all -> 0x0045 }
            int r2 = r2.c()     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0045 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x0049
        L_0x0048:
            throw r0
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.f.run():void");
    }
}
