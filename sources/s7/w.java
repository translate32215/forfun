package s7;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import c8.a;
import c8.b;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: a  reason: collision with root package name */
    public final String f25029a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f25030b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25031c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f25032d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f25033e;

    public w(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f25029a = str;
        this.f25030b = z10;
        this.f25031c = z11;
        this.f25032d = (Context) b.z0(a.C0062a.Y(iBinder));
        this.f25033e = z12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f25029a, false);
        boolean z10 = this.f25030b;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f25031c;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        j.e(parcel, 4, new b(this.f25032d), false);
        boolean z12 = this.f25033e;
        parcel.writeInt(262149);
        parcel.writeInt(z12 ? 1 : 0);
        j.m(parcel, l10);
    }
}
