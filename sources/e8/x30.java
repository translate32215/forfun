package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class x30 implements Parcelable.Creator<y30> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        byte[] bArr = null;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                bArr = b.b(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                i11 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new y30(i10, bArr, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y30[i10];
    }
}
