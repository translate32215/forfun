package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.mi0;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class fx extends a {
    public static final Parcelable.Creator<fx> CREATOR = new mi0();

    /* renamed from: a  reason: collision with root package name */
    public final int f6504a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6505b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6506c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6507d;

    public fx(int i10, int i11, String str, long j10) {
        this.f6504a = i10;
        this.f6505b = i11;
        this.f6506c = str;
        this.f6507d = j10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f6504a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f6505b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        j.g(parcel, 3, this.f6506c, false);
        long j10 = this.f6507d;
        parcel.writeInt(524292);
        parcel.writeLong(j10);
        j.m(parcel, l10);
    }
}
