package d7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13172a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13173b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13174c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13175d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13176e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13177f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13178g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13179h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13180i;

    public g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(z10, z11, (String) null, false, 0.0f, -1, z12, z13, z14);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        boolean z10 = this.f13172a;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f13173b;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        j.g(parcel, 4, this.f13174c, false);
        boolean z12 = this.f13175d;
        parcel.writeInt(262149);
        parcel.writeInt(z12 ? 1 : 0);
        float f10 = this.f13176e;
        parcel.writeInt(262150);
        parcel.writeFloat(f10);
        int i11 = this.f13177f;
        parcel.writeInt(262151);
        parcel.writeInt(i11);
        boolean z13 = this.f13178g;
        parcel.writeInt(262152);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.f13179h;
        parcel.writeInt(262153);
        parcel.writeInt(z14 ? 1 : 0);
        boolean z15 = this.f13180i;
        parcel.writeInt(262154);
        parcel.writeInt(z15 ? 1 : 0);
        j.m(parcel, l10);
    }

    public g(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f13172a = z10;
        this.f13173b = z11;
        this.f13174c = str;
        this.f13175d = z12;
        this.f13176e = f10;
        this.f13177f = i10;
        this.f13178g = z13;
        this.f13179h = z14;
        this.f13180i = z15;
    }
}
