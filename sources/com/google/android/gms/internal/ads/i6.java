package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class i6 extends ps implements g6 {
    public i6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final void J5(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(3, z02);
    }

    public final void M1() throws RemoteException {
        Y(1, z0());
    }

    public final void x2(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(2, z02);
    }
}
