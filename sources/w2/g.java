package w2;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import b3.c;
import b3.d;
import c3.b;
import java.util.ArrayList;
import java.util.List;
import o1.p;
import s.f;
import u2.e;
import u2.j;
import x2.a;
import x2.o;

/* compiled from: GradientFillContent */
public class g implements d, a.b, j {

    /* renamed from: a  reason: collision with root package name */
    public final String f26914a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26915b;

    /* renamed from: c  reason: collision with root package name */
    public final b f26916c;

    /* renamed from: d  reason: collision with root package name */
    public final f<LinearGradient> f26917d = new f<>(10);

    /* renamed from: e  reason: collision with root package name */
    public final f<RadialGradient> f26918e = new f<>(10);

    /* renamed from: f  reason: collision with root package name */
    public final Path f26919f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f26920g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f26921h;

    /* renamed from: i  reason: collision with root package name */
    public final List<l> f26922i;

    /* renamed from: j  reason: collision with root package name */
    public final int f26923j;

    /* renamed from: k  reason: collision with root package name */
    public final a<c, c> f26924k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Integer, Integer> f26925l;

    /* renamed from: m  reason: collision with root package name */
    public final a<PointF, PointF> f26926m;

    /* renamed from: n  reason: collision with root package name */
    public final a<PointF, PointF> f26927n;

    /* renamed from: o  reason: collision with root package name */
    public a<ColorFilter, ColorFilter> f26928o;

    /* renamed from: p  reason: collision with root package name */
    public o f26929p;

    /* renamed from: q  reason: collision with root package name */
    public final e f26930q;

    /* renamed from: r  reason: collision with root package name */
    public final int f26931r;

    public g(e eVar, b bVar, d dVar) {
        Path path = new Path();
        this.f26919f = path;
        this.f26920g = new v2.a(1);
        this.f26921h = new RectF();
        this.f26922i = new ArrayList();
        this.f26916c = bVar;
        this.f26914a = dVar.f3473g;
        this.f26915b = dVar.f3474h;
        this.f26930q = eVar;
        this.f26923j = dVar.f3467a;
        path.setFillType(dVar.f3468b);
        this.f26931r = (int) (eVar.f25935b.b() / 32.0f);
        a<c, c> a10 = dVar.f3469c.a();
        this.f26924k = a10;
        a10.f27249a.add(this);
        bVar.g(a10);
        a<Integer, Integer> a11 = dVar.f3470d.a();
        this.f26925l = a11;
        a11.f27249a.add(this);
        bVar.g(a11);
        a<PointF, PointF> a12 = dVar.f3471e.a();
        this.f26926m = a12;
        a12.f27249a.add(this);
        bVar.g(a12);
        a<PointF, PointF> a13 = dVar.f3472f.a();
        this.f26927n = a13;
        a13.f27249a.add(this);
        bVar.g(a13);
    }

    public String a() {
        return this.f26914a;
    }

    public <T> void b(T t10, p pVar) {
        if (t10 == j.f25988d) {
            this.f26925l.i(pVar);
        } else if (t10 == j.C) {
            a<ColorFilter, ColorFilter> aVar = this.f26928o;
            if (aVar != null) {
                this.f26916c.f4155u.remove(aVar);
            }
            if (pVar == null) {
                this.f26928o = null;
                return;
            }
            o oVar = new o(pVar, null);
            this.f26928o = oVar;
            oVar.f27249a.add(this);
            this.f26916c.g(this.f26928o);
        } else if (t10 == j.D) {
            o oVar2 = this.f26929p;
            if (oVar2 != null) {
                this.f26916c.f4155u.remove(oVar2);
            }
            if (pVar == null) {
                this.f26929p = null;
                return;
            }
            o oVar3 = new o(pVar, null);
            this.f26929p = oVar3;
            oVar3.f27249a.add(this);
            this.f26916c.g(this.f26929p);
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f26919f.reset();
        for (int i10 = 0; i10 < this.f26922i.size(); i10++) {
            this.f26919f.addPath(this.f26922i.get(i10).i(), matrix);
        }
        this.f26919f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public void d() {
        this.f26930q.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        g3.f.f(eVar, i10, list, eVar2, this);
    }

    public void f(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof l) {
                this.f26922i.add((l) bVar);
            }
        }
    }

