package lf;

import androidx.appcompat.widget.y0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import ke.b0;
import ke.d;
import ke.d0;
import ke.e;
import ke.e0;
import ke.l;
import ke.p;
import ke.r;
import ke.s;
import ke.u;
import ke.v;
import ke.y;
import ke.z;
import lf.z;
import ve.f;
import ve.h;
import ve.k;
import ve.p;
import ve.y;

/* compiled from: OkHttpCall */
public final class t<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f21378a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f21379b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f21380c;

    /* renamed from: d  reason: collision with root package name */
    public final j<e0, T> f21381d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f21382e;
    @GuardedBy("this")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public d f21383f;
    @GuardedBy("this")
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public Throwable f21384g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public boolean f21385h;

    /* compiled from: OkHttpCall */
    public class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f21386a;

        public a(d dVar) {
            this.f21386a = dVar;
        }

        public void a(d dVar, IOException iOException) {
            try {
                this.f21386a.b(t.this, iOException);
            } catch (Throwable th) {
                j0.p(th);
                th.printStackTrace();
            }
        }

        public void b(d dVar, d0 d0Var) {
            try {
                try {
                    this.f21386a.a(t.this, t.this.b(d0Var));
                } catch (Throwable th) {
                    j0.p(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                j0.p(th2);
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: OkHttpCall */
    public static final class b extends e0 {

        /* renamed from: b  reason: collision with root package name */
        public final e0 f21388b;

        /* renamed from: c  reason: collision with root package name */
        public final h f21389c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public IOException f21390d;

        /* compiled from: OkHttpCall */
        public class a extends k {
            public a(y yVar) {
                super(yVar);
            }

            public long a0(f fVar, long j10) throws IOException {
                try {
                    return this.f26748a.a0(fVar, j10);
                } catch (IOException e10) {
                    b.this.f21390d = e10;
                    throw e10;
                }
            }
        }

        public b(e0 e0Var) {
            this.f21388b = e0Var;
            a aVar = new a(e0Var.o());
            Logger logger = p.f26761a;
            this.f21389c = new ve.t(aVar);
        }

        public long a() {
            return this.f21388b.a();
        }

        public void close() {
            this.f21388b.close();
        }

        public u d() {
            return this.f21388b.d();
        }

        public h o() {
            return this.f21389c;
        }
    }

    /* compiled from: OkHttpCall */
    public static final class c extends e0 {
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final u f21392b;

        /* renamed from: c  reason: collision with root package name */
        public final long f21393c;

        public c(@Nullable u uVar, long j10) {
            this.f21392b = uVar;
            this.f21393c = j10;
        }

        public long a() {
            return this.f21393c;
        }

        public u d() {
            return this.f21392b;
        }

        public h o() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public t(c0 c0Var, Object[] objArr, d.a aVar, j<e0, T> jVar) {
        this.f21378a = c0Var;
        this.f21379b = objArr;
        this.f21380c = aVar;
        this.f21381d = jVar;
    }

    public void J(d<T> dVar) {
        d dVar2;
        Throwable th;
        synchronized (this) {
            if (!this.f21385h) {
                this.f21385h = true;
                dVar2 = this.f21383f;
                th = this.f21384g;
                if (dVar2 == null && th == null) {
                    try {
                        d a10 = a();
                        this.f21383f = a10;
                        dVar2 = a10;
                    } catch (Throwable th2) {
                        th = th2;
                        j0.p(th);
                        this.f21384g = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.b(this, th);
            return;
        }
        if (this.f21382e) {
            ((ke.y) dVar2).cancel();
        }
        a aVar = new a(dVar);
        ke.y yVar = (ke.y) dVar2;
        synchronized (yVar) {
            if (!yVar.f20876g) {
                yVar.f20876g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        yVar.f20871b.f23716c = re.f.f24794a.j("response.body().close()");
        yVar.f20873d.getClass();
        l lVar = yVar.f20870a.f20818a;
        y.b bVar = new y.b(aVar);
        synchronized (lVar) {
            lVar.f20764b.add(bVar);
        }
        lVar.b();
    }

    public synchronized z M() {
        d dVar = this.f21383f;
        if (dVar != null) {
            return ((ke.y) dVar).f20874e;
        }
        Throwable th = this.f21384g;
        if (th == null) {
            try {
                d a10 = a();
                this.f21383f = a10;
                return ((ke.y) a10).f20874e;
            } catch (RuntimeException e10) {
                e = e10;
                j0.p(e);
                this.f21384g = e;
                throw e;
            } catch (Error e11) {
                e = e11;
                j0.p(e);
                this.f21384g = e;
                throw e;
            } catch (IOException e12) {
                this.f21384g = e12;
                throw new RuntimeException("Unable to create request.", e12);
            }
        } else if (th instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.f21384g);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public boolean N() {
        boolean z10 = true;
        if (this.f21382e) {
            return true;
        }
        synchronized (this) {
            d dVar = this.f21383f;
            if (dVar == null || !((ke.y) dVar).f20871b.f23717d) {
                z10 = false;
            }
        }
        return z10;
    }

    public final d a() throws IOException {
        s sVar;
        d.a aVar = this.f21380c;
        c0 c0Var = this.f21378a;
        Object[] objArr = this.f21379b;
        x[] xVarArr = c0Var.f21296j;
        int length = objArr.length;
        if (length == xVarArr.length) {
            z zVar = new z(c0Var.f21289c, c0Var.f21288b, c0Var.f21290d, c0Var.f21291e, c0Var.f21292f, c0Var.f21293g, c0Var.f21294h, c0Var.f21295i);
            if (c0Var.f21297k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                xVarArr[i10].a(zVar, objArr[i10]);
            }
            s.a aVar2 = zVar.f21440d;
            if (aVar2 != null) {
                sVar = aVar2.a();
            } else {
                s.a l10 = zVar.f21438b.l(zVar.f21439c);
                sVar = l10 != null ? l10.a() : null;
                if (sVar == null) {
                    StringBuilder a10 = android.support.v4.media.a.a("Malformed URL. Base: ");
                    a10.append(zVar.f21438b);
                    a10.append(", Relative: ");
                    a10.append(zVar.f21439c);
                    throw new IllegalArgumentException(a10.toString());
                }
            }
            z.a aVar3 = zVar.f21447k;
            if (aVar3 == null) {
                p.a aVar4 = zVar.f21446j;
                if (aVar4 != null) {
                    aVar3 = new ke.p(aVar4.f20773a, aVar4.f20774b);
                } else {
                    v.a aVar5 = zVar.f21445i;
                    if (aVar5 != null) {
                        if (!aVar5.f20815c.isEmpty()) {
                            aVar3 = new v(aVar5.f20813a, aVar5.f20814b, aVar5.f20815c);
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (zVar.f21444h) {
                        long j10 = (long) 0;
                        le.c.d(j10, j10, j10);
                        aVar3 = new b0((u) null, 0, new byte[0], 0);
                    }
                }
            }
            u uVar = zVar.f21443g;
            if (uVar != null) {
                if (aVar3 != null) {
                    aVar3 = new z.a(aVar3, uVar);
                } else {
                    zVar.f21442f.a("Content-Type", uVar.f20801a);
                }
            }
            z.a aVar6 = zVar.f21441e;
            aVar6.f20886a = sVar;
            List<String> list = zVar.f21442f.f20780a;
            r.a aVar7 = new r.a();
            Collections.addAll(aVar7.f20780a, (String[]) list.toArray(new String[list.size()]));
            aVar6.f20888c = aVar7;
            aVar6.c(zVar.f21437a, aVar3);
            aVar6.d(n.class, new n(c0Var.f21287a, arrayList));
            d a11 = aVar.a(aVar6.a());
            if (a11 != null) {
                return a11;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(v.e.a(y0.a("Argument count (", length, ") doesn't match expected count ("), xVarArr.length, ")"));
    }

    public d0<T> b(d0 d0Var) throws IOException {
        e0 e0Var = d0Var.f20670g;
        d0.a aVar = new d0.a(d0Var);
        aVar.f20683g = new c(e0Var.d(), e0Var.a());
        d0 a10 = aVar.a();
        int i10 = a10.f20666c;
        if (i10 < 200 || i10 >= 300) {
            try {
                return d0.a(j0.a(e0Var), a10);
            } finally {
                e0Var.close();
            }
        } else if (i10 == 204 || i10 == 205) {
            e0Var.close();
            return d0.c(null, a10);
        } else {
            b bVar = new b(e0Var);
            try {
                return d0.c(this.f21381d.a(bVar), a10);
            } catch (RuntimeException e10) {
                IOException iOException = bVar.f21390d;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        }
    }

    public void cancel() {
        d dVar;
        this.f21382e = true;
        synchronized (this) {
            dVar = this.f21383f;
        }
        if (dVar != null) {
            ((ke.y) dVar).cancel();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return new t(this.f21378a, this.f21379b, this.f21380c, this.f21381d);
    }

    public b i() {
        return new t(this.f21378a, this.f21379b, this.f21380c, this.f21381d);
    }
}
