package a;

import a.a;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ICustomTabsService */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService */
    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f0a = 0;

        /* renamed from: a.b$a$a  reason: collision with other inner class name */
        /* compiled from: ICustomTabsService */
        public static class C0001a implements b {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f1a;

            public C0001a(IBinder iBinder) {
                this.f1a = iBinder;
            }

            public IBinder asBinder() {
                return this.f1a;
            }

            public boolean q4(a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder((a.C0000a) aVar);
                    boolean z10 = false;
                    this.f1a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean u5(long j10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    this.f1a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    boolean q4(a aVar) throws RemoteException;

    boolean u5(long j10) throws RemoteException;
}
