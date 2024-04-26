package qe;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qe.p;
import v6.q;
import ve.h;

/* compiled from: Http2Connection */
public final class g implements Closeable {
    public static final ExecutorService G;
    public q A = new q(2, (q.e) null);
    public final q B;
    public final Socket C;
    public final r D;
    public final C0229g E;
    public final Set<Integer> F;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24330a;

    /* renamed from: b  reason: collision with root package name */
    public final e f24331b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, q> f24332c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final String f24333d;

    /* renamed from: e  reason: collision with root package name */
    public int f24334e;

    /* renamed from: f  reason: collision with root package name */
    public int f24335f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24336g;

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledExecutorService f24337h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecutorService f24338i;

    /* renamed from: r  reason: collision with root package name */
    public final t f24339r;

    /* renamed from: s  reason: collision with root package name */
    public long f24340s = 0;

    /* renamed from: t  reason: collision with root package name */
    public long f24341t = 0;

    /* renamed from: u  reason: collision with root package name */
    public long f24342u = 0;

    /* renamed from: v  reason: collision with root package name */
    public long f24343v = 0;

    /* renamed from: w  reason: collision with root package name */
    public long f24344w = 0;

    /* renamed from: x  reason: collision with root package name */
    public long f24345x = 0;

    /* renamed from: y  reason: collision with root package name */
    public long f24346y = 0;

    /* renamed from: z  reason: collision with root package name */
    public long f24347z;

