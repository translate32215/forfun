package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.y3;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class y1 extends ps implements x1 {
    public y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public final void E4(List<y3> list) throws RemoteException {
        Parcel z02 = z0();
        z02.writeTypedList(list);
        Y(1, z02);
    }
}
