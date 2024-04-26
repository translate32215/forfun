package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import com.startapp.b4;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class x5 extends os implements y5 {
    public x5() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static y5 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof y5) {
            return (y5) queryLocalInterface;
        }
        return new z5(iBinder);
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                U3(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 2:
                O3(a.C0062a.Y(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                d5(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 4:
                E0(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 5:
                g2(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 6:
                z3(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 7:
                F5(a.C0062a.Y(parcel.readStrongBinder()), (a6) ob0.a(parcel, a6.CREATOR));
                break;
            case b4.f10106f /*8*/:
                M4(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 9:
                j5(a.C0062a.Y(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                f6(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 11:
                K1(a.C0062a.Y(parcel.readStrongBinder()));
                break;
            case 12:
                b0((Bundle) ob0.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
