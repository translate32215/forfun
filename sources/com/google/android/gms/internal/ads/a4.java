package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import c8.a;
import e8.fi0;
import e8.li0;
import e8.v5;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface a4 extends IInterface {
    void Q1(String str, String str2, fi0 fi0, a aVar, z3 z3Var, y2 y2Var) throws RemoteException;

    boolean V2(a aVar) throws RemoteException;

    void X2(String str, String str2, fi0 fi0, a aVar, p3 p3Var, y2 y2Var, li0 li0) throws RemoteException;

    void a1(String str, String str2, fi0 fi0, a aVar, t3 t3Var, y2 y2Var) throws RemoteException;

    hz getVideoController() throws RemoteException;

    void i2(a aVar, String str, Bundle bundle, Bundle bundle2, li0 li0, v5 v5Var) throws RemoteException;

    void j1(String str) throws RemoteException;

    h4 m0() throws RemoteException;

    boolean q5(a aVar) throws RemoteException;

    h4 r0() throws RemoteException;

    void v2(String str, String str2, fi0 fi0, a aVar, z3 z3Var, y2 y2Var) throws RemoteException;

    void y4(String str, String str2, fi0 fi0, a aVar, u3 u3Var, y2 y2Var) throws RemoteException;
}
