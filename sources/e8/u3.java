package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u3 implements Parcelable.Creator<r3> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j10 = 0;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z10 = b.k(parcel2, readInt);
                    break;
                case 2:
                    str = b.e(parcel2, readInt);
                    break;
                case 3:
                    i10 = b.n(parcel2, readInt);
                    break;
                case 4:
                    bArr = b.b(parcel2, readInt);
                    break;
                case 5:
                    strArr = b.f(parcel2, readInt);
                    break;
                case 6:
                    strArr2 = b.f(parcel2, readInt);
                    break;
                case 7:
                    z11 = b.k(parcel2, readInt);
                    break;
                case b4.f10106f:
                    j10 = b.o(parcel2, readInt);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new r3(z10, str, i10, bArr, strArr, strArr2, z11, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new r3[i10];
    }
}
