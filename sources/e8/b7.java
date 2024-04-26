package e8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b7 implements Parcelable.Creator<a7> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b.d(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new a7(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a7[i10];
    }
}
