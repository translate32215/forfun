package e8;

import androidx.appcompat.widget.o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j9 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f15103a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15104b;

    public j9(String str) {
        this.f15104b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f15104b;
        int andIncrement = this.f15103a.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(o.a(str, 23));
        sb2.append("AdWorker(");
        sb2.append(str);
        sb2.append(") #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
