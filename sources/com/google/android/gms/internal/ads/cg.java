package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.o30;
import e8.ob0;
import e8.r30;
import e8.u30;
import e8.w30;
import e8.y30;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class cg extends ps implements dg {
    public cg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final y30 G4(w30 w30) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, w30);
        Parcel m10 = m(3, z02);
        y30 y30 = (y30) ob0.a(m10, y30.CREATOR);
        m10.recycle();
        return y30;
    }

    public final u30 L1(r30 r30) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, r30);
        Parcel m10 = m(1, z02);
        u30 u30 = (u30) ob0.a(m10, u30.CREATOR);
        m10.recycle();
        return u30;
    }

    public final void Z4(o30 o30) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, o30);
        Y(2, z02);
    }
}
