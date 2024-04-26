package z9;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import z9.k;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        public a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                k kVar = k.this;
                Handler handler = kVar.f28753b;
                handler.sendMessage(handler.obtainMessage(1, new k.d(readString, readStrongBinder)));
                parcel2.writeNoException();
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IConnectionCallbacks");
                return true;
            }
        }
    }
}
