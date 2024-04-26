package e8;

import com.google.android.gms.ads.internal.overlay.c;
import e7.k;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lh implements k {

    /* renamed from: a  reason: collision with root package name */
    public final dj f15392a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f15393b = new AtomicBoolean(false);

    public lh(dj djVar) {
        this.f15392a = djVar;
    }

    public final void G1() {
        this.f15392a.I0(hj.f14919a);
    }

    public final void J3(c cVar) {
        this.f15393b.set(true);
        this.f15392a.I0(fj.f14649a);
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void x0() {
    }
}
