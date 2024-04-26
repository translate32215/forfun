package s9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.BitSet;
import s9.f;
import s9.l;
import x3.d;

/* compiled from: ShapeAppearancePathProvider */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final l[] f25145a = new l[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f25146b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f25147c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f25148d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f25149e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f25150f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final l f25151g = new l();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f25152h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f25153i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f25154j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f25155k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f25156l = true;

    /* compiled from: ShapeAppearancePathProvider */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f25157a = new j();
    }

    /* compiled from: ShapeAppearancePathProvider */
    public interface b {
    }

    public j() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f25145a[i10] = new l();
            this.f25146b[i10] = new Matrix();
            this.f25147c[i10] = new Matrix();
        }
    }

    public void a(i iVar, float f10, RectF rectF, Path path) {
        b(iVar, f10, rectF, (b) null, path);
    }

    public void b(i iVar, float f10, RectF rectF, b bVar, Path path) {
        int i10;
        float f11;
        e eVar;
        c cVar;
        d dVar;
        i iVar2 = iVar;
        float f12 = f10;
        RectF rectF2 = rectF;
        Path path2 = path;
        path.rewind();
        this.f25149e.rewind();
        this.f25150f.rewind();
        this.f25150f.addRect(rectF2, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                cVar = iVar2.f25127g;
            } else if (i11 == 2) {
                cVar = iVar2.f25128h;
            } else if (i11 != 3) {
                cVar = iVar2.f25126f;
            } else {
                cVar = iVar2.f25125e;
            }
            if (i11 == 1) {
                dVar = iVar2.f25123c;
            } else if (i11 == 2) {
                dVar = iVar2.f25124d;
            } else if (i11 != 3) {
                dVar = iVar2.f25122b;
            } else {
                dVar = iVar2.f25121a;
            }
            l lVar = this.f25145a[i11];
            dVar.getClass();
            dVar.a(lVar, 90.0f, f12, cVar.a(rectF2));
            int i12 = i11 + 1;
            float f13 = (float) (i12 * 90);
            this.f25146b[i11].reset();
            PointF pointF = this.f25148d;
            if (i11 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            Matrix matrix = this.f25146b[i11];
            PointF pointF2 = this.f25148d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f25146b[i11].preRotate(f13);
            float[] fArr = this.f25152h;
            l[] lVarArr = this.f25145a;
            fArr[0] = lVarArr[i11].f25162c;
            fArr[1] = lVarArr[i11].f25163d;
            this.f25146b[i11].mapPoints(fArr);
            this.f25147c[i11].reset();
            Matrix matrix2 = this.f25147c[i11];
            float[] fArr2 = this.f25152h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f25147c[i11].preRotate(f13);
            i11 = i12;
        }
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            float[] fArr3 = this.f25152h;
            l[] lVarArr2 = this.f25145a;
            fArr3[0] = lVarArr2[i13].f25160a;
            fArr3[1] = lVarArr2[i13].f25161b;
            this.f25146b[i13].mapPoints(fArr3);
            if (i13 == 0) {
                float[] fArr4 = this.f25152h;
                path2.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.f25152h;
                path2.lineTo(fArr5[0], fArr5[1]);
            }
            this.f25145a[i13].c(this.f25146b[i13], path2);
            if (bVar != null) {
                l lVar2 = this.f25145a[i13];
                Matrix matrix3 = this.f25146b[i13];
                f.a aVar = (f.a) bVar;
                BitSet bitSet = f.this.f25082d;
                lVar2.getClass();
                bitSet.set(i13, false);
                l.f[] fVarArr = f.this.f25080b;
                lVar2.b(lVar2.f25165f);
                fVarArr[i13] = new k(lVar2, new ArrayList(lVar2.f25167h), new Matrix(matrix3));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            float[] fArr6 = this.f25152h;
            l[] lVarArr3 = this.f25145a;
            fArr6[0] = lVarArr3[i13].f25162c;
            fArr6[1] = lVarArr3[i13].f25163d;
            this.f25146b[i13].mapPoints(fArr6);
            float[] fArr7 = this.f25153i;
            l[] lVarArr4 = this.f25145a;
            fArr7[0] = lVarArr4[i15].f25160a;
            fArr7[1] = lVarArr4[i15].f25161b;
            this.f25146b[i15].mapPoints(fArr7);
            float[] fArr8 = this.f25152h;
            float f14 = fArr8[0];
            float[] fArr9 = this.f25153i;
            int i16 = i15;
            float max = Math.max(((float) Math.hypot((double) (f14 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f25152h;
            l[] lVarArr5 = this.f25145a;
            fArr10[0] = lVarArr5[i13].f25162c;
            fArr10[1] = lVarArr5[i13].f25163d;
            this.f25146b[i13].mapPoints(fArr10);
            if (i13 == 1 || i13 == 3) {
                f11 = Math.abs(rectF.centerX() - this.f25152h[0]);
            } else {
                f11 = Math.abs(rectF.centerY() - this.f25152h[1]);
            }
            this.f25151g.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i13 == 1) {
                eVar = iVar2.f25131k;
            } else if (i13 == 2) {
                eVar = iVar2.f25132l;
            } else if (i13 != 3) {
                eVar = iVar2.f25130j;
            } else {
                eVar = iVar2.f25129i;
            }
            eVar.a(max, f11, f12, this.f25151g);
            this.f25154j.reset();
            this.f25151g.c(this.f25147c[i13], this.f25154j);
            if (!this.f25156l || Build.VERSION.SDK_INT < 19 || (!c(this.f25154j, i13) && !c(this.f25154j, i16))) {
                this.f25151g.c(this.f25147c[i13], path2);
            } else {
                Path path3 = this.f25154j;
                path3.op(path3, this.f25150f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f25152h;
                l lVar3 = this.f25151g;
                fArr11[0] = lVar3.f25160a;
                fArr11[1] = lVar3.f25161b;
                this.f25147c[i13].mapPoints(fArr11);
                Path path4 = this.f25149e;
                float[] fArr12 = this.f25152h;
                path4.moveTo(fArr12[0], fArr12[1]);
                this.f25151g.c(this.f25147c[i13], this.f25149e);
            }
            if (bVar != null) {
                l lVar4 = this.f25151g;
                Matrix matrix4 = this.f25147c[i13];
                f.a aVar2 = (f.a) bVar;
                lVar4.getClass();
                f.this.f25082d.set(i13 + 4, false);
                l.f[] fVarArr2 = f.this.f25081c;
                lVar4.b(lVar4.f25165f);
                fVarArr2[i13] = new k(lVar4, new ArrayList(lVar4.f25167h), new Matrix(matrix4));
            }
            i13 = i14;
        }
        path.close();
        this.f25149e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f25149e.isEmpty()) {
            path2.op(this.f25149e, Path.Op.UNION);
        }
    }

    public final boolean c(Path path, int i10) {
        this.f25155k.reset();
        this.f25145a[i10].c(this.f25146b[i10], this.f25155k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f25155k.computeBounds(rectF, true);
        path.op(this.f25155k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }
}
