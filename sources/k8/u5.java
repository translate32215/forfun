package k8;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class u5 {

    /* renamed from: a  reason: collision with root package name */
    public final t5 f20485a;

    public u5(t5 t5Var) {
        Charset charset = r6.f20450a;
        this.f20485a = t5Var;
        t5Var.f20475a = this;
    }

    public final void a(int i10, int i11) throws IOException {
        this.f20485a.q(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j10) throws IOException {
        this.f20485a.t(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i10, double d10) throws IOException {
        this.f20485a.j(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, float f10) throws IOException {
        this.f20485a.g(i10, Float.floatToRawIntBits(f10));
    }

    public final void e(int i10, Object obj, x7 x7Var) throws IOException {
        t5 t5Var = this.f20485a;
        t5Var.p(i10, 3);
        x7Var.f((m7) obj, t5Var.f20475a);
        t5Var.p(i10, 4);
    }

    public final void f(int i10, Object obj, x7 x7Var) throws IOException {
        m7 m7Var = (m7) obj;
        r5 r5Var = (r5) this.f20485a;
        r5Var.r((i10 << 3) | 2);
        g5 g5Var = (g5) m7Var;
        int f10 = g5Var.f();
        if (f10 == -1) {
            f10 = x7Var.e(g5Var);
            g5Var.h(f10);
        }
        r5Var.r(f10);
        x7Var.f(m7Var, r5Var.f20475a);
    }
}
