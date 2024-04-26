package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class d1 extends ps implements b1 {
    public d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void P3(dy dyVar, a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, dyVar);
        ob0.b(z02, aVar);
        Y(1, z02);
    }
}
