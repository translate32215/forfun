package e8;

import com.google.android.gms.internal.ads.a5;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class u6 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f16849a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a5 f16850b;

    public u6(a5 a5Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f16850b = a5Var;
        this.f16849a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f16850b.b(th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16849a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f16849a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
