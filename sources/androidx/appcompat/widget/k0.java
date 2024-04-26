package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: DrawableUtils */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f975a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f976b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            b(drawable);
        } else if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            b(drawable);
        }
    }

    public static void b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f975a);
        } else {
            drawable.setState(f976b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
