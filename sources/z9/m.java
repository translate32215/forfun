package z9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface m extends IInterface {

    public static abstract class a extends Binder implements m {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f28770a = 0;

        /* renamed from: z9.m$a$a  reason: collision with other inner class name */
        public static class C0293a implements m {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f28771a;

            public C0293a(IBinder iBinder) {
                this.f28771a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f28771a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return true;
        }
    }
}
