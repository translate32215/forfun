package b2;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19 */
public class a0 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f3346e = true;

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f3346e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3346e = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    @SuppressLint({"NewApi"})
    public void e(View view, float f10) {
        if (f3346e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f3346e = false;
            }
        }
        view.setAlpha(f10);
    }
}
