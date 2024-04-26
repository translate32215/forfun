package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import k8.f0;
import k8.h0;
import o8.b6;
import o8.r;
import o8.w5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class b extends f0 implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void A5(Bundle bundle, b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, bundle);
        h0.b(Y, b6Var);
        E1(19, Y);
    }

    public final String D0(b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, b6Var);
        Parcel z02 = z0(11, Y);
        String readString = z02.readString();
        z02.recycle();
        return readString;
    }

    public final void D3(b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, b6Var);
        E1(20, Y);
    }

    public final List<o8.b> E3(String str, String str2, String str3) throws RemoteException {
        Parcel Y = Y();
        Y.writeString((String) null);
        Y.writeString(str2);
        Y.writeString(str3);
        Parcel z02 = z0(17, Y);
        ArrayList<o8.b> createTypedArrayList = z02.createTypedArrayList(o8.b.CREATOR);
        z02.recycle();
        return createTypedArrayList;
    }

    public final void H3(w5 w5Var, b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, w5Var);
        h0.b(Y, b6Var);
        E1(2, Y);
    }

    public final void N0(o8.b bVar, b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, bVar);
        h0.b(Y, b6Var);
        E1(12, Y);
    }

    public final List<w5> R0(String str, String str2, boolean z10, b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        ClassLoader classLoader = h0.f20231a;
        Y.writeInt(z10 ? 1 : 0);
        h0.b(Y, b6Var);
        Parcel z02 = z0(14, Y);
        ArrayList<w5> createTypedArrayList = z02.createTypedArrayList(w5.CREATOR);
        z02.recycle();
        return createTypedArrayList;
    }

    public final List<w5> S1(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel Y = Y();
        Y.writeString((String) null);
        Y.writeString(str2);
        Y.writeString(str3);
        ClassLoader classLoader = h0.f20231a;
        Y.writeInt(z10 ? 1 : 0);
        Parcel z02 = z0(15, Y);
        ArrayList<w5> createTypedArrayList = z02.createTypedArrayList(w5.CREATOR);
        z02.recycle();
        return createTypedArrayList;
    }

    public final void T2(r rVar, b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, rVar);
        h0.b(Y, b6Var);
        E1(1, Y);
    }

    public final void T3(b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, b6Var);
        E1(6, Y);
    }

    public final void Y0(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel Y = Y();
        Y.writeLong(j10);
        Y.writeString(str);
        Y.writeString(str2);
        Y.writeString(str3);
        E1(10, Y);
    }

    public final void e4(b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, b6Var);
        E1(4, Y);
    }

    public final byte[] h5(r rVar, String str) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, rVar);
        Y.writeString(str);
        Parcel z02 = z0(9, Y);
        byte[] createByteArray = z02.createByteArray();
        z02.recycle();
        return createByteArray;
    }

    public final List<o8.b> k5(String str, String str2, b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        h0.b(Y, b6Var);
        Parcel z02 = z0(16, Y);
        ArrayList<o8.b> createTypedArrayList = z02.createTypedArrayList(o8.b.CREATOR);
        z02.recycle();
        return createTypedArrayList;
    }

    public final void w1(b6 b6Var) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, b6Var);
        E1(18, Y);
    }
}
