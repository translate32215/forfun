package o8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class s implements Parcelable.Creator<r> {
    public static void a(r rVar, Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, rVar.f23414a, false);
        j.f(parcel, 3, rVar.f23415b, i10, false);
        j.g(parcel, 4, rVar.f23416c, false);
        long j10 = rVar.f23417d;
        parcel.writeInt(524293);
        parcel.writeLong(j10);
        j.m(parcel, l10);
    }

    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        p pVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                pVar = (p) b.d(parcel, readInt, p.CREATOR);
            } else if (c10 == 4) {
                str2 = b.e(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                j10 = b.o(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new r(str, pVar, str2, j10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
