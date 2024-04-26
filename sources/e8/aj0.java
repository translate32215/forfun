package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class aj0 implements Parcelable.Creator<yi0> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new yi0(i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new yi0[i10];
    }
}
