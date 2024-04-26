package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import c8.a;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a0 extends ps implements y {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final a b3() throws RemoteException {
        return h0.a(m(4, z0()));
    }
}
