package ab;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import s8.j;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class d0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f209a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f210b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f211c;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<a> f212d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public c0 f213e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f214f = false;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f215a;

        /* renamed from: b  reason: collision with root package name */
        public final j<Void> f216b = new j<>();

        public a(Intent intent) {
            this.f215a = intent;
        }

        public void a() {
            this.f216b.b(null);
        }
    }

    public d0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new a8.a("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f209a = applicationContext;
        this.f210b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f211c = scheduledThreadPoolExecutor;
    }

    public final void a() {
        while (!this.f212d.isEmpty()) {
            this.f212d.poll().a();
        }
    }

    public final synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f212d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            c0 c0Var = this.f213e;
            if (c0Var == null || !c0Var.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f213e.a(this.f212d.poll());
        }
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z10 = this.f214f;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("binder is dead. start connection? ");
            sb2.append(!z10);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f214f) {
            this.f214f = true;
            try {
                if (!y7.a.b().a(this.f209a, this.f210b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f214f = false;
                    a();
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("onServiceConnected: ");
            sb2.append(valueOf);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        this.f214f = false;
        if (!(iBinder instanceof c0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 28);
            sb3.append("Invalid service connection: ");
            sb3.append(valueOf2);
            Log.e("FirebaseMessaging", sb3.toString());
            a();
            return;
        }
        this.f213e = (c0) iBinder;
        b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("onServiceDisconnected: ");
            sb2.append(valueOf);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        b();
    }
}
