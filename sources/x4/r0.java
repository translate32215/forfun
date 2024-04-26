package x4;

import android.os.Looper;
import java.util.List;
import r6.l;
import v6.t;
import z5.g0;

/* compiled from: Player */
public interface r0 {

    /* compiled from: Player */
    public interface a {
        void C(int i10);

        void D(boolean z10, int i10);

        void F(c1 c1Var, int i10);

        void M(boolean z10);

        void P(boolean z10);

        void Q(g0 g0Var, l lVar);

        void V(boolean z10);

        void X(m mVar);

        void Z(boolean z10);

        void b(int i10);

        @Deprecated
        void c(boolean z10, int i10);

        @Deprecated
        void e(boolean z10);

        void f(o0 o0Var);

        void g(int i10);

        void k(r0 r0Var, b bVar);

        void l(List<q5.a> list);

        void n(int i10);

        @Deprecated
        void o(c1 c1Var, Object obj, int i10);

        void p(boolean z10);

        @Deprecated
        void q();

        void r(e0 e0Var, int i10);
    }

    /* compiled from: Player */
    public static final class b extends t {
        public boolean a(int i10) {
            return this.f26497a.get(i10);
        }

        public boolean b(int... iArr) {
            for (int a10 : iArr) {
                if (a(a10)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Player */
    public interface c {
    }

    /* compiled from: Player */
    public interface d {
    }

    Looper A();

    boolean B();

    long C();

    int D();

    l E();

    int F(int i10);

    long G();

    c H();

    int W();

    m a();

    void b();

    void c(boolean z10);

    d d();

    boolean e();

    o0 f();

    long g();

    long h();

    boolean hasNext();

    boolean hasPrevious();

    void i(int i10, long j10);

    int j();

    boolean k();

    void l(boolean z10);

    List<q5.a> m();

    boolean n();

    long n0();

    int o();

    boolean p();

    void q(a aVar);

    int r();

    void s(int i10);

    int t();

    void u(a aVar);

    int v();

    int w();

    g0 x();

    int y();

    c1 z();
}
