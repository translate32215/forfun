package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f14072a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14073b;

    public c(int i10, int i11) {
        this.f14072a = i10;
        this.f14073b = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f14072a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f14073b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        j.m(parcel, l10);
    }
}
