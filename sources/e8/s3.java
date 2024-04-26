package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class s3 implements Parcelable.Creator<p3> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                strArr = b.f(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                strArr2 = b.f(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new p3(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new p3[i10];
    }
}
