package e8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hb0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f14887a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f14888b = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f14887a.newThread(runnable);
        int andIncrement = this.f14888b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append("gads-");
        sb2.append(andIncrement);
        newThread.setName(sb2.toString());
        return newThread;
    }
}
