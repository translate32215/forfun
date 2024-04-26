package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.eh;
import e.h;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class my implements dy<ky> {

    /* renamed from: a  reason: collision with root package name */
    public final r8 f15561a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f15562b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f15563c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f15564d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15565e;

    public my(r8 r8Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10) {
        this.f15561a = r8Var;
        this.f15562b = context;
        this.f15563c = scheduledExecutorService;
        this.f15564d = executor;
        this.f15565e = i10;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [e8.p50, e8.l50] */
    /* JADX WARNING: type inference failed for: r4v1, types: [e8.p50<e8.ky>, com.google.android.gms.internal.ads.eh, com.google.android.gms.internal.ads.gh, java.lang.Runnable] */
    public final p50<ky> b() {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16681x0)).booleanValue()) {
            return new ai.a(new Exception("Did not ad Ad ID into query param."));
        }
        ? s10 = l50.v(this.f15561a.b(this.f15562b, this.f15565e)).t(ly.f15441a, this.f15564d).s(((Long) ti0.f16763j.f16769f.a(t.f16687y0)).longValue(), TimeUnit.MILLISECONDS, this.f15563c);
        bp bpVar = new bp(this);
        Executor executor = this.f15564d;
        ? ehVar = new eh(s10, Throwable.class, bpVar);
        s10.a(ehVar, h.d(executor, ehVar));
        return ehVar;
    }
}
