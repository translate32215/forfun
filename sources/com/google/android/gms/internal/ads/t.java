package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import c8.b;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class t extends os implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f8168a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f8169b;

    /* renamed from: c  reason: collision with root package name */
    public final double f8170c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8171d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8172e;

    public t(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f8168a = drawable;
        this.f8169b = uri;
        this.f8170c = d10;
        this.f8171d = i10;
        this.f8172e = i11;
    }

    public static z s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof z) {
            return (z) queryLocalInterface;
        }
        return new b0(iBinder);
    }

    public final Uri M() throws RemoteException {
        return this.f8169b;
    }

    public final double O0() {
        return this.f8170c;
    }

    public final int getHeight() {
        return this.f8172e;
    }

    public final int getWidth() {
        return this.f8171d;
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            a y32 = y3();
            parcel2.writeNoException();
            ob0.b(parcel2, y32);
            return true;
        } else if (i10 == 2) {
            Uri uri = this.f8169b;
            parcel2.writeNoException();
            ob0.d(parcel2, uri);
            return true;
        } else if (i10 == 3) {
            double d10 = this.f8170c;
            parcel2.writeNoException();
            parcel2.writeDouble(d10);
            return true;
        } else if (i10 == 4) {
            int i12 = this.f8171d;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        } else if (i10 != 5) {
            return false;
        } else {
            int i13 = this.f8172e;
            parcel2.writeNoException();
            parcel2.writeInt(i13);
            return true;
        }
    }

    public final a y3() throws RemoteException {
        return new b(this.f8168a);
    }
}
