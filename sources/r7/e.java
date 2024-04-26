package r7;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import r7.c;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public Messenger f24697a;

    /* renamed from: b  reason: collision with root package name */
    public c f24698b;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static final class a extends ClassLoader {
        public final Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z10);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return e.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return e.class;
        }
    }

    public e(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f24697a = new Messenger(iBinder);
        } else {
            this.f24698b = new c.a(iBinder);
        }
    }

    public final IBinder a() {
        Messenger messenger = this.f24697a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return ((c.a) this.f24698b).f24686a;
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f24697a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        c.a aVar = (c.a) this.f24698b;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            aVar.f24686a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((e) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f24697a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(((c.a) this.f24698b).f24686a);
        }
    }
}
