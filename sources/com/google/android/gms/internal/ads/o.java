package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.c0;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class o extends ps implements n {
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void L3(c0 c0Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, c0Var);
        Y(1, z02);
    }
}
