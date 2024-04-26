package x4;

import x4.c1;

/* compiled from: BasePlayer */
public abstract class d implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final c1.c f27487a = new c1.c();

    public final boolean hasNext() {
        return t() != -1;
    }

    public final boolean hasPrevious() {
        return j() != -1;
    }

    public final int j() {
        c1 z10 = z();
        if (z10.q()) {
            return -1;
        }
        int D = D();
        int y10 = y();
        if (y10 == 1) {
            y10 = 0;
        }
        return z10.l(D, y10, B());
    }

    public final boolean n() {
        return W() == 3 && k() && w() == 0;
    }

    public final boolean p() {
        c1 z10 = z();
        return !z10.q() && z10.n(D(), this.f27487a).f27477h;
    }

    public final int t() {
        c1 z10 = z();
        if (z10.q()) {
            return -1;
        }
        int D = D();
        int y10 = y();
        if (y10 == 1) {
            y10 = 0;
        }
        return z10.e(D, y10, B());
    }
}
