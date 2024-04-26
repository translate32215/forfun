package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class r3 extends os implements p3 {
    public r3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a Y = a.C0062a.Y(parcel.readStrongBinder());
            yb ybVar = (yb) this;
            ybVar.f8597b.f8442c = (View) b.z0(Y);
            ((zb) ybVar.f8596a.f15551c).v();
        } else if (i10 == 2) {
            ((zb) ((yb) this).f8596a.f15551c).t4(0, parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            ((zb) ((yb) this).f8596a.f15551c).U((zh0) ob0.a(parcel, zh0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
