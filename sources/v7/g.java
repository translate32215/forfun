package v7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    public final int f26577a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26578b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f26579c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26580d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26581e;

    public g(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f26577a = i10;
        this.f26578b = z10;
        this.f26579c = z11;
        this.f26580d = i11;
        this.f26581e = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f26577a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        boolean z10 = this.f26578b;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f26579c;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        int i12 = this.f26580d;
        parcel.writeInt(262148);
        parcel.writeInt(i12);
        int i13 = this.f26581e;
        parcel.writeInt(262149);
        parcel.writeInt(i13);
        j.m(parcel, l10);
    }
}
