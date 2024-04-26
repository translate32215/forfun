package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.internal.ads.ma;
import w7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class u30 extends a {
    public static final Parcelable.Creator<u30> CREATOR = new t30();

    /* renamed from: a  reason: collision with root package name */
    public final int f16844a;

    /* renamed from: b  reason: collision with root package name */
    public ma f16845b = null;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f16846c;

    public u30(int i10, byte[] bArr) {
        this.f16844a = i10;
        this.f16846c = bArr;
        i();
    }

    public final void i() {
        ma maVar = this.f16845b;
        if (maVar == null && this.f16846c != null) {
            return;
        }
        if (maVar != null && this.f16846c == null) {
            return;
        }
        if (maVar != null && this.f16846c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (maVar == null && this.f16846c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f16844a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        byte[] bArr = this.f16846c;
        if (bArr == null) {
            bArr = this.f16845b.f();
        }
        j.d(parcel, 2, bArr, false);
        j.m(parcel, l10);
    }
}
