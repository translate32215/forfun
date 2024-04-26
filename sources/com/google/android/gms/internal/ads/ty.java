package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.c;
import e8.ob0;
import e8.y3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class ty extends ps implements ry {
    public ty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void P() throws RemoteException {
        Y(1, z0());
    }

    public final void P0(String str, a aVar) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        ob0.b(z02, aVar);
        Y(6, z02);
    }

    public final List<y3> X4() throws RemoteException {
        Parcel m10 = m(13, z0());
        ArrayList<y3> createTypedArrayList = m10.createTypedArrayList(y3.CREATOR);
        m10.recycle();
        return createTypedArrayList;
    }

    public final void b6(c cVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, cVar);
        Y(14, z02);
    }

    public final String j6() throws RemoteException {
        Parcel m10 = m(9, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final void s3(s2 s2Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, s2Var);
        Y(11, z02);
    }

    public final void x1(x1 x1Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, x1Var);
        Y(12, z02);
    }
}
