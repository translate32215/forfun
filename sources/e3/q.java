package e3;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import f3.c;
import g3.f;
import g3.g;
import h3.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import q0.b;
import s.j;
import u2.d;

/* compiled from: KeyframeParser */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f13571a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static j<WeakReference<Interpolator>> f13572b;

    /* renamed from: c  reason: collision with root package name */
    public static c.a f13573c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    public static <T> a<T> a(c cVar, d dVar, float f10, h0<T> h0Var, boolean z10) throws IOException {
        T t10;
        WeakReference e10;
        Interpolator interpolator;
        c cVar2 = cVar;
        float f11 = f10;
        h0<T> h0Var2 = h0Var;
        if (!z10) {
            return new a<>(h0Var2.a(cVar2, f11));
        }
        Class<q> cls = q.class;
        cVar.d();
        Interpolator interpolator2 = null;
        int i10 = 1;
        PointF pointF = null;
        PointF pointF2 = null;
        T t11 = null;
        T t12 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z11 = false;
        float f12 = 0.0f;
        while (cVar.t()) {
            switch (cVar2.T(f13573c)) {
                case 0:
                    f12 = (float) cVar.v();
                    break;
                case 1:
                    t12 = h0Var2.a(cVar2, f11);
                    continue;
                case 2:
                    t11 = h0Var2.a(cVar2, f11);
                    continue;
                case 3:
                    pointF = p.b(cVar2, f11);
                    continue;
                case 4:
                    pointF2 = p.b(cVar2, f11);
                    continue;
                case 5:
                    if (cVar.G() != i10) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        continue;
                    }
                case 6:
                    pointF4 = p.b(cVar2, f11);
                    continue;
                case 7:
                    pointF3 = p.b(cVar2, f11);
                    continue;
                default:
                    cVar.f0();
                    break;
            }
            i10 = 1;
        }
        cVar.o();
        if (z11) {
            interpolator2 = f13571a;
            t10 = t12;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator2 = f13571a;
            } else {
                float f13 = -f11;
                pointF.x = f.b(pointF.x, f13, f11);
                pointF.y = f.b(pointF.y, -100.0f, 100.0f);
                pointF2.x = f.b(pointF2.x, f13, f11);
                float b10 = f.b(pointF2.y, -100.0f, 100.0f);
                pointF2.y = b10;
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = pointF2.x;
                PathMeasure pathMeasure = g.f18436a;
                int i11 = f14 != 0.0f ? (int) (((float) 527) * f14) : 17;
                if (f15 != 0.0f) {
                    i11 = (int) (((float) (i11 * 31)) * f15);
                }
                if (f16 != 0.0f) {
                    i11 = (int) (((float) (i11 * 31)) * f16);
                }
                if (b10 != 0.0f) {
                    i11 = (int) (((float) (i11 * 31)) * b10);
                }
                synchronized (cls) {
                    if (f13572b == null) {
                        f13572b = new j<>();
                    }
                    e10 = f13572b.e(i11, null);
                }
                if (e10 != null) {
                    interpolator2 = (Interpolator) e10.get();
                }
                if (e10 == null || interpolator2 == null) {
                    pointF.x /= f11;
                    pointF.y /= f11;
                    float f17 = pointF2.x / f11;
                    pointF2.x = f17;
                    float f18 = pointF2.y / f11;
                    pointF2.y = f18;
                    try {
                        interpolator = b.a(pointF.x, pointF.y, f17, f18);
                    } catch (IllegalArgumentException e11) {
                        if (e11.getMessage().equals("The Path cannot loop back on itself.")) {
                            interpolator = b.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                        } else {
                            interpolator = new LinearInterpolator();
                        }
                    }
                    interpolator2 = interpolator;
                    try {
                        WeakReference weakReference = new WeakReference(interpolator2);
                        synchronized (cls) {
                            f13572b.h(i11, weakReference);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
            }
            t10 = t11;
        }
        a aVar = new a(dVar, t12, t10, interpolator2, f12, (Float) null);
        aVar.f18879m = pointF4;
        aVar.f18880n = pointF3;
        return aVar;
    }
}
