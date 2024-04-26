package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class v2 extends os implements s2 {
    public v2() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static s2 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof s2) {
            return (s2) queryLocalInterface;
        }
        return new u2(iBinder);
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            x2 g62 = ((t2) this).g6(parcel.readString());
            parcel2.writeNoException();
            ob0.b(parcel2, g62);
        } else if (i10 == 2) {
            boolean Z1 = ((t2) this).Z1(parcel.readString());
            parcel2.writeNoException();
            ClassLoader classLoader = ob0.f15778a;
            parcel2.writeInt(Z1 ? 1 : 0);
        } else if (i10 != 3) {
            return false;
        } else {
            a4 B3 = ((t2) this).B3(parcel.readString());
            parcel2.writeNoException();
            ob0.b(parcel2, B3);
        }
        return true;
    }
}
