package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class d2 extends ps implements b2 {
    public d2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    public final void W3() throws RemoteException {
        Y(1, z0());
    }

    public final void m2(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(2, z02);
    }
}
