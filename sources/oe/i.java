package oe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import ke.c0;
import ke.d;
import ke.d0;
import ke.f0;
import ke.n;
import ke.s;
import ke.t;
import ke.w;
import ke.z;
import ne.c;
import ne.e;
import ne.f;
import q.h;
import qe.a;

/* compiled from: RetryAndFollowUpInterceptor */
public final class i implements t {

    /* renamed from: a  reason: collision with root package name */
    public final w f23714a;

    /* renamed from: b  reason: collision with root package name */
    public volatile f f23715b;

    /* renamed from: c  reason: collision with root package name */
    public Object f23716c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f23717d;

    public i(w wVar, boolean z10) {
        this.f23714a = wVar;
    }

    public d0 a(t.a aVar) throws IOException {
        c cVar;
        f fVar = (f) aVar;
        z zVar = fVar.f23704f;
        d dVar = fVar.f23705g;
        n nVar = fVar.f23706h;
        f fVar2 = new f(this.f23714a.f20835z, b(zVar.f20880a), dVar, nVar, this.f23716c);
        this.f23715b = fVar2;
        int i10 = 0;
        d0 d0Var = null;
        while (!this.f23717d) {
            try {
                d0 b10 = fVar.b(zVar, fVar2, (c) null, (c) null);
                if (d0Var != null) {
                    d0.a aVar2 = new d0.a(b10);
                    d0.a aVar3 = new d0.a(d0Var);
                    aVar3.f20683g = null;
                    d0 a10 = aVar3.a();
                    if (a10.f20670g == null) {
                        aVar2.f20686j = a10;
                        b10 = aVar2.a();
                    } else {
                        throw new IllegalArgumentException("priorResponse.body != null");
                    }
                }
                try {
                    z c10 = c(b10, fVar2.f22521c);
                    if (c10 == null) {
                        fVar2.g();
                        return b10;
                    }
                    le.c.e(b10.f20670g);
                    int i11 = i10 + 1;
                    if (i11 <= 20) {
                        if (!f(b10, c10.f20880a)) {
                            fVar2.g();
                            fVar2 = new f(this.f23714a.f20835z, b(c10.f20880a), dVar, nVar, this.f23716c);
                            this.f23715b = fVar2;
                        } else {
                            synchronized (fVar2.f22522d) {
                                cVar = fVar2.f22532n;
                            }
                            if (cVar != null) {
                                throw new IllegalStateException("Closing the body of " + b10 + " didn't close its backing stream. Bad interceptor?");
                            }
                        }
                        d0Var = b10;
                        zVar = c10;
                        i10 = i11;
                    } else {
                        fVar2.g();
                        throw new ProtocolException(androidx.appcompat.widget.d0.a("Too many follow-up requests: ", i11));
                    }
                } catch (IOException e10) {
                    fVar2.g();
                    throw e10;
                }
            } catch (ne.d e11) {
                if (!d(e11.f22509b, fVar2, false, zVar)) {
                    throw e11.f22508a;
                }
            } catch (IOException e12) {
                if (!d(e12, fVar2, !(e12 instanceof a), zVar)) {
                    throw e12;
                }
            } catch (Throwable th) {
                fVar2.h((IOException) null);
                fVar2.g();
                throw th;
            }
        }
        fVar2.g();
        throw new IOException("Canceled");
    }

    public final ke.a b(s sVar) {
        ke.f fVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        s sVar2 = sVar;
        if (sVar2.f20782a.equals("https")) {
            w wVar = this.f23714a;
            SSLSocketFactory sSLSocketFactory2 = wVar.f20829t;
            HostnameVerifier hostnameVerifier2 = wVar.f20831v;
            fVar = wVar.f20832w;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        String str = sVar2.f20785d;
        int i10 = sVar2.f20786e;
        w wVar2 = this.f23714a;
        return new ke.a(str, i10, wVar2.A, wVar2.f20828s, sSLSocketFactory, hostnameVerifier, fVar, wVar2.f20833x, wVar2.f20819b, wVar2.f20820c, wVar2.f20821d, wVar2.f20825h);
    }

    public final z c(d0 d0Var, f0 f0Var) throws IOException {
        int i10 = d0Var.f20666c;
        String str = d0Var.f20664a.f20881b;
        c0 c0Var = null;
        if (i10 == 307 || i10 == 308) {
            if (!str.equals("GET") && !str.equals("HEAD")) {
                return null;
            }
        } else if (i10 == 401) {
            this.f23714a.f20834y.getClass();
            return null;
        } else if (i10 == 503) {
            d0 d0Var2 = d0Var.f20673r;
            if ((d0Var2 == null || d0Var2.f20666c != 503) && e(d0Var, Integer.MAX_VALUE) == 0) {
                return d0Var.f20664a;
            }
            return null;
        } else if (i10 != 407) {
            if (i10 != 408) {
                switch (i10) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            } else if (!this.f23714a.D) {
                return null;
            } else {
                d0 d0Var3 = d0Var.f20673r;
                if ((d0Var3 == null || d0Var3.f20666c != 408) && e(d0Var, 0) <= 0) {
                    return d0Var.f20664a;
                }
                return null;
            }
        } else if (f0Var.f20701b.type() == Proxy.Type.HTTP) {
            this.f23714a.f20833x.getClass();
            return null;
        } else {
            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        }
        if (!this.f23714a.C) {
            return null;
        }
        String c10 = d0Var.f20669f.c("Location");
        if (c10 == null) {
            c10 = null;
        }
        if (c10 == null) {
            return null;
        }
        s.a l10 = d0Var.f20664a.f20880a.l(c10);
        s a10 = l10 != null ? l10.a() : null;
        if (a10 == null) {
            return null;
        }
        if (!a10.f20782a.equals(d0Var.f20664a.f20880a.f20782a) && !this.f23714a.B) {
            return null;
        }
        z zVar = d0Var.f20664a;
        zVar.getClass();
        z.a aVar = new z.a(zVar);
        if (h.f(str)) {
            boolean equals = str.equals("PROPFIND");
            if (!str.equals("PROPFIND")) {
                aVar.c("GET", (c0) null);
            } else {
                if (equals) {
                    c0Var = d0Var.f20664a.f20883d;
                }
                aVar.c(str, c0Var);
            }
            if (!equals) {
                aVar.f20888c.c("Transfer-Encoding");
                aVar.f20888c.c("Content-Length");
                aVar.f20888c.c("Content-Type");
            }
        }
        if (!f(d0Var, a10)) {
            aVar.f20888c.c("Authorization");
        }
        aVar.f20886a = a10;
        return aVar.a();
    }

    public final boolean d(IOException iOException, f fVar, boolean z10, z zVar) {
        e.a aVar;
        fVar.h(iOException);
        if (!this.f23714a.D) {
            return false;
        }
        if (z10 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z10))) {
            return false;
        }
        if (!(fVar.f22521c != null || ((aVar = fVar.f22520b) != null && aVar.a()) || fVar.f22526h.b())) {
            return false;
        }
        return true;
    }

    public final int e(d0 d0Var, int i10) {
        String c10 = d0Var.f20669f.c("Retry-After");
        if (c10 == null) {
            c10 = null;
        }
        if (c10 == null) {
            return i10;
        }
        if (c10.matches("\\d+")) {
            return Integer.valueOf(c10).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final boolean f(d0 d0Var, s sVar) {
        s sVar2 = d0Var.f20664a.f20880a;
        return sVar2.f20785d.equals(sVar.f20785d) && sVar2.f20786e == sVar.f20786e && sVar2.f20782a.equals(sVar.f20782a);
    }
}
