package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import i8.a;
import i8.c;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class g extends a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final c8.a E1(c8.a aVar, String str, int i10, c8.a aVar2) throws RemoteException {
        Parcel Y = Y();
        c.d(Y, aVar);
        Y.writeString(str);
        Y.writeInt(i10);
        c.d(Y, aVar2);
        return h0.a(m(8, Y));
    }

    public final c8.a G1(c8.a aVar, String str, int i10) throws RemoteException {
        Parcel Y = Y();
        c.d(Y, aVar);
        Y.writeString(str);
        Y.writeInt(i10);
        return h0.a(m(4, Y));
    }

    public final c8.a H1(c8.a aVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel Y = Y();
        c.d(Y, aVar);
        Y.writeString(str);
        Y.writeInt(z10 ? 1 : 0);
        Y.writeLong(j10);
        return h0.a(m(7, Y));
    }

    public final c8.a z0(c8.a aVar, String str, int i10) throws RemoteException {
        Parcel Y = Y();
        c.d(Y, aVar);
        Y.writeString(str);
        Y.writeInt(i10);
        return h0.a(m(2, Y));
    }
}
