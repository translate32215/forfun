package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import java.util.ArrayList;
import java.util.List;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c8 extends a {
    public static final Parcelable.Creator<c8> CREATOR = new f8();

    /* renamed from: a  reason: collision with root package name */
    public final String f14089a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14090b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14091c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14092d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f14093e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14094f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14095g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f14096h;

    public c8(String str, String str2, boolean z10, boolean z11, List<String> list, boolean z12, boolean z13, List<String> list2) {
        this.f14089a = str;
        this.f14090b = str2;
        this.f14091c = z10;
        this.f14092d = z11;
        this.f14093e = list;
        this.f14094f = z12;
        this.f14095g = z13;
        this.f14096h = list2 == null ? new ArrayList<>() : list2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f14089a, false);
        j.g(parcel, 3, this.f14090b, false);
        boolean z10 = this.f14091c;
        parcel.writeInt(262148);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14092d;
        parcel.writeInt(262149);
        parcel.writeInt(z11 ? 1 : 0);
        j.i(parcel, 6, this.f14093e, false);
        boolean z12 = this.f14094f;
        parcel.writeInt(262151);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.f14095g;
        parcel.writeInt(262152);
        parcel.writeInt(z13 ? 1 : 0);
        j.i(parcel, 9, this.f14096h, false);
        j.m(parcel, l10);
    }
}
