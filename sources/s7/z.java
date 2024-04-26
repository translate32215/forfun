package s7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.e;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class z implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 == 3) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                z11 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new e(str, iBinder, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
