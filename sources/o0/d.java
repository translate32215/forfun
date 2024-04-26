package o0;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import n0.b;

/* compiled from: DisplayCutoutCompat */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f22574a;

    /* compiled from: DisplayCutoutCompat */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public d(DisplayCutout displayCutout) {
        this.f22574a = displayCutout;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return b.a(this.f22574a, ((d) obj).f22574a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f22574a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("DisplayCutoutCompat{");
        a10.append(this.f22574a);
        a10.append("}");
        return a10.toString();
    }
}
