package w2;

import a3.d;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import g3.f;
import g3.g;
import java.util.ArrayList;
import java.util.List;
import o1.p;
import u2.e;
import u2.j;
import x2.a;
import x2.c;
import x2.o;

/* compiled from: BaseStrokeContent */
public abstract class a implements a.b, j, d {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f26869a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f26870b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f26871c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f26872d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final e f26873e;

    /* renamed from: f  reason: collision with root package name */
    public final c3.b f26874f;

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f26875g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f26876h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f26877i;

    /* renamed from: j  reason: collision with root package name */
    public final x2.a<?, Float> f26878j;

    /* renamed from: k  reason: collision with root package name */
    public final x2.a<?, Integer> f26879k;

    /* renamed from: l  reason: collision with root package name */
    public final List<x2.a<?, Float>> f26880l;

    /* renamed from: m  reason: collision with root package name */
    public final x2.a<?, Float> f26881m;

    /* renamed from: n  reason: collision with root package name */
    public x2.a<ColorFilter, ColorFilter> f26882n;

    /* compiled from: BaseStrokeContent */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<l> f26883a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final r f26884b;

        public b(r rVar, C0270a aVar) {
            this.f26884b = rVar;
        }
    }

    public a(e eVar, c3.b bVar, Paint.Cap cap, Paint.Join join, float f10, d dVar, a3.b bVar2, List<a3.b> list, a3.b bVar3) {
        v2.a aVar = new v2.a(1);
        this.f26877i = aVar;
        this.f26873e = eVar;
        this.f26874f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f26879k = dVar.a();
        this.f26878j = bVar2.a();
        if (bVar3 == null) {
            this.f26881m = null;
        } else {
            this.f26881m = bVar3.a();
        }
        this.f26880l = new ArrayList(list.size());
        this.f26876h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f26880l.add(list.get(i10).a());
        }
        bVar.g(this.f26879k);
        bVar.g(this.f26878j);
        for (int i11 = 0; i11 < this.f26880l.size(); i11++) {
            bVar.g(this.f26880l.get(i11));
        }
        x2.a<?, Float> aVar2 = this.f26881m;
        if (aVar2 != null) {
            bVar.g(aVar2);
        }
        this.f26879k.f27249a.add(this);
        this.f26878j.f27249a.add(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f26880l.get(i12).f27249a.add(this);
        }
        x2.a<?, Float> aVar3 = this.f26881m;
        if (aVar3 != null) {
            aVar3.f27249a.add(this);
        }
    }

    public <T> void b(T t10, p pVar) {
        if (t10 == j.f25988d) {
            this.f26879k.i(pVar);
        } else if (t10 == j.f25999o) {
            this.f26878j.i(pVar);
        } else if (t10 == j.C) {
            x2.a<ColorFilter, ColorFilter> aVar = this.f26882n;
            if (aVar != null) {
                this.f26874f.f4155u.remove(aVar);
            }
            if (pVar == null) {
                this.f26882n = null;
                return;
            }
            o oVar = new o(pVar, null);
            this.f26882n = oVar;
            oVar.f27249a.add(this);
            this.f26874f.g(this.f26882n);
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f26870b.reset();
        for (int i10 = 0; i10 < this.f26875g.size(); i10++) {
            b bVar = this.f26875g.get(i10);
            for (int i11 = 0; i11 < bVar.f26883a.size(); i11++) {
                this.f26870b.addPath(bVar.f26883a.get(i11).i(), matrix);
            }
        }
        this.f26870b.computeBounds(this.f26872d, false);
        float j10 = ((c) this.f26878j).j();
        RectF rectF2 = this.f26872d;
        float f10 = j10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f26872d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        u2.c.a("StrokeContent#getBounds");
    }

    public void d() {
        this.f26873e.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        f.f(eVar, i10, list, eVar2, this);
    }

    public void f(List<b> list, List<b> list2) {
        r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof r) {
                r rVar2 = (r) bVar;
                if (rVar2.f26995c == 2) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.f26994b.add(this);
        }
        b bVar2 = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            b bVar3 = list2.get(size2);
            if (bVar3 instanceof r) {
                r rVar3 = (r) bVar3;
                if (rVar3.f26995c == 2) {
                    if (bVar2 != null) {
                        this.f26875g.add(bVar2);
                    }
                    bVar2 = new b(rVar3, (C0270a) null);
                    rVar3.f26994b.add(this);
                }
            }
            if (bVar3 instanceof l) {
                if (bVar2 == null) {
                    bVar2 = new b(rVar, (C0270a) null);
                }
                bVar2.f26883a.add((l) bVar3);
            }
        }
        if (bVar2 != null) {
            this.f26875g.add(bVar2);
        }
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr = g.f18439d;
        boolean z10 = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix2.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            u2.c.a("StrokeContent#draw");
            return;
        }
        x2.e eVar = (x2.e) this.f26879k;
        float j10 = (((float) i10) / 255.0f) * ((float) eVar.j(eVar.a(), eVar.c()));
        float f10 = 100.0f;
        this.f26877i.setAlpha(f.c((int) ((j10 / 100.0f) * 255.0f), 0, 255));
        this.f26877i.setStrokeWidth(g.d(matrix) * ((c) this.f26878j).j());
        if (this.f26877i.getStrokeWidth() <= 0.0f) {
            u2.c.a("StrokeContent#draw");
            return;
        }
        float f11 = 1.0f;
        if (this.f26880l.isEmpty()) {
            u2.c.a("StrokeContent#applyDashPattern");
        } else {
            float d10 = g.d(matrix);
            for (int i11 = 0; i11 < this.f26880l.size(); i11++) {
                this.f26876h[i11] = ((Float) this.f26880l.get(i11).e()).floatValue();
                if (i11 % 2 == 0) {
                    float[] fArr2 = this.f26876h;
                    if (fArr2[i11] < 1.0f) {
                        fArr2[i11] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f26876h;
                    if (fArr3[i11] < 0.1f) {
                        fArr3[i11] = 0.1f;
                    }
                }
                float[] fArr4 = this.f26876h;
                fArr4[i11] = fArr4[i11] * d10;
            }
            x2.a<?, Float> aVar = this.f26881m;
            this.f26877i.setPathEffect(new DashPathEffect(this.f26876h, aVar == null ? 0.0f : aVar.e().floatValue() * d10));
            u2.c.a("StrokeContent#applyDashPattern");
        }
        x2.a<ColorFilter, ColorFilter> aVar2 = this.f26882n;
        if (aVar2 != null) {
            this.f26877i.setColorFilter(aVar2.e());
        }
        int i12 = 0;
        while (i12 < this.f26875g.size()) {
            b bVar = this.f26875g.get(i12);
            r rVar = bVar.f26884b;
            if (rVar == null) {
                this.f26870b.reset();
                for (int size = bVar.f26883a.size() - 1; size >= 0; size--) {
                    this.f26870b.addPath(bVar.f26883a.get(size).i(), matrix2);
                }
                u2.c.a("StrokeContent#buildPath");
                canvas2.drawPath(this.f26870b, this.f26877i);
                u2.c.a("StrokeContent#drawPath");
            } else if (rVar == null) {
                u2.c.a("StrokeContent#applyTrimPath");
            } else {
                this.f26870b.reset();
                int size2 = bVar.f26883a.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    this.f26870b.addPath(bVar.f26883a.get(size2).i(), matrix2);
                }
                this.f26869a.setPath(this.f26870b, z10);
                float length = this.f26869a.getLength();
                while (this.f26869a.nextContour()) {
                    length += this.f26869a.getLength();
                }
                float floatValue = (bVar.f26884b.f26998f.e().floatValue() * length) / 360.0f;
                float floatValue2 = ((bVar.f26884b.f26996d.e().floatValue() * length) / f10) + floatValue;
                float floatValue3 = ((bVar.f26884b.f26997e.e().floatValue() * length) / f10) + floatValue;
                int size3 = bVar.f26883a.size() - 1;
                float f12 = 0.0f;
                while (size3 >= 0) {
                    this.f26871c.set(bVar.f26883a.get(size3).i());
                    this.f26871c.transform(matrix2);
                    this.f26869a.setPath(this.f26871c, z10);
                    float length2 = this.f26869a.getLength();
                    if (floatValue3 > length) {
                        float f13 = floatValue3 - length;
                        if (f13 < f12 + length2 && f12 < f13) {
                            g.a(this.f26871c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f13 / length2, f11), 0.0f);
                            canvas2.drawPath(this.f26871c, this.f26877i);
                            f12 += length2;
                            size3--;
                            z10 = false;
                            f11 = 1.0f;
                        }
                    }
                    float f14 = f12 + length2;
                    if (f14 >= floatValue2 && f12 <= floatValue3) {
                        if (f14 > floatValue3 || floatValue2 >= f12) {
                            g.a(this.f26871c, floatValue2 < f12 ? 0.0f : (floatValue2 - f12) / length2, floatValue3 > f14 ? 1.0f : (floatValue3 - f12) / length2, 0.0f);
                            canvas2.drawPath(this.f26871c, this.f26877i);
                        } else {
                            canvas2.drawPath(this.f26871c, this.f26877i);
                        }
                    }
                    f12 += length2;
                    size3--;
                    z10 = false;
                    f11 = 1.0f;
                }
                u2.c.a("StrokeContent#applyTrimPath");
            }
            i12++;
            z10 = false;
            f10 = 100.0f;
            f11 = 1.0f;
        }
        u2.c.a("StrokeContent#draw");
    }
}
