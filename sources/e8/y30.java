package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import java.util.Arrays;
import w7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class y30 extends a {
    public static final Parcelable.Creator<y30> CREATOR = new x30();

    /* renamed from: a  reason: collision with root package name */
    public final int f17573a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f17574b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17575c;

    public y30(int i10, byte[] bArr, int i11) {
        byte[] bArr2;
        this.f17573a = i10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = Arrays.copyOf(bArr, bArr.length);
        }
        this.f17574b = bArr2;
        this.f17575c = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f17573a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.d(parcel, 2, this.f17574b, false);
        int i12 = this.f17575c;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        j.m(parcel, l10);
    }

    public y30() {
        this(1, (byte[]) null, 1);
    }
}
