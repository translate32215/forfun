package ne;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import ke.a;
import ke.c0;
import ke.d;
import ke.d0;
import ke.f0;
import ke.h;
import ke.n;
import ke.q;
import ke.r;
import ke.t;
import ke.w;
import ke.x;
import ke.z;
import oe.e;
import pe.a;
import qe.b;
import qe.g;
import re.f;
import ve.p;
import ve.s;
import ve.t;
import ve.y;

/* compiled from: RealConnection */
public final class c extends g.e {

    /* renamed from: b  reason: collision with root package name */
    public final h f22494b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f22495c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f22496d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f22497e;

    /* renamed from: f  reason: collision with root package name */
    public q f22498f;

    /* renamed from: g  reason: collision with root package name */
    public x f22499g;

    /* renamed from: h  reason: collision with root package name */
    public g f22500h;

    /* renamed from: i  reason: collision with root package name */
    public ve.h f22501i;

    /* renamed from: j  reason: collision with root package name */
    public ve.g f22502j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f22503k;

    /* renamed from: l  reason: collision with root package name */
    public int f22504l;

    /* renamed from: m  reason: collision with root package name */
    public int f22505m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final List<Reference<f>> f22506n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public long f22507o = Long.MAX_VALUE;

    public c(h hVar, f0 f0Var) {
        this.f22494b = hVar;
        this.f22495c = f0Var;
    }

    public void a(g gVar) {
        synchronized (this.f22494b) {
            this.f22505m = gVar.o();
        }
    }

