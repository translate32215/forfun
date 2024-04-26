package e3;

import android.graphics.Color;
import f3.c;
import java.io.IOException;

/* compiled from: ColorParser */
public class f implements h0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f13552a = new f();

    public Object a(c cVar, float f10) throws IOException {
        boolean z10 = cVar.M() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.a();
        }
        double v10 = cVar.v();
        double v11 = cVar.v();
        double v12 = cVar.v();
        double v13 = cVar.v();
        if (z10) {
            cVar.i();
        }
        if (v10 <= 1.0d && v11 <= 1.0d && v12 <= 1.0d) {
            v10 *= 255.0d;
            v11 *= 255.0d;
            v12 *= 255.0d;
            if (v13 <= 1.0d) {
                v13 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) v13, (int) v10, (int) v11, (int) v12));
    }
}
