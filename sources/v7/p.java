package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class p implements Parcelable.Creator<e> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel2, readInt);
                    break;
                case 2:
                    i11 = b.n(parcel2, readInt);
                    break;
                case 3:
                    i12 = b.n(parcel2, readInt);
                    break;
                case 4:
                    j10 = b.o(parcel2, readInt);
                    break;
                case 5:
                    j11 = b.o(parcel2, readInt);
                    break;
                case 6:
                    str = b.e(parcel2, readInt);
                    break;
                case 7:
                    str2 = b.e(parcel2, readInt);
                    break;
                case b4.f10106f:
                    i13 = b.n(parcel2, readInt);
                    break;
                case 9:
                    i14 = b.n(parcel2, readInt);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new e(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
