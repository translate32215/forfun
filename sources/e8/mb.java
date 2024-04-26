package e8;

import com.google.android.gms.internal.ads.q7;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mb extends q7 {
    public mb(ia iaVar) {
        super(iaVar);
    }

    public final void h() {
    }

    public final boolean r(String str) {
        ia iaVar = (ia) this.f7921c.get();
        if (iaVar != null) {
            iaVar.h(y8.h(str), this);
        }
        e.K("VideoStreamNoopCache is doing nothing.");
        l(str, y8.h(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
