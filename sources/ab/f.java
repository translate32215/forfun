package ab;

import ab.c0;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.appcompat.widget.m;
import com.google.firebase.messaging.d;
import com.google.firebase.messaging.h;
import f7.f0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s8.j;
import s8.t;
import s8.z;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public abstract class f extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f218a;

    /* renamed from: b  reason: collision with root package name */
    public Binder f219b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f220c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f221d;

    /* renamed from: e  reason: collision with root package name */
    public int f222e = 0;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public class a implements c0.a {
        public a() {
        }
    }

    public f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a8.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f218a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            synchronized (h.f9750b) {
                if (h.f9751c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    h.f9751c.c();
                }
            }
        }
        synchronized (this.f220c) {
            try {
                int i10 = this.f222e - 1;
                this.f222e = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f221d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f219b == null) {
            this.f219b = new c0(new a());
        }
        return this.f219b;
    }

    public void onDestroy() {
        this.f218a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f220c) {
            this.f221d = i11;
            this.f222e++;
        }
        Intent poll = d.a().f9727d.poll();
        if (poll == null) {
            a(intent);
            return 2;
        }
        j jVar = new j();
        this.f218a.execute(new f0(this, poll, jVar));
        z<TResult> zVar = jVar.f25035a;
        if (zVar.k()) {
            a(intent);
            return 2;
        }
        zVar.f25071b.a(new t(e.f217a, new m(this, intent)));
        zVar.s();
        return 3;
    }
}
