package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import e8.ob0;
import f7.n;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j5 extends ps implements i5 {
    public j5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void d6(n nVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, nVar);
        Y(2, z02);
    }

    public final void f1(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, parcelFileDescriptor);
        Y(1, z02);
    }
}
