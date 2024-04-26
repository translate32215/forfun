package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.uh;
import com.google.android.gms.internal.ads.y6;
import com.google.android.gms.internal.ads.yh;
import e.h;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sy implements dy<ny> {

    /* renamed from: a  reason: collision with root package name */
    public final r8 f16535a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16536b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f16537c;

    /* renamed from: d  reason: collision with root package name */
    public final y6 f16538d;

    /* renamed from: e  reason: collision with root package name */
    public final ScheduledExecutorService f16539e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f16540f;

    public sy(r8 r8Var, int i10, Context context, y6 y6Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f16535a = r8Var;
        this.f16536b = i10;
        this.f16537c = context;
        this.f16538d = y6Var;
        this.f16539e = scheduledExecutorService;
        this.f16540f = executor;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [e8.p50, e8.l50] */
    /* JADX WARNING: type inference failed for: r4v1, types: [e8.p50<e8.ny>, com.google.android.gms.internal.ads.eh, com.google.android.gms.internal.ads.gh, java.lang.Runnable] */
    public final p50<ny> b() {
        ? s10 = l50.v(yh.d(new ry(this), this.f16540f)).t(ty.f16824a, this.f16540f).s(((Long) ti0.f16763j.f16769f.a(t.f16687y0)).longValue(), TimeUnit.MILLISECONDS, this.f16539e);
        m7 m7Var = new m7(this);
        uh uhVar = uh.f8247a;
        ? ehVar = new eh(s10, Exception.class, m7Var);
        s10.a(ehVar, h.d(uhVar, ehVar));
        return ehVar;
    }
}
