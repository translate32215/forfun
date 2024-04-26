package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import e8.c0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class m extends os implements c0 {
    public m() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String str = ((l) this).f7311b;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else if (i10 == 2) {
            String str2 = ((l) this).f7312c;
            parcel2.writeNoException();
            parcel2.writeString(str2);
        } else if (i10 == 3) {
            a Y = a.C0062a.Y(parcel.readStrongBinder());
            l lVar = (l) this;
            if (Y != null) {
                lVar.f7310a.t((View) b.z0(Y));
            }
            parcel2.writeNoException();
        } else if (i10 == 4) {
            ((l) this).f7310a.B();
            parcel2.writeNoException();
        } else if (i10 != 5) {
            return false;
        } else {
            ((l) this).f7310a.J();
            parcel2.writeNoException();
        }
        return true;
    }
}
