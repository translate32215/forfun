package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.b4;
import java.util.ArrayList;
import java.util.List;
import w7.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class c6 implements Parcelable.Creator<b6> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j15 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
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
                    str3 = b.e(parcel2, readInt);
                    break;
                case 5:
                    str4 = b.e(parcel2, readInt);
                    break;
                case 6:
                    j10 = b.o(parcel2, readInt);
                    break;
                case 7:
                    j11 = b.o(parcel2, readInt);
                    break;
                case b4.f10106f:
                    str5 = b.e(parcel2, readInt);
                    break;
                case 9:
                    z10 = b.k(parcel2, readInt);
                    break;
                case 10:
                    z11 = b.k(parcel2, readInt);
                    break;
                case 11:
                    j15 = b.o(parcel2, readInt);
                    break;
                case 12:
                    str6 = b.e(parcel2, readInt);
                    break;
                case 13:
                    j12 = b.o(parcel2, readInt);
                    break;
                case 14:
                    j13 = b.o(parcel2, readInt);
                    break;
                case 15:
                    i10 = b.n(parcel2, readInt);
                    break;
                case 16:
                    z12 = b.k(parcel2, readInt);
                    break;
                case 18:
                    z13 = b.k(parcel2, readInt);
                    break;
                case 19:
                    str7 = b.e(parcel2, readInt);
                    break;
                case 21:
                    int p10 = b.p(parcel2, readInt);
                    if (p10 != 0) {
                        b.s(parcel2, readInt, p10, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j14 = b.o(parcel2, readInt);
                    break;
                case 23:
                    arrayList = b.g(parcel2, readInt);
                    break;
                case 24:
                    str8 = b.e(parcel2, readInt);
                    break;
                case 25:
                    str9 = b.e(parcel2, readInt);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new b6(str, str2, str3, str4, j10, j11, str5, z10, z11, j15, str6, j12, j13, i10, z12, z13, str7, bool, j14, (List<String>) arrayList, str8, str9);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new b6[i10];
    }
}
