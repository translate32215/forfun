package e8;

import com.google.android.gms.internal.ads.jh;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.uh;
import com.google.android.gms.internal.ads.xh;
import com.google.android.gms.internal.ads.yh;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class l50<V> {
    public static <V> l50<V> v(p50<V> p50) {
        if (p50 instanceof l50) {
            return (l50) p50;
        }
        return new xh(p50);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e8.p50, e8.l50] */
    public final l50<V> s(long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (l50) yh.e(this, j10, timeUnit, scheduledExecutorService);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.mh, e8.l50<T>, java.lang.Runnable] */
    public final <T> l50<T> t(mg<? super V, T> mgVar, Executor executor) {
        ? mhVar = new mh(this, mgVar);
        executor.getClass();
        if (executor != uh.f8247a) {
            executor = new q50(executor, mhVar);
        }
        a(mhVar, executor);
        return mhVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.jh, e8.l50<T>, java.lang.Runnable] */
    public final <T> l50<T> u(oh<? super V, T> ohVar, Executor executor) {
        executor.getClass();
        ? jhVar = new jh(this, ohVar);
        if (executor != uh.f8247a) {
            executor = new q50(executor, jhVar);
        }
        a(jhVar, executor);
        return jhVar;
    }
}
