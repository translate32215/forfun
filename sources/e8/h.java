package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;
import y6.m;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14836a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14837b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14838c;

    public h(boolean z10, boolean z11, boolean z12) {
        this.f14836a = z10;
        this.f14837b = z11;
        this.f14838c = z12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        boolean z10 = this.f14836a;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14837b;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f14838c;
        parcel.writeInt(262148);
        parcel.writeInt(z12 ? 1 : 0);
        j.m(parcel, l10);
    }

    public h(m mVar) {
        this(mVar.f28129a, mVar.f28130b, mVar.f28131c);
    }
}
