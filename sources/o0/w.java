package o0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final PointerIcon f22637a;

    /* compiled from: PointerIconCompat */
    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        public static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        public static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    public w(PointerIcon pointerIcon) {
        this.f22637a = pointerIcon;
    }

    public static w a(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new w(a.b(context, i10));
        }
        return new w((PointerIcon) null);
    }
}
