package v;

import androidx.activity.e;
import j.f;
import t.b;
import t.c;
import t.h;
import v.d;

/* compiled from: Barrier */
public class a extends j {

    /* renamed from: t0  reason: collision with root package name */
    public int f26205t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f26206u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public int f26207v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f26208w0 = false;

    public boolean D() {
        return this.f26208w0;
    }

    public boolean E() {
        return this.f26208w0;
    }

    public boolean W() {
        int i10;
        int i11;
        int i12;
        d.a aVar = d.a.BOTTOM;
        d.a aVar2 = d.a.TOP;
        d.a aVar3 = d.a.RIGHT;
        d.a aVar4 = d.a.LEFT;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.f26305s0;
            if (i13 >= i10) {
                break;
            }
            f fVar = this.f26304r0[i13];
            if ((this.f26206u0 || fVar.e()) && ((((i11 = this.f26205t0) == 0 || i11 == 1) && !fVar.D()) || (((i12 = this.f26205t0) == 2 || i12 == 3) && !fVar.E()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f26305s0; i15++) {
            f fVar2 = this.f26304r0[i15];
            if (this.f26206u0 || fVar2.e()) {
                if (!z11) {
                    int i16 = this.f26205t0;
                    if (i16 == 0) {
                        i14 = fVar2.i(aVar4).c();
                    } else if (i16 == 1) {
                        i14 = fVar2.i(aVar3).c();
                    } else if (i16 == 2) {
                        i14 = fVar2.i(aVar2).c();
                    } else if (i16 == 3) {
                        i14 = fVar2.i(aVar).c();
                    }
                    z11 = true;
                }
                int i17 = this.f26205t0;
                if (i17 == 0) {
                    i14 = Math.min(i14, fVar2.i(aVar4).c());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, fVar2.i(aVar3).c());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, fVar2.i(aVar2).c());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, fVar2.i(aVar).c());
                }
            }
        }
        int i18 = i14 + this.f26207v0;
        int i19 = this.f26205t0;
        if (i19 == 0 || i19 == 1) {
            L(i18, i18);
        } else {
            M(i18, i18);
        }
        this.f26208w0 = true;
        return true;
    }

    public int X() {
        int i10 = this.f26205t0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public void d(c cVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.R;
        dVarArr2[0] = this.J;
        dVarArr2[2] = this.K;
        dVarArr2[1] = this.L;
        dVarArr2[3] = this.M;
        int i13 = 0;
        while (true) {
            dVarArr = this.R;
            if (i13 >= dVarArr.length) {
                break;
            }
            dVarArr[i13].f26237i = cVar.l(dVarArr[i13]);
            i13++;
        }
        int i14 = this.f26205t0;
        if (i14 >= 0 && i14 < 4) {
            d dVar = dVarArr[i14];
            if (!this.f26208w0) {
                W();
            }
            if (this.f26208w0) {
                this.f26208w0 = false;
                int i15 = this.f26205t0;
                if (i15 == 0 || i15 == 1) {
                    cVar.e(this.J.f26237i, this.f26248a0);
                    cVar.e(this.L.f26237i, this.f26248a0);
                } else if (i15 == 2 || i15 == 3) {
                    cVar.e(this.K.f26237i, this.f26250b0);
                    cVar.e(this.M.f26237i, this.f26250b0);
                }
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= this.f26305s0) {
                        z11 = false;
                        break;
                    }
                    f fVar = this.f26304r0[i16];
                    if ((this.f26206u0 || fVar.e()) && ((((i11 = this.f26205t0) == 0 || i11 == 1) && fVar.m() == 3 && fVar.J.f26234f != null && fVar.L.f26234f != null) || (((i12 = this.f26205t0) == 2 || i12 == 3) && fVar.t() == 3 && fVar.K.f26234f != null && fVar.M.f26234f != null))) {
                        z11 = true;
                    } else {
                        i16++;
                    }
                }
                z11 = true;
                boolean z12 = this.J.e() || this.L.e();
                boolean z13 = this.K.e() || this.M.e();
                boolean z14 = !z11 && (((i10 = this.f26205t0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))));
                int i17 = 5;
                if (!z14) {
                    i17 = 4;
                }
                for (int i18 = 0; i18 < this.f26305s0; i18++) {
                    f fVar2 = this.f26304r0[i18];
                    if (this.f26206u0 || fVar2.e()) {
                        h l10 = cVar.l(fVar2.R[this.f26205t0]);
                        d[] dVarArr3 = fVar2.R;
                        int i19 = this.f26205t0;
                        dVarArr3[i19].f26237i = l10;
                        int i20 = (dVarArr3[i19].f26234f == null || dVarArr3[i19].f26234f.f26232d != this) ? 0 : dVarArr3[i19].f26235g + 0;
                        if (i19 == 0 || i19 == 2) {
                            b m10 = cVar.m();
                            h n10 = cVar.n();
                            n10.f25315d = 0;
                            m10.f(dVar.f26237i, l10, n10, this.f26207v0 - i20);
                            cVar.c(m10);
                        } else {
                            b m11 = cVar.m();
                            h n11 = cVar.n();
                            n11.f25315d = 0;
                            m11.e(dVar.f26237i, l10, n11, this.f26207v0 + i20);
                            cVar.c(m11);
                        }
                        cVar.d(dVar.f26237i, l10, this.f26207v0 + i20, i17);
                    }
                }
                int i21 = this.f26205t0;
                if (i21 == 0) {
                    cVar.d(this.L.f26237i, this.J.f26237i, 0, 8);
                    cVar.d(this.J.f26237i, this.V.L.f26237i, 0, 4);
                    cVar.d(this.J.f26237i, this.V.J.f26237i, 0, 0);
                } else if (i21 == 1) {
                    cVar.d(this.J.f26237i, this.L.f26237i, 0, 8);
                    cVar.d(this.J.f26237i, this.V.J.f26237i, 0, 4);
                    cVar.d(this.J.f26237i, this.V.L.f26237i, 0, 0);
                } else if (i21 == 2) {
                    cVar.d(this.M.f26237i, this.K.f26237i, 0, 8);
                    cVar.d(this.K.f26237i, this.V.M.f26237i, 0, 4);
                    cVar.d(this.K.f26237i, this.V.K.f26237i, 0, 0);
                } else if (i21 == 3) {
                    cVar.d(this.K.f26237i, this.M.f26237i, 0, 8);
                    cVar.d(this.K.f26237i, this.V.K.f26237i, 0, 4);
                    cVar.d(this.K.f26237i, this.V.M.f26237i, 0, 0);
                }
            }
        }
    }

    public boolean e() {
        return true;
    }

    public String toString() {
        String a10 = e.a(android.support.v4.media.a.a("[Barrier] "), this.f26266j0, " {");
        for (int i10 = 0; i10 < this.f26305s0; i10++) {
            f fVar = this.f26304r0[i10];
            if (i10 > 0) {
                a10 = f.a(a10, ", ");
            }
            StringBuilder a11 = android.support.v4.media.a.a(a10);
            a11.append(fVar.f26266j0);
            a10 = a11.toString();
        }
        return f.a(a10, "}");
    }
}
