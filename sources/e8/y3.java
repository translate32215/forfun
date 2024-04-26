package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class y3 extends a {
    public static final Parcelable.Creator<y3> CREATOR = new a4();

    /* renamed from: a  reason: collision with root package name */
    public final String f17569a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17570b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17571c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17572d;

    public y3(String str, boolean z10, int i10, String str2) {
        this.f17569a = str;
        this.f17570b = z10;
        this.f17571c = i10;
        this.f17572d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f17569a, false);
        boolean z10 = this.f17570b;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f17571c;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        j.g(parcel, 4, this.f17572d, false);
        j.m(parcel, l10);
    }
}
