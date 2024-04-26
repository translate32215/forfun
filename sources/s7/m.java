package s7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class m implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                j10 = b.o(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new c(str, i10, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
