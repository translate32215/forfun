package n7;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class s extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f22389a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(v vVar) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f22389a = vVar;
        setThreadFactory(new t());
        allowCoreThreadTimeOut(true);
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new r(this, runnable, obj);
    }
}
