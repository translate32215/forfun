package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.et;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class l4 extends os implements j4 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7313a = 0;

    public l4() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ((et) this).h4((Intent) ob0.a(parcel, Intent.CREATOR));
        } else if (i10 == 2) {
            ((et) this).E5(a.C0062a.Y(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            et etVar = (et) this;
            etVar.f14512e.i(new ri(etVar.f14511d));
        }
        parcel2.writeNoException();
        return true;
    }
}
