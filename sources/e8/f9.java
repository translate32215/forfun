package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class f9 extends a {
    public static final Parcelable.Creator<f9> CREATOR = new e9();

    /* renamed from: a  reason: collision with root package name */
    public String f14544a;

    /* renamed from: b  reason: collision with root package name */
    public int f14545b;

    /* renamed from: c  reason: collision with root package name */
    public int f14546c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14547d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14548e;

    public f9(int i10, int i11, boolean z10) {
        this(i10, i11, z10, false, false);
    }

    public static f9 i() {
        return new f9(12451000, 12451000, true);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f14544a, false);
        int i11 = this.f14545b;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        int i12 = this.f14546c;
        parcel.writeInt(262148);
        parcel.writeInt(i12);
        boolean z10 = this.f14547d;
        parcel.writeInt(262149);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14548e;
        parcel.writeInt(262150);
        parcel.writeInt(z11 ? 1 : 0);
        j.m(parcel, l10);
    }

    public f9(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        String str = z10 ? "0" : "1";
        StringBuilder sb2 = new StringBuilder(str.length() + 36);
        sb2.append("afma-sdk-a-v");
        sb2.append(i10);
        sb2.append(".");
        sb2.append(i11);
        this.f14544a = e.a(sb2, ".", str);
        this.f14545b = i10;
        this.f14546c = i11;
        this.f14547d = z10;
        this.f14548e = false;
    }

    public f9(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f14544a = str;
        this.f14545b = i10;
        this.f14546c = i11;
        this.f14547d = z10;
        this.f14548e = z11;
    }
}
