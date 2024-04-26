package k8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public abstract class u0 extends g0 implements v0 {
    public u0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean m(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ((o0) this).o0((Bundle) h0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
