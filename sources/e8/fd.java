package e8;

import com.google.android.gms.internal.ads.ov;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fd implements ta0<f7> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14557a;

    public fd(int i10) {
        this.f14557a = i10;
    }

    public final Object get() {
        switch (this.f14557a) {
            case 0:
                return null;
            default:
                return new hq(ov.REQUEST_WILL_BUILD_URL, ov.REQUEST_DID_BUILD_URL, ov.REQUEST_FAILED_TO_BUILD_URL);
        }
    }
}
