package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ta extends os implements b2 {
    public ta() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    public final void W3() throws RemoteException {
    }

    public final void m2(int i10) throws RemoteException {
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel.readInt();
        }
        parcel2.writeNoException();
        return true;
    }
}
