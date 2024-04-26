package g3;

import android.graphics.PointF;
import h.e;
import java.util.List;
import w2.j;

/* compiled from: MiscUtils */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static PointF f18435a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static int d(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static float e(float f10, float f11, float f12) {
        return e.a(f11, f10, f12, f10);
    }

    public static void f(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2, j jVar) {
        if (eVar.c(jVar.a(), i10)) {
            list.add(eVar2.a(jVar.a()).g(jVar));
        }
    }
}
