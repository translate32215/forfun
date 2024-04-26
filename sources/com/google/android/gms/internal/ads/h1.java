package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class h1 extends ps implements f1 {
    public h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void m3(k1 k1Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, k1Var);
        Y(1, z02);
    }
}
