package com.startapp.networkTest.threads;

import android.os.Build;
import com.startapp.f9;
import com.startapp.h9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class ThreadManager {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadManager f11467d = new ThreadManager();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f11468a = new h9(a(1, 60, TimeUnit.SECONDS, true));

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f11469b = new f9(a(0, 1, 30, "ThreadManager-Single"));

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f11470c = new f9(a(0, 4, 30, "ThreadManager-Cached"));

    /* compiled from: Sta */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f11471a = new AtomicInteger();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f11472b;

        public a(String str) {
            this.f11472b = str;
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f11472b + "-" + this.f11471a.incrementAndGet());
        }
    }

    /* compiled from: Sta */
    public class b implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private ThreadManager() {
    }

    public static ThreadManager b() {
        return f11467d;
    }

    public ExecutorService a() {
        return this.f11470c;
    }

    public ExecutorService c() {
        return this.f11469b;
    }

    public ScheduledExecutorService d() {
        return this.f11468a;
    }

    private static ExecutorService a(int i10, int i11, long j10, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i11, j10, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() {
                /* renamed from: a */
                public boolean offer(Runnable runnable) {
                    return tryTransfer(runnable);
                }
            }, new a(str), new b());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        } else if (i11 < 2) {
            return Executors.newSingleThreadExecutor();
        } else {
            return Executors.newCachedThreadPool();
        }
    }

    private static ScheduledThreadPoolExecutor a(int i10, long j10, TimeUnit timeUnit, boolean z10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i10);
        scheduledThreadPoolExecutor.setKeepAliveTime(j10, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(z10);
        return scheduledThreadPoolExecutor;
    }
}
