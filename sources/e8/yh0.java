package e8;

import android.os.Parcel;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.ox;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class yh0 extends os implements ox {

    /* renamed from: a  reason: collision with root package name */
    public final wh0 f17631a;

    public yh0(wh0 wh0) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f17631a = wh0;
    }

    public final void n() {
        this.f17631a.n();
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        this.f17631a.n();
        parcel2.writeNoException();
        return true;
    }
}
