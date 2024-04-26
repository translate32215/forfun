package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.ob0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class v extends ps implements u {
    public v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String J1() throws RemoteException {
        Parcel m10 = m(2, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final List<z> Q0() throws RemoteException {
        Parcel m10 = m(3, z0());
        ArrayList readArrayList = m10.readArrayList(ob0.f15778a);
        m10.recycle();
        return readArrayList;
    }
}
