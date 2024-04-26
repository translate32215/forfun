package g0;

import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PaintCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<n0.c<Rect, Rect>> f18359a = new ThreadLocal<>();

    /* compiled from: PaintCompat */
    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }
}
