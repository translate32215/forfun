package c3;

import a3.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o1.p;
import u2.e;
import u2.n;
import w2.d;
import x2.a;
import x2.c;
import x2.g;
import x2.n;
import z2.f;

/* compiled from: BaseLayer */
public abstract class b implements d, a.b, f {

    /* renamed from: a  reason: collision with root package name */
    public final Path f4135a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f4136b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Paint f4137c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f4138d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f4139e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f4140f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f4141g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f4142h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f4143i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f4144j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f4145k;

    /* renamed from: l  reason: collision with root package name */
    public final String f4146l;

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f4147m;

    /* renamed from: n  reason: collision with root package name */
    public final e f4148n;

    /* renamed from: o  reason: collision with root package name */
    public final e f4149o;

    /* renamed from: p  reason: collision with root package name */
    public g f4150p;

    /* renamed from: q  reason: collision with root package name */
    public c f4151q;

    /* renamed from: r  reason: collision with root package name */
    public b f4152r;

    /* renamed from: s  reason: collision with root package name */
    public b f4153s;

    /* renamed from: t  reason: collision with root package name */
    public List<b> f4154t;

    /* renamed from: u  reason: collision with root package name */
    public final List<a<?, ?>> f4155u;

    /* renamed from: v  reason: collision with root package name */
    public final n f4156v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4157w;

