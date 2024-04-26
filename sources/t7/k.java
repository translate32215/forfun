package t7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class k implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new Scope(i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
