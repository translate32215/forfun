package w2;

import a3.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import b3.i;
import c3.b;
import g3.f;
import java.util.List;
import o1.p;
import u2.e;
import x2.a;
import x2.n;

/* compiled from: RepeaterContent */
public class o implements d, l, i, a.b, j {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f26972a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f26973b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final e f26974c;

    /* renamed from: d  reason: collision with root package name */
    public final b f26975d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26976e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f26977f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Float, Float> f26978g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Float, Float> f26979h;

    /* renamed from: i  reason: collision with root package name */
    public final n f26980i;

    /* renamed from: j  reason: collision with root package name */
    public c f26981j;

    public o(e eVar, b bVar, i iVar) {
        String str;
        boolean z10;
        this.f26974c = eVar;
        this.f26975d = bVar;
        int i10 = iVar.f3511a;
        switch (i10) {
            case 0:
                str = iVar.f3512b;
                break;
            default:
                str = iVar.f3512b;
                break;
        }
        this.f26976e = str;
        switch (i10) {
            case 0:
                z10 = iVar.f3516f;
                break;
            default:
                z10 = iVar.f3516f;
                break;
        }
        this.f26977f = z10;
        a<Float, Float> a10 = iVar.f3515e.a();
        this.f26978g = a10;
        bVar.g(a10);
        a10.f27249a.add(this);
        a<Float, Float> a11 = ((a3.b) iVar.f3513c).a();
        this.f26979h = a11;
        bVar.g(a11);
        a11.f27249a.add(this);
        j jVar = (j) iVar.f3514d;
        jVar.getClass();
        n nVar = new n(jVar);
        this.f26980i = nVar;
        nVar.a(bVar);
        nVar.b(this);
    }

    public String a() {
        return this.f26976e;
    }

    public <T> void b(T t10, p pVar) {
        if (!this.f26980i.c(t10, pVar)) {
            if (t10 == u2.j.f26001q) {
                this.f26978g.i(pVar);
            } else if (t10 == u2.j.f26002r) {
                this.f26979h.i(pVar);
            }
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f26981j.c(rectF, matrix, z10);
    }

    public void d() {
        this.f26974c.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        f.f(eVar, i10, list, eVar2, this);
    }

    public void f(List<b> list, List<b> list2) {
        this.f26981j.f(list, list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.util.ListIterator<w2.b> r9) {
        /*
            r8 = this;
            w2.c r0 = r8.f26981j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            w2.c r9 = new w2.c
            u2.e r2 = r8.f26974c
            c3.b r3 = r8.f26975d
            boolean r5 = r8.f26977f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f26981j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.o.g(java.util.ListIterator):void");
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f26978g.e().floatValue();
        float floatValue2 = this.f26979h.e().floatValue();
        float floatValue3 = this.f26980i.f27292m.e().floatValue() / 100.0f;
        float floatValue4 = this.f26980i.f27293n.e().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f26972a.set(matrix);
            float f10 = (float) i11;
            this.f26972a.preConcat(this.f26980i.f(f10 + floatValue2));
            this.f26981j.h(canvas, this.f26972a, (int) (f.e(floatValue3, floatValue4, f10 / floatValue) * ((float) i10)));
        }
    }

    public Path i() {
        Path i10 = this.f26981j.i();
        this.f26973b.reset();
        float floatValue = this.f26978g.e().floatValue();
        float floatValue2 = this.f26979h.e().floatValue();
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f26972a.set(this.f26980i.f(((float) i11) + floatValue2));
            this.f26973b.addPath(i10, this.f26972a);
        }
        return this.f26973b;
    }
}
