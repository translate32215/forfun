package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class m6 extends os implements b6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f7442a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7443b;

    public m6(String str, int i10) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f7442a = str;
        this.f7443b = i10;
    }

    public final String o() throws RemoteException {
        return this.f7442a;
    }

    public final int q0() throws RemoteException {
        return this.f7443b;
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String str = this.f7442a;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.f7443b;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
    }
}
