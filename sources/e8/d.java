package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class d implements Parcelable.Creator<e> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 15) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new e(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
