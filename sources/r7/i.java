package r7;

import a8.a;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class i {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e  reason: collision with root package name */
    public static i f24705e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24706a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f24707b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public j f24708c = new j(this, (e.i) null);
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public int f24709d = 1;

    public i(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f24707b = scheduledExecutorService;
        this.f24706a = context.getApplicationContext();
    }

    public static synchronized i a(Context context) {
        i iVar;
        synchronized (i.class) {
            if (f24705e == null) {
                f24705e = new i(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            iVar = f24705e;
        }
        return iVar;
    }

    public final synchronized <T> s8.i<T> b(p<T> pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(pVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f24708c.b(pVar)) {
            j jVar = new j(this, (e.i) null);
            this.f24708c = jVar;
            jVar.b(pVar);
        }
        return pVar.f24725b.f25035a;
    }
}
