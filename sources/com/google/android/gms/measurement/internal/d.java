package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
import o8.b;
import o8.b6;
import o8.r;
import o8.w5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public interface d extends IInterface {
    void A5(Bundle bundle, b6 b6Var) throws RemoteException;

    String D0(b6 b6Var) throws RemoteException;

    void D3(b6 b6Var) throws RemoteException;

    List<b> E3(String str, String str2, String str3) throws RemoteException;

    void H3(w5 w5Var, b6 b6Var) throws RemoteException;

    void N0(b bVar, b6 b6Var) throws RemoteException;

    List<w5> R0(String str, String str2, boolean z10, b6 b6Var) throws RemoteException;

    List<w5> S1(String str, String str2, String str3, boolean z10) throws RemoteException;

    void T2(r rVar, b6 b6Var) throws RemoteException;

    void T3(b6 b6Var) throws RemoteException;

    void Y0(long j10, String str, String str2, String str3) throws RemoteException;

    void e4(b6 b6Var) throws RemoteException;

    byte[] h5(r rVar, String str) throws RemoteException;

    List<b> k5(String str, String str2, b6 b6Var) throws RemoteException;

    void w1(b6 b6Var) throws RemoteException;
}
