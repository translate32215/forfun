package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.a;

/* compiled from: IMultiInstanceInvalidationService */
public abstract class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int Y = ((MultiInstanceInvalidationService.b) this).Y(a.C0038a.m(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(Y);
            return true;
        } else if (i10 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).z0(a.C0038a.m(parcel.readStrongBinder()), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i10 == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).m(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i10 != 1598968902) {
            return super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
