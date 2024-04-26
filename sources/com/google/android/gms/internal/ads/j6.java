package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class j6 extends ps implements k6 {
    public j6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void m4(b6 b6Var, String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, b6Var);
        z02.writeString(str);
        z02.writeString(str2);
        Y(2, z02);
    }
}
