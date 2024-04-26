package qe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import ke.d0;
import ke.e0;
import ke.r;
import ke.t;
import ke.w;
import ke.x;
import ke.z;
import oe.c;
import oe.e;
import oe.g;
import oe.h;
import qe.q;
import ve.i;
import ve.k;
import ve.p;
import ve.y;

/* compiled from: Http2Codec */
public final class f implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f24320f = le.c.p("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f24321g = le.c.p("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final t.a f24322a;

    /* renamed from: b  reason: collision with root package name */
    public final ne.f f24323b;

    /* renamed from: c  reason: collision with root package name */
    public final g f24324c;

    /* renamed from: d  reason: collision with root package name */
    public q f24325d;

    /* renamed from: e  reason: collision with root package name */
    public final x f24326e;

    /* compiled from: Http2Codec */
    public class a extends k {

        /* renamed from: b  reason: collision with root package name */
        public boolean f24327b = false;

        /* renamed from: c  reason: collision with root package name */
        public long f24328c = 0;

        public a(y yVar) {
            super(yVar);
        }

        public final void a(IOException iOException) {
            if (!this.f24327b) {
                this.f24327b = true;
                f fVar = f.this;
                fVar.f24323b.i(false, fVar, this.f24328c, iOException);
            }
        }

        public long a0(ve.f fVar, long j10) throws IOException {
            try {
                long a02 = this.f26748a.a0(fVar, j10);
                if (a02 > 0) {
                    this.f24328c += a02;
                }
                return a02;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        public void close() throws IOException {
            this.f26748a.close();
            a((IOException) null);
        }
    }

    public f(w wVar, t.a aVar, ne.f fVar, g gVar) {
        this.f24322a = aVar;
        this.f24323b = fVar;
        this.f24324c = gVar;
        List<x> list = wVar.f20820c;
        x xVar = x.H2_PRIOR_KNOWLEDGE;
        this.f24326e = !list.contains(xVar) ? x.HTTP_2 : xVar;
    }

    public ve.x a(z zVar, long j10) {
        return this.f24325d.f();
    }

    public void b() throws IOException {
        ((q.a) this.f24325d.f()).close();
    }

    public e0 c(d0 d0Var) throws IOException {
        this.f24323b.f22524f.getClass();
        String c10 = d0Var.f20669f.c("Content-Type");
        if (c10 == null) {
            c10 = null;
        }
        long a10 = e.a(d0Var);
        a aVar = new a(this.f24325d.f24404g);
        Logger logger = p.f26761a;
        return new g(c10, a10, new ve.t(aVar));
    }

    public void cancel() {
        q qVar = this.f24325d;
        if (qVar != null) {
            qVar.e(b.CANCEL);
        }
    }

    public void d() throws IOException {
        this.f24324c.D.flush();
    }

    public void e(z zVar) throws IOException {
        int i10;
        q qVar;
        if (this.f24325d == null) {
            boolean z10 = false;
            boolean z11 = zVar.f20883d != null;
            r rVar = zVar.f20882c;
            ArrayList arrayList = new ArrayList(rVar.g() + 4);
            arrayList.add(new c(c.f24291f, zVar.f20881b));
            arrayList.add(new c(c.f24292g, h.a(zVar.f20880a)));
            String c10 = zVar.f20882c.c("Host");
            if (c10 != null) {
                arrayList.add(new c(c.f24294i, c10));
            }
            arrayList.add(new c(c.f24293h, zVar.f20880a.f20782a));
            int g10 = rVar.g();
            for (int i11 = 0; i11 < g10; i11++) {
                i i12 = i.i(rVar.d(i11).toLowerCase(Locale.US));
                if (!f24320f.contains(i12.x())) {
                    arrayList.add(new c(i12, rVar.h(i11)));
                }
            }
            g gVar = this.f24324c;
            boolean z12 = !z11;
            synchronized (gVar.D) {
                synchronized (gVar) {
                    if (gVar.f24335f > 1073741823) {
                        gVar.v(b.REFUSED_STREAM);
                    }
                    if (!gVar.f24336g) {
                        i10 = gVar.f24335f;
                        gVar.f24335f = i10 + 2;
                        qVar = new q(i10, gVar, z12, false, (r) null);
                        if (!z11 || gVar.f24347z == 0 || qVar.f24399b == 0) {
                            z10 = true;
                        }
                        if (qVar.h()) {
                            gVar.f24332c.put(Integer.valueOf(i10), qVar);
                        }
                    } else {
                        throw new a();
                    }
                }
                r rVar2 = gVar.D;
                synchronized (rVar2) {
                    if (!rVar2.f24425e) {
                        rVar2.s(z12, i10, arrayList);
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
            if (z10) {
                gVar.D.flush();
            }
            this.f24325d = qVar;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qVar.f24406i.g((long) ((oe.f) this.f24322a).f23708j, timeUnit);
            this.f24325d.f24407j.g((long) ((oe.f) this.f24322a).f23709k, timeUnit);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        r0.f24406i.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ke.d0.a f(boolean r11) throws java.io.IOException {
        /*
            r10 = this;
            qe.q r0 = r10.f24325d
            monitor-enter(r0)
            qe.q$c r1 = r0.f24406i     // Catch:{ all -> 0x00d3 }
            r1.i()     // Catch:{ all -> 0x00d3 }
        L_0x0008:
            java.util.Deque<ke.r> r1 = r0.f24402e     // Catch:{ all -> 0x00cc }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0018
            qe.b r1 = r0.f24408k     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0018
            r0.j()     // Catch:{ all -> 0x00cc }
            goto L_0x0008
        L_0x0018:
            qe.q$c r1 = r0.f24406i     // Catch:{ all -> 0x00d3 }
            r1.n()     // Catch:{ all -> 0x00d3 }
            java.util.Deque<ke.r> r1 = r0.f24402e     // Catch:{ all -> 0x00d3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00c4
            java.util.Deque<ke.r> r1 = r0.f24402e     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00d3 }
            ke.r r1 = (ke.r) r1     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            ke.x r0 = r10.f24326e
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            r3 = 0
            int r4 = r1.g()
            r5 = 0
            r6 = r5
        L_0x003e:
            if (r3 >= r4) goto L_0x0082
            java.lang.String r7 = r1.d(r3)
            java.lang.String r8 = r1.h(r3)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0066
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTP/1.1 "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            oe.j r6 = oe.j.a(r6)
            goto L_0x007f
        L_0x0066:
            java.util.List<java.lang.String> r9 = f24321g
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x007f
            le.a r9 = le.a.f21259a
            ke.w$a r9 = (ke.w.a) r9
            r9.getClass()
            r2.add(r7)
            java.lang.String r7 = r8.trim()
            r2.add(r7)
        L_0x007f:
            int r3 = r3 + 1
            goto L_0x003e
        L_0x0082:
            if (r6 == 0) goto L_0x00bc
            ke.d0$a r1 = new ke.d0$a
            r1.<init>()
            r1.f20678b = r0
            int r0 = r6.f23719b
            r1.f20679c = r0
            java.lang.String r0 = r6.f23720c
            r1.f20680d = r0
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            ke.r$a r2 = new ke.r$a
            r2.<init>()
            java.util.List<java.lang.String> r3 = r2.f20780a
            java.util.Collections.addAll(r3, r0)
            r1.f20682f = r2
            if (r11 == 0) goto L_0x00bb
            le.a r11 = le.a.f21259a
            ke.w$a r11 = (ke.w.a) r11
            r11.getClass()
            int r11 = r1.f20679c
            r0 = 100
            if (r11 != r0) goto L_0x00bb
            return r5
        L_0x00bb:
            return r1
        L_0x00bc:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00c4:
            qe.u r11 = new qe.u     // Catch:{ all -> 0x00d3 }
            qe.b r1 = r0.f24408k     // Catch:{ all -> 0x00d3 }
            r11.<init>(r1)     // Catch:{ all -> 0x00d3 }
            throw r11     // Catch:{ all -> 0x00d3 }
        L_0x00cc:
            r11 = move-exception
            qe.q$c r1 = r0.f24406i     // Catch:{ all -> 0x00d3 }
            r1.n()     // Catch:{ all -> 0x00d3 }
            throw r11     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r11 = move-exception
            monitor-exit(r0)
            goto L_0x00d7
        L_0x00d6:
            throw r11
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.f.f(boolean):ke.d0$a");
    }
}
