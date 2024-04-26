package e8;

import com.google.android.gms.internal.ads.ov;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gq implements ta0<hq> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14816a;

    public gq(int i10) {
        this.f14816a = i10;
    }

    public final Object get() {
        switch (this.f14816a) {
            case 0:
                return new hq(ov.REQUEST_WILL_PROCESS_RESPONSE, ov.REQUEST_DID_PROCESS_RESPONSE, ov.REQUEST_FAILED_TO_PROCESS_RESPONSE);
            default:
                return new w10();
        }
    }
}
