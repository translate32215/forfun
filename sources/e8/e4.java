package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.z1;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e4 implements Parcelable.Creator<z1> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                i12 = b.n(parcel, readInt);
            } else if (c10 != 1000) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new z1(i10, i11, str, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new z1[i10];
    }
}
