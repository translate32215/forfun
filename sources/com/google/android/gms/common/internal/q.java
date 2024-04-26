package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import i8.a;
import i8.c;
import s7.w;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class q extends a implements r {
    public q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final d H5(w wVar) throws RemoteException {
        Parcel Y = Y();
        c.c(Y, wVar);
        Parcel m10 = m(6, Y);
        d dVar = (d) c.a(m10, d.CREATOR);
        m10.recycle();
        return dVar;
    }

    public final boolean n6(e eVar, c8.a aVar) throws RemoteException {
        Parcel Y = Y();
        c.c(Y, eVar);
        c.d(Y, aVar);
        Parcel m10 = m(5, Y);
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final boolean q() throws RemoteException {
        Parcel m10 = m(7, Y());
        int i10 = c.f19327a;
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }
}
