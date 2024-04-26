package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import e8.f;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class lz extends os implements mz {
    public lz() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ((f) this).f14522a.c();
        } else if (i10 == 2) {
            ((f) this).f14522a.getClass();
        } else if (i10 == 3) {
            ((f) this).f14522a.b();
        } else if (i10 == 4) {
            ((f) this).f14522a.a();
        } else if (i10 != 5) {
            return false;
        } else {
            ClassLoader classLoader = ob0.f15778a;
            parcel.readInt();
            ((f) this).f14522a.getClass();
        }
        parcel2.writeNoException();
        return true;
    }
}
