package i8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b extends Binder implements IInterface {
    public b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public boolean m(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return false;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return m(i10, parcel, parcel2, i11);
    }
}
