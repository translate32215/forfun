package b2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
public class b0 extends a0 {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3347f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f3348g = true;

    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f3347f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3347f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f3348g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3348g = false;
            }
        }
    }
}
