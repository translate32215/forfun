package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import java.util.ArrayList;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f8 implements Parcelable.Creator<c8> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    str2 = b.e(parcel, readInt);
                    break;
                case 4:
                    z10 = b.k(parcel, readInt);
                    break;
                case 5:
                    z11 = b.k(parcel, readInt);
                    break;
                case 6:
                    arrayList = b.g(parcel, readInt);
                    break;
                case 7:
                    z12 = b.k(parcel, readInt);
                    break;
                case b4.f10106f:
                    z13 = b.k(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = b.g(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new c8(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c8[i10];
    }
}
