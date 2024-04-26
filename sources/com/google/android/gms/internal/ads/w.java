package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e8.k1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class w extends os implements u {
    public w() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static u s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof u) {
            return (u) queryLocalInterface;
        }
        return new v(iBinder);
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            String str = ((k1) this).f15212a;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            List<z> list = ((k1) this).f15214c;
            parcel2.writeNoException();
            parcel2.writeList(list);
            return true;
        }
    }
}
