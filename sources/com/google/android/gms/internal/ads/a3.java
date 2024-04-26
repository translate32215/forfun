package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.l5;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a3 extends ps implements y2 {
    public a3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void B1(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(12, z02);
    }

    public final void C() throws RemoteException {
        Y(2, z0());
    }

    public final void E2() throws RemoteException {
        Y(13, z0());
    }

    public final void F() throws RemoteException {
        Y(5, z0());
    }

    public final void J() throws RemoteException {
        Y(4, z0());
    }

    public final void O() throws RemoteException {
        Y(8, z0());
    }

    public final void Q3(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(17, z02);
    }

    public final void S0(l5 l5Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, l5Var);
        Y(7, z02);
    }

    public final void U(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(23, z02);
    }

    public final void V(b6 b6Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, b6Var);
        Y(16, z02);
    }

    public final void V0() throws RemoteException {
        Y(18, z0());
    }

    public final void X5(zh0 zh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, zh0);
        Y(24, z02);
    }

    public final void a(String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        Y(9, z02);
    }

    public final void a0() throws RemoteException {
        Y(15, z0());
    }

    public final void b0(Bundle bundle) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, bundle);
        Y(19, z02);
    }

    public final void c0() throws RemoteException {
        Y(20, z0());
    }

    public final void g3(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(21, z02);
    }

    public final void h0(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(3, z02);
    }

    public final void l3(a6 a6Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, a6Var);
        Y(14, z02);
    }

    public final void n() throws RemoteException {
        Y(1, z0());
    }

    public final void t4(int i10, String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        z02.writeString(str);
        Y(22, z02);
    }

    public final void u0(l0 l0Var, String str) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, l0Var);
        z02.writeString(str);
        Y(10, z02);
    }

    public final void v() throws RemoteException {
        Y(6, z0());
    }

    public final void y0() throws RemoteException {
        Y(11, z0());
    }
}
