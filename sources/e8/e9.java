package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e9 implements Parcelable.Creator<f9> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 4) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 5) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 6) {
                b.q(parcel, readInt);
            } else {
                z11 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new f9(str, i10, i11, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f9[i10];
    }
}
