package e8;

import com.google.android.gms.internal.ads.lh;
import com.google.android.gms.internal.ads.sg;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i50 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p50 f14990a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14991b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ lh f14992c;

    public i50(lh lhVar, p50 p50, int i10) {
        this.f14992c = lhVar;
        this.f14990a = p50;
        this.f14991b = i10;
    }

    public final void run() {
        try {
            if (this.f14990a.isCancelled()) {
                lh lhVar = this.f14992c;
                lhVar.f7389t = null;
                lhVar.cancel(false);
            } else {
                this.f14992c.t(this.f14991b, this.f14990a);
            }
        } finally {
            lh.y(this.f14992c, (sg) null);
        }
    }
}
