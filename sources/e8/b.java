package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class b implements Parcelable.Creator<c> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = w7.b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = w7.b.n(parcel, readInt);
            } else if (c10 != 2) {
                w7.b.q(parcel, readInt);
            } else {
                i11 = w7.b.n(parcel, readInt);
            }
        }
        w7.b.j(parcel, r10);
        return new c(i10, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
