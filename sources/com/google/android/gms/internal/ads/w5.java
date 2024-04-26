package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class w5 extends ps implements t5 {
    public w5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void F2(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(7, z02);
    }

    public final void N4(m5 m5Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, m5Var);
        Y(5, z02);
    }

    public final void S3() throws RemoteException {
        Y(6, z0());
    }

    public final void V3() throws RemoteException {
        Y(2, z0());
    }

    public final void d0() throws RemoteException {
        Y(3, z0());
    }

    public final void e5() throws RemoteException {
        Y(1, z0());
    }

    public final void g0() throws RemoteException {
        Y(8, z0());
    }

    public final void u3() throws RemoteException {
        Y(4, z0());
    }
}
