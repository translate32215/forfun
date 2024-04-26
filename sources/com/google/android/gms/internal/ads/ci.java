package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class ci extends ih {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f6123a;

    public ci(ExecutorService executorService) {
        executorService.getClass();
        this.f6123a = executorService;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f6123a.awaitTermination(j10, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f6123a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f6123a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f6123a.isTerminated();
    }

    public final void shutdown() {
        this.f6123a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f6123a.shutdownNow();
    }
}
