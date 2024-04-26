package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class u2 extends ps implements s2 {
    public u2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.a4 B3(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.z0()
            r0.writeString(r4)
            r4 = 3
            android.os.Parcel r4 = r3.m(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            int r1 = com.google.android.gms.internal.ads.d4.f6149a
            if (r0 != 0) goto L_0x0016
            r0 = 0
            goto L_0x002a
        L_0x0016:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.a4
            if (r2 == 0) goto L_0x0024
            r0 = r1
            com.google.android.gms.internal.ads.a4 r0 = (com.google.android.gms.internal.ads.a4) r0
            goto L_0x002a
        L_0x0024:
            com.google.android.gms.internal.ads.c4 r1 = new com.google.android.gms.internal.ads.c4
            r1.<init>(r0)
            r0 = r1
        L_0x002a:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u2.B3(java.lang.String):com.google.android.gms.internal.ads.a4");
    }

    public final boolean Z1(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Parcel m10 = m(2, z02);
        ClassLoader classLoader = ob0.f15778a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.x2 g6(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.z0()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.m(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.x2
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.x2 r0 = (com.google.android.gms.internal.ads.x2) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.z2 r1 = new com.google.android.gms.internal.ads.z2
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u2.g6(java.lang.String):com.google.android.gms.internal.ads.x2");
    }
}
