package e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class c4 implements Parcelable.Creator<b4> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new b4(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b4[i10];
    }
}
