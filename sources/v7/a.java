package v7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a extends w7.a {
    public static final Parcelable.Creator<a> CREATOR = new a0();

    /* renamed from: a  reason: collision with root package name */
    public final g f26543a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26544b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f26545c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f26546d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26547e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f26548f;

    public a(g gVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f26543a = gVar;
        this.f26544b = z10;
        this.f26545c = z11;
        this.f26546d = iArr;
        this.f26547e = i10;
        this.f26548f = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.f(parcel, 1, this.f26543a, i10, false);
        boolean z10 = this.f26544b;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f26545c;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        int[] iArr = this.f26546d;
        if (iArr != null) {
            int l11 = j.l(parcel, 4);
            parcel.writeIntArray(iArr);
            j.m(parcel, l11);
        }
        int i11 = this.f26547e;
        parcel.writeInt(262149);
        parcel.writeInt(i11);
        int[] iArr2 = this.f26548f;
        if (iArr2 != null) {
            int l12 = j.l(parcel, 6);
            parcel.writeIntArray(iArr2);
            j.m(parcel, l12);
        }
        j.m(parcel, l10);
    }
}
