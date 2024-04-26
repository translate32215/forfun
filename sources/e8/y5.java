package e8;

import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.internal.ads.zzapp;
import e7.k;
import l0.e;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class y5 implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzapp f17577a;

    public y5(zzapp zzapp) {
        this.f17577a = zzapp;
    }

    public final void G1() {
        e.E("Opening AdMobCustomTabsAdapter overlay.");
        zzapp zzapp = this.f17577a;
        ((g) zzapp.f8771b).s(zzapp);
    }

    public final void J3(c cVar) {
        e.E("AdMobCustomTabsAdapter overlay is closed.");
        zzapp zzapp = this.f17577a;
        ((g) zzapp.f8771b).o(zzapp);
    }

    public final void onPause() {
        e.E("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        e.E("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void x0() {
    }
}
