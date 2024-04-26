package y7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b8.c;
import com.google.android.gms.common.internal.i;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import v7.f0;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f28134b = new Object();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f28135c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f28136a = new ConcurrentHashMap();

    public static a b() {
        if (f28135c == null) {
            synchronized (f28134b) {
                if (f28135c == null) {
                    f28135c = new a();
                }
            }
        }
        a aVar = f28135c;
        i.h(aVar);
        return aVar;
    }

    public static final boolean e(Context context, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        if (!(Build.VERSION.SDK_INT >= 29) || executor == null) {
            return context.bindService(intent, serviceConnection, i10);
        }
        return context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10, true, (Executor) null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof f0)) || !this.f28136a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) this.f28136a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.f28136a.remove(serviceConnection);
            }
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(!(serviceConnection instanceof f0))) {
            return e(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f28136a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean e10 = e(context, intent, serviceConnection, i10, executor);
            if (e10) {
                return e10;
            }
            return false;
        } finally {
            this.f28136a.remove(serviceConnection, serviceConnection);
        }
    }
}
