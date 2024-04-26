package de;

import de.l0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultExecutor.kt */
public final class b0 extends l0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g  reason: collision with root package name */
    public static final b0 f13258g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f13259h;

    static {
        Long l10;
        b0 b0Var = new b0();
        f13258g = b0Var;
        b0Var.l0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f13259h = timeUnit.toNanos(l10.longValue());
    }

    public Thread o0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public void p0(long j10, l0.b bVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public void q0(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.q0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        _thread = null;
        x0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008e, code lost:
        if (t0() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0090, code lost:
        o0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0094, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            de.m1 r0 = de.m1.f13310a
            java.lang.ThreadLocal<de.k0> r0 = de.m1.f13311b
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch:{ all -> 0x0084 }
            boolean r1 = r12.y0()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0012
            r1 = 0
            monitor-exit(r12)     // Catch:{ all -> 0x0084 }
            goto L_0x0019
        L_0x0012:
            r1 = 1
            debugStatus = r1     // Catch:{ all -> 0x0081 }
            r12.notifyAll()     // Catch:{ all -> 0x0081 }
            monitor-exit(r12)     // Catch:{ all -> 0x0084 }
        L_0x0019:
            if (r1 != 0) goto L_0x002a
            _thread = r0
            r12.x0()
            boolean r0 = r12.t0()
            if (r0 != 0) goto L_0x0029
            r12.o0()
        L_0x0029:
            return
        L_0x002a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x0030:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0084 }
            long r5 = r12.u0()     // Catch:{ all -> 0x0084 }
            r7 = 0
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0063
            long r9 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0084 }
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x0048
            long r3 = f13259h     // Catch:{ all -> 0x0084 }
            long r3 = r3 + r9
        L_0x0048:
            long r9 = r3 - r9
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x005d
            _thread = r0
            r12.x0()
            boolean r0 = r12.t0()
            if (r0 != 0) goto L_0x005c
            r12.o0()
        L_0x005c:
            return
        L_0x005d:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0064
            r5 = r9
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0030
            boolean r7 = r12.y0()     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x007d
            _thread = r0
            r12.x0()
            boolean r0 = r12.t0()
            if (r0 != 0) goto L_0x007c
            r12.o0()
        L_0x007c:
            return
        L_0x007d:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0084 }
            goto L_0x0030
        L_0x0081:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            _thread = r0
            r12.x0()
            boolean r0 = r12.t0()
            if (r0 != 0) goto L_0x0093
            r12.o0()
        L_0x0093:
            goto L_0x0095
        L_0x0094:
            throw r1
        L_0x0095:
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: de.b0.run():void");
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void x0() {
        if (y0()) {
            debugStatus = 3;
            v0();
            notifyAll();
        }
    }

    public final boolean y0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }
}
