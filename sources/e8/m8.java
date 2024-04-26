package e8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class m8 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15468a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f15469b;

    public m8(int i10) {
        this.f15468a = i10;
        if (i10 != 1) {
            this.f15469b = new AtomicInteger(1);
        } else {
            this.f15469b = new AtomicInteger(1);
        }
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f15468a) {
            case 0:
                int andIncrement = this.f15469b.getAndIncrement();
                StringBuilder sb2 = new StringBuilder(42);
                sb2.append("AdWorker(SCION_TASK_EXECUTOR) #");
                sb2.append(andIncrement);
                return new Thread(runnable, sb2.toString());
            default:
                int andIncrement2 = this.f15469b.getAndIncrement();
                StringBuilder sb3 = new StringBuilder(25);
                sb3.append("AdWorker(NG) #");
                sb3.append(andIncrement2);
                return new Thread(runnable, sb3.toString());
        }
    }
}
