package n7;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class r extends FutureTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f22388a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(s sVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f22388a = sVar;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f22388a.f22389a.f22396e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(th)));
        }
        super.setException(th);
    }
}
