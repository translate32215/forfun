package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.fi0;
import e8.li0;
import e8.ob0;
import e8.v5;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class c4 extends ps implements a4 {
    public c4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final void Q1(String str, String str2, fi0 fi0, a aVar, z3 z3Var, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        ob0.c(z02, fi0);
        ob0.b(z02, aVar);
        ob0.b(z02, z3Var);
        ob0.b(z02, y2Var);
        Y(20, z02);
    }

    public final boolean V2(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Parcel m10 = m(17, z02);
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final void X2(String str, String str2, fi0 fi0, a aVar, p3 p3Var, y2 y2Var, li0 li0) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        ob0.c(z02, fi0);
        ob0.b(z02, aVar);
        ob0.b(z02, p3Var);
        ob0.b(z02, y2Var);
        ob0.c(z02, li0);
        Y(13, z02);
    }

    public final void a1(String str, String str2, fi0 fi0, a aVar, t3 t3Var, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        ob0.c(z02, fi0);
        ob0.b(z02, aVar);
        ob0.b(z02, t3Var);
        ob0.b(z02, y2Var);
        Y(14, z02);
    }

    public final hz getVideoController() throws RemoteException {
        Parcel m10 = m(5, z0());
        hz s62 = kz.s6(m10.readStrongBinder());
        m10.recycle();
        return s62;
    }

    public final void i2(a aVar, String str, Bundle bundle, Bundle bundle2, li0 li0, v5 v5Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeString(str);
        ob0.c(z02, bundle);
        ob0.c(z02, bundle2);
        ob0.c(z02, li0);
        ob0.b(z02, v5Var);
        Y(1, z02);
    }

    public final void j1(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(19, z02);
    }

    public final h4 m0() throws RemoteException {
        Parcel m10 = m(3, z0());
        h4 h4Var = (h4) ob0.a(m10, h4.CREATOR);
        m10.recycle();
        return h4Var;
    }

    public final boolean q5(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Parcel m10 = m(15, z02);
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final h4 r0() throws RemoteException {
        Parcel m10 = m(2, z0());
        h4 h4Var = (h4) ob0.a(m10, h4.CREATOR);
        m10.recycle();
        return h4Var;
    }

    public final void v2(String str, String str2, fi0 fi0, a aVar, z3 z3Var, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        ob0.c(z02, fi0);
        ob0.b(z02, aVar);
        ob0.b(z02, z3Var);
        ob0.b(z02, y2Var);
        Y(16, z02);
    }

    public final void y4(String str, String str2, fi0 fi0, a aVar, u3 u3Var, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        ob0.c(z02, fi0);
        ob0.b(z02, aVar);
        ob0.b(z02, u3Var);
        ob0.b(z02, y2Var);
        Y(18, z02);
    }
}
