package x2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import h3.a;
import java.util.List;
import o1.p;

/* compiled from: PathKeyframeAnimation */
public class i extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f27270i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final float[] f27271j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public h f27272k;

    /* renamed from: l  reason: collision with root package name */
    public PathMeasure f27273l = new PathMeasure();

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    public Object f(a aVar, float f10) {
        h hVar = (h) aVar;
        Path path = hVar.f27268o;
        if (path == null) {
            return (PointF) aVar.f18868b;
        }
        p pVar = this.f27253e;
        if (pVar != null) {
            PointF pointF = (PointF) pVar.b(hVar.f18871e, hVar.f18872f.floatValue(), hVar.f18868b, hVar.f18869c, d(), f10, this.f27252d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f27272k != hVar) {
            this.f27273l.setPath(path, false);
            this.f27272k = hVar;
        }
        PathMeasure pathMeasure = this.f27273l;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.f27271j, (float[]) null);
        PointF pointF2 = this.f27270i;
        float[] fArr = this.f27271j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f27270i;
    }
}
