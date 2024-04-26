package w2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import b3.n;
import c3.b;
import o1.p;
import t.g;
import u2.e;
import u2.j;
import x2.a;
import x2.o;

/* compiled from: StrokeContent */
public class q extends a {

    /* renamed from: o  reason: collision with root package name */
    public final b f26988o;

    /* renamed from: p  reason: collision with root package name */
    public final String f26989p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f26990q;

    /* renamed from: r  reason: collision with root package name */
    public final a<Integer, Integer> f26991r;

    /* renamed from: s  reason: collision with root package name */
    public a<ColorFilter, ColorFilter> f26992s;

    public q(e eVar, b bVar, n nVar) {
        super(eVar, bVar, g.i(nVar.f3539g), g.j(nVar.f3540h), nVar.f3541i, nVar.f3537e, nVar.f3538f, nVar.f3535c, nVar.f3534b);
        this.f26988o = bVar;
        this.f26989p = nVar.f3533a;
        this.f26990q = nVar.f3542j;
        a<Integer, Integer> a10 = nVar.f3536d.a();
        this.f26991r = a10;
        a10.f27249a.add(this);
        bVar.g(a10);
    }

    public String a() {
        return this.f26989p;
    }

    public <T> void b(T t10, p pVar) {
        super.b(t10, pVar);
        if (t10 == j.f25986b) {
            this.f26991r.i(pVar);
        } else if (t10 == j.C) {
            a<ColorFilter, ColorFilter> aVar = this.f26992s;
            if (aVar != null) {
                this.f26988o.f4155u.remove(aVar);
            }
            if (pVar == null) {
                this.f26992s = null;
                return;
            }
            o oVar = new o(pVar, null);
            this.f26992s = oVar;
            oVar.f27249a.add(this);
            this.f26988o.g(this.f26991r);
        }
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f26990q) {
            Paint paint = this.f26877i;
            x2.b bVar = (x2.b) this.f26991r;
            paint.setColor(bVar.j(bVar.a(), bVar.c()));
            a<ColorFilter, ColorFilter> aVar = this.f26992s;
            if (aVar != null) {
                this.f26877i.setColorFilter(aVar.e());
            }
            super.h(canvas, matrix, i10);
        }
    }
}
