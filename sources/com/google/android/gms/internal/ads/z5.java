package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class z5 extends ps implements y5 {
    public z5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void E0(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(4, z02);
    }

    public final void F5(a aVar, a6 a6Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, a6Var);
        Y(7, z02);
    }

    public final void K1(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(11, z02);
    }

    public final void M4(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(8, z02);
    }

    public final void O3(a aVar, int i10) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeInt(i10);
        Y(2, z02);
    }

    public final void U3(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(1, z02);
    }

    public final void b0(Bundle bundle) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, bundle);
        Y(12, z02);
    }

    public final void d5(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(3, z02);
    }

    public final void f6(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(10, z02);
    }

    public final void g2(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(5, z02);
    }

    public final void j5(a aVar, int i10) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeInt(i10);
        Y(9, z02);
    }

    public final void z3(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(6, z02);
    }
}
