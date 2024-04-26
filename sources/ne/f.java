package ne;

import b2.t;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import ke.d;
import ke.f0;
import ke.h;
import ke.m;
import ke.n;
import ke.s;
import ke.w;
import ne.e;
import oe.c;

/* compiled from: StreamAllocation */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ke.a f22519a;

    /* renamed from: b  reason: collision with root package name */
    public e.a f22520b;

    /* renamed from: c  reason: collision with root package name */
    public f0 f22521c;

    /* renamed from: d  reason: collision with root package name */
    public final h f22522d;

    /* renamed from: e  reason: collision with root package name */
    public final d f22523e;

    /* renamed from: f  reason: collision with root package name */
    public final n f22524f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f22525g;

    /* renamed from: h  reason: collision with root package name */
    public final e f22526h;

    /* renamed from: i  reason: collision with root package name */
    public int f22527i;

    /* renamed from: j  reason: collision with root package name */
    public c f22528j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f22529k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22530l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22531m;

    /* renamed from: n  reason: collision with root package name */
    public c f22532n;

    /* compiled from: StreamAllocation */
    public static final class a extends WeakReference<f> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f22533a;

        public a(f fVar, Object obj) {
            super(fVar);
            this.f22533a = obj;
        }
    }

    public f(h hVar, ke.a aVar, d dVar, n nVar, Object obj) {
        this.f22522d = hVar;
        this.f22519a = aVar;
        this.f22523e = dVar;
        this.f22524f = nVar;
        ((w.a) le.a.f21259a).getClass();
        this.f22526h = new e(aVar, hVar.f20736e, dVar, nVar);
        this.f22525g = obj;
    }

    public void a(c cVar, boolean z10) {
        if (this.f22528j == null) {
            this.f22528j = cVar;
            this.f22529k = z10;
            cVar.f22506n.add(new a(this, this.f22525g));
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized c b() {
        return this.f22528j;
    }

    public final Socket c(boolean z10, boolean z11, boolean z12) {
        Socket socket;
        if (z12) {
            this.f22532n = null;
        }
        boolean z13 = true;
        if (z11) {
            this.f22530l = true;
        }
        c cVar = this.f22528j;
        if (cVar == null) {
            return null;
        }
        if (z10) {
            cVar.f22503k = true;
        }
        if (this.f22532n != null) {
            return null;
        }
        if (!this.f22530l && !cVar.f22503k) {
            return null;
        }
        int size = cVar.f22506n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f22506n.get(i10).get() == this) {
                cVar.f22506n.remove(i10);
                if (this.f22528j.f22506n.isEmpty()) {
                    this.f22528j.f22507o = System.nanoTime();
                    le.a aVar = le.a.f21259a;
                    h hVar = this.f22522d;
                    c cVar2 = this.f22528j;
                    ((w.a) aVar).getClass();
                    hVar.getClass();
                    if (cVar2.f22503k || hVar.f20732a == 0) {
                        hVar.f20735d.remove(cVar2);
                    } else {
                        hVar.notifyAll();
                        z13 = false;
                    }
                    if (z13) {
                        socket = this.f22528j.f22497e;
                        this.f22528j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f22528j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    public final c d(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        c cVar;
        f0 f0Var;
        Socket c10;
        c cVar2;
        boolean z11;
        boolean z12;
        Socket socket;
        e.a aVar;
        String str;
        int i14;
        boolean contains;
        synchronized (this.f22522d) {
            if (this.f22530l) {
                throw new IllegalStateException("released");
            } else if (this.f22532n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f22531m) {
                cVar = this.f22528j;
                f0Var = null;
                c10 = (cVar == null || !cVar.f22503k) ? null : c(false, false, true);
                c cVar3 = this.f22528j;
                if (cVar3 != null) {
                    cVar = null;
                } else {
                    cVar3 = null;
                }
                if (!this.f22529k) {
                    cVar = null;
                }
                if (cVar3 == null) {
                    le.a.f21259a.c(this.f22522d, this.f22519a, this, (f0) null);
                    cVar2 = this.f22528j;
                    if (cVar2 != null) {
                        z11 = true;
                    } else {
                        f0Var = this.f22521c;
                    }
                }
                cVar2 = cVar3;
                z11 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        le.c.f(c10);
        if (cVar != null) {
            this.f22524f.getClass();
        }
        if (z11) {
            this.f22524f.getClass();
        }
        if (cVar2 != null) {
            this.f22521c = this.f22528j.f22495c;
            return cVar2;
        }
        if (f0Var != null || ((aVar = this.f22520b) != null && aVar.a())) {
            z12 = false;
        } else {
            e eVar = this.f22526h;
            if (eVar.b()) {
                ArrayList arrayList = new ArrayList();
                while (eVar.c()) {
                    if (eVar.c()) {
                        List<Proxy> list = eVar.f22513d;
                        int i15 = eVar.f22514e;
                        eVar.f22514e = i15 + 1;
                        Proxy proxy = list.get(i15);
                        eVar.f22515f = new ArrayList();
                        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                            s sVar = eVar.f22510a.f20630a;
                            str = sVar.f20785d;
                            i14 = sVar.f20786e;
                        } else {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                } else {
                                    str = address2.getHostAddress();
                                }
                                i14 = inetSocketAddress.getPort();
                            } else {
                                StringBuilder a10 = android.support.v4.media.a.a("Proxy.address() is not an InetSocketAddress: ");
                                a10.append(address.getClass());
                                throw new IllegalArgumentException(a10.toString());
                            }
                        }
                        if (i14 >= 1 && i14 <= 65535) {
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                eVar.f22515f.add(InetSocketAddress.createUnresolved(str, i14));
                            } else {
                                eVar.f22512c.getClass();
                                ((m.a) eVar.f22510a.f20631b).getClass();
                                if (str != null) {
                                    try {
                                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                                        if (!asList.isEmpty()) {
                                            eVar.f22512c.getClass();
                                            int size = asList.size();
                                            for (int i16 = 0; i16 < size; i16++) {
                                                eVar.f22515f.add(new InetSocketAddress((InetAddress) asList.get(i16), i14));
                                            }
                                        } else {
                                            throw new UnknownHostException(eVar.f22510a.f20631b + " returned no addresses for " + str);
                                        }
                                    } catch (NullPointerException e10) {
                                        UnknownHostException unknownHostException = new UnknownHostException(j.f.a("Broken system behaviour for dns lookup of ", str));
                                        unknownHostException.initCause(e10);
                                        throw unknownHostException;
                                    }
                                } else {
                                    throw new UnknownHostException("hostname == null");
                                }
                            }
                            int size2 = eVar.f22515f.size();
                            for (int i17 = 0; i17 < size2; i17++) {
                                f0 f0Var2 = new f0(eVar.f22510a, proxy, eVar.f22515f.get(i17));
                                t tVar = eVar.f22511b;
                                synchronized (tVar) {
                                    contains = ((Set) tVar.f3445b).contains(f0Var2);
                                }
                                if (contains) {
                                    eVar.f22516g.add(f0Var2);
                                } else {
                                    arrayList.add(f0Var2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        } else {
                            throw new SocketException("No route to " + str + ":" + i14 + "; port is out of range");
                        }
                    } else {
                        StringBuilder a11 = android.support.v4.media.a.a("No route to ");
                        a11.append(eVar.f22510a.f20630a.f20785d);
                        a11.append("; exhausted proxy configurations: ");
                        a11.append(eVar.f22513d);
                        throw new SocketException(a11.toString());
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.addAll(eVar.f22516g);
                    eVar.f22516g.clear();
                }
                this.f22520b = new e.a(arrayList);
                z12 = true;
            } else {
                throw new NoSuchElementException();
            }
        }
        synchronized (this.f22522d) {
            if (!this.f22531m) {
                if (z12) {
                    e.a aVar2 = this.f22520b;
                    aVar2.getClass();
                    ArrayList arrayList2 = new ArrayList(aVar2.f22517a);
                    int size3 = arrayList2.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size3) {
                            break;
                        }
                        f0 f0Var3 = (f0) arrayList2.get(i18);
                        le.a.f21259a.c(this.f22522d, this.f22519a, this, f0Var3);
                        c cVar4 = this.f22528j;
                        if (cVar4 != null) {
                            this.f22521c = f0Var3;
                            z11 = true;
                            cVar2 = cVar4;
                            break;
                        }
                        i18++;
                    }
                }
                if (!z11) {
                    if (f0Var == null) {
                        e.a aVar3 = this.f22520b;
                        if (aVar3.a()) {
                            List<f0> list2 = aVar3.f22517a;
                            int i19 = aVar3.f22518b;
                            aVar3.f22518b = i19 + 1;
                            f0Var = list2.get(i19);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    this.f22521c = f0Var;
                    this.f22527i = 0;
                    cVar2 = new c(this.f22522d, f0Var);
                    a(cVar2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z11) {
            this.f22524f.getClass();
            return cVar2;
        }
        cVar2.c(i10, i11, i12, i13, z10, this.f22523e, this.f22524f);
        le.a aVar4 = le.a.f21259a;
        h hVar = this.f22522d;
        ((w.a) aVar4).getClass();
        hVar.f20736e.L(cVar2.f22495c);
        synchronized (this.f22522d) {
            this.f22529k = true;
            le.a aVar5 = le.a.f21259a;
            h hVar2 = this.f22522d;
            ((w.a) aVar5).getClass();
            if (!hVar2.f20737f) {
                hVar2.f20737f = true;
                ((ThreadPoolExecutor) h.f20731g).execute(hVar2.f20734c);
            }
            hVar2.f20735d.add(cVar2);
            if (cVar2.h()) {
                socket = le.a.f21259a.b(this.f22522d, this.f22519a, this);
                cVar2 = this.f22528j;
            } else {
                socket = null;
            }
        }
        le.c.f(socket);
        this.f22524f.getClass();
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r1.f22497e.isClosed() != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1.f22497e.isInputShutdown() != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1.f22497e.isOutputShutdown() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r5 = r1.f22500h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r5 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r5.f24336g == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r5.f24343v >= r5.f24342u) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (r6 < r5.f24345x) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        if (r18 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5 = r1.f22497e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r1.f22497e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if (r1.f22501i.B() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.f22497e.setSoTimeout(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        r1.f22497e.setSoTimeout(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0077, code lost:
        r1.f22497e.setSoTimeout(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007c, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007f A[LOOP:0: B:0:0x0000->B:51:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ne.c e(int r13, int r14, int r15, int r16, boolean r17, boolean r18) throws java.io.IOException {
        /*
            r12 = this;
        L_0x0000:
            ne.c r1 = r12.d(r13, r14, r15, r16, r17)
            r2 = r12
            ke.h r3 = r2.f22522d
            monitor-enter(r3)
            int r0 = r1.f22504l     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0014
            boolean r0 = r1.h()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0014
            monitor-exit(r3)     // Catch:{ all -> 0x0085 }
            return r1
        L_0x0014:
            monitor-exit(r3)     // Catch:{ all -> 0x0085 }
            java.net.Socket r0 = r1.f22497e
            boolean r0 = r0.isClosed()
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x007d
            java.net.Socket r0 = r1.f22497e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L_0x007d
            java.net.Socket r0 = r1.f22497e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L_0x0030
            goto L_0x007d
        L_0x0030:
            qe.g r5 = r1.f22500h
            if (r5 == 0) goto L_0x0055
            long r6 = java.lang.System.nanoTime()
            monitor-enter(r5)
            boolean r0 = r5.f24336g     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x003f
            monitor-exit(r5)
            goto L_0x007d
        L_0x003f:
            long r8 = r5.f24343v     // Catch:{ all -> 0x0052 }
            long r10 = r5.f24342u     // Catch:{ all -> 0x0052 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            long r8 = r5.f24345x     // Catch:{ all -> 0x0052 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
            monitor-exit(r5)
            goto L_0x007d
        L_0x004f:
            monitor-exit(r5)
        L_0x0050:
            r3 = 1
            goto L_0x007d
        L_0x0052:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0055:
            if (r18 == 0) goto L_0x0050
            java.net.Socket r0 = r1.f22497e     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            int r5 = r0.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            java.net.Socket r0 = r1.f22497e     // Catch:{ all -> 0x0076 }
            r0.setSoTimeout(r4)     // Catch:{ all -> 0x0076 }
            ve.h r0 = r1.f22501i     // Catch:{ all -> 0x0076 }
            boolean r0 = r0.B()     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0070
            java.net.Socket r0 = r1.f22497e     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            r0.setSoTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            goto L_0x007d
        L_0x0070:
            java.net.Socket r0 = r1.f22497e     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            r0.setSoTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            goto L_0x0050
        L_0x0076:
            r0 = move-exception
            java.net.Socket r6 = r1.f22497e     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            r6.setSoTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x007d }
        L_0x007d:
            if (r3 != 0) goto L_0x0084
            r12.f()
            goto L_0x0000
        L_0x0084:
            return r1
        L_0x0085:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0088:
            throw r0
        L_0x0089:
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.f.e(int, int, int, int, boolean, boolean):ne.c");
    }

    public void f() {
        c cVar;
        Socket c10;
        synchronized (this.f22522d) {
            cVar = this.f22528j;
            c10 = c(true, false, false);
            if (this.f22528j != null) {
                cVar = null;
            }
        }
        le.c.f(c10);
        if (cVar != null) {
            this.f22524f.getClass();
        }
    }

    public void g() {
        c cVar;
        Socket c10;
        synchronized (this.f22522d) {
            cVar = this.f22528j;
            c10 = c(false, true, false);
            if (this.f22528j != null) {
                cVar = null;
            }
        }
        le.c.f(c10);
        if (cVar != null) {
            le.a.f21259a.d(this.f22523e, (IOException) null);
            this.f22524f.getClass();
            this.f22524f.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(java.io.IOException r7) {
        /*
            r6 = this;
            ke.h r0 = r6.f22522d
            monitor-enter(r0)
            boolean r1 = r7 instanceof qe.u     // Catch:{ all -> 0x0063 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0023
            qe.u r7 = (qe.u) r7     // Catch:{ all -> 0x0063 }
            qe.b r7 = r7.f24435a     // Catch:{ all -> 0x0063 }
            qe.b r1 = qe.b.REFUSED_STREAM     // Catch:{ all -> 0x0063 }
            if (r7 != r1) goto L_0x001c
            int r7 = r6.f22527i     // Catch:{ all -> 0x0063 }
            int r7 = r7 + r4
            r6.f22527i = r7     // Catch:{ all -> 0x0063 }
            if (r7 <= r4) goto L_0x0046
            r6.f22521c = r3     // Catch:{ all -> 0x0063 }
            goto L_0x0044
        L_0x001c:
            qe.b r1 = qe.b.CANCEL     // Catch:{ all -> 0x0063 }
            if (r7 == r1) goto L_0x0046
            r6.f22521c = r3     // Catch:{ all -> 0x0063 }
            goto L_0x0044
        L_0x0023:
            ne.c r1 = r6.f22528j     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0046
            boolean r1 = r1.h()     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7 instanceof qe.a     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0046
        L_0x0031:
            ne.c r1 = r6.f22528j     // Catch:{ all -> 0x0063 }
            int r1 = r1.f22504l     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0044
            ke.f0 r1 = r6.f22521c     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0042
            if (r7 == 0) goto L_0x0042
            ne.e r5 = r6.f22526h     // Catch:{ all -> 0x0063 }
            r5.a(r1, r7)     // Catch:{ all -> 0x0063 }
        L_0x0042:
            r6.f22521c = r3     // Catch:{ all -> 0x0063 }
        L_0x0044:
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            ne.c r1 = r6.f22528j     // Catch:{ all -> 0x0063 }
            java.net.Socket r7 = r6.c(r7, r2, r4)     // Catch:{ all -> 0x0063 }
            ne.c r2 = r6.f22528j     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0057
            boolean r2 = r6.f22529k     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r3 = r1
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            le.c.f(r7)
            if (r3 == 0) goto L_0x0062
            ke.n r7 = r6.f22524f
            r7.getClass()
        L_0x0062:
            return
        L_0x0063:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.f.h(java.io.IOException):void");
    }

    public void i(boolean z10, c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket c10;
        boolean z11;
        this.f22524f.getClass();
        synchronized (this.f22522d) {
            if (cVar != null) {
                if (cVar == this.f22532n) {
                    if (!z10) {
                        this.f22528j.f22504l++;
                    }
                    cVar2 = this.f22528j;
                    c10 = c(z10, false, true);
                    if (this.f22528j != null) {
                        cVar2 = null;
                    }
                    z11 = this.f22530l;
                }
            }
            throw new IllegalStateException("expected " + this.f22532n + " but was " + cVar);
        }
        le.c.f(c10);
        if (cVar2 != null) {
            this.f22524f.getClass();
        }
        if (iOException != null) {
            le.a.f21259a.d(this.f22523e, iOException);
            this.f22524f.getClass();
        } else if (z11) {
            le.a.f21259a.d(this.f22523e, (IOException) null);
            this.f22524f.getClass();
        }
    }

    public String toString() {
        c b10 = b();
        return b10 != null ? b10.toString() : this.f22519a.toString();
    }
}
