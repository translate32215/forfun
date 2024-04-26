package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class rs extends ps implements qs {
    public rs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void A4() throws RemoteException {
        Y(3, z0());
    }

    public final void C2(a aVar, String str, String str2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeString(str);
        z02.writeString((String) null);
        Y(8, z02);
    }

    public final void J0(a aVar, String str) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeString(str);
        Y(2, z02);
    }

    public final void T4(int[] iArr) throws RemoteException {
        Parcel z02 = z0();
        z02.writeIntArray((int[]) null);
        Y(4, z02);
    }

    public final void a4(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(6, z02);
    }

    public final void b1(byte[] bArr) throws RemoteException {
        Parcel z02 = z0();
        z02.writeByteArray(bArr);
        Y(5, z02);
    }

    public final void g5(int i10) throws RemoteException {
        Parcel z02 = z0();
        z02.writeInt(i10);
        Y(7, z02);
    }
}
