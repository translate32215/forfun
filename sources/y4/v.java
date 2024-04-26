package y4;

import a5.d;
import a5.g;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import ba.o0;
import ba.p0;
import ba.u;
import c5.j;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import r6.l;
import u6.b;
import v6.e0;
import v6.o;
import w6.s;
import x4.b0;
import x4.c1;
import x4.f;
import x4.m;
import x4.q;
import x4.q0;
import x4.r0;
import y4.x;
import z4.k;
import z5.g0;
import z5.n;
import z5.p;
import z5.r;

/* compiled from: AnalyticsCollector */
public class v implements r0.a, k, s, z5.v, b.a, j {

    /* renamed from: a  reason: collision with root package name */
    public final v6.b f28076a;

    /* renamed from: b  reason: collision with root package name */
    public final c1.b f28077b;

    /* renamed from: c  reason: collision with root package name */
    public final c1.c f28078c = new c1.c();

    /* renamed from: d  reason: collision with root package name */
    public final a f28079d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<x.a> f28080e;

    /* renamed from: f  reason: collision with root package name */
    public o<x, x.b> f28081f;

    /* renamed from: g  reason: collision with root package name */
    public r0 f28082g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f28083h;

    /* compiled from: AnalyticsCollector */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c1.b f28084a;

        /* renamed from: b  reason: collision with root package name */
        public ba.s<r.a> f28085b = o0.f3765e;

        /* renamed from: c  reason: collision with root package name */
        public u<r.a, c1> f28086c = p0.f3768g;

        /* renamed from: d  reason: collision with root package name */
        public r.a f28087d;

        /* renamed from: e  reason: collision with root package name */
        public r.a f28088e;

        /* renamed from: f  reason: collision with root package name */
        public r.a f28089f;

        public a(c1.b bVar) {
            this.f28084a = bVar;
            ba.a<Object> aVar = ba.s.f3795b;
        }

        public static r.a b(r0 r0Var, ba.s<r.a> sVar, r.a aVar, c1.b bVar) {
            c1 z10 = r0Var.z();
            int o10 = r0Var.o();
            Object m10 = z10.q() ? null : z10.m(o10);
            int b10 = (r0Var.e() || z10.q()) ? -1 : z10.f(o10, bVar).b(f.b(r0Var.G()) - bVar.f27466e);
            for (int i10 = 0; i10 < sVar.size(); i10++) {
                r.a aVar2 = sVar.get(i10);
                if (c(aVar2, m10, r0Var.e(), r0Var.r(), r0Var.v(), b10)) {
                    return aVar2;
                }
            }
            if (sVar.isEmpty() && aVar != null) {
                if (c(aVar, m10, r0Var.e(), r0Var.r(), r0Var.v(), b10)) {
                    return aVar;
                }
            }
            return null;
        }

