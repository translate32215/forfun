package e8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class zh0 extends a {
    public static final Parcelable.Creator<zh0> CREATOR = new ci0();

    /* renamed from: a  reason: collision with root package name */
    public final int f17753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17754b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17755c;

    /* renamed from: d  reason: collision with root package name */
    public zh0 f17756d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f17757e;

    public zh0(int i10, String str, String str2, zh0 zh0, IBinder iBinder) {
        this.f17753a = i10;
        this.f17754b = str;
        this.f17755c = str2;
        this.f17756d = zh0;
        this.f17757e = iBinder;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f17753a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.g(parcel, 2, this.f17754b, false);
        j.g(parcel, 3, this.f17755c, false);
        j.f(parcel, 4, this.f17756d, i10, false);
        j.e(parcel, 5, this.f17757e, false);
        j.m(parcel, l10);
    }
}
