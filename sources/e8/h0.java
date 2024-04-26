package e8;

import com.google.android.gms.internal.ads.ov;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h0 implements ta0<i0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14839a;

    public h0(int i10) {
        this.f14839a = i10;
    }

    public final Object get() {
        switch (this.f14839a) {
            case 0:
                return new i0();
            default:
                return new hq(ov.REQUEST_WILL_RENDER, ov.REQUEST_DID_RENDER, ov.REQUEST_FAILED_TO_RENDER);
        }
    }
}
