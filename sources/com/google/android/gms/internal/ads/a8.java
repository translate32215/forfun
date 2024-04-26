package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a8 extends ps implements z7 {
    public a8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    public final void u1(a aVar, y7 y7Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.b(z02, y7Var);
        Y(2, z02);
    }
}
