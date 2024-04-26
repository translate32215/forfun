package s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.d;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class y implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                i11 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new d(z10, str, i10, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
