package k8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public class g0 extends Binder implements IInterface {
    public g0(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean m(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        throw null;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return m(i10, parcel, parcel2, i11);
    }
}
