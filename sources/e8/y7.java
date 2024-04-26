package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.a6;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class y7 implements Parcelable.Creator<a6> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new a6(str, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a6[i10];
    }
}
