package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class p0 extends ps implements o0 {
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void K4(e0 e0Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, e0Var);
        Y(1, z02);
    }
}
