package e8;

import com.google.android.gms.internal.ads.xb;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class gu implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f14825a = new gu();

    public final boolean a(int i10) {
        xb xbVar;
        if (i10 == 0) {
            xbVar = xb.UNKNOWN_PROTO;
        } else if (i10 == 1) {
            xbVar = xb.AFMA_SIGNALS;
        } else if (i10 != 2) {
            xbVar = i10 != 3 ? null : xb.PARTNER_SIGNALS;
        } else {
            xbVar = xb.UNITY_SIGNALS;
        }
        if (xbVar != null) {
            return true;
        }
        return false;
    }
}
