package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h5 extends ps implements g5 {
    public h5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void F3(l5 l5Var, i5 i5Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, l5Var);
        ob0.b(z02, i5Var);
        Y(6, z02);
    }

    public final void L0(String str, i5 i5Var) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        ob0.b(z02, i5Var);
        Y(7, z02);
    }

    public final void c2(l5 l5Var, i5 i5Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, l5Var);
        ob0.b(z02, i5Var);
        Y(5, z02);
    }

    public final void k6(l5 l5Var, i5 i5Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, l5Var);
        ob0.b(z02, i5Var);
        Y(4, z02);
    }
}
