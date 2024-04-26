package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class v3 extends ps implements t3 {
    public v3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final void l(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(3, z02);
    }
}
