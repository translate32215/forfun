package e8;

import com.google.android.gms.internal.ads.ov;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hd implements ta0<HashMap<String, ks>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14895a;

    public hd(int i10) {
        this.f14895a = i10;
    }

    public final Object get() {
        switch (this.f14895a) {
            case 0:
                return new HashMap();
            case 1:
                return "interstitial";
            default:
                return new hq(ov.REQUEST_WILL_UPDATE_GMS_SIGNALS, ov.REQUEST_DID_UPDATE_GMS_SIGNALS, ov.REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS);
        }
    }
}
