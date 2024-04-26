package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e8.a;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class fz extends os implements cz {
    public fz() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static cz s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof cz) {
            return (cz) queryLocalInterface;
        }
        return new ez(iBinder);
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ((a) this).I1((fx) ob0.a(parcel, fx.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
