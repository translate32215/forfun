package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import e8.ob0;
import e8.qr;
import f7.n;
import f7.p;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class k5 extends os implements i5 {
    public k5() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ((qr) this).f16197a.f15833a.b(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) ob0.a(parcel, ParcelFileDescriptor.CREATOR)));
        } else if (i10 != 2) {
            return false;
        } else {
            n nVar = (n) ob0.a(parcel, n.CREATOR);
            ((qr) this).f16197a.f15833a.c(new p(nVar.f18306a, nVar.f18307b));
        }
        parcel2.writeNoException();
        return true;
    }
}
