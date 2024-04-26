package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import e8.zh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class s3 extends os implements t3 {
    public s3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            ((zb) ((dc) this).f6199a.f15551c).v();
        } else if (i10 == 3) {
            ((zb) ((dc) this).f6199a.f15551c).t4(0, parcel.readString());
        } else if (i10 != 4) {
            return false;
        } else {
            ((zb) ((dc) this).f6199a.f15551c).U((zh0) ob0.a(parcel, zh0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
