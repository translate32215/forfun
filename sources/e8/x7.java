package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class x7 implements Parcelable.Creator<u7> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        fi0 fi0 = null;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                fi0 = (fi0) b.d(parcel, readInt, fi0.CREATOR);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new u7(fi0, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new u7[i10];
    }
}
