package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class b0 extends ps implements z {
    public b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final Uri M() throws RemoteException {
        Parcel m10 = m(2, z0());
        Uri uri = (Uri) ob0.a(m10, Uri.CREATOR);
        m10.recycle();
        return uri;
    }

    public final double O0() throws RemoteException {
        Parcel m10 = m(3, z0());
        double readDouble = m10.readDouble();
        m10.recycle();
        return readDouble;
    }

    public final int getHeight() throws RemoteException {
        Parcel m10 = m(5, z0());
        int readInt = m10.readInt();
        m10.recycle();
        return readInt;
    }

    public final int getWidth() throws RemoteException {
        Parcel m10 = m(4, z0());
        int readInt = m10.readInt();
        m10.recycle();
        return readInt;
    }

    public final a y3() throws RemoteException {
        return h0.a(m(1, z0()));
    }
}
