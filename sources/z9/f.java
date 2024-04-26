package z9;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import z9.d;

public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f28742a = 0;

        /* renamed from: z9.f$a$a  reason: collision with other inner class name */
        public static class C0291a implements f {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f28743a;

            public C0291a(IBinder iBinder) {
                this.f28743a = iBinder;
            }

            public final void A1(d dVar, int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(dVar != null ? (d.a) dVar : null);
                    obtain.writeInt(i10);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeInt(0);
                    this.f28743a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f28743a;
            }
        }
    }

    void A1(d dVar, int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException;
}
