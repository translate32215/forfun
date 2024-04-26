package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import c8.a;
import e8.b4;
import e8.fi0;
import e8.li0;
import e8.n1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface x2 extends IInterface {
    void A2(a aVar, li0 li0, fi0 fi0, String str, y2 y2Var) throws RemoteException;

    void C1(a aVar, fi0 fi0, String str, String str2, y2 y2Var, n1 n1Var, List<String> list) throws RemoteException;

    void D() throws RemoteException;

    l0 I4() throws RemoteException;

    void J4(a aVar) throws RemoteException;

    void N(boolean z10) throws RemoteException;

    d3 N3() throws RemoteException;

    void S5(a aVar, li0 li0, fi0 fi0, String str, String str2, y2 y2Var) throws RemoteException;

    void U0(a aVar, fi0 fi0, String str, y5 y5Var, String str2) throws RemoteException;

    void W5(a aVar, v1 v1Var, List<b4> list) throws RemoteException;

    void a6(fi0 fi0, String str, String str2) throws RemoteException;

    void b5(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException;

    void c5(a aVar, fi0 fi0, String str, String str2, y2 y2Var) throws RemoteException;

    void d2(fi0 fi0, String str) throws RemoteException;

    void destroy() throws RemoteException;

    Bundle e2() throws RemoteException;

    void f2(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException;

    void g() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    hz getVideoController() throws RemoteException;

    void i4(a aVar, y5 y5Var, List<String> list) throws RemoteException;

    a i5() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    e3 l2() throws RemoteException;

    boolean l6() throws RemoteException;

    h4 m0() throws RemoteException;

    j3 m1() throws RemoteException;

    void m6(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException;

    h4 r0() throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void v3(a aVar) throws RemoteException;

    Bundle zzuw() throws RemoteException;
}
