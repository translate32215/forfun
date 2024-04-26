package e8;

import com.google.android.gms.internal.ads.qe;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wg implements pj, ug0 {

    /* renamed from: a  reason: collision with root package name */
    public final qe f17347a;

    /* renamed from: b  reason: collision with root package name */
    public final yi f17348b;

    /* renamed from: c  reason: collision with root package name */
    public final sj f17349c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f17350d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f17351e = new AtomicBoolean();

    public wg(qe qeVar, yi yiVar, sj sjVar) {
        this.f17347a = qeVar;
        this.f17348b = yiVar;
        this.f17349c = sjVar;
    }

    public final void t(vg0 vg0) {
        if (this.f17347a.f7950e == 1 && vg0.f17142j && this.f17350d.compareAndSet(false, true)) {
            this.f17348b.O();
        }
        if (vg0.f17142j && this.f17351e.compareAndSet(false, true)) {
            sj sjVar = this.f17349c;
            synchronized (sjVar) {
                sjVar.I0(rj.f16330a);
            }
        }
    }

    public final synchronized void v() {
        if (this.f17347a.f7950e != 1 && this.f17350d.compareAndSet(false, true)) {
            this.f17348b.O();
        }
    }
}
