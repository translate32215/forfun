package x4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import b2.t;
import ba.o0;
import ba.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import r1.c;
import r6.h;
import r6.l;
import r6.n;
import r6.o;
import s4.g;
import u6.b;
import v6.e0;
import v6.o;
import x4.c1;
import x4.r0;
import x4.s0;
import x4.y;
import y4.v;
import y4.x;
import z5.d0;
import z5.g0;
import z5.r;

/* compiled from: ExoPlayerImpl */
public final class w extends d {

    /* renamed from: b  reason: collision with root package name */
    public final o f27734b;

    /* renamed from: c  reason: collision with root package name */
    public final v0[] f27735c;

    /* renamed from: d  reason: collision with root package name */
    public final n f27736d;

    /* renamed from: e  reason: collision with root package name */
    public final t f27737e;

    /* renamed from: f  reason: collision with root package name */
    public final y.e f27738f;

    /* renamed from: g  reason: collision with root package name */
    public final y f27739g;

    /* renamed from: h  reason: collision with root package name */
    public final v6.o<r0.a, r0.b> f27740h;

    /* renamed from: i  reason: collision with root package name */
    public final c1.b f27741i;

    /* renamed from: j  reason: collision with root package name */
    public final List<a> f27742j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f27743k;

    /* renamed from: l  reason: collision with root package name */
    public final z5.w f27744l;

    /* renamed from: m  reason: collision with root package name */
    public final v f27745m;

    /* renamed from: n  reason: collision with root package name */
    public final Looper f27746n;

    /* renamed from: o  reason: collision with root package name */
    public final b f27747o;

    /* renamed from: p  reason: collision with root package name */
    public final v6.b f27748p;

    /* renamed from: q  reason: collision with root package name */
    public int f27749q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f27750r;

    /* renamed from: s  reason: collision with root package name */
    public int f27751s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f27752t;

    /* renamed from: u  reason: collision with root package name */
    public int f27753u;

    /* renamed from: v  reason: collision with root package name */
    public int f27754v;

    /* renamed from: w  reason: collision with root package name */
    public d0 f27755w;

    /* renamed from: x  reason: collision with root package name */
    public n0 f27756x;

    /* renamed from: y  reason: collision with root package name */
    public int f27757y;

    /* renamed from: z  reason: collision with root package name */
    public long f27758z;

    /* compiled from: ExoPlayerImpl */
    public static final class a implements j0 {

        /* renamed from: a  reason: collision with root package name */
        public final Object f27759a;

        /* renamed from: b  reason: collision with root package name */
        public c1 f27760b;

        public a(Object obj, c1 c1Var) {
            this.f27759a = obj;
            this.f27760b = c1Var;
        }

        public Object a() {
            return this.f27759a;
        }

