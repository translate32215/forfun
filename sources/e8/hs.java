package e8;

import com.google.android.gms.internal.ads.mb;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class hs implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f14933a = new hs();

    public final boolean a(int i10) {
        mb mbVar;
        if (i10 == 0) {
            mbVar = mb.UNKNOWN_ENCRYPTION_METHOD;
        } else if (i10 == 1) {
            mbVar = mb.BITSLICER;
        } else if (i10 == 2) {
            mbVar = mb.TINK_HYBRID;
        } else if (i10 == 3) {
            mbVar = mb.UNENCRYPTED;
        } else if (i10 != 4) {
            mbVar = i10 != 5 ? null : mb.DG_XTEA;
        } else {
            mbVar = mb.DG;
        }
        if (mbVar != null) {
            return true;
        }
        return false;
    }
}
