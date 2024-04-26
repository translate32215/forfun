package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.n;
import s7.a;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class m implements Parcelable.Creator<l> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        a aVar = null;
        n nVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                aVar = (a) b.d(parcel, readInt, a.CREATOR);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                nVar = (n) b.d(parcel, readInt, n.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new l(i10, aVar, nVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
