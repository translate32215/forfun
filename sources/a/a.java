package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ICustomTabsCallback */
public interface a extends IInterface {

    /* renamed from: a.a$a  reason: collision with other inner class name */
    /* compiled from: ICustomTabsCallback */
    public static abstract class C0000a extends Binder implements a {
        public C0000a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i10 == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                    Bundle bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i10 == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i10 == 6) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
        }
    }
}
