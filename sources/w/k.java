package w;

import v.a;
import v.f;
import w.f;

/* compiled from: HelperReferences */
public class k extends p {
    public k(f fVar) {
        super(fVar);
    }

    public void a(d dVar) {
        a aVar = (a) this.f26850b;
        int i10 = aVar.f26205t0;
        int i11 = 0;
        int i12 = -1;
        for (f fVar : this.f26856h.f26823l) {
            int i13 = fVar.f26818g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            this.f26856h.c(i12 + aVar.f26207v0);
        } else {
            this.f26856h.c(i11 + aVar.f26207v0);
        }
    }

    public void d() {
        f fVar = this.f26850b;
        if (fVar instanceof a) {
            f fVar2 = this.f26856h;
            fVar2.f26813b = true;
            a aVar = (a) fVar;
            int i10 = aVar.f26205t0;
            boolean z10 = aVar.f26206u0;
            int i11 = 0;
            if (i10 == 0) {
                fVar2.f26816e = f.a.LEFT;
                while (i11 < aVar.f26305s0) {
                    v.f fVar3 = aVar.f26304r0[i11];
                    if (z10 || fVar3.f26264i0 != 8) {
                        f fVar4 = fVar3.f26253d.f26856h;
                        fVar4.f26822k.add(this.f26856h);
                        this.f26856h.f26823l.add(fVar4);
                    }
                    i11++;
                }
                m(this.f26850b.f26253d.f26856h);
                m(this.f26850b.f26253d.f26857i);
            } else if (i10 == 1) {
                fVar2.f26816e = f.a.RIGHT;
                while (i11 < aVar.f26305s0) {
                    v.f fVar5 = aVar.f26304r0[i11];
                    if (z10 || fVar5.f26264i0 != 8) {
                        f fVar6 = fVar5.f26253d.f26857i;
                        fVar6.f26822k.add(this.f26856h);
                        this.f26856h.f26823l.add(fVar6);
                    }
                    i11++;
                }
                m(this.f26850b.f26253d.f26856h);
                m(this.f26850b.f26253d.f26857i);
            } else if (i10 == 2) {
                fVar2.f26816e = f.a.TOP;
                while (i11 < aVar.f26305s0) {
                    v.f fVar7 = aVar.f26304r0[i11];
                    if (z10 || fVar7.f26264i0 != 8) {
                        f fVar8 = fVar7.f26255e.f26856h;
                        fVar8.f26822k.add(this.f26856h);
                        this.f26856h.f26823l.add(fVar8);
                    }
                    i11++;
                }
                m(this.f26850b.f26255e.f26856h);
                m(this.f26850b.f26255e.f26857i);
            } else if (i10 == 3) {
                fVar2.f26816e = f.a.BOTTOM;
                while (i11 < aVar.f26305s0) {
                    v.f fVar9 = aVar.f26304r0[i11];
                    if (z10 || fVar9.f26264i0 != 8) {
                        f fVar10 = fVar9.f26255e.f26857i;
                        fVar10.f26822k.add(this.f26856h);
                        this.f26856h.f26823l.add(fVar10);
                    }
                    i11++;
                }
                m(this.f26850b.f26255e.f26856h);
                m(this.f26850b.f26255e.f26857i);
            }
        }
    }

    public void e() {
        v.f fVar = this.f26850b;
        if (fVar instanceof a) {
            int i10 = ((a) fVar).f26205t0;
            if (i10 == 0 || i10 == 1) {
                fVar.f26248a0 = this.f26856h.f26818g;
            } else {
                fVar.f26250b0 = this.f26856h.f26818g;
            }
        }
    }

    public void f() {
        this.f26851c = null;
        this.f26856h.b();
    }

    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f26856h.f26822k.add(fVar);
        fVar.f26823l.add(this.f26856h);
    }
}
