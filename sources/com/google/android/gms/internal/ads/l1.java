package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class l1 extends ps implements j1 {
    public l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final void P2(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(1, z02);
    }

    public final void c6() throws RemoteException {
        Y(2, z0());
    }
}
