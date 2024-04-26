package x2;

import a3.b;
import a3.d;
import a3.f;
import a3.j;
import a3.k;
import android.graphics.Matrix;
import android.graphics.PointF;
import h3.c;
import java.util.Collections;
import o1.p;
import x2.a;

/* compiled from: TransformKeyframeAnimation */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f27280a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f27281b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f27282c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f27283d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f27284e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f27285f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f27286g;

    /* renamed from: h  reason: collision with root package name */
    public a<c, c> f27287h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f27288i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f27289j;

    /* renamed from: k  reason: collision with root package name */
    public c f27290k;

    /* renamed from: l  reason: collision with root package name */
    public c f27291l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f27292m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f27293n;

    public n(j jVar) {
        a<PointF, PointF> aVar;
        a<PointF, PointF> aVar2;
        a<c, c> aVar3;
        a<Float, Float> aVar4;
        c cVar;
        c cVar2;
        k1.c cVar3 = jVar.f51a;
        if (cVar3 == null) {
            aVar = null;
        } else {
            aVar = cVar3.a();
        }
        this.f27285f = aVar;
        k<PointF, PointF> kVar = jVar.f52b;
        if (kVar == null) {
            aVar2 = null;
        } else {
            aVar2 = kVar.a();
        }
        this.f27286g = aVar2;
        f fVar = jVar.f53c;
        if (fVar == null) {
            aVar3 = null;
        } else {
            aVar3 = fVar.a();
        }
        this.f27287h = aVar3;
        b bVar = jVar.f54d;
        if (bVar == null) {
            aVar4 = null;
        } else {
            aVar4 = bVar.a();
        }
        this.f27288i = aVar4;
        b bVar2 = jVar.f56f;
        if (bVar2 == null) {
            cVar = null;
        } else {
            cVar = (c) bVar2.a();
        }
        this.f27290k = cVar;
        if (cVar != null) {
            this.f27281b = new Matrix();
            this.f27282c = new Matrix();
            this.f27283d = new Matrix();
            this.f27284e = new float[9];
        } else {
            this.f27281b = null;
            this.f27282c = null;
            this.f27283d = null;
            this.f27284e = null;
        }
        b bVar3 = jVar.f57g;
        if (bVar3 == null) {
            cVar2 = null;
        } else {
            cVar2 = (c) bVar3.a();
        }
        this.f27291l = cVar2;
        d dVar = jVar.f55e;
        if (dVar != null) {
            this.f27289j = dVar.a();
        }
        b bVar4 = jVar.f58h;
        if (bVar4 != null) {
            this.f27292m = bVar4.a();
        } else {
            this.f27292m = null;
        }
        b bVar5 = jVar.f59i;
        if (bVar5 != null) {
            this.f27293n = bVar5.a();
        } else {
            this.f27293n = null;
        }
    }

    public void a(c3.b bVar) {
        bVar.g(this.f27289j);
        bVar.g(this.f27292m);
        bVar.g(this.f27293n);
        bVar.g(this.f27285f);
        bVar.g(this.f27286g);
        bVar.g(this.f27287h);
        bVar.g(this.f27288i);
        bVar.g(this.f27290k);
        bVar.g(this.f27291l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f27289j;
        if (aVar != null) {
            aVar.f27249a.add(bVar);
        }
        a<?, Float> aVar2 = this.f27292m;
        if (aVar2 != null) {
            aVar2.f27249a.add(bVar);
        }
        a<?, Float> aVar3 = this.f27293n;
        if (aVar3 != null) {
            aVar3.f27249a.add(bVar);
        }
        a<PointF, PointF> aVar4 = this.f27285f;
        if (aVar4 != null) {
            aVar4.f27249a.add(bVar);
        }
        a<?, PointF> aVar5 = this.f27286g;
        if (aVar5 != null) {
            aVar5.f27249a.add(bVar);
        }
        a<c, c> aVar6 = this.f27287h;
        if (aVar6 != null) {
            aVar6.f27249a.add(bVar);
        }
        a<Float, Float> aVar7 = this.f27288i;
        if (aVar7 != null) {
            aVar7.f27249a.add(bVar);
        }
        c cVar = this.f27290k;
        if (cVar != null) {
            cVar.f27249a.add(bVar);
        }
        c cVar2 = this.f27291l;
        if (cVar2 != null) {
            cVar2.f27249a.add(bVar);
        }
    }

    public <T> boolean c(T t10, p pVar) {
        c cVar;
        c cVar2;
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t10 == u2.j.f25989e) {
            a<PointF, PointF> aVar3 = this.f27285f;
            if (aVar3 == null) {
                this.f27285f = new o(pVar, new PointF());
                return true;
            }
            aVar3.i(pVar);
            return true;
        } else if (t10 == u2.j.f25990f) {
            a<?, PointF> aVar4 = this.f27286g;
            if (aVar4 == null) {
                this.f27286g = new o(pVar, new PointF());
                return true;
            }
            aVar4.i(pVar);
            return true;
        } else if (t10 == u2.j.f25995k) {
            a<c, c> aVar5 = this.f27287h;
            if (aVar5 == null) {
                this.f27287h = new o(pVar, new c());
                return true;
            }
            aVar5.i(pVar);
            return true;
        } else if (t10 == u2.j.f25996l) {
            a<Float, Float> aVar6 = this.f27288i;
            if (aVar6 == null) {
                this.f27288i = new o(pVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.i(pVar);
            return true;
        } else if (t10 == u2.j.f25987c) {
            a<Integer, Integer> aVar7 = this.f27289j;
            if (aVar7 == null) {
                this.f27289j = new o(pVar, 100);
                return true;
            }
            aVar7.i(pVar);
            return true;
        } else if (t10 != u2.j.f26009y || (aVar2 = this.f27292m) == null) {
            if (t10 != u2.j.f26010z || (aVar = this.f27293n) == null) {
                if (t10 == u2.j.f25997m && (cVar2 = this.f27290k) != null) {
                    if (cVar2 == null) {
                        this.f27290k = new c(Collections.singletonList(new h3.a(Float.valueOf(0.0f))));
                    }
                    this.f27290k.i(pVar);
                    return true;
                } else if (t10 != u2.j.f25998n || (cVar = this.f27291l) == null) {
                    return false;
                } else {
                    if (cVar == null) {
                        this.f27291l = new c(Collections.singletonList(new h3.a(Float.valueOf(0.0f))));
                    }
                    this.f27291l.i(pVar);
                    return true;
                }
            } else if (aVar == null) {
                this.f27293n = new o(pVar, 100);
                return true;
            } else {
                aVar.i(pVar);
                return true;
            }
        } else if (aVar2 == null) {
            this.f27292m = new o(pVar, 100);
            return true;
        } else {
            aVar2.i(pVar);
            return true;
        }
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f27284e[i10] = 0.0f;
        }
    }

    public Matrix e() {
        float f10;
        this.f27280a.reset();
        a<?, PointF> aVar = this.f27286g;
        if (aVar != null) {
            PointF e10 = aVar.e();
            float f11 = e10.x;
            if (!(f11 == 0.0f && e10.y == 0.0f)) {
                this.f27280a.preTranslate(f11, e10.y);
            }
        }
        a<Float, Float> aVar2 = this.f27288i;
        if (aVar2 != null) {
            if (aVar2 instanceof o) {
                f10 = aVar2.e().floatValue();
            } else {
                f10 = ((c) aVar2).j();
            }
            if (f10 != 0.0f) {
                this.f27280a.preRotate(f10);
            }
        }
        if (this.f27290k != null) {
            c cVar = this.f27291l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.j()) + 90.0f)));
            c cVar2 = this.f27291l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.j()) + 90.0f)));
            d();
            float[] fArr = this.f27284e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f12 = -sin;
            fArr[3] = f12;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f27281b.setValues(fArr);
            d();
            float[] fArr2 = this.f27284e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f27290k.j()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f27282c.setValues(fArr2);
            d();
            float[] fArr3 = this.f27284e;
            fArr3[0] = cos;
            fArr3[1] = f12;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f27283d.setValues(fArr3);
            this.f27282c.preConcat(this.f27281b);
            this.f27283d.preConcat(this.f27282c);
            this.f27280a.preConcat(this.f27283d);
        }
        a<c, c> aVar3 = this.f27287h;
        if (aVar3 != null) {
            c e11 = aVar3.e();
            float f13 = e11.f18883a;
            if (!(f13 == 1.0f && e11.f18884b == 1.0f)) {
                this.f27280a.preScale(f13, e11.f18884b);
            }
        }
        a<PointF, PointF> aVar4 = this.f27285f;
        if (aVar4 != null) {
            PointF e12 = aVar4.e();
            float f14 = e12.x;
            if (!(f14 == 0.0f && e12.y == 0.0f)) {
                this.f27280a.preTranslate(-f14, -e12.y);
            }
        }
        return this.f27280a;
    }

    public Matrix f(float f10) {
        a<?, PointF> aVar = this.f27286g;
        PointF pointF = null;
        PointF e10 = aVar == null ? null : aVar.e();
        a<c, c> aVar2 = this.f27287h;
        c e11 = aVar2 == null ? null : aVar2.e();
        this.f27280a.reset();
        if (e10 != null) {
            this.f27280a.preTranslate(e10.x * f10, e10.y * f10);
        }
        if (e11 != null) {
            double d10 = (double) f10;
            this.f27280a.preScale((float) Math.pow((double) e11.f18883a, d10), (float) Math.pow((double) e11.f18884b, d10));
        }
        a<Float, Float> aVar3 = this.f27288i;
        if (aVar3 != null) {
            float floatValue = aVar3.e().floatValue();
            a<PointF, PointF> aVar4 = this.f27285f;
            if (aVar4 != null) {
                pointF = aVar4.e();
            }
            Matrix matrix = this.f27280a;
            float f11 = floatValue * f10;
            float f12 = 0.0f;
            float f13 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f12 = pointF.y;
            }
            matrix.preRotate(f11, f13, f12);
        }
        return this.f27280a;
    }
}
