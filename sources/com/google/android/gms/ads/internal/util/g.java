package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import com.google.android.gms.internal.ads.ps;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class g extends ps implements f {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zzap(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(2, z02);
    }

    public final boolean zzd(a aVar, String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeString(str);
        z02.writeString(str2);
        boolean z10 = true;
        Parcel m10 = m(1, z02);
        if (m10.readInt() == 0) {
            z10 = false;
        }
        m10.recycle();
        return z10;
    }
}
