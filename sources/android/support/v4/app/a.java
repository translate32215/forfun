package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel */
public interface a extends IInterface {

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0006a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f282a = 0;

        /* renamed from: android.support.v4.app.a$a$a  reason: collision with other inner class name */
        /* compiled from: INotificationSideChannel */
        public static class C0007a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f283a;

            public C0007a(IBinder iBinder) {
                this.f283a = iBinder;
            }

            public IBinder asBinder() {
                return this.f283a;
            }

            public void x5(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f283a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    void x5(String str, int i10, String str2, Notification notification) throws RemoteException;
}
