package w2;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b3.i;
import c3.b;
import g3.f;
import java.util.List;
import k1.c;
import o1.p;
import u2.e;
import u2.j;
import x2.a;

/* compiled from: RectangleContent */
public class n implements a.b, j, l {

    /* renamed from: a  reason: collision with root package name */
    public final Path f26962a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f26963b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final String f26964c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26965d;

    /* renamed from: e  reason: collision with root package name */
    public final e f26966e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, PointF> f26967f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f26968g;

    /* renamed from: h  reason: collision with root package name */
    public final a<?, Float> f26969h;

    /* renamed from: i  reason: collision with root package name */
    public c f26970i = new c(1);

    /* renamed from: j  reason: collision with root package name */
    public boolean f26971j;

    public n(e eVar, b bVar, i iVar) {
        String str;
        boolean z10;
        int i10 = iVar.f3511a;
        switch (i10) {
            case 0:
                str = iVar.f3512b;
                break;
            default:
                str = iVar.f3512b;
                break;
        }
        this.f26964c = str;
        switch (i10) {
            case 0:
                z10 = iVar.f3516f;
                break;
            default:
                z10 = iVar.f3516f;
                break;
        }
        this.f26965d = z10;
        this.f26966e = eVar;
        a<?, PointF> a10 = iVar.f3513c.a();
        this.f26967f = a10;
        a<PointF, PointF> a11 = ((a3.e) iVar.f3514d).a();
        this.f26968g = a11;
        a<Float, Float> a12 = iVar.f3515e.a();
        this.f26969h = a12;
        bVar.g(a10);
        bVar.g(a11);
        bVar.g(a12);
        a10.f27249a.add(this);
        a11.f27249a.add(this);
        a12.f27249a.add(this);
    }

    public String a() {
        return this.f26964c;
    }

    public <T> void b(T t10, p pVar) {
        if (t10 == j.f25992h) {
            this.f26968g.i(pVar);
        } else if (t10 == j.f25994j) {
            this.f26967f.i(pVar);
        } else if (t10 == j.f25993i) {
            this.f26969h.i(pVar);
        }
    }

    public void d() {
        this.f26971j = false;
        this.f26966e.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        f.f(eVar, i10, list, eVar2, this);
    }

    public void f(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = list.get(i10);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f26995c == 1) {
                    this.f26970i.f19876a.add(rVar);
                    rVar.f26994b.add(this);
                }
            }
        }
    }

    public Path i() {
        float f10;
        if (this.f26971j) {
            return this.f26962a;
        }
        this.f26962a.reset();
        if (this.f26965d) {
            this.f26971j = true;
            return this.f26962a;
        }
        PointF e10 = this.f26968g.e();
        float f11 = e10.x / 2.0f;
        float f12 = e10.y / 2.0f;
        a<?, Float> aVar = this.f26969h;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = ((x2.c) aVar).j();
        }
        float min = Math.min(f11, f12);
        if (f10 > min) {
            f10 = min;
        }
        PointF e11 = this.f26967f.e();
        this.f26962a.moveTo(e11.x + f11, (e11.y - f12) + f10);
        this.f26962a.lineTo(e11.x + f11, (e11.y + f12) - f10);
        if (f10 > 0.0f) {
            RectF rectF = this.f26963b;
            float f13 = e11.x;
            float f14 = f10 * 2.0f;
            float f15 = e11.y;
            rectF.set((f13 + f11) - f14, (f15 + f12) - f14, f13 + f11, f15 + f12);
            this.f26962a.arcTo(this.f26963b, 0.0f, 90.0f, false);
        }
        this.f26962a.lineTo((e11.x - f11) + f10, e11.y + f12);
        if (f10 > 0.0f) {
            RectF rectF2 = this.f26963b;
            float f16 = e11.x;
            float f17 = e11.y;
            float f18 = f10 * 2.0f;
            rectF2.set(f16 - f11, (f17 + f12) - f18, (f16 - f11) + f18, f17 + f12);
            this.f26962a.arcTo(this.f26963b, 90.0f, 90.0f, false);
        }
        this.f26962a.lineTo(e11.x - f11, (e11.y - f12) + f10);
        if (f10 > 0.0f) {
            RectF rectF3 = this.f26963b;
            float f19 = e11.x;
            float f20 = e11.y;
            float f21 = f10 * 2.0f;
            rectF3.set(f19 - f11, f20 - f12, (f19 - f11) + f21, (f20 - f12) + f21);
            this.f26962a.arcTo(this.f26963b, 180.0f, 90.0f, false);
        }
        this.f26962a.lineTo((e11.x + f11) - f10, e11.y - f12);
        if (f10 > 0.0f) {
            RectF rectF4 = this.f26963b;
            float f22 = e11.x;
            float f23 = f10 * 2.0f;
            float f24 = e11.y;
            rectF4.set((f22 + f11) - f23, f24 - f12, f22 + f11, (f24 - f12) + f23);
            this.f26962a.arcTo(this.f26963b, 270.0f, 90.0f, false);
        }
        this.f26962a.close();
        this.f26970i.d(this.f26962a);
        this.f26971j = true;
        return this.f26962a;
    }
}
