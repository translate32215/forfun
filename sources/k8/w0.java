package k8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class w0 extends f0 implements x0 {
    public w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final int f() throws RemoteException {
        Parcel z02 = z0(2, Y());
        int readInt = z02.readInt();
        z02.recycle();
        return readInt;
    }

    public final void i1(String str, String str2, Bundle bundle, long j10) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        h0.b(Y, bundle);
        Y.writeLong(j10);
        E1(1, Y);
    }
}
