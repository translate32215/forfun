package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.kh0;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class iv extends ps implements jv {
    public iv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long F4(kh0 kh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, kh0);
        Parcel m10 = m(3, z02);
        long readLong = m10.readLong();
        m10.recycle();
        return readLong;
    }

    public final hv e3(kh0 kh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, kh0);
        Parcel m10 = m(1, z02);
        hv hvVar = (hv) ob0.a(m10, hv.CREATOR);
        m10.recycle();
        return hvVar;
    }

    public final hv t5(kh0 kh0) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, kh0);
        Parcel m10 = m(2, z02);
        hv hvVar = (hv) ob0.a(m10, hv.CREATOR);
        m10.recycle();
        return hvVar;
    }
}
