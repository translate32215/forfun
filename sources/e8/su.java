package e8;

import com.google.android.gms.internal.ads.pc;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class su<AdT> implements ta0<pc<AdT>> {
    public static <AdT> pc<AdT> a(n20 n20, qu quVar, ni niVar, d30 d30, e30 e30, bh<AdT> bhVar, Executor executor, ScheduledExecutorService scheduledExecutorService, qt qtVar) {
        return new pc(n20, quVar, niVar, d30, e30, bhVar, executor, scheduledExecutorService, qtVar);
    }
}
