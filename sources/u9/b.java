package u9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* compiled from: FadeTabIndicatorInterpolator */
public class b extends a {
    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float f11;
        if (f10 >= 0.5f) {
            view = view2;
        }
        RectF a10 = a.a(tabLayout, view);
        if (f10 < 0.5f) {
            f11 = u8.a.b(1.0f, 0.0f, 0.0f, 0.5f, f10);
        } else {
            f11 = u8.a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
        }
        drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (f11 * 255.0f));
    }
}
