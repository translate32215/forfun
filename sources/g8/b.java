package g8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.startapp.b4;
import q8.e;
import q8.h;
import q8.l;
import r7.m;
import s7.a;
import u7.z;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class b extends Binder implements IInterface {
    public b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        e eVar = (e) this;
        switch (i10) {
            case 3:
                a aVar = (a) c.a(parcel, a.CREATOR);
                q8.b bVar = (q8.b) c.a(parcel, q8.b.CREATOR);
                break;
            case 4:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case b4.f10106f:
                z zVar = (z) eVar;
                zVar.f26142b.post(new m(zVar, (l) c.a(parcel, l.CREATOR)));
                break;
            case 9:
                h hVar = (h) c.a(parcel, h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
