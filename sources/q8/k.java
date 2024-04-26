package q8;

import android.os.Parcel;
import android.os.Parcelable;
import v7.q;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class k implements Parcelable.Creator<j> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        q qVar = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                qVar = (q) b.d(parcel, readInt, q.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new j(i10, qVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
