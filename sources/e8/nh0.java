package e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nh0 implements Parcelable.Creator<kh0> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z10 = false;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.e(parcel2, readInt);
                    break;
                case 3:
                    j10 = b.o(parcel2, readInt);
                    break;
                case 4:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 5:
                    str3 = b.e(parcel2, readInt);
                    break;
                case 6:
                    str4 = b.e(parcel2, readInt);
                    break;
                case 7:
                    bundle = b.a(parcel2, readInt);
                    break;
                case b4.f10106f:
                    z10 = b.k(parcel2, readInt);
                    break;
                case 9:
                    j11 = b.o(parcel2, readInt);
                    break;
                case 10:
                    str5 = b.e(parcel2, readInt);
                    break;
                case 11:
                    i10 = b.n(parcel2, readInt);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new kh0(str, j10, str2, str3, str4, bundle, z10, j11, str5, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new kh0[i10];
    }
}