        public static boolean c(r.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!aVar.f28627a.equals(obj)) {
                return false;
            }
            if ((z10 && aVar.f28628b == i10 && aVar.f28629c == i11) || (!z10 && aVar.f28628b == -1 && aVar.f28631e == i12)) {
                return true;
            }
            return false;
        }

        public final void a(u.a<r.a, c1> aVar, r.a aVar2, c1 c1Var) {
            if (aVar2 != null) {
                if (c1Var.b(aVar2.f28627a) != -1) {
                    aVar.c(aVar2, c1Var);
                    return;
                }
                c1 c1Var2 = this.f28086c.get(aVar2);
                if (c1Var2 != null) {
                    aVar.c(aVar2, c1Var2);
                }
            }
        }

        public final void d(c1 c1Var) {
            u.a aVar = new u.a(4);
            if (this.f28085b.isEmpty()) {
                a(aVar, this.f28088e, c1Var);
                if (!aa.f.a(this.f28089f, this.f28088e)) {
                    a(aVar, this.f28089f, c1Var);
                }
                if (!aa.f.a(this.f28087d, this.f28088e) && !aa.f.a(this.f28087d, this.f28089f)) {
                    a(aVar, this.f28087d, c1Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f28085b.size(); i10++) {
                    a(aVar, this.f28085b.get(i10), c1Var);
                }
                if (!this.f28085b.contains(this.f28087d)) {
                    a(aVar, this.f28087d, c1Var);
                }
            }
            this.f28086c = aVar.a();
        }
    }

    public v(v6.b bVar) {
        this.f28076a = bVar;
        this.f28081f = new o(new CopyOnWriteArraySet(), e0.t(), bVar, a.f28008a, m.f28048a);
        c1.b bVar2 = new c1.b();
        this.f28077b = bVar2;
        this.f28079d = new a(bVar2);
        this.f28080e = new SparseArray<>();
    }

    public final void A(b0 b0Var, g gVar) {
        x.a e02 = e0();
        b bVar = new b(e02, b0Var, gVar, 1);
        this.f28080e.put(1010, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1010, bVar);
        oVar.a();
    }

    public final void B(int i10, r.a aVar, z5.k kVar, n nVar) {
        x.a c02 = c0(i10, aVar);
        d dVar = new d(c02, kVar, nVar, 1);
        this.f28080e.put(1000, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1000, dVar);
        oVar.a();
    }

    public final void C(int i10) {
        x.a Y = Y();
        o oVar = new o(Y, i10, 4);
        this.f28080e.put(5, Y);
        o<x, x.b> oVar2 = this.f28081f;
        oVar2.b(5, oVar);
        oVar2.a();
    }

    public final void D(boolean z10, int i10) {
        x.a Y = Y();
        f fVar = new f(Y, z10, i10, 0);
        this.f28080e.put(6, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(6, fVar);
        oVar.a();
    }

    public final void E(int i10, r.a aVar) {
        x.a c02 = c0(i10, aVar);
        l lVar = new l(c02, 3);
        this.f28080e.put(1035, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1035, lVar);
        oVar.a();
    }

    public final void F(c1 c1Var, int i10) {
        a aVar = this.f28079d;
        r0 r0Var = this.f28082g;
        r0Var.getClass();
        aVar.f28087d = a.b(r0Var, aVar.f28085b, aVar.f28088e, aVar.f28084a);
        aVar.d(r0Var.z());
        x.a Y = Y();
        o oVar = new o(Y, i10, 1);
        this.f28080e.put(0, Y);
        o<x, x.b> oVar2 = this.f28081f;
        oVar2.b(0, oVar);
        oVar2.a();
    }

    public final void G(Surface surface) {
        x.a e02 = e0();
        q qVar = new q(e02, surface);
        this.f28080e.put(1027, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1027, qVar);
        oVar.a();
    }

    public final void H(int i10, r.a aVar, z5.k kVar, n nVar, IOException iOException, boolean z10) {
        x.a c02 = c0(i10, aVar);
        k kVar2 = new k(c02, kVar, nVar, iOException, z10);
        this.f28080e.put(1003, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1003, kVar2);
        oVar.a();
    }

    public final void I(b0 b0Var, g gVar) {
        x.a e02 = e0();
        b bVar = new b(e02, b0Var, gVar, 0);
        this.f28080e.put(1022, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1022, bVar);
        oVar.a();
    }

    public final void J(d dVar) {
        x.a d02 = d0();
        t tVar = new t(d02, dVar);
        this.f28080e.put(1025, d02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1025, tVar);
        oVar.a();
    }

    public final void K(String str) {
        x.a e02 = e0();
        u uVar = new u(e02, str);
        this.f28080e.put(1013, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1013, uVar);
        oVar.a();
    }

    public final void L(String str, long j10, long j11) {
        x.a e02 = e0();
        c cVar = new c(e02, str, j11, 0);
        this.f28080e.put(1009, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1009, cVar);
        oVar.a();
    }

    public final void M(boolean z10) {
        x.a Y = Y();
        e eVar = new e(Y, z10, 3);
        this.f28080e.put(10, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(10, eVar);
        oVar.a();
    }

    public final void N(int i10, r.a aVar, Exception exc) {
        x.a c02 = c0(i10, aVar);
        s sVar = new s(c02, exc, 0);
        this.f28080e.put(1032, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1032, sVar);
        oVar.a();
    }

    public final void O(int i10, r.a aVar, n nVar) {
        x.a c02 = c0(i10, aVar);
        u uVar = new u(c02, nVar);
        this.f28080e.put(1004, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1004, uVar);
        oVar.a();
    }

    public /* synthetic */ void P(boolean z10) {
        q0.b(this, z10);
    }

    public final void Q(g0 g0Var, l lVar) {
        x.a Y = Y();
        b bVar = new b(Y, g0Var, lVar);
        this.f28080e.put(2, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(2, bVar);
        oVar.a();
    }

    public final void R(int i10, r.a aVar, n nVar) {
        x.a c02 = c0(i10, aVar);
        t tVar = new t(c02, nVar);
        this.f28080e.put(1005, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1005, tVar);
        oVar.a();
    }

    public final void S(int i10, long j10, long j11) {
        x.a e02 = e0();
        q qVar = new q(e02, i10, j10, j11, 1);
        this.f28080e.put(1012, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1012, qVar);
        oVar.a();
    }

    public final void T(int i10, long j10) {
        x.a d02 = d0();
        p pVar = new p(d02, i10, j10);
        this.f28080e.put(1023, d02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1023, pVar);
        oVar.a();
    }

    public final void U(int i10, r.a aVar) {
        x.a c02 = c0(i10, aVar);
        n nVar = new n(c02, 2);
        this.f28080e.put(1033, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1033, nVar);
        oVar.a();
    }

    public /* synthetic */ void V(boolean z10) {
        q0.c(this, z10);
    }

    public final void W(long j10, int i10) {
        x.a d02 = d0();
        p pVar = new p(d02, j10, i10);
        this.f28080e.put(1026, d02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1026, pVar);
        oVar.a();
    }

    public final void X(m mVar) {
        x.a aVar;
        p pVar = mVar.f27674g;
        if (pVar != null) {
            aVar = b0(new r.a(pVar));
        } else {
            aVar = Y();
        }
        q qVar = new q(aVar, mVar);
        this.f28080e.put(11, aVar);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(11, qVar);
        oVar.a();
    }

    public final x.a Y() {
        return b0(this.f28079d.f28087d);
    }

    public void Z(boolean z10) {
        x.a Y = Y();
        e eVar = new e(Y, z10, 1);
        this.f28080e.put(8, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(8, eVar);
        oVar.a();
    }

    public final void a(int i10, int i11, int i12, float f10) {
        x.a e02 = e0();
        h hVar = new h(e02, i10, i11, i12, f10);
        this.f28080e.put(1028, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1028, hVar);
        oVar.a();
    }

    @RequiresNonNull({"player"})
    public final x.a a0(c1 c1Var, int i10, r.a aVar) {
        long j10;
        c1 c1Var2 = c1Var;
        int i11 = i10;
        r.a aVar2 = c1Var.q() ? null : aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        boolean z11 = c1Var2.equals(this.f28082g.z()) && i11 == this.f28082g.D();
        long j11 = 0;
        if (aVar2 != null && aVar2.a()) {
            if (z11 && this.f28082g.r() == aVar2.f28628b && this.f28082g.v() == aVar2.f28629c) {
                z10 = true;
            }
            if (z10) {
                j11 = this.f28082g.G();
            }
        } else if (z11) {
            j10 = this.f28082g.g();
            return new x.a(elapsedRealtime, c1Var, i10, aVar2, j10, this.f28082g.z(), this.f28082g.D(), this.f28079d.f28087d, this.f28082g.G(), this.f28082g.h());
        } else if (!c1Var.q()) {
            j11 = c1Var2.o(i11, this.f28078c, 0).a();
        }
        j10 = j11;
        return new x.a(elapsedRealtime, c1Var, i10, aVar2, j10, this.f28082g.z(), this.f28082g.D(), this.f28079d.f28087d, this.f28082g.G(), this.f28082g.h());
    }

    public final void b(int i10) {
        x.a Y = Y();
        o oVar = new o(Y, i10, 2);
        this.f28080e.put(7, Y);
        o<x, x.b> oVar2 = this.f28081f;
        oVar2.b(7, oVar);
        oVar2.a();
    }

    public final x.a b0(r.a aVar) {
        c1 c1Var;
        this.f28082g.getClass();
        if (aVar == null) {
            c1Var = null;
        } else {
            c1Var = this.f28079d.f28086c.get(aVar);
        }
        if (aVar != null && c1Var != null) {
            return a0(c1Var, c1Var.h(aVar.f28627a, this.f28077b).f27464c, aVar);
        }
        int D = this.f28082g.D();
        c1 z10 = this.f28082g.z();
        if (!(D < z10.p())) {
            z10 = c1.f27461a;
        }
        return a0(z10, D, (r.a) null);
    }

    public final void c(boolean z10, int i10) {
        x.a Y = Y();
        f fVar = new f(Y, z10, i10, 1);
        this.f28080e.put(-1, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(-1, fVar);
        oVar.a();
    }

    public final x.a c0(int i10, r.a aVar) {
        this.f28082g.getClass();
        boolean z10 = false;
        if (aVar != null) {
            if (this.f28079d.f28086c.get(aVar) != null) {
                z10 = true;
            }
            if (z10) {
                return b0(aVar);
            }
            return a0(c1.f27461a, i10, aVar);
        }
        c1 z11 = this.f28082g.z();
        if (i10 < z11.p()) {
            z10 = true;
        }
        if (!z10) {
            z11 = c1.f27461a;
        }
        return a0(z11, i10, (r.a) null);
    }

    public final void d(d dVar) {
        x.a e02 = e0();
        r rVar = new r(e02, dVar, 1);
        this.f28080e.put(1008, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1008, rVar);
        oVar.a();
    }

    public final x.a d0() {
        return b0(this.f28079d.f28088e);
    }

    public /* synthetic */ void e(boolean z10) {
        q0.f(this, z10);
    }

    public final x.a e0() {
        return b0(this.f28079d.f28089f);
    }

    public final void f(x4.o0 o0Var) {
        x.a Y = Y();
        q qVar = new q(Y, o0Var);
        this.f28080e.put(13, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(13, qVar);
        oVar.a();
    }

    public final void g(int i10) {
        if (i10 == 1) {
            this.f28083h = false;
        }
        a aVar = this.f28079d;
        r0 r0Var = this.f28082g;
        r0Var.getClass();
        aVar.f28087d = a.b(r0Var, aVar.f28085b, aVar.f28088e, aVar.f28084a);
        x.a Y = Y();
        o oVar = new o(Y, i10, 0);
        this.f28080e.put(12, Y);
        o<x, x.b> oVar2 = this.f28081f;
        oVar2.b(12, oVar);
        oVar2.a();
    }

    public final void h(String str) {
        x.a e02 = e0();
        t tVar = new t(e02, str);
        this.f28080e.put(1024, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1024, tVar);
        oVar.a();
    }

    public final void i(int i10, r.a aVar, z5.k kVar, n nVar) {
        x.a c02 = c0(i10, aVar);
        d dVar = new d(c02, kVar, nVar, 0);
        this.f28080e.put(1002, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1002, dVar);
        oVar.a();
    }

    public final void j(d dVar) {
        x.a d02 = d0();
        r rVar = new r(d02, dVar, 2);
        this.f28080e.put(1014, d02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1014, rVar);
        oVar.a();
    }

    public /* synthetic */ void k(r0 r0Var, r0.b bVar) {
        q0.a(this, r0Var, bVar);
    }

    public final void l(List<q5.a> list) {
        x.a Y = Y();
        q qVar = new q(Y, (List) list);
        this.f28080e.put(3, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(3, qVar);
        oVar.a();
    }

    public final void m(String str, long j10, long j11) {
        x.a e02 = e0();
        c cVar = new c(e02, str, j11, 1);
        this.f28080e.put(1021, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1021, cVar);
        oVar.a();
    }

    public final void n(int i10) {
        x.a Y = Y();
        o oVar = new o(Y, i10, 3);
        this.f28080e.put(9, Y);
        o<x, x.b> oVar2 = this.f28081f;
        oVar2.b(9, oVar);
        oVar2.a();
    }

    public /* synthetic */ void o(c1 c1Var, Object obj, int i10) {
        q0.t(this, c1Var, obj, i10);
    }

    public final void p(boolean z10) {
        x.a Y = Y();
        e eVar = new e(Y, z10, 0);
        this.f28080e.put(4, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(4, eVar);
        oVar.a();
    }

    public final void q() {
        x.a Y = Y();
        l lVar = new l(Y, 1);
        this.f28080e.put(-1, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(-1, lVar);
        oVar.a();
    }

    public final void r(x4.e0 e0Var, int i10) {
        x.a Y = Y();
        j jVar = new j(Y, e0Var, i10);
        this.f28080e.put(1, Y);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1, jVar);
        oVar.a();
    }

    public final void s(boolean z10) {
        x.a e02 = e0();
        e eVar = new e(e02, z10, 2);
        this.f28080e.put(1017, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1017, eVar);
        oVar.a();
    }

    public final void t(int i10, r.a aVar) {
        x.a c02 = c0(i10, aVar);
        n nVar = new n(c02, 3);
        this.f28080e.put(1034, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1034, nVar);
        oVar.a();
    }

    public final void u(int i10, r.a aVar, z5.k kVar, n nVar) {
        x.a c02 = c0(i10, aVar);
        d dVar = new d(c02, kVar, nVar, 2);
        this.f28080e.put(1001, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1001, dVar);
        oVar.a();
    }

    public final void v(Exception exc) {
        x.a e02 = e0();
        s sVar = new s(e02, exc, 1);
        this.f28080e.put(1018, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1018, sVar);
        oVar.a();
    }

    public final void w(long j10) {
        x.a e02 = e0();
        i iVar = new i(e02, j10);
        this.f28080e.put(1011, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1011, iVar);
        oVar.a();
    }

    public final void x(int i10, r.a aVar) {
        x.a c02 = c0(i10, aVar);
        n nVar = new n(c02, 1);
        this.f28080e.put(1030, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1030, nVar);
        oVar.a();
    }

    public final void y(int i10, r.a aVar) {
        x.a c02 = c0(i10, aVar);
        l lVar = new l(c02, 2);
        this.f28080e.put(1031, c02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1031, lVar);
        oVar.a();
    }

    public final void z(d dVar) {
        x.a e02 = e0();
        r rVar = new r(e02, dVar, 0);
        this.f28080e.put(1020, e02);
        o<x, x.b> oVar = this.f28081f;
        oVar.b(1020, rVar);
        oVar.a();
    }
}
