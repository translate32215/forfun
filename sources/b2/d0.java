package b2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23 */
public class d0 extends c0 {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f3363i = true;

    @SuppressLint({"NewApi"})
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f3363i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f3363i = false;
            }
        }
    }
}
