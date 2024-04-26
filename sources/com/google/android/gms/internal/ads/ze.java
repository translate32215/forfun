package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.o10;
import e8.p10;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ze extends a {
    public static final Parcelable.Creator<ze> CREATOR = new o10();
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Context f8697a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8698b;

    /* renamed from: c  reason: collision with root package name */
    public final cf f8699c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8700d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8701e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8702f;

    /* renamed from: g  reason: collision with root package name */
    public final String f8703g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8704h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8705i;

    /* renamed from: r  reason: collision with root package name */
    public final int f8706r;

    public ze(@Nullable Context context, cf cfVar, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        cf.values();
        this.f8697a = context;
        this.f8698b = cfVar.ordinal();
        this.f8699c = cfVar;
        this.f8700d = i10;
        this.f8701e = i11;
        this.f8702f = i12;
        this.f8703g = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = ("lru".equals(str2) || !"lfu".equals(str2)) ? 2 : 3;
        }
        this.f8705i = i13;
        this.f8704h = i13 - 1;
        "onAdClosed".equals(str3);
        this.f8706r = 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f8698b;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f8700d;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        int i13 = this.f8701e;
        parcel.writeInt(262147);
        parcel.writeInt(i13);
        int i14 = this.f8702f;
        parcel.writeInt(262148);
        parcel.writeInt(i14);
        j.g(parcel, 5, this.f8703g, false);
        int i15 = this.f8704h;
        parcel.writeInt(262150);
        parcel.writeInt(i15);
        int i16 = this.f8706r;
        parcel.writeInt(262151);
        parcel.writeInt(i16);
        j.m(parcel, l10);
    }

    public ze(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        cf[] values = cf.values();
        int[] a10 = bf.a();
        this.f8697a = null;
        this.f8698b = i10;
        this.f8699c = values[i10];
        this.f8700d = i11;
        this.f8701e = i12;
        this.f8702f = i13;
        this.f8703g = str;
        this.f8704h = i14;
        this.f8705i = a10[i14];
        this.f8706r = i15;
        int i16 = ((int[]) p10.f15863a.clone())[i15];
    }
}
