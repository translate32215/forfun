package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.e4;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class z1 extends a {
    public static final Parcelable.Creator<z1> CREATOR = new e4();

    /* renamed from: a  reason: collision with root package name */
    public final int f8665a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8666b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8667c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8668d;

    public z1(int i10, int i11, String str, int i12) {
        this.f8665a = i10;
        this.f8666b = i11;
        this.f8667c = str;
        this.f8668d = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f8666b;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.g(parcel, 2, this.f8667c, false);
        int i12 = this.f8668d;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        int i13 = this.f8665a;
        parcel.writeInt(263144);
        parcel.writeInt(i13);
        j.m(parcel, l10);
    }
}
