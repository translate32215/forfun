package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class w1 extends ps implements v1 {
    public w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public final void M3(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(3, z02);
    }
}
