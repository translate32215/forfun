package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.activity.j;
import e8.jh0;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hv extends a {
    public static final Parcelable.Creator<hv> CREATOR = new jh0();
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public ParcelFileDescriptor f6902a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6903b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6904c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public final long f6905d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6906e;

    public hv() {
        this.f6902a = null;
        this.f6903b = false;
        this.f6904c = false;
        this.f6905d = 0;
        this.f6906e = false;
    }

    public final synchronized boolean i() {
        return this.f6902a != null;
    }

    public final synchronized InputStream j() {
        if (this.f6902a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f6902a);
        this.f6902a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean q() {
        return this.f6903b;
    }

    public final synchronized boolean s() {
        return this.f6904c;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor;
        int l10 = j.l(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f6902a;
        }
        j.f(parcel, 2, parcelFileDescriptor, i10, false);
        boolean q10 = q();
        parcel.writeInt(262147);
        parcel.writeInt(q10 ? 1 : 0);
        boolean s10 = s();
        parcel.writeInt(262148);
        parcel.writeInt(s10 ? 1 : 0);
        long x10 = x();
        parcel.writeInt(524293);
        parcel.writeLong(x10);
        boolean y10 = y();
        parcel.writeInt(262150);
        parcel.writeInt(y10 ? 1 : 0);
        j.m(parcel, l10);
    }

    public final synchronized long x() {
        return this.f6905d;
    }

    public final synchronized boolean y() {
        return this.f6906e;
    }

    public hv(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j10, boolean z12) {
        this.f6902a = parcelFileDescriptor;
        this.f6903b = z10;
        this.f6904c = z11;
        this.f6905d = j10;
        this.f6906e = z12;
    }
}