    public b(e eVar, e eVar2) {
        boolean z10 = true;
        this.f4137c = new v2.a(1);
        this.f4138d = new v2.a(1, PorterDuff.Mode.DST_IN);
        this.f4139e = new v2.a(1, PorterDuff.Mode.DST_OUT);
        v2.a aVar = new v2.a(1);
        this.f4140f = aVar;
        this.f4141g = new v2.a(PorterDuff.Mode.CLEAR);
        this.f4142h = new RectF();
        this.f4143i = new RectF();
        this.f4144j = new RectF();
        this.f4145k = new RectF();
        this.f4147m = new Matrix();
        this.f4155u = new ArrayList();
        this.f4157w = true;
        this.f4148n = eVar;
        this.f4149o = eVar2;
        this.f4146l = androidx.activity.e.a(new StringBuilder(), eVar2.f4166c, "#draw");
        if (eVar2.f4184u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        j jVar = eVar2.f4172i;
        jVar.getClass();
        n nVar = new n(jVar);
        this.f4156v = nVar;
        nVar.b(this);
        List<b3.f> list = eVar2.f4171h;
        if (list != null && !list.isEmpty()) {
            g gVar = new g(eVar2.f4171h);
            this.f4150p = gVar;
            for (a<b3.j, Path> aVar2 : gVar.f27265a) {
                aVar2.f27249a.add(this);
            }
            for (a next : this.f4150p.f27266b) {
                g(next);
                next.f27249a.add(this);
            }
        }
        if (!this.f4149o.f4183t.isEmpty()) {
            c cVar = new c(this.f4149o.f4183t);
            this.f4151q = cVar;
            cVar.f27250b = true;
            cVar.f27249a.add(new a(this));
            r(((Float) this.f4151q.e()).floatValue() != 1.0f ? false : z10);
            g(this.f4151q);
            return;
        }
        r(true);
    }

    public String a() {
        return this.f4149o.f4166c;
    }

    public <T> void b(T t10, p pVar) {
        this.f4156v.c(t10, pVar);
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f4142h.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        this.f4147m.set(matrix);
        if (z10) {
            List<b> list = this.f4154t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4147m.preConcat(this.f4154t.get(size).f4156v.e());
                }
            } else {
                b bVar = this.f4153s;
                if (bVar != null) {
                    this.f4147m.preConcat(bVar.f4156v.e());
                }
            }
        }
        this.f4147m.preConcat(this.f4156v.e());
    }

    public void d() {
        this.f4148n.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        if (eVar.e(this.f4149o.f4166c, i10)) {
            if (!"__container".equals(this.f4149o.f4166c)) {
                eVar2 = eVar2.a(this.f4149o.f4166c);
                if (eVar.c(this.f4149o.f4166c, i10)) {
                    list.add(eVar2.g(this));
                }
            }
            if (eVar.f(this.f4149o.f4166c, i10)) {
                p(eVar, eVar.d(this.f4149o.f4166c, i10) + i10, list, eVar2);
            }
        }
    }

    public void f(List<w2.b> list, List<w2.b> list2) {
    }

    public void g(a<?, ?> aVar) {
        if (aVar != null) {
            this.f4155u.add(aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x03aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = r0.f4146l
            boolean r4 = r0.f4157w
            if (r4 == 0) goto L_0x03e8
            c3.e r4 = r0.f4149o
            boolean r4 = r4.f4185v
            if (r4 == 0) goto L_0x0014
            goto L_0x03e8
        L_0x0014:
            r17.j()
            android.graphics.Matrix r3 = r0.f4136b
            r3.reset()
            android.graphics.Matrix r3 = r0.f4136b
            r3.set(r2)
            java.util.List<c3.b> r3 = r0.f4154t
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
        L_0x0029:
            if (r3 < 0) goto L_0x0041
            android.graphics.Matrix r5 = r0.f4136b
            java.util.List<c3.b> r6 = r0.f4154t
            java.lang.Object r6 = r6.get(r3)
            c3.b r6 = (c3.b) r6
            x2.n r6 = r6.f4156v
            android.graphics.Matrix r6 = r6.e()
            r5.preConcat(r6)
            int r3 = r3 + -1
            goto L_0x0029
        L_0x0041:
            java.lang.String r3 = "Layer#parentMatrix"
            u2.c.a(r3)
            x2.n r3 = r0.f4156v
            x2.a<java.lang.Integer, java.lang.Integer> r3 = r3.f27289j
            if (r3 != 0) goto L_0x004f
            r3 = 100
            goto L_0x0059
        L_0x004f:
            java.lang.Object r3 = r3.e()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
        L_0x0059:
            r5 = r20
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            float r3 = (float) r3
            float r5 = r5 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r3
            float r5 = r5 * r6
            int r3 = (int) r5
            boolean r5 = r17.n()
            java.lang.String r6 = "Layer#drawLayer"
            r7 = 0
            if (r5 != 0) goto L_0x0093
            boolean r5 = r17.m()
            if (r5 != 0) goto L_0x0093
            android.graphics.Matrix r2 = r0.f4136b
            x2.n r4 = r0.f4156v
            android.graphics.Matrix r4 = r4.e()
            r2.preConcat(r4)
            android.graphics.Matrix r2 = r0.f4136b
            r0.l(r1, r2, r3)
            u2.c.a(r6)
            java.lang.String r1 = r0.f4146l
            u2.c.a(r1)
            r0.o(r7)
            return
        L_0x0093:
            android.graphics.RectF r5 = r0.f4142h
            android.graphics.Matrix r8 = r0.f4136b
            r9 = 0
            r0.c(r5, r8, r9)
            android.graphics.RectF r5 = r0.f4142h
            boolean r8 = r17.n()
            r10 = 3
            if (r8 != 0) goto L_0x00a5
            goto L_0x00c3
        L_0x00a5:
            c3.e r8 = r0.f4149o
            int r8 = r8.f4184u
            if (r8 != r10) goto L_0x00ac
            goto L_0x00c3
        L_0x00ac:
            android.graphics.RectF r8 = r0.f4144j
            r8.set(r7, r7, r7, r7)
            c3.b r8 = r0.f4152r
            android.graphics.RectF r11 = r0.f4144j
            r8.c(r11, r2, r4)
            android.graphics.RectF r8 = r0.f4144j
            boolean r8 = r5.intersect(r8)
            if (r8 != 0) goto L_0x00c3
            r5.set(r7, r7, r7, r7)
        L_0x00c3:
            android.graphics.Matrix r5 = r0.f4136b
            x2.n r8 = r0.f4156v
            android.graphics.Matrix r8 = r8.e()
            r5.preConcat(r8)
            android.graphics.RectF r5 = r0.f4142h
            android.graphics.Matrix r8 = r0.f4136b
            android.graphics.RectF r11 = r0.f4143i
            r11.set(r7, r7, r7, r7)
            boolean r11 = r17.m()
            r12 = 2
            if (r11 != 0) goto L_0x00e0
            goto L_0x017d
        L_0x00e0:
            x2.g r11 = r0.f4150p
            java.util.List<b3.f> r11 = r11.f27267c
            int r11 = r11.size()
            r13 = 0
        L_0x00e9:
            if (r13 >= r11) goto L_0x016f
            x2.g r14 = r0.f4150p
            java.util.List<b3.f> r14 = r14.f27267c
            java.lang.Object r14 = r14.get(r13)
            b3.f r14 = (b3.f) r14
            x2.g r15 = r0.f4150p
            java.util.List<x2.a<b3.j, android.graphics.Path>> r15 = r15.f27265a
            java.lang.Object r15 = r15.get(r13)
            x2.a r15 = (x2.a) r15
            java.lang.Object r15 = r15.e()
            android.graphics.Path r15 = (android.graphics.Path) r15
            android.graphics.Path r7 = r0.f4135a
            r7.set(r15)
            android.graphics.Path r7 = r0.f4135a
            r7.transform(r8)
            int r7 = r14.f3488a
            int r7 = t.g.f(r7)
            if (r7 == 0) goto L_0x011e
            if (r7 == r4) goto L_0x017c
            if (r7 == r12) goto L_0x011e
            if (r7 == r10) goto L_0x017c
            goto L_0x0123
        L_0x011e:
            boolean r7 = r14.f3491d
            if (r7 == 0) goto L_0x0123
            goto L_0x017c
        L_0x0123:
            android.graphics.Path r7 = r0.f4135a
            android.graphics.RectF r14 = r0.f4145k
            r7.computeBounds(r14, r9)
            if (r13 != 0) goto L_0x0134
            android.graphics.RectF r7 = r0.f4143i
            android.graphics.RectF r14 = r0.f4145k
            r7.set(r14)
            goto L_0x0167
        L_0x0134:
            android.graphics.RectF r7 = r0.f4143i
            float r14 = r7.left
            android.graphics.RectF r15 = r0.f4145k
            float r15 = r15.left
            float r14 = java.lang.Math.min(r14, r15)
            android.graphics.RectF r15 = r0.f4143i
            float r15 = r15.top
            android.graphics.RectF r9 = r0.f4145k
            float r9 = r9.top
            float r9 = java.lang.Math.min(r15, r9)
            android.graphics.RectF r15 = r0.f4143i
            float r15 = r15.right
            android.graphics.RectF r10 = r0.f4145k
            float r10 = r10.right
            float r10 = java.lang.Math.max(r15, r10)
            android.graphics.RectF r15 = r0.f4143i
            float r15 = r15.bottom
            android.graphics.RectF r12 = r0.f4145k
            float r12 = r12.bottom
            float r12 = java.lang.Math.max(r15, r12)
            r7.set(r14, r9, r10, r12)
        L_0x0167:
            int r13 = r13 + 1
            r7 = 0
            r9 = 0
            r10 = 3
            r12 = 2
            goto L_0x00e9
        L_0x016f:
            android.graphics.RectF r7 = r0.f4143i
            boolean r7 = r5.intersect(r7)
            if (r7 != 0) goto L_0x017c
            r7 = 0
            r5.set(r7, r7, r7, r7)
            goto L_0x017d
        L_0x017c:
            r7 = 0
        L_0x017d:
            android.graphics.RectF r5 = r0.f4142h
            int r8 = r18.getWidth()
            float r8 = (float) r8
            int r9 = r18.getHeight()
            float r9 = (float) r9
            boolean r5 = r5.intersect(r7, r7, r8, r9)
            if (r5 != 0) goto L_0x0194
            android.graphics.RectF r5 = r0.f4142h
            r5.set(r7, r7, r7, r7)
        L_0x0194:
            java.lang.String r5 = "Layer#computeBounds"
            u2.c.a(r5)
            android.graphics.RectF r5 = r0.f4142h
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x03de
            android.graphics.Paint r5 = r0.f4137c
            r7 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r7)
            android.graphics.RectF r5 = r0.f4142h
            android.graphics.Paint r8 = r0.f4137c
            r9 = 31
            g3.g.f(r1, r5, r8, r9)
            java.lang.String r5 = "Layer#saveLayer"
            u2.c.a(r5)
            r17.k(r18)
            android.graphics.Matrix r8 = r0.f4136b
            r0.l(r1, r8, r3)
            u2.c.a(r6)
            boolean r6 = r17.m()
            r8 = 19
            java.lang.String r10 = "Layer#restoreLayer"
            if (r6 == 0) goto L_0x03b5
            android.graphics.Matrix r6 = r0.f4136b
            android.graphics.RectF r11 = r0.f4142h
            android.graphics.Paint r12 = r0.f4138d
            g3.g.f(r1, r11, r12, r8)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r11 >= r12) goto L_0x01dd
            r17.k(r18)
        L_0x01dd:
            u2.c.a(r5)
            r11 = 0
        L_0x01e1:
            x2.g r12 = r0.f4150p
            java.util.List<b3.f> r12 = r12.f27267c
            int r12 = r12.size()
            if (r11 >= r12) goto L_0x03af
            x2.g r12 = r0.f4150p
            java.util.List<b3.f> r12 = r12.f27267c
            java.lang.Object r12 = r12.get(r11)
            b3.f r12 = (b3.f) r12
            x2.g r13 = r0.f4150p
            java.util.List<x2.a<b3.j, android.graphics.Path>> r13 = r13.f27265a
            java.lang.Object r13 = r13.get(r11)
            x2.a r13 = (x2.a) r13
            x2.g r14 = r0.f4150p
            java.util.List<x2.a<java.lang.Integer, java.lang.Integer>> r14 = r14.f27266b
            java.lang.Object r14 = r14.get(r11)
            x2.a r14 = (x2.a) r14
            int r15 = r12.f3488a
            int r15 = t.g.f(r15)
            r16 = 1076048691(0x40233333, float:2.55)
            if (r15 == 0) goto L_0x0340
            if (r15 == r4) goto L_0x02d1
            r4 = 2
            if (r15 == r4) goto L_0x0259
            r4 = 3
            if (r15 == r4) goto L_0x021e
            goto L_0x03aa
        L_0x021e:
            x2.g r12 = r0.f4150p
            java.util.List<x2.a<b3.j, android.graphics.Path>> r12 = r12.f27265a
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x022a
        L_0x0228:
            r12 = 0
            goto L_0x0249
        L_0x022a:
            r12 = 0
        L_0x022b:
            x2.g r13 = r0.f4150p
            java.util.List<b3.f> r13 = r13.f27267c
            int r13 = r13.size()
            if (r12 >= r13) goto L_0x0248
            x2.g r13 = r0.f4150p
            java.util.List<b3.f> r13 = r13.f27267c
            java.lang.Object r13 = r13.get(r12)
            b3.f r13 = (b3.f) r13
            int r13 = r13.f3488a
            r14 = 4
            if (r13 == r14) goto L_0x0245
            goto L_0x0228
        L_0x0245:
            int r12 = r12 + 1
            goto L_0x022b
        L_0x0248:
            r12 = 1
        L_0x0249:
            if (r12 == 0) goto L_0x03aa
            android.graphics.Paint r12 = r0.f4137c
            r12.setAlpha(r7)
            android.graphics.RectF r12 = r0.f4142h
            android.graphics.Paint r13 = r0.f4137c
            r1.drawRect(r12, r13)
            goto L_0x03aa
        L_0x0259:
            r4 = 3
            boolean r12 = r12.f3491d
            if (r12 == 0) goto L_0x029b
            android.graphics.RectF r12 = r0.f4142h
            android.graphics.Paint r15 = r0.f4138d
            g3.g.f(r1, r12, r15, r9)
            android.graphics.RectF r12 = r0.f4142h
            android.graphics.Paint r15 = r0.f4137c
            r1.drawRect(r12, r15)
            android.graphics.Paint r12 = r0.f4139e
            java.lang.Object r14 = r14.e()
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            float r14 = (float) r14
            float r14 = r14 * r16
            int r14 = (int) r14
            r12.setAlpha(r14)
            java.lang.Object r12 = r13.e()
            android.graphics.Path r12 = (android.graphics.Path) r12
            android.graphics.Path r13 = r0.f4135a
            r13.set(r12)
            android.graphics.Path r12 = r0.f4135a
            r12.transform(r6)
            android.graphics.Path r12 = r0.f4135a
            android.graphics.Paint r13 = r0.f4139e
            r1.drawPath(r12, r13)
            r18.restore()
            goto L_0x03aa
        L_0x029b:
            android.graphics.RectF r12 = r0.f4142h
            android.graphics.Paint r15 = r0.f4138d
            g3.g.f(r1, r12, r15, r9)
            java.lang.Object r12 = r13.e()
            android.graphics.Path r12 = (android.graphics.Path) r12
            android.graphics.Path r13 = r0.f4135a
            r13.set(r12)
            android.graphics.Path r12 = r0.f4135a
            r12.transform(r6)
            android.graphics.Paint r12 = r0.f4137c
            java.lang.Object r13 = r14.e()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            float r13 = (float) r13
            float r13 = r13 * r16
            int r13 = (int) r13
            r12.setAlpha(r13)
            android.graphics.Path r12 = r0.f4135a
            android.graphics.Paint r13 = r0.f4137c
            r1.drawPath(r12, r13)
            r18.restore()
            goto L_0x03aa
        L_0x02d1:
            r4 = 3
            if (r11 != 0) goto L_0x02e7
            android.graphics.Paint r15 = r0.f4137c
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15.setColor(r4)
            android.graphics.Paint r4 = r0.f4137c
            r4.setAlpha(r7)
            android.graphics.RectF r4 = r0.f4142h
            android.graphics.Paint r15 = r0.f4137c
            r1.drawRect(r4, r15)
        L_0x02e7:
            boolean r4 = r12.f3491d
            if (r4 == 0) goto L_0x0328
            android.graphics.RectF r4 = r0.f4142h
            android.graphics.Paint r12 = r0.f4139e
            g3.g.f(r1, r4, r12, r9)
            android.graphics.RectF r4 = r0.f4142h
            android.graphics.Paint r12 = r0.f4137c
            r1.drawRect(r4, r12)
            android.graphics.Paint r4 = r0.f4139e
            java.lang.Object r12 = r14.e()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            float r12 = r12 * r16
            int r12 = (int) r12
            r4.setAlpha(r12)
            java.lang.Object r4 = r13.e()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r12 = r0.f4135a
            r12.set(r4)
            android.graphics.Path r4 = r0.f4135a
            r4.transform(r6)
            android.graphics.Path r4 = r0.f4135a
            android.graphics.Paint r12 = r0.f4139e
            r1.drawPath(r4, r12)
            r18.restore()
            goto L_0x03aa
        L_0x0328:
            java.lang.Object r4 = r13.e()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r12 = r0.f4135a
            r12.set(r4)
            android.graphics.Path r4 = r0.f4135a
            r4.transform(r6)
            android.graphics.Path r4 = r0.f4135a
            android.graphics.Paint r12 = r0.f4139e
            r1.drawPath(r4, r12)
            goto L_0x03aa
        L_0x0340:
            boolean r4 = r12.f3491d
            if (r4 == 0) goto L_0x0380
            android.graphics.RectF r4 = r0.f4142h
            android.graphics.Paint r12 = r0.f4137c
            g3.g.f(r1, r4, r12, r9)
            android.graphics.RectF r4 = r0.f4142h
            android.graphics.Paint r12 = r0.f4137c
            r1.drawRect(r4, r12)
            java.lang.Object r4 = r13.e()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r12 = r0.f4135a
            r12.set(r4)
            android.graphics.Path r4 = r0.f4135a
            r4.transform(r6)
            android.graphics.Paint r4 = r0.f4137c
            java.lang.Object r12 = r14.e()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            float r12 = r12 * r16
            int r12 = (int) r12
            r4.setAlpha(r12)
            android.graphics.Path r4 = r0.f4135a
            android.graphics.Paint r12 = r0.f4139e
            r1.drawPath(r4, r12)
            r18.restore()
            goto L_0x03aa
        L_0x0380:
            java.lang.Object r4 = r13.e()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r12 = r0.f4135a
            r12.set(r4)
            android.graphics.Path r4 = r0.f4135a
            r4.transform(r6)
            android.graphics.Paint r4 = r0.f4137c
            java.lang.Object r12 = r14.e()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            float r12 = r12 * r16
            int r12 = (int) r12
            r4.setAlpha(r12)
            android.graphics.Path r4 = r0.f4135a
            android.graphics.Paint r12 = r0.f4137c
            r1.drawPath(r4, r12)
        L_0x03aa:
            int r11 = r11 + 1
            r4 = 1
            goto L_0x01e1
        L_0x03af:
            r18.restore()
            u2.c.a(r10)
        L_0x03b5:
            boolean r4 = r17.n()
            if (r4 == 0) goto L_0x03d8
            android.graphics.RectF r4 = r0.f4142h
            android.graphics.Paint r6 = r0.f4140f
            g3.g.f(r1, r4, r6, r8)
            u2.c.a(r5)
            r17.k(r18)
            c3.b r4 = r0.f4152r
            r4.h(r1, r2, r3)
            r18.restore()
            u2.c.a(r10)
            java.lang.String r2 = "Layer#drawMatte"
            u2.c.a(r2)
        L_0x03d8:
            r18.restore()
            u2.c.a(r10)
        L_0x03de:
            java.lang.String r1 = r0.f4146l
            u2.c.a(r1)
            r1 = 0
            r0.o(r1)
            return
        L_0x03e8:
            u2.c.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.b.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void j() {
        if (this.f4154t == null) {
            if (this.f4153s == null) {
                this.f4154t = Collections.emptyList();
                return;
            }
            this.f4154t = new ArrayList();
            for (b bVar = this.f4153s; bVar != null; bVar = bVar.f4153s) {
                this.f4154t.add(bVar);
            }
        }
    }

    public final void k(Canvas canvas) {
        RectF rectF = this.f4142h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f4141g);
        u2.c.a("Layer#clearLayer");
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i10);

    public boolean m() {
        g gVar = this.f4150p;
        return gVar != null && !gVar.f27265a.isEmpty();
    }

    public boolean n() {
        return this.f4152r != null;
    }

    public final void o(float f10) {
        u2.n nVar = this.f4148n.f25935b.f25919a;
        String str = this.f4149o.f4166c;
        if (nVar.f26020a) {
            g3.e eVar = nVar.f26022c.get(str);
            if (eVar == null) {
                eVar = new g3.e();
                nVar.f26022c.put(str, eVar);
            }
            float f11 = eVar.f18433a + f10;
            eVar.f18433a = f11;
            int i10 = eVar.f18434b + 1;
            eVar.f18434b = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.f18433a = f11 / 2.0f;
                eVar.f18434b = i10 / 2;
            }
            if (str.equals("__container")) {
                for (n.a a10 : nVar.f26021b) {
                    a10.a(f10);
                }
            }
        }
    }

    public void p(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
    }

    public void q(float f10) {
        x2.n nVar = this.f4156v;
        a<Integer, Integer> aVar = nVar.f27289j;
        if (aVar != null) {
            aVar.h(f10);
        }
        a<?, Float> aVar2 = nVar.f27292m;
        if (aVar2 != null) {
            aVar2.h(f10);
        }
        a<?, Float> aVar3 = nVar.f27293n;
        if (aVar3 != null) {
            aVar3.h(f10);
        }
        a<PointF, PointF> aVar4 = nVar.f27285f;
        if (aVar4 != null) {
            aVar4.h(f10);
        }
        a<?, PointF> aVar5 = nVar.f27286g;
        if (aVar5 != null) {
            aVar5.h(f10);
        }
        a<h3.c, h3.c> aVar6 = nVar.f27287h;
        if (aVar6 != null) {
            aVar6.h(f10);
        }
        a<Float, Float> aVar7 = nVar.f27288i;
        if (aVar7 != null) {
            aVar7.h(f10);
        }
        c cVar = nVar.f27290k;
        if (cVar != null) {
            cVar.h(f10);
        }
        c cVar2 = nVar.f27291l;
        if (cVar2 != null) {
            cVar2.h(f10);
        }
        if (this.f4150p != null) {
            for (int i10 = 0; i10 < this.f4150p.f27265a.size(); i10++) {
                this.f4150p.f27265a.get(i10).h(f10);
            }
        }
        float f11 = this.f4149o.f4176m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        c cVar3 = this.f4151q;
        if (cVar3 != null) {
            cVar3.h(f10 / f11);
        }
        b bVar = this.f4152r;
        if (bVar != null) {
            bVar.q(bVar.f4149o.f4176m * f10);
        }
        for (int i11 = 0; i11 < this.f4155u.size(); i11++) {
            this.f4155u.get(i11).h(f10);
        }
    }

    public final void r(boolean z10) {
        if (z10 != this.f4157w) {
            this.f4157w = z10;
            this.f4148n.invalidateSelf();
        }
    }
}
