package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;
import java.util.ArrayList;
import java.util.List;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class l3 extends ps implements j3 {
    public l3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final void A(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(20, z02);
    }

    public final a E() throws RemoteException {
        return h0.a(m(14, z0()));
    }

    public final boolean G() throws RemoteException {
        Parcel m10 = m(17, z0());
        ClassLoader classLoader = ob0.f15778a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final void H(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(22, z02);
    }

    public final boolean I() throws RemoteException {
        Parcel m10 = m(18, z0());
        ClassLoader classLoader = ob0.f15778a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final Bundle K() throws RemoteException {
        Parcel m10 = m(16, z0());
        Bundle bundle = (Bundle) ob0.a(m10, Bundle.CREATOR);
        m10.recycle();
        return bundle;
    }

    public final float K3() throws RemoteException {
        Parcel m10 = m(24, z0());
        float readFloat = m10.readFloat();
        m10.recycle();
        return readFloat;
    }

    public final a L() throws RemoteException {
        return h0.a(m(13, z0()));
    }

    public final float V1() throws RemoteException {
        Parcel m10 = m(23, z0());
        float readFloat = m10.readFloat();
        m10.recycle();
        return readFloat;
    }

    public final String b() throws RemoteException {
        Parcel m10 = m(2, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final String c() throws RemoteException {
        Parcel m10 = m(4, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final float d3() throws RemoteException {
        Parcel m10 = m(25, z0());
        float readFloat = m10.readFloat();
        m10.recycle();
        return readFloat;
    }

    public final String getCallToAction() throws RemoteException {
        Parcel m10 = m(6, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final hz getVideoController() throws RemoteException {
        Parcel m10 = m(11, z0());
        hz s62 = kz.s6(m10.readStrongBinder());
        m10.recycle();
        return s62;
    }

    public final u h() throws RemoteException {
        Parcel m10 = m(12, z0());
        u s62 = w.s6(m10.readStrongBinder());
        m10.recycle();
        return s62;
    }

    public final List i() throws RemoteException {
        Parcel m10 = m(3, z0());
        ArrayList readArrayList = m10.readArrayList(ob0.f15778a);
        m10.recycle();
        return readArrayList;
    }

    public final double k() throws RemoteException {
        Parcel m10 = m(8, z0());
        double readDouble = m10.readDouble();
        m10.recycle();
        return readDouble;
    }

    public final a p() throws RemoteException {
        return h0.a(m(15, z0()));
    }

    public final String r() throws RemoteException {
        Parcel m10 = m(10, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final String t() throws RemoteException {
        Parcel m10 = m(7, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final String u() throws RemoteException {
        Parcel m10 = m(9, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final z w() throws RemoteException {
        Parcel m10 = m(5, z0());
        z s62 = t.s6(m10.readStrongBinder());
        m10.recycle();
        return s62;
    }

    public final void x() throws RemoteException {
        Y(19, z0());
    }

    public final void z(a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.b(z02, aVar2);
        ob0.b(z02, aVar3);
        Y(21, z02);
    }
}
