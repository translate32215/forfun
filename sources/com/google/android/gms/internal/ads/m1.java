package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;
import java.util.ArrayList;
import java.util.List;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class m1 extends ps implements k1 {
    public m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final List T1() throws RemoteException {
        Parcel m10 = m(23, z0());
        ArrayList readArrayList = m10.readArrayList(ob0.f15778a);
        m10.recycle();
        return readArrayList;
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

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.u h() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 14
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.u
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.u r1 = (com.google.android.gms.internal.ads.u) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.v r2 = new com.google.android.gms.internal.ads.v
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m1.h():com.google.android.gms.internal.ads.u");
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
        return h0.a(m(19, z0()));
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

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.z w() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 5
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.z
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.z r1 = (com.google.android.gms.internal.ads.z) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.b0 r2 = new com.google.android.gms.internal.ads.b0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m1.w():com.google.android.gms.internal.ads.z");
    }

    public final a y() throws RemoteException {
        return h0.a(m(18, z0()));
    }
}
