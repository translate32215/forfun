package pe;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import ke.d0;
import ke.e0;
import ke.r;
import ke.s;
import ke.w;
import oe.j;
import t3.a0;
import ve.h;
import ve.l;
import ve.p;
import ve.t;
import ve.x;
import ve.y;
import ve.z;

/* compiled from: Http1Codec */
public final class a implements oe.c {

    /* renamed from: a  reason: collision with root package name */
    public final w f23987a;

    /* renamed from: b  reason: collision with root package name */
    public final ne.f f23988b;

    /* renamed from: c  reason: collision with root package name */
    public final h f23989c;

    /* renamed from: d  reason: collision with root package name */
    public final ve.g f23990d;

    /* renamed from: e  reason: collision with root package name */
    public int f23991e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f23992f = 262144;

    /* compiled from: Http1Codec */
    public abstract class b implements y {

        /* renamed from: a  reason: collision with root package name */
        public final l f23993a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23994b;

        /* renamed from: c  reason: collision with root package name */
        public long f23995c = 0;

        public b(C0216a aVar) {
            this.f23993a = new l(a.this.f23989c.e());
        }

        public final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f23991e;
            if (i10 != 6) {
                if (i10 == 5) {
                    aVar.g(this.f23993a);
                    a aVar2 = a.this;
                    aVar2.f23991e = 6;
                    ne.f fVar = aVar2.f23988b;
                    if (fVar != null) {
                        fVar.i(!z10, aVar2, this.f23995c, iOException);
                        return;
                    }
                    return;
                }
                StringBuilder a10 = android.support.v4.media.a.a("state: ");
                a10.append(a.this.f23991e);
                throw new IllegalStateException(a10.toString());
            }
        }

        public long a0(ve.f fVar, long j10) throws IOException {
            try {
                long a02 = a.this.f23989c.a0(fVar, j10);
                if (a02 > 0) {
                    this.f23995c += a02;
                }
                return a02;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }

        public z e() {
            return this.f23993a;
        }
    }

    /* compiled from: Http1Codec */
    public final class c implements x {

        /* renamed from: a  reason: collision with root package name */
        public final l f23997a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23998b;

        public c() {
            this.f23997a = new l(a.this.f23990d.e());
        }

        public synchronized void close() throws IOException {
            if (!this.f23998b) {
                this.f23998b = true;
                a.this.f23990d.Y("0\r\n\r\n");
                a.this.g(this.f23997a);
                a.this.f23991e = 3;
            }
        }

        public z e() {
            return this.f23997a;
        }

        public synchronized void flush() throws IOException {
            if (!this.f23998b) {
                a.this.f23990d.flush();
            }
        }

        public void m(ve.f fVar, long j10) throws IOException {
            if (this.f23998b) {
                throw new IllegalStateException("closed");
            } else if (j10 != 0) {
                a.this.f23990d.k(j10);
                a.this.f23990d.Y("\r\n");
                a.this.f23990d.m(fVar, j10);
                a.this.f23990d.Y("\r\n");
            }
        }
    }

    /* compiled from: Http1Codec */
    public class d extends b {

        /* renamed from: e  reason: collision with root package name */
        public final s f24000e;

        /* renamed from: f  reason: collision with root package name */
        public long f24001f = -1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f24002g = true;

        public d(s sVar) {
            super((C0216a) null);
            this.f24000e = sVar;
        }

