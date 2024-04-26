package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.o;
import e.e;
import e.g;
import e8.n50;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class bi<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static final Runnable f6028a = new n50((e) null);

    /* renamed from: b  reason: collision with root package name */
    public static final Runnable f6029b = new n50((e) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Runnable f6030c = new n50((e) null);

    public final void a() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f6029b)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (((Runnable) getAndSet(f6028a)) == f6030c) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    public abstract boolean b();

    public abstract void c(@NullableDecl T t10, @NullableDecl Throwable th);

    public abstract T d() throws Exception;

    public abstract String e();

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet((Object) null, currentThread)) {
            boolean z10 = !b();
            if (z10) {
                try {
                    obj = d();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f6028a)) {
                        Runnable runnable = (Runnable) get();
                        boolean z11 = false;
                        int i10 = 0;
                        while (true) {
                            Runnable runnable2 = f6029b;
                            if (runnable != runnable2 && runnable != f6030c) {
                                break;
                            }
                            i10++;
                            if (i10 > 1000) {
                                Runnable runnable3 = f6030c;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z11 = Thread.interrupted() || z11;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (z11) {
                            currentThread.interrupt();
                        }
                    }
                    if (z10) {
                        c((Object) null, th);
                        return;
                    }
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f6028a)) {
                Runnable runnable4 = (Runnable) get();
                boolean z12 = false;
                int i11 = 0;
                while (true) {
                    Runnable runnable5 = f6029b;
                    if (runnable4 != runnable5 && runnable4 != f6030c) {
                        break;
                    }
                    i11++;
                    if (i11 > 1000) {
                        Runnable runnable6 = f6030c;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z12 = Thread.interrupted() || z12;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = (Runnable) get();
                }
                if (z12) {
                    currentThread.interrupt();
                }
            }
            if (z10) {
                c(obj, (Throwable) null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f6028a) {
            str = "running=[DONE]";
        } else if (runnable == f6029b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = g.a(o.a(name, 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String e10 = e();
        return g.a(o.a(e10, o.a(str, 2)), str, ", ", e10);
    }
}
