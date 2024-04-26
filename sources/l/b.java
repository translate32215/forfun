package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20961a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f20962b = Executors.newFixedThreadPool(4, new a(this));

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f20963c;

    /* compiled from: DefaultTaskExecutor */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f20964a = new AtomicInteger(0);

        public a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f20964a.getAndIncrement())}));
            return thread;
        }
    }

    public b() {
        super(0);
    }

    public static Handler f(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public void a(Runnable runnable) {
        this.f20962b.execute(runnable);
    }

    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void e(Runnable runnable) {
        if (this.f20963c == null) {
            synchronized (this.f20961a) {
                if (this.f20963c == null) {
                    this.f20963c = f(Looper.getMainLooper());
                }
            }
        }
        this.f20963c.post(runnable);
    }
}
