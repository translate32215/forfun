package z9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f28744a = 0;

        /* renamed from: z9.g$a$a  reason: collision with other inner class name */
        public static class C0292a implements g {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f28745a;

            public C0292a(IBinder iBinder) {
                this.f28745a = iBinder;
            }

            public final IBinder a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.f28745a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(boolean z10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z10 ? 1 : 0);
                    this.f28745a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f28745a;
            }
        }
    }

    IBinder a() throws RemoteException;

    void a(boolean z10) throws RemoteException;
}
