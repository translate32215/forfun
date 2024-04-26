package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class t6 extends ps implements s6 {
    public t6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final void N1(String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        Y(1, z02);
    }

    public final void P5(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        z02.writeString(str2);
        ob0.c(z02, bundle);
        Y(3, z02);
    }

    public final void s0(String str) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        Y(2, z02);
    }
}
