package k8;

import n3.d;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class r8 extends d {
    public r8(Unsafe unsafe) {
        super(unsafe);
    }

    public final double d(Object obj, long j10) {
        return Double.longBitsToDouble(n(obj, j10));
    }

    public final float e(Object obj, long j10) {
        return Float.intBitsToFloat(m(obj, j10));
    }

    public final void f(Object obj, long j10, boolean z10) {
        if (s8.f20469g) {
            s8.c(obj, j10, z10);
        } else {
            s8.d(obj, j10, z10 ? (byte) 1 : 0);
        }
    }

    public final void g(Object obj, long j10, byte b10) {
        if (s8.f20469g) {
            s8.c(obj, j10, b10);
        } else {
            s8.d(obj, j10, b10);
        }
    }

    public final void h(Object obj, long j10, double d10) {
        r(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void i(Object obj, long j10, float f10) {
        q(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean j(Object obj, long j10) {
        if (s8.f20469g) {
            return s8.o(obj, j10);
        }
        return s8.p(obj, j10);
    }
}
