package r7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class f implements Parcelable.Creator<a> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.q(parcel, readInt);
            } else {
                intent = (Intent) b.d(parcel, readInt, Intent.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new a(intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