        public c1 b() {
            return this.f27760b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public w(v0[] v0VarArr, n nVar, z5.w wVar, j jVar, b bVar, v vVar, boolean z10, z0 z0Var, d0 d0Var, long j10, boolean z11, v6.b bVar2, Looper looper, r0 r0Var) {
        v0[] v0VarArr2 = v0VarArr;
        b bVar3 = bVar;
        v vVar2 = vVar;
        v6.b bVar4 = bVar2;
        Looper looper2 = looper;
        r0 r0Var2 = r0Var;
        StringBuilder a10 = android.support.v4.media.a.a("Init ");
        a10.append(Integer.toHexString(System.identityHashCode(this)));
        a10.append(" [");
        a10.append("ExoPlayerLib/2.13.3");
        a10.append("] [");
        a10.append(e0.f26440e);
        a10.append("]");
        Log.i("ExoPlayerImpl", a10.toString());
        v6.a.d(v0VarArr2.length > 0);
        this.f27735c = v0VarArr2;
        nVar.getClass();
        this.f27736d = nVar;
        this.f27744l = wVar;
        this.f27747o = bVar3;
        this.f27745m = vVar2;
        this.f27743k = z10;
        this.f27746n = looper2;
        this.f27748p = bVar4;
        this.f27749q = 0;
        this.f27740h = new v6.o(new CopyOnWriteArraySet(), looper, bVar2, n.f27677a, new c(r0Var2));
        this.f27742j = new ArrayList();
        this.f27755w = new d0.a(0, new Random());
        o oVar = new o(new x0[v0VarArr2.length], new h[v0VarArr2.length], (Object) null);
        this.f27734b = oVar;
        this.f27741i = new c1.b();
        this.f27757y = -1;
        this.f27737e = bVar4.c(looper2, (Handler.Callback) null);
        r0.b bVar5 = new r0.b(this);
        this.f27738f = bVar5;
        this.f27756x = n0.i(oVar);
        if (vVar2 != null) {
            v6.a.d(vVar2.f28082g == null || vVar2.f28079d.f28085b.isEmpty());
            vVar2.f28082g = r0Var2;
            v6.o<x, x.b> oVar2 = vVar2.f28081f;
            vVar2.f28081f = new v6.o(oVar2.f26482e, looper, oVar2.f26478a, oVar2.f26480c, new g(vVar2, r0Var2));
            u(vVar2);
            bVar3.d(new Handler(looper2), vVar2);
        }
        y yVar = r1;
        y yVar2 = new y(v0VarArr, nVar, oVar, jVar, bVar, this.f27749q, this.f27750r, vVar, z0Var, d0Var, j10, z11, looper, bVar2, bVar5);
        this.f27739g = yVar;
    }

    public static boolean L(n0 n0Var) {
        return n0Var.f27682d == 3 && n0Var.f27689k && n0Var.f27690l == 0;
    }

    public Looper A() {
        return this.f27746n;
    }

    public boolean B() {
        return this.f27750r;
    }

    public long C() {
        if (this.f27756x.f27679a.q()) {
            return this.f27758z;
        }
        n0 n0Var = this.f27756x;
        if (n0Var.f27688j.f28630d != n0Var.f27680b.f28630d) {
            return n0Var.f27679a.n(D(), this.f27487a).b();
        }
        long j10 = n0Var.f27694p;
        if (this.f27756x.f27688j.a()) {
            n0 n0Var2 = this.f27756x;
            c1.b h10 = n0Var2.f27679a.h(n0Var2.f27688j.f28627a, this.f27741i);
            long d10 = h10.d(this.f27756x.f27688j.f28628b);
            j10 = d10 == Long.MIN_VALUE ? h10.f27465d : d10;
        }
        return N(this.f27756x.f27688j, j10);
    }

    public int D() {
        int J = J();
        if (J == -1) {
            return 0;
        }
        return J;
    }

    public l E() {
        return new l(this.f27756x.f27686h.f24682c);
    }

    public int F(int i10) {
        return this.f27735c[i10].g();
    }

    public long G() {
        if (this.f27756x.f27679a.q()) {
            return this.f27758z;
        }
        if (this.f27756x.f27680b.a()) {
            return f.c(this.f27756x.f27696r);
        }
        n0 n0Var = this.f27756x;
        return N(n0Var.f27680b, n0Var.f27696r);
    }

    public r0.c H() {
        return null;
    }

    public s0 I(s0.b bVar) {
        return new s0(this.f27739g, bVar, this.f27756x.f27679a, D(), this.f27748p, this.f27739g.f27774i);
    }

    public final int J() {
        if (this.f27756x.f27679a.q()) {
            return this.f27757y;
        }
        n0 n0Var = this.f27756x;
        return n0Var.f27679a.h(n0Var.f27680b.f28627a, this.f27741i).f27464c;
    }

    public final Pair<Object, Long> K(c1 c1Var, int i10, long j10) {
        if (c1Var.q()) {
            this.f27757y = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f27758z = j10;
            return null;
        }
        if (i10 == -1 || i10 >= c1Var.p()) {
            i10 = c1Var.a(this.f27750r);
            j10 = c1Var.n(i10, this.f27487a).a();
        }
        return c1Var.j(this.f27487a, this.f27741i, i10, f.b(j10));
    }

    public final n0 M(n0 n0Var, c1 c1Var, Pair<Object, Long> pair) {
        List list;
        long j10;
        c1 c1Var2 = c1Var;
        Pair<Object, Long> pair2 = pair;
        v6.a.a(c1Var.q() || pair2 != null);
        c1 c1Var3 = n0Var.f27679a;
        n0 h10 = n0Var.h(c1Var);
        if (c1Var.q()) {
            r.a aVar = n0.f27678s;
            r.a aVar2 = n0.f27678s;
            long b10 = f.b(this.f27758z);
            long b11 = f.b(this.f27758z);
            g0 g0Var = g0.f28588d;
            o oVar = this.f27734b;
            ba.a<Object> aVar3 = s.f3795b;
            n0 a10 = h10.b(aVar2, b10, b11, 0, g0Var, oVar, o0.f3765e).a(aVar2);
            a10.f27694p = a10.f27696r;
            return a10;
        }
        Object obj = h10.f27680b.f28627a;
        int i10 = e0.f26436a;
        boolean z10 = !obj.equals(pair2.first);
        r.a aVar4 = z10 ? new r.a(pair2.first) : h10.f27680b;
        long longValue = ((Long) pair2.second).longValue();
        long b12 = f.b(g());
        if (!c1Var3.q()) {
            b12 -= c1Var3.h(obj, this.f27741i).f27466e;
        }
        if (z10 || longValue < b12) {
            r.a aVar5 = aVar4;
            v6.a.d(!aVar5.a());
            g0 g0Var2 = z10 ? g0.f28588d : h10.f27685g;
            o oVar2 = z10 ? this.f27734b : h10.f27686h;
            if (z10) {
                ba.a<Object> aVar6 = s.f3795b;
                list = o0.f3765e;
            } else {
                list = h10.f27687i;
            }
            n0 a11 = h10.b(aVar5, longValue, longValue, 0, g0Var2, oVar2, list).a(aVar5);
            a11.f27694p = longValue;
            return a11;
        } else if (longValue == b12) {
            int b13 = c1Var2.b(h10.f27688j.f28627a);
            if (b13 != -1 && c1Var2.f(b13, this.f27741i).f27464c == c1Var2.h(aVar4.f28627a, this.f27741i).f27464c) {
                return h10;
            }
            c1Var2.h(aVar4.f28627a, this.f27741i);
            if (aVar4.a()) {
                j10 = this.f27741i.a(aVar4.f28628b, aVar4.f28629c);
            } else {
                j10 = this.f27741i.f27465d;
            }
            n0 a12 = h10.b(aVar4, h10.f27696r, h10.f27696r, j10 - h10.f27696r, h10.f27685g, h10.f27686h, h10.f27687i).a(aVar4);
            a12.f27694p = j10;
            return a12;
        } else {
            r.a aVar7 = aVar4;
            v6.a.d(!aVar7.a());
            long max = Math.max(0, h10.f27695q - (longValue - b12));
            long j11 = h10.f27694p;
            if (h10.f27688j.equals(h10.f27680b)) {
                j11 = longValue + max;
            }
            n0 b14 = h10.b(aVar7, longValue, longValue, max, h10.f27685g, h10.f27686h, h10.f27687i);
            b14.f27694p = j11;
            return b14;
        }
    }

    public final long N(r.a aVar, long j10) {
        long c10 = f.c(j10);
        this.f27756x.f27679a.h(aVar.f28627a, this.f27741i);
        return c10 + f.c(this.f27741i.f27466e);
    }

    public final void O(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f27742j.remove(i12);
        }
        this.f27755w = this.f27755w.a(i10, i11);
    }

