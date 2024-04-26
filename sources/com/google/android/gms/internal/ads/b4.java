package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class b4 extends ps implements z3 {
    public b4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    public final void l(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(3, z02);
    }
}
