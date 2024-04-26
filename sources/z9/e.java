package z9;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import z9.m;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f28740a = 0;

        /* renamed from: z9.e$a$a  reason: collision with other inner class name */
        public static class C0290a implements e {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f28741a;

            public C0290a(IBinder iBinder) {
                this.f28741a = iBinder;
            }

            public final void H2(String str, int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    this.f28741a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void I2(Configuration configuration) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28741a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void U2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(boolean z10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z10 ? 1 : 0);
                    this.f28741a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z10 = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28741a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f28741a;
            }

            public final Bundle c1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c4(int i10, KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i10);
                    boolean z10 = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28741a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void e6(boolean z10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z10 ? 1 : 0);
                    this.f28741a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean h3(int i10, KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i10);
                    boolean z10 = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28741a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void j4() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void v1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final m y2() throws RemoteException {
                m mVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    int i10 = m.a.f28770a;
                    if (readStrongBinder == null) {
                        mVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
                        mVar = (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new m.a.C0293a(readStrongBinder) : (m) queryLocalInterface;
                    }
                    return mVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void z5() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f28741a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    void H2(String str, int i10) throws RemoteException;

    void I2(Configuration configuration) throws RemoteException;

    void U2() throws RemoteException;

    void a() throws RemoteException;

    void a(boolean z10) throws RemoteException;

    boolean a(Bundle bundle) throws RemoteException;

    Bundle c1() throws RemoteException;

    boolean c4(int i10, KeyEvent keyEvent) throws RemoteException;

    void e6(boolean z10) throws RemoteException;

    boolean h3(int i10, KeyEvent keyEvent) throws RemoteException;

    void j4() throws RemoteException;

    void l() throws RemoteException;

    void m() throws RemoteException;

    void v1() throws RemoteException;

    m y2() throws RemoteException;

    void z5() throws RemoteException;
}
