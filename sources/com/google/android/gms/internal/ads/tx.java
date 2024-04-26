package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class tx extends ps implements rx {
    public tx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void C() throws RemoteException {
        Y(1, z0());
    }

    public final void F() throws RemoteException {
        Y(5, z0());
    }

    public final void J() throws RemoteException {
        Y(3, z0());
    }

    public final void O() throws RemoteException {
        Y(7, z0());
    }

    public final void U(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(8, z02);
    }

    public final void h0(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(2, z02);
    }

    public final void n() throws RemoteException {
        Y(6, z0());
    }

    public final void v() throws RemoteException {
        Y(4, z0());
    }
}
