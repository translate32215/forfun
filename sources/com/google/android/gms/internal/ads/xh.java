package com.google.android.gms.internal.ads;

import e8.l50;
import e8.p50;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xh<V> extends l50<V> {

    /* renamed from: h  reason: collision with root package name */
    public final p50<V> f8557h;

    public xh(p50<V> p50) {
        p50.getClass();
        this.f8557h = p50;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.f8557h.a(runnable, executor);
    }

    public final boolean cancel(boolean z10) {
        return this.f8557h.cancel(z10);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f8557h.get();
    }

    public final boolean isCancelled() {
        return this.f8557h.isCancelled();
    }

    public final boolean isDone() {
        return this.f8557h.isDone();
    }

    public final String toString() {
        return this.f8557h.toString();
    }

    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f8557h.get(j10, timeUnit);
    }
}
