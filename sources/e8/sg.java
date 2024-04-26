package e8;

import com.google.android.gms.internal.ads.ov;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sg implements ta0<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16470a;

    public sg(int i10) {
        this.f16470a = i10;
    }

    public final Object get() {
        switch (this.f16470a) {
            case 0:
                return "banner";
            default:
                return new hq(ov.REQUEST_WILL_UPDATE_SIGNALS, ov.REQUEST_DID_UPDATE_SIGNALS, ov.REQUEST_FAILED_TO_UPDATE_SIGNALS);
        }
    }
}
