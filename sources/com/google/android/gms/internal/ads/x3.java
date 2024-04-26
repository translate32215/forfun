package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class x3 extends os implements u3 {
    public x3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        j3 j3Var;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                j3Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                if (queryLocalInterface instanceof j3) {
                    j3Var = (j3) queryLocalInterface;
                } else {
                    j3Var = new l3(readStrongBinder);
                }
            }
            fc fcVar = (fc) this;
            fcVar.f6458b.f15428d = j3Var;
            ((zb) fcVar.f6457a.f15551c).v();
        } else if (i10 == 2) {
            ((zb) ((fc) this).f6457a.f15551c).t4(0, parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            ((zb) ((fc) this).f6457a.f15551c).U((zh0) ob0.a(parcel, zh0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
