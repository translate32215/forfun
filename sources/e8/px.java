package e8;

import com.google.android.gms.internal.ads.yh;
import e8.by;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class px<S extends by<?>> implements dy<S> {

    /* renamed from: a  reason: collision with root package name */
    public final dy<S> f16032a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16033b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f16034c;

    public px(dy<S> dyVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f16032a = dyVar;
        this.f16033b = j10;
        this.f16034c = scheduledExecutorService;
    }

    public final p50<S> b() {
        p50<S> b10 = this.f16032a.b();
        long j10 = this.f16033b;
        if (j10 > 0) {
            b10 = yh.e(b10, j10, TimeUnit.MILLISECONDS, this.f16034c);
        }
        return yh.k(b10, Throwable.class, rx.f16352a, h9.f14886f);
    }
}
