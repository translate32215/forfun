package b2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty */
public class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    public final Property<T, PointF> f3383a;

    /* renamed from: b  reason: collision with root package name */
    public final PathMeasure f3384b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3385c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f3386d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    public final PointF f3387e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    public float f3388f;

    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f3383a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f3384b = pathMeasure;
        this.f3385c = pathMeasure.getLength();
    }

    public Object get(Object obj) {
        return Float.valueOf(this.f3388f);
    }

    public void set(Object obj, Object obj2) {
        Float f10 = (Float) obj2;
        this.f3388f = f10.floatValue();
        this.f3384b.getPosTan(f10.floatValue() * this.f3385c, this.f3386d, (float[]) null);
        PointF pointF = this.f3387e;
        float[] fArr = this.f3386d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f3383a.set(obj, pointF);
    }
}
