package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class r30 extends a {
    public static final Parcelable.Creator<r30> CREATOR = new q30();

    /* renamed from: a  reason: collision with root package name */
    public final int f16235a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16236b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16237c;

    public r30(int i10, String str, String str2) {
        this.f16235a = i10;
        this.f16236b = str;
        this.f16237c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f16235a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.g(parcel, 2, this.f16236b, false);
        j.g(parcel, 3, this.f16237c, false);
        j.m(parcel, l10);
    }

    public r30(String str, String str2) {
        this.f16235a = 1;
        this.f16236b = str;
        this.f16237c = str2;
    }
}
