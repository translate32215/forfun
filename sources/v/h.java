package v;

import t.b;
import t.c;
import v.d;

/* compiled from: Guideline */
public class h extends f {

    /* renamed from: r0  reason: collision with root package name */
    public float f26298r0 = -1.0f;

    /* renamed from: s0  reason: collision with root package name */
    public int f26299s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public int f26300t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public d f26301u0 = this.K;

    /* renamed from: v0  reason: collision with root package name */
    public int f26302v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f26303w0;

    public h() {
        this.f26302v0 = 0;
        this.S.clear();
        this.S.add(this.f26301u0);
        int length = this.R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.R[i10] = this.f26301u0;
        }
    }

    public boolean D() {
        return this.f26303w0;
    }

    public boolean E() {
        return this.f26303w0;
    }

    public void U(c cVar, boolean z10) {
        if (this.V != null) {
            int o10 = cVar.o(this.f26301u0);
            if (this.f26302v0 == 1) {
                this.f26248a0 = o10;
                this.f26250b0 = 0;
                N(this.V.l());
                S(0);
                return;
            }
            this.f26248a0 = 0;
            this.f26250b0 = o10;
            S(this.V.u());
            N(0);
        }
    }

    public void V(int i10) {
        d dVar = this.f26301u0;
        dVar.f26230b = i10;
        dVar.f26231c = true;
        this.f26303w0 = true;
    }

    public void W(int i10) {
        if (this.f26302v0 != i10) {
            this.f26302v0 = i10;
            this.S.clear();
            if (this.f26302v0 == 1) {
                this.f26301u0 = this.J;
            } else {
                this.f26301u0 = this.K;
            }
            this.S.add(this.f26301u0);
            int length = this.R.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.R[i11] = this.f26301u0;
            }
        }
    }

    public void d(c cVar, boolean z10) {
        g gVar = (g) this.V;
        if (gVar != null) {
            d i10 = gVar.i(d.a.LEFT);
            d i11 = gVar.i(d.a.RIGHT);
            f fVar = this.V;
            boolean z11 = true;
            boolean z12 = fVar != null && fVar.U[0] == 2;
            if (this.f26302v0 == 0) {
                i10 = gVar.i(d.a.TOP);
                i11 = gVar.i(d.a.BOTTOM);
                f fVar2 = this.V;
                if (fVar2 == null || fVar2.U[1] != 2) {
                    z11 = false;
                }
                z12 = z11;
            }
            if (this.f26303w0) {
                d dVar = this.f26301u0;
                if (dVar.f26231c) {
                    t.h l10 = cVar.l(dVar);
                    cVar.e(l10, this.f26301u0.c());
                    if (this.f26299s0 != -1) {
                        if (z12) {
                            cVar.f(cVar.l(i11), l10, 0, 5);
                        }
                    } else if (this.f26300t0 != -1 && z12) {
                        t.h l11 = cVar.l(i11);
                        cVar.f(l10, cVar.l(i10), 0, 5);
                        cVar.f(l11, l10, 0, 5);
                    }
                    this.f26303w0 = false;
                    return;
                }
            }
            if (this.f26299s0 != -1) {
                t.h l12 = cVar.l(this.f26301u0);
                cVar.d(l12, cVar.l(i10), this.f26299s0, 8);
                if (z12) {
                    cVar.f(cVar.l(i11), l12, 0, 5);
                }
            } else if (this.f26300t0 != -1) {
                t.h l13 = cVar.l(this.f26301u0);
                t.h l14 = cVar.l(i11);
                cVar.d(l13, l14, -this.f26300t0, 8);
                if (z12) {
                    cVar.f(l13, cVar.l(i10), 0, 5);
                    cVar.f(l14, l13, 0, 5);
                }
            } else if (this.f26298r0 != -1.0f) {
                t.h l15 = cVar.l(this.f26301u0);
                t.h l16 = cVar.l(i11);
                float f10 = this.f26298r0;
                b m10 = cVar.m();
                m10.f25277d.d(l15, -1.0f);
                m10.f25277d.d(l16, f10);
                cVar.c(m10);
            }
        }
    }

    public boolean e() {
        return true;
    }

    public d i(d.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f26302v0 == 0) {
                return this.f26301u0;
            }
            return null;
        }
        if (this.f26302v0 == 1) {
            return this.f26301u0;
        }
        return null;
    }
}
