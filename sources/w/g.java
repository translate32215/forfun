package w;

import w.f;

/* compiled from: DimensionDependency */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f26833m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f26816e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f26816e = f.a.VERTICAL_DIMENSION;
        }
    }

    public void c(int i10) {
        if (!this.f26821j) {
            this.f26821j = true;
            this.f26818g = i10;
            for (d next : this.f26822k) {
                next.a(next);
            }
        }
    }
}
