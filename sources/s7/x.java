package s7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class x implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 3) {
                z11 = b.k(parcel, readInt);
            } else if (c10 == 4) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                z12 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new w(str, z10, z11, iBinder, z12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w[i10];
    }
}
