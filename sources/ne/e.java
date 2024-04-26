package ne;

import b2.t;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ke.d;
import ke.f0;
import ke.n;
import ke.s;
import le.c;

/* compiled from: RouteSelector */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ke.a f22510a;

    /* renamed from: b  reason: collision with root package name */
    public final t f22511b;

    /* renamed from: c  reason: collision with root package name */
    public final n f22512c;

    /* renamed from: d  reason: collision with root package name */
    public List<Proxy> f22513d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public int f22514e;

    /* renamed from: f  reason: collision with root package name */
    public List<InetSocketAddress> f22515f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public final List<f0> f22516g = new ArrayList();

    /* compiled from: RouteSelector */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<f0> f22517a;

        /* renamed from: b  reason: collision with root package name */
        public int f22518b = 0;

        public a(List<f0> list) {
            this.f22517a = list;
        }

        public boolean a() {
            return this.f22518b < this.f22517a.size();
        }
    }

    public e(ke.a aVar, t tVar, d dVar, n nVar) {
        List<Proxy> list;
        this.f22510a = aVar;
        this.f22511b = tVar;
        this.f22512c = nVar;
        s sVar = aVar.f20630a;
        Proxy proxy = aVar.f20637h;
        if (proxy != null) {
            this.f22513d = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f20636g.select(sVar.r());
            if (select == null || select.isEmpty()) {
                list = c.p(Proxy.NO_PROXY);
            } else {
                list = c.o(select);
            }
            this.f22513d = list;
        }
        this.f22514e = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f22510a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(ke.f0 r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.f20701b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            ke.a r0 = r3.f22510a
            java.net.ProxySelector r1 = r0.f20636g
            if (r1 == 0) goto L_0x001f
            ke.s r0 = r0.f20630a
            java.net.URI r0 = r0.r()
            java.net.Proxy r2 = r4.f20701b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            b2.t r5 = r3.f22511b
            monitor-enter(r5)
            java.lang.Object r0 = r5.f3445b     // Catch:{ all -> 0x002b }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x002b }
            r0.add(r4)     // Catch:{ all -> 0x002b }
            monitor-exit(r5)
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.e.a(ke.f0, java.io.IOException):void");
    }

    public boolean b() {
        return c() || !this.f22516g.isEmpty();
    }

    public final boolean c() {
        return this.f22514e < this.f22513d.size();
    }
}
