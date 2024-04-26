package v7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    public final int f26564a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26565b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26566c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26567d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26568e;

    /* renamed from: f  reason: collision with root package name */
    public final String f26569f;

    /* renamed from: g  reason: collision with root package name */
    public final String f26570g;

    /* renamed from: h  reason: collision with root package name */
    public final int f26571h;

    /* renamed from: i  reason: collision with root package name */
    public final int f26572i;

    public e(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f26564a = i10;
        this.f26565b = i11;
        this.f26566c = i12;
        this.f26567d = j10;
        this.f26568e = j11;
        this.f26569f = str;
        this.f26570g = str2;
        this.f26571h = i13;
        this.f26572i = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f26564a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f26565b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        int i13 = this.f26566c;
        parcel.writeInt(262147);
        parcel.writeInt(i13);
        long j10 = this.f26567d;
        parcel.writeInt(524292);
        parcel.writeLong(j10);
        long j11 = this.f26568e;
        parcel.writeInt(524293);
        parcel.writeLong(j11);
        j.g(parcel, 6, this.f26569f, false);
        j.g(parcel, 7, this.f26570g, false);
        int i14 = this.f26571h;
        parcel.writeInt(262152);
        parcel.writeInt(i14);
        int i15 = this.f26572i;
        parcel.writeInt(262153);
        parcel.writeInt(i15);
        j.m(parcel, l10);
    }
}
