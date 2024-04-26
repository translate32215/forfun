package e8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.z4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class t6 implements Parcelable.Creator<z4> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                iBinder2 = b.m(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new z4(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new z4[i10];
    }
}
