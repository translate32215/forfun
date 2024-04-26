package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.startapp.b4;
import e8.bi0;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class qx extends os implements rx {
    public qx() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                ((bi0) this).f14020a.g();
                break;
            case 2:
                ((bi0) this).f14020a.l(parcel.readInt());
                break;
            case 3:
                ((bi0) this).f14020a.v();
                break;
            case 4:
                ((bi0) this).f14020a.w();
                break;
            case 5:
                ((bi0) this).f14020a.y();
                break;
            case 6:
                ((bi0) this).f14020a.n();
                break;
            case 7:
                ((bi0) this).f14020a.t();
                break;
            case b4.f10106f /*8*/:
                ((bi0) this).U((zh0) ob0.a(parcel, zh0.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