    public final int[] g(int[] iArr) {
        o oVar = this.f26929p;
        if (oVar != null) {
            Integer[] numArr = (Integer[]) oVar.e();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r3v24, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.f26915b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f26919f
            r2.reset()
            r2 = 0
            r3 = 0
        L_0x0010:
            java.util.List<w2.l> r4 = r0.f26922i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f26919f
            java.util.List<w2.l> r5 = r0.f26922i
            java.lang.Object r5 = r5.get(r3)
            w2.l r5 = (w2.l) r5
            android.graphics.Path r5 = r5.i()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f26919f
            android.graphics.RectF r4 = r0.f26921h
            r3.computeBounds(r4, r2)
            int r3 = r0.f26923j
            r4 = 1
            if (r3 != r4) goto L_0x0080
            int r3 = r17.j()
            s.f<android.graphics.LinearGradient> r4 = r0.f26917d
            long r5 = (long) r3
            java.lang.Object r3 = r4.e(r5)
            android.graphics.LinearGradient r3 = (android.graphics.LinearGradient) r3
            if (r3 == 0) goto L_0x0049
            goto L_0x00db
        L_0x0049:
            x2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f26926m
            java.lang.Object r3 = r3.e()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            x2.a<android.graphics.PointF, android.graphics.PointF> r4 = r0.f26927n
            java.lang.Object r4 = r4.e()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            x2.a<b3.c, b3.c> r7 = r0.f26924k
            java.lang.Object r7 = r7.e()
            b3.c r7 = (b3.c) r7
            int[] r8 = r7.f3466b
            int[] r14 = r0.g(r8)
            float[] r15 = r7.f3465a
            android.graphics.LinearGradient r7 = new android.graphics.LinearGradient
            float r10 = r3.x
            float r11 = r3.y
            float r12 = r4.x
            float r13 = r4.y
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            s.f<android.graphics.LinearGradient> r3 = r0.f26917d
            r3.h(r5, r7)
            r3 = r7
            goto L_0x00db
        L_0x0080:
            int r3 = r17.j()
            s.f<android.graphics.RadialGradient> r4 = r0.f26918e
            long r5 = (long) r3
            java.lang.Object r3 = r4.e(r5)
            android.graphics.RadialGradient r3 = (android.graphics.RadialGradient) r3
            if (r3 == 0) goto L_0x0090
            goto L_0x00db
        L_0x0090:
            x2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f26926m
            java.lang.Object r3 = r3.e()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            x2.a<android.graphics.PointF, android.graphics.PointF> r4 = r0.f26927n
            java.lang.Object r4 = r4.e()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            x2.a<b3.c, b3.c> r7 = r0.f26924k
            java.lang.Object r7 = r7.e()
            b3.c r7 = (b3.c) r7
            int[] r8 = r7.f3466b
            int[] r13 = r0.g(r8)
            float[] r14 = r7.f3465a
            float r10 = r3.x
            float r11 = r3.y
            float r3 = r4.x
            float r4 = r4.y
            float r3 = r3 - r10
            double r7 = (double) r3
            float r4 = r4 - r11
            double r3 = (double) r4
            double r3 = java.lang.Math.hypot(r7, r3)
            float r3 = (float) r3
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00cd
            r3 = 981668463(0x3a83126f, float:0.001)
            r12 = 981668463(0x3a83126f, float:0.001)
            goto L_0x00ce
        L_0x00cd:
            r12 = r3
        L_0x00ce:
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            s.f<android.graphics.RadialGradient> r4 = r0.f26918e
            r4.h(r5, r3)
        L_0x00db:
            r3.setLocalMatrix(r1)
            android.graphics.Paint r1 = r0.f26920g
            r1.setShader(r3)
            x2.a<android.graphics.ColorFilter, android.graphics.ColorFilter> r1 = r0.f26928o
            if (r1 == 0) goto L_0x00f2
            android.graphics.Paint r3 = r0.f26920g
            java.lang.Object r1 = r1.e()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r3.setColorFilter(r1)
        L_0x00f2:
            r1 = r20
            float r1 = (float) r1
            r3 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r3
            x2.a<java.lang.Integer, java.lang.Integer> r4 = r0.f26925l
            java.lang.Object r4 = r4.e()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            float r1 = r1 * r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            float r1 = r1 * r3
            int r1 = (int) r1
            android.graphics.Paint r3 = r0.f26920g
            r4 = 255(0xff, float:3.57E-43)
            int r1 = g3.f.c(r1, r2, r4)
            r3.setAlpha(r1)
            android.graphics.Path r1 = r0.f26919f
            android.graphics.Paint r2 = r0.f26920g
            r3 = r18
            r3.drawPath(r1, r2)
            java.lang.String r1 = "GradientFillContent#draw"
            u2.c.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.g.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final int j() {
        int round = Math.round(this.f26926m.f27252d * ((float) this.f26931r));
        int round2 = Math.round(this.f26927n.f27252d * ((float) this.f26931r));
        int round3 = Math.round(this.f26924k.f27252d * ((float) this.f26931r));
        int i10 = 17;
        if (round != 0) {
            i10 = 527 * round;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }
}
