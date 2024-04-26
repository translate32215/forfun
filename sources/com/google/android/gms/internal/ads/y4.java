package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class y4 extends ps implements x4 {
    public y4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public final void V5(List<Uri> list) throws RemoteException {
        Parcel z02 = z0();
        z02.writeTypedList(list);
        Y(1, z02);
    }

    public final void s0(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(2, z02);
    }
}
