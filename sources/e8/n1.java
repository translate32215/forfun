package e8;

import a7.e;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;
import y6.m;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class n1 extends a {
    public static final Parcelable.Creator<n1> CREATOR = new q1();

    /* renamed from: a  reason: collision with root package name */
    public final int f15571a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15572b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15573c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15574d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15575e;

    /* renamed from: f  reason: collision with root package name */
    public final h f15576f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15577g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15578h;

    public n1(e eVar) {
        boolean z10 = eVar.f134a;
        int i10 = eVar.f135b;
        boolean z11 = eVar.f136c;
        int i11 = eVar.f137d;
        m mVar = eVar.f138e;
        h hVar = mVar != null ? new h(mVar) : null;
        this.f15571a = 4;
        this.f15572b = z10;
        this.f15573c = i10;
        this.f15574d = z11;
        this.f15575e = i11;
        this.f15576f = hVar;
        this.f15577g = false;
        this.f15578h = 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f15571a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        boolean z10 = this.f15572b;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        int i12 = this.f15573c;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        boolean z11 = this.f15574d;
        parcel.writeInt(262148);
        parcel.writeInt(z11 ? 1 : 0);
        int i13 = this.f15575e;
        parcel.writeInt(262149);
        parcel.writeInt(i13);
        j.f(parcel, 6, this.f15576f, i10, false);
        boolean z12 = this.f15577g;
        parcel.writeInt(262151);
        parcel.writeInt(z12 ? 1 : 0);
        int i14 = this.f15578h;
        parcel.writeInt(262152);
        parcel.writeInt(i14);
        j.m(parcel, l10);
    }

    public n1(int i10, boolean z10, int i11, boolean z11, int i12, h hVar, boolean z12, int i13) {
        this.f15571a = i10;
        this.f15572b = z10;
        this.f15573c = i11;
        this.f15574d = z11;
        this.f15575e = i12;
        this.f15576f = hVar;
        this.f15577g = z12;
        this.f15578h = i13;
    }
}
