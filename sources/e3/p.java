package e3;

import android.graphics.Color;
import android.graphics.PointF;
import android.support.v4.media.a;
import f3.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f13570a = c.a.a("x", "y");

    public static int a(c cVar) throws IOException {
        cVar.a();
        int v10 = (int) (cVar.v() * 255.0d);
        int v11 = (int) (cVar.v() * 255.0d);
        int v12 = (int) (cVar.v() * 255.0d);
        while (cVar.t()) {
            cVar.f0();
        }
        cVar.i();
        return Color.argb(255, v10, v11, v12);
    }

    public static PointF b(c cVar, float f10) throws IOException {
        int ordinal = cVar.M().ordinal();
        if (ordinal == 0) {
            cVar.a();
            float v10 = (float) cVar.v();
            float v11 = (float) cVar.v();
            while (cVar.M() != c.b.END_ARRAY) {
                cVar.f0();
            }
            cVar.i();
            return new PointF(v10 * f10, v11 * f10);
        } else if (ordinal == 2) {
            cVar.d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (cVar.t()) {
                int T = cVar.T(f13570a);
                if (T == 0) {
                    f11 = d(cVar);
                } else if (T != 1) {
                    cVar.V();
                    cVar.f0();
                } else {
                    f12 = d(cVar);
                }
            }
            cVar.o();
            return new PointF(f11 * f10, f12 * f10);
        } else if (ordinal == 6) {
            float v12 = (float) cVar.v();
            float v13 = (float) cVar.v();
            while (cVar.t()) {
                cVar.f0();
            }
            return new PointF(v12 * f10, v13 * f10);
        } else {
            StringBuilder a10 = a.a("Unknown point starts with ");
            a10.append(cVar.M());
            throw new IllegalArgumentException(a10.toString());
        }
    }

    public static List<PointF> c(c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.M() == c.b.BEGIN_ARRAY) {
            cVar.a();
            arrayList.add(b(cVar, f10));
            cVar.i();
        }
        cVar.i();
        return arrayList;
    }

    public static float d(c cVar) throws IOException {
        c.b M = cVar.M();
        int ordinal = M.ordinal();
        if (ordinal == 0) {
            cVar.a();
            float v10 = (float) cVar.v();
            while (cVar.t()) {
                cVar.f0();
            }
            cVar.i();
            return v10;
        } else if (ordinal == 6) {
            return (float) cVar.v();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type " + M);
        }
    }
}
