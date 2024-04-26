package k8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public class f0 implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f20199a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20200b;

    public f0(IBinder iBinder, String str) {
        this.f20199a = iBinder;
        this.f20200b = str;
    }

    public final void E1(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20199a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel Y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20200b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f20199a;
    }

    public final Parcel z0(int i10, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f20199a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }
}
