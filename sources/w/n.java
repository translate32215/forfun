package w;

import android.support.v4.media.a;
import t.g;
import v.d;
import v.f;
import v.i;
import w.f;

/* compiled from: VerticalWidgetRun */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f26841k;

    /* renamed from: l  reason: collision with root package name */
    public g f26842l = null;

    public n(f fVar) {
        super(fVar);
        f fVar2 = new f(this);
        this.f26841k = fVar2;
        this.f26856h.f26816e = f.a.TOP;
        this.f26857i.f26816e = f.a.BOTTOM;
        fVar2.f26816e = f.a.BASELINE;
        this.f26854f = 1;
    }

    public void a(d dVar) {
        int i10;
        float f10;
        float f11;
        float f12;
        if (g.f(this.f26858j) != 3) {
            g gVar = this.f26853e;
            if (gVar.f26814c && !gVar.f26821j && this.f26852d == 3) {
                v.f fVar = this.f26850b;
                int i11 = fVar.f26282s;
                if (i11 == 2) {
                    v.f fVar2 = fVar.V;
                    if (fVar2 != null) {
                        g gVar2 = fVar2.f26255e.f26853e;
                        if (gVar2.f26821j) {
                            gVar.c((int) ((((float) gVar2.f26818g) * fVar.f26289z) + 0.5f));
                        }
                    }
                } else if (i11 == 3) {
                    g gVar3 = fVar.f26253d.f26853e;
                    if (gVar3.f26821j) {
                        int i12 = fVar.Z;
                        if (i12 == -1) {
                            f11 = (float) gVar3.f26818g;
                            f12 = fVar.Y;
                        } else if (i12 == 0) {
                            f10 = ((float) gVar3.f26818g) * fVar.Y;
                            i10 = (int) (f10 + 0.5f);
                            gVar.c(i10);
                        } else if (i12 != 1) {
                            i10 = 0;
                            gVar.c(i10);
                        } else {
                            f11 = (float) gVar3.f26818g;
                            f12 = fVar.Y;
                        }
                        f10 = f11 / f12;
                        i10 = (int) (f10 + 0.5f);
                        gVar.c(i10);
                    }
                }
            }
            f fVar3 = this.f26856h;
            if (fVar3.f26814c) {
                f fVar4 = this.f26857i;
                if (fVar4.f26814c) {
                    if (!fVar3.f26821j || !fVar4.f26821j || !this.f26853e.f26821j) {
                        if (!this.f26853e.f26821j && this.f26852d == 3) {
                            v.f fVar5 = this.f26850b;
                            if (fVar5.f26281r == 0 && !fVar5.B()) {
                                int i13 = this.f26856h.f26823l.get(0).f26818g;
                                f fVar6 = this.f26856h;
                                int i14 = i13 + fVar6.f26817f;
                                int i15 = this.f26857i.f26823l.get(0).f26818g + this.f26857i.f26817f;
                                fVar6.c(i14);
                                this.f26857i.c(i15);
                                this.f26853e.c(i15 - i14);
                                return;
                            }
                        }
                        if (!this.f26853e.f26821j && this.f26852d == 3 && this.f26849a == 1 && this.f26856h.f26823l.size() > 0 && this.f26857i.f26823l.size() > 0) {
                            int i16 = (this.f26857i.f26823l.get(0).f26818g + this.f26857i.f26817f) - (this.f26856h.f26823l.get(0).f26818g + this.f26856h.f26817f);
                            g gVar4 = this.f26853e;
                            int i17 = gVar4.f26833m;
                            if (i16 < i17) {
                                gVar4.c(i16);
                            } else {
                                gVar4.c(i17);
                            }
                        }
                        if (this.f26853e.f26821j && this.f26856h.f26823l.size() > 0 && this.f26857i.f26823l.size() > 0) {
                            f fVar7 = this.f26856h.f26823l.get(0);
                            f fVar8 = this.f26857i.f26823l.get(0);
                            int i18 = fVar7.f26818g;
                            f fVar9 = this.f26856h;
                            int i19 = fVar9.f26817f + i18;
                            int i20 = fVar8.f26818g;
                            int i21 = this.f26857i.f26817f + i20;
                            float f13 = this.f26850b.f26260g0;
                            if (fVar7 == fVar8) {
                                f13 = 0.5f;
                            } else {
                                i18 = i19;
                                i20 = i21;
                            }
                            fVar9.c((int) ((((float) ((i20 - i18) - this.f26853e.f26818g)) * f13) + ((float) i18) + 0.5f));
                            this.f26857i.c(this.f26856h.f26818g + this.f26853e.f26818g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        v.f fVar10 = this.f26850b;
        l(fVar10.K, fVar10.M, 1);
    }

    public void d() {
        v.f fVar;
        v.f fVar2;
        v.f fVar3;
        v.f fVar4 = this.f26850b;
        if (fVar4.f26247a) {
            this.f26853e.c(fVar4.l());
        }
        if (!this.f26853e.f26821j) {
            this.f26852d = this.f26850b.t();
            if (this.f26850b.E) {
                this.f26842l = new a(this);
            }
            int i10 = this.f26852d;
            if (i10 != 3) {
                if (i10 == 4 && (fVar3 = this.f26850b.V) != null && fVar3.t() == 1) {
                    int l10 = (fVar3.l() - this.f26850b.K.d()) - this.f26850b.M.d();
                    b(this.f26856h, fVar3.f26255e.f26856h, this.f26850b.K.d());
                    b(this.f26857i, fVar3.f26255e.f26857i, -this.f26850b.M.d());
                    this.f26853e.c(l10);
                    return;
                } else if (this.f26852d == 1) {
                    this.f26853e.c(this.f26850b.l());
                }
            }
        } else if (this.f26852d == 4 && (fVar2 = this.f26850b.V) != null && fVar2.t() == 1) {
            b(this.f26856h, fVar2.f26255e.f26856h, this.f26850b.K.d());
            b(this.f26857i, fVar2.f26255e.f26857i, -this.f26850b.M.d());
            return;
        }
        g gVar = this.f26853e;
        boolean z10 = gVar.f26821j;
        if (z10) {
            v.f fVar5 = this.f26850b;
            if (fVar5.f26247a) {
                d[] dVarArr = fVar5.R;
                if (dVarArr[2].f26234f != null && dVarArr[3].f26234f != null) {
                    if (fVar5.B()) {
                        this.f26856h.f26817f = this.f26850b.R[2].d();
                        this.f26857i.f26817f = -this.f26850b.R[3].d();
                    } else {
                        f h10 = h(this.f26850b.R[2]);
                        if (h10 != null) {
                            f fVar6 = this.f26856h;
                            int d10 = this.f26850b.R[2].d();
                            fVar6.f26823l.add(h10);
                            fVar6.f26817f = d10;
                            h10.f26822k.add(fVar6);
                        }
                        f h11 = h(this.f26850b.R[3]);
                        if (h11 != null) {
                            f fVar7 = this.f26857i;
                            fVar7.f26823l.add(h11);
                            fVar7.f26817f = -this.f26850b.R[3].d();
                            h11.f26822k.add(fVar7);
                        }
                        this.f26856h.f26813b = true;
                        this.f26857i.f26813b = true;
                    }
                    v.f fVar8 = this.f26850b;
                    if (fVar8.E) {
                        b(this.f26841k, this.f26856h, fVar8.f26252c0);
                        return;
                    }
                    return;
                } else if (dVarArr[2].f26234f != null) {
                    f h12 = h(dVarArr[2]);
                    if (h12 != null) {
                        f fVar9 = this.f26856h;
                        int d11 = this.f26850b.R[2].d();
                        fVar9.f26823l.add(h12);
                        fVar9.f26817f = d11;
                        h12.f26822k.add(fVar9);
                        b(this.f26857i, this.f26856h, this.f26853e.f26818g);
                        v.f fVar10 = this.f26850b;
                        if (fVar10.E) {
                            b(this.f26841k, this.f26856h, fVar10.f26252c0);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f26234f != null) {
                    f h13 = h(dVarArr[3]);
                    if (h13 != null) {
                        f fVar11 = this.f26857i;
                        fVar11.f26823l.add(h13);
                        fVar11.f26817f = -this.f26850b.R[3].d();
                        h13.f26822k.add(fVar11);
                        b(this.f26856h, this.f26857i, -this.f26853e.f26818g);
                    }
                    v.f fVar12 = this.f26850b;
                    if (fVar12.E) {
                        b(this.f26841k, this.f26856h, fVar12.f26252c0);
                        return;
                    }
                    return;
                } else if (dVarArr[4].f26234f != null) {
                    f h14 = h(dVarArr[4]);
                    if (h14 != null) {
                        f fVar13 = this.f26841k;
                        fVar13.f26823l.add(h14);
                        fVar13.f26817f = 0;
                        h14.f26822k.add(fVar13);
                        b(this.f26856h, this.f26841k, -this.f26850b.f26252c0);
                        b(this.f26857i, this.f26856h, this.f26853e.f26818g);
                        return;
                    }
                    return;
                } else if (!(fVar5 instanceof i) && fVar5.V != null && fVar5.i(d.a.CENTER).f26234f == null) {
                    v.f fVar14 = this.f26850b;
                    b(this.f26856h, fVar14.V.f26255e.f26856h, fVar14.w());
                    b(this.f26857i, this.f26856h, this.f26853e.f26818g);
                    v.f fVar15 = this.f26850b;
                    if (fVar15.E) {
                        b(this.f26841k, this.f26856h, fVar15.f26252c0);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z10 || this.f26852d != 3) {
            gVar.f26822k.add(this);
            if (gVar.f26821j) {
                a(this);
            }
        } else {
            v.f fVar16 = this.f26850b;
            int i11 = fVar16.f26282s;
            if (i11 == 2) {
                v.f fVar17 = fVar16.V;
                if (fVar17 != null) {
                    g gVar2 = fVar17.f26255e.f26853e;
                    gVar.f26823l.add(gVar2);
                    gVar2.f26822k.add(this.f26853e);
                    g gVar3 = this.f26853e;
                    gVar3.f26813b = true;
                    gVar3.f26822k.add(this.f26856h);
                    this.f26853e.f26822k.add(this.f26857i);
                }
            } else if (i11 == 3 && !fVar16.B()) {
                v.f fVar18 = this.f26850b;
                if (fVar18.f26281r != 3) {
                    g gVar4 = fVar18.f26253d.f26853e;
                    this.f26853e.f26823l.add(gVar4);
                    gVar4.f26822k.add(this.f26853e);
                    g gVar5 = this.f26853e;
                    gVar5.f26813b = true;
                    gVar5.f26822k.add(this.f26856h);
                    this.f26853e.f26822k.add(this.f26857i);
                }
            }
        }
        v.f fVar19 = this.f26850b;
        d[] dVarArr2 = fVar19.R;
        if (dVarArr2[2].f26234f != null && dVarArr2[3].f26234f != null) {
            if (fVar19.B()) {
                this.f26856h.f26817f = this.f26850b.R[2].d();
                this.f26857i.f26817f = -this.f26850b.R[3].d();
            } else {
                f h15 = h(this.f26850b.R[2]);
                f h16 = h(this.f26850b.R[3]);
                if (h15 != null) {
                    h15.f26822k.add(this);
                    if (h15.f26821j) {
                        a(this);
                    }
                }
                if (h16 != null) {
                    h16.f26822k.add(this);
                    if (h16.f26821j) {
                        a(this);
                    }
                }
                this.f26858j = 4;
            }
            if (this.f26850b.E) {
                c(this.f26841k, this.f26856h, 1, this.f26842l);
            }
        } else if (dVarArr2[2].f26234f != null) {
            f h17 = h(dVarArr2[2]);
            if (h17 != null) {
                f fVar20 = this.f26856h;
                int d12 = this.f26850b.R[2].d();
                fVar20.f26823l.add(h17);
                fVar20.f26817f = d12;
                h17.f26822k.add(fVar20);
                c(this.f26857i, this.f26856h, 1, this.f26853e);
                if (this.f26850b.E) {
                    c(this.f26841k, this.f26856h, 1, this.f26842l);
                }
                if (this.f26852d == 3) {
                    v.f fVar21 = this.f26850b;
                    if (fVar21.Y > 0.0f) {
                        l lVar = fVar21.f26253d;
                        if (lVar.f26852d == 3) {
                            lVar.f26853e.f26822k.add(this.f26853e);
                            this.f26853e.f26823l.add(this.f26850b.f26253d.f26853e);
                            this.f26853e.f26812a = this;
                        }
                    }
                }
            }
        } else if (dVarArr2[3].f26234f != null) {
            f h18 = h(dVarArr2[3]);
            if (h18 != null) {
                f fVar22 = this.f26857i;
                fVar22.f26823l.add(h18);
                fVar22.f26817f = -this.f26850b.R[3].d();
                h18.f26822k.add(fVar22);
                c(this.f26856h, this.f26857i, -1, this.f26853e);
                if (this.f26850b.E) {
                    c(this.f26841k, this.f26856h, 1, this.f26842l);
                }
            }
        } else if (dVarArr2[4].f26234f != null) {
            f h19 = h(dVarArr2[4]);
            if (h19 != null) {
                f fVar23 = this.f26841k;
                fVar23.f26823l.add(h19);
                fVar23.f26817f = 0;
                h19.f26822k.add(fVar23);
                c(this.f26856h, this.f26841k, -1, this.f26842l);
                c(this.f26857i, this.f26856h, 1, this.f26853e);
            }
        } else if (!(fVar19 instanceof i) && (fVar = fVar19.V) != null) {
            b(this.f26856h, fVar.f26255e.f26856h, fVar19.w());
            c(this.f26857i, this.f26856h, 1, this.f26853e);
            if (this.f26850b.E) {
                c(this.f26841k, this.f26856h, 1, this.f26842l);
            }
            if (this.f26852d == 3) {
                v.f fVar24 = this.f26850b;
                if (fVar24.Y > 0.0f) {
                    l lVar2 = fVar24.f26253d;
                    if (lVar2.f26852d == 3) {
                        lVar2.f26853e.f26822k.add(this.f26853e);
                        this.f26853e.f26823l.add(this.f26850b.f26253d.f26853e);
                        this.f26853e.f26812a = this;
                    }
                }
            }
        }
        if (this.f26853e.f26823l.size() == 0) {
            this.f26853e.f26814c = true;
        }
    }

    public void e() {
        f fVar = this.f26856h;
        if (fVar.f26821j) {
            this.f26850b.f26250b0 = fVar.f26818g;
        }
    }

    public void f() {
        this.f26851c = null;
        this.f26856h.b();
        this.f26857i.b();
        this.f26841k.b();
        this.f26853e.b();
        this.f26855g = false;
    }

    public boolean k() {
        if (this.f26852d != 3 || this.f26850b.f26282s == 0) {
            return true;
        }
        return false;
    }

    public void m() {
        this.f26855g = false;
        this.f26856h.b();
        this.f26856h.f26821j = false;
        this.f26857i.b();
        this.f26857i.f26821j = false;
        this.f26841k.b();
        this.f26841k.f26821j = false;
        this.f26853e.f26821j = false;
    }

    public String toString() {
        StringBuilder a10 = a.a("VerticalRun ");
        a10.append(this.f26850b.f26266j0);
        return a10.toString();
    }
}
