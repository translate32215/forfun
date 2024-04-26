package k8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class b1 implements Parcelable.Creator<a1> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = b.o(parcel2, readInt);
                    break;
                case 2:
                    j11 = b.o(parcel2, readInt);
                    break;
                case 3:
                    z10 = b.k(parcel2, readInt);
                    break;
                case 4:
                    str = b.e(parcel2, readInt);
                    break;
                case 5:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 6:
                    str3 = b.e(parcel2, readInt);
                    break;
                case 7:
                    bundle = b.a(parcel2, readInt);
                    break;
                case b4.f10106f:
                    str4 = b.e(parcel2, readInt);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new a1(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new a1[i10];
    }
}
