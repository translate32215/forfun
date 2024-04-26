package a7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class o implements Parcelable.Creator<k> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 2) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                iBinder2 = b.m(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new k(z10, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
