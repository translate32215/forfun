package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class o30 extends a {
    public static final Parcelable.Creator<o30> CREATOR = new p30();

    /* renamed from: a  reason: collision with root package name */
    public final int f15739a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f15740b;

    public o30(int i10, byte[] bArr) {
        this.f15739a = i10;
        this.f15740b = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f15739a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.d(parcel, 2, this.f15740b, false);
        j.m(parcel, l10);
    }

    public o30(byte[] bArr) {
        this.f15739a = 1;
        this.f15740b = bArr;
    }
}
