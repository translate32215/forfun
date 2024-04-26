package com.google.android.gms.internal.ads;

import b6.g;
import com.google.android.gms.internal.ads.ai;
import e.b;
import e.h;
import e8.p50;
import e8.t50;
import f7.j0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yh extends b {
    public static <V> p50<V> c(Throwable th) {
        th.getClass();
        return new ai.a(th);
    }

    public static <O> p50<O> d(ph<O> phVar, Executor executor) {
        t50 t50 = new t50(phVar);
        executor.execute(t50);
        return t50;
    }

    public static <V> p50<V> e(p50<V> p50, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (p50.isDone()) {
            return p50;
        }
        ei eiVar = new ei(p50);
        gi giVar = new gi(eiVar);
        eiVar.f6288i = scheduledExecutorService.schedule(giVar, j10, timeUnit);
        p50.a(giVar, uh.f8247a);
        return eiVar;
    }

    public static <V> V f(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return ji.a(future);
        }
        throw new IllegalStateException(qg.a("Future was expected to be done: %s", future));
    }

    public static <V> void g(p50<V> p50, zh<? super V> zhVar, Executor executor) {
        zhVar.getClass();
        p50.a(new j0((Future) p50, (zh) zhVar), executor);
    }

    public static <V> p50<V> h(@NullableDecl V v10) {
        if (v10 == null) {
            return ai.f5965b;
        }
        return new ai(v10);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.gh, e8.p50<O>, com.google.android.gms.internal.ads.mh, java.lang.Runnable] */
    public static <I, O> p50<O> i(p50<I> p50, mg<? super I, ? extends O> mgVar, Executor executor) {
        int i10 = kh.f7249r;
        mgVar.getClass();
        ? mhVar = new mh(p50, mgVar);
        p50.a(mhVar, h.d(executor, mhVar));
        return mhVar;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.gh, e8.p50<O>, com.google.android.gms.internal.ads.jh, java.lang.Runnable] */
    public static <I, O> p50<O> j(p50<I> p50, oh<? super I, ? extends O> ohVar, Executor executor) {
        int i10 = kh.f7249r;
        executor.getClass();
        ? jhVar = new jh(p50, ohVar);
        p50.a(jhVar, h.d(executor, jhVar));
        return jhVar;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.fh, java.lang.Runnable, e8.p50<V>] */
    public static <V, X extends Throwable> p50<V> k(p50<? extends V> p50, Class<X> cls, oh<? super X, ? extends V> ohVar, Executor executor) {
        int i10 = dh.f6210s;
        ? fhVar = new fh(p50, cls, ohVar);
        p50.a(fhVar, h.d(executor, fhVar));
        return fhVar;
    }

    public static <V> V l(Future<V> future) {
        future.getClass();
        try {
            return ji.a(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new th((Error) cause);
            }
            throw new ki(cause);
        }
    }

    public static <V> g m(Iterable<? extends p50<? extends V>> iterable) {
        return new g(true, (ug) ug.A(iterable));
    }
}
