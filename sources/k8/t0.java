package k8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class t0 extends f0 implements v0 {
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void o0(Bundle bundle) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, bundle);
        E1(1, Y);
    }
}
