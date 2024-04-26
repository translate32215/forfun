package k8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class i0 extends f0 implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle o0(Bundle bundle) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, bundle);
        Parcel z02 = z0(1, Y);
        Bundle bundle2 = (Bundle) h0.a(z02, Bundle.CREATOR);
        z02.recycle();
        return bundle2;
    }
}
