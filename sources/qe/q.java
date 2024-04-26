package qe;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
import ke.r;
import t3.a0;
import ve.f;
import ve.x;
import ve.y;
import ve.z;

/* compiled from: Http2Stream */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public long f24398a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f24399b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24400c;

    /* renamed from: d  reason: collision with root package name */
    public final g f24401d;

    /* renamed from: e  reason: collision with root package name */
    public final Deque<r> f24402e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24403f;

    /* renamed from: g  reason: collision with root package name */
    public final b f24404g;

    /* renamed from: h  reason: collision with root package name */
    public final a f24405h;

    /* renamed from: i  reason: collision with root package name */
    public final c f24406i;

    /* renamed from: j  reason: collision with root package name */
    public final c f24407j;

    /* renamed from: k  reason: collision with root package name */
    public b f24408k;

    /* compiled from: Http2Stream */
    public final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final f f24409a = new f();

        /* renamed from: b  reason: collision with root package name */
        public boolean f24410b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f24411c;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f24407j.n();
            r11.f24412d.b();
            r9 = java.lang.Math.min(r11.f24412d.f24399b, r11.f24409a.f26740b);
            r1 = r11.f24412d;
            r1.f24399b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                qe.q r0 = qe.q.this
                monitor-enter(r0)
                qe.q r1 = qe.q.this     // Catch:{ all -> 0x007b }
                qe.q$c r1 = r1.f24407j     // Catch:{ all -> 0x007b }
                r1.i()     // Catch:{ all -> 0x007b }
            L_0x000a:
                qe.q r1 = qe.q.this     // Catch:{ all -> 0x0072 }
                long r2 = r1.f24399b     // Catch:{ all -> 0x0072 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f24411c     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f24410b     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                qe.b r2 = r1.f24408k     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                r1.j()     // Catch:{ all -> 0x0072 }
                goto L_0x000a
            L_0x0024:
                qe.q$c r1 = r1.f24407j     // Catch:{ all -> 0x007b }
                r1.n()     // Catch:{ all -> 0x007b }
                qe.q r1 = qe.q.this     // Catch:{ all -> 0x007b }
                r1.b()     // Catch:{ all -> 0x007b }
                qe.q r1 = qe.q.this     // Catch:{ all -> 0x007b }
                long r1 = r1.f24399b     // Catch:{ all -> 0x007b }
                ve.f r3 = r11.f24409a     // Catch:{ all -> 0x007b }
                long r3 = r3.f26740b     // Catch:{ all -> 0x007b }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007b }
                qe.q r1 = qe.q.this     // Catch:{ all -> 0x007b }
                long r2 = r1.f24399b     // Catch:{ all -> 0x007b }
                long r2 = r2 - r9
                r1.f24399b = r2     // Catch:{ all -> 0x007b }
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                qe.q$c r0 = r1.f24407j
                r0.i()
                qe.q r0 = qe.q.this     // Catch:{ all -> 0x0069 }
                qe.g r5 = r0.f24401d     // Catch:{ all -> 0x0069 }
                int r6 = r0.f24400c     // Catch:{ all -> 0x0069 }
                if (r12 == 0) goto L_0x005a
                ve.f r12 = r11.f24409a     // Catch:{ all -> 0x0069 }
                long r0 = r12.f26740b     // Catch:{ all -> 0x0069 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005a
                r12 = 1
                r7 = 1
                goto L_0x005c
            L_0x005a:
                r12 = 0
                r7 = 0
            L_0x005c:
                ve.f r8 = r11.f24409a     // Catch:{ all -> 0x0069 }
                r5.H(r6, r7, r8, r9)     // Catch:{ all -> 0x0069 }
                qe.q r12 = qe.q.this
                qe.q$c r12 = r12.f24407j
                r12.n()
                return
            L_0x0069:
                r12 = move-exception
                qe.q r0 = qe.q.this
                qe.q$c r0 = r0.f24407j
                r0.n()
                throw r12
            L_0x0072:
                r12 = move-exception
                qe.q r1 = qe.q.this     // Catch:{ all -> 0x007b }
                qe.q$c r1 = r1.f24407j     // Catch:{ all -> 0x007b }
                r1.n()     // Catch:{ all -> 0x007b }
                throw r12     // Catch:{ all -> 0x007b }
            L_0x007b:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                goto L_0x007f
            L_0x007e:
                throw r12
            L_0x007f:
                goto L_0x007e
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.q.a.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r13.f24409a.f26740b <= 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            if (r13.f24409a.f26740b <= 0) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r0.f24401d.H(r0.f24400c, true, (ve.f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r1 = r13.f24412d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r13.f24410b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            r13.f24412d.f24401d.D.flush();
            r13.f24412d.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
            r0 = r13.f24412d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r0.f24405h.f24411c != false) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r13 = this;
                qe.q r0 = qe.q.this
                monitor-enter(r0)
                boolean r1 = r13.f24410b     // Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                qe.q r0 = qe.q.this
                qe.q$a r1 = r0.f24405h
                boolean r1 = r1.f24411c
                r2 = 1
                if (r1 != 0) goto L_0x0034
                ve.f r1 = r13.f24409a
                long r3 = r1.f26740b
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0029
            L_0x001d:
                ve.f r0 = r13.f24409a
                long r0 = r0.f26740b
                int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r3 <= 0) goto L_0x0034
                r13.a(r2)
                goto L_0x001d
            L_0x0029:
                qe.g r7 = r0.f24401d
                int r8 = r0.f24400c
                r9 = 1
                r10 = 0
                r11 = 0
                r7.H(r8, r9, r10, r11)
            L_0x0034:
                qe.q r1 = qe.q.this
                monitor-enter(r1)
                r13.f24410b = r2     // Catch:{ all -> 0x0049 }
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                qe.q r0 = qe.q.this
                qe.g r0 = r0.f24401d
                qe.r r0 = r0.D
                r0.flush()
                qe.q r0 = qe.q.this
                r0.a()
                return
            L_0x0049:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                throw r0
            L_0x004c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                goto L_0x0050
            L_0x004f:
                throw r1
            L_0x0050:
                goto L_0x004f
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.q.a.close():void");
        }

        public z e() {
            return q.this.f24407j;
        }

        public void flush() throws IOException {
            synchronized (q.this) {
                q.this.b();
            }
            while (this.f24409a.f26740b > 0) {
                a(false);
                q.this.f24401d.flush();
            }
        }

        public void m(f fVar, long j10) throws IOException {
            this.f24409a.m(fVar, j10);
            while (this.f24409a.f26740b >= 16384) {
                a(false);
            }
        }
    }

    /* compiled from: Http2Stream */
    public final class b implements y {

        /* renamed from: a  reason: collision with root package name */
        public final f f24413a = new f();

        /* renamed from: b  reason: collision with root package name */
        public final f f24414b = new f();

        /* renamed from: c  reason: collision with root package name */
        public final long f24415c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f24416d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f24417e;

        public b(long j10) {
            this.f24415c = j10;
        }

        public final void a(long j10) {
            q.this.f24401d.G(j10);
        }

        public long a0(f fVar, long j10) throws IOException {
            b bVar;
            long a02;
            if (j10 >= 0) {
                while (true) {
                    bVar = null;
                    synchronized (q.this) {
                        q.this.f24406i.i();
                        try {
                            q qVar = q.this;
                            b bVar2 = qVar.f24408k;
                            if (bVar2 != null) {
                                bVar = bVar2;
                            }
                            if (!this.f24416d) {
                                if (!qVar.f24402e.isEmpty()) {
                                    q.this.getClass();
                                }
                                f fVar2 = this.f24414b;
                                long j11 = fVar2.f26740b;
                                if (j11 > 0) {
                                    a02 = fVar2.a0(fVar, Math.min(j10, j11));
                                    q qVar2 = q.this;
                                    long j12 = qVar2.f24398a + a02;
                                    qVar2.f24398a = j12;
                                    if (bVar == null && j12 >= ((long) (qVar2.f24401d.A.d() / 2))) {
                                        q qVar3 = q.this;
                                        qVar3.f24401d.N(qVar3.f24400c, qVar3.f24398a);
                                        q.this.f24398a = 0;
                                    }
                                } else if (this.f24417e || bVar != null) {
                                    a02 = -1;
                                } else {
                                    q.this.j();
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            q.this.f24406i.n();
                        }
                    }
                }
                q.this.f24406i.n();
                if (a02 != -1) {
                    a(a02);
                    return a02;
                } else if (bVar == null) {
                    return -1;
                } else {
                    throw new u(bVar);
                }
            } else {
                throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
            }
        }

        public void close() throws IOException {
            long j10;
            synchronized (q.this) {
                this.f24416d = true;
                f fVar = this.f24414b;
                j10 = fVar.f26740b;
                fVar.a();
                if (!q.this.f24402e.isEmpty()) {
                    q.this.getClass();
                }
                q.this.notifyAll();
            }
            if (j10 > 0) {
                a(j10);
            }
            q.this.a();
        }

        public z e() {
            return q.this.f24406i;
        }
    }

    /* compiled from: Http2Stream */
    public class c extends ve.c {
        public c() {
        }

        public IOException l(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void m() {
            q.this.e(b.CANCEL);
            g gVar = q.this.f24401d;
            synchronized (gVar) {
                long j10 = gVar.f24343v;
                long j11 = gVar.f24342u;
                if (j10 >= j11) {
                    gVar.f24342u = j11 + 1;
                    gVar.f24345x = System.nanoTime() + 1000000000;
                    try {
                        gVar.f24337h.execute(new h(gVar, "OkHttp %s ping", gVar.f24333d));
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        public void n() throws IOException {
            if (k()) {
                throw l((IOException) null);
            }
        }
    }

    public q(int i10, g gVar, boolean z10, boolean z11, @Nullable r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f24402e = arrayDeque;
        this.f24406i = new c();
        this.f24407j = new c();
        this.f24408k = null;
        if (gVar != null) {
            this.f24400c = i10;
            this.f24401d = gVar;
            this.f24399b = (long) gVar.B.d();
            b bVar = new b((long) gVar.A.d());
            this.f24404g = bVar;
            a aVar = new a();
            this.f24405h = aVar;
            bVar.f24417e = z11;
            aVar.f24411c = z10;
            if (rVar != null) {
                arrayDeque.add(rVar);
            }
            if (g() && rVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!g() && rVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public void a() throws IOException {
        boolean z10;
        boolean h10;
        synchronized (this) {
            b bVar = this.f24404g;
            if (!bVar.f24417e && bVar.f24416d) {
                a aVar = this.f24405h;
                if (aVar.f24411c || aVar.f24410b) {
                    z10 = true;
                    h10 = h();
                }
            }
            z10 = false;
            h10 = h();
        }
        if (z10) {
            c(b.CANCEL);
        } else if (!h10) {
            this.f24401d.u(this.f24400c);
        }
    }

    public void b() throws IOException {
        a aVar = this.f24405h;
        if (aVar.f24410b) {
            throw new IOException("stream closed");
        } else if (aVar.f24411c) {
            throw new IOException("stream finished");
        } else if (this.f24408k != null) {
            throw new u(this.f24408k);
        }
    }

    public void c(b bVar) throws IOException {
        if (d(bVar)) {
            g gVar = this.f24401d;
            gVar.D.u(this.f24400c, bVar);
        }
    }

    public final boolean d(b bVar) {
        synchronized (this) {
            if (this.f24408k != null) {
                return false;
            }
            if (this.f24404g.f24417e && this.f24405h.f24411c) {
                return false;
            }
            this.f24408k = bVar;
            notifyAll();
            this.f24401d.u(this.f24400c);
            return true;
        }
    }

    public void e(b bVar) {
        if (d(bVar)) {
            this.f24401d.M(this.f24400c, bVar);
        }
    }

    public x f() {
        synchronized (this) {
            if (!this.f24403f) {
                if (!g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f24405h;
    }

    public boolean g() {
        if (this.f24401d.f24330a == ((this.f24400c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean h() {
        if (this.f24408k != null) {
            return false;
        }
        b bVar = this.f24404g;
        if (bVar.f24417e || bVar.f24416d) {
            a aVar = this.f24405h;
            if ((aVar.f24411c || aVar.f24410b) && this.f24403f) {
                return false;
            }
        }
        return true;
    }

    public void i() {
        boolean h10;
        synchronized (this) {
            this.f24404g.f24417e = true;
            h10 = h();
            notifyAll();
        }
        if (!h10) {
            this.f24401d.u(this.f24400c);
        }
    }

    public void j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
