package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a1 extends ps implements y0 {
    public a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void o2(l0 l0Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, l0Var);
        Y(1, z02);
    }
}
