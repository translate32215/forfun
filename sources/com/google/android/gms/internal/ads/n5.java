package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class n5 extends ps implements m5 {
    public n5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final String o() throws RemoteException {
        Parcel m10 = m(1, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final int q0() throws RemoteException {
        Parcel m10 = m(2, z0());
        int readInt = m10.readInt();
        m10.recycle();
        return readInt;
    }
}
