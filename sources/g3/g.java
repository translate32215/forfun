package g3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import java.io.Closeable;
import u2.c;

/* compiled from: Utils */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final PathMeasure f18436a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public static final Path f18437b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public static final Path f18438c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f18439d = new float[4];

    /* renamed from: e  reason: collision with root package name */
    public static final float f18440e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f  reason: collision with root package name */
    public static float f18441f = -1.0f;

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = f18436a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            c.a("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f11 - f10) - 1.0f)) < 0.01d) {
            c.a("applyTrimPathIfNeeded");
        } else {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = (float) f.d(min, length);
                max = (float) f.d(max, length);
            }
            if (min < 0.0f) {
                min = (float) f.d(min, length);
            }
            if (max < 0.0f) {
                max = (float) f.d(max, length);
            }
            if (min == max) {
                path.reset();
                c.a("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            Path path2 = f18437b;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                Path path3 = f18438c;
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                Path path4 = f18438c;
                path4.reset();
                pathMeasure.getSegment(min + length, length, path4, true);
                path2.addPath(path4);
            }
            path.set(path2);
            c.a("applyTrimPathIfNeeded");
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f18441f == -1.0f) {
            f18441f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f18441f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f18439d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f18440e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    public static Bitmap e(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void f(Canvas canvas, RectF rectF, Paint paint, int i10) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i10);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        c.a("Utils#saveLayer");
    }
}
