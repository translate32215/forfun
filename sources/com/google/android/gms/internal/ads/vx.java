package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class vx extends ps implements sx {
    public vx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    public final void j0(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(2, z02);
    }

    public final void v() throws RemoteException {
        Y(1, z0());
    }
}
