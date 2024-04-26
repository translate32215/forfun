package e3;

import f3.c;
import h3.c;
import java.io.IOException;

/* compiled from: ScaleXYParser */
public class a0 implements h0<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f13541a = new a0();

    public Object a(f3.c cVar, float f10) throws IOException {
        boolean z10 = cVar.M() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.a();
        }
        float v10 = (float) cVar.v();
        float v11 = (float) cVar.v();
        while (cVar.t()) {
            cVar.f0();
        }
        if (z10) {
            cVar.i();
        }
        return new h3.c((v10 / 100.0f) * f10, (v11 / 100.0f) * f10);
    }
}
