package e8;

import com.google.android.gms.internal.ads.qe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cu implements lt<dg> {

    /* renamed from: a  reason: collision with root package name */
    public final pg f14190a;

    /* renamed from: b  reason: collision with root package name */
    public final xt f14191b;

    /* renamed from: c  reason: collision with root package name */
    public final o50 f14192c;

    /* renamed from: d  reason: collision with root package name */
    public final ni f14193d;

    /* renamed from: e  reason: collision with root package name */
    public final ScheduledExecutorService f14194e;

    public cu(pg pgVar, xt xtVar, ni niVar, ScheduledExecutorService scheduledExecutorService, o50 o50) {
        this.f14190a = pgVar;
        this.f14191b = xtVar;
        this.f14193d = niVar;
        this.f14194e = scheduledExecutorService;
        this.f14192c = o50;
    }

    public final boolean a(t00 t00, qe qeVar) {
        return ((w00) t00.f16700a.f8042b).a() != null && this.f14191b.a(t00, qeVar);
    }

    public final p50<dg> b(t00 t00, qe qeVar) {
        return this.f14192c.i(new es(this, t00, qeVar));
    }
}
