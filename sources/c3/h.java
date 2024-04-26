package c3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import o1.p;
import u2.e;
import u2.j;
import x2.a;
import x2.o;

/* compiled from: SolidLayer */
public class h extends b {
    public final Path A;
    public final e B;
    public a<ColorFilter, ColorFilter> C;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f4191x = new RectF();

    /* renamed from: y  reason: collision with root package name */
    public final Paint f4192y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f4193z;

    public h(e eVar, e eVar2) {
        super(eVar, eVar2);
        v2.a aVar = new v2.a();
        this.f4192y = aVar;
        this.f4193z = new float[8];
        this.A = new Path();
        this.B = eVar2;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar2.f4175l);
    }

    public <T> void b(T t10, p pVar) {
        this.f4156v.c(t10, pVar);
        if (t10 != j.C) {
            return;
        }
        if (pVar == null) {
            this.C = null;
        } else {
            this.C = new o(pVar, null);
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        RectF rectF2 = this.f4191x;
        e eVar = this.B;
        rectF2.set(0.0f, 0.0f, (float) eVar.f4173j, (float) eVar.f4174k);
        this.f4147m.mapRect(this.f4191x);
        rectF.set(this.f4191x);
    }

    public void l(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        int alpha = Color.alpha(this.B.f4175l);
        if (alpha != 0) {
            a<Integer, Integer> aVar = this.f4156v.f27289j;
            if (aVar == null) {
                i11 = 100;
            } else {
                i11 = aVar.e().intValue();
            }
            int i12 = (int) ((((((float) alpha) / 255.0f) * ((float) i11)) / 100.0f) * (((float) i10) / 255.0f) * 255.0f);
            this.f4192y.setAlpha(i12);
            a<ColorFilter, ColorFilter> aVar2 = this.C;
            if (aVar2 != null) {
                this.f4192y.setColorFilter(aVar2.e());
            }
            if (i12 > 0) {
                float[] fArr = this.f4193z;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                e eVar = this.B;
                int i13 = eVar.f4173j;
                fArr[2] = (float) i13;
                fArr[3] = 0.0f;
                fArr[4] = (float) i13;
                int i14 = eVar.f4174k;
                fArr[5] = (float) i14;
                fArr[6] = 0.0f;
                fArr[7] = (float) i14;
                matrix.mapPoints(fArr);
                this.A.reset();
                Path path = this.A;
                float[] fArr2 = this.f4193z;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.A;
                float[] fArr3 = this.f4193z;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.A;
                float[] fArr4 = this.f4193z;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.A;
                float[] fArr5 = this.f4193z;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.A;
                float[] fArr6 = this.f4193z;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.A.close();
                canvas.drawPath(this.A, this.f4192y);
            }
        }
    }
}
