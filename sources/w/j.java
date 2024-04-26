package w;

import v.f;
import v.h;

/* compiled from: GuidelineReference */
public class j extends p {
    public j(f fVar) {
        super(fVar);
        fVar.f26253d.f();
        fVar.f26255e.f();
        this.f26854f = ((h) fVar).f26302v0;
    }

    public void a(d dVar) {
        f fVar = this.f26856h;
        if (fVar.f26814c && !fVar.f26821j) {
            this.f26856h.c((int) ((((float) fVar.f26823l.get(0).f26818g) * ((h) this.f26850b).f26298r0) + 0.5f));
        }
    }

    public void d() {
        f fVar = this.f26850b;
        h hVar = (h) fVar;
        int i10 = hVar.f26299s0;
        int i11 = hVar.f26300t0;
        if (hVar.f26302v0 == 1) {
            if (i10 != -1) {
                this.f26856h.f26823l.add(fVar.V.f26253d.f26856h);
                this.f26850b.V.f26253d.f26856h.f26822k.add(this.f26856h);
                this.f26856h.f26817f = i10;
            } else if (i11 != -1) {
                this.f26856h.f26823l.add(fVar.V.f26253d.f26857i);
                this.f26850b.V.f26253d.f26857i.f26822k.add(this.f26856h);
                this.f26856h.f26817f = -i11;
            } else {
                f fVar2 = this.f26856h;
                fVar2.f26813b = true;
                fVar2.f26823l.add(fVar.V.f26253d.f26857i);
                this.f26850b.V.f26253d.f26857i.f26822k.add(this.f26856h);
            }
            m(this.f26850b.f26253d.f26856h);
            m(this.f26850b.f26253d.f26857i);
            return;
        }
        if (i10 != -1) {
            this.f26856h.f26823l.add(fVar.V.f26255e.f26856h);
            this.f26850b.V.f26255e.f26856h.f26822k.add(this.f26856h);
            this.f26856h.f26817f = i10;
        } else if (i11 != -1) {
            this.f26856h.f26823l.add(fVar.V.f26255e.f26857i);
            this.f26850b.V.f26255e.f26857i.f26822k.add(this.f26856h);
            this.f26856h.f26817f = -i11;
        } else {
            f fVar3 = this.f26856h;
            fVar3.f26813b = true;
            fVar3.f26823l.add(fVar.V.f26255e.f26857i);
            this.f26850b.V.f26255e.f26857i.f26822k.add(this.f26856h);
        }
        m(this.f26850b.f26255e.f26856h);
        m(this.f26850b.f26255e.f26857i);
    }

    public void e() {
        f fVar = this.f26850b;
        if (((h) fVar).f26302v0 == 1) {
            fVar.f26248a0 = this.f26856h.f26818g;
        } else {
            fVar.f26250b0 = this.f26856h.f26818g;
        }
    }

    public void f() {
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
