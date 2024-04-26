package q0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import h.e;

/* compiled from: PathInterpolatorApi14 */
public class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f24017a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f24018b;

    public a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = ((int) (length / 0.002f)) + 1;
        this.f24017a = new float[i10];
        this.f24018b = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((((float) i11) * length) / ((float) (i10 - 1)), fArr, (float[]) null);
            this.f24017a[i11] = fArr[0];
            this.f24018b[i11] = fArr[1];
        }
    }

    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f24017a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f24017a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f24017a;
        float f11 = fArr[length] - fArr[i10];
        if (f11 == 0.0f) {
            return this.f24018b[i10];
        }
        float[] fArr2 = this.f24018b;
        float f12 = fArr2[i10];
        return e.a(fArr2[length], f12, (f10 - fArr[i10]) / f11, f12);
    }
}
