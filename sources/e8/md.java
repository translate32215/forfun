package e8;

import com.google.android.gms.internal.ads.ov;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class md implements ta0<o7> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15495a;

    public md(int i10) {
        this.f15495a = i10;
    }

    public final Object get() {
        switch (this.f15495a) {
            case 0:
                return new n7();
            case 1:
                return "native";
            case 2:
                return new hq(ov.REQUEST_WILL_MAKE_NETWORK_REQUEST, ov.REQUEST_DID_RECEIVE_NETWORK_RESPONSE, ov.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST);
            default:
                return new i10();
        }
    }
}
