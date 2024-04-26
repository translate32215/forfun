package e7;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.overlay.c;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n extends a {
    public n(Activity activity) {
        super(activity);
    }

    public final void h6(Bundle bundle) {
        e.H("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f5637v = c.OTHER;
        this.f5625b.finish();
    }
}
