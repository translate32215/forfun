package q8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class i implements Parcelable.Creator<h> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = b.g(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
