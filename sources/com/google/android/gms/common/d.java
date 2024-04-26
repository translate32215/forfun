package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import androidx.appcompat.widget.p;
import javax.annotation.Nullable;
import s7.y;
import u.b;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5808a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f5809b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5810c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5811d;

    public d(boolean z10, String str, int i10, int i11) {
        this.f5808a = z10;
        this.f5809b = str;
        this.f5810c = b.f(i10) - 1;
        this.f5811d = p.n(i11) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        boolean z10 = this.f5808a;
        parcel.writeInt(262145);
        parcel.writeInt(z10 ? 1 : 0);
        j.g(parcel, 2, this.f5809b, false);
        int i11 = this.f5810c;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        int i12 = this.f5811d;
        parcel.writeInt(262148);
        parcel.writeInt(i12);
        j.m(parcel, l10);
    }
}
