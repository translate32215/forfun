package a3;

import android.graphics.PointF;
import java.util.List;
import x2.a;
import x2.l;

/* compiled from: AnimatableSplitDimensionPathValue */
public class h implements k<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f49a;

    /* renamed from: b  reason: collision with root package name */
    public final b f50b;

    public h(b bVar, b bVar2) {
        this.f49a = bVar;
        this.f50b = bVar2;
    }

    public a<PointF, PointF> a() {
        return new l(this.f49a.a(), this.f50b.a());
    }

    public List<h3.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean c() {
        return this.f49a.c() && this.f50b.c();
    }
}
