package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class jz extends ps implements hz {
    public jz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float H0() throws RemoteException {
        Parcel m10 = m(7, z0());
        float readFloat = m10.readFloat();
        m10.recycle();
        return readFloat;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.mz R1() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 11
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.mz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.mz r1 = (com.google.android.gms.internal.ads.mz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.nz r2 = new com.google.android.gms.internal.ads.nz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jz.R1():com.google.android.gms.internal.ads.mz");
    }

    public final float n0() throws RemoteException {
        Parcel m10 = m(6, z0());
        float readFloat = m10.readFloat();
        m10.recycle();
        return readFloat;
    }

    public final float s1() throws RemoteException {
        Parcel m10 = m(9, z0());
        float readFloat = m10.readFloat();
        m10.recycle();
        return readFloat;
    }

    public final void x3(mz mzVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, mzVar);
        Y(8, z02);
    }
}
