package e8;

import android.os.Parcel;
import com.google.android.gms.internal.ads.jy;
import com.google.android.gms.internal.ads.os;
import k7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class gi0 extends os implements jy {

    /* renamed from: a  reason: collision with root package name */
    public final a f14787a;

    public gi0(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        this.f14787a = aVar;
    }

    public final void Q() {
        a aVar = this.f14787a;
        if (aVar != null) {
            aVar.w();
        }
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        a aVar = this.f14787a;
        if (aVar != null) {
            aVar.w();
        }
        parcel2.writeNoException();
        return true;
    }
}
