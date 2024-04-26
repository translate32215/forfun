package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import i8.a;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class z extends a implements b0 {
    public z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int e() throws RemoteException {
        Parcel m10 = m(2, Y());
        int readInt = m10.readInt();
        m10.recycle();
        return readInt;
    }

    public final c8.a f() throws RemoteException {
        return h0.a(m(1, Y()));
    }
}
