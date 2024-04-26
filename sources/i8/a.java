package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f19325a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19326b;

    public a(IBinder iBinder, String str) {
        this.f19325a = iBinder;
        this.f19326b = str;
    }

    public final Parcel Y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19326b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f19325a;
    }

    public final Parcel m(int i10, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f19325a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }
}
