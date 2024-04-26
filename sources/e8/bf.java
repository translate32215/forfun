package e8;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.n8;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.tm;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bf implements ta0<n8> {

    /* renamed from: a  reason: collision with root package name */
    public final ab0<Context> f13994a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Executor> f13995b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<ScheduledExecutorService> f13996c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<t00> f13997d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<qe> f13998e;

    /* renamed from: f  reason: collision with root package name */
    public final ab0<d30> f13999f;

    /* renamed from: g  reason: collision with root package name */
    public final ab0<c10> f14000g;

    /* renamed from: h  reason: collision with root package name */
    public final ab0<View> f14001h;

    /* renamed from: i  reason: collision with root package name */
    public final ab0<tm> f14002i;

    /* renamed from: j  reason: collision with root package name */
    public final ab0<i0> f14003j;

    /* renamed from: k  reason: collision with root package name */
    public final ab0<j0> f14004k;

    public bf(ab0<Context> ab0, ab0<Executor> ab02, ab0<ScheduledExecutorService> ab03, ab0<t00> ab04, ab0<qe> ab05, ab0<d30> ab06, ab0<c10> ab07, ab0<View> ab08, ab0<tm> ab09, ab0<i0> ab010, ab0<j0> ab011) {
        this.f13994a = ab0;
        this.f13995b = ab02;
        this.f13996c = ab03;
        this.f13997d = ab04;
        this.f13998e = ab05;
        this.f13999f = ab06;
        this.f14000g = ab07;
        this.f14001h = ab08;
        this.f14002i = ab09;
        this.f14003j = ab010;
        this.f14004k = ab011;
    }

    public static bf a(ab0<Context> ab0, ab0<Executor> ab02, ab0<ScheduledExecutorService> ab03, ab0<t00> ab04, ab0<qe> ab05, ab0<d30> ab06, ab0<c10> ab07, ab0<View> ab08, ab0<tm> ab09, ab0<i0> ab010, ab0<j0> ab011) {
        return new bf(ab0, ab02, ab03, ab04, ab05, ab06, ab07, ab08, ab09, ab010, ab011);
    }

    public final /* synthetic */ Object get() {
        return new n8(this.f13994a.get(), this.f13995b.get(), this.f13996c.get(), this.f13997d.get(), this.f13998e.get(), this.f13999f.get(), this.f14000g.get(), this.f14001h.get(), this.f14002i.get(), this.f14003j.get(), this.f14004k.get());
    }
}
