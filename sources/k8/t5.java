package k8;

import e.a;
import java.io.IOException;
import java.util.logging.Logger;
import s9.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public abstract class t5 extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f20473b = Logger.getLogger(t5.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f20474c = s8.f20467e;

    /* renamed from: a  reason: collision with root package name */
    public u5 f20475a;

    public t5() {
        super(4);
    }

    public /* synthetic */ t5(a aVar) {
        super(4);
    }

    public static int A(int i10) {
        return b(i10 << 3);
    }

    public static int b(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int c(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int v(p5 p5Var) {
        int h10 = p5Var.h();
        return b(h10) + h10;
    }

    @Deprecated
    public static int w(int i10, m7 m7Var, x7 x7Var) {
        int b10 = b(i10 << 3);
        int i11 = b10 + b10;
        g5 g5Var = (g5) m7Var;
        int f10 = g5Var.f();
        if (f10 == -1) {
            f10 = x7Var.e(g5Var);
            g5Var.h(f10);
        }
        return i11 + f10;
    }

    public static int x(int i10) {
        if (i10 >= 0) {
            return b(i10);
        }
        return 10;
    }

    public static int y(m7 m7Var, x7 x7Var) {
        g5 g5Var = (g5) m7Var;
        int f10 = g5Var.f();
        if (f10 == -1) {
            f10 = x7Var.e(g5Var);
            g5Var.h(f10);
        }
        return b(f10) + f10;
    }

    public static int z(String str) {
        int i10;
        try {
            i10 = v8.c(str);
        } catch (u8 unused) {
            i10 = str.getBytes(r6.f20450a).length;
        }
        return b(i10) + i10;
    }

    public abstract void d(byte b10) throws IOException;

    public abstract void e(int i10, boolean z10) throws IOException;

    public abstract void f(int i10, p5 p5Var) throws IOException;

    public abstract void g(int i10, int i11) throws IOException;

    public abstract void h(int i10) throws IOException;

    public abstract void j(int i10, long j10) throws IOException;

    public abstract void k(long j10) throws IOException;

    public abstract void l(int i10, int i11) throws IOException;

    public abstract void n(int i10) throws IOException;

    public abstract void o(int i10, String str) throws IOException;

    public abstract void p(int i10, int i11) throws IOException;

    public abstract void q(int i10, int i11) throws IOException;

    public abstract void r(int i10) throws IOException;

    public abstract void t(int i10, long j10) throws IOException;

    public abstract void u(long j10) throws IOException;
}
