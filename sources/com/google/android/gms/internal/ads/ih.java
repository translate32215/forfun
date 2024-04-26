package com.google.android.gms.internal.ads;

import e8.o50;
import e8.p50;
import e8.t50;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class ih extends AbstractExecutorService implements o50 {
    public final p50<?> b(Runnable runnable) {
        return (p50) super.submit(runnable);
    }

    public final <T> p50<T> i(Callable<T> callable) {
        return (p50) super.submit(callable);
    }

    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new t50(callable);
    }

    public Future submit(Runnable runnable) {
        return (p50) super.submit(runnable);
    }

    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t10) {
        return new t50(Executors.callable(runnable, t10));
    }

    public Future submit(Callable callable) {
        return (p50) super.submit(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (p50) super.submit(runnable, obj);
    }
}
