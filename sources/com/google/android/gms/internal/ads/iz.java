package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.oi0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class iz extends ps implements gz {
    public iz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final String S2() throws RemoteException {
        Parcel m10 = m(2, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final List<oi0> d1() throws RemoteException {
        Parcel m10 = m(3, z0());
        ArrayList<oi0> createTypedArrayList = m10.createTypedArrayList(oi0.CREATOR);
        m10.recycle();
        return createTypedArrayList;
    }

    public final String s() throws RemoteException {
        Parcel m10 = m(1, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }
}
