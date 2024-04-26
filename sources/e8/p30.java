package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class p30 implements Parcelable.Creator<o30> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                bArr = b.b(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new o30(i10, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new o30[i10];
    }
}
