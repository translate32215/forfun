package r7;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Messenger f24722a;

    /* renamed from: b  reason: collision with root package name */
    public final e f24723b;

    public o(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f24722a = new Messenger(iBinder);
            this.f24723b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f24723b = new e(iBinder);
            this.f24722a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }
}
