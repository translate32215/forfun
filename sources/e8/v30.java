package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class v30 implements Parcelable.Creator<w30> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 3) {
                str = b.e(parcel, readInt);
            } else if (c10 == 4) {
                str2 = b.e(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                i12 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new w30(i10, i11, i12, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w30[i10];
    }
}
