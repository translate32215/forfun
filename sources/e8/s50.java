package e8;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class s50<V> extends m50<V> implements p50<V> {

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledFuture<?> f16376b;

    public s50(p50<V> p50, ScheduledFuture<?> scheduledFuture) {
        super(p50);
        this.f16376b = scheduledFuture;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.s50, com.google.android.gms.internal.ads.wh] */
    public final boolean cancel(boolean z10) {
        boolean cancel = s50.super.cancel(z10);
        if (cancel) {
            this.f16376b.cancel(z10);
        }
        return cancel;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f16376b.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f16376b.getDelay(timeUnit);
    }
}
