package w2;

import android.graphics.Path;
import android.graphics.PointF;
import c3.b;
import g3.f;
import java.util.List;
import k1.c;
import o1.p;
import u2.j;
import x2.a;

/* compiled from: EllipseContent */
public class e implements l, a.b, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f26896a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f26897b;

    /* renamed from: c  reason: collision with root package name */
    public final u2.e f26898c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, PointF> f26899d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, PointF> f26900e;

    /* renamed from: f  reason: collision with root package name */
    public final b3.a f26901f;

    /* renamed from: g  reason: collision with root package name */
    public c f26902g = new c(1);

    /* renamed from: h  reason: collision with root package name */
    public boolean f26903h;

    public e(u2.e eVar, b bVar, b3.a aVar) {
        this.f26897b = aVar.f3460a;
        this.f26898c = eVar;
        a<PointF, PointF> a10 = aVar.f3462c.a();
        this.f26899d = a10;
        a<PointF, PointF> a11 = aVar.f3461b.a();
        this.f26900e = a11;
        this.f26901f = aVar;
        bVar.g(a10);
        bVar.g(a11);
        a10.f27249a.add(this);
        a11.f27249a.add(this);
    }

    public String a() {
        return this.f26897b;
    }

    public <T> void b(T t10, p pVar) {
        if (t10 == j.f25991g) {
            this.f26899d.i(pVar);
        } else if (t10 == j.f25994j) {
            this.f26900e.i(pVar);
        }
    }

    public void d() {
        this.f26903h = false;
        this.f26898c.invalidateSelf();
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
                    this.f26902g.f19876a.add(rVar);
                    rVar.f26994b.add(this);
                }
            }
        }
    }

    public Path i() {
        if (this.f26903h) {
            return this.f26896a;
        }
        this.f26896a.reset();
        if (this.f26901f.f3464e) {
            this.f26903h = true;
            return this.f26896a;
        }
        PointF e10 = this.f26899d.e();
        float f10 = e10.x / 2.0f;
        float f11 = e10.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f26896a.reset();
        if (this.f26901f.f3463d) {
            float f14 = -f11;
            this.f26896a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f26896a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            float f19 = f14;
            this.f26896a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f20 = f12 + 0.0f;
            this.f26896a.cubicTo(f20, f11, f10, f18, f10, 0.0f);
            this.f26896a.cubicTo(f10, f17, f20, f19, 0.0f, f19);
        } else {
            float f21 = -f11;
            this.f26896a.moveTo(0.0f, f21);
            float f22 = f12 + 0.0f;
            float f23 = 0.0f - f13;
            this.f26896a.cubicTo(f22, f21, f10, f23, f10, 0.0f);
            float f24 = f13 + 0.0f;
            this.f26896a.cubicTo(f10, f24, f22, f11, 0.0f, f11);
            float f25 = 0.0f - f12;
            float f26 = -f10;
            this.f26896a.cubicTo(f25, f11, f26, f24, f26, 0.0f);
            float f27 = f21;
            this.f26896a.cubicTo(f26, f23, f25, f27, 0.0f, f27);
        }
        PointF e11 = this.f26900e.e();
        this.f26896a.offset(e11.x, e11.y);
        this.f26896a.close();
        this.f26902g.d(this.f26896a);
        this.f26903h = true;
        return this.f26896a;
    }
}
