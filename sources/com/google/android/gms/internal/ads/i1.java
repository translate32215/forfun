package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class i1 extends ps implements g1 {
    public i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public final boolean a5(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Parcel m10 = m(2, z02);
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }
}
