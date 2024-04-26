package ve;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: AsyncTimeout */
public class c extends z {

    /* renamed from: h  reason: collision with root package name */
    public static final long f26730h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f26731i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public static c f26732j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26733e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public c f26734f;

    /* renamed from: g  reason: collision with root package name */
    public long f26735g;

    /* compiled from: AsyncTimeout */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.m();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<ve.c> r0 = ve.c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                ve.c r1 = ve.c.h()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                ve.c r2 = ve.c.f26732j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                ve.c.f26732j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.m()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: ve.c.a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f26730h = millis;
        f26731i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static c h() throws InterruptedException {
        Class<c> cls = c.class;
        c cVar = f26732j.f26734f;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f26730h);
            if (f26732j.f26734f != null || System.nanoTime() - nanoTime < f26731i) {
                return null;
            }
            return f26732j;
        }
        long nanoTime2 = cVar.f26735g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j10 = nanoTime2 / 1000000;
            cls.wait(j10, (int) (nanoTime2 - (1000000 * j10)));
            return null;
        }
        f26732j.f26734f = cVar.f26734f;
        cVar.f26734f = null;
        return cVar;
    }

    public final void i() {
        c cVar;
        if (!this.f26733e) {
            long j10 = this.f26788c;
            boolean z10 = this.f26786a;
            if (j10 != 0 || z10) {
                this.f26733e = true;
                Class<c> cls = c.class;
                synchronized (cls) {
                    if (f26732j == null) {
                        f26732j = new c();
                        new a().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j10 != 0 && z10) {
                        this.f26735g = Math.min(j10, c() - nanoTime) + nanoTime;
                    } else if (j10 != 0) {
                        this.f26735g = j10 + nanoTime;
                    } else if (z10) {
                        this.f26735g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j11 = this.f26735g - nanoTime;
                    c cVar2 = f26732j;
                    while (true) {
                        cVar = cVar2.f26734f;
                        if (cVar == null) {
                            break;
                        } else if (j11 < cVar.f26735g - nanoTime) {
                            break;
                        } else {
                            cVar2 = cVar;
                        }
                    }
                    this.f26734f = cVar;
                    cVar2.f26734f = this;
                    if (cVar2 == f26732j) {
                        cls.notify();
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final void j(boolean z10) throws IOException {
        if (k() && z10) {
            throw l((IOException) null);
        }
    }

    public final boolean k() {
        boolean z10 = false;
        if (!this.f26733e) {
            return false;
        }
        this.f26733e = false;
        synchronized (c.class) {
            c cVar = f26732j;
            while (true) {
                if (cVar == null) {
                    z10 = true;
                    break;
                }
                c cVar2 = cVar.f26734f;
                if (cVar2 == this) {
                    cVar.f26734f = this.f26734f;
                    this.f26734f = null;
                    break;
                }
                cVar = cVar2;
            }
        }
        return z10;
    }

    public IOException l(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}
