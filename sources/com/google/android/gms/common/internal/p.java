package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import i8.b;
import v7.b0;
import v7.d;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f5882a;

    public p(IBinder iBinder) {
        this.f5882a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f5882a;
    }

    public final void z1(d dVar, d dVar2) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder((b) dVar);
            obtain.writeInt(1);
            b0.a(dVar2, obtain, 0);
            this.f5882a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
