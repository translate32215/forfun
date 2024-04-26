package v7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f26549a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static x f26550b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f26551c;

    public static b a(Context context) {
        synchronized (f26549a) {
            if (f26550b == null) {
                f26550b = new x(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f26550b;
    }

    public static HandlerThread b() {
        synchronized (f26549a) {
            HandlerThread handlerThread = f26551c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f26551c = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f26551c;
            return handlerThread3;
        }
    }

    public final void c(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        c0 c0Var = new c0(str, str2, i10, z10);
        x xVar = (x) this;
        synchronized (xVar.f5892d) {
            d0 d0Var = (d0) xVar.f5892d.get(c0Var);
            if (d0Var == null) {
                String c0Var2 = c0Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + c0Var2);
            } else if (d0Var.f26557a.containsKey(serviceConnection)) {
                d0Var.f26557a.remove(serviceConnection);
                if (d0Var.f26557a.isEmpty()) {
                    xVar.f5894f.sendMessageDelayed(xVar.f5894f.obtainMessage(0, c0Var), xVar.f5896h);
                }
            } else {
                String c0Var3 = c0Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c0Var3);
            }
        }
    }

    public abstract boolean d(c0 c0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
