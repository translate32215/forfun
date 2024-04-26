package e8;

import com.google.android.gms.internal.ads.ih;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class k9 extends ih {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f15244a;

    public k9(Executor executor, g9 g9Var) {
        this.f15244a = executor;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        this.f15244a.execute(runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
