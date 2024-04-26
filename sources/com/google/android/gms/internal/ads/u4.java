package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class u4 extends ps implements v4 {
    public u4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public final IBinder z2(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Parcel m10 = m(1, z02);
        IBinder readStrongBinder = m10.readStrongBinder();
        m10.recycle();
        return readStrongBinder;
    }
}
