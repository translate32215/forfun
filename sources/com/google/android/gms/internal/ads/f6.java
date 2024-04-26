package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class f6 extends ps implements e6 {
    public f6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void P1() throws RemoteException {
        Y(2, z0());
    }

    public final void V(b6 b6Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, b6Var);
        Y(3, z02);
    }

    public final void W2() throws RemoteException {
        Y(1, z0());
    }

    public final void Y4(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(4, z02);
    }

    public final void k4(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(5, z02);
    }
}
