package b3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import z2.a;

/* compiled from: ShapeData */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f3517a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f3518b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3519c;

    public j(PointF pointF, boolean z10, List<a> list) {
        this.f3518b = pointF;
        this.f3519c = z10;
        this.f3517a = new ArrayList(list);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ShapeData{numCurves=");
        a10.append(this.f3517a.size());
        a10.append("closed=");
        a10.append(this.f3519c);
        a10.append('}');
        return a10.toString();
    }

    public j() {
        this.f3517a = new ArrayList();
    }
}
