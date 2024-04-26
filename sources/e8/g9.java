package e8;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class g9 extends ScheduledThreadPoolExecutor {
    public g9(ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    public final void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
