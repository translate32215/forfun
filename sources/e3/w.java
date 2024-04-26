package e3;

import android.graphics.PointF;
import f3.c;
import java.io.IOException;

/* compiled from: PointFParser */
public class w implements h0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f13584a = new w();

    public Object a(c cVar, float f10) throws IOException {
        c.b M = cVar.M();
        if (M == c.b.BEGIN_ARRAY) {
            return p.b(cVar, f10);
        }
        if (M == c.b.BEGIN_OBJECT) {
            return p.b(cVar, f10);
        }
        if (M == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.v()) * f10, ((float) cVar.v()) * f10);
            while (cVar.t()) {
                cVar.f0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + M);
    }
}
