package v7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s7.c;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class z implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Bundle bundle = null;
        c[] cVarArr = null;
        a aVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                bundle = b.a(parcel, readInt);
            } else if (c10 == 2) {
                cVarArr = (c[]) b.h(parcel, readInt, c.CREATOR);
            } else if (c10 == 3) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                aVar = (a) b.d(parcel, readInt, a.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new y(bundle, cVarArr, i10, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y[i10];
    }
}
