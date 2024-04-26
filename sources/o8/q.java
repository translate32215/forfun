package o8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class q implements Parcelable.Creator<p> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new p(bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
