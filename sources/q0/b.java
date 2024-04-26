package q0;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat */
public final class b {

    /* compiled from: PathInterpolatorCompat */
    public static class a {
        public static PathInterpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        public static PathInterpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        public static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(f10, f11, f12, f13);
        }
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return new a(path);
    }
}
