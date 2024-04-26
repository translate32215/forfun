package e8;

import com.google.android.gms.internal.ads.xq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ia0 implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f15004a = new ia0();

    public final boolean a(int i10) {
        xq xqVar;
        if (i10 == 0) {
            xqVar = xq.SAFE;
        } else if (i10 == 1) {
            xqVar = xq.DANGEROUS;
        } else if (i10 == 2) {
            xqVar = xq.UNKNOWN;
        } else if (i10 != 3) {
            xqVar = i10 != 4 ? null : xq.DANGEROUS_HOST;
        } else {
            xqVar = xq.POTENTIALLY_UNWANTED;
        }
        if (xqVar != null) {
            return true;
        }
        return false;
    }
}
