package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.fx;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class mi0 implements Parcelable.Creator<fx> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 3) {
                str = b.e(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                j10 = b.o(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new fx(i10, i11, str, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new fx[i10];
    }
}
