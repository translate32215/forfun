package s7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class l implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new a(i10, i11, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
