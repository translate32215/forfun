package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f implements Parcelable.Creator<g> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        float f10 = 0.0f;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    z10 = b.k(parcel, readInt);
                    break;
                case 3:
                    z11 = b.k(parcel, readInt);
                    break;
                case 4:
                    str = b.e(parcel, readInt);
                    break;
                case 5:
                    z12 = b.k(parcel, readInt);
                    break;
                case 6:
                    f10 = b.l(parcel, readInt);
                    break;
                case 7:
                    i10 = b.n(parcel, readInt);
                    break;
                case b4.f10106f:
                    z13 = b.k(parcel, readInt);
                    break;
                case 9:
                    z14 = b.k(parcel, readInt);
                    break;
                case 10:
                    z15 = b.k(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new g(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
