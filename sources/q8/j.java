package q8;

import android.os.Parcel;
import android.os.Parcelable;
import v7.q;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    public final int f24224a;

    /* renamed from: b  reason: collision with root package name */
    public final q f24225b;

    public j(int i10, q qVar) {
        this.f24224a = i10;
        this.f24225b = qVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = androidx.activity.j.l(parcel, 20293);
        int i11 = this.f24224a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        androidx.activity.j.f(parcel, 2, this.f24225b, i10, false);
        androidx.activity.j.m(parcel, l10);
    }
}
