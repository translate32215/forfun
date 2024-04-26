package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.ze;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o10 implements Parcelable.Creator<ze> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    i11 = b.n(parcel, readInt);
                    break;
                case 3:
                    i12 = b.n(parcel, readInt);
                    break;
                case 4:
                    i13 = b.n(parcel, readInt);
                    break;
                case 5:
                    str = b.e(parcel, readInt);
                    break;
                case 6:
                    i14 = b.n(parcel, readInt);
                    break;
                case 7:
                    i15 = b.n(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new ze(i10, i11, i12, i13, str, i14, i15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ze[i10];
    }
}
