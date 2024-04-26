package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class my extends ps implements ky {
    public my(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void a(String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        Y(1, z02);
    }
}
