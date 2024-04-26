package v7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.n;
import s7.a;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class s implements Parcelable.Creator<n> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        IBinder iBinder = null;
        a aVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 == 3) {
                aVar = (a) b.d(parcel, readInt, a.CREATOR);
            } else if (c10 == 4) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                z11 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new n(i10, iBinder, aVar, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
