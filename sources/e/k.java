package e;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class k {
    public static boolean a(ViewGroup viewGroup, View view) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    public static final int b(int i10) {
        return (int) (((float) i10) * Resources.getSystem().getDisplayMetrics().density);
    }
}
