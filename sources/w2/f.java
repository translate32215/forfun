package w2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b3.k;
import c3.b;
import java.util.ArrayList;
import java.util.List;
import o1.p;
import u2.c;
import u2.e;
import u2.j;
import x2.a;
import x2.o;

/* compiled from: FillContent */
public class f implements d, a.b, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f26904a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f26905b = new v2.a(1);

    /* renamed from: c  reason: collision with root package name */
    public final b f26906c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26907d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26908e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f26909f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final a<Integer, Integer> f26910g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Integer, Integer> f26911h;

    /* renamed from: i  reason: collision with root package name */
    public a<ColorFilter, ColorFilter> f26912i;

    /* renamed from: j  reason: collision with root package name */
    public final e f26913j;

    public f(e eVar, b bVar, k kVar) {
        Path path = new Path();
        this.f26904a = path;
        this.f26906c = bVar;
        this.f26907d = kVar.f3522c;
        this.f26908e = kVar.f3525f;
        this.f26913j = eVar;
        if (kVar.f3523d == null || kVar.f3524e == null) {
            this.f26910g = null;
            this.f26911h = null;
            return;
        }
        path.setFillType(kVar.f3521b);
        a<Integer, Integer> a10 = kVar.f3523d.a();
        this.f26910g = a10;
        a10.f27249a.add(this);
        bVar.g(a10);
        a<Integer, Integer> a11 = kVar.f3524e.a();
        this.f26911h = a11;
        a11.f27249a.add(this);
        bVar.g(a11);
    }

    public String a() {
        return this.f26907d;
    }

    public <T> void b(T t10, p pVar) {
        if (t10 == j.f25985a) {
            this.f26910g.i(pVar);
        } else if (t10 == j.f25988d) {
            this.f26911h.i(pVar);
        } else if (t10 == j.C) {
            a<ColorFilter, ColorFilter> aVar = this.f26912i;
            if (aVar != null) {
                this.f26906c.f4155u.remove(aVar);
            }
            if (pVar == null) {
                this.f26912i = null;
                return;
            }
            o oVar = new o(pVar, null);
            this.f26912i = oVar;
            oVar.f27249a.add(this);
            this.f26906c.g(this.f26912i);
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f26904a.reset();
        for (int i10 = 0; i10 < this.f26909f.size(); i10++) {
            this.f26904a.addPath(this.f26909f.get(i10).i(), matrix);
        }
        this.f26904a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public void d() {
        this.f26913j.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        g3.f.f(eVar, i10, list, eVar2, this);
    }

    public void f(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof l) {
                this.f26909f.add((l) bVar);
            }
        }
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f26908e) {
            Paint paint = this.f26905b;
            x2.b bVar = (x2.b) this.f26910g;
            paint.setColor(bVar.j(bVar.a(), bVar.c()));
            this.f26905b.setAlpha(g3.f.c((int) ((((((float) i10) / 255.0f) * ((float) this.f26911h.e().intValue())) / 100.0f) * 255.0f), 0, 255));
            a<ColorFilter, ColorFilter> aVar = this.f26912i;
            if (aVar != null) {
                this.f26905b.setColorFilter(aVar.e());
            }
            this.f26904a.reset();
            for (int i11 = 0; i11 < this.f26909f.size(); i11++) {
                this.f26904a.addPath(this.f26909f.get(i11).i(), matrix);
            }
            canvas.drawPath(this.f26904a, this.f26905b);
            c.a("FillContent#draw");
        }
    }
}
