package b2;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22 */
public class c0 extends b0 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f3359h = true;

    @SuppressLint({"NewApi"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f3359h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f3359h = false;
            }
        }
    }
}
