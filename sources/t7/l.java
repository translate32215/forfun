package t7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import s7.a;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class l implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 == 4) {
                aVar = (a) b.d(parcel, readInt, a.CREATOR);
            } else if (c10 != 1000) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new Status(i10, i11, str, pendingIntent, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
