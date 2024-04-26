package n7;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.gtm.zzax;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@SuppressLint({"StaticFieldLeak"})
/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class v {

    /* renamed from: f  reason: collision with root package name */
    public static volatile v f22391f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22392a;

    /* renamed from: b  reason: collision with root package name */
    public final List f22393b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final s f22394c = new s(this);

    /* renamed from: d  reason: collision with root package name */
    public volatile zzax f22395d;

    /* renamed from: e  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f22396e;

    public v(Context context) {
        Context applicationContext = context.getApplicationContext();
        i.h(applicationContext);
        this.f22392a = applicationContext;
        new n();
    }

    public static void b() {
        if (!(Thread.currentThread() instanceof u)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future a(Callable callable) {
        if (!(Thread.currentThread() instanceof u)) {
            return this.f22394c.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void c(Runnable runnable) {
        this.f22394c.submit(runnable);
    }
}
