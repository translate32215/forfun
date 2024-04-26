package a7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f126a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f127b;

    public b(boolean z10, IBinder iBinder) {
        this.f126a = z10;
        this.f127b = iBinder;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        boolean z10 = this.f126a;
        parcel.writeInt(262145);
        parcel.writeInt(z10 ? 1 : 0);
        j.e(parcel, 2, this.f127b, false);
        j.m(parcel, l10);
    }
}
