package x2;

import g3.f;
import h3.a;
import java.util.List;
import o1.p;

/* compiled from: FloatKeyframeAnimation */
public class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    public Object f(a aVar, float f10) {
        return Float.valueOf(k(aVar, f10));
    }

    public float j() {
        return k(a(), c());
    }

    public float k(a<Float> aVar, float f10) {
        if (aVar.f18868b == null || aVar.f18869c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        p pVar = this.f27253e;
        if (pVar != null) {
            Float f11 = (Float) pVar.b(aVar.f18871e, aVar.f18872f.floatValue(), aVar.f18868b, aVar.f18869c, f10, d(), this.f27252d);
            if (f11 != null) {
                return f11.floatValue();
            }
        }
        if (aVar.f18873g == -3987645.8f) {
            aVar.f18873g = ((Float) aVar.f18868b).floatValue();
        }
        float f12 = aVar.f18873g;
        if (aVar.f18874h == -3987645.8f) {
            aVar.f18874h = ((Float) aVar.f18869c).floatValue();
        }
        return f.e(f12, aVar.f18874h, f10);
    }
}
