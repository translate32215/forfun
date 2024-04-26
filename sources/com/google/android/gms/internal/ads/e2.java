package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.d4;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e2 extends ps implements c2 {
    public e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void V4(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(2, z02);
    }

    public final void W1(d4 d4Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, d4Var);
        Y(1, z02);
    }

    public final void z4(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(3, z02);
    }
}
