package x2;

import android.graphics.Path;
import android.graphics.PointF;
import b3.j;
import g3.c;
import g3.f;
import h3.a;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation */
public class k extends a<j, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final j f27275i = new j();

    /* renamed from: j  reason: collision with root package name */
    public final Path f27276j = new Path();

    public k(List<a<j>> list) {
        super(list);
    }

    public Object f(a aVar, float f10) {
        j jVar = (j) aVar.f18868b;
        j jVar2 = (j) aVar.f18869c;
        j jVar3 = this.f27275i;
        if (jVar3.f3518b == null) {
            jVar3.f3518b = new PointF();
        }
        jVar3.f3519c = jVar.f3519c || jVar2.f3519c;
        if (jVar.f3517a.size() != jVar2.f3517a.size()) {
            StringBuilder a10 = android.support.v4.media.a.a("Curves must have the same number of control points. Shape 1: ");
            a10.append(jVar.f3517a.size());
            a10.append("\tShape 2: ");
            a10.append(jVar2.f3517a.size());
            c.a(a10.toString());
        }
        int min = Math.min(jVar.f3517a.size(), jVar2.f3517a.size());
        if (jVar3.f3517a.size() < min) {
            for (int size = jVar3.f3517a.size(); size < min; size++) {
                jVar3.f3517a.add(new z2.a());
            }
        } else if (jVar3.f3517a.size() > min) {
            for (int size2 = jVar3.f3517a.size() - 1; size2 >= min; size2--) {
                List<z2.a> list = jVar3.f3517a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = jVar.f3518b;
        PointF pointF2 = jVar2.f3518b;
        float e10 = f.e(pointF.x, pointF2.x, f10);
        float e11 = f.e(pointF.y, pointF2.y, f10);
        if (jVar3.f3518b == null) {
            jVar3.f3518b = new PointF();
        }
        jVar3.f3518b.set(e10, e11);
        for (int size3 = jVar3.f3517a.size() - 1; size3 >= 0; size3--) {
            z2.a aVar2 = jVar.f3517a.get(size3);
            z2.a aVar3 = jVar2.f3517a.get(size3);
            PointF pointF3 = aVar2.f28212a;
            PointF pointF4 = aVar2.f28213b;
            PointF pointF5 = aVar2.f28214c;
            PointF pointF6 = aVar3.f28212a;
            PointF pointF7 = aVar3.f28213b;
            PointF pointF8 = aVar3.f28214c;
            jVar3.f3517a.get(size3).f28212a.set(f.e(pointF3.x, pointF6.x, f10), f.e(pointF3.y, pointF6.y, f10));
            jVar3.f3517a.get(size3).f28213b.set(f.e(pointF4.x, pointF7.x, f10), f.e(pointF4.y, pointF7.y, f10));
            jVar3.f3517a.get(size3).f28214c.set(f.e(pointF5.x, pointF8.x, f10), f.e(pointF5.y, pointF8.y, f10));
        }
        j jVar4 = this.f27275i;
        Path path = this.f27276j;
        path.reset();
        PointF pointF9 = jVar4.f3518b;
        path.moveTo(pointF9.x, pointF9.y);
        f.f18435a.set(pointF9.x, pointF9.y);
        for (int i10 = 0; i10 < jVar4.f3517a.size(); i10++) {
            z2.a aVar4 = jVar4.f3517a.get(i10);
            PointF pointF10 = aVar4.f28212a;
            PointF pointF11 = aVar4.f28213b;
            PointF pointF12 = aVar4.f28214c;
            if (!pointF10.equals(f.f18435a) || !pointF11.equals(pointF12)) {
                path.cubicTo(pointF10.x, pointF10.y, pointF11.x, pointF11.y, pointF12.x, pointF12.y);
            } else {
                path.lineTo(pointF12.x, pointF12.y);
            }
            f.f18435a.set(pointF12.x, pointF12.y);
        }
        if (jVar4.f3519c) {
            path.close();
        }
        return this.f27276j;
    }
}