        public long a0(ve.f fVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
            } else if (this.f23994b) {
                throw new IllegalStateException("closed");
            } else if (!this.f24002g) {
                return -1;
            } else {
                long j11 = this.f24001f;
                if (j11 == 0 || j11 == -1) {
                    if (j11 != -1) {
                        a.this.f23989c.w();
                    }
                    try {
                        this.f24001f = a.this.f23989c.c0();
                        String trim = a.this.f23989c.w().trim();
                        if (this.f24001f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f24001f + trim + "\"");
                        }
                        if (this.f24001f == 0) {
                            this.f24002g = false;
                            a aVar = a.this;
                            oe.e.d(aVar.f23987a.f20826i, this.f24000e, aVar.j());
                            a(true, (IOException) null);
                        }
                        if (!this.f24002g) {
                            return -1;
                        }
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long a02 = super.a0(fVar, Math.min(j10, this.f24001f));
                if (a02 != -1) {
                    this.f24001f -= a02;
                    return a02;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.f23994b) {
                if (this.f24002g && !le.c.k(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.f23994b = true;
            }
        }
    }

    /* compiled from: Http1Codec */
    public final class e implements x {

        /* renamed from: a  reason: collision with root package name */
        public final l f24004a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f24005b;

        /* renamed from: c  reason: collision with root package name */
        public long f24006c;

        public e(long j10) {
            this.f24004a = new l(a.this.f23990d.e());
            this.f24006c = j10;
        }

        public void close() throws IOException {
            if (!this.f24005b) {
                this.f24005b = true;
                if (this.f24006c <= 0) {
                    a.this.g(this.f24004a);
                    a.this.f23991e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public z e() {
            return this.f24004a;
        }

        public void flush() throws IOException {
            if (!this.f24005b) {
                a.this.f23990d.flush();
            }
        }

        public void m(ve.f fVar, long j10) throws IOException {
            if (!this.f24005b) {
                le.c.d(fVar.f26740b, 0, j10);
                if (j10 <= this.f24006c) {
                    a.this.f23990d.m(fVar, j10);
                    this.f24006c -= j10;
                    return;
                }
                StringBuilder a10 = android.support.v4.media.a.a("expected ");
                a10.append(this.f24006c);
                a10.append(" bytes but received ");
                a10.append(j10);
                throw new ProtocolException(a10.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    /* compiled from: Http1Codec */
    public class f extends b {

        /* renamed from: e  reason: collision with root package name */
        public long f24008e;

        public f(a aVar, long j10) throws IOException {
            super((C0216a) null);
            this.f24008e = j10;
            if (j10 == 0) {
                a(true, (IOException) null);
            }
        }

        public long a0(ve.f fVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
            } else if (!this.f23994b) {
                long j11 = this.f24008e;
                if (j11 == 0) {
                    return -1;
                }
                long a02 = super.a0(fVar, Math.min(j11, j10));
                if (a02 != -1) {
                    long j12 = this.f24008e - a02;
                    this.f24008e = j12;
                    if (j12 == 0) {
                        a(true, (IOException) null);
                    }
                    return a02;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f23994b) {
                if (this.f24008e != 0 && !le.c.k(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.f23994b = true;
            }
        }
    }

    /* compiled from: Http1Codec */
    public class g extends b {

        /* renamed from: e  reason: collision with root package name */
        public boolean f24009e;

        public g(a aVar) {
            super((C0216a) null);
        }

        public long a0(ve.f fVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
            } else if (this.f23994b) {
                throw new IllegalStateException("closed");
            } else if (this.f24009e) {
                return -1;
            } else {
                long a02 = super.a0(fVar, j10);
                if (a02 != -1) {
                    return a02;
                }
                this.f24009e = true;
                a(true, (IOException) null);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.f23994b) {
                if (!this.f24009e) {
                    a(false, (IOException) null);
                }
                this.f23994b = true;
            }
        }
    }

    public a(w wVar, ne.f fVar, h hVar, ve.g gVar) {
        this.f23987a = wVar;
        this.f23988b = fVar;
        this.f23989c = hVar;
        this.f23990d = gVar;
    }

    public x a(ke.z zVar, long j10) {
        if ("chunked".equalsIgnoreCase(zVar.f20882c.c("Transfer-Encoding"))) {
            if (this.f23991e == 1) {
                this.f23991e = 2;
                return new c();
            }
            StringBuilder a10 = android.support.v4.media.a.a("state: ");
            a10.append(this.f23991e);
            throw new IllegalStateException(a10.toString());
        } else if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f23991e == 1) {
            this.f23991e = 2;
            return new e(j10);
        } else {
            StringBuilder a11 = android.support.v4.media.a.a("state: ");
            a11.append(this.f23991e);
            throw new IllegalStateException(a11.toString());
        }
    }

    public void b() throws IOException {
        this.f23990d.flush();
    }

    public e0 c(d0 d0Var) throws IOException {
        this.f23988b.f22524f.getClass();
        String c10 = d0Var.f20669f.c("Content-Type");
        String str = null;
        if (c10 == null) {
            c10 = null;
        }
        if (!oe.e.b(d0Var)) {
            y h10 = h(0);
            Logger logger = p.f26761a;
            return new oe.g(c10, 0, new t(h10));
        }
        String c11 = d0Var.f20669f.c("Transfer-Encoding");
        if (c11 != null) {
            str = c11;
        }
        if ("chunked".equalsIgnoreCase(str)) {
            s sVar = d0Var.f20664a.f20880a;
            if (this.f23991e == 4) {
                this.f23991e = 5;
                d dVar = new d(sVar);
                Logger logger2 = p.f26761a;
                return new oe.g(c10, -1, new t(dVar));
            }
            StringBuilder a10 = android.support.v4.media.a.a("state: ");
            a10.append(this.f23991e);
            throw new IllegalStateException(a10.toString());
        }
        long a11 = oe.e.a(d0Var);
        if (a11 != -1) {
            y h11 = h(a11);
            Logger logger3 = p.f26761a;
            return new oe.g(c10, a11, new t(h11));
        } else if (this.f23991e == 4) {
            ne.f fVar = this.f23988b;
            if (fVar != null) {
                this.f23991e = 5;
                fVar.f();
                g gVar = new g(this);
                Logger logger4 = p.f26761a;
                return new oe.g(c10, -1, new t(gVar));
            }
            throw new IllegalStateException("streamAllocation == null");
        } else {
            StringBuilder a12 = android.support.v4.media.a.a("state: ");
            a12.append(this.f23991e);
            throw new IllegalStateException(a12.toString());
        }
    }

    public void cancel() {
        ne.c b10 = this.f23988b.b();
        if (b10 != null) {
            le.c.f(b10.f22496d);
        }
    }

    public void d() throws IOException {
        this.f23990d.flush();
    }

    public void e(ke.z zVar) throws IOException {
        Proxy.Type type = this.f23988b.b().f22495c.f20701b.type();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zVar.f20881b);
        sb2.append(' ');
        if (!zVar.f20880a.f20782a.equals("https") && type == Proxy.Type.HTTP) {
            sb2.append(zVar.f20880a);
        } else {
            sb2.append(oe.h.a(zVar.f20880a));
        }
        sb2.append(" HTTP/1.1");
        k(zVar.f20882c, sb2.toString());
    }

    public d0.a f(boolean z10) throws IOException {
        int i10 = this.f23991e;
        if (i10 == 1 || i10 == 3) {
            try {
                j a10 = j.a(i());
                d0.a aVar = new d0.a();
                aVar.f20678b = a10.f23718a;
                aVar.f20679c = a10.f23719b;
                aVar.f20680d = a10.f23720c;
                aVar.d(j());
                if (z10 && a10.f23719b == 100) {
                    return null;
                }
                if (a10.f23719b == 100) {
                    this.f23991e = 3;
                    return aVar;
                }
                this.f23991e = 4;
                return aVar;
            } catch (EOFException e10) {
                StringBuilder a11 = android.support.v4.media.a.a("unexpected end of stream on ");
                a11.append(this.f23988b);
                IOException iOException = new IOException(a11.toString());
                iOException.initCause(e10);
                throw iOException;
            }
        } else {
            StringBuilder a12 = android.support.v4.media.a.a("state: ");
            a12.append(this.f23991e);
            throw new IllegalStateException(a12.toString());
        }
    }

    public void g(l lVar) {
        z zVar = lVar.f26749e;
        lVar.f26749e = z.f26785d;
        zVar.a();
        zVar.b();
    }

    public y h(long j10) throws IOException {
        if (this.f23991e == 4) {
            this.f23991e = 5;
            return new f(this, j10);
        }
        StringBuilder a10 = android.support.v4.media.a.a("state: ");
        a10.append(this.f23991e);
        throw new IllegalStateException(a10.toString());
    }

    public final String i() throws IOException {
        String O = this.f23989c.O(this.f23992f);
        this.f23992f -= (long) O.length();
        return O;
    }

    public r j() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String i10 = i();
            if (i10.length() == 0) {
                return new r(aVar);
            }
            ((w.a) le.a.f21259a).getClass();
            int indexOf = i10.indexOf(":", 1);
            if (indexOf != -1) {
                aVar.b(i10.substring(0, indexOf), i10.substring(indexOf + 1));
            } else if (i10.startsWith(":")) {
                String substring = i10.substring(1);
                aVar.f20780a.add("");
                aVar.f20780a.add(substring.trim());
            } else {
                aVar.f20780a.add("");
                aVar.f20780a.add(i10.trim());
            }
        }
    }

    public void k(r rVar, String str) throws IOException {
        if (this.f23991e == 0) {
            this.f23990d.Y(str).Y("\r\n");
            int g10 = rVar.g();
            for (int i10 = 0; i10 < g10; i10++) {
                this.f23990d.Y(rVar.d(i10)).Y(": ").Y(rVar.h(i10)).Y("\r\n");
            }
            this.f23990d.Y("\r\n");
            this.f23991e = 1;
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("state: ");
        a10.append(this.f23991e);
        throw new IllegalStateException(a10.toString());
    }
}
