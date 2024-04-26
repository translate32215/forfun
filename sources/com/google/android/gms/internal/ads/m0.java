package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class m0 extends ps implements l0 {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final boolean W0(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Parcel m10 = m(10, z02);
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final a s5() throws RemoteException {
        return h0.a(m(9, z0()));
    }

    public final String t2() throws RemoteException {
        Parcel m10 = m(4, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }
}
