package f8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f18327a;

    public a(IBinder iBinder) {
        this.f18327a = iBinder;
    }

    public final Parcel Y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f18327a;
    }

    public final Parcel z0(int i10, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f18327a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }
}
