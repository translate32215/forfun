package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import g8.a;
import g8.b;
import g8.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class g extends a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void m(j jVar, f fVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18594b);
        int i10 = c.f18595a;
        obtain.writeInt(1);
        jVar.writeToParcel(obtain, 0);
        obtain.writeStrongBinder((b) fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f18593a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
