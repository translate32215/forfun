package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.fi0;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class xx extends ps implements ux {
    public xx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final void J2(fi0 fi0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, fi0);
        Y(1, z02);
    }
}
