package x2;

import g3.f;
import h3.a;
import java.util.List;
import o1.p;

/* compiled from: ColorKeyframeAnimation */
public class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    public Object f(a aVar, float f10) {
        return Integer.valueOf(j(aVar, f10));
    }

    public int j(a<Integer> aVar, float f10) {
        T t10 = aVar.f18868b;
        if (t10 == null || aVar.f18869c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t10).intValue();
        int intValue2 = ((Integer) aVar.f18869c).intValue();
        p pVar = this.f27253e;
        if (pVar != null) {
            Integer num = (Integer) pVar.b(aVar.f18871e, aVar.f18872f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f10, d(), this.f27252d);
            if (num != null) {
                return num.intValue();
            }
        }
        return q.a.i(f.b(f10, 0.0f, 1.0f), intValue, intValue2);
    }
}
