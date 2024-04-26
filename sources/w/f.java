package w;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyNode */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f26812a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26813b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26814c = false;

    /* renamed from: d  reason: collision with root package name */
    public p f26815d;

    /* renamed from: e  reason: collision with root package name */
    public a f26816e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f26817f;

    /* renamed from: g  reason: collision with root package name */
    public int f26818g;

    /* renamed from: h  reason: collision with root package name */
    public int f26819h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f26820i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f26821j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f26822k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f26823l = new ArrayList();

    /* compiled from: DependencyNode */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f26815d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f26823l) {
            if (!fVar.f26821j) {
                return;
            }
        }
        this.f26814c = true;
        d dVar2 = this.f26812a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f26813b) {
            this.f26815d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f next : this.f26823l) {
            if (!(next instanceof g)) {
                i10++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f26821j) {
            g gVar = this.f26820i;
            if (gVar != null) {
                if (gVar.f26821j) {
                    this.f26817f = this.f26819h * gVar.f26818g;
                } else {
                    return;
                }
            }
            c(fVar2.f26818g + this.f26817f);
        }
        d dVar3 = this.f26812a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f26823l.clear();
        this.f26822k.clear();
        this.f26821j = false;
        this.f26818g = 0;
        this.f26814c = false;
        this.f26813b = false;
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

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26815d.f26850b.f26266j0);
        sb2.append(":");
        sb2.append(this.f26816e);
        sb2.append("(");
        sb2.append(this.f26821j ? Integer.valueOf(this.f26818g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f26823l.size());
        sb2.append(":d=");
        sb2.append(this.f26822k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
