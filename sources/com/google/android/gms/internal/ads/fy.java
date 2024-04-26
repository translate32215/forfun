package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.fi0;
import e8.h;
import e8.li0;
import e8.ob0;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class fy extends ps implements dy {
    public fy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final String A0() throws RemoteException {
        Parcel m10 = m(35, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.gz B() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 41
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.gz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.gz r1 = (com.google.android.gms.internal.ads.gz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.iz r2 = new com.google.android.gms.internal.ads.iz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fy.B():com.google.android.gms.internal.ads.gz");
    }

    public final void D() throws RemoteException {
        Y(6, z0());
    }

    public final String H4() throws RemoteException {
        Parcel m10 = m(31, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final void N(boolean z10) throws RemoteException {
        Parcel z02 = z0();
        ClassLoader classLoader = ob0.f15778a;
        z02.writeInt(z10 ? 1 : 0);
        Y(34, z02);
    }

    public final a O1() throws RemoteException {
        return h0.a(m(1, z0()));
    }

    public final li0 O4() throws RemoteException {
        Parcel m10 = m(12, z0());
        li0 li0 = (li0) ob0.a(m10, li0.CREATOR);
        m10.recycle();
        return li0;
    }

    public final void T(t5 t5Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, t5Var);
        Y(24, z02);
    }

    public final Bundle X() throws RemoteException {
        Parcel m10 = m(37, z0());
        Bundle bundle = (Bundle) ob0.a(m10, Bundle.CREATOR);
        m10.recycle();
        return bundle;
    }

    public final void X1(boolean z10) throws RemoteException {
        Parcel z02 = z0();
        ClassLoader classLoader = ob0.f15778a;
        z02.writeInt(z10 ? 1 : 0);
        Y(22, z02);
    }

    public final void Z5(n nVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, nVar);
        Y(19, z02);
    }

    public final void destroy() throws RemoteException {
        Y(2, z0());
    }

    public final void e0(jy jyVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, jyVar);
        Y(36, z02);
    }

    public final boolean e1(fi0 fi0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, fi0);
        Parcel m10 = m(4, z02);
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final void g() throws RemoteException {
        Y(5, z0());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.hz getVideoController() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 26
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.hz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.hz r1 = (com.google.android.gms.internal.ads.hz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.jz r2 = new com.google.android.gms.internal.ads.jz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fy.getVideoController():com.google.android.gms.internal.ads.hz");
    }

    public final boolean isReady() throws RemoteException {
        Parcel m10 = m(3, z0());
        ClassLoader classLoader = ob0.f15778a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final void k1(ky kyVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, kyVar);
        Y(8, z02);
    }

    public final void n5(li0 li0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, li0);
        Y(13, z02);
    }

    public final void p2(h hVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, hVar);
        Y(29, z02);
    }

    public final void p6(rx rxVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, rxVar);
        Y(7, z02);
    }

    public final void q1(ox oxVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, oxVar);
        Y(20, z02);
    }

    public final void showInterstitial() throws RemoteException {
        Y(9, z0());
    }

    public final void y5(cz czVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, czVar);
        Y(42, z02);
    }
}
