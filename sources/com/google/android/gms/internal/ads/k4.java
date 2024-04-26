package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class k4 extends ps implements j4 {
    public k4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void E5(a aVar, String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeString(str);
        z02.writeString(str2);
        Y(2, z02);
    }

    public final void h4(Intent intent) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, intent);
        Y(1, z02);
    }

    public final void s4() throws RemoteException {
        Y(3, z0());
    }
}
