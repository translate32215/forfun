package f7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public final String f18306a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18307b;

    public n(String str, int i10) {
        this.f18306a = str == null ? "" : str;
        this.f18307b = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f18306a, false);
        int i11 = this.f18307b;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        j.m(parcel, l10);
    }
}
