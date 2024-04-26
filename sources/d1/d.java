package d1;

import android.view.animation.Interpolator;
import h.e;

/* compiled from: LookupTableInterpolator */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f12945a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12946b;

    public d(float[] fArr) {
        this.f12945a = fArr;
        this.f12946b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12945a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f12946b;
        float f12 = (f10 - (((float) min) * f11)) / f11;
        float[] fArr2 = this.f12945a;
        return e.a(fArr2[min + 1], fArr2[min], f12, fArr2[min]);
    }
}
