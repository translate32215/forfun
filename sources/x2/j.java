package x2;

import android.graphics.PointF;
import h.e;
import h3.a;
import java.util.List;
import o1.p;

/* compiled from: PointKeyframeAnimation */
public class j extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f27274i = new PointF();

    public j(List<a<PointF>> list) {
        super(list);
    }

    public Object f(a aVar, float f10) {
        T t10;
        T t11 = aVar.f18868b;
        if (t11 == null || (t10 = aVar.f18869c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t11;
        PointF pointF2 = (PointF) t10;
        p pVar = this.f27253e;
        if (pVar != null) {
            PointF pointF3 = (PointF) pVar.b(aVar.f18871e, aVar.f18872f.floatValue(), pointF, pointF2, f10, d(), this.f27252d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f27274i;
        float f11 = pointF.x;
        float a10 = e.a(pointF2.x, f11, f10, f11);
        float f12 = pointF.y;
        pointF4.set(a10, ((pointF2.y - f12) * f10) + f12);
        return this.f27274i;
    }
}
