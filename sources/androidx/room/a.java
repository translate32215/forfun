package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMultiInstanceInvalidationCallback */
public interface a extends IInterface {

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C0038a extends Binder implements a {

        /* renamed from: androidx.room.a$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationCallback */
        public static class C0039a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f3162a;

            public C0039a(IBinder iBinder) {
                this.f3162a = iBinder;
            }

            public void G2(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f3162a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3162a;
            }
        }

        public static a m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0039a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    void G2(String[] strArr) throws RemoteException;
}
