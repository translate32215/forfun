package e8;

import com.google.android.gms.internal.ads.nb;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ts implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f16809a = new ts();

    public final boolean a(int i10) {
        nb nbVar;
        if (i10 == 0) {
            nbVar = nb.ENUM_FALSE;
        } else if (i10 == 1) {
            nbVar = nb.ENUM_TRUE;
        } else if (i10 != 2) {
            nbVar = i10 != 1000 ? null : nb.ENUM_UNKNOWN;
        } else {
            nbVar = nb.ENUM_FAILURE;
        }
        if (nbVar != null) {
            return true;
        }
        return false;
    }
}
