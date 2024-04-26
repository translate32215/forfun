package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import v6.d0;
import v6.e0;
import v6.p;

/* compiled from: Loader */
public final class n implements o {

    /* renamed from: d  reason: collision with root package name */
    public static final c f5528d = c(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f5529e = new c(2, -9223372036854775807L, (a) null);

    /* renamed from: f  reason: collision with root package name */
    public static final c f5530f = new c(3, -9223372036854775807L, (a) null);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f5531a;

    /* renamed from: b  reason: collision with root package name */
    public d<? extends e> f5532b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f5533c;

    /* compiled from: Loader */
    public interface b<T extends e> {
        void k(T t10, long j10, long j11, boolean z10);

        c m(T t10, long j10, long j11, IOException iOException, int i10);

        void n(T t10, long j10, long j11);
    }

    /* compiled from: Loader */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5534a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5535b;

        public c(int i10, long j10, a aVar) {
            this.f5534a = i10;
            this.f5535b = j10;
        }

        public boolean a() {
            int i10 = this.f5534a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* compiled from: Loader */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f5536a;

        /* renamed from: b  reason: collision with root package name */
        public final T f5537b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5538c;

        /* renamed from: d  reason: collision with root package name */
        public b<T> f5539d;

        /* renamed from: e  reason: collision with root package name */
        public IOException f5540e;

        /* renamed from: f  reason: collision with root package name */
        public int f5541f;

        /* renamed from: g  reason: collision with root package name */
        public Thread f5542g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5543h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f5544i;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f5537b = t10;
            this.f5539d = bVar;
            this.f5536a = i10;
            this.f5538c = j10;
        }

        public void a(boolean z10) {
            this.f5544i = z10;
            this.f5540e = null;
            if (hasMessages(0)) {
                this.f5543h = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f5543h = true;
                    this.f5537b.b();
                    Thread thread = this.f5542g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                n.this.f5532b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.f5539d;
                bVar.getClass();
                bVar.k(this.f5537b, elapsedRealtime, elapsedRealtime - this.f5538c, true);
                this.f5539d = null;
            }
        }

        public void b(long j10) {
            v6.a.d(n.this.f5532b == null);
            n nVar = n.this;
            nVar.f5532b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
                return;
            }
            this.f5540e = null;
            nVar.f5531a.execute(this);
        }

        public void handleMessage(Message message) {
            if (!this.f5544i) {
                int i10 = message.what;
                if (i10 == 0) {
                    this.f5540e = null;
                    n nVar = n.this;
                    ExecutorService executorService = nVar.f5531a;
                    d<? extends e> dVar = nVar.f5532b;
                    dVar.getClass();
                    executorService.execute(dVar);
                } else if (i10 != 3) {
                    n.this.f5532b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = elapsedRealtime - this.f5538c;
                    b<T> bVar = this.f5539d;
                    bVar.getClass();
                    if (this.f5543h) {
                        bVar.k(this.f5537b, elapsedRealtime, j10, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 1) {
                        try {
                            bVar.n(this.f5537b, elapsedRealtime, j10);
                        } catch (RuntimeException e10) {
                            p.b("LoadTask", "Unexpected exception handling load completed", e10);
                            n.this.f5533c = new h(e10);
                        }
                    } else if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f5540e = iOException;
                        int i12 = this.f5541f + 1;
                        this.f5541f = i12;
                        c m10 = bVar.m(this.f5537b, elapsedRealtime, j10, iOException, i12);
                        int i13 = m10.f5534a;
                        if (i13 == 3) {
                            n.this.f5533c = this.f5540e;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f5541f = 1;
                            }
                            long j11 = m10.f5535b;
                            if (j11 == -9223372036854775807L) {
                                j11 = (long) c5.c.a(this.f5541f, -1, 1000, 5000);
                            }
                            b(j11);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f5543h;
                    this.f5542g = Thread.currentThread();
                }
                if (z10) {
                    androidx.appcompat.widget.p.a("load:" + this.f5537b.getClass().getSimpleName());
                    this.f5537b.a();
                    androidx.appcompat.widget.p.f();
                }
                synchronized (this) {
                    this.f5542g = null;
                    Thread.interrupted();
                }
                if (!this.f5544i) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.f5544i) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (Exception e11) {
                p.b("LoadTask", "Unexpected exception loading stream", e11);
                if (!this.f5544i) {
                    obtainMessage(2, new h(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                p.b("LoadTask", "OutOfMemory error loading stream", e12);
                if (!this.f5544i) {
                    obtainMessage(2, new h(e12)).sendToTarget();
                }
            } catch (Error e13) {
                p.b("LoadTask", "Unexpected error loading stream", e13);
                if (!this.f5544i) {
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th) {
                androidx.appcompat.widget.p.f();
                throw th;
            }
        }
    }

    /* compiled from: Loader */
    public interface e {
        void a() throws IOException;

        void b();
    }

    /* compiled from: Loader */
    public interface f {
        void h();
    }

    /* compiled from: Loader */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final f f5546a;

        public g(f fVar) {
            this.f5546a = fVar;
        }

        public void run() {
            this.f5546a.h();
        }
    }

    /* compiled from: Loader */
    public static final class h extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public h(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected "
                java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.n.h.<init>(java.lang.Throwable):void");
        }
    }

    public n(String str) {
        int i10 = e0.f26436a;
        this.f5531a = Executors.newSingleThreadExecutor(new d0(str));
    }

    public static c c(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10, (a) null);
    }

    public void a() {
        d<? extends e> dVar = this.f5532b;
        v6.a.f(dVar);
        dVar.a(false);
    }

    public void b() throws IOException {
        f(Integer.MIN_VALUE);
    }

    public boolean d() {
        return this.f5533c != null;
    }

    public boolean e() {
        return this.f5532b != null;
    }

    public void f(int i10) throws IOException {
        IOException iOException = this.f5533c;
        if (iOException == null) {
            d<? extends e> dVar = this.f5532b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f5536a;
                }
                IOException iOException2 = dVar.f5540e;
                if (iOException2 != null && dVar.f5541f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public void g(f fVar) {
        d<? extends e> dVar = this.f5532b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f5531a.execute(new g(fVar));
        }
        this.f5531a.shutdown();
    }

    public <T extends e> long h(T t10, b<T> bVar, int i10) {
        Looper myLooper = Looper.myLooper();
        v6.a.f(myLooper);
        this.f5533c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(myLooper, t10, bVar, i10, elapsedRealtime).b(0);
        return elapsedRealtime;
    }
}
