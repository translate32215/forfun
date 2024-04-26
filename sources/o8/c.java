package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class c implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        w5 w5Var = null;
        String str3 = null;
        r rVar = null;
        r rVar2 = null;
        r rVar3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.e(parcel2, readInt);
                    break;
                case 3:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 4:
                    w5Var = (w5) b.d(parcel2, readInt, w5.CREATOR);
                    break;
                case 5:
                    j10 = b.o(parcel2, readInt);
                    break;
                case 6:
                    z10 = b.k(parcel2, readInt);
                    break;
                case 7:
                    str3 = b.e(parcel2, readInt);
                    break;
                case b4.f10106f:
                    rVar = (r) b.d(parcel2, readInt, r.CREATOR);
                    break;
                case 9:
                    j11 = b.o(parcel2, readInt);
                    break;
                case 10:
                    rVar2 = (r) b.d(parcel2, readInt, r.CREATOR);
                    break;
                case 11:
                    j12 = b.o(parcel2, readInt);
                    break;
                case 12:
                    rVar3 = (r) b.d(parcel2, readInt, r.CREATOR);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new b(str, str2, w5Var, j10, z10, str3, rVar, j11, rVar2, j12, rVar3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
