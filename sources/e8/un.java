package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.d3;
import com.google.android.gms.internal.ads.e3;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.qe;
import f7.d0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class un implements ta0<tn> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16967a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<d0> f16968b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<w00> f16969c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<mn> f16970d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<jn> f16971e;

    /* renamed from: f  reason: collision with root package name */
    public final ab0<ia> f16972f;

    /* renamed from: g  reason: collision with root package name */
    public final ab0<ja> f16973g;

    /* renamed from: h  reason: collision with root package name */
    public final ab0<Executor> f16974h;

    /* renamed from: i  reason: collision with root package name */
    public final ab0<Executor> f16975i;

    /* renamed from: j  reason: collision with root package name */
    public final ab0<in> f16976j;

    public un(ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04, ab0 ab05, ab0 ab06, ab0 ab07, ab0 ab08, ab0 ab09, int i10) {
        this.f16967a = i10;
        if (i10 == 1) {
            this.f16968b = ab0;
            this.f16969c = ab02;
            this.f16970d = ab03;
            this.f16971e = ab04;
            this.f16972f = ab05;
            this.f16973g = ab06;
            this.f16974h = ab07;
            this.f16975i = ab08;
            this.f16976j = ab09;
        } else if (i10 != 2) {
            this.f16968b = ab0;
            this.f16969c = ab02;
            this.f16970d = ab03;
            this.f16971e = ab04;
            this.f16972f = ab05;
            this.f16973g = ab06;
            this.f16974h = ab07;
            this.f16975i = ab08;
            this.f16976j = ab09;
        } else {
            this.f16968b = ab0;
            this.f16969c = ab02;
            this.f16970d = ab03;
            this.f16971e = ab04;
            this.f16972f = ab05;
            this.f16973g = ab06;
            this.f16974h = ab07;
            this.f16975i = ab08;
            this.f16976j = ab09;
        }
    }

    public static un a(ab0<d0> ab0, ab0<w00> ab02, ab0<mn> ab03, ab0<jn> ab04, ab0<ia> ab05, ab0<ja> ab06, ab0<Executor> ab07, ab0<Executor> ab08, ab0<in> ab09) {
        return new un(ab0, ab02, ab03, ab04, ab05, ab06, ab07, ab08, ab09, 0);
    }

    public final /* synthetic */ Object get() {
        switch (this.f16967a) {
            case 0:
                return new tn(this.f16968b.get(), this.f16969c.get(), this.f16970d.get(), this.f16971e.get(), this.f16972f.get(), this.f16973g.get(), this.f16974h.get(), this.f16975i.get(), this.f16976j.get());
            case 1:
                return new ka((d3) this.f16968b.get(), (e3) this.f16969c.get(), (j3) this.f16970d.get(), (yi) this.f16971e.get(), (ki) this.f16972f.get(), (Context) this.f16973g.get(), (qe) this.f16974h.get(), (f9) this.f16975i.get(), (w00) this.f16976j.get());
            default:
                return new yq((Executor) this.f16968b.get(), (Context) this.f16969c.get(), (WeakReference) this.f16970d.get(), (Executor) this.f16971e.get(), (gb) this.f16972f.get(), (ScheduledExecutorService) this.f16973g.get(), (uq) this.f16974h.get(), (f9) this.f16975i.get(), (fl) this.f16976j.get());
        }
    }
}
