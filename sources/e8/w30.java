package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.internal.ads.js;
import w7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class w30 extends a {
    public static final Parcelable.Creator<w30> CREATOR = new v30();

    /* renamed from: a  reason: collision with root package name */
    public final int f17210a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17211b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17212c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17213d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17214e;

    public w30(int i10, int i11, int i12, String str, String str2) {
        this.f17210a = i10;
        this.f17211b = i11;
        this.f17212c = str;
        this.f17213d = str2;
        this.f17214e = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f17210a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f17211b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        j.g(parcel, 3, this.f17212c, false);
        j.g(parcel, 4, this.f17213d, false);
        int i13 = this.f17214e;
        parcel.writeInt(262149);
        parcel.writeInt(i13);
        j.m(parcel, l10);
    }

    public w30(int i10, js jsVar, String str, String str2) {
        int i11 = jsVar.f7173a;
        this.f17210a = 1;
        this.f17211b = i10;
        this.f17212c = str;
        this.f17213d = str2;
        this.f17214e = i11;
    }
}
