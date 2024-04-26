package x0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: DrawerLayout */
public class a implements View.OnApplyWindowInsetsListener {
    public a(DrawerLayout drawerLayout) {
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z10 = true;
        boolean z11 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.F = windowInsets;
        drawerLayout.G = z11;
        if (z11 || drawerLayout.getBackground() != null) {
            z10 = false;
        }
        drawerLayout.setWillNotDraw(z10);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
