package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class v0 extends ps implements t0 {
    public v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void u0(l0 l0Var, String str) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, l0Var);
        z02.writeString(str);
        Y(1, z02);
    }
}
