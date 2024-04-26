package e8;

import f7.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gh {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f14780a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f14781b;

    /* renamed from: c  reason: collision with root package name */
    public final p50<fh> f14782c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f14783d = true;

    public gh(Executor executor, ScheduledExecutorService scheduledExecutorService, p50<fh> p50) {
        this.f14780a = executor;
        this.f14781b = scheduledExecutorService;
        this.f14782c = p50;
    }

    public static void a(gh ghVar) {
        ghVar.getClass();
        o50 o50 = h9.f14885e;
        ((k9) o50).f15244a.execute(new j(ghVar));
    }
}
