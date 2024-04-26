package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class fv extends ps implements ev {
    public fv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final void B0(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(3, z02);
    }

    public final void l0() throws RemoteException {
        Y(1, z0());
    }

    public final void p0() throws RemoteException {
        Y(2, z0());
    }
}
