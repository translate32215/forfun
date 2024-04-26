package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.e5;
import java.util.ArrayList;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class y6 implements Parcelable.Creator<e5> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                arrayList = b.g(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new e5(z10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e5[i10];
    }
}
