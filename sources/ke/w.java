package ke;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ke.d;
import ke.n;
import ke.r;
import le.c;
import me.e;
import ne.f;

/* compiled from: OkHttpClient */
public class w implements Cloneable, d.a {
    public static final List<x> J = c.p(x.HTTP_2, x.HTTP_1_1);
    public static final List<i> K = c.p(i.f20739e, i.f20740f);
    public final m A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: a  reason: collision with root package name */
    public final l f20818a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f20819b;

    /* renamed from: c  reason: collision with root package name */
    public final List<x> f20820c;

    /* renamed from: d  reason: collision with root package name */
    public final List<i> f20821d;

    /* renamed from: e  reason: collision with root package name */
    public final List<t> f20822e;

    /* renamed from: f  reason: collision with root package name */
    public final List<t> f20823f;

    /* renamed from: g  reason: collision with root package name */
    public final n.b f20824g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f20825h;

    /* renamed from: i  reason: collision with root package name */
    public final k f20826i;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    public final e f20827r;

    /* renamed from: s  reason: collision with root package name */
    public final SocketFactory f20828s;

    /* renamed from: t  reason: collision with root package name */
    public final SSLSocketFactory f20829t;

    /* renamed from: u  reason: collision with root package name */
    public final te.c f20830u;

    /* renamed from: v  reason: collision with root package name */
    public final HostnameVerifier f20831v;

    /* renamed from: w  reason: collision with root package name */
    public final f f20832w;

    /* renamed from: x  reason: collision with root package name */
    public final b f20833x;

    /* renamed from: y  reason: collision with root package name */
    public final b f20834y;

    /* renamed from: z  reason: collision with root package name */
    public final h f20835z;

    /* compiled from: OkHttpClient */
    public class a extends le.a {
        public void a(r.a aVar, String str, String str2) {
            aVar.f20780a.add(str);
            aVar.f20780a.add(str2.trim());
        }

        public Socket b(h hVar, a aVar, f fVar) {
            for (ne.c next : hVar.f20735d) {
                if (next.g(aVar, (f0) null) && next.h() && next != fVar.b()) {
                    if (fVar.f22532n == null && fVar.f22528j.f22506n.size() == 1) {
                        Socket c10 = fVar.c(true, false, false);
                        fVar.f22528j = next;
                        next.f22506n.add(fVar.f22528j.f22506n.get(0));
                        return c10;
                    }
                    throw new IllegalStateException();
                }
            }
            return null;
        }

        public ne.c c(h hVar, a aVar, f fVar, f0 f0Var) {
            for (ne.c next : hVar.f20735d) {
                if (next.g(aVar, f0Var)) {
                    fVar.a(next, true);
                    return next;
                }
            }
            return null;
        }

        @Nullable
        public IOException d(d dVar, @Nullable IOException iOException) {
            return ((y) dVar).c(iOException);
        }
    }

    static {
        le.a.f21259a = new a();
    }

    public w() {
        this(new b());
    }

    public d a(z zVar) {
        y yVar = new y(this, zVar, false);
        yVar.f20873d = ((o) this.f20824g).f20769a;
        return yVar;
    }

