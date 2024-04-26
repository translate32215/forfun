package v7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class v implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 3) {
                z11 = b.k(parcel, readInt);
            } else if (c10 == 4) {
                i11 = b.n(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                i12 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new g(i10, z10, z11, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
