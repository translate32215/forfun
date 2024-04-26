package y4;

import a5.d;
import a5.g;
import aa.f;
import android.util.SparseArray;
import android.view.Surface;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import r6.l;
import v6.t;
import x4.b0;
import x4.c1;
import x4.e0;
import x4.m;
import x4.o0;
import x4.r0;
import z5.g0;
import z5.k;
import z5.n;
import z5.r;

/* compiled from: AnalyticsListener */
public interface x {

    /* compiled from: AnalyticsListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f28090a;

        /* renamed from: b  reason: collision with root package name */
        public final c1 f28091b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28092c;

        /* renamed from: d  reason: collision with root package name */
        public final r.a f28093d;

        /* renamed from: e  reason: collision with root package name */
        public final long f28094e;

        /* renamed from: f  reason: collision with root package name */
        public final c1 f28095f;

        /* renamed from: g  reason: collision with root package name */
        public final int f28096g;

        /* renamed from: h  reason: collision with root package name */
        public final r.a f28097h;

        /* renamed from: i  reason: collision with root package name */
        public final long f28098i;

        /* renamed from: j  reason: collision with root package name */
        public final long f28099j;

        public a(long j10, c1 c1Var, int i10, r.a aVar, long j11, c1 c1Var2, int i11, r.a aVar2, long j12, long j13) {
            this.f28090a = j10;
            this.f28091b = c1Var;
            this.f28092c = i10;
            this.f28093d = aVar;
            this.f28094e = j11;
            this.f28095f = c1Var2;
            this.f28096g = i11;
            this.f28097h = aVar2;
            this.f28098i = j12;
            this.f28099j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f28090a == aVar.f28090a && this.f28092c == aVar.f28092c && this.f28094e == aVar.f28094e && this.f28096g == aVar.f28096g && this.f28098i == aVar.f28098i && this.f28099j == aVar.f28099j && f.a(this.f28091b, aVar.f28091b) && f.a(this.f28093d, aVar.f28093d) && f.a(this.f28095f, aVar.f28095f) && f.a(this.f28097h, aVar.f28097h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f28090a), this.f28091b, Integer.valueOf(this.f28092c), this.f28093d, Long.valueOf(this.f28094e), this.f28095f, Integer.valueOf(this.f28096g), this.f28097h, Long.valueOf(this.f28098i), Long.valueOf(this.f28099j)});
        }
    }

    /* compiled from: AnalyticsListener */
    public static final class b extends t {

        /* renamed from: b  reason: collision with root package name */
        public final SparseArray<a> f28100b = new SparseArray<>(0);
    }

    void A(a aVar, int i10, long j10, long j11);

    void B(a aVar, k kVar, n nVar, IOException iOException, boolean z10);

    @Deprecated
    void C(a aVar, int i10, d dVar);

    void D(a aVar, boolean z10);

    void E(a aVar, boolean z10);

    void F(a aVar, k kVar, n nVar);

    @Deprecated
    void G(a aVar, int i10, b0 b0Var);

    void H(a aVar, m mVar);

    void I(a aVar, z4.d dVar);

    void J(a aVar, d dVar);

    void K(a aVar, d dVar);

    void L(r0 r0Var, b bVar);

    void M(a aVar, k kVar, n nVar);

    void N(a aVar, int i10, long j10);

    void O(a aVar, int i10);

    @Deprecated
    void P(a aVar, int i10, String str, long j10);

    void Q(a aVar, b0 b0Var, g gVar);

    void R(a aVar);

    void S(a aVar);

    @Deprecated
    void T(a aVar, boolean z10, int i10);

    void U(a aVar, q5.a aVar2);

    void V(a aVar, Exception exc);

    void W(a aVar, boolean z10);

    void X(a aVar, e0 e0Var, int i10);

    void Y(a aVar, int i10);

    void Z(a aVar);

    void a(a aVar, int i10);

    void a0(a aVar, int i10, int i11, int i12, float f10);

    void b(a aVar, k kVar, n nVar);

    void b0(a aVar);

    void c(a aVar, d dVar);

    void c0(a aVar, boolean z10, int i10);

    void d(a aVar, long j10, int i10);

    void d0(a aVar, String str, long j10);

    void e(a aVar, String str, long j10);

    void e0(a aVar, boolean z10);

    void f(a aVar);

    void g(a aVar);

    void h(a aVar, long j10);

    void i(a aVar, int i10, int i11);

    void j(a aVar, Surface surface);

    void k(a aVar, b0 b0Var, g gVar);

    void l(a aVar, d dVar);

    void m(a aVar, n nVar);

    void n(a aVar, int i10);

    void o(a aVar, n nVar);

    void p(a aVar, int i10, long j10, long j11);

    void q(a aVar);

    void r(a aVar, g0 g0Var, l lVar);

    @Deprecated
    void s(a aVar, int i10, d dVar);

    void t(a aVar, o0 o0Var);

    void u(a aVar, int i10);

    void v(a aVar, Exception exc);

    @Deprecated
    void w(a aVar);

    void x(a aVar, List<q5.a> list);

    void y(a aVar, String str);

    void z(a aVar, String str);
}
