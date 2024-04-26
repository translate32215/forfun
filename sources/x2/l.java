package x2;

import android.graphics.PointF;
import h3.a;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation */
public class l extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f27277i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final a<Float, Float> f27278j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f27279k;

    public l(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f27278j = aVar;
        this.f27279k = aVar2;
        h(this.f27252d);
    }

    public Object e() {
        return this.f27277i;
    }

    public Object f(a aVar, float f10) {
        return this.f27277i;
    }

    public void h(float f10) {
        this.f27278j.h(f10);
        this.f27279k.h(f10);
        this.f27277i.set(this.f27278j.e().floatValue(), this.f27279k.e().floatValue());
        for (int i10 = 0; i10 < this.f27249a.size(); i10++) {
            this.f27249a.get(i10).d();
        }
    }
}
