package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a4 implements Parcelable.Creator<y3> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 3) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                str2 = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new y3(str, z10, i10, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y3[i10];
    }
}
