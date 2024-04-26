package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class az extends ps implements zy {
    public az(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public final String Q4() throws RemoteException {
        Parcel m10 = m(2, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final String getDescription() throws RemoteException {
        Parcel m10 = m(1, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }
}