    public void b(qe.q qVar) throws IOException {
        qVar.c(b.REFUSED_STREAM);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0141, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0141, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0141, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0145 A[EDGE_INSN: B:86:0x0145->B:79:0x0145 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r16, int r17, int r18, int r19, boolean r20, ke.d r21, ke.n r22) {
        /*
            r15 = this;
            r7 = r15
            r8 = r21
            r9 = r22
            ke.x r0 = r7.f22499g
            if (r0 != 0) goto L_0x0153
            ke.f0 r0 = r7.f22495c
            ke.a r0 = r0.f20700a
            java.util.List<ke.i> r1 = r0.f20635f
            ne.b r10 = new ne.b
            r10.<init>(r1)
            javax.net.ssl.SSLSocketFactory r2 = r0.f20638i
            if (r2 != 0) goto L_0x0051
            ke.i r0 = ke.i.f20740f
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0044
            ke.f0 r0 = r7.f22495c
            ke.a r0 = r0.f20700a
            ke.s r0 = r0.f20630a
            java.lang.String r0 = r0.f20785d
            re.f r1 = re.f.f24794a
            boolean r1 = r1.k(r0)
            if (r1 == 0) goto L_0x0031
            goto L_0x005b
        L_0x0031:
            ne.d r1 = new ne.d
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = q.b.a(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0044:
            ne.d r0 = new ne.d
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0051:
            java.util.List<ke.x> r0 = r0.f20634e
            ke.x r1 = ke.x.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0146
        L_0x005b:
            r11 = 0
            r12 = r11
        L_0x005d:
            ke.f0 r0 = r7.f22495c     // Catch:{ IOException -> 0x00cb }
            boolean r0 = r0.a()     // Catch:{ IOException -> 0x00cb }
            if (r0 == 0) goto L_0x007d
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r1.e(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00cb }
            java.net.Socket r0 = r7.f22496d     // Catch:{ IOException -> 0x00cb }
            if (r0 != 0) goto L_0x0078
            goto L_0x0096
        L_0x0078:
            r1 = r16
            r2 = r17
            goto L_0x0084
        L_0x007d:
            r1 = r16
            r2 = r17
            r15.d(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00c7 }
        L_0x0084:
            r3 = r19
            r15.f(r10, r3, r8, r9)     // Catch:{ IOException -> 0x00c5 }
            ke.f0 r0 = r7.f22495c     // Catch:{ IOException -> 0x00c5 }
            r0.getClass()     // Catch:{ IOException -> 0x00c5 }
            ke.f0 r0 = r7.f22495c     // Catch:{ IOException -> 0x00c5 }
            r0.getClass()     // Catch:{ IOException -> 0x00c5 }
            r22.getClass()     // Catch:{ IOException -> 0x00c5 }
        L_0x0096:
            ke.f0 r0 = r7.f22495c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00b0
            java.net.Socket r0 = r7.f22496d
            if (r0 == 0) goto L_0x00a3
            goto L_0x00b0
        L_0x00a3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            ne.d r1 = new ne.d
            r1.<init>(r0)
            throw r1
        L_0x00b0:
            qe.g r0 = r7.f22500h
            if (r0 == 0) goto L_0x00c4
            ke.h r1 = r7.f22494b
            monitor-enter(r1)
            qe.g r0 = r7.f22500h     // Catch:{ all -> 0x00c1 }
            int r0 = r0.o()     // Catch:{ all -> 0x00c1 }
            r7.f22505m = r0     // Catch:{ all -> 0x00c1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c4
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c1 }
            throw r0
        L_0x00c4:
            return
        L_0x00c5:
            r0 = move-exception
            goto L_0x00d1
        L_0x00c7:
            r0 = move-exception
        L_0x00c8:
            r3 = r19
            goto L_0x00d1
        L_0x00cb:
            r0 = move-exception
            r1 = r16
            r2 = r17
            goto L_0x00c8
        L_0x00d1:
            java.net.Socket r4 = r7.f22497e
            le.c.f(r4)
            java.net.Socket r4 = r7.f22496d
            le.c.f(r4)
            r7.f22497e = r11
            r7.f22496d = r11
            r7.f22501i = r11
            r7.f22502j = r11
            r7.f22498f = r11
            r7.f22499g = r11
            r7.f22500h = r11
            ke.f0 r4 = r7.f22495c
            r4.getClass()
            ke.f0 r4 = r7.f22495c
            r4.getClass()
            r22.getClass()
            r4 = 1
            r5 = 0
            if (r12 != 0) goto L_0x0100
            ne.d r12 = new ne.d
            r12.<init>(r0)
            goto L_0x010f
        L_0x0100:
            java.io.IOException r6 = r12.f22508a
            java.lang.reflect.Method r13 = le.c.f21276p
            if (r13 == 0) goto L_0x010d
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x010d }
            r14[r5] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x010d }
            r13.invoke(r6, r14)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x010d }
        L_0x010d:
            r12.f22509b = r0
        L_0x010f:
            if (r20 == 0) goto L_0x0145
            r10.f22493d = r4
            boolean r6 = r10.f22492c
            if (r6 != 0) goto L_0x0118
            goto L_0x0141
        L_0x0118:
            boolean r6 = r0 instanceof java.net.ProtocolException
            if (r6 == 0) goto L_0x011d
            goto L_0x0141
        L_0x011d:
            boolean r6 = r0 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L_0x0122
            goto L_0x0141
        L_0x0122:
            boolean r6 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L_0x012f
            java.lang.Throwable r13 = r0.getCause()
            boolean r13 = r13 instanceof java.security.cert.CertificateException
            if (r13 == 0) goto L_0x012f
            goto L_0x0141
        L_0x012f:
            boolean r13 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r13 == 0) goto L_0x0134
            goto L_0x0141
        L_0x0134:
            if (r6 != 0) goto L_0x0140
            boolean r5 = r0 instanceof javax.net.ssl.SSLProtocolException
            if (r5 != 0) goto L_0x0140
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r4 = 0
        L_0x0140:
            r5 = r4
        L_0x0141:
            if (r5 == 0) goto L_0x0145
            goto L_0x005d
        L_0x0145:
            throw r12
        L_0x0146:
            ne.d r0 = new ne.d
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0153:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x015c
        L_0x015b:
            throw r0
        L_0x015c:
            goto L_0x015b
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.c.c(int, int, int, int, boolean, ke.d, ke.n):void");
    }

    public final void d(int i10, int i11, d dVar, n nVar) throws IOException {
        Socket socket;
        f0 f0Var = this.f22495c;
        Proxy proxy = f0Var.f20701b;
        a aVar = f0Var.f20700a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = aVar.f20632c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f22496d = socket;
        this.f22495c.getClass();
        nVar.getClass();
        this.f22496d.setSoTimeout(i11);
        try {
            f.f24794a.g(this.f22496d, this.f22495c.f20702c, i10);
            try {
                this.f22501i = new t(p.e(this.f22496d));
                this.f22502j = new s(p.b(this.f22496d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder a10 = android.support.v4.media.a.a("Failed to connect to ");
            a10.append(this.f22495c.f20702c);
            ConnectException connectException = new ConnectException(a10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void e(int i10, int i11, int i12, d dVar, n nVar) throws IOException {
        z.a aVar = new z.a();
        aVar.e(this.f22495c.f20700a.f20630a);
        aVar.c("CONNECT", (c0) null);
        aVar.b("Host", le.c.n(this.f22495c.f20700a.f20630a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/3.12.8");
        z a10 = aVar.a();
        d0.a aVar2 = new d0.a();
        aVar2.f20677a = a10;
        aVar2.f20678b = x.HTTP_1_1;
        aVar2.f20679c = 407;
        aVar2.f20680d = "Preemptive Authenticate";
        aVar2.f20683g = le.c.f21263c;
        aVar2.f20687k = -1;
        aVar2.f20688l = -1;
        r.a aVar3 = aVar2.f20682f;
        aVar3.getClass();
        r.a("Proxy-Authenticate");
        r.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.c("Proxy-Authenticate");
        aVar3.f20780a.add("Proxy-Authenticate");
        aVar3.f20780a.add("OkHttp-Preemptive");
        aVar2.a();
        this.f22495c.f20700a.f20633d.getClass();
        ke.s sVar = a10.f20880a;
        int i13 = i10;
        d(i10, i11, dVar, nVar);
        ve.h hVar = this.f22501i;
        ve.g gVar = this.f22502j;
        pe.a aVar4 = new pe.a((w) null, (f) null, hVar, gVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.e().g((long) i11, timeUnit);
        this.f22502j.e().g((long) i12, timeUnit);
        aVar4.k(a10.f20882c, "CONNECT " + le.c.n(sVar, true) + " HTTP/1.1");
        gVar.flush();
        d0.a f10 = aVar4.f(false);
        f10.f20677a = a10;
        d0 a11 = f10.a();
        long a12 = e.a(a11);
        if (a12 == -1) {
            a12 = 0;
        }
        y h10 = aVar4.h(a12);
        le.c.u(h10, Integer.MAX_VALUE, timeUnit);
        ((a.f) h10).close();
        int i14 = a11.f20666c;
        if (i14 != 200) {
            if (i14 == 407) {
                this.f22495c.f20700a.f20633d.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder a13 = android.support.v4.media.a.a("Unexpected response code for CONNECT: ");
            a13.append(a11.f20666c);
            throw new IOException(a13.toString());
        } else if (!this.f22501i.c().B() || !this.f22502j.c().B()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012e A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134 A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(ne.b r7, int r8, ke.d r9, ke.n r10) throws java.io.IOException {
        /*
            r6 = this;
            ke.x r9 = ke.x.HTTP_1_1
            ke.f0 r0 = r6.f22495c
            ke.a r0 = r0.f20700a
            javax.net.ssl.SSLSocketFactory r1 = r0.f20638i
            if (r1 != 0) goto L_0x0025
            java.util.List<ke.x> r7 = r0.f20634e
            ke.x r10 = ke.x.H2_PRIOR_KNOWLEDGE
            boolean r7 = r7.contains(r10)
            if (r7 == 0) goto L_0x001e
            java.net.Socket r7 = r6.f22496d
            r6.f22497e = r7
            r6.f22499g = r10
            r6.j(r8)
            return
        L_0x001e:
            java.net.Socket r7 = r6.f22496d
            r6.f22497e = r7
            r6.f22499g = r9
            return
        L_0x0025:
            r10.getClass()
            ke.f0 r10 = r6.f22495c
            ke.a r10 = r10.f20700a
            javax.net.ssl.SSLSocketFactory r0 = r10.f20638i
            r1 = 0
            java.net.Socket r2 = r6.f22496d     // Catch:{ AssertionError -> 0x0127 }
            ke.s r3 = r10.f20630a     // Catch:{ AssertionError -> 0x0127 }
            java.lang.String r4 = r3.f20785d     // Catch:{ AssertionError -> 0x0127 }
            int r3 = r3.f20786e     // Catch:{ AssertionError -> 0x0127 }
            r5 = 1
            java.net.Socket r0 = r0.createSocket(r2, r4, r3, r5)     // Catch:{ AssertionError -> 0x0127 }
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch:{ AssertionError -> 0x0127 }
            ke.i r7 = r7.a(r0)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r2 = r7.f20742b     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r2 == 0) goto L_0x0051
            re.f r2 = re.f.f24794a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ke.s r3 = r10.f20630a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r3 = r3.f20785d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.util.List<ke.x> r4 = r10.f20634e     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r2.f(r0, r3, r4)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x0051:
            r0.startHandshake()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            javax.net.ssl.SSLSession r2 = r0.getSession()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ke.q r3 = ke.q.a(r2)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            javax.net.ssl.HostnameVerifier r4 = r10.f20639j     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ke.s r5 = r10.f20630a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r5 = r5.f20785d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r2 = r4.verify(r5, r2)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r2 != 0) goto L_0x00d8
            java.util.List<java.security.cert.Certificate> r7 = r3.f20777c     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r8 = r7.isEmpty()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = "Hostname "
            if (r8 != 0) goto L_0x00ba
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.<init>()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ke.s r9 = r10.f20630a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = r9.f20785d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = " not verified:\n    certificate: "
            r1.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = ke.f.b(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = "\n    DN: "
            r1.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.security.Principal r9 = r7.getSubjectDN()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = r9.getName()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = "\n    subjectAltNames: "
            r1.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.util.List r7 = te.d.a(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r7 = r1.toString()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r8.<init>(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            throw r8     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x00ba:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r8.<init>()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r8.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ke.s r9 = r10.f20630a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = r9.f20785d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r8.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r9 = " not verified (no certificates)"
            r8.append(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = r8.toString()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r7.<init>(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            throw r7     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x00d8:
            ke.f r2 = r10.f20640k     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ke.s r10 = r10.f20630a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r10 = r10.f20785d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.util.List<java.security.cert.Certificate> r4 = r3.f20777c     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r2.a(r10, r4)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r7 = r7.f20742b     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r7 == 0) goto L_0x00ed
            re.f r7 = re.f.f24794a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r1 = r7.i(r0)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x00ed:
            r6.f22497e = r0     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ve.y r7 = ve.p.e(r0)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ve.t r10 = new ve.t     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r10.<init>(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r6.f22501i = r10     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.net.Socket r7 = r6.f22497e     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ve.x r7 = ve.p.b(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            ve.s r10 = new ve.s     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r10.<init>(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r6.f22502j = r10     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r6.f22498f = r3     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r1 == 0) goto L_0x010f
            ke.x r9 = ke.x.a(r1)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x010f:
            r6.f22499g = r9     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            re.f r7 = re.f.f24794a
            r7.a(r0)
            ke.x r7 = r6.f22499g
            ke.x r9 = ke.x.HTTP_2
            if (r7 != r9) goto L_0x011f
            r6.j(r8)
        L_0x011f:
            return
        L_0x0120:
            r7 = move-exception
            goto L_0x0136
        L_0x0122:
            r7 = move-exception
            r1 = r0
            goto L_0x0128
        L_0x0125:
            r7 = move-exception
            goto L_0x0135
        L_0x0127:
            r7 = move-exception
        L_0x0128:
            boolean r8 = le.c.s(r7)     // Catch:{ all -> 0x0125 }
            if (r8 == 0) goto L_0x0134
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0125 }
            r8.<init>(r7)     // Catch:{ all -> 0x0125 }
            throw r8     // Catch:{ all -> 0x0125 }
        L_0x0134:
            throw r7     // Catch:{ all -> 0x0125 }
        L_0x0135:
            r0 = r1
        L_0x0136:
            if (r0 == 0) goto L_0x013d
            re.f r8 = re.f.f24794a
            r8.a(r0)
        L_0x013d:
            le.c.f(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.c.f(ne.b, int, ke.d, ke.n):void");
    }

    public boolean g(ke.a aVar, @Nullable f0 f0Var) {
        if (this.f22506n.size() < this.f22505m && !this.f22503k) {
            le.a aVar2 = le.a.f21259a;
            ke.a aVar3 = this.f22495c.f20700a;
            ((w.a) aVar2).getClass();
            if (!aVar3.a(aVar)) {
                return false;
            }
            if (aVar.f20630a.f20785d.equals(this.f22495c.f20700a.f20630a.f20785d)) {
                return true;
            }
            if (this.f22500h == null || f0Var == null || f0Var.f20701b.type() != Proxy.Type.DIRECT || this.f22495c.f20701b.type() != Proxy.Type.DIRECT || !this.f22495c.f20702c.equals(f0Var.f20702c) || f0Var.f20700a.f20639j != te.d.f25910a || !k(aVar.f20630a)) {
                return false;
            }
            try {
                aVar.f20640k.a(aVar.f20630a.f20785d, this.f22498f.f20777c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public boolean h() {
        return this.f22500h != null;
    }

    public oe.c i(w wVar, t.a aVar, f fVar) throws SocketException {
        if (this.f22500h != null) {
            return new qe.f(wVar, aVar, fVar, this.f22500h);
        }
        oe.f fVar2 = (oe.f) aVar;
        this.f22497e.setSoTimeout(fVar2.f23708j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f22501i.e().g((long) fVar2.f23708j, timeUnit);
        this.f22502j.e().g((long) fVar2.f23709k, timeUnit);
        return new pe.a(wVar, fVar, this.f22501i, this.f22502j);
    }

    public final void j(int i10) throws IOException {
        this.f22497e.setSoTimeout(0);
        g.c cVar = new g.c(true);
        Socket socket = this.f22497e;
        String str = this.f22495c.f20700a.f20630a.f20785d;
        ve.h hVar = this.f22501i;
        ve.g gVar = this.f22502j;
        cVar.f24354a = socket;
        cVar.f24355b = str;
        cVar.f24356c = hVar;
        cVar.f24357d = gVar;
        cVar.f24358e = this;
        cVar.f24359f = i10;
        g gVar2 = new g(cVar);
        this.f22500h = gVar2;
        qe.r rVar = gVar2.D;
        synchronized (rVar) {
            if (rVar.f24425e) {
                throw new IOException("closed");
            } else if (rVar.f24422b) {
                Logger logger = qe.r.f24420g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(le.c.m(">> CONNECTION %s", qe.e.f24316a.o()));
                }
                rVar.f24421a.F((byte[]) qe.e.f24316a.f26744a.clone());
                rVar.f24421a.flush();
            }
        }
        qe.r rVar2 = gVar2.D;
        v6.q qVar = gVar2.A;
        synchronized (rVar2) {
            if (!rVar2.f24425e) {
                rVar2.i(0, qVar.f() * 6, (byte) 4, (byte) 0);
                int i11 = 0;
                while (i11 < 10) {
                    if (((1 << i11) & qVar.f26491b) != 0) {
                        rVar2.f24421a.n(i11 == 4 ? 3 : i11 == 7 ? 4 : i11);
                        rVar2.f24421a.r(((int[]) qVar.f26492c)[i11]);
                    }
                    i11++;
                }
                rVar2.f24421a.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int d10 = gVar2.A.d();
        if (d10 != 65535) {
            gVar2.D.v(0, (long) (d10 - 65535));
        }
        new Thread(gVar2.E).start();
    }

    public boolean k(ke.s sVar) {
        int i10 = sVar.f20786e;
        ke.s sVar2 = this.f22495c.f20700a.f20630a;
        if (i10 != sVar2.f20786e) {
            return false;
        }
        if (sVar.f20785d.equals(sVar2.f20785d)) {
            return true;
        }
        q qVar = this.f22498f;
        if (qVar == null || !te.d.f25910a.c(sVar.f20785d, (X509Certificate) qVar.f20777c.get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Connection{");
        a10.append(this.f22495c.f20700a.f20630a.f20785d);
        a10.append(":");
        a10.append(this.f22495c.f20700a.f20630a.f20786e);
        a10.append(", proxy=");
        a10.append(this.f22495c.f20701b);
        a10.append(" hostAddress=");
        a10.append(this.f22495c.f20702c);
        a10.append(" cipherSuite=");
        q qVar = this.f22498f;
        a10.append(qVar != null ? qVar.f20776b : "none");
        a10.append(" protocol=");
        a10.append(this.f22499g);
        a10.append('}');
        return a10.toString();
    }
}
