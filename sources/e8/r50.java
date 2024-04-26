package e8;

import com.google.android.gms.internal.ads.ci;
import com.google.android.gms.internal.ads.di;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r50 extends ci implements ScheduledExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f16245b;

    public r50(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f16245b = scheduledExecutorService;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.concurrent.ScheduledFuture, e8.s50] */
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        t50 t50 = new t50(callable);
        return new s50(t50, this.f16245b.schedule(t50, j10, timeUnit));
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.util.concurrent.ScheduledFuture, e8.s50] */
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        di diVar = new di(runnable);
        return new s50(diVar, this.f16245b.scheduleAtFixedRate(diVar, j10, j11, timeUnit));
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.util.concurrent.ScheduledFuture, e8.s50] */
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        di diVar = new di(runnable);
        return new s50(diVar, this.f16245b.scheduleWithFixedDelay(diVar, j10, j11, timeUnit));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.concurrent.ScheduledFuture, e8.s50] */
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        t50 t50 = new t50(Executors.callable(runnable, (Object) null));
        return new s50(t50, this.f16245b.schedule(t50, j10, timeUnit));
    }
}