    /* compiled from: Http2Connection */
    public class a extends le.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f24348b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f24349c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, b bVar) {
            super(str, objArr);
            this.f24348b = i10;
            this.f24349c = bVar;
        }

        public void a() {
            try {
                g gVar = g.this;
                gVar.D.u(this.f24348b, this.f24349c);
            } catch (IOException unused) {
                g.a(g.this);
            }
        }
    }

    /* compiled from: Http2Connection */
    public class b extends le.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f24351b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f24352c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f24351b = i10;
            this.f24352c = j10;
        }

        public void a() {
            try {
                g.this.D.v(this.f24351b, this.f24352c);
            } catch (IOException unused) {
                g.a(g.this);
            }
        }
    }

    /* compiled from: Http2Connection */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Socket f24354a;

        /* renamed from: b  reason: collision with root package name */
        public String f24355b;

        /* renamed from: c  reason: collision with root package name */
        public h f24356c;

        /* renamed from: d  reason: collision with root package name */
        public ve.g f24357d;

        /* renamed from: e  reason: collision with root package name */
        public e f24358e = e.f24361a;

        /* renamed from: f  reason: collision with root package name */
        public int f24359f;

        public c(boolean z10) {
        }
    }

    /* compiled from: Http2Connection */
    public final class d extends le.b {
        public d() {
            super("OkHttp %s ping", g.this.f24333d);
        }

        public void a() {
            g gVar;
            boolean z10;
            synchronized (g.this) {
                gVar = g.this;
                long j10 = gVar.f24341t;
                long j11 = gVar.f24340s;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    gVar.f24340s = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                g.a(gVar);
            } else {
                gVar.J(false, 1, 0);
            }
        }
    }

    /* compiled from: Http2Connection */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f24361a = new a();

        /* compiled from: Http2Connection */
        public class a extends e {
            public void b(q qVar) throws IOException {
                qVar.c(b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void b(q qVar) throws IOException;
    }

    /* compiled from: Http2Connection */
    public final class f extends le.b {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24362b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24363c;

        /* renamed from: d  reason: collision with root package name */
        public final int f24364d;

        public f(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f24333d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f24362b = z10;
            this.f24363c = i10;
            this.f24364d = i11;
        }

        public void a() {
            g.this.J(this.f24362b, this.f24363c, this.f24364d);
        }
    }

    /* renamed from: qe.g$g  reason: collision with other inner class name */
    /* compiled from: Http2Connection */
    public class C0229g extends le.b implements p.b {

        /* renamed from: b  reason: collision with root package name */
        public final p f24366b;

        public C0229g(p pVar) {
            super("OkHttp %s", g.this.f24333d);
            this.f24366b = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = qe.b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4.f24367c.d(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r4 = this;
                qe.b r0 = qe.b.INTERNAL_ERROR
                qe.p r1 = r4.f24366b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r1.i(r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            L_0x0007:
                qe.p r1 = r4.f24366b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r2 = 0
                boolean r1 = r1.d(r2, r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                qe.b r1 = qe.b.NO_ERROR     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                qe.b r0 = qe.b.CANCEL     // Catch:{ IOException -> 0x001f }
                qe.g r2 = qe.g.this     // Catch:{ IOException -> 0x0026 }
                r2.d(r1, r0)     // Catch:{ IOException -> 0x0026 }
                goto L_0x0026
            L_0x001b:
                r2 = move-exception
                r1 = r0
                goto L_0x002d
            L_0x001e:
                r1 = r0
            L_0x001f:
                qe.b r0 = qe.b.PROTOCOL_ERROR     // Catch:{ all -> 0x002c }
                qe.g r1 = qe.g.this     // Catch:{ IOException -> 0x0026 }
                r1.d(r0, r0)     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                qe.p r0 = r4.f24366b
                le.c.e(r0)
                return
            L_0x002c:
                r2 = move-exception
            L_0x002d:
                qe.g r3 = qe.g.this     // Catch:{ IOException -> 0x0032 }
                r3.d(r1, r0)     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                qe.p r0 = r4.f24366b
                le.c.e(r0)
                goto L_0x0039
            L_0x0038:
                throw r2
            L_0x0039:
                goto L_0x0038
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.g.C0229g.a():void");
        }
    }

    static {
        Class<g> cls = g.class;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = le.c.f21261a;
        G = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new le.d("OkHttp Http2Connection", true));
    }

    public g(c cVar) {
        c cVar2 = cVar;
        q qVar = new q(2, (q.e) null);
        this.B = qVar;
        this.F = new LinkedHashSet();
        this.f24339r = t.f24434a;
        this.f24330a = true;
        this.f24331b = cVar2.f24358e;
        this.f24335f = 1;
        this.f24335f = 3;
        this.A.e(7, 16777216);
        String str = cVar2.f24355b;
        this.f24333d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new le.d(le.c.m("OkHttp %s Writer", str), false));
        this.f24337h = scheduledThreadPoolExecutor;
        if (cVar2.f24359f != 0) {
            d dVar = new d();
            long j10 = (long) cVar2.f24359f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f24338i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new le.d(le.c.m("OkHttp %s Push Observer", str), true));
        qVar.e(7, 65535);
        qVar.e(5, 16384);
        this.f24347z = (long) qVar.d();
        this.C = cVar2.f24354a;
        this.D = new r(cVar2.f24357d, true);
        this.E = new C0229g(new p(cVar2.f24356c, true));
    }

    public static void a(g gVar) {
        gVar.getClass();
        try {
            b bVar = b.PROTOCOL_ERROR;
            gVar.d(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public synchronized void G(long j10) {
        long j11 = this.f24346y + j10;
        this.f24346y = j11;
        if (j11 >= ((long) (this.A.d() / 2))) {
            N(0, this.f24346y);
            this.f24346y = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.D.f24424d);
        r6 = (long) r3;
        r8.f24347z -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(int r9, boolean r10, ve.f r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            qe.r r12 = r8.D
            r12.d(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0065
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f24347z     // Catch:{ InterruptedException -> 0x0056 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, qe.q> r3 = r8.f24332c     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0054 }
            int r4 = (int) r3     // Catch:{ all -> 0x0054 }
            qe.r r3 = r8.D     // Catch:{ all -> 0x0054 }
            int r3 = r3.f24424d     // Catch:{ all -> 0x0054 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0054 }
            long r4 = r8.f24347z     // Catch:{ all -> 0x0054 }
            long r6 = (long) r3     // Catch:{ all -> 0x0054 }
            long r4 = r4 - r6
            r8.f24347z = r4     // Catch:{ all -> 0x0054 }
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            long r12 = r12 - r6
            qe.r r4 = r8.D
            if (r10 == 0) goto L_0x004f
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            r4.d(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0054:
            r9 = move-exception
            goto L_0x0063
        L_0x0056:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            r9.interrupt()     // Catch:{ all -> 0x0054 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0054 }
            r9.<init>()     // Catch:{ all -> 0x0054 }
            throw r9     // Catch:{ all -> 0x0054 }
        L_0x0063:
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            throw r9
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.g.H(int, boolean, ve.f, long):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|1|2|3|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J(boolean r2, int r3, int r4) {
        /*
            r1 = this;
            qe.r r0 = r1.D     // Catch:{ IOException -> 0x0006 }
            r0.t(r2, r3, r4)     // Catch:{ IOException -> 0x0006 }
            goto L_0x000b
        L_0x0006:
            qe.b r2 = qe.b.PROTOCOL_ERROR     // Catch:{ IOException -> 0x000b }
            r1.d(r2, r2)     // Catch:{ IOException -> 0x000b }
        L_0x000b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.g.J(boolean, int, int):void");
    }

    public void M(int i10, b bVar) {
        try {
            this.f24337h.execute(new a("OkHttp %s stream %d", new Object[]{this.f24333d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void N(int i10, long j10) {
        try {
            this.f24337h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f24333d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void close() throws IOException {
        d(b.NO_ERROR, b.CANCEL);
    }

    public void d(b bVar, b bVar2) throws IOException {
        q[] qVarArr = null;
        try {
            v(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            if (!this.f24332c.isEmpty()) {
                qVarArr = (q[]) this.f24332c.values().toArray(new q[this.f24332c.size()]);
                this.f24332c.clear();
            }
        }
        if (qVarArr != null) {
            for (q c10 : qVarArr) {
                try {
                    c10.c(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.D.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.C.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f24337h.shutdown();
        this.f24338i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void flush() throws IOException {
        this.D.flush();
    }

    public synchronized q i(int i10) {
        return this.f24332c.get(Integer.valueOf(i10));
    }

    public synchronized int o() {
        int i10;
        q qVar = this.B;
        i10 = Integer.MAX_VALUE;
        if ((qVar.f26491b & 16) != 0) {
            i10 = ((int[]) qVar.f26492c)[4];
        }
        return i10;
    }

    public final synchronized void s(le.b bVar) {
        if (!this.f24336g) {
            this.f24338i.execute(bVar);
        }
    }

    public boolean t(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public synchronized q u(int i10) {
        q remove;
        remove = this.f24332c.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public void v(b bVar) throws IOException {
        synchronized (this.D) {
            synchronized (this) {
                if (!this.f24336g) {
                    this.f24336g = true;
                    int i10 = this.f24334e;
                    this.D.o(i10, bVar, le.c.f21261a);
                }
            }
        }
    }
}
