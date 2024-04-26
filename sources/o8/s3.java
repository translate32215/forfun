package o8;

import com.google.android.gms.measurement.internal.k;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class s3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f23426a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f23427b;

    public s3(k kVar, String str) {
        this.f23427b = kVar;
        this.f23426a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f23427b.f8864a.d().f8797f.b(this.f23426a, th);
    }
}
