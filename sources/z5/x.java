package z5;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import c5.j;
import c5.l;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.r;
import d5.i;
import d5.k;
import d5.w;
import d5.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m3.t;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import u6.f;
import u6.h;
import v6.e0;
import v6.s;
import x4.b0;
import x4.m0;
import x4.z0;
import z5.a0;
import z5.j;
import z5.o;
import z5.v;

/* compiled from: ProgressiveMediaPeriod */
public final class x implements o, k, n.b<a>, n.f, a0.b {

    /* renamed from: a0  reason: collision with root package name */
    public static final Map<String, String> f28654a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final b0 f28655b0;
    public a0[] A;
    public d[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public e F;
    public d5.x G;
    public long H;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f28656a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.e f28657b;

    /* renamed from: c  reason: collision with root package name */
    public final l f28658c;

    /* renamed from: d  reason: collision with root package name */
    public final h f28659d;

    /* renamed from: e  reason: collision with root package name */
    public final v.a f28660e;

    /* renamed from: f  reason: collision with root package name */
    public final j.a f28661f;

    /* renamed from: g  reason: collision with root package name */
    public final b f28662g;

    /* renamed from: h  reason: collision with root package name */
    public final f f28663h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28664i;

    /* renamed from: r  reason: collision with root package name */
    public final long f28665r;

    /* renamed from: s  reason: collision with root package name */
    public final n f28666s = new n("Loader:ProgressiveMediaPeriod");

    /* renamed from: t  reason: collision with root package name */
    public final c f28667t;

    /* renamed from: u  reason: collision with root package name */
    public final v6.f f28668u;

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f28669v;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f28670w;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f28671x;

    /* renamed from: y  reason: collision with root package name */
    public o.a f28672y;

    /* renamed from: z  reason: collision with root package name */
    public u5.b f28673z;

    /* compiled from: ProgressiveMediaPeriod */
    public final class a implements n.e, j.a {

        /* renamed from: a  reason: collision with root package name */
        public final long f28674a = k.a();

        /* renamed from: b  reason: collision with root package name */
        public final Uri f28675b;

        /* renamed from: c  reason: collision with root package name */
        public final r f28676c;

        /* renamed from: d  reason: collision with root package name */
        public final c f28677d;

        /* renamed from: e  reason: collision with root package name */
        public final k f28678e;

        /* renamed from: f  reason: collision with root package name */
        public final v6.f f28679f;

        /* renamed from: g  reason: collision with root package name */
        public final w f28680g = new w(0);

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f28681h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f28682i = true;

        /* renamed from: j  reason: collision with root package name */
        public long f28683j;

        /* renamed from: k  reason: collision with root package name */
        public u6.e f28684k = c(0);

        /* renamed from: l  reason: collision with root package name */
        public long f28685l = -1;

        /* renamed from: m  reason: collision with root package name */
        public d5.a0 f28686m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f28687n;

        public a(Uri uri, com.google.android.exoplayer2.upstream.e eVar, c cVar, k kVar, v6.f fVar) {
            this.f28675b = uri;
            this.f28676c = new r(eVar);
            this.f28677d = cVar;
            this.f28678e = kVar;
            this.f28679f = fVar;
        }

        public void a() throws IOException {
            com.google.android.exoplayer2.upstream.c cVar;
            int i10;
            int i11 = 0;
            while (i11 == 0 && !this.f28681h) {
                try {
                    long j10 = this.f28680g.f13063a;
                    u6.e c10 = c(j10);
                    this.f28684k = c10;
                    long O = this.f28676c.O(c10);
                    this.f28685l = O;
                    if (O != -1) {
                        this.f28685l = O + j10;
                    }
                    x.this.f28673z = u5.b.a(this.f28676c.N());
                    r rVar = this.f28676c;
                    u5.b bVar = x.this.f28673z;
                    if (bVar == null || (i10 = bVar.f26034f) == -1) {
                        cVar = rVar;
                    } else {
                        cVar = new j(rVar, i10, this);
                        d5.a0 z10 = x.this.z(new d(0, true));
                        this.f28686m = z10;
                        z10.c(x.f28655b0);
                    }
                    c cVar2 = this.f28677d;
                    Uri uri = this.f28675b;
                    Map<String, List<String>> N = this.f28676c.N();
                    long j11 = this.f28685l;
                    long j12 = j10;
                    cVar2.b(cVar, uri, N, j10, j11, this.f28678e);
                    if (x.this.f28673z != null) {
                        i iVar = this.f28677d.f28545b;
                        if (iVar instanceof j5.d) {
                            ((j5.d) iVar).f19557r = true;
                        }
                    }
                    if (this.f28682i) {
                        c cVar3 = this.f28677d;
                        long j13 = this.f28683j;
                        i iVar2 = cVar3.f28545b;
                        iVar2.getClass();
                        iVar2.h(j12, j13);
                        this.f28682i = false;
                    }
                    while (true) {
                        long j14 = j12;
                        while (i11 == 0 && !this.f28681h) {
                            this.f28679f.a();
                            c cVar4 = this.f28677d;
                            w wVar = this.f28680g;
                            i iVar3 = cVar4.f28545b;
                            iVar3.getClass();
                            d5.j jVar = cVar4.f28546c;
                            jVar.getClass();
                            i11 = iVar3.f(jVar, wVar);
                            j12 = this.f28677d.a();
                            if (j12 > x.this.f28665r + j14) {
                                this.f28679f.b();
                                x xVar = x.this;
                                xVar.f28671x.post(xVar.f28670w);
                            }
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (this.f28677d.a() != -1) {
                        this.f28680g.f13063a = this.f28677d.a();
                    }
                    r rVar2 = this.f28676c;
                    if (rVar2 != null) {
                        try {
                            rVar2.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i11 == 1 || this.f28677d.a() == -1)) {
                        this.f28680g.f13063a = this.f28677d.a();
                    }
                    r rVar3 = this.f28676c;
                    int i12 = e0.f26436a;
                    if (rVar3 != null) {
                        try {
                            rVar3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
        }

        public void b() {
            this.f28681h = true;
        }

        public final u6.e c(long j10) {
            Collections.emptyMap();
            Uri uri = this.f28675b;
            String str = x.this.f28664i;
            Map<String, String> map = x.f28654a0;
            v6.a.g(uri, "The uri must be set.");
            return new u6.e(uri, 0, 1, (byte[]) null, map, j10, -1, str, 6, (Object) null);
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    public interface b {
    }

    /* compiled from: ProgressiveMediaPeriod */
    public final class c implements b0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f28689a;

        public c(int i10) {
            this.f28689a = i10;
        }

        public void b() throws IOException {
            x xVar = x.this;
            xVar.A[this.f28689a].x();
            xVar.f28666s.f(((com.google.android.exoplayer2.upstream.k) xVar.f28659d).a(xVar.J));
        }

        public int d(t tVar, a5.f fVar, boolean z10) {
            x xVar = x.this;
            int i10 = this.f28689a;
            if (xVar.C()) {
                return -3;
            }
            xVar.w(i10);
            int B = xVar.A[i10].B(tVar, fVar, z10, xVar.S);
            if (B == -3) {
                xVar.x(i10);
            }
            return B;
        }

        public boolean isReady() {
            x xVar = x.this;
            return !xVar.C() && xVar.A[this.f28689a].v(xVar.S);
        }

        public int l(long j10) {
            x xVar = x.this;
            int i10 = this.f28689a;
            if (xVar.C()) {
                return 0;
            }
            xVar.w(i10);
            a0 a0Var = xVar.A[i10];
            int r10 = a0Var.r(j10, xVar.S);
            a0Var.H(r10);
            if (r10 != 0) {
                return r10;
            }
            xVar.x(i10);
            return r10;
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f28691a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f28692b;

        public d(int i10, boolean z10) {
            this.f28691a = i10;
            this.f28692b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f28691a == dVar.f28691a && this.f28692b == dVar.f28692b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f28691a * 31) + (this.f28692b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final g0 f28693a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f28694b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f28695c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f28696d;

        public e(g0 g0Var, boolean[] zArr) {
            this.f28693a = g0Var;
            this.f28694b = zArr;
            int i10 = g0Var.f28589a;
            this.f28695c = new boolean[i10];
            this.f28696d = new boolean[i10];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f28654a0 = Collections.unmodifiableMap(hashMap);
        b0.b bVar = new b0.b();
        bVar.f27415a = "icy";
        bVar.f27425k = "application/x-icy";
        f28655b0 = bVar.a();
    }

    public x(Uri uri, com.google.android.exoplayer2.upstream.e eVar, d5.o oVar, l lVar, j.a aVar, h hVar, v.a aVar2, b bVar, f fVar, String str, int i10) {
        this.f28656a = uri;
        this.f28657b = eVar;
        this.f28658c = lVar;
        this.f28661f = aVar;
        this.f28659d = hVar;
        this.f28660e = aVar2;
        this.f28662g = bVar;
        this.f28663h = fVar;
        this.f28664i = str;
        this.f28665r = (long) i10;
        this.f28667t = new c(oVar);
        this.f28668u = new v6.f();
        this.f28669v = new androidx.activity.f(this);
        this.f28670w = new androidx.activity.c(this);
        this.f28671x = e0.l();
        this.B = new d[0];
        this.A = new a0[0];
        this.P = -9223372036854775807L;
        this.N = -1;
        this.H = -9223372036854775807L;
        this.J = 1;
    }

    public void A(long j10, boolean z10) {
        p();
        if (!t()) {
            boolean[] zArr = this.F.f28695c;
            int length = this.A.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.A[i10].h(j10, z10, zArr[i10]);
            }
        }
    }

    public final void B() {
        a aVar = new a(this.f28656a, this.f28657b, this.f28667t, this, this.f28668u);
        if (this.D) {
            v6.a.d(t());
            long j10 = this.H;
            if (j10 == -9223372036854775807L || this.P <= j10) {
                d5.x xVar = this.G;
                xVar.getClass();
                long j11 = xVar.j(this.P).f13064a.f13070b;
                long j12 = this.P;
                aVar.f28680g.f13063a = j11;
                aVar.f28683j = j12;
                aVar.f28682i = true;
                aVar.f28687n = false;
                for (a0 a0Var : this.A) {
                    a0Var.f28535u = this.P;
                }
                this.P = -9223372036854775807L;
            } else {
                this.S = true;
                this.P = -9223372036854775807L;
                return;
            }
        }
        this.R = q();
        long h10 = this.f28666s.h(aVar, this, ((com.google.android.exoplayer2.upstream.k) this.f28659d).a(this.J));
        this.f28660e.n(new k(aVar.f28674a, aVar.f28684k, h10), 1, -1, (b0) null, 0, (Object) null, aVar.f28683j, this.H);
    }

    public final boolean C() {
        return this.L || t();
    }

    public long D(long j10) {
        boolean z10;
        p();
        boolean[] zArr = this.F.f28694b;
        if (!this.G.b()) {
            j10 = 0;
        }
        this.L = false;
        this.O = j10;
        if (t()) {
            this.P = j10;
            return j10;
        }
        if (this.J != 7) {
            int length = this.A.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = true;
                    break;
                } else if (this.A[i10].F(j10, false) || (!zArr[i10] && this.E)) {
                    i10++;
                }
            }
            z10 = false;
            if (z10) {
                return j10;
            }
        }
        this.Q = false;
        this.P = j10;
        this.S = false;
        if (this.f28666s.e()) {
            for (a0 i11 : this.A) {
                i11.i();
            }
            this.f28666s.a();
        } else {
            this.f28666s.f5533c = null;
            for (a0 D2 : this.A) {
                D2.D(false);
            }
        }
        return j10;
    }

    public void E(o.a aVar, long j10) {
        this.f28672y = aVar;
        this.f28668u.c();
        B();
    }

    public long a() {
        if (this.M == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    public void b(d5.x xVar) {
        this.f28671x.post(new f0.i(this, xVar));
    }

    public long c(long j10, z0 z0Var) {
        p();
        if (!this.G.b()) {
            return 0;
        }
        x.a j11 = this.G.j(j10);
        return z0Var.a(j10, j11.f13064a.f13069a, j11.f13065b.f13069a);
    }

    public void d() {
        this.C = true;
        this.f28671x.post(this.f28669v);
    }

    public long e() {
        long j10;
        boolean z10;
        p();
        boolean[] zArr = this.F.f28694b;
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.P;
        }
        if (this.E) {
            int length = this.A.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10]) {
                    a0 a0Var = this.A[i10];
                    synchronized (a0Var) {
                        z10 = a0Var.f28538x;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.A[i10].n());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = s();
        }
        return j10 == Long.MIN_VALUE ? this.O : j10;
    }

    public boolean f(long j10) {
        if (this.S || this.f28666s.d() || this.Q) {
            return false;
        }
        if (this.D && this.M == 0) {
            return false;
        }
        boolean c10 = this.f28668u.c();
        if (this.f28666s.e()) {
            return c10;
        }
        B();
        return true;
    }

    public void g(long j10) {
    }

    public void h() {
        for (a0 C2 : this.A) {
            C2.C();
        }
        c cVar = this.f28667t;
        i iVar = cVar.f28545b;
        if (iVar != null) {
            iVar.a();
            cVar.f28545b = null;
        }
        cVar.f28546c = null;
    }

    public long i(r6.h[] hVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j10) {
        p();
        e eVar = this.F;
        g0 g0Var = eVar.f28693a;
        boolean[] zArr3 = eVar.f28695c;
        int i10 = this.M;
        int i11 = 0;
        for (int i12 = 0; i12 < hVarArr.length; i12++) {
            if (b0VarArr[i12] != null && (hVarArr[i12] == null || !zArr[i12])) {
                int i13 = b0VarArr[i12].f28689a;
                v6.a.d(zArr3[i13]);
                this.M--;
                zArr3[i13] = false;
                b0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.K ? j10 != 0 : i10 == 0;
        for (int i14 = 0; i14 < hVarArr.length; i14++) {
            if (b0VarArr[i14] == null && hVarArr[i14] != null) {
                r6.h hVar = hVarArr[i14];
                v6.a.d(hVar.length() == 1);
                v6.a.d(hVar.f(0) == 0);
                int a10 = g0Var.a(hVar.j());
                v6.a.d(!zArr3[a10]);
                this.M++;
                zArr3[a10] = true;
                b0VarArr[i14] = new c(a10);
                zArr2[i14] = true;
                if (!z10) {
                    a0 a0Var = this.A[a10];
                    z10 = !a0Var.F(j10, true) && a0Var.p() != 0;
                }
            }
        }
        if (this.M == 0) {
            this.Q = false;
            this.L = false;
            if (this.f28666s.e()) {
                a0[] a0VarArr = this.A;
                int length = a0VarArr.length;
                while (i11 < length) {
                    a0VarArr[i11].i();
                    i11++;
                }
                this.f28666s.a();
            } else {
                for (a0 D2 : this.A) {
                    D2.D(false);
                }
            }
        } else if (z10) {
            j10 = D(j10);
            while (i11 < b0VarArr.length) {
                if (b0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.K = true;
        return j10;
    }

    public boolean j() {
        boolean z10;
        if (this.f28666s.e()) {
            v6.f fVar = this.f28668u;
            synchronized (fVar) {
                z10 = fVar.f26451b;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void k(n.e eVar, long j10, long j11, boolean z10) {
        a aVar = (a) eVar;
        r rVar = aVar.f28676c;
        k kVar = new k(aVar.f28674a, aVar.f28684k, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f28659d.getClass();
        this.f28660e.e(kVar, 1, -1, (b0) null, 0, (Object) null, aVar.f28683j, this.H);
        if (!z10) {
            if (this.N == -1) {
                this.N = aVar.f28685l;
            }
            for (a0 D2 : this.A) {
                D2.D(false);
            }
            if (this.M > 0) {
                o.a aVar2 = this.f28672y;
                aVar2.getClass();
                aVar2.d(this);
            }
        }
    }

    public d5.a0 l(int i10, int i11) {
        return z(new d(i10, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.upstream.n.c m(com.google.android.exoplayer2.upstream.n.e r26, long r27, long r29, java.io.IOException r31, int r32) {
        /*
            r25 = this;
            r0 = r25
            r12 = r31
            r1 = r26
            z5.x$a r1 = (z5.x.a) r1
            long r2 = r0.N
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0014
            long r2 = r1.f28685l
            r0.N = r2
        L_0x0014:
            com.google.android.exoplayer2.upstream.r r2 = r1.f28676c
            z5.k r3 = new z5.k
            long r14 = r1.f28674a
            u6.e r6 = r1.f28684k
            android.net.Uri r7 = r2.f5559c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8 = r2.f5560d
            long r9 = r2.f5558b
            r13 = r3
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r27
            r21 = r29
            r23 = r9
            r13.<init>(r14, r16, r17, r18, r19, r21, r23)
            long r6 = r1.f28683j
            x4.f.c(r6)
            long r6 = r0.H
            x4.f.c(r6)
            u6.h r2 = r0.f28659d
            com.google.android.exoplayer2.upstream.k r2 = (com.google.android.exoplayer2.upstream.k) r2
            boolean r2 = r12 instanceof x4.m0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x0063
            boolean r2 = r12 instanceof java.io.FileNotFoundException
            if (r2 != 0) goto L_0x0063
            boolean r2 = r12 instanceof com.google.android.exoplayer2.upstream.m.b
            if (r2 != 0) goto L_0x0063
            boolean r2 = r12 instanceof com.google.android.exoplayer2.upstream.n.h
            if (r2 == 0) goto L_0x0056
            goto L_0x0063
        L_0x0056:
            r2 = -1
            r8 = 1000(0x3e8, float:1.401E-42)
            r9 = 5000(0x1388, float:7.006E-42)
            r10 = r32
            int r2 = c5.c.a(r10, r2, r8, r9)
            long r8 = (long) r2
            goto L_0x0064
        L_0x0063:
            r8 = r6
        L_0x0064:
            r2 = 1
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x006d
            com.google.android.exoplayer2.upstream.n$c r2 = com.google.android.exoplayer2.upstream.n.f5530f
        L_0x006b:
            r14 = r2
            goto L_0x00c9
        L_0x006d:
            int r10 = r25.q()
            int r11 = r0.R
            r13 = 0
            if (r10 <= r11) goto L_0x0078
            r11 = 1
            goto L_0x0079
        L_0x0078:
            r11 = 0
        L_0x0079:
            long r14 = r0.N
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x00bc
            d5.x r4 = r0.G
            if (r4 == 0) goto L_0x008c
            long r4 = r4.c()
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 == 0) goto L_0x008c
            goto L_0x00bc
        L_0x008c:
            boolean r4 = r0.D
            if (r4 == 0) goto L_0x0099
            boolean r4 = r25.C()
            if (r4 != 0) goto L_0x0099
            r0.Q = r2
            goto L_0x00bf
        L_0x0099:
            boolean r4 = r0.D
            r0.L = r4
            r4 = 0
            r0.O = r4
            r0.R = r13
            z5.a0[] r6 = r0.A
            int r7 = r6.length
            r10 = 0
        L_0x00a7:
            if (r10 >= r7) goto L_0x00b1
            r14 = r6[r10]
            r14.D(r13)
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x00b1:
            d5.w r6 = r1.f28680g
            r6.f13063a = r4
            r1.f28683j = r4
            r1.f28682i = r2
            r1.f28687n = r13
            goto L_0x00be
        L_0x00bc:
            r0.R = r10
        L_0x00be:
            r13 = 1
        L_0x00bf:
            if (r13 == 0) goto L_0x00c6
            com.google.android.exoplayer2.upstream.n$c r2 = com.google.android.exoplayer2.upstream.n.c(r11, r8)
            goto L_0x006b
        L_0x00c6:
            com.google.android.exoplayer2.upstream.n$c r2 = com.google.android.exoplayer2.upstream.n.f5529e
            goto L_0x006b
        L_0x00c9:
            boolean r2 = r14.a()
            r15 = r2 ^ 1
            z5.v$a r2 = r0.f28660e
            r4 = 1
            r5 = -1
            r6 = 0
            r7 = 0
            long r8 = r1.f28683j
            long r10 = r0.H
            r13 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            r12 = r31
            r13 = r15
            r1.j(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x00ee
            u6.h r1 = r0.f28659d
            r1.getClass()
        L_0x00ee:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.x.m(com.google.android.exoplayer2.upstream.n$e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.n$c");
    }

    public void n(n.e eVar, long j10, long j11) {
        d5.x xVar;
        a aVar = (a) eVar;
        if (this.H == -9223372036854775807L && (xVar = this.G) != null) {
            boolean b10 = xVar.b();
            long s10 = s();
            long j12 = s10 == Long.MIN_VALUE ? 0 : s10 + 10000;
            this.H = j12;
            ((y) this.f28662g).y(j12, b10, this.I);
        }
        r rVar = aVar.f28676c;
        k kVar = new k(aVar.f28674a, aVar.f28684k, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f28659d.getClass();
        this.f28660e.h(kVar, 1, -1, (b0) null, 0, (Object) null, aVar.f28683j, this.H);
        if (this.N == -1) {
            this.N = aVar.f28685l;
        }
        this.S = true;
        o.a aVar2 = this.f28672y;
        aVar2.getClass();
        aVar2.d(this);
    }

    public void o(b0 b0Var) {
        this.f28671x.post(this.f28669v);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void p() {
        v6.a.d(this.D);
        this.F.getClass();
        this.G.getClass();
    }

    public final int q() {
        int i10 = 0;
        for (a0 t10 : this.A) {
            i10 += t10.t();
        }
        return i10;
    }

    public long r() {
        if (!this.L) {
            return -9223372036854775807L;
        }
        if (!this.S && q() <= this.R) {
            return -9223372036854775807L;
        }
        this.L = false;
        return this.O;
    }

    public final long s() {
        long j10 = Long.MIN_VALUE;
        for (a0 n10 : this.A) {
            j10 = Math.max(j10, n10.n());
        }
        return j10;
    }

    public final boolean t() {
        return this.P != -9223372036854775807L;
    }

    public final void u() {
        q5.a aVar;
        if (!this.Z && !this.D && this.C && this.G != null) {
            a0[] a0VarArr = this.A;
            int length = a0VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (a0VarArr[i10].s() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            this.f28668u.b();
            int length2 = this.A.length;
            f0[] f0VarArr = new f0[length2];
            boolean[] zArr = new boolean[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                b0 s10 = this.A[i11].s();
                s10.getClass();
                String str = s10.f27408t;
                boolean k10 = s.k(str);
                boolean z10 = k10 || s.m(str);
                zArr[i11] = z10;
                this.E = z10 | this.E;
                u5.b bVar = this.f28673z;
                if (bVar != null) {
                    if (k10 || this.B[i11].f28692b) {
                        q5.a aVar2 = s10.f27406r;
                        if (aVar2 == null) {
                            aVar = new q5.a(bVar);
                        } else {
                            aVar = aVar2.a(bVar);
                        }
                        b0.b a10 = s10.a();
                        a10.f27423i = aVar;
                        s10 = a10.a();
                    }
                    if (k10 && s10.f27402f == -1 && s10.f27403g == -1 && bVar.f26029a != -1) {
                        b0.b a11 = s10.a();
                        a11.f27420f = bVar.f26029a;
                        s10 = a11.a();
                    }
                }
                f0VarArr[i11] = new f0(s10.b(this.f28658c.c(s10)));
            }
            this.F = new e(new g0(f0VarArr), zArr);
            this.D = true;
            o.a aVar3 = this.f28672y;
            aVar3.getClass();
            aVar3.k(this);
        }
    }

    public g0 v() {
        p();
        return this.F.f28693a;
    }

    public final void w(int i10) {
        p();
        e eVar = this.F;
        boolean[] zArr = eVar.f28696d;
        if (!zArr[i10]) {
            b0 b0Var = eVar.f28693a.f28590b[i10].f28584b[0];
            this.f28660e.b(s.i(b0Var.f27408t), b0Var, 0, (Object) null, this.O);
            zArr[i10] = true;
        }
    }

    public final void x(int i10) {
        p();
        boolean[] zArr = this.F.f28694b;
        if (this.Q && zArr[i10] && !this.A[i10].v(false)) {
            this.P = 0;
            this.Q = false;
            this.L = true;
            this.O = 0;
            this.R = 0;
            for (a0 D2 : this.A) {
                D2.D(false);
            }
            o.a aVar = this.f28672y;
            aVar.getClass();
            aVar.d(this);
        }
    }

    public void y() throws IOException {
        this.f28666s.f(((com.google.android.exoplayer2.upstream.k) this.f28659d).a(this.J));
        if (this.S && !this.D) {
            throw new m0("Loading finished before preparation is complete.");
        }
    }

    public final d5.a0 z(d dVar) {
        int length = this.A.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.B[i10])) {
                return this.A[i10];
            }
        }
        f fVar = this.f28663h;
        Looper looper = this.f28671x.getLooper();
        l lVar = this.f28658c;
        j.a aVar = this.f28661f;
        looper.getClass();
        lVar.getClass();
        aVar.getClass();
        a0 a0Var = new a0(fVar, looper, lVar, aVar);
        a0Var.f28520f = this;
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.B, i11);
        dVarArr[length] = dVar;
        int i12 = e0.f26436a;
        this.B = dVarArr;
        a0[] a0VarArr = (a0[]) Arrays.copyOf(this.A, i11);
        a0VarArr[length] = a0Var;
        this.A = a0VarArr;
        return a0Var;
    }
}
