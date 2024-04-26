package s9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath */
public class l {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f25160a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f25161b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f25162c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f25163d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f25164e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f25165f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f25166g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f25167h = new ArrayList();

    /* compiled from: ShapePath */
    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f25168b;

        public a(c cVar) {
            this.f25168b = cVar;
        }

        public void a(Matrix matrix, r9.a aVar, int i10, Canvas canvas) {
            r9.a aVar2 = aVar;
            int i11 = i10;
            Canvas canvas2 = canvas;
            c cVar = this.f25168b;
            float f10 = cVar.f25177f;
            float f11 = cVar.f25178g;
            c cVar2 = this.f25168b;
            RectF rectF = new RectF(cVar2.f25173b, cVar2.f25174c, cVar2.f25175d, cVar2.f25176e);
            boolean z10 = f11 < 0.0f;
            Path path = aVar2.f24763g;
            if (z10) {
                int[] iArr = r9.a.f24755k;
                iArr[0] = 0;
                iArr[1] = aVar2.f24762f;
                iArr[2] = aVar2.f24761e;
                iArr[3] = aVar2.f24760d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = (float) (-i11);
                rectF.inset(f12, f12);
                int[] iArr2 = r9.a.f24755k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f24760d;
                iArr2[2] = aVar2.f24761e;
                iArr2[3] = aVar2.f24762f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (((float) i11) / width);
                float[] fArr = r9.a.f24756l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                aVar2.f24758b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, r9.a.f24755k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f24764h);
                }
                canvas.drawArc(rectF, f10, f11, true, aVar2.f24758b);
                canvas.restore();
            }
        }
    }

    /* compiled from: ShapePath */
    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f25169b;

        /* renamed from: c  reason: collision with root package name */
        public final float f25170c;

        /* renamed from: d  reason: collision with root package name */
        public final float f25171d;

        public b(d dVar, float f10, float f11) {
            this.f25169b = dVar;
            this.f25170c = f10;
            this.f25171d = f11;
        }

        public void a(Matrix matrix, r9.a aVar, int i10, Canvas canvas) {
            d dVar = this.f25169b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f25180c - this.f25171d), (double) (dVar.f25179b - this.f25170c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f25170c, this.f25171d);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += (float) i10;
            rectF.offset(0.0f, (float) (-i10));
            int[] iArr = r9.a.f24753i;
            iArr[0] = aVar.f24762f;
            iArr[1] = aVar.f24761e;
            iArr[2] = aVar.f24760d;
            Paint paint = aVar.f24759c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, r9.a.f24754j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f24759c);
            canvas.restore();
        }

        public float b() {
            d dVar = this.f25169b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f25180c - this.f25171d) / (dVar.f25179b - this.f25170c))));
        }
    }

    /* compiled from: ShapePath */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f25172h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f25173b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f25174c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f25175d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f25176e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f25177f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f25178g;

        public c(float f10, float f11, float f12, float f13) {
            this.f25173b = f10;
            this.f25174c = f11;
            this.f25175d = f12;
            this.f25176e = f13;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f25181a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f25172h;
            rectF.set(this.f25173b, this.f25174c, this.f25175d, this.f25176e);
            path.arcTo(rectF, this.f25177f, this.f25178g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f25179b;

        /* renamed from: c  reason: collision with root package name */
        public float f25180c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f25181a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f25179b, this.f25180c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f25181a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f25182a = new Matrix();

        public abstract void a(Matrix matrix, r9.a aVar, int i10, Canvas canvas);
    }

    public l() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        c cVar = new c(f10, f11, f12, f13);
        cVar.f25177f = f14;
        cVar.f25178g = f15;
        this.f25166g.add(cVar);
        a aVar = new a(cVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z10 ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f25167h.add(aVar);
        this.f25164e = f17;
        double d10 = (double) f16;
        this.f25162c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f25163d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f25164e;
        if (f11 != f10) {
            float f12 = ((f10 - f11) + 360.0f) % 360.0f;
            if (f12 <= 180.0f) {
                float f13 = this.f25162c;
                float f14 = this.f25163d;
                c cVar = new c(f13, f14, f13, f14);
                cVar.f25177f = this.f25164e;
                cVar.f25178g = f12;
                this.f25167h.add(new a(cVar));
                this.f25164e = f10;
            }
        }
    }

    public void c(Matrix matrix, Path path) {
        int size = this.f25166g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f25166g.get(i10).a(matrix, path);
        }
    }

    public void d(float f10, float f11) {
        d dVar = new d();
        dVar.f25179b = f10;
        dVar.f25180c = f11;
        this.f25166g.add(dVar);
        b bVar = new b(dVar, this.f25162c, this.f25163d);
        b(bVar.b() + 270.0f);
        this.f25167h.add(bVar);
        this.f25164e = bVar.b() + 270.0f;
        this.f25162c = f10;
        this.f25163d = f11;
    }

    public void e(float f10, float f11, float f12, float f13) {
        this.f25160a = f10;
        this.f25161b = f11;
        this.f25162c = f10;
        this.f25163d = f11;
        this.f25164e = f12;
        this.f25165f = (f12 + f13) % 360.0f;
        this.f25166g.clear();
        this.f25167h.clear();
    }
}
