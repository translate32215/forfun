package e8;

import com.google.android.gms.internal.ads.gh;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q50 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f16095a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ gh f16096b;

    public q50(Executor executor, gh ghVar) {
        this.f16095a = executor;
        this.f16096b = ghVar;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f16095a.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.f16096b.j(e10);
        }
    }
}
