package w8;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: BadgeUtils */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f27173a = (Build.VERSION.SDK_INT < 18);

    public static void a(b bVar, View view, FrameLayout frameLayout) {
        c(bVar, view, frameLayout);
        if (bVar.d() != null) {
            bVar.d().setForeground(bVar);
        } else if (!f27173a) {
            view.getOverlay().add(bVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void b(b bVar, View view) {
        if (bVar != null) {
            if (f27173a || bVar.d() != null) {
                bVar.d().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(bVar);
            }
        }
    }

    public static void c(b bVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        bVar.setBounds(rect);
        bVar.g(view, frameLayout);
    }
}
