package w;

import v.d;
import v.f;

/* compiled from: WidgetRun */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f26849a;

    /* renamed from: b  reason: collision with root package name */
    public f f26850b;

    /* renamed from: c  reason: collision with root package name */
    public m f26851c;

    /* renamed from: d  reason: collision with root package name */
    public int f26852d;

    /* renamed from: e  reason: collision with root package name */
    public g f26853e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f26854f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f26855g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f26856h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f26857i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f26858j = 1;

    public p(f fVar) {
        this.f26850b = fVar;
    }

    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f26823l.add(fVar2);
        fVar.f26817f = i10;
        fVar2.f26822k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f26823l.add(fVar2);
        fVar.f26823l.add(this.f26853e);
        fVar.f26819h = i10;
        fVar.f26820i = gVar;
        fVar2.f26822k.add(fVar);
        gVar.f26822k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            f fVar = this.f26850b;
            int i13 = fVar.f26285v;
            i12 = Math.max(fVar.f26284u, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            f fVar2 = this.f26850b;
            int i14 = fVar2.f26288y;
            int max = Math.max(fVar2.f26287x, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public final f h(d dVar) {
        d dVar2 = dVar.f26234f;
        if (dVar2 == null) {
            return null;
        }
        f fVar = dVar2.f26232d;
        int ordinal = dVar2.f26233e.ordinal();
        if (ordinal == 1) {
            return fVar.f26253d.f26856h;
        }
        if (ordinal == 2) {
            return fVar.f26255e.f26856h;
        }
        if (ordinal == 3) {
            return fVar.f26253d.f26857i;
        }
        if (ordinal == 4) {
            return fVar.f26255e.f26857i;
        }
        if (ordinal != 5) {
            return null;
        }
        return fVar.f26255e.f26841k;
    }

    public final f i(d dVar, int i10) {
        d dVar2 = dVar.f26234f;
        if (dVar2 == null) {
            return null;
        }
        f fVar = dVar2.f26232d;
        p pVar = i10 == 0 ? fVar.f26253d : fVar.f26255e;
        int ordinal = dVar2.f26233e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return pVar.f26856h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return pVar.f26857i;
        }
        return null;
    }

    public long j() {
        g gVar = this.f26853e;
        if (gVar.f26821j) {
            return (long) gVar.f26818g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f26849a == 3) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(v.d r12, v.d r13, int r14) {
        /*
            r11 = this;
            w.f r0 = r11.h(r12)
            w.f r1 = r11.h(r13)
            boolean r2 = r0.f26821j
            if (r2 == 0) goto L_0x00f7
            boolean r2 = r1.f26821j
            if (r2 != 0) goto L_0x0012
            goto L_0x00f7
        L_0x0012:
            int r2 = r0.f26818g
            int r12 = r12.d()
            int r12 = r12 + r2
            int r2 = r1.f26818g
            int r13 = r13.d()
            int r2 = r2 - r13
            int r13 = r2 - r12
            w.g r3 = r11.f26853e
            boolean r4 = r3.f26821j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b4
            int r4 = r11.f26852d
            r6 = 3
            if (r4 != r6) goto L_0x00b4
            int r4 = r11.f26849a
            if (r4 == 0) goto L_0x00ad
            r7 = 1
            if (r4 == r7) goto L_0x009d
            r8 = 2
            if (r4 == r8) goto L_0x0074
            if (r4 == r6) goto L_0x003d
            goto L_0x00b4
        L_0x003d:
            v.f r4 = r11.f26850b
            w.l r8 = r4.f26253d
            int r9 = r8.f26852d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f26849a
            if (r9 != r6) goto L_0x0054
            w.n r9 = r4.f26255e
            int r10 = r9.f26852d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f26849a
            if (r9 != r6) goto L_0x0054
            goto L_0x00b4
        L_0x0054:
            if (r14 != 0) goto L_0x0058
            w.n r8 = r4.f26255e
        L_0x0058:
            w.g r6 = r8.f26853e
            boolean r8 = r6.f26821j
            if (r8 == 0) goto L_0x00b4
            float r4 = r4.Y
            if (r14 != r7) goto L_0x0069
            int r6 = r6.f26818g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x0070
        L_0x0069:
            int r6 = r6.f26818g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x0070:
            r3.c(r4)
            goto L_0x00b4
        L_0x0074:
            v.f r4 = r11.f26850b
            v.f r6 = r4.V
            if (r6 == 0) goto L_0x00b4
            if (r14 != 0) goto L_0x007f
            w.l r6 = r6.f26253d
            goto L_0x0081
        L_0x007f:
            w.n r6 = r6.f26255e
        L_0x0081:
            w.g r6 = r6.f26853e
            boolean r7 = r6.f26821j
            if (r7 == 0) goto L_0x00b4
            if (r14 != 0) goto L_0x008c
            float r4 = r4.f26286w
            goto L_0x008e
        L_0x008c:
            float r4 = r4.f26289z
        L_0x008e:
            int r6 = r6.f26818g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.c(r4)
            goto L_0x00b4
        L_0x009d:
            int r3 = r3.f26833m
            int r3 = r11.g(r3, r14)
            w.g r4 = r11.f26853e
            int r3 = java.lang.Math.min(r3, r13)
            r4.c(r3)
            goto L_0x00b4
        L_0x00ad:
            int r4 = r11.g(r13, r14)
            r3.c(r4)
        L_0x00b4:
            w.g r3 = r11.f26853e
            boolean r4 = r3.f26821j
            if (r4 != 0) goto L_0x00bb
            return
        L_0x00bb:
            int r3 = r3.f26818g
            if (r3 != r13) goto L_0x00ca
            w.f r13 = r11.f26856h
            r13.c(r12)
            w.f r12 = r11.f26857i
            r12.c(r2)
            return
        L_0x00ca:
            v.f r13 = r11.f26850b
            if (r14 != 0) goto L_0x00d1
            float r13 = r13.f26258f0
            goto L_0x00d3
        L_0x00d1:
            float r13 = r13.f26260g0
        L_0x00d3:
            if (r0 != r1) goto L_0x00db
            int r12 = r0.f26818g
            int r2 = r1.f26818g
            r13 = 1056964608(0x3f000000, float:0.5)
        L_0x00db:
            int r2 = r2 - r12
            int r2 = r2 - r3
            w.f r14 = r11.f26856h
            float r12 = (float) r12
            float r12 = r12 + r5
            float r0 = (float) r2
            float r0 = r0 * r13
            float r0 = r0 + r12
            int r12 = (int) r0
            r14.c(r12)
            w.f r12 = r11.f26857i
            w.f r13 = r11.f26856h
            int r13 = r13.f26818g
            w.g r14 = r11.f26853e
            int r14 = r14.f26818g
            int r13 = r13 + r14
            r12.c(r13)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.p.l(v.d, v.d, int):void");
    }
}