    public w(b bVar) {
        boolean z10;
        this.f20818a = bVar.f20836a;
        this.f20819b = bVar.f20837b;
        this.f20820c = bVar.f20838c;
        List<i> list = bVar.f20839d;
        this.f20821d = list;
        this.f20822e = c.o(bVar.f20840e);
        this.f20823f = c.o(bVar.f20841f);
        this.f20824g = bVar.f20842g;
        this.f20825h = bVar.f20843h;
        this.f20826i = bVar.f20844i;
        this.f20827r = bVar.f20845j;
        this.f20828s = bVar.f20846k;
        Iterator<i> it = list.iterator();
        loop0:
        while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                i next = it.next();
                if (z10 || next.f20741a) {
                    z10 = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f20847l;
        if (sSLSocketFactory != null || !z10) {
            this.f20829t = sSLSocketFactory;
            this.f20830u = bVar.f20848m;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    re.f fVar = re.f.f24794a;
                    SSLContext h10 = fVar.h();
                    h10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                    this.f20829t = h10.getSocketFactory();
                    this.f20830u = fVar.c(x509TrustManager);
                } catch (GeneralSecurityException e10) {
                    throw c.a("No System TLS", e10);
                }
            } catch (GeneralSecurityException e11) {
                throw c.a("No System TLS", e11);
            }
        }
        SSLSocketFactory sSLSocketFactory2 = this.f20829t;
        if (sSLSocketFactory2 != null) {
            re.f.f24794a.e(sSLSocketFactory2);
        }
        this.f20831v = bVar.f20849n;
        f fVar2 = bVar.f20850o;
        te.c cVar = this.f20830u;
        this.f20832w = !c.l(fVar2.f20699b, cVar) ? new f(fVar2.f20698a, cVar) : fVar2;
        this.f20833x = bVar.f20851p;
        this.f20834y = bVar.f20852q;
        this.f20835z = bVar.f20853r;
        this.A = bVar.f20854s;
        this.B = bVar.f20855t;
        this.C = bVar.f20856u;
        this.D = bVar.f20857v;
        this.E = bVar.f20858w;
        this.F = bVar.f20859x;
        this.G = bVar.f20860y;
        this.H = bVar.f20861z;
        this.I = bVar.A;
        if (this.f20822e.contains((Object) null)) {
            StringBuilder a10 = android.support.v4.media.a.a("Null interceptor: ");
            a10.append(this.f20822e);
            throw new IllegalStateException(a10.toString());
        } else if (this.f20823f.contains((Object) null)) {
            StringBuilder a11 = android.support.v4.media.a.a("Null network interceptor: ");
            a11.append(this.f20823f);
            throw new IllegalStateException(a11.toString());
        }
    }

    /* compiled from: OkHttpClient */
    public static final class b {
        public int A;

        /* renamed from: a  reason: collision with root package name */
        public l f20836a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public Proxy f20837b;

        /* renamed from: c  reason: collision with root package name */
        public List<x> f20838c;

        /* renamed from: d  reason: collision with root package name */
        public List<i> f20839d;

        /* renamed from: e  reason: collision with root package name */
        public final List<t> f20840e;

        /* renamed from: f  reason: collision with root package name */
        public final List<t> f20841f;

        /* renamed from: g  reason: collision with root package name */
        public n.b f20842g;

        /* renamed from: h  reason: collision with root package name */
        public ProxySelector f20843h;

        /* renamed from: i  reason: collision with root package name */
        public k f20844i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public e f20845j;

        /* renamed from: k  reason: collision with root package name */
        public SocketFactory f20846k;
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        public SSLSocketFactory f20847l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public te.c f20848m;

        /* renamed from: n  reason: collision with root package name */
        public HostnameVerifier f20849n;

        /* renamed from: o  reason: collision with root package name */
        public f f20850o;

        /* renamed from: p  reason: collision with root package name */
        public b f20851p;

        /* renamed from: q  reason: collision with root package name */
        public b f20852q;

        /* renamed from: r  reason: collision with root package name */
        public h f20853r;

        /* renamed from: s  reason: collision with root package name */
        public m f20854s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f20855t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f20856u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f20857v;

        /* renamed from: w  reason: collision with root package name */
        public int f20858w;

        /* renamed from: x  reason: collision with root package name */
        public int f20859x;

        /* renamed from: y  reason: collision with root package name */
        public int f20860y;

        /* renamed from: z  reason: collision with root package name */
        public int f20861z;

        public b() {
            this.f20840e = new ArrayList();
            this.f20841f = new ArrayList();
            this.f20836a = new l();
            this.f20838c = w.J;
            this.f20839d = w.K;
            this.f20842g = new o(n.f20768a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f20843h = proxySelector;
            if (proxySelector == null) {
                this.f20843h = new se.a();
            }
            this.f20844i = k.f20762a;
            this.f20846k = SocketFactory.getDefault();
            this.f20849n = te.d.f25910a;
            this.f20850o = f.f20697c;
            b bVar = b.f20643a;
            this.f20851p = bVar;
            this.f20852q = bVar;
            this.f20853r = new h();
            this.f20854s = m.f20767a;
            this.f20855t = true;
            this.f20856u = true;
            this.f20857v = true;
            this.f20858w = 0;
            this.f20859x = 10000;
            this.f20860y = 10000;
            this.f20861z = 10000;
            this.A = 0;
        }

        public b a(t tVar) {
            if (tVar != null) {
                this.f20840e.add(tVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public b(w wVar) {
            ArrayList arrayList = new ArrayList();
            this.f20840e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f20841f = arrayList2;
            this.f20836a = wVar.f20818a;
            this.f20837b = wVar.f20819b;
            this.f20838c = wVar.f20820c;
            this.f20839d = wVar.f20821d;
            arrayList.addAll(wVar.f20822e);
            arrayList2.addAll(wVar.f20823f);
            this.f20842g = wVar.f20824g;
            this.f20843h = wVar.f20825h;
            this.f20844i = wVar.f20826i;
            this.f20845j = wVar.f20827r;
            this.f20846k = wVar.f20828s;
            this.f20847l = wVar.f20829t;
            this.f20848m = wVar.f20830u;
            this.f20849n = wVar.f20831v;
            this.f20850o = wVar.f20832w;
            this.f20851p = wVar.f20833x;
            this.f20852q = wVar.f20834y;
            this.f20853r = wVar.f20835z;
            this.f20854s = wVar.A;
            this.f20855t = wVar.B;
            this.f20856u = wVar.C;
            this.f20857v = wVar.D;
            this.f20858w = wVar.E;
            this.f20859x = wVar.F;
            this.f20860y = wVar.G;
            this.f20861z = wVar.H;
            this.A = wVar.I;
        }
    }
}
