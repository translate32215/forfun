package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class s4 extends ps implements r4 {
    public s4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void B4() throws RemoteException {
        Y(10, z0());
    }

    public final void D2() throws RemoteException {
        Y(9, z0());
    }

    public final void T5(Bundle bundle) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, bundle);
        Parcel m10 = m(6, z02);
        if (m10.readInt() != 0) {
            bundle.readFromParcel(m10);
        }
        m10.recycle();
    }

    public final void Z() throws RemoteException {
        Y(7, z0());
    }

    public final void Z0(int i10, int i11, Intent intent) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        z02.writeInt(i11);
        ob0.c(z02, intent);
        Y(12, z02);
    }

    public final void h1(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(13, z02);
    }

    public final void h6(Bundle bundle) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, bundle);
        Y(1, z02);
    }

    public final void o3() throws RemoteException {
        Y(2, z0());
    }

    public final void onDestroy() throws RemoteException {
        Y(8, z0());
    }

    public final void onPause() throws RemoteException {
        Y(5, z0());
    }

    public final void onResume() throws RemoteException {
        Y(4, z0());
    }

    public final void v0() throws RemoteException {
        Y(3, z0());
    }

    public final boolean w2() throws RemoteException {
        Parcel m10 = m(11, z0());
        ClassLoader classLoader = ob0.f15778a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final void x0() throws RemoteException {
        Y(14, z0());
    }
}
