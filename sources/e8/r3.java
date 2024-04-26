package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r3 extends a {
    public static final Parcelable.Creator<r3> CREATOR = new u3();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16227a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16228b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16229c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f16230d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f16231e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f16232f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16233g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16234h;

    public r3(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.f16227a = z10;
        this.f16228b = str;
        this.f16229c = i10;
        this.f16230d = bArr;
        this.f16231e = strArr;
        this.f16232f = strArr2;
        this.f16233g = z11;
        this.f16234h = j10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        boolean z10 = this.f16227a;
        parcel.writeInt(262145);
        parcel.writeInt(z10 ? 1 : 0);
        j.g(parcel, 2, this.f16228b, false);
        int i11 = this.f16229c;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        j.d(parcel, 4, this.f16230d, false);
        j.h(parcel, 5, this.f16231e, false);
        j.h(parcel, 6, this.f16232f, false);
        boolean z11 = this.f16233g;
        parcel.writeInt(262151);
        parcel.writeInt(z11 ? 1 : 0);
        long j10 = this.f16234h;
        parcel.writeInt(524296);
        parcel.writeLong(j10);
        j.m(parcel, l10);
    }
}
