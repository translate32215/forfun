package e8;

import com.google.android.gms.internal.ads.a5;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class w6 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f17218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a5 f17219b;

    public w6(a5 a5Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f17219b = a5Var;
        this.f17218a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f17219b.b(th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f17218a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f17218a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
