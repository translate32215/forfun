package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.Nullable;
import v7.e;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new v7.j();

    /* renamed from: a  reason: collision with root package name */
    public final int f5871a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<e> f5872b;

    public j(int i10, @Nullable List<e> list) {
        this.f5871a = i10;
        this.f5872b = list;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = androidx.activity.j.l(parcel, 20293);
        int i11 = this.f5871a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        androidx.activity.j.k(parcel, 2, this.f5872b, false);
        androidx.activity.j.m(parcel, l10);
    }
}
