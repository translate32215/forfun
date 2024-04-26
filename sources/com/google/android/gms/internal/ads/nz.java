package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class nz extends ps implements mz {
    public nz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void X0(boolean z10) throws RemoteException {
        Parcel z02 = z0();
        ClassLoader classLoader = ob0.f15778a;
        z02.writeInt(z10 ? 1 : 0);
        Y(5, z02);
    }

    public final void a0() throws RemoteException {
        Y(3, z0());
    }

    public final void a2() throws RemoteException {
        Y(1, z0());
    }

    public final void c0() throws RemoteException {
        Y(2, z0());
    }

    public final void y0() throws RemoteException {
        Y(4, z0());
    }
}
