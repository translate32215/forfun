package androidx.work.impl.background.systemalarm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
public class e {

    /* renamed from: e  reason: collision with root package name */
    public static final String f3312e = g2.e.e("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f3313a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, c> f3314b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, b> f3315c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Object f3316d = new Object();

    /* compiled from: WorkTimer */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public int f3317a = 0;

        public a(e eVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder a10 = android.support.v4.media.a.a("WorkManager-WorkTimer-thread-");
            a10.append(this.f3317a);
            newThread.setName(a10.toString());
            this.f3317a++;
            return newThread;
        }
    }

    /* compiled from: WorkTimer */
    public interface b {
        void b(String str);
    }

    /* compiled from: WorkTimer */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final e f3318a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3319b;

        public c(e eVar, String str) {
            this.f3318a = eVar;
            this.f3319b = str;
        }

        public void run() {
            synchronized (this.f3318a.f3316d) {
                if (this.f3318a.f3314b.remove(this.f3319b) != null) {
                    b remove = this.f3318a.f3315c.remove(this.f3319b);
                    if (remove != null) {
                        remove.b(this.f3319b);
                    }
                } else {
                    g2.e.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f3319b}), new Throwable[0]);
                }
            }
        }
    }

    public e() {
        a aVar = new a(this);
        this.f3313a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a(String str, long j10, b bVar) {
        synchronized (this.f3316d) {
            g2.e.c().a(f3312e, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f3314b.put(str, cVar);
            this.f3315c.put(str, bVar);
            this.f3313a.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void b(String str) {
        synchronized (this.f3316d) {
            if (this.f3314b.remove(str) != null) {
                g2.e.c().a(f3312e, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f3315c.remove(str);
            }
        }
    }
}
