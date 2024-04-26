package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.internal.f;
import v7.s;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new s();

    /* renamed from: a  reason: collision with root package name */
    public final int f5877a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f5878b;

    /* renamed from: c  reason: collision with root package name */
    public final s7.a f5879c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5880d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5881e;

    public n(int i10, IBinder iBinder, s7.a aVar, boolean z10, boolean z11) {
        this.f5877a = i10;
        this.f5878b = iBinder;
        this.f5879c = aVar;
        this.f5880d = z10;
        this.f5881e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5879c.equals(nVar.f5879c) && h.a(i(), nVar.i());
    }

    public final f i() {
        IBinder iBinder = this.f5878b;
        if (iBinder == null) {
            return null;
        }
        return f.a.Y(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f5877a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.e(parcel, 2, this.f5878b, false);
        j.f(parcel, 3, this.f5879c, i10, false);
        boolean z10 = this.f5880d;
        parcel.writeInt(262148);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f5881e;
        parcel.writeInt(262149);
        parcel.writeInt(z11 ? 1 : 0);
        j.m(parcel, l10);
    }
}
