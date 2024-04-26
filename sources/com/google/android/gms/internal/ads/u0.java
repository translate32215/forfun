package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class u0 extends ps implements s0 {
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void K2(i0 i0Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, i0Var);
        Y(1, z02);
    }
}
