package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.b4;
import e8.fi0;
import e8.li0;
import e8.n1;
import e8.ob0;
import java.util.List;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class z2 extends ps implements x2 {
    public z2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void A2(a aVar, li0 li0, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, li0);
        ob0.c(z02, fi0);
        z02.writeString(str);
        ob0.b(z02, y2Var);
        Y(1, z02);
    }

    public final void C1(a aVar, fi0 fi0, String str, String str2, y2 y2Var, n1 n1Var, List<String> list) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, fi0);
        z02.writeString(str);
        z02.writeString(str2);
        ob0.b(z02, y2Var);
        ob0.c(z02, n1Var);
        z02.writeStringList(list);
        Y(14, z02);
    }

    public final void D() throws RemoteException {
        Y(9, z0());
    }

    public final void J4(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(21, z02);
    }

    public final void N(boolean z10) throws RemoteException {
        Parcel z02 = z0();
        ClassLoader classLoader = ob0.f15778a;
        z02.writeInt(z10 ? 1 : 0);
        Y(25, z02);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.d3 N3() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 15
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.d3
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.d3 r1 = (com.google.android.gms.internal.ads.d3) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.f3 r2 = new com.google.android.gms.internal.ads.f3
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z2.N3():com.google.android.gms.internal.ads.d3");
    }

    public final void S5(a aVar, li0 li0, fi0 fi0, String str, String str2, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, li0);
        ob0.c(z02, fi0);
        z02.writeString(str);
        z02.writeString(str2);
        ob0.b(z02, y2Var);
        Y(6, z02);
    }

    public final void U0(a aVar, fi0 fi0, String str, y5 y5Var, String str2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, fi0);
        z02.writeString((String) null);
        ob0.b(z02, y5Var);
        z02.writeString(str2);
        Y(10, z02);
    }

    public final void W5(a aVar, v1 v1Var, List<b4> list) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.b(z02, v1Var);
        z02.writeTypedList(list);
        Y(31, z02);
    }

    public final void b5(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, fi0);
        z02.writeString(str);
        ob0.b(z02, y2Var);
        Y(32, z02);
    }

    public final void c5(a aVar, fi0 fi0, String str, String str2, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, fi0);
        z02.writeString(str);
        z02.writeString(str2);
        ob0.b(z02, y2Var);
        Y(7, z02);
    }

    public final void d2(fi0 fi0, String str) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, fi0);
        z02.writeString(str);
        Y(11, z02);
    }

    public final void destroy() throws RemoteException {
        Y(5, z0());
    }

    public final void f2(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, fi0);
        z02.writeString(str);
        ob0.b(z02, y2Var);
        Y(3, z02);
    }

    public final void g() throws RemoteException {
        Y(8, z0());
    }

    public final hz getVideoController() throws RemoteException {
        Parcel m10 = m(26, z0());
        hz s62 = kz.s6(m10.readStrongBinder());
        m10.recycle();
        return s62;
    }

    public final void i4(a aVar, y5 y5Var, List<String> list) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.b(z02, y5Var);
        z02.writeStringList(list);
        Y(23, z02);
    }

    public final a i5() throws RemoteException {
        return h0.a(m(2, z0()));
    }

    public final boolean isInitialized() throws RemoteException {
        Parcel m10 = m(13, z0());
        ClassLoader classLoader = ob0.f15778a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.e3 l2() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 16
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.e3
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.e3 r1 = (com.google.android.gms.internal.ads.e3) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.g3 r2 = new com.google.android.gms.internal.ads.g3
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z2.l2():com.google.android.gms.internal.ads.e3");
    }

    public final boolean l6() throws RemoteException {
        Parcel m10 = m(22, z0());
        ClassLoader classLoader = ob0.f15778a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final h4 m0() throws RemoteException {
        Parcel m10 = m(34, z0());
        h4 h4Var = (h4) ob0.a(m10, h4.CREATOR);
        m10.recycle();
        return h4Var;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.j3 m1() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 27
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.j3
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.j3 r1 = (com.google.android.gms.internal.ads.j3) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.l3 r2 = new com.google.android.gms.internal.ads.l3
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z2.m1():com.google.android.gms.internal.ads.j3");
    }

    public final void m6(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, fi0);
        z02.writeString(str);
        ob0.b(z02, y2Var);
        Y(28, z02);
    }

    public final h4 r0() throws RemoteException {
        Parcel m10 = m(33, z0());
        h4 h4Var = (h4) ob0.a(m10, h4.CREATOR);
        m10.recycle();
        return h4Var;
    }

    public final void showInterstitial() throws RemoteException {
        Y(4, z0());
    }

    public final void showVideo() throws RemoteException {
        Y(12, z0());
    }

    public final void v3(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(30, z02);
    }
}
