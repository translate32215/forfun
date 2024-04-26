package e8;

import com.google.android.gms.internal.ads.uh;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h9 {

    /* renamed from: a  reason: collision with root package name */
    public static final o50 f14881a;

    /* renamed from: b  reason: collision with root package name */
    public static final o50 f14882b;

    /* renamed from: c  reason: collision with root package name */
    public static final o50 f14883c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f14884d = new g9(new j9("Schedule"));

    /* renamed from: e  reason: collision with root package name */
    public static final o50 f14885e = a(new i9(0));

    /* renamed from: f  reason: collision with root package name */
    public static final o50 f14886f = a(uh.f8247a);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f14881a = a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, timeUnit, new SynchronousQueue(), new j9("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, timeUnit, new LinkedBlockingQueue(), new j9("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14882b = a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, timeUnit, new LinkedBlockingQueue(), new j9("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f14883c = a(threadPoolExecutor2);
    }

    public static o50 a(Executor executor) {
        return new k9(executor, (g9) null);
    }
}
