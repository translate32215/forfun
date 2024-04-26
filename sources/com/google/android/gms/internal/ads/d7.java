package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.gh;
import d7.l;
import e8.p50;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class d7<T> implements p50<T> {

    /* renamed from: a  reason: collision with root package name */
    public final fi<T> f6188a = new fi<>();

    public void a(Runnable runnable, Executor executor) {
        this.f6188a.a(runnable, executor);
    }

    public final boolean b(T t10) {
        boolean i10 = this.f6188a.i(t10);
        if (!i10) {
            l.B.f13190g.c(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return i10;
    }

    public final boolean c(Throwable th) {
        boolean j10 = this.f6188a.j(th);
        if (!j10) {
            l.B.f13190g.c(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return j10;
    }

    public boolean cancel(boolean z10) {
        return this.f6188a.cancel(z10);
    }

    public T get() throws ExecutionException, InterruptedException {
        return this.f6188a.get();
    }

    public boolean isCancelled() {
        return this.f6188a.f6648a instanceof gh.b;
    }

    public boolean isDone() {
        return this.f6188a.isDone();
    }

    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f6188a.get(j10, timeUnit);
    }
}
