package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.p3;
import e8.t3;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u1 extends ps implements r1 {
    public u1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void M0(p3 p3Var, t3 t3Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, p3Var);
        ob0.b(z02, t3Var);
        try {
            this.f7873a.transact(2, z02, (Parcel) null, 1);
        } finally {
            z02.recycle();
        }
    }
}
