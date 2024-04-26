package n7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class t implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f22390a = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f22390a.incrementAndGet();
        return new u(runnable, "measurement-" + incrementAndGet);
    }
}
