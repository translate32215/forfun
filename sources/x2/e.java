package x2;

import android.graphics.PointF;
import g3.f;
import h3.a;
import java.util.List;
import o1.p;

/* compiled from: IntegerKeyframeAnimation */
public class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    public Object f(a aVar, float f10) {
        return Integer.valueOf(j(aVar, f10));
    }

    public int j(a<Integer> aVar, float f10) {
        if (aVar.f18868b == null || aVar.f18869c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        p pVar = this.f27253e;
        if (pVar != null) {
            Integer num = (Integer) pVar.b(aVar.f18871e, aVar.f18872f.floatValue(), aVar.f18868b, aVar.f18869c, f10, d(), this.f27252d);
            if (num != null) {
                return num.intValue();
            }
        }
        if (aVar.f18875i == 784923401) {
            aVar.f18875i = ((Integer) aVar.f18868b).intValue();
        }
        int i10 = aVar.f18875i;
        if (aVar.f18876j == 784923401) {
            aVar.f18876j = ((Integer) aVar.f18869c).intValue();
        }
        int i11 = aVar.f18876j;
        PointF pointF = f.f18435a;
        return (int) ((f10 * ((float) (i11 - i10))) + ((float) i10));
    }
}
