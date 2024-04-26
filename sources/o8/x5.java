package o8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.startapp.b4;
import w7.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class x5 implements Parcelable.Creator<w5> {
    public static void a(w5 w5Var, Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = w5Var.f23561a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.g(parcel, 2, w5Var.f23562b, false);
        long j10 = w5Var.f23563c;
        parcel.writeInt(524291);
        parcel.writeLong(j10);
        Long l11 = w5Var.f23564d;
        if (l11 != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l11.longValue());
        }
        j.g(parcel, 6, w5Var.f23565e, false);
        j.g(parcel, 7, w5Var.f23566f, false);
        Double d10 = w5Var.f23567g;
        if (d10 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d10.doubleValue());
        }
        j.m(parcel, l10);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel2, readInt);
                    break;
                case 2:
                    str = b.e(parcel2, readInt);
                    break;
                case 3:
                    j10 = b.o(parcel2, readInt);
                    break;
                case 4:
                    int p10 = b.p(parcel2, readInt);
                    if (p10 != 0) {
                        b.s(parcel2, readInt, p10, 8);
                        l10 = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l10 = null;
                        break;
                    }
                case 5:
                    int p11 = b.p(parcel2, readInt);
                    if (p11 != 0) {
                        b.s(parcel2, readInt, p11, 4);
                        f10 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f10 = null;
                        break;
                    }
                case 6:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 7:
                    str3 = b.e(parcel2, readInt);
                    break;
                case b4.f10106f:
                    int p12 = b.p(parcel2, readInt);
                    if (p12 != 0) {
                        b.s(parcel2, readInt, p12, 8);
                        d10 = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d10 = null;
                        break;
                    }
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new w5(i10, str, j10, l10, f10, str2, str3, d10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new w5[i10];
    }
}