    public void P(boolean z10, int i10, int i11) {
        n0 n0Var = this.f27756x;
        if (n0Var.f27689k != z10 || n0Var.f27690l != i10) {
            this.f27751s++;
            n0 d10 = n0Var.d(z10, i10);
            this.f27739g.f27772g.P(1, z10 ? 1 : 0, i10).sendToTarget();
            Q(d10, false, 4, 0, i11, false);
        }
    }

    public final void Q(n0 n0Var, boolean z10, int i10, int i11, int i12, boolean z11) {
        Pair pair;
        e0 e0Var;
        int i13;
        n0 n0Var2 = n0Var;
        int i14 = i10;
        n0 n0Var3 = this.f27756x;
        this.f27756x = n0Var2;
        boolean z12 = !n0Var3.f27679a.equals(n0Var2.f27679a);
        c1 c1Var = n0Var3.f27679a;
        c1 c1Var2 = n0Var2.f27679a;
        if (c1Var2.q() && c1Var.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (c1Var2.q() != c1Var.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            Object obj = c1Var.n(c1Var.h(n0Var3.f27680b.f28627a, this.f27741i).f27464c, this.f27487a).f27470a;
            Object obj2 = c1Var2.n(c1Var2.h(n0Var2.f27680b.f28627a, this.f27741i).f27464c, this.f27487a).f27470a;
            int i15 = this.f27487a.f27482m;
            if (!obj.equals(obj2)) {
                if (z10 && i14 == 0) {
                    i13 = 1;
                } else if (z10 && i14 == 1) {
                    i13 = 2;
                } else if (z12) {
                    i13 = 3;
                } else {
                    throw new IllegalStateException();
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
            } else if (z10 && i14 == 0 && c1Var2.b(n0Var2.f27680b.f28627a) == i15) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (!n0Var3.f27679a.equals(n0Var2.f27679a)) {
            this.f27740h.b(0, new p(n0Var2, i11, 0));
        }
        if (z10) {
            this.f27740h.b(12, new o(i14, 0));
        }
        if (booleanValue) {
            if (!n0Var2.f27679a.q()) {
                e0Var = n0Var2.f27679a.n(n0Var2.f27679a.h(n0Var2.f27680b.f28627a, this.f27741i).f27464c, this.f27487a).f27472c;
            } else {
                e0Var = null;
            }
            this.f27740h.b(1, new p(e0Var, intValue));
        }
        m mVar = n0Var3.f27683e;
        m mVar2 = n0Var2.f27683e;
        if (!(mVar == mVar2 || mVar2 == null)) {
            this.f27740h.b(11, new r(n0Var2, 2));
        }
        o oVar = n0Var3.f27686h;
        o oVar2 = n0Var2.f27686h;
        if (oVar != oVar2) {
            this.f27736d.a(oVar2.f24683d);
            this.f27740h.b(2, new q(n0Var2, new l(n0Var2.f27686h.f24682c)));
        }
        if (!n0Var3.f27687i.equals(n0Var2.f27687i)) {
            this.f27740h.b(3, new s(n0Var2, 3));
        }
        if (n0Var3.f27684f != n0Var2.f27684f) {
            this.f27740h.b(4, new r(n0Var2, 3));
        }
        if (!(n0Var3.f27682d == n0Var2.f27682d && n0Var3.f27689k == n0Var2.f27689k)) {
            this.f27740h.b(-1, new s(n0Var2, 4));
        }
        if (n0Var3.f27682d != n0Var2.f27682d) {
            this.f27740h.b(5, new r(n0Var2, 4));
        }
        if (n0Var3.f27689k != n0Var2.f27689k) {
            this.f27740h.b(6, new p(n0Var2, i12, 1));
        }
        if (n0Var3.f27690l != n0Var2.f27690l) {
            this.f27740h.b(7, new s(n0Var2, 0));
        }
        if (L(n0Var3) != L(n0Var)) {
            this.f27740h.b(8, new r(n0Var2, 0));
        }
        if (!n0Var3.f27691m.equals(n0Var2.f27691m)) {
            this.f27740h.b(13, new s(n0Var2, 1));
        }
        if (z11) {
            this.f27740h.b(-1, u.f27732a);
        }
        if (n0Var3.f27692n != n0Var2.f27692n) {
            this.f27740h.b(-1, new r(n0Var2, 1));
        }
        if (n0Var3.f27693o != n0Var2.f27693o) {
            this.f27740h.b(-1, new s(n0Var2, 2));
        }
        this.f27740h.a();
    }

    public int W() {
        return this.f27756x.f27682d;
    }

    public m a() {
        return this.f27756x.f27683e;
    }

    public void b() {
        n0 n0Var = this.f27756x;
        if (n0Var.f27682d == 1) {
            n0 e10 = n0Var.e((m) null);
            n0 g10 = e10.g(e10.f27679a.q() ? 4 : 2);
            this.f27751s++;
            this.f27739g.f27772g.O(0).sendToTarget();
            Q(g10, false, 4, 1, 1, false);
        }
    }

    public void c(boolean z10) {
        P(z10, 0, 1);
    }

    public r0.d d() {
        return null;
    }

    public boolean e() {
        return this.f27756x.f27680b.a();
    }

    public o0 f() {
        return this.f27756x.f27691m;
    }

    public long g() {
        if (!e()) {
            return G();
        }
        n0 n0Var = this.f27756x;
        n0Var.f27679a.h(n0Var.f27680b.f28627a, this.f27741i);
        n0 n0Var2 = this.f27756x;
        if (n0Var2.f27681c == -9223372036854775807L) {
            return n0Var2.f27679a.n(D(), this.f27487a).a();
        }
        return f.c(this.f27741i.f27466e) + f.c(this.f27756x.f27681c);
    }

    public long h() {
        return f.c(this.f27756x.f27695q);
    }

    public void i(int i10, long j10) {
        c1 c1Var = this.f27756x.f27679a;
        if (i10 < 0 || (!c1Var.q() && i10 >= c1Var.p())) {
            throw new c0(c1Var, i10, j10);
        }
        int i11 = 1;
        this.f27751s++;
        if (e()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            y.d dVar = new y.d(this.f27756x);
            dVar.a(1);
            w wVar = (w) ((r0.b) this.f27738f).f24479b;
            ((Handler) wVar.f27737e.f3445b).post(new c1.b(wVar, dVar));
            return;
        }
        n0 n0Var = this.f27756x;
        if (n0Var.f27682d != 1) {
            i11 = 2;
        }
        n0 M = M(n0Var.g(i11), c1Var, K(c1Var, i10, j10));
        this.f27739g.f27772g.Q(3, new y.g(c1Var, i10, f.b(j10))).sendToTarget();
        Q(M, true, 1, 0, 1, true);
    }

    public boolean k() {
        return this.f27756x.f27689k;
    }

    public void l(boolean z10) {
        if (this.f27750r != z10) {
            this.f27750r = z10;
            this.f27739g.f27772g.P(12, z10 ? 1 : 0, 0).sendToTarget();
            v6.o<r0.a, r0.b> oVar = this.f27740h;
            oVar.b(10, new t(z10));
            oVar.a();
        }
    }

    public List<q5.a> m() {
        return this.f27756x.f27687i;
    }

    public long n0() {
        if (e()) {
            n0 n0Var = this.f27756x;
            r.a aVar = n0Var.f27680b;
            n0Var.f27679a.h(aVar.f28627a, this.f27741i);
            return f.c(this.f27741i.a(aVar.f28628b, aVar.f28629c));
        }
        c1 z10 = z();
        if (z10.q()) {
            return -9223372036854775807L;
        }
        return z10.n(D(), this.f27487a).b();
    }

    public int o() {
        if (this.f27756x.f27679a.q()) {
            return 0;
        }
        n0 n0Var = this.f27756x;
        return n0Var.f27679a.b(n0Var.f27680b.f28627a);
    }

    public void q(r0.a aVar) {
        v6.o<r0.a, r0.b> oVar = this.f27740h;
        Iterator<o.c<T, E>> it = oVar.f26482e.iterator();
        while (it.hasNext()) {
            o.c next = it.next();
            if (next.f26486a.equals(aVar)) {
                o.b<T, E> bVar = oVar.f26481d;
                next.f26489d = true;
                if (next.f26488c) {
                    bVar.c(next.f26486a, next.f26487b);
                }
                oVar.f26482e.remove(next);
            }
        }
    }

    public int r() {
        if (e()) {
            return this.f27756x.f27680b.f28628b;
        }
        return -1;
    }

    public void s(int i10) {
        if (this.f27749q != i10) {
            this.f27749q = i10;
            this.f27739g.f27772g.P(11, i10, 0).sendToTarget();
            v6.o<r0.a, r0.b> oVar = this.f27740h;
            oVar.b(9, new o(i10, 1));
            oVar.a();
        }
    }

    public void u(r0.a aVar) {
        v6.o<r0.a, r0.b> oVar = this.f27740h;
        if (!oVar.f26485h) {
            aVar.getClass();
            oVar.f26482e.add(new o.c(aVar, oVar.f26480c));
        }
    }

    public int v() {
        if (e()) {
            return this.f27756x.f27680b.f28629c;
        }
        return -1;
    }

    public int w() {
        return this.f27756x.f27690l;
    }

    public g0 x() {
        return this.f27756x.f27685g;
    }

    public int y() {
        return this.f27749q;
    }

    public c1 z() {
        return this.f27756x.f27679a;
    }
}
