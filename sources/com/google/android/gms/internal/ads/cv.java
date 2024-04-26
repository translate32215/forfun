package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class cv extends ps implements av {
    public cv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void U4(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(3, z02);
    }

    public final void Y1(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(2, z02);
    }

    public final void n1(yu yuVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, yuVar);
        Y(1, z02);
    }
}
