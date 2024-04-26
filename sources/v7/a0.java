package v7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class a0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        g gVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    gVar = (g) b.d(parcel, readInt, g.CREATOR);
                    break;
                case 2:
                    z10 = b.k(parcel, readInt);
                    break;
                case 3:
                    z11 = b.k(parcel, readInt);
                    break;
                case 4:
                    iArr = b.c(parcel, readInt);
                    break;
                case 5:
                    i10 = b.n(parcel, readInt);
                    break;
                case 6:
                    iArr2 = b.c(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new a(gVar, z10, z11, iArr, i10, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
