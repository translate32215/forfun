package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class o5 extends ps implements p5 {
    public o5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void r4(m5 m5Var, String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, m5Var);
        z02.writeString(str);
        z02.writeString(str2);
        Y(2, z02);
    }
}
