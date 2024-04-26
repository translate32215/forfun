package f8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class c extends a implements e {
    public c(IBinder iBinder) {
        super(iBinder);
    }

    public final boolean L2(boolean z10) throws RemoteException {
        Parcel Y = Y();
        int i10 = b.f18328a;
        boolean z11 = true;
        Y.writeInt(1);
        Parcel z02 = z0(2, Y);
        if (z02.readInt() == 0) {
            z11 = false;
        }
        z02.recycle();
        return z11;
    }

    public final String e() throws RemoteException {
        Parcel z02 = z0(1, Y());
        String readString = z02.readString();
        z02.recycle();
        return readString;
    }

    public final boolean f() throws RemoteException {
        Parcel z02 = z0(6, Y());
        int i10 = b.f18328a;
        boolean z10 = z02.readInt() != 0;
        z02.recycle();
        return z10;
    }
}
