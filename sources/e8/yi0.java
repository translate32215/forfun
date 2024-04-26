package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class yi0 extends a {
    public static final Parcelable.Creator<yi0> CREATOR = new aj0();

    /* renamed from: a  reason: collision with root package name */
    public final int f17633a;

    public yi0(int i10) {
        this.f17633a = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f17633a;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        j.m(parcel, l10);
    }
}
