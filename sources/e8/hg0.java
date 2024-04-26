package e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hg0 implements Parcelable {
    public static final Parcelable.Creator<hg0> CREATOR = new gg0();

    /* renamed from: a  reason: collision with root package name */
    public final int f14910a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14911b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14912c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14913d;

    /* renamed from: e  reason: collision with root package name */
    public int f14914e;

    public hg0(int i10, int i11, int i12, byte[] bArr) {
        this.f14910a = i10;
        this.f14911b = i11;
        this.f14912c = i12;
        this.f14913d = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hg0.class == obj.getClass()) {
            hg0 hg0 = (hg0) obj;
            return this.f14910a == hg0.f14910a && this.f14911b == hg0.f14911b && this.f14912c == hg0.f14912c && Arrays.equals(this.f14913d, hg0.f14913d);
        }
    }

    public final int hashCode() {
        if (this.f14914e == 0) {
            this.f14914e = Arrays.hashCode(this.f14913d) + ((((((this.f14910a + 527) * 31) + this.f14911b) * 31) + this.f14912c) * 31);
        }
        return this.f14914e;
    }

    public final String toString() {
        int i10 = this.f14910a;
        int i11 = this.f14911b;
        int i12 = this.f14912c;
        boolean z10 = this.f14913d != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14910a);
        parcel.writeInt(this.f14911b);
        parcel.writeInt(this.f14912c);
        parcel.writeInt(this.f14913d != null ? 1 : 0);
        byte[] bArr = this.f14913d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public hg0(Parcel parcel) {
        this.f14910a = parcel.readInt();
        this.f14911b = parcel.readInt();
        this.f14912c = parcel.readInt();
        this.f14913d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
