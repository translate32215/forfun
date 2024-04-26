package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b.b;

/* compiled from: IResultReceiver */
public interface a extends IInterface {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* compiled from: IResultReceiver */
    public static abstract class C0043a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f3335a = 0;

        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        public static class C0044a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f3336a;

            public C0044a(IBinder iBinder) {
                this.f3336a = iBinder;
            }

            public IBinder asBinder() {
                return this.f3336a;
            }
        }

        public C0043a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                int readInt = parcel.readInt();
                Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
                b.C0045b bVar = (b.C0045b) this;
                b.this.getClass();
                b.this.a(readInt, (Bundle) createFromParcel);
                return true;
            }
        }
    }
}
