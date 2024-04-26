package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class ez extends ps implements cz {
    public ez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void I1(fx fxVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, fxVar);
        Y(1, z02);
    }
}
