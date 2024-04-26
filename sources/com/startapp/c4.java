package com.startapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: Sta */
public interface c4 extends IInterface {

    /* compiled from: Sta */
    public static abstract class a extends Binder implements c4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f10235a = 0;

        /* renamed from: com.startapp.c4$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public static class C0113a implements c4 {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f10236a;

            public C0113a(IBinder iBinder) {
                this.f10236a = iBinder;
            }

            public Bundle a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f10236a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f10235a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f10236a;
            }
        }
    }

    Bundle a(Bundle bundle) throws RemoteException;
}
