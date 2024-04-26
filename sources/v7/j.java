package v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class j implements Parcelable.Creator<com.google.android.gms.common.internal.j> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        ArrayList<e> arrayList = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                arrayList = b.i(parcel, readInt, e.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new com.google.android.gms.common.internal.j(i10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new com.google.android.gms.common.internal.j[i10];
    }
}
