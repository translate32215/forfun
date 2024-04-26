package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class w implements Parcelable.Creator<v> {
    public Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new v(bundle);
    }

    public Object[] newArray(int i10) {
        return new v[i10];
    }
}
