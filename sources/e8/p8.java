package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.v6;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class p8 implements Parcelable.Creator<v6> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        li0 li0 = null;
        fi0 fi0 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                str2 = b.e(parcel, readInt);
            } else if (c10 == 3) {
                li0 = (li0) b.d(parcel, readInt, li0.CREATOR);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                fi0 = (fi0) b.d(parcel, readInt, fi0.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new v6(str, str2, li0, fi0);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new v6[i10];
    }
}
