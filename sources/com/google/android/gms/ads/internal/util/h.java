package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import com.google.android.gms.internal.ads.os;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class h extends os implements f {
    public h() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            boolean zzd = zzd(a.C0062a.Y(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            ClassLoader classLoader = ob0.f15778a;
            parcel2.writeInt(zzd ? 1 : 0);
        } else if (i10 != 2) {
            return false;
        } else {
            zzap(a.C0062a.Y(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
