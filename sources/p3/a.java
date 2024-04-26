package p3;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: GlideExecutor */
public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f23805b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    public static volatile int f23806c;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f23807a;

    /* renamed from: p3.a$a  reason: collision with other inner class name */
    /* compiled from: GlideExecutor */
    public static final class C0209a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final String f23808a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f23809b;

        /* renamed from: c  reason: collision with root package name */
        public int f23810c;

        /* renamed from: p3.a$a$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        public class C0210a extends Thread {
            public C0210a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C0209a.this.f23809b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C0209a.this.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public C0209a(String str, b bVar, boolean z10) {
            this.f23808a = str;
            this.f23809b = z10;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C0210a aVar;
            aVar = new C0210a(runnable, "glide-" + this.f23808a + "-thread-" + this.f23810c);
            this.f23810c = this.f23810c + 1;
            return aVar;
        }
    }

    /* compiled from: GlideExecutor */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f23812a = new C0211a();

        /* renamed from: p3.a$b$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        public class C0211a implements b {
        }
    }

    public a(ExecutorService executorService) {
        this.f23807a = executorService;
    }

    public static int a() {
        if (f23806c == 0) {
            f23806c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f23806c;
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f23807a.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f23807a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f23807a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f23807a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f23807a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f23807a.isTerminated();
    }

    public void shutdown() {
        this.f23807a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f23807a.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f23807a.submit(runnable);
    }

    public String toString() {
        return this.f23807a.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f23807a.invokeAll(collection, j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f23807a.invokeAny(collection, j10, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f23807a.submit(runnable, t10);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f23807a.submit(callable);
    }
}
