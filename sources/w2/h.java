package w2;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import b3.c;
import c3.b;
import o1.p;
import s.f;
import t.g;
import u2.e;
import u2.j;
import x2.a;
import x2.o;

/* compiled from: GradientStrokeContent */
public class h extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f26932o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f26933p;

    /* renamed from: q  reason: collision with root package name */
    public final f<LinearGradient> f26934q = new f<>(10);

    /* renamed from: r  reason: collision with root package name */
    public final f<RadialGradient> f26935r = new f<>(10);

    /* renamed from: s  reason: collision with root package name */
    public final RectF f26936s = new RectF();

    /* renamed from: t  reason: collision with root package name */
    public final int f26937t;

    /* renamed from: u  reason: collision with root package name */
    public final int f26938u;

    /* renamed from: v  reason: collision with root package name */
    public final a<c, c> f26939v;

    /* renamed from: w  reason: collision with root package name */
    public final a<PointF, PointF> f26940w;

    /* renamed from: x  reason: collision with root package name */
    public final a<PointF, PointF> f26941x;

    /* renamed from: y  reason: collision with root package name */
    public o f26942y;

    public h(e eVar, b bVar, b3.e eVar2) {
        super(eVar, bVar, g.i(eVar2.f3482h), g.j(eVar2.f3483i), eVar2.f3484j, eVar2.f3478d, eVar2.f3481g, eVar2.f3485k, eVar2.f3486l);
        this.f26932o = eVar2.f3475a;
        this.f26937t = eVar2.f3476b;
        this.f26933p = eVar2.f3487m;
        this.f26938u = (int) (eVar.f25935b.b() / 32.0f);
        a<c, c> a10 = eVar2.f3477c.a();
        this.f26939v = a10;
        a10.f27249a.add(this);
        bVar.g(a10);
        a<PointF, PointF> a11 = eVar2.f3479e.a();
        this.f26940w = a11;
        a11.f27249a.add(this);
        bVar.g(a11);
        a<PointF, PointF> a12 = eVar2.f3480f.a();
        this.f26941x = a12;
        a12.f27249a.add(this);
        bVar.g(a12);
    }

    public String a() {
        return this.f26932o;
    }

    public <T> void b(T t10, p pVar) {
        super.b(t10, pVar);
        if (t10 == j.D) {
            o oVar = this.f26942y;
            if (oVar != null) {
                this.f26874f.f4155u.remove(oVar);
            }
            if (pVar == null) {
                this.f26942y = null;
                return;
            }
            o oVar2 = new o(pVar, null);
            this.f26942y = oVar2;
            oVar2.f27249a.add(this);
            this.f26874f.g(this.f26942y);
        }
    }

    public final int[] g(int[] iArr) {
        o oVar = this.f26942y;
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

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f26933p
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f26936s
            r3 = 0
            r0.c(r2, r1, r3)
            int r2 = r0.f26937t
            r3 = 1
            if (r2 != r3) goto L_0x005b
            int r2 = r16.j()
            s.f<android.graphics.LinearGradient> r3 = r0.f26934q
            long r4 = (long) r2
            java.lang.Object r2 = r3.e(r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x0025
            goto L_0x00a9
        L_0x0025:
            x2.a<android.graphics.PointF, android.graphics.PointF> r2 = r0.f26940w
            java.lang.Object r2 = r2.e()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            x2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f26941x
            java.lang.Object r3 = r3.e()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            x2.a<b3.c, b3.c> r6 = r0.f26939v
            java.lang.Object r6 = r6.e()
            b3.c r6 = (b3.c) r6
            int[] r7 = r6.f3466b
            int[] r13 = r0.g(r7)
            float[] r14 = r6.f3465a
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            s.f<android.graphics.LinearGradient> r3 = r0.f26934q
            r3.h(r4, r2)
            goto L_0x00a9
        L_0x005b:
            int r2 = r16.j()
            s.f<android.graphics.RadialGradient> r3 = r0.f26935r
            long r4 = (long) r2
            java.lang.Object r2 = r3.e(r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x006b
            goto L_0x00a9
        L_0x006b:
            x2.a<android.graphics.PointF, android.graphics.PointF> r2 = r0.f26940w
            java.lang.Object r2 = r2.e()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            x2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f26941x
            java.lang.Object r3 = r3.e()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            x2.a<b3.c, b3.c> r6 = r0.f26939v
            java.lang.Object r6 = r6.e()
            b3.c r6 = (b3.c) r6
            int[] r7 = r6.f3466b
            int[] r12 = r0.g(r7)
            float[] r13 = r6.f3465a
            float r9 = r2.x
            float r10 = r2.y
            float r2 = r3.x
            float r3 = r3.y
            float r2 = r2 - r9
            double r6 = (double) r2
            float r3 = r3 - r10
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r6, r2)
            float r11 = (float) r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            s.f<android.graphics.RadialGradient> r3 = r0.f26935r
            r3.h(r4, r2)
        L_0x00a9:
            r2.setLocalMatrix(r1)
            android.graphics.Paint r3 = r0.f26877i
            r3.setShader(r2)
            super.h(r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.h.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final int j() {
        int round = Math.round(this.f26940w.f27252d * ((float) this.f26938u));
        int round2 = Math.round(this.f26941x.f27252d * ((float) this.f26938u));
        int round3 = Math.round(this.f26939v.f27252d * ((float) this.f26938u));
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
