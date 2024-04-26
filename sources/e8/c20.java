package e8;

import com.google.android.gms.internal.ads.ci;
import com.google.android.gms.internal.ads.u7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c20 implements ta0<o50> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14079a;

    public c20(int i10) {
        this.f14079a = i10;
    }

    public final Object get() {
        o50 o50;
        o50 o502;
        switch (this.f14079a) {
            case 0:
                ExecutorService b10 = b40.f13878a.b(1, Executors.defaultThreadFactory());
                if (b10 instanceof o50) {
                    o50 = (o50) b10;
                } else {
                    if (b10 instanceof ScheduledExecutorService) {
                        o502 = new r50((ScheduledExecutorService) b10);
                    } else {
                        o502 = new ci(b10);
                    }
                    o50 = o502;
                }
                jc0.b(o50, "Cannot return null from a non-@Nullable @Provides method");
                return o50;
            default:
                return new u7();
        }
    }
}
