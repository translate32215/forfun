package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import e8.fi0;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class yx extends os implements ux {
    public yx() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            J2((fi0) ob0.a(parcel, fi0.CREATOR));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String s10 = s();
            parcel2.writeNoException();
            parcel2.writeString(s10);
        } else if (i10 == 3) {
            boolean j10 = j();
            parcel2.writeNoException();
            ClassLoader classLoader = ob0.f15778a;
            parcel2.writeInt(j10 ? 1 : 0);
        } else if (i10 == 4) {
            String A0 = A0();
            parcel2.writeNoException();
            parcel2.writeString(A0);
        } else if (i10 != 5) {
            return false;
        } else {
            Y3((fi0) ob0.a(parcel, fi0.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
