package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import o8.c4;
import o8.s3;
import o8.t3;
import o8.u3;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class k extends c4 {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLong f8828k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public u3 f8829c;

    /* renamed from: d  reason: collision with root package name */
    public u3 f8830d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue<t3<?>> f8831e = new PriorityBlockingQueue<>();

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue<t3<?>> f8832f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f8833g = new s3(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f8834h = new s3(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i  reason: collision with root package name */
    public final Object f8835i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f8836j = new Semaphore(2);

    public k(l lVar) {
        super(lVar);
    }

    public final void g() {
        if (Thread.currentThread() != this.f8830d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void h() {
        if (Thread.currentThread() != this.f8829c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean j() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r5.length() == 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f8864a.d().f8800i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5.length() != 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.f8864a.d().f8800i;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T o(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ all -> 0x0054 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ all -> 0x0054 }
            r0.r(r6)     // Catch:{ all -> 0x0054 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.l r3 = r1.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8800i
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0029
            java.lang.String r4 = r4.concat(r5)
            goto L_0x002f
        L_0x0029:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x002f:
            r3.a(r4)
        L_0x0032:
            return r2
        L_0x0033:
            com.google.android.gms.measurement.internal.l r3 = r1.f8864a     // Catch:{ all -> 0x0054 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x0054 }
            o8.a3 r3 = r3.f8800i     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0048
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0054 }
            goto L_0x004e
        L_0x0048:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0054 }
            r5.<init>(r4)     // Catch:{ all -> 0x0054 }
            r4 = r5
        L_0x004e:
            r3.a(r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r2 = 0
            return r2
        L_0x0054:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.o(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final <V> Future<V> p(Callable<V> callable) throws IllegalStateException {
        k();
        t3 t3Var = new t3(this, callable, false);
        if (Thread.currentThread() == this.f8829c) {
            if (!this.f8831e.isEmpty()) {
                this.f8864a.d().f8800i.a("Callable skipped the worker queue.");
            }
            t3Var.run();
        } else {
            u(t3Var);
        }
        return t3Var;
    }

    public final void q(Runnable runnable) throws IllegalStateException {
        k();
        t3 t3Var = new t3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f8835i) {
            this.f8832f.add(t3Var);
            u3 u3Var = this.f8830d;
            if (u3Var == null) {
                u3 u3Var2 = new u3(this, "Measurement Network", this.f8832f);
                this.f8830d = u3Var2;
                u3Var2.setUncaughtExceptionHandler(this.f8834h);
                this.f8830d.start();
            } else {
                synchronized (u3Var.f23462a) {
                    u3Var.f23462a.notifyAll();
                }
            }
        }
    }

    public final void r(Runnable runnable) throws IllegalStateException {
        k();
        if (runnable != null) {
            u(new t3(this, runnable, false, "Task exception on worker thread"));
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void s(Runnable runnable) throws IllegalStateException {
        k();
        u(new t3(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean t() {
        return Thread.currentThread() == this.f8829c;
    }

    public final void u(t3<?> t3Var) {
        synchronized (this.f8835i) {
            this.f8831e.add(t3Var);
            u3 u3Var = this.f8829c;
            if (u3Var == null) {
                u3 u3Var2 = new u3(this, "Measurement Worker", this.f8831e);
                this.f8829c = u3Var2;
                u3Var2.setUncaughtExceptionHandler(this.f8833g);
                this.f8829c.start();
            } else {
                synchronized (u3Var.f23462a) {
                    u3Var.f23462a.notifyAll();
                }
            }
        }
    }
}
