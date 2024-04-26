package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
public class ps implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f7873a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7874b;

    public ps(IBinder iBinder, String str) {
        this.f7873a = iBinder;
        this.f7874b = str;
    }

    public final void Y(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7873a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7873a;
    }

    public final Parcel m(int i10, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f7873a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel z0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7874b);
        return obtain;
    }
}
